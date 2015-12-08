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
//            hv, ha

public final class ey
    implements SafeParcelable, hv
{

    public static final ha a = new ha();
    private final int b;
    private final HashMap c;
    private final HashMap d;
    private final ArrayList e;

    public ey()
    {
        b = 1;
        c = new HashMap();
        d = new HashMap();
        e = null;
    }

    ey(int i, ArrayList arraylist)
    {
        b = i;
        c = new HashMap();
        d = new HashMap();
        e = null;
        a(arraylist);
    }

    private void a(ArrayList arraylist)
    {
        a a1;
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); a(a1.c, a1.d))
        {
            a1 = (a)arraylist.next();
        }

    }

    final int a()
    {
        return b;
    }

    public final ey a(String s, int i)
    {
        c.put(s, Integer.valueOf(i));
        d.put(Integer.valueOf(i), s);
        return this;
    }

    public final Object a(Object obj)
    {
        obj = (Integer)obj;
        String s = (String)d.get(obj);
        obj = s;
        if (s == null)
        {
            obj = s;
            if (c.containsKey("gms_unknown"))
            {
                obj = "gms_unknown";
            }
        }
        return obj;
    }

    final ArrayList b()
    {
        ArrayList arraylist = new ArrayList();
        String s;
        for (Iterator iterator = c.keySet().iterator(); iterator.hasNext(); arraylist.add(new a(s, ((Integer)c.get(s)).intValue())))
        {
            s = (String)iterator.next();
        }

        return arraylist;
    }

    public final int describeContents()
    {
        ha ha1 = a;
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ha ha1 = a;
        ha.a(this, parcel);
    }


    private class a
        implements SafeParcelable
    {

        public static final hu a = new hu();
        final int b;
        final String c;
        final int d;

        public final int describeContents()
        {
            hu hu1 = a;
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            hu hu1 = a;
            hu.a(this, parcel);
        }


        a(int i, String s, int j)
        {
            b = i;
            c = s;
            d = j;
        }

        a(String s, int i)
        {
            b = 1;
            c = s;
            d = i;
        }
    }

}
