// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.richpush;

import android.app.Application;
import android.app.IntentService;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.Autopilot;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.push.PushManager;
import com.urbanairship.util.UAStringUtil;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.urbanairship.richpush:
//            RichPushUser, UserAPIClient, UserResponse, RichPushManager, 
//            RichPushResolver, RichPushInbox, MessageListResponse

public class RichPushUpdateService extends IntentService
{

    public static final String ACTION_RICH_PUSH_MESSAGES_UPDATE = "com.urbanairship.richpush.MESSAGES_UPDATE";
    public static final String ACTION_RICH_PUSH_USER_UPDATE = "com.urbanairship.richpush.USER_UPDATE";
    private static final String DELETE_MESSAGES_KEY = "delete";
    public static final String EXTRA_RICH_PUSH_RESULT_RECEIVER = "com.urbanairship.richpush.RESULT_RECEIVER";
    private static final String MARK_READ_MESSAGES_KEY = "mark_as_read";
    private static final String MESSAGE_URL = "api/user/%s/messages/message/%s/";
    private static final String PAYLOAD_ADD_KEY = "add";
    private static final String PAYLOAD_AMAZON_CHANNELS_KEY = "amazon_channels";
    private static final String PAYLOAD_ANDROID_CHANNELS_KEY = "android_channels";
    public static final int STATUS_RICH_PUSH_UPDATE_ERROR = 1;
    public static final int STATUS_RICH_PUSH_UPDATE_SUCCESS = 0;
    RichPushResolver resolver;
    UserAPIClient userClient;

    public RichPushUpdateService()
    {
        super("RichPushUpdateService");
    }

