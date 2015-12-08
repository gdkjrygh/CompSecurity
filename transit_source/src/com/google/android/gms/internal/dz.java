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
//            ea, dm, eb, dy

public class dz
    implements SafeParcelable
{
    public static class a
        implements SafeParcelable
    {

        public static final eb CREATOR = new eb();
        final String className;
        final ArrayList lM;
        final int versionCode;

        private static ArrayList a(HashMap hashmap)
        {
            if (hashmap == null)
            {
                return null;
            }
            ArrayList arraylist = new ArrayList();
            String s;
            for (Iterator iterator = hashmap.keySet().iterator(); iterator.hasNext(); arraylist.add(new b(s, (dw.a)hashmap.get(s))))
            {
                s = (String)iterator.next();
            }

            return arraylist;
        }

        HashMap bG()
        {
            HashMap hashmap = new HashMap();
            int j = lM.size();
            for (int i = 0; i < j; i++)
            {
                b b1 = (b)lM.get(i);
                hashmap.put(b1.lN, b1.lO);
            }

            return hashmap;
        }

        public int describeContents()
        {
            eb eb1 = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            eb eb1 = CREATOR;
            eb.a(this, parcel, i);
        }


        a(int i, String s, ArrayList arraylist)
        {
            versionCode = i;
            className = s;
            lM = arraylist;
        }

        a(String s, HashMap hashmap)
        {
            versionCode = 1;
            className = s;
            lM = a(hashmap);
        }
    }

    public static class b
        implements SafeParcelable
    {

        public static final dy CREATOR = new dy();
        final String lN;
        final dw.a lO;
        final int versionCode;

        public int describeContents()
        {
            dy dy1 = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            dy dy1 = CREATOR;
            dy.a(this, parcel, i);
        }


        b(int i, String s, dw.a a1)
        {
            versionCode = i;
            lN = s;
            lO = a1;
        }

        b(String s, dw.a a1)
        {
            versionCode = 1;
            lN = s;
            lO = a1;
        }
    }


    public static final ea CREATOR = new ea();
    private final int iM;
    private final HashMap lJ;
    private final ArrayList lK;
    private final String lL;

    dz(int i, ArrayList arraylist, String s)
    {
        iM = i;
        lK = null;
        lJ = b(arraylist);
        lL = (String)dm.e(s);
        bC();
    }

    public dz(Class class1)
    {
        iM = 1;
        lK = null;
        lJ = new HashMap();
        lL = class1.getCanonicalName();
    }

    private static HashMap b(ArrayList arraylist)
    {
        HashMap hashmap = new HashMap();
        int j = arraylist.size();
        for (int i = 0; i < j; i++)
        {
            a a1 = (a)arraylist.get(i);
            hashmap.put(a1.className, a1.bG());
        }

        return hashmap;
    }

    public HashMap H(String s)
    {
        return (HashMap)lJ.get(s);
    }

    public void a(Class class1, HashMap hashmap)
    {
        lJ.put(class1.getCanonicalName(), hashmap);
    }

    public boolean b(Class class1)
    {
        return lJ.containsKey(class1.getCanonicalName());
    }

    public void bC()
    {
        for (Iterator iterator = lJ.keySet().iterator(); iterator.hasNext();)
        {
            Object obj = (String)iterator.next();
            obj = (HashMap)lJ.get(obj);
            Iterator iterator1 = ((HashMap) (obj)).keySet().iterator();
            while (iterator1.hasNext()) 
            {
                ((dw.a)((HashMap) (obj)).get((String)iterator1.next())).a(this);
            }
        }

    }

    public void bD()
    {
        String s;
        HashMap hashmap1;
        for (Iterator iterator = lJ.keySet().iterator(); iterator.hasNext(); lJ.put(s, hashmap1))
        {
            s = (String)iterator.next();
            HashMap hashmap = (HashMap)lJ.get(s);
            hashmap1 = new HashMap();
            String s1;
            for (Iterator iterator1 = hashmap.keySet().iterator(); iterator1.hasNext(); hashmap1.put(s1, ((dw.a)hashmap.get(s1)).bs()))
            {
                s1 = (String)iterator1.next();
            }

        }

    }

    ArrayList bE()
    {
        ArrayList arraylist = new ArrayList();
        String s;
        for (Iterator iterator = lJ.keySet().iterator(); iterator.hasNext(); arraylist.add(new a(s, (HashMap)lJ.get(s))))
        {
            s = (String)iterator.next();
        }

        return arraylist;
    }

    public String bF()
    {
        return lL;
    }

    public int describeContents()
    {
        ea ea1 = CREATOR;
        return 0;
    }

    int getVersionCode()
    {
        return iM;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (Iterator iterator = lJ.keySet().iterator(); iterator.hasNext();)
        {
            Object obj = (String)iterator.next();
            stringbuilder.append(((String) (obj))).append(":\n");
            obj = (HashMap)lJ.get(obj);
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
        ea ea1 = CREATOR;
        ea.a(this, parcel, i);
    }

}
