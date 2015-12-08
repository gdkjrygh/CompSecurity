// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.adobe.mobile:
//            StaticMethods, AnalyticsTrackInternal, Messages, MessageMatcher, 
//            MessageAlert, MessageLocalNotification, AnalyticsWorker, MessageFullScreen

abstract class Message
{

    protected static final String JSON_CONFIG_ASSETS = "assets";
    private static final String JSON_CONFIG_AUDIENCES = "audiences";
    private static final String JSON_CONFIG_END_DATE = "endDate";
    private static final String JSON_CONFIG_MESSAGE_ID = "messageId";
    private static final String JSON_CONFIG_SHOW_OFFLINE = "showOffline";
    private static final String JSON_CONFIG_SHOW_RULE = "showRule";
    private static final String JSON_CONFIG_START_DATE = "startDate";
    private static final String JSON_CONFIG_TEMPLATE = "template";
    private static final String JSON_CONFIG_TRIGGERS = "triggers";
    private static final boolean JSON_DEFAULT_SHOW_OFFLINE = false;
    private static final Long JSON_DEFAULT_START_DATE = Long.valueOf(0L);
    private static final String MESSAGE_ENUM_STRING_UNKNOWN = "unknown";
    protected static final String MESSAGE_IMAGE_CACHE_DIR = "messageImages";
    protected static final String MESSAGE_JSON_PAYLOAD = "payload";
    private static final String MESSAGE_SHOW_RULE_STRING_ALWAYS = "always";
    private static final String MESSAGE_SHOW_RULE_STRING_ONCE = "once";
    private static final String MESSAGE_SHOW_RULE_STRING_UNTIL_CLICK = "untilClick";
    private static final String MESSAGE_TEMPLATE_STRING_ALERT = "alert";
    private static final String MESSAGE_TEMPLATE_STRING_FULLSCREEN = "fullscreen";
    private static final String MESSAGE_TEMPLATE_STRING_LOCAL_NOTIFICATION = "local";
    private static final String SHARED_PREFERENCES_BLACK_LIST = "messagesBlackList";
    private static HashMap _blacklist;
    private static final Object _blacklistMutex = new Object();
    private static final Map _messageTypeDictionary = new HashMap() {

            
            {
                put("local", com/adobe/mobile/MessageLocalNotification);
                put("alert", com/adobe/mobile/MessageAlert);
                put("fullscreen", com/adobe/mobile/MessageFullScreen);
            }
    };
    private static final Map _showRuleEnumDictionary = new HashMap() {

            
            {
                put("unknown", Messages.MessageShowRule.MESSAGE_SHOW_RULE_UNKNOWN);
                put("always", Messages.MessageShowRule.MESSAGE_SHOW_RULE_ALWAYS);
                put("once", Messages.MessageShowRule.MESSAGE_SHOW_RULE_ONCE);
                put("untilClick", Messages.MessageShowRule.MESSAGE_SHOW_RULE_UNTIL_CLICK);
            }
    };
    protected ArrayList assets;
    protected ArrayList audiences;
    protected Date endDate;
    protected boolean isVisible;
    protected String messageId;
    protected int orientationWhenShown;
    protected boolean showOffline;
    protected Messages.MessageShowRule showRule;
    protected Date startDate;
    protected ArrayList triggers;

    Message()
    {
    }

    private HashMap loadBlacklist()
    {
        Object obj;
        try
        {
            obj = StaticMethods.getSharedPreferences().getString("messagesBlackList", null);
        }
        catch (StaticMethods.NullContextException nullcontextexception)
        {
            StaticMethods.logDebugFormat("Messaging - Unable to get shared preferences while loading blacklist. (%s)", new Object[] {
                nullcontextexception.getMessage()
            });
            return new HashMap();
        }
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        return new HashMap();
        obj = mapFromString(((String) (obj)));
        return ((HashMap) (obj));
    }

