// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.a;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;

// Referenced classes of package com.facebook.a:
//            h, b

abstract class com.facebook.a.a
{
    private static final class a extends h
    {

        final Choreographer a;
        final android.view.Choreographer.FrameCallback b = new _cls1(this);
        boolean c;
        long d;

        public final void a()
        {
            if (c)
            {
                return;
            } else
            {
                c = true;
                d = SystemClock.uptimeMillis();
                a.removeFrameCallback(b);
                a.postFrameCallback(b);
                return;
            }
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

    private static final class b extends h
    {

        final Handler a;
        final Runnable b = new _cls1(this);
        boolean c;
        long d;

        public final void a()
        {
            if (c)
            {
                return;
            } else
            {
                c = true;
                d = SystemClock.uptimeMillis();
                a.removeCallbacks(b);
                a.post(b);
                return;
            }
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


    // Unreferenced inner class com/facebook/a/a$a$1

/* anonymous class */
    final class a._cls1
        implements android.view.Choreographer.FrameCallback
    {

        final a a;

        public final void doFrame(long l)
        {
            if (!a.c || a.e == null)
            {
                return;
            } else
            {
                l = SystemClock.uptimeMillis();
                a.e.a(l - a.d);
                a.d = l;
                a.a.postFrameCallback(a.b);
                return;
            }
        }

            
            {
                a = a1;
                super();
            }
    }


    // Unreferenced inner class com/facebook/a/a$b$1

/* anonymous class */
    final class b._cls1
        implements Runnable
    {

        final b a;

        public final void run()
        {
            if (!a.c || a.e == null)
            {
                return;
            } else
            {
                long l = SystemClock.uptimeMillis();
                a.e.a(l - a.d);
                a.d = l;
                a.a.post(a.b);
                return;
            }
        }

            
            {
                a = b1;
                super();
            }
    }

}
