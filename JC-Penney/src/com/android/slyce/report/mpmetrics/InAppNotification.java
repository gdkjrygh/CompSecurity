// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.android.slyce.report.mpmetrics:
//            w, j, x

public class InAppNotification
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new w();
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
        Log.e("MixpanelAPI.InAppNotification", "Error reading JSON when creating InAppNotification from Parcel");
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
            throw new j("Notification JSON was unexpected or bad", jsonobject);
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

    JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("campaign_id", b());
            jsonobject.put("message_id", c());
            jsonobject.put("message_type", "inapp");
            jsonobject.put("message_subtype", e);
        }
        catch (JSONException jsonexception)
        {
            Log.e("MixpanelAPI.InAppNotification", "Impossible JSON Exception", jsonexception);
            return jsonobject;
        }
        return jsonobject;
    }

    void a(Bitmap bitmap)
    {
        a = bitmap;
    }

    public int b()
    {
        return c;
    }

    public int c()
    {
        return d;
    }

    public x d()
    {
        if (x.b.toString().equals(e))
        {
            return x.b;
        }
        if (x.c.toString().equals(e))
        {
            return x.c;
        } else
        {
            return x.a;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return f;
    }

    public String f()
    {
        return g;
    }

    public String g()
    {
        return a(h, "@2x");
    }

    public String h()
    {
        return a(h, "@4x");
    }

    public String i()
    {
        return i;
    }

    public String j()
    {
        return j;
    }

    public Bitmap k()
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
