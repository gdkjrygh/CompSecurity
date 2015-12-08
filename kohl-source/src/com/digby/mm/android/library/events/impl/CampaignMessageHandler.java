// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.events.impl;

import android.content.Context;
import com.digby.localpoint.sdk.core.ILPLocalNotification;
import com.digby.localpoint.sdk.core.ILPLocalNotificationListener;
import com.digby.localpoint.sdk.core.impl.LPID;
import com.digby.localpoint.sdk.core.impl.LPLocalNotification;
import com.digby.localpoint.sdk.core.impl.LPLocalpointService;
import com.digby.localpoint.sdk.core.util.MessageEventBroadcaster;
import com.digby.localpoint.sdk.notifications.LPNotificationCenter;
import com.digby.mm.android.library.db.impl.DigbyDBHelper;
import com.digby.mm.android.library.db.impl.MessageDBHelper;
import com.digby.mm.android.library.messages.impl.Message;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CampaignMessageHandler
{

    protected static final String JSON_KEY_CAMPAIGN_ID = "campaignId";
    protected static final String JSON_KEY_CAMPAIGN_TYPE = "campaignType";
    protected static final String JSON_KEY_MESSAGE_EXPIRATION_DATE = "expirationDate";
    protected static final String JSON_KEY_MESSAGE_ID = "messageId";
    protected static final String JSON_KEY_NOTIFICATION = "notification";
    protected static final String JSON_KEY_NOTIFICATION_MESSAGE = "message";
    protected static final String JSON_KEY_NOTIFICATION_TITLE = "title";
    protected static final String JSON_KEY_PROMOTION = "promotion";
    protected static final String JSON_KEY_PROMOTION_MESSAGE_MESSAGE = "message";
    protected static final String JSON_KEY_PROMOTION_MESSAGE_METADATA = "messageMetadata";
    protected static final String JSON_KEY_PROMOTION_MESSAGE_TITLE = "title";
    private String mCampaigType;
    private long mCampaignId;
    private final Context mContext;
    private String mExpirationDate;
    private final List mIMessages;
    private ILPLocalNotificationListener mListener;
    private ILPLocalNotification mLocalNotification;
    private String mMessage;
    private MessageDBHelper mMessageDBHelper;
    private MessageEventBroadcaster mMessageEventBroadcaster;
    private final JSONArray mMessageIDs;
    private long mMessageId;
    private JSONObject mMessageMetadata;
    private boolean mNewMessage;
    private String mTitle;

    public CampaignMessageHandler(Context context, List list, JSONArray jsonarray)
    {
        mCampaignId = -12345L;
        mContext = context;
        mIMessages = list;
        mMessageIDs = jsonarray;
    }

    protected void fireLocalNotification(String s, String s1, long l)
    {
        LPNotificationCenter.getInstance(mContext).sendCampaignNotification(s, s1, l);
    }

    protected long getCampaignId()
    {
        return mCampaignId;
    }

    protected String getExpirationDate()
    {
        return mExpirationDate;
    }

    protected ILPLocalNotificationListener getListener()
    {
        return mListener;
    }

    protected ILPLocalNotification getLocalNotification()
    {
        return mLocalNotification;
    }

    protected ILPLocalNotificationListener getLocalNotificationListenerFromLocalpointService()
    {
        return LPLocalpointService.getInstance(mContext).getLocalNotificationListener();
    }

    protected String getMessage()
    {
        return mMessage;
    }

    protected MessageDBHelper getMessageDBHelper()
    {
        if (mMessageDBHelper == null)
        {
            mMessageDBHelper = new MessageDBHelper(new DigbyDBHelper(mContext));
        }
        return mMessageDBHelper;
    }

    protected MessageEventBroadcaster getMessageEventBroadcaster()
    {
        if (mMessageEventBroadcaster == null)
        {
            mMessageEventBroadcaster = MessageEventBroadcaster.getInstance(mContext);
        }
        return mMessageEventBroadcaster;
    }

    protected long getMessageId()
    {
        return mMessageId;
    }

    protected JSONObject getMessageMetadata()
    {
        return mMessageMetadata;
    }

    protected String getTitle()
    {
        return mTitle;
    }

    protected void handleMessage(JSONObject jsonobject)
        throws JSONException
    {
label0:
        {
            Object obj = null;
            mCampaigType = jsonobject.getString("campaignType");
            mMessageId = jsonobject.getLong("messageId");
            mMessageMetadata = jsonobject.getJSONObject("messageMetadata");
            Message message = obj;
            if (jsonobject.has("promotion"))
            {
                mCampaignId = jsonobject.getLong("campaignId");
                JSONObject jsonobject2 = jsonobject.getJSONObject("promotion");
                message = obj;
                if (jsonobject2 != null)
                {
                    message = handlePromotion(jsonobject2);
                }
            }
            mLocalNotification = new LPLocalNotification(message, mCampaigType);
            if (mTitle != null && mTitle.length() > 0)
            {
                mLocalNotification.setCampaignTitle(mTitle);
            }
            if (mMessage != null && mMessage.length() > 0)
            {
                mLocalNotification.setCampaignBody(mMessage);
            }
            if (jsonobject.has("notification"))
            {
                JSONObject jsonobject1 = jsonobject.getJSONObject("notification");
                if (jsonobject1 != null)
                {
                    handleNotification(jsonobject1);
                }
            }
            boolean flag = false;
            if (getListener() != null)
            {
                flag = getListener().onOverrideLocalNotification(mLocalNotification);
            }
            if (jsonobject.has("notification") && !flag)
            {
                fireLocalNotification(getLocalNotification().getNotificationTitle(), getLocalNotification().getNotificationMessage(), mCampaignId);
            }
            if (getMessageId() > 0L && jsonobject.has("promotion"))
            {
                jsonobject = jsonToMap(mMessageMetadata);
                jsonobject = getMessageDBHelper().insertMessage(mMessageId, mCampaignId, getLocalNotification().getTitle(), getLocalNotification().getBody(), mExpirationDate, jsonobject);
                mIMessages.add(jsonobject);
                if (!isNewMessage())
                {
                    break label0;
                }
                getMessageEventBroadcaster().broadcastMessageAdd(new LPID(Long.toString(mMessageId)));
            }
            return;
        }
        getMessageEventBroadcaster().broadcastMessageModify(new LPID(Long.toString(mMessageId)));
    }

    public void handleMessages(JSONArray jsonarray)
        throws JSONException
    {
        if (jsonarray != null && jsonarray.length() != 0)
        {
            mListener = getLocalNotificationListenerFromLocalpointService();
            int i = 0;
            while (i < jsonarray.length()) 
            {
                handleMessage(jsonarray.getJSONObject(i));
                i++;
            }
        }
    }

    protected void handleNotification(JSONObject jsonobject)
        throws JSONException
    {
        if (jsonobject == null)
        {
            return;
        } else
        {
            String s = jsonobject.getString("title");
            jsonobject = jsonobject.getString("message");
            getLocalNotification().setNotificationTitle(s);
            getLocalNotification().setNotificationMessage(jsonobject);
            return;
        }
    }

    protected Message handlePromotion(JSONObject jsonobject)
        throws JSONException
    {
        if (jsonobject == null)
        {
            jsonobject = null;
        } else
        {
            mTitle = jsonobject.getString("title");
            mMessage = jsonobject.getString("message");
            mExpirationDate = jsonobject.getString("expirationDate");
            mMessageIDs.put(mMessageId);
            Message message = (Message)(Message)getMessageDBHelper().getMessageByCampaignID(getCampaignId(), false);
            jsonobject = message;
            if (message == null)
            {
                mNewMessage = true;
                return message;
            }
        }
        return jsonobject;
    }

    protected boolean isNewMessage()
    {
        return mNewMessage;
    }

    protected Map jsonToMap(JSONObject jsonobject)
        throws JSONException
    {
        if (jsonobject != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((Map) (obj));
_L2:
        HashMap hashmap = new HashMap();
        Iterator iterator = jsonobject.keys();
        do
        {
            obj = hashmap;
            if (!iterator.hasNext())
            {
                continue;
            }
            obj = (String)iterator.next();
            hashmap.put(obj, jsonobject.get(((String) (obj))).toString());
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
