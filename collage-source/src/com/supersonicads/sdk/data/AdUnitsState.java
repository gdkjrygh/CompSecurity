// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.supersonicads.sdk.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class AdUnitsState
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private boolean a;
    private int b;
    private boolean c;
    private String d;
    private String e;
    private Map f;
    private boolean g;
    private boolean h;
    private String i;
    private String j;
    private Map k;

    public AdUnitsState()
    {
        m();
    }

    private AdUnitsState(Parcel parcel)
    {
        boolean flag1;
        flag1 = true;
        super();
        m();
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        b = parcel.readInt();
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        d = parcel.readString();
        e = parcel.readString();
        f = e(parcel.readString());
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
        if (parcel.readByte() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        try
        {
            h = flag;
            i = parcel.readString();
            j = parcel.readString();
            k = e(parcel.readString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            m();
        }
        return;
    }

    AdUnitsState(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    private Map e(String s)
    {
        HashMap hashmap = new HashMap();
        try
        {
            s = new JSONObject(s);
            String s1;
            for (Iterator iterator = s.keys(); iterator.hasNext(); hashmap.put(s1, s.getString(s1)))
            {
                s1 = (String)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return hashmap;
        }
        return hashmap;
    }

    private void m()
    {
        a = false;
        b = -1;
        g = true;
        h = false;
        c = false;
        j = "";
        i = "";
        e = "";
        d = "";
        f = new HashMap();
        k = new HashMap();
    }

    public void a(int i1)
    {
        b = i1;
    }

    public void a(String s)
    {
        d = s;
    }

    public void a(Map map)
    {
        f = map;
    }

    public void a(boolean flag)
    {
        c = flag;
    }

    public boolean a()
    {
        return c;
    }

    public String b()
    {
        return d;
    }

    public void b(String s)
    {
        e = s;
    }

    public void b(Map map)
    {
        k = map;
    }

    public void b(boolean flag)
    {
        h = flag;
    }

    public String c()
    {
        return e;
    }

    public void c(String s)
    {
        i = s;
    }

    public void c(boolean flag)
    {
        g = flag;
    }

    public Map d()
    {
        return f;
    }

    public void d(String s)
    {
        j = s;
    }

    public void d(boolean flag)
    {
        a = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean e()
    {
        return h;
    }

    public String f()
    {
        return i;
    }

    public String g()
    {
        return j;
    }

    public Map h()
    {
        return k;
    }

    public boolean i()
    {
        return g;
    }

    public boolean j()
    {
        return a;
    }

    public int k()
    {
        return b;
    }

    public void l()
    {
        b = -1;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        try
        {
            stringbuilder.append("shouldRestore:").append(a).append(", ");
            stringbuilder.append("displayedProduct:").append(b).append(", ");
            stringbuilder.append("RVInitSuccess:").append(c).append(", ");
            stringbuilder.append("RVAppKey").append(d).append(", ");
            stringbuilder.append("RVUserId").append(e).append(", ");
            stringbuilder.append("RVExtraParams").append(f).append(", ");
            stringbuilder.append("ISReportInit:").append(g).append(", ");
            stringbuilder.append("ISInitSuccess:").append(h).append(", ");
            stringbuilder.append("ISAppKey").append(i).append(", ");
            stringbuilder.append("ISUserId").append(j).append(", ");
            stringbuilder.append("ISExtraParams").append(k).append(", ");
        }
        catch (Throwable throwable) { }
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        boolean flag = true;
        if (a)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
        parcel.writeInt(b);
        if (c)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
        parcel.writeString(d);
        parcel.writeString(e);
        parcel.writeString((new JSONObject(f)).toString());
        if (g)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
        if (h)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        try
        {
            parcel.writeByte((byte)i1);
            parcel.writeString(i);
            parcel.writeString(j);
            parcel.writeString((new JSONObject(k)).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            return;
        }
    }


    /* member class not found */
    class _cls1 {}

}
