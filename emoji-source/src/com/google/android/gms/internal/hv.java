// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            hw, hx

public final class hv
    implements SafeParcelable, hy.b
{
    public static final class a
        implements SafeParcelable
    {

        public static final hx CREATOR = new hx();
        final String GZ;
        final int Ha;
        final int versionCode;

        public int describeContents()
        {
            hx hx1 = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            hx hx1 = CREATOR;
            hx.a(this, parcel, i);
        }


        a(int i, String s, int j)
        {
            versionCode = i;
            GZ = s;
            Ha = j;
        }

        a(String s, int i)
        {
            versionCode = 1;
            GZ = s;
            Ha = i;
        }
    }


    public static final hw CREATOR = new hw();
    private final HashMap GW;
    private final HashMap GX;
    private final ArrayList GY;
    private final int xM;

    public hv()
    {
        xM = 1;
        GW = new HashMap();
        GX = new HashMap();
        GY = null;
    }

    hv(int i, ArrayList arraylist)
    {
        xM = i;
        GW = new HashMap();
        GX = new HashMap();
        GY = null;
        a(arraylist);
    }

    private void a(ArrayList arraylist)
    {
        a a1;
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); f(a1.GZ, a1.Ha))
        {
            a1 = (a)arraylist.next();
        }

    }

    public String a(Integer integer)
    {
        String s = (String)GX.get(integer);
        integer = s;
        if (s == null)
        {
            integer = s;
            if (GW.containsKey("gms_unknown"))
            {
                integer = "gms_unknown";
            }
        }
        return integer;
    }

    public int describeContents()
    {
        hw hw1 = CREATOR;
        return 0;
    }

    public hv f(String s, int i)
    {
        GW.put(s, Integer.valueOf(i));
        GX.put(Integer.valueOf(i), s);
        return this;
    }

    ArrayList fD()
    {
        ArrayList arraylist = new ArrayList();
        String s;
        for (Iterator iterator = GW.keySet().iterator(); iterator.hasNext(); arraylist.add(new a(s, ((Integer)GW.get(s)).intValue())))
        {
            s = (String)iterator.next();
        }

        return arraylist;
    }

    public int fE()
    {
        return 7;
    }

    public int fF()
    {
        return 0;
    }

    public Object g(Object obj)
    {
        return a((Integer)obj);
    }

    int getVersionCode()
    {
        return xM;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        hw hw1 = CREATOR;
        hw.a(this, parcel, i);
    }

}
