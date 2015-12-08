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
//            kp, kq

public final class ko
    implements SafeParcelable, kr.b
{
    public static final class a
        implements SafeParcelable
    {

        public static final kq CREATOR = new kq();
        final String NJ;
        final int NK;
        final int versionCode;

        public int describeContents()
        {
            kq kq1 = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            kq kq1 = CREATOR;
            kq.a(this, parcel, i);
        }


        a(int i, String s, int j)
        {
            versionCode = i;
            NJ = s;
            NK = j;
        }

        a(String s, int i)
        {
            versionCode = 1;
            NJ = s;
            NK = i;
        }
    }


    public static final kp CREATOR = new kp();
    private final int CK;
    private final HashMap NG;
    private final HashMap NH;
    private final ArrayList NI;

    public ko()
    {
        CK = 1;
        NG = new HashMap();
        NH = new HashMap();
        NI = null;
    }

    ko(int i, ArrayList arraylist)
    {
        CK = i;
        NG = new HashMap();
        NH = new HashMap();
        NI = null;
        b(arraylist);
    }

    private void b(ArrayList arraylist)
    {
        a a1;
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); h(a1.NJ, a1.NK))
        {
            a1 = (a)arraylist.next();
        }

    }

    public String a(Integer integer)
    {
        String s = (String)NH.get(integer);
        integer = s;
        if (s == null)
        {
            integer = s;
            if (NG.containsKey("gms_unknown"))
            {
                integer = "gms_unknown";
            }
        }
        return integer;
    }

    public Object convertBack(Object obj)
    {
        return a((Integer)obj);
    }

    public int describeContents()
    {
        kp kp1 = CREATOR;
        return 0;
    }

    int getVersionCode()
    {
        return CK;
    }

    public ko h(String s, int i)
    {
        NG.put(s, Integer.valueOf(i));
        NH.put(Integer.valueOf(i), s);
        return this;
    }

    ArrayList hH()
    {
        ArrayList arraylist = new ArrayList();
        String s;
        for (Iterator iterator = NG.keySet().iterator(); iterator.hasNext(); arraylist.add(new a(s, ((Integer)NG.get(s)).intValue())))
        {
            s = (String)iterator.next();
        }

        return arraylist;
    }

    public int hI()
    {
        return 7;
    }

    public int hJ()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        kp kp1 = CREATOR;
        kp.a(this, parcel, i);
    }

}
