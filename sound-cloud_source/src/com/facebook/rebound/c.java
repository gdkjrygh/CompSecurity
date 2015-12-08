// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.rebound;

import android.view.Choreographer;

// Referenced classes of package com.facebook.rebound:
//            e

final class c
    implements android.view.Choreographer.FrameCallback
{

    final b.a a;

    c(b.a a1)
    {
        a = a1;
        super();
    }

    public final void doFrame(long l)
    {
        if (!a.c || a.d == null)
        {
            return;
        } else
        {
            a.d.b();
            a.a.postFrameCallback(a.b);
            return;
        }
    }
}
