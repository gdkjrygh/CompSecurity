// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.ac.c;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ay.n;
import com.google.android.m4b.maps.ay.u;
import com.google.android.m4b.maps.cq.i;
import java.io.DataInput;
import java.io.DataOutput;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            am

final class it> extends n
{

    private int a;
    private am b;

    public final void a()
    {
        synchronized (b)
        {
            a = 0;
            b.c = false;
        }
        return;
        exception;
        am1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(DataOutput dataoutput)
    {
        synchronized (b)
        {
            a a1 = b.b.a(i.a);
            a = a1.j(1);
            c.a(dataoutput, a1);
        }
        return;
        dataoutput;
        am1;
        JVM INSTR monitorexit ;
        throw dataoutput;
    }

    public final boolean a(DataInput datainput)
    {
        switch (c.a(i.c, datainput).d(1))
        {
        case 0: // '\0'
        default:
            return true;

        case 1: // '\001'
            ab.a("This application has been blocked by the Google Maps API. This might be because of an incorrectly registered key.");
            b.a.f();
            return true;

        case 2: // '\002'
            ab.a("This application has exceeded its quota for the Google Maps API.");
            break;
        }
        b.a.f();
        return true;
    }

    public final void b()
    {
        int j;
        j = 0;
        super.b();
        am am1 = b;
        am1;
        JVM INSTR monitorenter ;
        a a1;
        int k;
        a1 = b.b.a(i.a);
        k = Math.min(a, a1.j(1));
_L2:
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        a1.e(1, 0);
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        b.b.a(a1);
        a = 0;
        b.c = false;
        am1;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        am1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final int g()
    {
        return 147;
    }

    (am am1)
    {
        b = am1;
        super();
    }
}
