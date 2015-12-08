// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.model;

import com.apptentive.android.sdk.GlobalInfo;
import com.apptentive.android.sdk.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.apptentive.android.sdk.model:
//            ConversationItem

public abstract class Message extends ConversationItem
{
    public static final class State extends Enum
    {

        private static final State $VALUES[];
        public static final State saved;
        public static final State sending;
        public static final State sent;
        public static final State unknown;

        public static State parse(String s)
        {
            State state1;
            try
            {
                state1 = valueOf(s);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                Log.v((new StringBuilder()).append("Error parsing unknown Message.State: ").append(s).toString(), new Object[0]);
                return unknown;
            }
            return state1;
        }

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/apptentive/android/sdk/model/Message$State, s);
        }

        public static State[] values()
        {
            return (State[])$VALUES.clone();
        }

        static 
        {
            sending = new State("sending", 0);
            sent = new State("sent", 1);
            saved = new State("saved", 2);
            unknown = new State("unknown", 3);
            $VALUES = (new State[] {
                sending, sent, saved, unknown
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type AutomatedMessage;
        public static final Type FileMessage;
        public static final Type TextMessage;
        public static final Type unknown;

        public static Type parse(String s)
        {
            Type type;
            try
            {
                type = valueOf(s);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                Log.v((new StringBuilder()).append("Error parsing unknown Message.Type: ").append(s).toString(), new Object[0]);
                return unknown;
            }
            return type;
        }

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/apptentive/android/sdk/model/Message$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        static 
        {
            TextMessage = new Type("TextMessage", 0);
            FileMessage = new Type("FileMessage", 1);
            AutomatedMessage = new Type("AutomatedMessage", 2);
            unknown = new Type("unknown", 3);
            $VALUES = (new Type[] {
                TextMessage, FileMessage, AutomatedMessage, unknown
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }


    public static final String KEY_CREATED_AT = "created_at";
    public static final String KEY_CUSTOM_DATA = "custom_data";
    public static final String KEY_HIDDEN = "hidden";
    public static final String KEY_ID = "id";
    private static final String KEY_SENDER = "sender";
    private static final String KEY_SENDER_ID = "id";
    private static final String KEY_SENDER_NAME = "name";
    private static final String KEY_SENDER_PROFILE_PHOTO = "profile_photo";
    public static final String KEY_TYPE = "type";
    private boolean read;
    private State state;

    protected Message()
    {
        read = false;
        setSenderId(GlobalInfo.personId);
        state = State.sending;
        read = true;
        setBaseType(Payload.BaseType.message);
        initType();
    }

    protected Message(String s)
        throws JSONException
    {
        super(s);
        read = false;
    }

    public Double getCreatedAt()
    {
        double d;
        try
        {
            d = getDouble("created_at");
        }
        catch (JSONException jsonexception)
        {
            return null;
        }
        return Double.valueOf(d);
    }

    public String getId()
    {
        String s;
        if (isNull("id"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("id");
        return s;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getSenderId()
    {
        Object obj;
        if (isNull("sender"))
        {
            break MISSING_BLOCK_LABEL_35;
        }
        obj = getJSONObject("sender");
        if (((JSONObject) (obj)).isNull("id"))
        {
            break MISSING_BLOCK_LABEL_35;
        }
        obj = ((JSONObject) (obj)).getString("id");
        return ((String) (obj));
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getSenderProfilePhoto()
    {
        Object obj;
        if (isNull("sender"))
        {
            break MISSING_BLOCK_LABEL_35;
        }
        obj = getJSONObject("sender");
        if (((JSONObject) (obj)).isNull("profile_photo"))
        {
            break MISSING_BLOCK_LABEL_35;
        }
        obj = ((JSONObject) (obj)).getString("profile_photo");
        return ((String) (obj));
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getSenderUsername()
    {
        Object obj;
        if (isNull("sender"))
        {
            break MISSING_BLOCK_LABEL_35;
        }
        obj = getJSONObject("sender");
        if (((JSONObject) (obj)).isNull("name"))
        {
            break MISSING_BLOCK_LABEL_35;
        }
        obj = ((JSONObject) (obj)).getString("name");
        return ((String) (obj));
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public State getState()
    {
        if (state == null)
        {
            return State.unknown;
        } else
        {
            return state;
        }
    }

    public Type getType()
    {
        Type type;
        try
        {
            type = Type.parse(getString("type"));
        }
        catch (JSONException jsonexception)
        {
            return Type.unknown;
        }
        return type;
    }

    protected void initBaseType()
    {
        setBaseType(Payload.BaseType.message);
    }

    protected abstract void initType();

    public boolean isHidden()
    {
        boolean flag;
        try
        {
            flag = getBoolean("hidden");
        }
        catch (JSONException jsonexception)
        {
            return false;
        }
        return flag;
    }

    public boolean isOutgoingMessage()
    {
        String s = getSenderId();
        return s == null || s.equals(GlobalInfo.personId) || getState().equals(State.sending);
    }

    public boolean isRead()
    {
        return read;
    }

    public void setCreatedAt(Double double1)
    {
        try
        {
            put("created_at", double1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Double double1)
        {
            Log.e("Exception setting Message's %s field.", double1, new Object[] {
                "created_at"
            });
        }
    }

    public void setCustomData(Map map)
    {
        JSONObject jsonobject;
        if (map == null || map.size() == 0)
        {
            if (!isNull("custom_data"))
            {
                remove("custom_data");
            }
            return;
        }
        try
        {
            jsonobject = new JSONObject();
            String s;
            for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); jsonobject.put(s, map.get(s)))
            {
                s = (String)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            Log.e("Exception setting Message's %s field.", map, new Object[] {
                "custom_data"
            });
            return;
        }
        put("custom_data", jsonobject);
        return;
    }

    public void setHidden(boolean flag)
    {
        try
        {
            put("hidden", flag);
            return;
        }
        catch (JSONException jsonexception)
        {
            Log.e("Exception setting Message's %s field.", jsonexception, new Object[] {
                "hidden"
            });
        }
    }

    public void setId(String s)
    {
        try
        {
            put("id", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("Exception setting Message's %s field.", s, new Object[] {
                "id"
            });
        }
    }

    public void setRead(boolean flag)
    {
        read = flag;
    }

    public void setSenderId(String s)
    {
        JSONObject jsonobject;
        if (isNull("sender"))
        {
            break MISSING_BLOCK_LABEL_25;
        }
        jsonobject = getJSONObject("sender");
_L1:
        jsonobject.put("id", s);
        return;
        try
        {
            jsonobject = new JSONObject();
            put("sender", jsonobject);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("Exception setting Message's %s field.", s, new Object[] {
                "id"
            });
            return;
        }
          goto _L1
    }

    public void setState(State state1)
    {
        state = state1;
    }

    protected void setType(Type type)
    {
        try
        {
            put("type", type.name());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Type type)
        {
            Log.e("Exception setting Message's %s field.", type, new Object[] {
                "type"
            });
        }
    }
}