    private HashMap mapFromString(String s)
    {
        HashMap hashmap = new HashMap();
        try
        {
            s = new JSONObject(s);
            String s1;
            for (Iterator iterator = s.keys(); iterator.hasNext(); hashmap.put(s1, Integer.valueOf(s.getInt(s1))))
            {
                s1 = (String)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            StaticMethods.logErrorFormat("Messages- Unable to deserialize blacklist(%s)", new Object[] {
                s.getMessage()
            });
        }
        return hashmap;
    }

    private static Messages.MessageShowRule messageShowRuleFromString(String s)
    {
        return (Messages.MessageShowRule)_showRuleEnumDictionary.get(s);
    }

    protected static Message messageWithJsonObject(JSONObject jsonobject)
    {
        String s = "";
        String s1;
        Message message;
        boolean flag;
        try
        {
            s1 = jsonobject.getString("template");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            StaticMethods.logWarningFormat("Messages - template is required for in-app message", new Object[0]);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            StaticMethods.logWarningFormat("Messages - invalid template specified for message (%s)", new Object[] {
                s
            });
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            StaticMethods.logWarningFormat("Messages - unable to create instance of message (%s)", new Object[] {
                jsonobject.getMessage()
            });
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            StaticMethods.logWarningFormat("Messages - unable to create instance of message (%s)", new Object[] {
                jsonobject.getMessage()
            });
            return null;
        }
        s = s1;
        message = (Message)((Class)_messageTypeDictionary.get(s1)).newInstance();
        s = s1;
        flag = message.initWithPayloadObject(jsonobject);
        if (flag)
        {
            jsonobject = message;
        } else
        {
            jsonobject = null;
        }
        return jsonobject;
    }

    private String stringFromMap(Map map)
    {
        return (new JSONObject(map)).toString();
    }

    protected void blacklist()
    {
        Object obj = _blacklistMutex;
        obj;
        JVM INSTR monitorenter ;
        if (_blacklist == null)
        {
            _blacklist = loadBlacklist();
        }
        _blacklist.put(messageId, Integer.valueOf(showRule.getValue()));
        StaticMethods.logDebugFormat("Messages - adding message \"%s\" to blacklist", new Object[] {
            messageId
        });
        android.content.SharedPreferences.Editor editor = StaticMethods.getSharedPreferencesEditor();
        editor.putString("messagesBlackList", stringFromMap(_blacklist));
        editor.commit();
_L1:
        return;
        Object obj1;
        obj1;
        StaticMethods.logErrorFormat("Messages - Error persisting blacklist map (%s).", new Object[] {
            ((StaticMethods.NullContextException) (obj1)).getMessage()
        });
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    protected void clickedThrough()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("a.message.id", messageId);
        hashmap.put("a.message.clicked", Integer.valueOf(1));
        AnalyticsTrackInternal.trackInternal("In-App Message", hashmap, StaticMethods.getTimeSince1970());
        if (showRule == Messages.MessageShowRule.MESSAGE_SHOW_RULE_ONCE || showRule == Messages.MessageShowRule.MESSAGE_SHOW_RULE_UNTIL_CLICK)
        {
            blacklist();
        }
        Messages.setCurrentMessage(null);
    }

    protected String description()
    {
        return (new StringBuilder()).append("Message ID: ").append(messageId).append("; Show Rule: ").append(showRule.toString()).append("; Blacklisted: ").append(isBlacklisted()).toString();
    }

    protected boolean initWithPayloadObject(JSONObject jsonobject)
    {
label0:
        {
            if (jsonobject == null || jsonobject.length() == 0)
            {
                return false;
            }
            try
            {
                messageId = jsonobject.getString("messageId");
                if (messageId.length() > 0)
                {
                    break label0;
                }
                StaticMethods.logWarningFormat("Messages - Unable to create message, messageId is empty", new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                StaticMethods.logWarningFormat("Messages - Unable to create message, messageId is required", new Object[0]);
                return false;
            }
            return false;
        }
label1:
        {
            try
            {
                String s = jsonobject.getString("showRule");
                showRule = messageShowRuleFromString(s);
                if (showRule != null && showRule != Messages.MessageShowRule.MESSAGE_SHOW_RULE_UNKNOWN)
                {
                    break label1;
                }
                StaticMethods.logWarningFormat("Messages - Unable to create message \"%s\", showRule not valid (%s)", new Object[] {
                    messageId, s
                });
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                StaticMethods.logWarningFormat("Messages - Unable to create message \"%s\", showRule is required", new Object[] {
                    messageId
                });
                return false;
            }
            return false;
        }
        JSONArray jsonarray;
        JSONObject jsonobject2;
        int i;
        int k;
        try
        {
            startDate = new Date(1000L * jsonobject.getLong("startDate"));
        }
        catch (JSONException jsonexception)
        {
            StaticMethods.logDebugFormat("Messages - Tried to read startDate from message \"%s\" but none found. Using default value", new Object[] {
                messageId
            });
            startDate = new Date(JSON_DEFAULT_START_DATE.longValue() * 1000L);
        }
        try
        {
            endDate = new Date(1000L * jsonobject.getLong("endDate"));
        }
        catch (JSONException jsonexception1)
        {
            StaticMethods.logDebugFormat("Messages - Tried to read endDate from message \"%s\" but none found. Using default value", new Object[] {
                messageId
            });
        }
        try
        {
            showOffline = jsonobject.getBoolean("showOffline");
        }
        catch (JSONException jsonexception2)
        {
            StaticMethods.logDebugFormat("Messages - Tried to read showOffline from message \"%s\" but none found. Using default value", new Object[] {
                messageId
            });
            showOffline = false;
        }
        audiences = new ArrayList();
        jsonarray = jsonobject.getJSONArray("audiences");
        k = jsonarray.length();
        i = 0;
_L2:
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject2 = jsonarray.getJSONObject(i);
        audiences.add(MessageMatcher.messageMatcherWithJsonObject(jsonobject2));
        i++;
        if (true) goto _L2; else goto _L1
        JSONException jsonexception3;
        jsonexception3;
        StaticMethods.logDebugFormat("Messages - failed to read audience for message \"%s\", error: %s", new Object[] {
            messageId, jsonexception3.getMessage()
        });
_L1:
        triggers = new ArrayList();
        int l;
        jsonobject = jsonobject.getJSONArray("triggers");
        l = jsonobject.length();
        int j = 0;
_L4:
        if (j >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        JSONObject jsonobject1 = jsonobject.getJSONObject(j);
        triggers.add(MessageMatcher.messageMatcherWithJsonObject(jsonobject1));
        j++;
        if (true) goto _L4; else goto _L3
        jsonobject;
        StaticMethods.logDebugFormat("Messages - failed to read trigger for message \"%s\", error: %s", new Object[] {
            messageId, jsonobject.getMessage()
        });
_L3:
        if (triggers.size() <= 0)
        {
            StaticMethods.logWarningFormat("Messages - Unable to load message \"%s\" - at least one valid trigger is required for a message", new Object[] {
                messageId
            });
            return false;
        } else
        {
            isVisible = false;
            return true;
        }
    }

    protected boolean isBlacklisted()
    {
        Object obj = _blacklistMutex;
        obj;
        JVM INSTR monitorenter ;
        Integer integer;
        if (_blacklist == null)
        {
            _blacklist = loadBlacklist();
        }
        integer = (Integer)_blacklist.get(messageId);
        if (integer == null) goto _L2; else goto _L1
_L1:
        if (integer.intValue() != showRule.getValue()) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        obj;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected boolean shouldShowForVariables(Map map, Map map1, Map map2)
    {
        if (!isVisible || orientationWhenShown == StaticMethods.getCurrentOrientation() || !(this instanceof MessageAlert)) goto _L2; else goto _L1
_L1:
        return true;
_L2:
label0:
        {
            if (Messages.getCurrentMessage() != null && !(this instanceof MessageLocalNotification))
            {
                return false;
            }
            if ((map == null || map.size() <= 0) && (map1 == null || map1.size() <= 0))
            {
                return false;
            }
            if (isBlacklisted())
            {
                return false;
            }
            boolean flag;
            try
            {
                if (AnalyticsWorker.networkConnectivity(StaticMethods.getSharedContext()))
                {
                    break label0;
                }
                flag = showOffline;
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                return false;
            }
            if (!flag)
            {
                return false;
            }
        }
        Date date = new Date(StaticMethods.getTimeSince1970() * 1000L);
        if (date.before(startDate))
        {
            return false;
        }
        if (endDate != null && date.after(endDate))
        {
            return false;
        }
        for (Iterator iterator = audiences.iterator(); iterator.hasNext();)
        {
            if (!((MessageMatcher)iterator.next()).matchesInMaps(new Map[] {
    map2
}))
            {
                return false;
            }
        }

        map2 = triggers.iterator();
        while (map2.hasNext()) 
        {
            if (!((MessageMatcher)map2.next()).matchesInMaps(new Map[] {
    map, map1
}))
            {
                return false;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void show()
    {
        orientationWhenShown = StaticMethods.getCurrentOrientation();
        Messages.setCurrentMessage(this);
    }

    protected void viewed()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("a.message.id", messageId);
        hashmap.put("a.message.viewed", Integer.valueOf(1));
        AnalyticsTrackInternal.trackInternal("In-App Message", hashmap, StaticMethods.getTimeSince1970());
        if (showRule == Messages.MessageShowRule.MESSAGE_SHOW_RULE_ONCE)
        {
            blacklist();
        }
        Messages.setCurrentMessage(null);
    }

}
