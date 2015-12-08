// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            aw, ay, y, az, 
//            v, u, w

final class ax extends aw
{

    private static final Object a = new Object();
    private static ax k;
    private v b;
    private volatile u c;
    private int d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private w i;
    private boolean j;

    private ax()
    {
        d = 0x1b7740;
        e = true;
        f = false;
        g = true;
        h = true;
        i = new ay(this);
        j = false;
    }

    static v a(ax ax1)
    {
        return ax1.b;
    }

    public static ax b()
    {
        if (k == null)
        {
            k = new ax();
        }
        return k;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (f) goto _L2; else goto _L1
_L1:
        y.a();
        e = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        u u = c;
        new az(this);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

}
