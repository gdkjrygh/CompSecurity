// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            BadDecideObjectException

public class InAppNotification
    implements Parcelable
{
    public static class Type extends Enum
    {

        public static final Type a;
        public static final Type b;
        public static final Type c;
        private static final Type d[];

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/mixpanel/android/mpmetrics/InAppNotification$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])d.clone();
        }

        static 
        {
        /* block-local class not found */
        class _cls1 {}

            a = new _cls1("UNKNOWN", 0);
        /* block-local class not found */
        class _cls2 {}

            b = new _cls2("MINI", 1);
        /* block-local class not found */
        class _cls3 {}

            c = new _cls3("TAKEOVER", 2);
            d = (new Type[] {
                a, b, c
            });
        }

        private Type(String s, int i1)
        {
            super(s, i1);
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public InAppNotification a(Parcel parcel)
        {
            return new InAppNotification(parcel);
        }

        public InAppNotification[] a(int i1)
        {
            return new InAppNotification[i1];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i1)
        {
            return a(i1);
        }

    };
    private static final String k = "MixpanelAPI.InAppNotif";
    private static final Pattern l = Pattern.compile("(\\.[^./]+$)");
    private Bitmap a;
    private final JSONObject b;
    private final int c;
    private final int d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;

    public InAppNotification(Parcel parcel)
    {
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        JSONObject jsonobject1 = new JSONObject(parcel.readString());
        jsonobject = jsonobject1;
_L2:
        b = jsonobject;
        c = parcel.readInt();
        d = parcel.readInt();
        e = parcel.readString();
        f = parcel.readString();
        g = parcel.readString();
        h = parcel.readString();
        i = parcel.readString();
        j = parcel.readString();
        a = (Bitmap)parcel.readParcelable(android/graphics/Bitmap.getClassLoader());
        return;
        JSONException jsonexception;
        jsonexception;
        Log.e("MixpanelAPI.InAppNotif", "Error reading JSON when creating InAppNotification from Parcel");
        if (true) goto _L2; else goto _L1
_L1:
    }

    InAppNotification(JSONObject jsonobject)
        throws BadDecideObjectException
    {
        try
        {
            b = jsonobject;
            c = jsonobject.getInt("id");
            d = jsonobject.getInt("message_id");
            e = jsonobject.getString("type");
            f = jsonobject.getString("title");
            g = jsonobject.getString("body");
            h = jsonobject.getString("image_url");
            a = Bitmap.createBitmap(500, 500, android.graphics.Bitmap.Config.ARGB_8888);
            i = jsonobject.getString("cta");
            j = jsonobject.getString("cta_url");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new BadDecideObjectException("Notification JSON was unexpected or bad", jsonobject);
        }
    }

    static String a(String s, String s1)
    {
        Matcher matcher = l.matcher(s);
        if (matcher.find())
        {
            s = matcher.replaceFirst((new StringBuilder()).append(s1).append("$1").toString());
        }
        return s;
    }

    String a()
    {
        return b.toString();
    }

    void a(Bitmap bitmap)
    {
        a = bitmap;
    }

    JSONObject b()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("campaign_id", c());
            jsonobject.put("message_id", d());
            jsonobject.put("message_type", "inapp");
            jsonobject.put("message_subtype", e);
        }
        catch (JSONException jsonexception)
        {
            Log.e("MixpanelAPI.InAppNotif", "Impossible JSON Exception", jsonexception);
            return jsonobject;
        }
        return jsonobject;
    }

    public int c()
    {
        return c;
    }

    public int d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public Type e()
    {
        if (Type.b.toString().equals(e))
        {
            return Type.b;
        }
        if (Type.c.toString().equals(e))
        {
            return Type.c;
        } else
        {
            return Type.a;
        }
    }

    public String f()
    {
        return f;
    }

    public String g()
    {
        return g;
    }

    public String h()
    {
        return h;
    }

    public String i()
    {
        return a(h, "@2x");
    }

    public String j()
    {
        return a(h, "@4x");
    }

    public String k()
    {
        return i;
    }

    public String l()
    {
        return j;
    }

    public Bitmap m()
    {
        return a;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeString(b.toString());
        parcel.writeInt(c);
        parcel.writeInt(d);
        parcel.writeString(e);
        parcel.writeString(f);
        parcel.writeString(g);
        parcel.writeString(h);
        parcel.writeString(i);
        parcel.writeString(j);
        parcel.writeParcelable(a, i1);
    }

}
