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
//            ia, gt

public class fe
    implements SafeParcelable
{

    public static final ia a = new ia();
    private final int b;
    private final HashMap c;
    private final ArrayList d = null;
    private final String e;

    fe(int i, ArrayList arraylist, String s)
    {
        b = i;
        c = a(arraylist);
        e = (String)gt.a(s);
        d();
    }

    private static HashMap a(ArrayList arraylist)
    {
        HashMap hashmap = new HashMap();
        int j = arraylist.size();
        for (int i = 0; i < j; i++)
        {
            a a1 = (a)arraylist.get(i);
            hashmap.put(a1.c, a1.a());
        }

        return hashmap;
    }

    private void d()
    {
        for (Iterator iterator = c.keySet().iterator(); iterator.hasNext();)
        {
            Object obj = (String)iterator.next();
            obj = (HashMap)c.get(obj);
            Iterator iterator1 = ((HashMap) (obj)).keySet().iterator();
            while (iterator1.hasNext()) 
            {
                ((fb.a)((HashMap) (obj)).get((String)iterator1.next())).a(this);
            }
        }

    }

    final int a()
    {
        return b;
    }

    public final HashMap a(String s)
    {
        return (HashMap)c.get(s);
    }

    final ArrayList b()
    {
        ArrayList arraylist = new ArrayList();
        String s;
        for (Iterator iterator = c.keySet().iterator(); iterator.hasNext(); arraylist.add(new a(s, (HashMap)c.get(s))))
        {
            s = (String)iterator.next();
        }

        return arraylist;
    }

    public final String c()
    {
        return e;
    }

    public int describeContents()
    {
        ia ia1 = a;
        return 0;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (Iterator iterator = c.keySet().iterator(); iterator.hasNext();)
        {
            Object obj = (String)iterator.next();
            stringbuilder.append(((String) (obj))).append(":\n");
            obj = (HashMap)c.get(obj);
            Iterator iterator1 = ((HashMap) (obj)).keySet().iterator();
            while (iterator1.hasNext()) 
            {
                String s = (String)iterator1.next();
                stringbuilder.append("  ").append(s).append(": ");
                stringbuilder.append(((HashMap) (obj)).get(s));
            }
        }

        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ia ia1 = a;
        ia.a(this, parcel);
    }


    private class a
        implements SafeParcelable
    {

        public static final ib a = new ib();
        final int b;
        final String c;
        final ArrayList d;

        private static ArrayList a(HashMap hashmap)
        {
            if (hashmap == null)
            {
                return null;
            }
            ArrayList arraylist = new ArrayList();
            String s;
            for (Iterator iterator = hashmap.keySet().iterator(); iterator.hasNext(); arraylist.add(new b(s, (fb.a)hashmap.get(s))))
            {
                s = (String)iterator.next();
            }

            return arraylist;
        }

        final HashMap a()
        {
            HashMap hashmap = new HashMap();
            int j = d.size();
            for (int i = 0; i < j; i++)
            {
                b b1 = (b)d.get(i);
                hashmap.put(b1.c, b1.d);
            }

            return hashmap;
        }

        public int describeContents()
        {
            ib ib1 = a;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            ib ib1 = a;
            ib.a(this, parcel);
        }


        a(int i, String s, ArrayList arraylist)
        {
            b = i;
            c = s;
            d = arraylist;
        }

        a(String s, HashMap hashmap)
        {
            b = 1;
            c = s;
            d = a(hashmap);
        }

        private class b
            implements SafeParcelable
        {

            public static final hy a = new hy();
            final int b;
            final String c;
            final fb.a d;

            public int describeContents()
            {
                hy hy1 = a;
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i)
            {
                hy hy1 = a;
                hy.a(this, parcel, i);
            }


            b(int i, String s, fb.a a1)
            {
                b = i;
                c = s;
                d = a1;
            }

            b(String s, fb.a a1)
            {
                b = 1;
                c = s;
                d = a1;
            }
        }

    }

}
