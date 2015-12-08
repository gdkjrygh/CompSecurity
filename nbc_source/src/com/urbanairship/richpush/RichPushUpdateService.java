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
import com.urbanairship.restclient.AppAuthenticatedRequest;
import com.urbanairship.restclient.Request;
import com.urbanairship.restclient.Response;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.http.HttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.urbanairship.richpush:
//            RichPushUser, RichPushUserAuthenticatedRequest, RichPushManager, RichPushResolver, 
//            RichPushInbox

public class RichPushUpdateService extends IntentService
{

    public static final String ACTION_RICH_PUSH_MESSAGES_UPDATE = "com.urbanairship.richpush.MESSAGES_UPDATE";
    public static final String ACTION_RICH_PUSH_USER_UPDATE = "com.urbanairship.richpush.USER_UPDATE";
    private static final String DELETE_MESSAGES_KEY = "delete";
    private static final String DELETE_MESSAGES_URL = "api/user/%s/messages/delete/";
    public static final String EXTRA_RICH_PUSH_RESULT_RECEIVER = "com.urbanairship.richpush.RESULT_RECEIVER";
    private static final String MARK_READ_MESSAGES_KEY = "mark_as_read";
    private static final String MARK_READ_MESSAGES_URL = "api/user/%s/messages/unread/";
    private static final String MESSAGES_URL = "api/user/%s/messages/";
    private static final String MESSAGE_URL = "api/user/%s/messages/message/%s/";
    public static final int STATUS_RICH_PUSH_UPDATE_ERROR = 1;
    public static final int STATUS_RICH_PUSH_UPDATE_SUCCESS = 0;

    public RichPushUpdateService()
    {
        super("RichPushUpdateService");
    }

    private HttpEntity buildMessagesPayload(String s, Set set)
    {
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        jsonobject.put(s, new JSONArray());
        String s1 = getUser().getId();
        for (set = set.iterator(); set.hasNext(); jsonobject.accumulate(s, formatUrl("api/user/%s/messages/message/%s/", new String[] {
    s1, (String)set.next()
}))) { }
          goto _L1
        s;
        Logger.info(s.getMessage());
_L3:
        return null;
_L1:
        Logger.verbose(jsonobject.toString());
        s = new ByteArrayEntity(jsonobject.toString().getBytes("UTF-8"));
        return s;
        s;
        Logger.info(s.getMessage());
        if (true) goto _L3; else goto _L2
_L2:
    }

    private Request buildRequest(String s, String s1, HttpEntity httpentity)
    {
        if (RichPushUser.isCreated())
        {
            s = new RichPushUserAuthenticatedRequest(s, s1);
        } else
        {
            s = new AppAuthenticatedRequest(s, s1);
        }
        if (httpentity != null)
        {
            s.setEntity(httpentity);
            s.addHeader("Content-Type", "application/json");
        }
        return s;
    }

