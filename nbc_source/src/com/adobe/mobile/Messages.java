// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.adobe.mobile:
//            StaticMethods, Message, MessageFullScreen, MobileConfig

final class Messages
{
    protected static final class MessageShowRule extends Enum
    {

        private static final MessageShowRule $VALUES[];
        public static final MessageShowRule MESSAGE_SHOW_RULE_ALWAYS;
        public static final MessageShowRule MESSAGE_SHOW_RULE_ONCE;
        public static final MessageShowRule MESSAGE_SHOW_RULE_UNKNOWN;
        public static final MessageShowRule MESSAGE_SHOW_RULE_UNTIL_CLICK;
        private final int value;

        public static MessageShowRule valueOf(String s)
        {
            return (MessageShowRule)Enum.valueOf(com/adobe/mobile/Messages$MessageShowRule, s);
        }

        public static MessageShowRule[] values()
        {
            return (MessageShowRule[])$VALUES.clone();
        }

        protected int getValue()
        {
            return value;
        }

        static 
        {
            MESSAGE_SHOW_RULE_UNKNOWN = new MessageShowRule("MESSAGE_SHOW_RULE_UNKNOWN", 0, 0);
            MESSAGE_SHOW_RULE_ALWAYS = new MessageShowRule("MESSAGE_SHOW_RULE_ALWAYS", 1, 1);
            MESSAGE_SHOW_RULE_ONCE = new MessageShowRule("MESSAGE_SHOW_RULE_ONCE", 2, 2);
            MESSAGE_SHOW_RULE_UNTIL_CLICK = new MessageShowRule("MESSAGE_SHOW_RULE_UNTIL_CLICK", 3, 3);
            $VALUES = (new MessageShowRule[] {
                MESSAGE_SHOW_RULE_UNKNOWN, MESSAGE_SHOW_RULE_ALWAYS, MESSAGE_SHOW_RULE_ONCE, MESSAGE_SHOW_RULE_UNTIL_CLICK
            });
        }

        private MessageShowRule(String s, int i, int j)
        {
            super(s, i);
            value = j;
        }
    }


    protected static final String MESSAGE_ACTION_NAME = "In-App Message";
    protected static final String MESSAGE_CLICKED = "a.message.clicked";
    protected static final String MESSAGE_ID = "a.message.id";
    protected static final String MESSAGE_LOCAL_ADB_CODE = "adbMessageCode";
    protected static final Integer MESSAGE_LOCAL_IDENTIFIER = Integer.valueOf(0xb7267);
    protected static final String MESSAGE_LOCAL_PAYLOAD = "alarm_message";
    protected static final String MESSAGE_LOCAL_REQUEST_CODE = "requestCode";
    protected static final String MESSAGE_TOKEN_LIFETIME_VALUE = "{lifetimeValue}";
    protected static final String MESSAGE_TOKEN_MESSAGE_ID = "{messageId}";
    protected static final String MESSAGE_TOKEN_TRACKING_ID = "{trackingId}";
    protected static final String MESSAGE_TOKEN_USER_ID = "{userId}";
    protected static final String MESSAGE_VIEWED = "a.message.viewed";
    private static Message _currentMessage = null;
    private static final Object _currentMessageMutex = new Object();
    private static int _largeIconResourceId = -1;
    private static MessageFullScreen _messageFullScreen = null;
    private static final Object _messageFullScreenMutex = new Object();
    private static int _smallIconResourceId = -1;

    Messages()
    {
    }

