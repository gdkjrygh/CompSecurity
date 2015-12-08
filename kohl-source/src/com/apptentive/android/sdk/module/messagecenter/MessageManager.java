// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.messagecenter;

import android.content.Context;
import android.content.SharedPreferences;
import com.apptentive.android.sdk.GlobalInfo;
import com.apptentive.android.sdk.Log;
import com.apptentive.android.sdk.comm.ApptentiveClient;
import com.apptentive.android.sdk.comm.ApptentiveHttpResponse;
import com.apptentive.android.sdk.model.AutomatedMessage;
import com.apptentive.android.sdk.model.FileMessage;
import com.apptentive.android.sdk.model.Message;
import com.apptentive.android.sdk.model.MessageFactory;
import com.apptentive.android.sdk.model.Payload;
import com.apptentive.android.sdk.storage.ApptentiveDatabase;
import com.apptentive.android.sdk.storage.MessageStore;
import com.apptentive.android.sdk.util.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.apptentive.android.sdk.module.messagecenter:
//            UnreadMessagesListener

public class MessageManager
{
    public static interface OnNewMessagesListener
    {

        public abstract void onMessagesUpdated();
    }

    public static interface OnSentMessageListener
    {

        public abstract void onSentMessage(Message message);
    }


    private static UnreadMessagesListener hostUnreadMessagesListener;
    private static OnNewMessagesListener internalNewMessagesListener;
    private static OnSentMessageListener sentMessageListener;

    public MessageManager()
    {
    }

    public static void createMessageCenterAutoMessage(Context context, boolean flag)
    {
        SharedPreferences sharedpreferences;
        boolean flag1;
label0:
        {
            sharedpreferences = context.getSharedPreferences("APPTENTIVE", 0);
            boolean flag2 = sharedpreferences.getBoolean("autoMessageShownAutoMessage", false);
            boolean flag3 = sharedpreferences.getBoolean("autoMessageShownManual", false);
            boolean flag4 = sharedpreferences.getBoolean("autoMessageShownNoLove", false);
            flag1 = flag2;
            if (flag2)
            {
                break label0;
            }
            if (!flag3)
            {
                flag1 = flag2;
                if (!flag4)
                {
                    break label0;
                }
            }
            flag1 = true;
            sharedpreferences.edit().putBoolean("autoMessageShownAutoMessage", true).commit();
        }
        if (!flag1)
        {
            AutomatedMessage automatedmessage;
            if (flag)
            {
                automatedmessage = AutomatedMessage.createWelcomeMessage(context);
            } else
            {
                automatedmessage = AutomatedMessage.createNoLoveMessage(context);
            }
            if (automatedmessage != null)
            {
                sharedpreferences.edit().putBoolean("autoMessageShownAutoMessage", true).commit();
                getMessageStore(context).addOrUpdateMessages(new Message[] {
                    automatedmessage
                });
                ApptentiveDatabase.getInstance(context).addPayload(new Payload[] {
                    automatedmessage
                });
            }
        }
    }

    public static void deleteAllMessages(Context context)
    {
        Log.e("Deleting all messages.", new Object[0]);
        getMessageStore(context).deleteAllMessages();
    }