    private boolean createUser()
    {
        Logger.debug("Creating user");
        Response response;
        try
        {
            response = sendRequest("POST", RichPushUser.newUserUrl(), new ByteArrayEntity(RichPushUser.getUserAttributes().toString().getBytes("UTF-8")));
        }
        catch (JSONException jsonexception)
        {
            Logger.error("Exception constructing JSON data when creating user.", jsonexception);
            return false;
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            Logger.error("Error creating user.", unsupportedencodingexception);
            return false;
        }
        if (response != null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        Logger.info("User creation failed. No network response.");
        return false;
        if (response.status() != 201)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        Logger.verbose("User creation succeeded. Updating");
        RichPushUser.updateUserAttributes(response.body());
        return true;
        Logger.verbose("User creation failed. Logging.");
        Logger.info(response.body());
        return false;
    }

    private boolean deleteMessagesOnServer(Set set)
    {
        return sendRequest("POST", formatUrl("api/user/%s/messages/delete/", new String[] {
            getUser().getId()
        }), buildMessagesPayload("delete", set), 200);
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

    private ContentValues[] getMessagesFromServer()
    {
        Response response = sendRequest("GET", formatUrl("api/user/%s/messages/", new String[] {
            getUser().getId()
        }), null);
        if (response == null)
        {
            Logger.info("The response from the server was null. Will try later.");
            return null;
        }
        ContentValues acontentvalues[];
        try
        {
            acontentvalues = messagesFromResponse(response);
        }
        catch (JSONException jsonexception)
        {
            Logger.info("Unable to parse message list response from server", jsonexception);
            return null;
        }
        return acontentvalues;
    }

    private RichPushUser getUser()
    {
        return RichPushManager.shared().getRichPushUser();
    }

    private void handleDeletedMessages()
    {
        Set set = getMessageIdsFromCursor(RichPushManager.resolver.getDeletedMessages());
        if (set != null && set.size() > 0)
        {
            Logger.verbose((new StringBuilder()).append("Found ").append(set.size()).append(" messages to delete.").toString());
            if (deleteMessagesOnServer(set))
            {
                RichPushManager.resolver.deleteMessages(set);
            }
        }
    }

    private void handleReadMessages()
    {
        Set set = getMessageIdsFromCursor(RichPushManager.resolver.getReadUpdatedMessages());
        if (set != null && set.size() > 0)
        {
            Logger.verbose((new StringBuilder()).append("Found ").append(set.size()).append(" messages to mark read.").toString());
            if (markMessagesReadOnServer(set))
            {
                ContentValues contentvalues = new ContentValues();
                contentvalues.put("unread_orig", "0");
                RichPushManager.resolver.updateMessages(set, contentvalues);
            }
        }
    }

    private boolean markMessagesReadOnServer(Set set)
    {
        return sendRequest("POST", formatUrl("api/user/%s/messages/unread/", new String[] {
            getUser().getId()
        }), buildMessagesPayload("mark_as_read", set), 200);
    }

    private ContentValues[] messagesFromResponse(Response response)
        throws JSONException
    {
        response = (new JSONObject(response.body())).getJSONArray("messages");
        int j = response.length();
        ContentValues acontentvalues[] = new ContentValues[j];
        for (int i = 0; i < j; i++)
        {
            JSONObject jsonobject = response.getJSONObject(i);
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("timestamp", jsonobject.getString("message_sent"));
            contentvalues.put("message_id", jsonobject.getString("message_id"));
            contentvalues.put("message_url", jsonobject.getString("message_url"));
            contentvalues.put("message_body_url", jsonobject.getString("message_body_url"));
            contentvalues.put("message_read_url", jsonobject.getString("message_read_url"));
            contentvalues.put("title", jsonobject.getString("title"));
            contentvalues.put("unread_orig", jsonobject.getString("unread"));
            contentvalues.put("extra", jsonobject.getJSONObject("extra").toString());
            contentvalues.put("raw_message_object", jsonobject.toString());
            if (jsonobject.has("message_expiry"))
            {
                contentvalues.put("expiration_timestamp", jsonobject.getString("message_expiry"));
            }
            acontentvalues[i] = contentvalues;
        }

        return acontentvalues;
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

    private Response sendRequest(String s, String s1, HttpEntity httpentity)
    {
        return buildRequest(s, s1, httpentity).execute();
    }

    private boolean sendRequest(String s, String s1, HttpEntity httpentity, int i)
    {
        s = sendRequest(s, s1, httpentity);
        if (s != null)
        {
            Logger.verbose((new StringBuilder()).append("The response status is ").append(s.status()).toString());
            Logger.verbose(s.body());
        }
        return s != null && s.status() == i;
    }

    private boolean updateMessages()
    {
        Logger.debug("Updating Messages");
        ContentValues acontentvalues[] = getMessagesFromServer();
        if (acontentvalues == null)
        {
            return false;
        }
        Object obj = new ArrayList();
        HashSet hashset = new HashSet();
        int j = acontentvalues.length;
        for (int i = 0; i < j; i++)
        {
            ContentValues contentvalues = acontentvalues[i];
            String s = contentvalues.getAsString("message_id");
            hashset.add(s);
            if (RichPushManager.resolver.updateMessage(s, contentvalues) != 1)
            {
                ((List) (obj)).add(contentvalues);
            }
        }

        if (((List) (obj)).size() > 0)
        {
            ContentValues acontentvalues1[] = new ContentValues[((List) (obj)).size()];
            ((List) (obj)).toArray(acontentvalues1);
            RichPushManager.resolver.insertMessages(acontentvalues1);
        }
        obj = getMessageIdsFromCursor(RichPushManager.resolver.getAllMessages());
        if (obj != null)
        {
            ((Set) (obj)).removeAll(hashset);
            getUser().getInbox().deleteMessages(((Set) (obj)));
        }
        getUser().getInbox().updateCache();
        return true;
    }

    private boolean updateUser()
    {
label0:
        {
            Logger.debug("Updating user");
            try
            {
                if (sendRequest("POST", getUser().userUrl(), new ByteArrayEntity(RichPushUser.getUserAttributes().toString().getBytes("UTF-8")), 200))
                {
                    break label0;
                }
                Logger.info("User update failed. Will retry later.");
            }
            catch (JSONException jsonexception)
            {
                Logger.error("Exception constructing JSON data when updating user.", jsonexception);
                return false;
            }
            catch (UnsupportedEncodingException unsupportedencodingexception)
            {
                Logger.error("Error updating user.", unsupportedencodingexception);
                return false;
            }
            return false;
        }
        return true;
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
    }

    protected void onHandleIntent(Intent intent)
    {
        if (intent != null)
        {
            String s = intent.getAction();
            intent = (ResultReceiver)intent.getParcelableExtra("com.urbanairship.richpush.RESULT_RECEIVER");
            Logger.debug((new StringBuilder()).append("Starting RichPushUpdateService with action ").append(s).toString());
            if ("com.urbanairship.richpush.MESSAGES_UPDATE".equals(s))
            {
                if (!RichPushUser.isCreated())
                {
                    Logger.debug("The Rich Push user has not been created, cancelling messages update");
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