    protected static void checkForInAppMessage(Map map, Map map1, Map map2)
    {
        StaticMethods.getMessagesExecutor().execute(new Runnable(map, map1, map2) {

            final Map val$cdata;
            final Map val$lifecycleData;
            final Map val$vars;

            public void run()
            {
_L2:
                return;
                if (MobileConfig.getInstance().getInAppMessages() == null || MobileConfig.getInstance().getInAppMessages().size() <= 0 || vars != null && vars.containsKey("pev2") && vars.get("pev2").toString().equals("ADBINTERNAL:In-App Message")) goto _L2; else goto _L1
_L1:
                Message message;
                Object obj1 = null;
                Object obj = obj1;
                if (cdata != null)
                {
                    obj = obj1;
                    if (cdata.size() > 0)
                    {
                        obj1 = new HashMap(cdata.size());
                        Iterator iterator = cdata.entrySet().iterator();
                        do
                        {
                            obj = obj1;
                            if (!iterator.hasNext())
                            {
                                break;
                            }
                            obj = (java.util.Map.Entry)iterator.next();
                            ((HashMap) (obj1)).put(((String)((java.util.Map.Entry) (obj)).getKey()).toLowerCase(), ((java.util.Map.Entry) (obj)).getValue());
                        } while (true);
                    }
                }
                Object obj2 = null;
                obj1 = obj2;
                if (vars != null)
                {
                    obj1 = obj2;
                    if (vars.size() > 0)
                    {
                        obj2 = new HashMap(vars.size());
                        Iterator iterator1 = vars.entrySet().iterator();
                        do
                        {
                            obj1 = obj2;
                            if (!iterator1.hasNext())
                            {
                                break;
                            }
                            obj1 = (java.util.Map.Entry)iterator1.next();
                            ((HashMap) (obj2)).put(((String)((java.util.Map.Entry) (obj1)).getKey()).toLowerCase(), ((java.util.Map.Entry) (obj1)).getValue());
                        } while (true);
                    }
                }
                obj2 = MobileConfig.getInstance().getInAppMessages().iterator();
                do
                {
                    if (!((Iterator) (obj2)).hasNext())
                    {
                        continue; /* Loop/switch isn't completed */
                    }
                    message = (Message)((Iterator) (obj2)).next();
                } while (!message.shouldShowForVariables(((Map) (obj1)), ((Map) (obj)), lifecycleData));
                break; /* Loop/switch isn't completed */
                if (true) goto _L2; else goto _L3
_L3:
                message.show();
                return;
            }

            
            {
                vars = map;
                cdata = map1;
                lifecycleData = map2;
                super();
            }
        });
    }

    protected static MessageFullScreen getCurrentFullscreenMessage()
    {
        MessageFullScreen messagefullscreen;
        synchronized (_messageFullScreenMutex)
        {
            messagefullscreen = _messageFullScreen;
        }
        return messagefullscreen;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected static Message getCurrentMessage()
    {
        Message message;
        synchronized (_currentMessageMutex)
        {
            message = _currentMessage;
        }
        return message;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected static int getLargeIconResourceId()
    {
        return _largeIconResourceId;
    }

    protected static int getSmallIconResourceId()
    {
        return _smallIconResourceId;
    }

    protected static void resetAllInAppMessages()
    {
        StaticMethods.getMessagesExecutor().execute(new Runnable() {

            public void run()
            {
                Object obj = MobileConfig.getInstance().getInAppMessages();
                if (obj != null && ((ArrayList) (obj)).size() > 0)
                {
                    obj = ((ArrayList) (obj)).iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        ((Message)((Iterator) (obj)).next()).isVisible = false;
                    }
                }
            }

        });
    }

    protected static void setCurrentMessage(Message message)
    {
        synchronized (_currentMessageMutex)
        {
            _currentMessage = message;
        }
        return;
        message;
        obj;
        JVM INSTR monitorexit ;
        throw message;
    }

    protected static void setCurrentMessageFullscreen(MessageFullScreen messagefullscreen)
    {
        synchronized (_messageFullScreenMutex)
        {
            _messageFullScreen = messagefullscreen;
        }
        return;
        messagefullscreen;
        obj;
        JVM INSTR monitorexit ;
        throw messagefullscreen;
    }

    protected static void setLargeIconResourceId(int i)
    {
        _largeIconResourceId = i;
    }

    protected static void setSmallIconResourceId(int i)
    {
        _smallIconResourceId = i;
    }

}
