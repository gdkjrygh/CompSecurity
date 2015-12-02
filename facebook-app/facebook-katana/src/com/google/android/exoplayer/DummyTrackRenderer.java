// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;


// Referenced classes of package com.google.android.exoplayer:
//            TrackRenderer

public final class DummyTrackRenderer extends TrackRenderer
{

    public DummyTrackRenderer()
    {
    }

    protected final int a(long l)
    {
        return -1;
    }

    protected final void a(long l, long l1)
    {
        throw new IllegalStateException();
    }

    protected final boolean a()
    {
        throw new IllegalStateException();
    }

    protected final void b(long l)
    {
        throw new IllegalStateException();
    }

    protected final boolean b()
    {
        throw new IllegalStateException();
    }

    protected final long d()
    {
        throw new IllegalStateException();
    }

    protected final void d_()
    {
        throw new IllegalStateException();
    }

    protected final long e()
    {
        throw new IllegalStateException();
    }
}
