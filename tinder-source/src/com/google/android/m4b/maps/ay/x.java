// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ay;

import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.m4b.maps.ay:
//            t, k

public class x
{

    static final String a = com/google/android/m4b/maps/ay/x.getSimpleName();
    static final long b;
    private static int g = 0;
    volatile int c;
    StringBuilder d;
    long e;
    long f;
    private k h;

    public x(Vector vector, k k1)
    {
        c = -1;
        h = k1;
        d = new StringBuilder("DRD");
        k1 = d.append("(");
        int i = g;
        g = i + 1;
        k1.append(i).append("): ");
        k1 = vector.iterator();
        vector = "";
        t t1;
        for (; k1.hasNext(); d.append(t1.g()))
        {
            t1 = (t)k1.next();
            d.append(vector);
            vector = "|";
        }

        e = k.c();
    }

    static 
    {
        b = TimeUnit.MINUTES.toMillis(1L);
    }
}
