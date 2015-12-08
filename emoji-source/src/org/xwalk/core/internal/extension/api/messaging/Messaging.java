// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.messaging;

import android.app.Activity;
import java.util.HashMap;
import org.json.JSONObject;
import org.xwalk.core.internal.extension.XWalkExtensionWithActivityStateListener;

// Referenced classes of package org.xwalk.core.internal.extension.api.messaging:
//            MessagingSmsManager, MessagingManager, Command

public class Messaging extends XWalkExtensionWithActivityStateListener
{

    public static final String JS_API_PATH = "jsapi/messaging_api.js";
    private static final String NAME = "xwalk.experimental.messaging";
    private static HashMap sMethodMap = new HashMap();
    private boolean isIntentFiltersRegistered;
    private MessagingManager mMessagingManager;
    private MessagingSmsManager mSmsManager;

    public Messaging(String s, Activity activity)
    {
        super("xwalk.experimental.messaging", s, activity);
        isIntentFiltersRegistered = false;
        mSmsManager = new MessagingSmsManager(activity, this);
        mMessagingManager = new MessagingManager(activity, this);
        if (!isIntentFiltersRegistered)
        {
            mSmsManager.registerIntentFilters();
            isIntentFiltersRegistered = true;
        }
        initMethodMap();
    }

    private String getCommandString(String s)
    {
        if (s.isEmpty())
        {
            return "";
        }
        try
        {
            s = (new JSONObject(s)).getString("cmd");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return "";
        }
        return s;
    }

    private void initMethodMap()
    {
        sMethodMap.put("msg_smsSend", new Command() {

            final Messaging this$0;

            public void runCommand(int i, JSONObject jsonobject)
            {
                mSmsManager.onSmsSend(i, jsonobject);
            }

            
            {
                this$0 = Messaging.this;
                super();
            }
        });
        sMethodMap.put("msg_smsClear", new Command() {

            final Messaging this$0;

            public void runCommand(int i, JSONObject jsonobject)
            {
                mSmsManager.onSmsClear(i, jsonobject);
            }

            
            {
                this$0 = Messaging.this;
                super();
            }
        });
        sMethodMap.put("msg_smsSegmentInfo", new Command() {

            final Messaging this$0;

            public void runCommand(int i, JSONObject jsonobject)
            {
                mSmsManager.onSmsSegmentInfo(i, jsonobject);
            }

            
            {
                this$0 = Messaging.this;
                super();
            }
        });
        sMethodMap.put("msg_findMessages", new Command() {

            final Messaging this$0;

            public void runCommand(int i, JSONObject jsonobject)
            {
                mMessagingManager.onMsgFindMessages(i, jsonobject);
            }

            
            {
                this$0 = Messaging.this;
                super();
            }
        });
        sMethodMap.put("msg_getMessage", new Command() {

            final Messaging this$0;

            public void runCommand(int i, JSONObject jsonobject)
            {
                mMessagingManager.onMsgGetMessage(i, jsonobject);
            }

            
            {
                this$0 = Messaging.this;
                super();
            }
        });
        sMethodMap.put("msg_deleteMessage", new Command() {

            final Messaging this$0;

            public void runCommand(int i, JSONObject jsonobject)
            {
                mMessagingManager.onMsgDeleteMessage(i, jsonobject);
            }

            
            {
                this$0 = Messaging.this;
                super();
            }
        });
        sMethodMap.put("msg_deleteConversation", new Command() {

            final Messaging this$0;

            public void runCommand(int i, JSONObject jsonobject)
            {
                mMessagingManager.onMsgDeleteConversation(i, jsonobject);
            }

            
            {
                this$0 = Messaging.this;
                super();
            }
        });
        sMethodMap.put("msg_markMessageRead", new Command() {

            final Messaging this$0;

            public void runCommand(int i, JSONObject jsonobject)
            {
                mMessagingManager.onMsgMarkMessageRead(i, jsonobject);
            }

            
            {
                this$0 = Messaging.this;
                super();
            }
        });
        sMethodMap.put("msg_markConversationRead", new Command() {

            final Messaging this$0;

            public void runCommand(int i, JSONObject jsonobject)
            {
                mMessagingManager.onMsgMarkConversationRead(i, jsonobject);
            }

            
            {
                this$0 = Messaging.this;
                super();
            }
        });
    }

    public void onActivityStateChange(Activity activity, int i)
    {
        if (i == 5 && isIntentFiltersRegistered)
        {
            mSmsManager.unregisterIntentFilters();
            isIntentFiltersRegistered = false;
        } else
        if (i == 2 && !isIntentFiltersRegistered)
        {
            mSmsManager.registerIntentFilters();
            isIntentFiltersRegistered = true;
            return;
        }
    }

    public void onMessage(int i, String s)
    {
        Command command;
        command = (Command)sMethodMap.get(getCommandString(s));
        if (command == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        command.runCommand(i, new JSONObject(s));
        return;
        s;
        s.printStackTrace();
        return;
    }

    public String onSyncMessage(int i, String s)
    {
        if (getCommandString(s).equals("msg_smsServiceId"))
        {
            return mSmsManager.getServiceIds();
        } else
        {
            return "";
        }
    }



}
