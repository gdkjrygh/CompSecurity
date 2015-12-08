// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.rebound;

import android.view.Choreographer;

// Referenced classes of package com.facebook.rebound:
//            m, b, c

private static final class a extends m
{

    final Choreographer a;
    final android.view.eographer.FrameCallback b = new c(this);
    boolean c;

    public final void a()
    {
        c = true;
        a.removeFrameCallback(b);
        a.postFrameCallback(b);
    }

    public final void b()
    {
        c = false;
        a.removeFrameCallback(b);
    }

    public r(Choreographer choreographer)
    {
        a = choreographer;
    }
}
