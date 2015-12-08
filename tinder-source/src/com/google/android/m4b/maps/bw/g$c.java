// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bw;

import android.content.Context;
import android.util.Log;
import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.ac.c;
import com.google.android.m4b.maps.al.b;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ay.n;
import com.google.android.m4b.maps.bs.e;
import com.google.android.m4b.maps.bx.t;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.OutputStream;

// Referenced classes of package com.google.android.m4b.maps.bw:
//            g

final class <init> extends n
{

    private final Context a;
    private final Long b;
    private final String c;
    private g d;

    public final void a(DataOutput dataoutput)
    {
        a a2 = new a(com.google.android.m4b.maps.cq.n.d);
        a2.a(1, 1L);
        a a1 = new a(com.google.android.m4b.maps.cq.n.a);
        a1.a(1, a2);
        a2 = new a(com.google.android.m4b.maps.cq.n.d);
        a2.a(1, 5L);
        if (b != null)
        {
            a2.a(2, b.longValue());
        }
        a1.a(1, a2);
        com.google.android.m4b.maps.bw.g.d(d).a(a, a1);
        dataoutput.writeInt(a1.a(false));
        a1.a((OutputStream)dataoutput, false);
    }

    public final boolean a(DataInput datainput)
    {
        a a1;
        int i;
        int j;
        a1 = com.google.android.m4b.maps.ac.c.a(com.google.android.m4b.maps.cq.n.c, datainput);
        j = a1.j(1);
        i = 0;
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        datainput = a1.c(1, i);
        if (datainput.d(1) != 5 || !datainput.i(2) || !datainput.i(7))
        {
            break MISSING_BLOCK_LABEL_160;
        }
        com/google/android/m4b/maps/bw/g;
        JVM INSTR monitorenter ;
        com.google.android.m4b.maps.al.b.a(a, datainput, c);
        com/google/android/m4b/maps/bw/g;
        JVM INSTR monitorexit ;
        a a2 = datainput.f(7);
        if (ab.a(com.google.android.m4b.maps.bw.g.c(), 3))
        {
            String s = com.google.android.m4b.maps.bw.g.c();
            long l = datainput.e(2);
            Log.d(s, (new StringBuilder(58)).append("Updating tile zoom progression. Hash: ").append(l).toString());
        }
        com.google.android.m4b.maps.bw.g.a(d, t.a(a2));
        com.google.android.m4b.maps.bw.g.c(d);
        return true;
        datainput;
        com/google/android/m4b/maps/bw/g;
        JVM INSTR monitorexit ;
        throw datainput;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final boolean d()
    {
        return true;
    }

    public final int g()
    {
        return 75;
    }

    private (g g1, Context context, Long long1, String s)
    {
        d = g1;
        super();
        a = context;
        b = long1;
        c = s;
    }

    c(g g1, Context context, Long long1, String s, byte byte0)
    {
        this(g1, context, long1, s);
    }
}
