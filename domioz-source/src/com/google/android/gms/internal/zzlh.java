// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.ap;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            ic

public class zzlh
    implements SafeParcelable
{

    public static final ic CREATOR = new ic();
    private final int a;
    private final HashMap b;
    private final ArrayList c = null;
    private final String d;

    zzlh(int i, ArrayList arraylist, String s)
    {
        a = i;
        b = a(arraylist);
        d = (String)ap.a(s);
        d();
    }

    private static HashMap a(ArrayList arraylist)
    {
        HashMap hashmap = new HashMap();
        int j = arraylist.size();
        for (int i = 0; i < j; i++)
        {
            zza zza1 = (zza)arraylist.get(i);
            hashmap.put(zza1.b, zza1.a());
        }

        return hashmap;
    }

    private void d()
    {
        for (Iterator iterator = b.keySet().iterator(); iterator.hasNext();)
        {
            Object obj = (String)iterator.next();
            obj = (Map)b.get(obj);
            Iterator iterator1 = ((Map) (obj)).keySet().iterator();
            while (iterator1.hasNext()) 
            {
                ((zzld.zza)((Map) (obj)).get((String)iterator1.next())).a(this);
            }
        }

    }

    final int a()
    {
        return a;
    }

    public final Map a(String s)
    {
        return (Map)b.get(s);
    }

    final ArrayList b()
    {
        ArrayList arraylist = new ArrayList();
        String s;
        for (Iterator iterator = b.keySet().iterator(); iterator.hasNext(); arraylist.add(new zza(s, (Map)b.get(s))))
        {
            s = (String)iterator.next();
        }

        return arraylist;
    }

    public final String c()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (Iterator iterator = b.keySet().iterator(); iterator.hasNext();)
        {
            Object obj = (String)iterator.next();
            stringbuilder.append(((String) (obj))).append(":\n");
            obj = (Map)b.get(obj);
            Iterator iterator1 = ((Map) (obj)).keySet().iterator();
            while (iterator1.hasNext()) 
            {
                String s = (String)iterator1.next();
                stringbuilder.append("  ").append(s).append(": ");
                stringbuilder.append(((Map) (obj)).get(s));
            }
        }

        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ic.a(this, parcel);
    }


    private class zza
        implements SafeParcelable
    {

        public static final id CREATOR = new id();
        final int a;
        final String b;
        final ArrayList c;

        private static ArrayList a(Map map)
        {
            if (map == null)
            {
                return null;
            }
            ArrayList arraylist = new ArrayList();
            String s;
            for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); arraylist.add(new zzb(s, (zzld.zza)map.get(s))))
            {
                s = (String)iterator.next();
            }

            return arraylist;
        }

        final HashMap a()
        {
            HashMap hashmap = new HashMap();
            int j = c.size();
            for (int i = 0; i < j; i++)
            {
                zzb zzb1 = (zzb)c.get(i);
                hashmap.put(zzb1.b, zzb1.c);
            }

            return hashmap;
        }

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            id.a(this, parcel);
        }


        zza(int i, String s, ArrayList arraylist)
        {
            a = i;
            b = s;
            c = arraylist;
        }

        zza(String s, Map map)
        {
            a = 1;
            b = s;
            c = a(map);
        }

        private class zzb
            implements SafeParcelable
        {

            public static final ib CREATOR = new ib();
            final int a;
            final String b;
            final zzld.zza c;

            public int describeContents()
            {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i)
            {
                ib.a(this, parcel, i);
            }


            zzb(int i, String s, zzld.zza zza1)
            {
                a = i;
                b = s;
                c = zza1;
            }

            zzb(String s, zzld.zza zza1)
            {
                a = 1;
                b = s;
                c = zza1;
            }
        }

    }

}
