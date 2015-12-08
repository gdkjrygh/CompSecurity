// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.photogrid.release:
//            qy

public class StickerInfo
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new qy();
    public int a;
    public String b;
    public String c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public String i;
    public HashMap j;
    public String k[];
    public int l;
    public String m;
    public String n;
    public int o;
    public long p;

    public StickerInfo()
    {
        a = 0xffffff;
        e = false;
        j = new HashMap();
    }

    public StickerInfo(String s, String s1, String s2, int i1, int j1)
    {
        a = 0xffffff;
        e = false;
        j = new HashMap();
        b = s;
        c = s1;
        a = i1;
        i = s2;
        d = j1;
        e = true;
        f = true;
        g = false;
    }

    public StickerInfo(JSONObject jsonobject)
    {
        boolean flag;
        boolean flag2 = true;
        flag = false;
        super();
        a = 0xffffff;
        e = false;
        j = new HashMap();
        b = jsonobject.optString("packageName");
        l = jsonobject.optInt("id");
        h = jsonobject.optInt("version", -1);
        Object obj = jsonobject.optString("backgroundColor");
        JSONObject jsonobject2;
        int i1;
        boolean flag1;
        try
        {
            a = Color.parseColor(((String) (obj)));
        }
        catch (Exception exception)
        {
            a = 0xffffff;
        }
        i = jsonobject.optString("packageName");
        if (jsonobject.optInt("isNew", 0) > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        g = flag1;
        if (jsonobject.optInt("isLocal", 0) > 0)
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        f = flag1;
        m = jsonobject.optString("logo");
        n = jsonobject.optString("zip");
        o = jsonobject.optInt("order", -1);
        p = jsonobject.optLong("createTime", -1L);
        obj = jsonobject.optString("displayName");
        obj = new JSONArray(((String) (obj)));
        i1 = 0;
_L1:
        if (i1 >= ((JSONArray) (obj)).length())
        {
            break MISSING_BLOCK_LABEL_278;
        }
        jsonobject2 = ((JSONArray) (obj)).optJSONObject(i1);
        if (jsonobject2 == null)
        {
            break MISSING_BLOCK_LABEL_242;
        }
        if (!TextUtils.isEmpty(jsonobject2.optString("lang")))
        {
            j.put(jsonobject2.optString("lang"), jsonobject2.optString("name"));
        }
        i1++;
          goto _L1
        JSONException jsonexception;
        jsonexception;
        jsonexception.printStackTrace();
        jsonobject = jsonobject.optString("elements");
        jsonobject = new JSONArray(jsonobject);
        if (jsonobject.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_363;
        }
        k = new String[jsonobject.length()];
        int j1 = ((flag) ? 1 : 0);
_L2:
        JSONObject jsonobject1;
        if (j1 >= jsonobject.length())
        {
            break MISSING_BLOCK_LABEL_363;
        }
        jsonobject1 = jsonobject.optJSONObject(j1);
        if (jsonobject1 == null)
        {
            break MISSING_BLOCK_LABEL_349;
        }
        k[j1] = jsonobject1.optString("name");
        j1++;
          goto _L2
        jsonobject;
        jsonobject.printStackTrace();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        boolean flag = true;
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeInt(a);
        parcel.writeInt(d);
        if (e)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
        if (f)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
        if (g)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
        parcel.writeInt(h);
        parcel.writeString(i);
        parcel.writeMap(j);
        parcel.writeString(m);
        parcel.writeString(n);
        parcel.writeInt(o);
        parcel.writeLong(p);
    }

}
