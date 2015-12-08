// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            as

static final class <init>
{

    private static String c = "GLThreadManager";
    boolean a;
    d b;
    private boolean d;
    private int e;
    private boolean f;
    private boolean g;

    public final void a(<init> <init>1)
    {
        this;
        JVM INSTR monitorenter ;
        a(<init>1);
        if (b == <init>1)
        {
            b = null;
        }
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
        <init>1;
        throw <init>1;
    }

    public final void a(GL10 gl10)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        if (f) goto _L2; else goto _L1
_L1:
        c();
        gl10 = gl10.glGetString(7937);
        if (e >= 0x20000)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        boolean flag;
        if (!gl10.startsWith("Q3Dimension MSM7500 "))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        notifyAll();
        if (!a) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (!gl10.startsWith("Adreno")) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (android.os..VERSION.SDK_INT >= 11) goto _L6; else goto _L4
_L6:
        g = flag;
        f = true;
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        gl10;
        throw gl10;
_L4:
        flag = true;
        if (true) goto _L6; else goto _L7
_L7:
    }

    public final boolean a()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = g;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b(g g1)
    {
        if (b == g1)
        {
            b = null;
        }
        notifyAll();
    }

    public final boolean b()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        c();
        flag = a;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    final void c()
    {
        if (!d)
        {
            e = 0x20000;
            if (e >= 0x20000)
            {
                a = true;
            }
            d = true;
        }
    }


    private GL10()
    {
    }

    GL10(byte byte0)
    {
        this();
    }
}
