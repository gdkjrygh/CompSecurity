// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.common.server.converter:
//            b, c

public final class StringToIntConverter
    implements SafeParcelable, com.google.android.gms.common.server.response.FastJsonResponse.a
{
    public static final class Entry
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


    public static final b CREATOR = new b();
    final int a;
    final HashMap b;
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
        String s;
        int i;
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); c.put(Integer.valueOf(i), s))
        {
            Entry entry = (Entry)arraylist.next();
            s = entry.b;
            i = entry.c;
            b.put(s, Integer.valueOf(i));
        }

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

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.common.server.converter.b.a(this, parcel);
    }

}
