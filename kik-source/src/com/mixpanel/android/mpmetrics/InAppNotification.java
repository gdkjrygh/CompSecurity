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
//            p, e, q, r, 
//            s

public class InAppNotification
    implements Parcelable
{
    public static class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/mixpanel/android/mpmetrics/InAppNotification$a, s1);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new q("UNKNOWN");
            b = new r("MINI");
            c = new s("TAKEOVER");
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s1, int l)
        {
            super(s1, l);
        }

        a(String s1, int l, byte byte0)
        {
            this(s1, l);
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new p();
    private static final Pattern k = Pattern.compile("(\\.[^./]+$)");
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
        Log.e("MixpanelAPI InAppNotification", "Error reading JSON when creating InAppNotification from Parcel");
        if (true) goto _L2; else goto _L1
_L1:
    }

    InAppNotification(JSONObject jsonobject)
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
            throw new e("Notification JSON was unexpected or bad", jsonobject);
        }
    }

    private static String a(String s, String s1)
    {
        Matcher matcher = k.matcher(s);
        if (matcher.find())
        {
            s = matcher.replaceFirst((new StringBuilder()).append(s1).append("$1").toString());
        }
        return s;
    }

    final JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("campaign_id", c);
            jsonobject.put("message_id", d);
            jsonobject.put("message_type", "inapp");
            jsonobject.put("message_subtype", e);
        }
        catch (JSONException jsonexception)
        {
            Log.e("MixpanelAPI InAppNotification", "Impossible JSON Exception", jsonexception);
            return jsonobject;
        }
        return jsonobject;
    }

    final void a(Bitmap bitmap)
    {
        a = bitmap;
    }

    public final int b()
    {
        return c;
    }

    public final a c()
    {
        if (a.b.toString().equals(e))
        {
            return a.b;
        }
        if (a.c.toString().equals(e))
        {
            return a.c;
        } else
        {
            return a.a;
        }
    }

    public final String d()
    {
        return f;
    }

    public int describeContents()
    {
        return 0;
    }

    public final String e()
    {
        return g;
    }

    public final String f()
    {
        return a(h, "@2x");
    }

    public final String g()
    {
        return a(h, "@4x");
    }

    public final String h()
    {
        return i;
    }

    public final String i()
    {
        return j;
    }

    public final Bitmap j()
    {
        return a;
    }

    public void writeToParcel(Parcel parcel, int l)
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
        parcel.writeParcelable(a, l);
    }

}
