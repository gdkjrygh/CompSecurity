// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.server.response:
//            d

public class FieldMappingDictionary
    implements SafeParcelable
{

    public static final d CREATOR = new d();
    private final int a;
    private final HashMap b;
    private final ArrayList c = null;
    private final String d;

    FieldMappingDictionary(int i, ArrayList arraylist, String s)
    {
        a = i;
        b = a(arraylist);
        d = (String)bl.a(s);
        d();
    }

    private static HashMap a(ArrayList arraylist)
    {
        HashMap hashmap = new HashMap();
        int j = arraylist.size();
        for (int i = 0; i < j; i++)
        {
            Entry entry = (Entry)arraylist.get(i);
            hashmap.put(entry.b, entry.a());
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
                ((FastJsonResponse.Field)((Map) (obj)).get((String)iterator1.next())).a(this);
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
        for (Iterator iterator = b.keySet().iterator(); iterator.hasNext(); arraylist.add(new Entry(s, (Map)b.get(s))))
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
        com.google.android.gms.common.server.response.d.a(this, parcel);
    }


    private class Entry
        implements SafeParcelable
    {

        public static final e CREATOR = new e();
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
            for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); arraylist.add(new FieldMapPair(s, (FastJsonResponse.Field)map.get(s))))
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
                FieldMapPair fieldmappair = (FieldMapPair)c.get(i);
                hashmap.put(fieldmappair.b, fieldmappair.c);
            }

            return hashmap;
        }

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            e.a(this, parcel);
        }


        Entry(int i, String s, ArrayList arraylist)
        {
            a = i;
            b = s;
            c = arraylist;
        }

        Entry(String s, Map map)
        {
            a = 1;
            b = s;
            c = a(map);
        }

        private class FieldMapPair
            implements SafeParcelable
        {

            public static final c CREATOR = new c();
            final int a;
            final String b;
            final FastJsonResponse.Field c;

            public int describeContents()
            {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i)
            {
                com.google.android.gms.common.server.response.c.a(this, parcel, i);
            }


            FieldMapPair(int i, String s, FastJsonResponse.Field field)
            {
                a = i;
                b = s;
                c = field;
            }

            FieldMapPair(String s, FastJsonResponse.Field field)
            {
                a = 1;
                b = s;
                c = field;
            }
        }

    }

}
