// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.server.converter:
//            b

public final class StringToIntConverter
    implements SafeParcelable, a
{

    public static final b CREATOR = new b();
    private final int a;
    private final HashMap b;
    private final HashMap c;
    private final ArrayList d;

    public StringToIntConverter()
    {
        a = 1;
        b = new HashMap();
        c = new HashMap();
        d = null;
    }

    StringToIntConverter(int i, ArrayList arraylist)
    {
        a = i;
        b = new HashMap();
        c = new HashMap();
        d = null;
        a(arraylist);
    }

    private void a(ArrayList arraylist)
    {
        Entry entry;
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); a(entry.b, entry.c))
        {
            entry = (Entry)arraylist.next();
        }

    }

    final int a()
    {
        return a;
    }

    public final StringToIntConverter a(String s, int i)
    {
        b.put(s, Integer.valueOf(i));
        c.put(Integer.valueOf(i), s);
        return this;
    }

    public final Object a(Object obj)
    {
        obj = (Integer)obj;
        String s = (String)c.get(obj);
        obj = s;
        if (s == null)
        {
            obj = s;
            if (b.containsKey("gms_unknown"))
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
        for (Iterator iterator = b.keySet().iterator(); iterator.hasNext(); arraylist.add(new Entry(s, ((Integer)b.get(s)).intValue())))
        {
            s = (String)iterator.next();
        }

        return arraylist;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.common.server.converter.b.a(this, parcel);
    }


    private class Entry
        implements SafeParcelable
    {

        public static final c CREATOR = new c();
        final int a;
        final String b;
        final int c;

        public final int describeContents()
        {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            com.google.android.gms.common.server.converter.c.a(this, parcel);
        }


        Entry(int i, String s, int j)
        {
            a = i;
            b = s;
            c = j;
        }

        Entry(String s, int i)
        {
            a = 1;
            b = s;
            c = i;
        }
    }

}
