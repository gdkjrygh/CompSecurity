// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import java.util.EnumMap;
import java.util.Map;

public final class euu extends Enum
{

    public static final euu a;
    public static final euu b;
    public static final euu c;
    public static final euu d;
    public static final euu e;
    public static final euu f;
    private static final SparseArray i;
    private static final Map j;
    private static final euu k[];
    public final int g;
    private final efx h;

    private euu(String s, int l, int i1, efx efx1)
    {
        super(s, l);
        g = i1;
        h = efx1;
    }

    public static euu a(int l)
    {
        return (euu)i.get(l, a);
    }

    public static euu a(efx efx1)
    {
        euu euu1 = (euu)j.get(efx1);
        efx1 = euu1;
        if (euu1 == null)
        {
            efx1 = a;
        }
        return efx1;
    }

    public static euu valueOf(String s)
    {
        return (euu)Enum.valueOf(euu, s);
    }

    public static euu[] values()
    {
        return (euu[])k.clone();
    }

    static 
    {
        int l = 0;
        a = new euu("UNKNOWN", 0, 0, null);
        b = new euu("QUEUED", 1, 1, efx.b);
        c = new euu("IN_PROGRESS", 2, 2, efx.c);
        d = new euu("UPLOADED", 3, 3, efx.d);
        e = new euu("FAILED", 4, 4, efx.e);
        f = new euu("GCORE_UNKNOWN", 5, 5, efx.a);
        k = (new euu[] {
            a, b, c, d, e, f
        });
        i = new SparseArray();
        j = new EnumMap(efx);
        euu aeuu[] = values();
        for (int i1 = aeuu.length; l < i1; l++)
        {
            euu euu1 = aeuu[l];
            i.put(euu1.g, euu1);
            if (euu1.h != null)
            {
                j.put(euu1.h, euu1);
            }
        }

    }
}
