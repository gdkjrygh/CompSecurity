// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.ay.k;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            an, b

static final class init> extends an
{

    int a;
    private boolean c;
    private float d;
    private long e;
    private final int f = 300;

    private static float a(long l, long l1, int i, boolean flag)
    {
        float f1 = Math.min(1.0F, Math.max(0.0F, (float)(l1 - l) / (float)i));
        if (flag)
        {
            return f1;
        } else
        {
            return 1.0F - f1;
        }
    }

    public final void b(int i)
    {
        a = i;
    }

    public final void b(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        float f1;
        long l;
        long l1;
        k.a();
        l = k.c();
        if (flag == c)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        c = flag;
        l1 = f;
        f1 = d;
        if (!c)
        {
            f1 = 1.0F - f1;
        }
        e = l - (long)(int)(f1 * (float)l1);
        d = a(e, e, f, c);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean b()
    {
        this;
        JVM INSTR monitorenter ;
        if (d > 0.0F) goto _L2; else goto _L1
_L1:
        boolean flag = c;
        if (!flag) goto _L3; else goto _L2
_L2:
        flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L3:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean c()
    {
        this;
        JVM INSTR monitorenter ;
        float f1;
        k.a();
        long l = k.c();
        f1 = a(e, l, f, c);
        if ((!c || d >= 1.0F) && (c || d <= 0.0F)) goto _L2; else goto _L1
_L1:
        d = f1;
        f1 = d;
        int i = a;
        super.b((int)(f1 * (float)(i >> 24 & 0xff)) << 24 | i & 0xffffff);
        boolean flag = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public ( )
    {
        super();
    }
}
