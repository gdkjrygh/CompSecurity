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
//            hz, hx

public final class zzla
    implements SafeParcelable, hz
{

    public static final hx CREATOR = new hx();
    private final int a;
    private final HashMap b;
    private final HashMap c;
    private final ArrayList d;

    public zzla()
    {
        a = 1;
        b = new HashMap();
        c = new HashMap();
        d = null;
    }

    zzla(int i, ArrayList arraylist)
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
            zza zza1 = (zza)arraylist.next();
            s = zza1.b;
            i = zza1.c;
            b.put(s, Integer.valueOf(i));
        }

    }

    final int a()
    {
        return a;
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
        for (Iterator iterator = b.keySet().iterator(); iterator.hasNext(); arraylist.add(new zza(s, ((Integer)b.get(s)).intValue())))
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
        hx.a(this, parcel);
    }


    private class zza
        implements SafeParcelable
    {

        public static final hy CREATOR = new hy();
        final int a;
        final String b;
        final int c;

        public final int describeContents()
        {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            hy.a(this, parcel);
        }


        zza(int i, String s, int j)
        {
            a = i;
            b = s;
            c = j;
        }

        zza(String s, int i)
        {
            a = 1;
            b = s;
            c = i;
        }
    }

}
