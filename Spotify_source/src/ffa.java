// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.ref.WeakReference;

final class ffa
    implements feq
{

    private final WeakReference a;

    private ffa(ffb ffb1)
    {
        a = new WeakReference(ffb1);
    }

    ffa(ffb ffb1, byte byte0)
    {
        this(ffb1);
    }

    public final void a()
    {
        ffb ffb1 = (ffb)a.get();
        if (ffb1 != null)
        {
            ffb1.a();
        }
    }

    public final void b()
    {
        ffb ffb1 = (ffb)a.get();
        if (ffb1 != null)
        {
            ffb1.b();
        }
    }
}
