// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ay;

import android.util.Log;
import java.io.DataInput;
import java.io.DataOutput;

// Referenced classes of package com.google.android.m4b.maps.ay:
//            n, m, ab

final class <init> extends n
{

    private m a;

    public final void a(DataOutput dataoutput)
    {
    }

    public final boolean a(DataInput datainput)
    {
        this;
        JVM INSTR monitorenter ;
        m.a(a, Long.valueOf(datainput.readLong()));
        if (!ab.a(m.i(), 4)) goto _L2; else goto _L1
_L1:
        String s;
        s = m.i();
        datainput = String.valueOf(Long.toHexString(m.m(a).longValue()));
        if (datainput.length() == 0)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        datainput = "GMM Server Cookie: ".concat(datainput);
_L3:
        Log.i(s, datainput);
_L2:
        m.a(a, m.m(a).longValue());
        this;
        JVM INSTR monitorexit ;
        return true;
        datainput = new String("GMM Server Cookie: ");
          goto _L3
        datainput;
        throw datainput;
    }

    public final boolean c()
    {
        return false;
    }

    public final int g()
    {
        return 15;
    }

    private (m m1)
    {
        a = m1;
        super();
    }

    nit>(m m1, byte byte0)
    {
        this(m1);
    }
}
