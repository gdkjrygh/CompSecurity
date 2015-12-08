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
//            ge, fq, gf, gc

public class gd
    implements SafeParcelable
{
    public static class a
        implements SafeParcelable
    {

        public static final gf CREATOR = new gf();
        final ArrayList El;
        final String className;
        final int versionCode;

        private static ArrayList b(HashMap hashmap)
        {
            if (hashmap == null)
            {
                return null;
            }
            ArrayList arraylist = new ArrayList();
            String s;
            for (Iterator iterator = hashmap.keySet().iterator(); iterator.hasNext(); arraylist.add(new b(s, (ga.a)hashmap.get(s))))
            {
                s = (String)iterator.next();
            }

            return arraylist;
        }

        public int describeContents()
        {
            gf gf1 = CREATOR;
            return 0;
        }

        HashMap fp()
        {
            HashMap hashmap = new HashMap();
            int j = El.size();
            for (int i = 0; i < j; i++)
            {
                b b1 = (b)El.get(i);
                hashmap.put(b1.eM, b1.Em);
            }

            return hashmap;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            gf gf1 = CREATOR;
            gf.a(this, parcel, i);
        }


        a(int i, String s, ArrayList arraylist)
        {
            versionCode = i;
            className = s;
            El = arraylist;
        }

        a(String s, HashMap hashmap)
        {
            versionCode = 1;
            className = s;
            El = b(hashmap);
        }
    }

    public static class b
        implements SafeParcelable
    {

        public static final gc CREATOR = new gc();
        final ga.a Em;
        final String eM;
        final int versionCode;

        public int describeContents()
        {
            gc gc1 = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            gc gc1 = CREATOR;
            gc.a(this, parcel, i);
        }


        b(int i, String s, ga.a a1)
        {
            versionCode = i;
            eM = s;
            Em = a1;
        }

        b(String s, ga.a a1)
        {
            versionCode = 1;
            eM = s;
            Em = a1;
        }
    }


    public static final ge CREATOR = new ge();
    private final HashMap Ei;
    private final ArrayList Ej;
    private final String Ek;
    private final int xH;

    gd(int i, ArrayList arraylist, String s)
    {
        xH = i;
        Ej = null;
        Ei = b(arraylist);
        Ek = (String)fq.f(s);
        fl();
    }

    public gd(Class class1)
    {
        xH = 1;
        Ej = null;
        Ei = new HashMap();
        Ek = class1.getCanonicalName();
    }

    private static HashMap b(ArrayList arraylist)
    {
        HashMap hashmap = new HashMap();
        int j = arraylist.size();
        for (int i = 0; i < j; i++)
        {
            a a1 = (a)arraylist.get(i);
            hashmap.put(a1.className, a1.fp());
        }

        return hashmap;
    }

    public void a(Class class1, HashMap hashmap)
    {
        Ei.put(class1.getCanonicalName(), hashmap);
    }

    public HashMap au(String s)
    {
        return (HashMap)Ei.get(s);
    }

    public boolean b(Class class1)
    {
        return Ei.containsKey(class1.getCanonicalName());
    }

    public int describeContents()
    {
        ge ge1 = CREATOR;
        return 0;
    }

    public void fl()
    {
        for (Iterator iterator = Ei.keySet().iterator(); iterator.hasNext();)
        {
            Object obj = (String)iterator.next();
            obj = (HashMap)Ei.get(obj);
            Iterator iterator1 = ((HashMap) (obj)).keySet().iterator();
            while (iterator1.hasNext()) 
            {
                ((ga.a)((HashMap) (obj)).get((String)iterator1.next())).a(this);
            }
        }

    }

    public void fm()
    {
        String s;
        HashMap hashmap1;
        for (Iterator iterator = Ei.keySet().iterator(); iterator.hasNext(); Ei.put(s, hashmap1))
        {
            s = (String)iterator.next();
            HashMap hashmap = (HashMap)Ei.get(s);
            hashmap1 = new HashMap();
            String s1;
            for (Iterator iterator1 = hashmap.keySet().iterator(); iterator1.hasNext(); hashmap1.put(s1, ((ga.a)hashmap.get(s1)).fb()))
            {
                s1 = (String)iterator1.next();
            }

        }

    }

    ArrayList fn()
    {
        ArrayList arraylist = new ArrayList();
        String s;
        for (Iterator iterator = Ei.keySet().iterator(); iterator.hasNext(); arraylist.add(new a(s, (HashMap)Ei.get(s))))
        {
            s = (String)iterator.next();
        }

        return arraylist;
    }

    public String fo()
    {
        return Ek;
    }

    int getVersionCode()
    {
        return xH;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (Iterator iterator = Ei.keySet().iterator(); iterator.hasNext();)
        {
            Object obj = (String)iterator.next();
            stringbuilder.append(((String) (obj))).append(":\n");
            obj = (HashMap)Ei.get(obj);
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
        ge ge1 = CREATOR;
        ge.a(this, parcel, i);
    }

}
