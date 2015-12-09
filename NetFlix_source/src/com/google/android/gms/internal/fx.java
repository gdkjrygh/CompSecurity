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
//            fy, fz

public final class fx
    implements SafeParcelable, ga.b
{
    public static final class a
        implements SafeParcelable
    {

        public static final fz CREATOR = new fz();
        final String DW;
        final int DX;
        final int versionCode;

        public int describeContents()
        {
            fz fz1 = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            fz fz1 = CREATOR;
            fz.a(this, parcel, i);
        }


        a(int i, String s, int j)
        {
            versionCode = i;
            DW = s;
            DX = j;
        }

        a(String s, int i)
        {
            versionCode = 1;
            DW = s;
            DX = i;
        }
    }


    public static final fy CREATOR = new fy();
    private final HashMap DT;
    private final HashMap DU;
    private final ArrayList DV;
    private final int xH;

    public fx()
    {
        xH = 1;
        DT = new HashMap();
        DU = new HashMap();
        DV = null;
    }

    fx(int i, ArrayList arraylist)
    {
        xH = i;
        DT = new HashMap();
        DU = new HashMap();
        DV = null;
        a(arraylist);
    }

    private void a(ArrayList arraylist)
    {
        a a1;
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); f(a1.DW, a1.DX))
        {
            a1 = (a)arraylist.next();
        }

    }

    public String a(Integer integer)
    {
        String s = (String)DU.get(integer);
        integer = s;
        if (s == null)
        {
            integer = s;
            if (DT.containsKey("gms_unknown"))
            {
                integer = "gms_unknown";
            }
        }
        return integer;
    }

    public int describeContents()
    {
        fy fy1 = CREATOR;
        return 0;
    }

    ArrayList eV()
    {
        ArrayList arraylist = new ArrayList();
        String s;
        for (Iterator iterator = DT.keySet().iterator(); iterator.hasNext(); arraylist.add(new a(s, ((Integer)DT.get(s)).intValue())))
        {
            s = (String)iterator.next();
        }

        return arraylist;
    }

    public int eW()
    {
        return 7;
    }

    public int eX()
    {
        return 0;
    }

    public fx f(String s, int i)
    {
        DT.put(s, Integer.valueOf(i));
        DU.put(Integer.valueOf(i), s);
        return this;
    }

    public Object g(Object obj)
    {
        return a((Integer)obj);
    }

    int getVersionCode()
    {
        return xH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        fy fy1 = CREATOR;
        fy.a(this, parcel, i);
    }

}