    private JSONObject buildMessagesPayload(String s, Set set)
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject();
            jsonobject.put(s, new JSONArray());
            String s1 = getUser().getId();
            for (set = set.iterator(); set.hasNext(); jsonobject.accumulate(s, formatUrl("api/user/%s/messages/message/%s/", new String[] {
    s1, (String)set.next()
}))) { }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.info(s.getMessage());
            return null;
        }
        Logger.verbose(jsonobject.toString());
        return jsonobject;
    }

    private JSONObject createNewUserPayload()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        String s = UAirship.shared().getPushManager().getChannelId();
        if (!UAStringUtil.isEmpty(s))
        {
            JSONArray jsonarray = new JSONArray();
            jsonarray.put(s);
            jsonobject.putOpt(getPayloadChannelsKey(), jsonarray);
        }
        return jsonobject;
    }

    private JSONObject createUpdateUserPayload()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        JSONObject jsonobject1 = new JSONObject();
        JSONArray jsonarray = new JSONArray();
        jsonarray.put(UAirship.shared().getPushManager().getChannelId());
        jsonobject1.put("add", jsonarray);
        jsonobject.put(getPayloadChannelsKey(), jsonobject1);
        return jsonobject;
    }

    private boolean createUser()
    {
        Object obj;
        try
        {
            obj = createNewUserPayload();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Logger.error("Exception constructing JSON data when creating user.", ((Throwable) (obj)));
            return false;
        }
        Logger.info("Creating Rich Push user.");
        obj = userClient.createUser(((JSONObject) (obj)));
        if (obj == null)
        {
            return false;
        }
        if (getUser().setUser(((UserResponse) (obj)).getUserId(), ((UserResponse) (obj)).getUserToken()))
        {
            Logger.info("Rich Push user created.");
            getUser().setLastUpdateTime(System.currentTimeMillis());
            return true;
        } else
        {
            Logger.warn("Rich Push user creation failed.");
            return false;
        }
    }

    private boolean deleteMessagesOnServer(Set set)
    {
        set = buildMessagesPayload("delete", set);
        return userClient.deleteMessages(set, getUser().getId(), getUser().getPassword());
    }

    private String formatUrl(String s, String as[])
    {
        return (new StringBuilder(getHostUrl())).append(String.format(s, (Object[])as)).toString();
    }

    private String getHostUrl()
    {
        return UAirship.shared().getAirshipConfigOptions().hostURL;
    }

    private Set getMessageIdsFromCursor(Cursor cursor)
    {
        if (cursor == null)
        {
            return null;
        }
        HashSet hashset = new HashSet(cursor.getCount());
        int j;
        for (int i = -1; cursor.moveToNext(); i = j)
        {
            j = i;
            if (i == -1)
            {
                j = cursor.getColumnIndex("message_id");
            }
            hashset.add(cursor.getString(j));
        }

        cursor.close();
        return hashset;
    }

    private String getPayloadChannelsKey()
    {
        switch (UAirship.shared().getPlatformType())
        {
        default:
            return "android_channels";

        case 1: // '\001'
            return "amazon_channels";
        }
    }

    private RichPushUser getUser()
    {
        return UAirship.shared().getRichPushManager().getRichPushUser();
    }

    private void handleDeletedMessages()
    {
        Set set = getMessageIdsFromCursor(resolver.getDeletedMessages());
        if (set != null && set.size() > 0)
        {
            Logger.verbose((new StringBuilder()).append("Found ").append(set.size()).append(" messages to delete.").toString());
            if (deleteMessagesOnServer(set))
            {
                resolver.deleteMessages(set);
            }
        }
    }

    private void handleReadMessages()
    {
        Set set = getMessageIdsFromCursor(resolver.getReadUpdatedMessages());
        if (set != null && set.size() > 0)
        {
            Logger.verbose((new StringBuilder()).append("Found ").append(set.size()).append(" messages to mark read.").toString());
            if (markMessagesReadOnServer(set))
            {
                ContentValues contentvalues = new ContentValues();
                contentvalues.put("unread_orig", Integer.valueOf(0));
                resolver.updateMessages(set, contentvalues);
            }
        }
    }

    private boolean markMessagesReadOnServer(Set set)
    {
        set = buildMessagesPayload("mark_as_read", set);
        return userClient.markMessagesRead(set, getUser().getId(), getUser().getPassword());
    }

    private void messagesUpdate(ResultReceiver resultreceiver)
    {
        respond(resultreceiver, updateMessages());
        handleReadMessages();
        handleDeletedMessages();
    }

    private void respond(ResultReceiver resultreceiver, boolean flag)
    {
        respond(resultreceiver, flag, null);
    }

    private void respond(ResultReceiver resultreceiver, boolean flag, Bundle bundle)
    {
        Bundle bundle1;
label0:
        {
            if (resultreceiver != null)
            {
                bundle1 = bundle;
                if (bundle == null)
                {
                    bundle1 = new Bundle();
                }
                if (!flag)
                {
                    break label0;
                }
                resultreceiver.send(0, bundle1);
            }
            return;
        }
        resultreceiver.send(1, bundle1);
    }

    private void updateInbox(ContentValues acontentvalues[])
    {
        ArrayList arraylist = new ArrayList();
        HashSet hashset = new HashSet();
        int j = acontentvalues.length;
        for (int i = 0; i < j; i++)
        {
            ContentValues contentvalues = acontentvalues[i];
            String s = contentvalues.getAsString("message_id");
            hashset.add(s);
            if (resolver.updateMessage(s, contentvalues) != 1)
            {
                arraylist.add(contentvalues);
            }
        }

        if (arraylist.size() > 0)
        {
            acontentvalues = new ContentValues[arraylist.size()];
            arraylist.toArray(acontentvalues);
            resolver.insertMessages(acontentvalues);
        }
        acontentvalues = getMessageIdsFromCursor(resolver.getAllMessages());
        if (acontentvalues != null)
        {
            acontentvalues.removeAll(hashset);
            UAirship.shared().getRichPushManager().getRichPushInbox().deleteMessages(acontentvalues);
        }
        UAirship.shared().getRichPushManager().getRichPushInbox().updateCache();
    }

    private boolean updateMessages()
    {
        RichPushUser richpushuser = getUser();
        MessageListResponse messagelistresponse = userClient.getMessages(richpushuser.getId(), richpushuser.getPassword(), richpushuser.getLastMessageRefreshTime());
        Logger.info("Refreshing inbox messages.");
        if (messagelistresponse == null)
        {
            return false;
        }
        Logger.debug((new StringBuilder()).append("Inbox message list request received: ").append(messagelistresponse.getStatus()).toString());
        ContentValues acontentvalues[];
        switch (messagelistresponse.getStatus())
        {
        default:
            Logger.info("Unable to update inbox messages.");
            return false;

        case 304: 
            return true;

        case 200: 
            acontentvalues = messagelistresponse.getServerMessages();
            break;
        }
        if (acontentvalues == null)
        {
            Logger.info("Inbox message list is empty.");
        } else
        {
            Logger.info((new StringBuilder()).append("Received ").append(acontentvalues.length).append(" inbox messages.").toString());
            updateInbox(acontentvalues);
            richpushuser.setLastMessageRefreshTime(messagelistresponse.getLastModifiedTimeMS());
        }
        return true;
    }

    private boolean updateUser()
    {
        if (UAStringUtil.isEmpty(UAirship.shared().getPushManager().getChannelId()))
        {
            Logger.debug("No Channel. Skipping Rich Push user update.");
            return false;
        }
        Logger.info("Updating Rich Push user.");
        JSONObject jsonobject;
        try
        {
            jsonobject = createUpdateUserPayload();
        }
        catch (JSONException jsonexception)
        {
            Logger.error("Exception constructing JSON data when updating user.", jsonexception);
            return false;
        }
        if (userClient.updateUser(jsonobject, getUser().getId(), getUser().getPassword()))
        {
            Logger.info("Rich Push user updated.");
            getUser().setLastUpdateTime(System.currentTimeMillis());
            return true;
        } else
        {
            getUser().setLastUpdateTime(0L);
            return false;
        }
    }

    private void userUpdate(ResultReceiver resultreceiver)
    {
        boolean flag;
        if (!RichPushUser.isCreated())
        {
            flag = createUser();
        } else
        {
            flag = updateUser();
        }
        respond(resultreceiver, flag);
    }

    public void onCreate()
    {
        super.onCreate();
        Autopilot.automaticTakeOff((Application)getApplicationContext());
        userClient = new UserAPIClient();
        resolver = new RichPushResolver(getApplicationContext());
    }

    protected void onHandleIntent(Intent intent)
    {
        if (intent != null)
        {
            String s = intent.getAction();
            intent = (ResultReceiver)intent.getParcelableExtra("com.urbanairship.richpush.RESULT_RECEIVER");
            Logger.verbose((new StringBuilder()).append("Starting RichPushUpdateService with action ").append(s).toString());
            if ("com.urbanairship.richpush.MESSAGES_UPDATE".equals(s))
            {
                if (!RichPushUser.isCreated())
                {
                    Logger.debug("The Rich Push user has not been created, canceling messages update");
                    respond(intent, false);
                    return;
                } else
                {
                    messagesUpdate(intent);
                    return;
                }
            }
            if ("com.urbanairship.richpush.USER_UPDATE".equals(s))
            {
                userUpdate(intent);
                return;
            }
        }
    }
}
