// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.rebound;

import android.os.Handler;
import android.view.Choreographer;

// Referenced classes of package com.facebook.rebound:
//            m, c, d

abstract class com.facebook.rebound.b
{
    private static final class a extends m
    {

        final Choreographer a;
        final android.view.Choreographer.FrameCallback b = new c(this);
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

        public a(Choreographer choreographer)
        {
            a = choreographer;
        }
    }

    private static final class b extends m
    {

        final Handler a;
        final Runnable b = new d(this);
        boolean c;

        public final void a()
        {
            c = true;
            a.removeCallbacks(b);
            a.post(b);
        }

        public final void b()
        {
            c = false;
            a.removeCallbacks(b);
        }

        public b(Handler handler)
        {
            a = handler;
        }
    }

}