    public static boolean fetchAndStoreMessages(Context context)
    {
        if (GlobalInfo.conversationToken != null && Util.isNetworkConnectionPresent(context))
        {
            Object obj = getMessageStore(context).getLastReceivedMessageId();
            Log.d((new StringBuilder()).append("Fetching messages after last id: ").append(((String) (obj))).toString(), new Object[0]);
            obj = fetchMessages(((String) (obj)));
            if (obj != null && ((List) (obj)).size() > 0)
            {
                Log.d("Messages retrieved.", new Object[0]);
                int i = 0;
                for (Iterator iterator = ((List) (obj)).iterator(); iterator.hasNext();)
                {
                    Message message = (Message)iterator.next();
                    if (message.isOutgoingMessage())
                    {
                        message.setRead(true);
                    } else
                    {
                        i++;
                    }
                }

                getMessageStore(context).addOrUpdateMessages((Message[])((List) (obj)).toArray(new Message[((List) (obj)).size()]));
                if (i > 0 && internalNewMessagesListener != null)
                {
                    internalNewMessagesListener.onMessagesUpdated();
                }
                notifyHostUnreadMessagesListener(getUnreadMessageCount(context));
                boolean flag;
                if (i > 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                return flag;
            }
        }
        return false;
    }

    private static List fetchMessages(String s)
    {
        Object obj;
        Log.d((new StringBuilder()).append("Fetching messages newer than: ").append(s).toString(), new Object[0]);
        obj = ApptentiveClient.getMessages(null, s, null);
        s = new ArrayList();
        if (!((ApptentiveHttpResponse) (obj)).isSuccessful())
        {
            return s;
        }
        obj = parseMessagesString(((ApptentiveHttpResponse) (obj)).getContent());
        s = ((String) (obj));
_L2:
        return s;
        Object obj1;
        obj1;
        Log.e("Error parsing messages JSON.", ((Throwable) (obj1)), new Object[0]);
        continue; /* Loop/switch isn't completed */
        obj1;
        Log.e("Unexpected error parsing messages JSON.", ((Throwable) (obj1)), new Object[0]);
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static MessageStore getMessageStore(Context context)
    {
        return ApptentiveDatabase.getInstance(context);
    }

    public static List getMessages(Context context)
    {
        return getMessageStore(context).getAllMessages();
    }

    public static int getUnreadMessageCount(Context context)
    {
        return getMessageStore(context).getUnreadMessageCount();
    }

    public static void notifyHostUnreadMessagesListener(int i)
    {
        if (hostUnreadMessagesListener != null)
        {
            hostUnreadMessagesListener.onUnreadMessageCountChanged(i);
        }
    }

    public static void onSentMessage(Context context, Message message, ApptentiveHttpResponse apptentivehttpresponse)
    {
        if (apptentivehttpresponse == null || !apptentivehttpresponse.isSuccessful())
        {
            if (message instanceof FileMessage)
            {
                ((FileMessage)message).deleteStoredFile(context);
            }
        } else
        if (apptentivehttpresponse.isSuccessful())
        {
            if (message.isHidden())
            {
                if (message instanceof FileMessage)
                {
                    ((FileMessage)message).deleteStoredFile(context);
                }
                getMessageStore(context).deleteMessage(message.getNonce());
                return;
            }
            try
            {
                apptentivehttpresponse = new JSONObject(apptentivehttpresponse.getContent());
                if (message.getState() == com.apptentive.android.sdk.model.Message.State.sending)
                {
                    message.setState(com.apptentive.android.sdk.model.Message.State.sent);
                }
                message.setId(apptentivehttpresponse.getString("id"));
                message.setCreatedAt(Double.valueOf(apptentivehttpresponse.getDouble("created_at")));
            }
            // Misplaced declaration of an exception variable
            catch (ApptentiveHttpResponse apptentivehttpresponse)
            {
                Log.e("Error parsing sent message response.", apptentivehttpresponse, new Object[0]);
            }
            getMessageStore(context).updateMessage(message);
            if (sentMessageListener != null)
            {
                sentMessageListener.onSentMessage(message);
                return;
            }
        }
    }

    public static List parseMessagesString(String s)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        s = new JSONObject(s);
        if (!s.isNull("items"))
        {
            s = s.getJSONArray("items");
            for (int i = 0; i < s.length(); i++)
            {
                Message message = MessageFactory.fromJson(s.getJSONObject(i).toString());
                message.setState(com.apptentive.android.sdk.model.Message.State.saved);
                arraylist.add(message);
            }

        }
        return arraylist;
    }

    public static void sendMessage(Context context, Message message)
    {
        getMessageStore(context).addOrUpdateMessages(new Message[] {
            message
        });
        ApptentiveDatabase.getInstance(context).addPayload(new Payload[] {
            message
        });
    }

    public static void setHostUnreadMessagesListener(UnreadMessagesListener unreadmessageslistener)
    {
        hostUnreadMessagesListener = unreadmessageslistener;
    }

    public static void setInternalOnMessagesUpdatedListener(OnNewMessagesListener onnewmessageslistener)
    {
        internalNewMessagesListener = onnewmessageslistener;
    }

    public static void setSentMessageListener(OnSentMessageListener onsentmessagelistener)
    {
        sentMessageListener = onsentmessagelistener;
    }

    public static void updateMessage(Context context, Message message)
    {
        getMessageStore(context).updateMessage(message);
    }
}
