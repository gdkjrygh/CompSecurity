// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.util;


// Referenced classes of package com.google.android.apps.gsa.shared.util:
//            g

public final class f
{

    public volatile int a;
    public volatile g b;

    public f()
    {
        a = -1;
    }

    public final void a(g g)
    {
        this;
        JVM INSTR monitorenter ;
        b = g;
        this;
        JVM INSTR monitorexit ;
        return;
        g;
        throw g;
    }
}
