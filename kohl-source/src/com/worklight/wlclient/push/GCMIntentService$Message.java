// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.push;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.wlclient.push:
//            GCMIntentService

public static class <init>
    implements Parcelable
{

    public static final android.os.tService.Message.key CREATOR = new android.os.Parcelable.Creator() {

        public GCMIntentService.Message createFromParcel(Parcel parcel)
        {
            return new GCMIntentService.Message(parcel, null);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public GCMIntentService.Message[] newArray(int i)
        {
            return new GCMIntentService.Message[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private String alert;
    private int badge;
    private boolean bridge;
    private String category;
    private String key;
    private String payload;
    private int priority;
    private String redact;
    private String sound;
    private int visibility;

    public int describeContents()
    {
        return 0;
    }

    public JSONObject getPayload()
    {
        if (payload == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        JSONObject jsonobject = new JSONObject(payload);
        return jsonobject;
        JSONException jsonexception;
        jsonexception;
        return new JSONObject();
    }

    public JSONObject getProps()
    {
        JSONObject jsonobject = new JSONObject();
        if (alert != null) goto _L2; else goto _L1
_L1:
        Object obj = JSONObject.NULL;
_L3:
        jsonobject.put("alert", obj);
        jsonobject.put("badge", badge);
        if (sound != null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        obj = JSONObject.NULL;
_L4:
        jsonobject.put("sound", obj);
        jsonobject.put("priority", priority);
        jsonobject.put("key", key);
        return jsonobject;
_L2:
        try
        {
            obj = alert;
        }
        catch (JSONException jsonexception)
        {
            throw new RuntimeException(jsonexception.getMessage(), jsonexception);
        }
          goto _L3
        obj = sound;
          goto _L4
    }

    public String toString()
    {
        return String.format("Message(alert=%s, badge=%d, sound=%s, priority=%d, visibility=%d, redact=%s, payload=%s, category=%s, bridge=%s, key=%s)", new Object[] {
            alert, Integer.valueOf(badge), sound, Integer.valueOf(priority), Integer.valueOf(visibility), redact, payload, category, Boolean.valueOf(bridge), key
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(alert);
        parcel.writeInt(badge);
        parcel.writeString(sound);
        parcel.writeString(payload);
        parcel.writeInt(priority);
        parcel.writeInt(visibility);
        parcel.writeString(redact);
        parcel.writeString(category);
        parcel.writeString(String.valueOf(bridge));
        parcel.writeString(key);
    }




/*
    static String access$002(_cls1 _pcls1, String s)
    {
        _pcls1.payload = s;
        return s;
    }

*/



/*
    static String access$102(payload payload1, String s)
    {
        payload1.alert = s;
        return s;
    }

*/



/*
    static int access$202(alert alert1, int i)
    {
        alert1.badge = i;
        return i;
    }

*/



/*
    static String access$302(badge badge1, String s)
    {
        badge1.sound = s;
        return s;
    }

*/



/*
    static int access$402(sound sound1, int i)
    {
        sound1.priority = i;
        return i;
    }

*/



/*
    static int access$502(priority priority1, int i)
    {
        priority1.visibility = i;
        return i;
    }

*/



/*
    static String access$602(visibility visibility1, String s)
    {
        visibility1.redact = s;
        return s;
    }

*/



/*
    static String access$702(redact redact1, String s)
    {
        redact1.category = s;
        return s;
    }

*/



/*
    static boolean access$802(category category1, boolean flag)
    {
        category1.bridge = flag;
        return flag;
    }

*/


/*
    static String access$902(bridge bridge1, String s)
    {
        bridge1.key = s;
        return s;
    }

*/

    public _cls1()
    {
        alert = null;
        badge = 1;
        sound = null;
        payload = null;
        priority = 0;
        visibility = 1;
        redact = null;
        category = null;
        bridge = true;
        key = null;
    }

    private key(Parcel parcel)
    {
        alert = parcel.readString();
        badge = parcel.readInt();
        sound = parcel.readString();
        payload = parcel.readString();
        priority = parcel.readInt();
        visibility = parcel.readInt();
        redact = parcel.readString();
        category = parcel.readString();
        bridge = Boolean.valueOf(parcel.readString()).booleanValue();
        key = parcel.readString();
    }

    key(Parcel parcel, key key1)
    {
        this(parcel);
    }
}
