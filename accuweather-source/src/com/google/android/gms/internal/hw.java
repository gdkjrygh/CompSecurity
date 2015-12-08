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
//            hx, hy

public final class hw
    implements SafeParcelable, hz.b
{
    public static final class a
        implements SafeParcelable
    {

        public static final hy CREATOR = new hy();
        final String GW;
        final int GX;
        final int versionCode;

        public int describeContents()
        {
            hy hy1 = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            hy hy1 = CREATOR;
            hy.a(this, parcel, i);
        }


        a(int i, String s, int j)
        {
            versionCode = i;
            GW = s;
            GX = j;
        }

        a(String s, int i)
        {
            versionCode = 1;
            GW = s;
            GX = i;
        }
    }


    public static final hx CREATOR = new hx();
    private final HashMap GT;
    private final HashMap GU;
    private final ArrayList GV;
    private final int xJ;

    public hw()
    {
        xJ = 1;
        GT = new HashMap();
        GU = new HashMap();
        GV = null;
    }

    hw(int i, ArrayList arraylist)
    {
        xJ = i;
        GT = new HashMap();
        GU = new HashMap();
        GV = null;
        a(arraylist);
    }

    private void a(ArrayList arraylist)
    {
        a a1;
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); f(a1.GW, a1.GX))
        {
            a1 = (a)arraylist.next();
        }

    }

    public String a(Integer integer)
    {
        String s = (String)GU.get(integer);
        integer = s;
        if (s == null)
        {
            integer = s;
            if (GT.containsKey("gms_unknown"))
            {
                integer = "gms_unknown";
            }
        }
        return integer;
    }

    public int describeContents()
    {
        hx hx1 = CREATOR;
        return 0;
    }

    public hw f(String s, int i)
    {
        GT.put(s, Integer.valueOf(i));
        GU.put(Integer.valueOf(i), s);
        return this;
    }

    public int fA()
    {
        return 0;
    }

    ArrayList fy()
    {
        ArrayList arraylist = new ArrayList();
        String s;
        for (Iterator iterator = GT.keySet().iterator(); iterator.hasNext(); arraylist.add(new a(s, ((Integer)GT.get(s)).intValue())))
        {
            s = (String)iterator.next();
        }

        return arraylist;
    }

    public int fz()
    {
        return 7;
    }

    public Object g(Object obj)
    {
        return a((Integer)obj);
    }

    int getVersionCode()
    {
        return xJ;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        hx hx1 = CREATOR;
        hx.a(this, parcel, i);
    }

}
