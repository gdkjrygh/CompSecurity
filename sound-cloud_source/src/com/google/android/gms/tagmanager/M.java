// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            L, N, s, O, 
//            p, o, q

final class M extends L
{

    private static final Object a = new Object();
    private static M k;
    private p b;
    private volatile o c;
    private int d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private q i;
    private boolean j;

    private M()
    {
        d = 0x1b7740;
        e = true;
        f = false;
        g = true;
        h = true;
        i = new N(this);
        j = false;
    }

    static p a(M m)
    {
        return m.b;
    }

    public static M b()
    {
        if (k == null)
        {
            k = new M();
        }
        return k;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (f) goto _L2; else goto _L1
_L1:
        s.e();
        e = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        o o = c;
        new O(this);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

}
