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
//            id, hn, ie, ib

public class ic
    implements SafeParcelable
{
    public static class a
        implements SafeParcelable
    {

        public static final ie CREATOR = new ie();
        final ArrayList Hl;
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
            for (Iterator iterator = hashmap.keySet().iterator(); iterator.hasNext(); arraylist.add(new b(s, (hz.a)hashmap.get(s))))
            {
                s = (String)iterator.next();
            }

            return arraylist;
        }

        public int describeContents()
        {
            ie ie1 = CREATOR;
            return 0;
        }

        HashMap fS()
        {
            HashMap hashmap = new HashMap();
            int j = Hl.size();
            for (int i = 0; i < j; i++)
            {
                b b1 = (b)Hl.get(i);
                hashmap.put(b1.eM, b1.Hm);
            }

            return hashmap;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            ie ie1 = CREATOR;
            ie.a(this, parcel, i);
        }


        a(int i, String s, ArrayList arraylist)
        {
            versionCode = i;
            className = s;
            Hl = arraylist;
        }

        a(String s, HashMap hashmap)
        {
            versionCode = 1;
            className = s;
            Hl = a(hashmap);
        }
    }

    public static class b
        implements SafeParcelable
    {

        public static final ib CREATOR = new ib();
        final hz.a Hm;
        final String eM;
        final int versionCode;

        public int describeContents()
        {
            ib ib1 = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            ib ib1 = CREATOR;
            ib.a(this, parcel, i);
        }


        b(int i, String s, hz.a a1)
        {
            versionCode = i;
            eM = s;
            Hm = a1;
        }

        b(String s, hz.a a1)
        {
            versionCode = 1;
            eM = s;
            Hm = a1;
        }
    }


    public static final id CREATOR = new id();
    private final HashMap Hi;
    private final ArrayList Hj;
    private final String Hk;
    private final int xJ;

    ic(int i, ArrayList arraylist, String s)
    {
        xJ = i;
        Hj = null;
        Hi = b(arraylist);
        Hk = (String)hn.f(s);
        fO();
    }

    public ic(Class class1)
    {
        xJ = 1;
        Hj = null;
        Hi = new HashMap();
        Hk = class1.getCanonicalName();
    }

    private static HashMap b(ArrayList arraylist)
    {
        HashMap hashmap = new HashMap();
        int j = arraylist.size();
        for (int i = 0; i < j; i++)
        {
            a a1 = (a)arraylist.get(i);
            hashmap.put(a1.className, a1.fS());
        }

        return hashmap;
    }

    public void a(Class class1, HashMap hashmap)
    {
        Hi.put(class1.getCanonicalName(), hashmap);
    }

    public HashMap aJ(String s)
    {
        return (HashMap)Hi.get(s);
    }

    public boolean b(Class class1)
    {
        return Hi.containsKey(class1.getCanonicalName());
    }

    public int describeContents()
    {
        id id1 = CREATOR;
        return 0;
    }

    public void fO()
    {
        for (Iterator iterator = Hi.keySet().iterator(); iterator.hasNext();)
        {
            Object obj = (String)iterator.next();
            obj = (HashMap)Hi.get(obj);
            Iterator iterator1 = ((HashMap) (obj)).keySet().iterator();
            while (iterator1.hasNext()) 
            {
                ((hz.a)((HashMap) (obj)).get((String)iterator1.next())).a(this);
            }
        }

    }

    public void fP()
    {
        String s;
        HashMap hashmap1;
        for (Iterator iterator = Hi.keySet().iterator(); iterator.hasNext(); Hi.put(s, hashmap1))
        {
            s = (String)iterator.next();
            HashMap hashmap = (HashMap)Hi.get(s);
            hashmap1 = new HashMap();
            String s1;
            for (Iterator iterator1 = hashmap.keySet().iterator(); iterator1.hasNext(); hashmap1.put(s1, ((hz.a)hashmap.get(s1)).fE()))
            {
                s1 = (String)iterator1.next();
            }

        }

    }

    ArrayList fQ()
    {
        ArrayList arraylist = new ArrayList();
        String s;
        for (Iterator iterator = Hi.keySet().iterator(); iterator.hasNext(); arraylist.add(new a(s, (HashMap)Hi.get(s))))
        {
            s = (String)iterator.next();
        }

        return arraylist;
    }

    public String fR()
    {
        return Hk;
    }

    int getVersionCode()
    {
        return xJ;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (Iterator iterator = Hi.keySet().iterator(); iterator.hasNext();)
        {
            Object obj = (String)iterator.next();
            stringbuilder.append(((String) (obj))).append(":\n");
            obj = (HashMap)Hi.get(obj);
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
        id id1 = CREATOR;
        id.a(this, parcel, i);
    }

}
