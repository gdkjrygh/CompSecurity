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
//            du, dv

public final class dt
    implements SafeParcelable, dw.b
{
    public static final class a
        implements SafeParcelable
    {

        public static final dv CREATOR = new dv();
        final String lx;
        final int ly;
        final int versionCode;

        public int describeContents()
        {
            dv dv1 = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            dv dv1 = CREATOR;
            dv.a(this, parcel, i);
        }


        a(int i, String s, int j)
        {
            versionCode = i;
            lx = s;
            ly = j;
        }

        a(String s, int i)
        {
            versionCode = 1;
            lx = s;
            ly = i;
        }
    }


    public static final du CREATOR = new du();
    private final int iM;
    private final HashMap lu;
    private final HashMap lv;
    private final ArrayList lw;

    public dt()
    {
        iM = 1;
        lu = new HashMap();
        lv = new HashMap();
        lw = null;
    }

    dt(int i, ArrayList arraylist)
    {
        iM = i;
        lu = new HashMap();
        lv = new HashMap();
        lw = null;
        a(arraylist);
    }

    private void a(ArrayList arraylist)
    {
        a a1;
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); c(a1.lx, a1.ly))
        {
            a1 = (a)arraylist.next();
        }

    }

    public String a(Integer integer)
    {
        String s = (String)lv.get(integer);
        integer = s;
        if (s == null)
        {
            integer = s;
            if (lu.containsKey("gms_unknown"))
            {
                integer = "gms_unknown";
            }
        }
        return integer;
    }

    ArrayList bm()
    {
        ArrayList arraylist = new ArrayList();
        String s;
        for (Iterator iterator = lu.keySet().iterator(); iterator.hasNext(); arraylist.add(new a(s, ((Integer)lu.get(s)).intValue())))
        {
            s = (String)iterator.next();
        }

        return arraylist;
    }

    public int bn()
    {
        return 7;
    }

    public int bo()
    {
        return 0;
    }

    public dt c(String s, int i)
    {
        lu.put(s, Integer.valueOf(i));
        lv.put(Integer.valueOf(i), s);
        return this;
    }

    public int describeContents()
    {
        du du1 = CREATOR;
        return 0;
    }

    public Object f(Object obj)
    {
        return a((Integer)obj);
    }

    int getVersionCode()
    {
        return iM;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        du du1 = CREATOR;
        du.a(this, parcel, i);
    }

}
