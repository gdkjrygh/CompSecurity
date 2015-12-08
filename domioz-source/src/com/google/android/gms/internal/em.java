// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            en, eo

public abstract class em
{

    private final Runnable a = new en(this);
    private volatile Thread b;

    public em()
    {
    }

    static Thread a(em em1, Thread thread)
    {
        em1.b = thread;
        return thread;
    }

    public final void a()
    {
        eo.a(a);
    }

    public abstract void b();
}
