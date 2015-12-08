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
//            kw, jx, kx, ku

public class kv
    implements SafeParcelable
{
    public static class a
        implements SafeParcelable
    {

        public static final kx CREATOR = new kx();
        final ArrayList NY;
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
            for (Iterator iterator = hashmap.keySet().iterator(); iterator.hasNext(); arraylist.add(new b(s, (kr.a)hashmap.get(s))))
            {
                s = (String)iterator.next();
            }

            return arraylist;
        }

        public int describeContents()
        {
            kx kx1 = CREATOR;
            return 0;
        }

        HashMap ib()
        {
            HashMap hashmap = new HashMap();
            int j = NY.size();
            for (int i = 0; i < j; i++)
            {
                b b1 = (b)NY.get(i);
                hashmap.put(b1.fv, b1.NZ);
            }

            return hashmap;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            kx kx1 = CREATOR;
            kx.a(this, parcel, i);
        }


        a(int i, String s, ArrayList arraylist)
        {
            versionCode = i;
            className = s;
            NY = arraylist;
        }

        a(String s, HashMap hashmap)
        {
            versionCode = 1;
            className = s;
            NY = a(hashmap);
        }
    }

    public static class b
        implements SafeParcelable
    {

        public static final ku CREATOR = new ku();
        final kr.a NZ;
        final String fv;
        final int versionCode;

        public int describeContents()
        {
            ku ku1 = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            ku ku1 = CREATOR;
            ku.a(this, parcel, i);
        }


        b(int i, String s, kr.a a1)
        {
            versionCode = i;
            fv = s;
            NZ = a1;
        }

        b(String s, kr.a a1)
        {
            versionCode = 1;
            fv = s;
            NZ = a1;
        }
    }


    public static final kw CREATOR = new kw();
    private final int CK;
    private final HashMap NV;
    private final ArrayList NW;
    private final String NX;

    kv(int i, ArrayList arraylist, String s)
    {
        CK = i;
        NW = null;
        NV = c(arraylist);
        NX = (String)jx.i(s);
        hX();
    }

    public kv(Class class1)
    {
        CK = 1;
        NW = null;
        NV = new HashMap();
        NX = class1.getCanonicalName();
    }

    private static HashMap c(ArrayList arraylist)
    {
        HashMap hashmap = new HashMap();
        int j = arraylist.size();
        for (int i = 0; i < j; i++)
        {
            a a1 = (a)arraylist.get(i);
            hashmap.put(a1.className, a1.ib());
        }

        return hashmap;
    }

    public void a(Class class1, HashMap hashmap)
    {
        NV.put(class1.getCanonicalName(), hashmap);
    }

    public boolean b(Class class1)
    {
        return NV.containsKey(class1.getCanonicalName());
    }

    public HashMap bg(String s)
    {
        return (HashMap)NV.get(s);
    }

    public int describeContents()
    {
        kw kw1 = CREATOR;
        return 0;
    }

    int getVersionCode()
    {
        return CK;
    }

    public void hX()
    {
        for (Iterator iterator = NV.keySet().iterator(); iterator.hasNext();)
        {
            Object obj = (String)iterator.next();
            obj = (HashMap)NV.get(obj);
            Iterator iterator1 = ((HashMap) (obj)).keySet().iterator();
            while (iterator1.hasNext()) 
            {
                ((kr.a)((HashMap) (obj)).get((String)iterator1.next())).a(this);
            }
        }

    }

    public void hY()
    {
        String s;
        HashMap hashmap1;
        for (Iterator iterator = NV.keySet().iterator(); iterator.hasNext(); NV.put(s, hashmap1))
        {
            s = (String)iterator.next();
            HashMap hashmap = (HashMap)NV.get(s);
            hashmap1 = new HashMap();
            String s1;
            for (Iterator iterator1 = hashmap.keySet().iterator(); iterator1.hasNext(); hashmap1.put(s1, ((kr.a)hashmap.get(s1)).hN()))
            {
                s1 = (String)iterator1.next();
            }

        }

    }

    ArrayList hZ()
    {
        ArrayList arraylist = new ArrayList();
        String s;
        for (Iterator iterator = NV.keySet().iterator(); iterator.hasNext(); arraylist.add(new a(s, (HashMap)NV.get(s))))
        {
            s = (String)iterator.next();
        }

        return arraylist;
    }

    public String ia()
    {
        return NX;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (Iterator iterator = NV.keySet().iterator(); iterator.hasNext();)
        {
            Object obj = (String)iterator.next();
            stringbuilder.append(((String) (obj))).append(":\n");
            obj = (HashMap)NV.get(obj);
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
        kw kw1 = CREATOR;
        kw.a(this, parcel, i);
    }

}
