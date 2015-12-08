// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            jn, jo, jl

public class jm
    implements SafeParcelable
{
    public static class a
        implements SafeParcelable
    {

        public static final jo CREATOR = new jo();
        final ArrayList ML;
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
            for (Iterator iterator = hashmap.keySet().iterator(); iterator.hasNext(); arraylist.add(new b(s, (ji.a)hashmap.get(s))))
            {
                s = (String)iterator.next();
            }

            return arraylist;
        }

        public int describeContents()
        {
            jo jo1 = CREATOR;
            return 0;
        }

        HashMap hw()
        {
            HashMap hashmap = new HashMap();
            int j = ML.size();
            for (int i = 0; i < j; i++)
            {
                b b1 = (b)ML.get(i);
                hashmap.put(b1.fv, b1.MM);
            }

            return hashmap;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            jo jo1 = CREATOR;
            jo.a(this, parcel, i);
        }


        a(int i, String s, ArrayList arraylist)
        {
            versionCode = i;
            className = s;
            ML = arraylist;
        }

        a(String s, HashMap hashmap)
        {
            versionCode = 1;
            className = s;
            ML = a(hashmap);
        }
    }

    public static class b
        implements SafeParcelable
    {

        public static final jl CREATOR = new jl();
        final ji.a MM;
        final String fv;
        final int versionCode;

        public int describeContents()
        {
            jl jl1 = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            jl jl1 = CREATOR;
            jl.a(this, parcel, i);
        }


        b(int i, String s, ji.a a1)
        {
            versionCode = i;
            fv = s;
            MM = a1;
        }

        b(String s, ji.a a1)
        {
            versionCode = 1;
            fv = s;
            MM = a1;
        }
    }


    public static final jn CREATOR = new jn();
    private final int BR;
    private final HashMap MI;
    private final ArrayList MJ;
    private final String MK;

    jm(int i, ArrayList arraylist, String s)
    {
        BR = i;
        MJ = null;
        MI = c(arraylist);
        MK = (String)o.i(s);
        hs();
    }

    public jm(Class class1)
    {
        BR = 1;
        MJ = null;
        MI = new HashMap();
        MK = class1.getCanonicalName();
    }

    private static HashMap c(ArrayList arraylist)
    {
        HashMap hashmap = new HashMap();
        int j = arraylist.size();
        for (int i = 0; i < j; i++)
        {
            a a1 = (a)arraylist.get(i);
            hashmap.put(a1.className, a1.hw());
        }

        return hashmap;
    }

    public void a(Class class1, HashMap hashmap)
    {
        MI.put(class1.getCanonicalName(), hashmap);
    }

    public boolean b(Class class1)
    {
        return MI.containsKey(class1.getCanonicalName());
    }

    public HashMap be(String s)
    {
        return (HashMap)MI.get(s);
    }

    public int describeContents()
    {
        jn jn1 = CREATOR;
        return 0;
    }

    int getVersionCode()
    {
        return BR;
    }

    public void hs()
    {
        for (Iterator iterator = MI.keySet().iterator(); iterator.hasNext();)
        {
            Object obj = (String)iterator.next();
            obj = (HashMap)MI.get(obj);
            Iterator iterator1 = ((HashMap) (obj)).keySet().iterator();
            while (iterator1.hasNext()) 
            {
                ((ji.a)((HashMap) (obj)).get((String)iterator1.next())).a(this);
            }
        }

    }

    public void ht()
    {
        String s;
        HashMap hashmap1;
        for (Iterator iterator = MI.keySet().iterator(); iterator.hasNext(); MI.put(s, hashmap1))
        {
            s = (String)iterator.next();
            HashMap hashmap = (HashMap)MI.get(s);
            hashmap1 = new HashMap();
            String s1;
            for (Iterator iterator1 = hashmap.keySet().iterator(); iterator1.hasNext(); hashmap1.put(s1, ((ji.a)hashmap.get(s1)).hi()))
            {
                s1 = (String)iterator1.next();
            }

        }

    }

    ArrayList hu()
    {
        ArrayList arraylist = new ArrayList();
        String s;
        for (Iterator iterator = MI.keySet().iterator(); iterator.hasNext(); arraylist.add(new a(s, (HashMap)MI.get(s))))
        {
            s = (String)iterator.next();
        }

        return arraylist;
    }

    public String hv()
    {
        return MK;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (Iterator iterator = MI.keySet().iterator(); iterator.hasNext();)
        {
            Object obj = (String)iterator.next();
            stringbuilder.append(((String) (obj))).append(":\n");
            obj = (HashMap)MI.get(obj);
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
        jn jn1 = CREATOR;
        jn.a(this, parcel, i);
    }

}
