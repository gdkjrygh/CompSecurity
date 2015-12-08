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

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new InAppNotification(parcel);
        }

        public final volatile Object[] newArray(int l)
        {
            return new InAppNotification[l];
        }

    };
    private static final Pattern k = Pattern.compile("(\\.[^./]+$)");
    public Bitmap a;
    public final int b;
    public final String c;
    public final String d;
    final String e;
    public final String f;
    public final String g;
    private final JSONObject h;
    private final int i;
    private final String j;

    public InAppNotification(Parcel parcel)
    {
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        JSONObject jsonobject1 = new JSONObject(parcel.readString());
        jsonobject = jsonobject1;
_L2:
        h = jsonobject;
        b = parcel.readInt();
        i = parcel.readInt();
        j = parcel.readString();
        c = parcel.readString();
        d = parcel.readString();
        e = parcel.readString();
        f = parcel.readString();
        g = parcel.readString();
        a = (Bitmap)parcel.readParcelable(android/graphics/Bitmap.getClassLoader());
        return;
        JSONException jsonexception;
        jsonexception;
        Log.e("MixpanelAPI.InAppNotif", "Error reading JSON when creating InAppNotification from Parcel");
        if (true) goto _L2; else goto _L1
_L1:
    }

    InAppNotification(JSONObject jsonobject)
    {
        try
        {
            h = jsonobject;
            b = jsonobject.getInt("id");
            i = jsonobject.getInt("message_id");
            j = jsonobject.getString("type");
            c = jsonobject.getString("title");
            d = jsonobject.getString("body");
            e = jsonobject.getString("image_url");
            a = Bitmap.createBitmap(500, 500, android.graphics.Bitmap.Config.ARGB_8888);
            f = jsonobject.getString("cta");
            g = jsonobject.getString("cta_url");
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
        Matcher matcher = k.matcher(s);
        if (matcher.find())
        {
            s = matcher.replaceFirst((new StringBuilder()).append(s1).append("$1").toString());
        }
        return s;
    }

    public final JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("campaign_id", b);
            jsonobject.put("message_id", i);
            jsonobject.put("message_type", "inapp");
            jsonobject.put("message_subtype", j);
        }
        catch (JSONException jsonexception)
        {
            Log.e("MixpanelAPI.InAppNotif", "Impossible JSON Exception", jsonexception);
            return jsonobject;
        }
        return jsonobject;
    }

    public final Type b()
    {
        if (Type.b.toString().equals(j))
        {
            return Type.b;
        }
        if (Type.c.toString().equals(j))
        {
            return Type.c;
        } else
        {
            return Type.a;
        }
    }

    public final String c()
    {
        return a(e, "@2x");
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int l)
    {
        parcel.writeString(h.toString());
        parcel.writeInt(b);
        parcel.writeInt(i);
        parcel.writeString(j);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeString(e);
        parcel.writeString(f);
        parcel.writeString(g);
        parcel.writeParcelable(a, l);
    }


    private class Type extends Enum
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
            a = new Type("UNKNOWN") {

                public final String toString()
                {
                    return "*unknown_type*";
                }

            };
            b = new Type("MINI") {

                public final String toString()
                {
                    return "mini";
                }

            };
            c = new Type("TAKEOVER") {

                public final String toString()
                {
                    return "takeover";
                }

            };
            d = (new Type[] {
                a, b, c
            });
        }

        private Type(String s, int l)
        {
            super(s, l);
        }

        Type(String s, int l, byte byte0)
        {
            this(s, l);
        }
    }

}
