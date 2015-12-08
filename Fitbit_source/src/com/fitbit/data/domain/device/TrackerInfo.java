// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.device;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.fitbit.synclair.config.SynclairConfigType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain.device:
//            TrackerType

public class TrackerInfo
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public TrackerInfo a(Parcel parcel)
        {
            return new TrackerInfo(parcel);
        }

        public TrackerInfo[] a(int i1)
        {
            return new TrackerInfo[i1];
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
    public static final String a = "###";
    private boolean b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private int m;
    private int n;

    public TrackerInfo()
    {
        b = false;
    }

    public TrackerInfo(Parcel parcel)
    {
        b = false;
        boolean aflag[] = new boolean[1];
        parcel.readBooleanArray(aflag);
        b = aflag[0];
        c = parcel.readString();
        e = parcel.readString();
        g = parcel.readString();
        m = parcel.readInt();
        n = parcel.readInt();
        f = parcel.readString();
        d = parcel.readString();
        h = parcel.readString();
        i = parcel.readString();
        j = parcel.readString();
        k = parcel.readString();
        l = parcel.readString();
    }

    private static int a(JSONArray jsonarray)
    {
        if (jsonarray != null && jsonarray.length() >= 3)
        {
            return Color.rgb(jsonarray.optInt(0), jsonarray.optInt(1), jsonarray.optInt(2));
        } else
        {
            return -1;
        }
    }

    private String a(TrackerType trackertype)
    {
        trackertype = trackertype.c();
        return (new StringBuilder()).append("###").append(trackertype).toString();
    }

    private JSONArray a(int i1)
        throws JSONException
    {
        return new JSONArray(String.format("[%d,%d,%d]", new Object[] {
            Integer.valueOf(Color.red(i1)), Integer.valueOf(Color.green(i1)), Integer.valueOf(Color.blue(i1))
        }));
    }

    public JSONObject a()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("bluetooth-supported", b());
        if (c() != null)
        {
            jsonobject.put("caption", c());
        }
        if (d() != null)
        {
            jsonobject.put("choose-tracker-image-url", i);
        }
        if (g() != null)
        {
            jsonobject.put("description-title", g());
        }
        if (h() != null)
        {
            jsonobject.put("description-body", h());
        }
        if (i() != null)
        {
            jsonobject.put("description-image-url", j);
        }
        if (j() != null)
        {
            jsonobject.put("image-url", k);
        }
        JSONArray jsonarray = new JSONArray();
        jsonarray.put(a(m));
        jsonarray.put(a(n));
        jsonobject.put("description-gradient", jsonarray);
        if (k() != null)
        {
            jsonobject.put("tracker-101-url", k());
        }
        return jsonobject;
    }

    public void a(JSONObject jsonobject, TrackerType trackertype)
        throws JSONException
    {
        String s = SynclairConfigType.c.a(trackertype);
        trackertype = a(trackertype);
        i = jsonobject.optString("choose-tracker-image-url");
        j = jsonobject.optString("description-image-url");
        k = jsonobject.optString("image-url");
        d = (new StringBuilder()).append(s).append(i).append(trackertype).toString();
        f = (new StringBuilder()).append(s).append(j).append(trackertype).toString();
        h = (new StringBuilder()).append(s).append(k).append(trackertype).toString();
        b = jsonobject.optBoolean("bluetooth-supported", false);
        c = jsonobject.optString("caption");
        e = jsonobject.optString("description-body");
        g = jsonobject.optString("description-title");
        trackertype = jsonobject.optJSONArray("description-gradient");
        m = a(trackertype.optJSONArray(0));
        n = a(trackertype.optJSONArray(1));
        l = jsonobject.optString("tracker-101-url");
    }

    public boolean b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public String d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public int e()
    {
        return m;
    }

    public int f()
    {
        return n;
    }

    public String g()
    {
        return g;
    }

    public String h()
    {
        return e;
    }

    public String i()
    {
        return f;
    }

    public String j()
    {
        return h;
    }

    public String k()
    {
        return l;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeBooleanArray(new boolean[] {
            b
        });
        parcel.writeString(c);
        parcel.writeString(e);
        parcel.writeString(g);
        parcel.writeInt(m);
        parcel.writeInt(n);
        parcel.writeString(f);
        parcel.writeString(d);
        parcel.writeString(h);
        parcel.writeString(i);
        parcel.writeString(j);
        parcel.writeString(k);
        parcel.writeString(l);
    }

}
