// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dg;

import android.os.Handler;
import com.pandora.radio.data.aa;
import p.df.b;

// Referenced classes of package p.dg:
//            m

class bject
    implements Runnable
{

    final a a;

    public void run()
    {
        m.e(a.a).removeCallbacks(m.d(a.a));
        m.e(a.a).removeCallbacks(unnable(a));
        m.a(a.a, m.d(a.a), 250L);
    }

    <init>(<init> <init>1)
    {
        a = <init>1;
        super();
    }

    // Unreferenced inner class p/dg/m$1

/* anonymous class */
    class m._cls1
        implements Runnable
    {

        final m a;
        private Runnable b;

        static Runnable a(m._cls1 _pcls1)
        {
            return _pcls1.b;
        }

        public void run()
        {
            long l = System.currentTimeMillis();
            long l1 = m.f(a);
            if (!m.g(a))
            {
                p.df.b.a("trackLoadDaemon: not playable");
                return;
            }
            if (a.o() && !m.h(a) && l - l1 > 0x1d4c0L)
            {
                a.a(String.format("Mediaplayer taking longer than %s ms to prepare, skipping track", new Object[] {
                    Integer.valueOf(0x1d4c0)
                }));
                m.a(a, String.format("Mediaplayer taking longer than %s ms to prepare, skipping track", new Object[] {
                    Integer.valueOf(0x1d4c0)
                }), -1, -1);
                p.df.b.a("trackLoadDaemon: not prepared");
                return;
            }
            if (!m.h(a) || !m.i(a) || m.j(a))
            {
                break MISSING_BLOCK_LABEL_393;
            }
            if (m.k(a) <= 0)
            {
                m.a(a, m.l(a));
            }
            if (!a.b.p())
            {
                break MISSING_BLOCK_LABEL_265;
            }
            if (!m.m(a))
            {
                m.n(a);
                m.o(a);
                m.a(a, true);
            }
            m.e(a).removeCallbacks(m.d(a));
            m.e(a).removeCallbacks(b);
            m.a(a, b, 250L);
            return;
            a.a("ABOUT TO START PLAYING");
            p.dg.m.b(a, true);
            p.dg.m.b(a, 0);
            m.n(a);
            a.a();
            if (m.p(a))
            {
                p.dg.m.b(a, m.q(a));
            }
            a.a("STARTED PLAYING");
            p.df.b.a("trackLoadDaemon: started playing");
            p.df.b.b();
            m.e(a).removeCallbacks(m.d(a));
            m.e(a).removeCallbacks(b);
            m.a(a, b, 250L);
            return;
            int i;
            if (!m.h(a) || !m.i(a) || !m.j(a))
            {
                break MISSING_BLOCK_LABEL_555;
            }
            if (m.k(a) <= 0)
            {
                m.a(a, m.l(a));
            }
            if (!m.p(a))
            {
                break MISSING_BLOCK_LABEL_509;
            }
            i = m.q(a);
            if (i <= 0)
            {
                break MISSING_BLOCK_LABEL_501;
            }
            if (m.r(a) < i)
            {
                m.c(a, i);
                p.dg.m.b(a).c(i);
            }
            p.dg.m.b(a, i);
            m.e(a).removeCallbacks(m.d(a));
            m.e(a).removeCallbacks(b);
            m.a(a, b, 250L);
            return;
            m.e(a).removeCallbacks(m.d(a));
            m.e(a).removeCallbacks(b);
            m.a(a, b, 250L);
            return;
            Exception exception;
            exception;
            m.e(a).removeCallbacks(m.d(a));
            m.e(a).removeCallbacks(b);
            m.a(a, b, 250L);
            throw exception;
        }

            
            {
                a = m1;
                super();
                b = new m.d(a, new m._cls1._cls1(this));
            }
    }

}
