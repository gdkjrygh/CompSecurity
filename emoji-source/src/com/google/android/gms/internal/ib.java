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
//            ic, hm, id, ia

public class ib
    implements SafeParcelable
{
    public static class a
        implements SafeParcelable
    {

        public static final id CREATOR = new id();
        final ArrayList Ho;
        final String className;
        final int versionCode;

        private static ArrayList a(HashMap hashmap)
        {
            if (hashmap == null)
            {
                return null;
            }
            ArrayList arraylist = new ArrayList();
            String s;
            for (Iterator iterator = hashmap.keySet().iterator(); iterator.hasNext(); arraylist.add(new b(s, (hy.a)hashmap.get(s))))
            {
                s = (String)iterator.next();
            }

            return arraylist;
        }

        public int describeContents()
        {
            id id1 = CREATOR;
            return 0;
        }

        HashMap fX()
        {
            HashMap hashmap = new HashMap();
            int j = Ho.size();
            for (int i = 0; i < j; i++)
            {
                b b1 = (b)Ho.get(i);
                hashmap.put(b1.eM, b1.Hp);
            }

            return hashmap;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            id id1 = CREATOR;
            id.a(this, parcel, i);
        }


        a(int i, String s, ArrayList arraylist)
        {
            versionCode = i;
            className = s;
            Ho = arraylist;
        }

        a(String s, HashMap hashmap)
        {
            versionCode = 1;
            className = s;
            Ho = a(hashmap);
        }
    }

    public static class b
        implements SafeParcelable
    {

        public static final ia CREATOR = new ia();
        final hy.a Hp;
        final String eM;
        final int versionCode;

        public int describeContents()
        {
            ia ia1 = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            ia ia1 = CREATOR;
            ia.a(this, parcel, i);
        }


        b(int i, String s, hy.a a1)
        {
            versionCode = i;
            eM = s;
            Hp = a1;
        }

        b(String s, hy.a a1)
        {
            versionCode = 1;
            eM = s;
            Hp = a1;
        }
    }


    public static final ic CREATOR = new ic();
    private final HashMap Hl;
    private final ArrayList Hm;
    private final String Hn;
    private final int xM;

    ib(int i, ArrayList arraylist, String s)
    {
        xM = i;
        Hm = null;
        Hl = b(arraylist);
        Hn = (String)hm.f(s);
        fT();
    }

    public ib(Class class1)
    {
        xM = 1;
        Hm = null;
        Hl = new HashMap();
        Hn = class1.getCanonicalName();
    }

    private static HashMap b(ArrayList arraylist)
    {
        HashMap hashmap = new HashMap();
        int j = arraylist.size();
        for (int i = 0; i < j; i++)
        {
            a a1 = (a)arraylist.get(i);
            hashmap.put(a1.className, a1.fX());
        }

        return hashmap;
    }

    public void a(Class class1, HashMap hashmap)
    {
        Hl.put(class1.getCanonicalName(), hashmap);
    }

    public HashMap aJ(String s)
    {
        return (HashMap)Hl.get(s);
    }

    public boolean b(Class class1)
    {
        return Hl.containsKey(class1.getCanonicalName());
    }

    public int describeContents()
    {
        ic ic1 = CREATOR;
        return 0;
    }

    public void fT()
    {
        for (Iterator iterator = Hl.keySet().iterator(); iterator.hasNext();)
        {
            Object obj = (String)iterator.next();
            obj = (HashMap)Hl.get(obj);
            Iterator iterator1 = ((HashMap) (obj)).keySet().iterator();
            while (iterator1.hasNext()) 
            {
                ((hy.a)((HashMap) (obj)).get((String)iterator1.next())).a(this);
            }
        }

    }

    public void fU()
    {
        String s;
        HashMap hashmap1;
        for (Iterator iterator = Hl.keySet().iterator(); iterator.hasNext(); Hl.put(s, hashmap1))
        {
            s = (String)iterator.next();
            HashMap hashmap = (HashMap)Hl.get(s);
            hashmap1 = new HashMap();
            String s1;
            for (Iterator iterator1 = hashmap.keySet().iterator(); iterator1.hasNext(); hashmap1.put(s1, ((hy.a)hashmap.get(s1)).fJ()))
            {
                s1 = (String)iterator1.next();
            }

        }

    }

    ArrayList fV()
    {
        ArrayList arraylist = new ArrayList();
        String s;
        for (Iterator iterator = Hl.keySet().iterator(); iterator.hasNext(); arraylist.add(new a(s, (HashMap)Hl.get(s))))
        {
            s = (String)iterator.next();
        }

        return arraylist;
    }

    public String fW()
    {
        return Hn;
    }

    int getVersionCode()
    {
        return xM;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (Iterator iterator = Hl.keySet().iterator(); iterator.hasNext();)
        {
            Object obj = (String)iterator.next();
            stringbuilder.append(((String) (obj))).append(":\n");
            obj = (HashMap)Hl.get(obj);
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
        ic ic1 = CREATOR;
        ic.a(this, parcel, i);
    }

}
