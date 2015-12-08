// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.model;

import com.apptentive.android.sdk.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.apptentive.android.sdk.model:
//            ConversationItem, ExtendedData

public class Event extends ConversationItem
{
    public static final class EventLabel extends Enum
    {

        private static final EventLabel $VALUES[];
        public static final EventLabel app__exit;
        public static final EventLabel app__launch;
        public static final EventLabel error;
        public static final EventLabel message_center__attach;
        public static final EventLabel message_center__close;
        public static final EventLabel message_center__intro__cancel;
        public static final EventLabel message_center__intro__launch;
        public static final EventLabel message_center__intro__send;
        public static final EventLabel message_center__launch;
        public static final EventLabel message_center__read;
        public static final EventLabel message_center__thank_you__close;
        public static final EventLabel message_center__thank_you__launch;
        public static final EventLabel message_center__thank_you__messages;
        private final String labelName;

        public static EventLabel valueOf(String s)
        {
            return (EventLabel)Enum.valueOf(com/apptentive/android/sdk/model/Event$EventLabel, s);
        }

        public static EventLabel[] values()
        {
            return (EventLabel[])$VALUES.clone();
        }

        public String getLabelName()
        {
            return labelName;
        }

        static 
        {
            app__launch = new EventLabel("app__launch", 0, "launch");
            app__exit = new EventLabel("app__exit", 1, "exit");
            message_center__launch = new EventLabel("message_center__launch", 2, "message_center.launch");
            message_center__close = new EventLabel("message_center__close", 3, "message_center.close");
            message_center__attach = new EventLabel("message_center__attach", 4, "message_center.attach");
            message_center__read = new EventLabel("message_center__read", 5, "message_center.read");
            message_center__intro__launch = new EventLabel("message_center__intro__launch", 6, "message_center.intro.launch");
            message_center__intro__send = new EventLabel("message_center__intro__send", 7, "message_center.intro.send");
            message_center__intro__cancel = new EventLabel("message_center__intro__cancel", 8, "message_center.intro.cancel");
            message_center__thank_you__launch = new EventLabel("message_center__thank_you__launch", 9, "message_center.thank_you.launch");
            message_center__thank_you__messages = new EventLabel("message_center__thank_you__messages", 10, "message_center.thank_you.messages");
            message_center__thank_you__close = new EventLabel("message_center__thank_you__close", 11, "message_center.thank_you.close");
            error = new EventLabel("error", 12, "error");
            $VALUES = (new EventLabel[] {
                app__launch, app__exit, message_center__launch, message_center__close, message_center__attach, message_center__read, message_center__intro__launch, message_center__intro__send, message_center__intro__cancel, message_center__thank_you__launch, 
                message_center__thank_you__messages, message_center__thank_you__close, error
            });
        }

        private EventLabel(String s, int i, String s1)
        {
            super(s, i);
            labelName = s1;
        }
    }


    private static final String KEY_CUSTOM_DATA = "custom_data";
    private static final String KEY_DATA = "data";
    private static final String KEY_LABEL = "label";
    private static final String KEY_TRIGGER = "trigger";

    public Event(String s)
        throws JSONException
    {
        super(s);
    }

    public Event(String s, String s1)
    {
        this(s, (Map)null);
        s = new HashMap();
        s.put("trigger", s1);
        putData(s);
    }

    public Event(String s, Map map)
    {
        put("label", s);
label0:
        {
            if (map != null)
            {
                try
                {
                    if (!map.isEmpty())
                    {
                        s = new JSONObject();
                        String s1;
                        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); s.put(s1, map.get(s1)))
                        {
                            s1 = (String)iterator.next();
                        }

                        break label0;
                    }
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    Log.e("Unable to construct Event.", s, new Object[0]);
                }
            }
            return;
        }
        put("data", s);
        return;
    }

    public transient Event(String s, Map map, Map map1, ExtendedData aextendeddata[])
    {
        put("label", s);
        if (map == null) goto _L2; else goto _L1
_L1:
        if (map.isEmpty()) goto _L2; else goto _L3
_L3:
        s = new JSONObject();
        String s1;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); s.put(s1, map.get(s1)))
        {
            s1 = (String)iterator.next();
        }

          goto _L4
        s;
        Log.e("Unable to construct Event.", s, new Object[0]);
_L6:
        return;
_L4:
        put("data", s);
_L2:
        if (map1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!map1.isEmpty())
        {
            put("custom_data", generateCustomDataJson(map1));
        }
        if (aextendeddata == null) goto _L6; else goto _L5
_L5:
        int j;
        if (aextendeddata.length == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        j = aextendeddata.length;
        int i = 0;
_L8:
        if (i >= j)
        {
            continue; /* Loop/switch isn't completed */
        }
        s = aextendeddata[i];
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_177;
        }
        put(s.getTypeName(), s);
        i++;
        if (true) goto _L8; else goto _L7
_L7:
        if (true) goto _L6; else goto _L9
_L9:
    }

    public Event(String s, JSONObject jsonobject)
    {
        try
        {
            put("label", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("Unable to construct Event.", s, new Object[0]);
            return;
        }
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        put("data", jsonobject);
    }

    private JSONObject generateCustomDataJson(Map map)
    {
        JSONObject jsonobject = new JSONObject();
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            Object obj = map.get(s);
            if (obj != null)
            {
                try
                {
                    jsonobject.put(s, obj);
                }
                catch (Exception exception)
                {
                    Log.w("Error adding custom data to Event: \"%s\" = \"%s\"", new Object[] {
                        s, obj.toString(), exception
                    });
                }
            }
        } while (true);
        return jsonobject;
    }

    protected void initBaseType()
    {
        setBaseType(Payload.BaseType.event);
    }

    public void putData(Map map)
    {
        if (map != null && !map.isEmpty()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        JSONObject jsonobject;
        if (!isNull("data"))
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject = new JSONObject();
        put("data", jsonobject);
_L4:
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) 
        {
            String s = (String)iterator.next();
            jsonobject.put(s, map.get(s));
        }
        if (true) goto _L1; else goto _L3
_L3:
        try
        {
            jsonobject = getJSONObject("data");
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            Log.e("Unable to add data to Event.", map, new Object[0]);
            return;
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }
}
