// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.mainpage;

import android.app.Activity;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.opti.trashclear.d;
import com.qihoo.security.opti.trashclear.e;
import com.qihoo.security.opti.trashclear.ui.wave.WaveTextView;
import com.qihoo.security.opti.trashclear.ui.wave.WaveView;
import com.qihoo.security.service.ProcessClearService;
import com.qihoo.security.support.b;
import com.qihoo.security.widget.RevealPanel;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.util.Map;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui.mainpage:
//            CleanupFragment, a

class b
    implements Runnable
{

    final long a;
    final String b;
    final c c;

    public void run()
    {
        if (CleanupFragment.a(c.c.c) || !c.c.c.isAdded())
        {
            return;
        }
        synchronized ((c.c))
        {
            if (!com.qihoo.security.opti.trashclear.ui.mainpage.c(c.c))
            {
                break MISSING_BLOCK_LABEL_67;
            }
        }
        return;
        exception;
        abyte0;
        JVM INSTR monitorexit ;
        throw exception;
        synchronized (CleanupFragment.C(c.c.c))
        {
            CleanupFragment.C(c.c.c).setTag(Long.valueOf(a));
            CleanupFragment.C(c.c.c).setTitle(b);
            if (a > 0L)
            {
                CleanupFragment.C(c.c.c).setTitleColor(CleanupFragment.D(c.c.c));
                CleanupFragment.C(c.c.c).setColor(CleanupFragment.D(c.c.c));
                CleanupFragment.C(c.c.c).setSummaryColor(CleanupFragment.D(c.c.c));
            }
        }
        abyte0;
        JVM INSTR monitorexit ;
        return;
        exception1;
        revealpanel;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    >(> >, long l, String s)
    {
        c = >;
        a = l;
        b = s;
        super();
    }

    // Unreferenced inner class com/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20

/* anonymous class */
    class CleanupFragment._cls20
        implements com.qihoo.security.enginehelper.clean.a.b
    {

        final CleanupFragment a;
        private boolean b;
        private final byte c[] = new byte[0];

        private void a(d d1)
        {
            com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a, d1);
            long l = d1.k.b();
            long l1 = d1.k.c();
            long l2 = d1.k.c;
            long l3 = d1.k.e();
            int i = (com.qihoo.security.opti.trashclear.ui.mainpage.a.a(l3) * 1000) / 100;
            if (d1.c)
            {
                synchronized (c)
                {
                    if (CleanupFragment.g(a) != null)
                    {
                        CleanupFragment.g(a).a();
                        CleanupFragment.g(a).d();
                    }
                }
                if (CleanupFragment.u(a) != null)
                {
                    CleanupFragment.u(a).d();
                }
                if (CleanupFragment.v(a) != null)
                {
                    CleanupFragment.v(a).d();
                }
                if (CleanupFragment.w(a) != null)
                {
                    CleanupFragment.w(a).d();
                }
                if (CleanupFragment.x(a) != null)
                {
                    CleanupFragment.x(a).d();
                }
                if (CleanupFragment.y(a) != null)
                {
                    CleanupFragment.y(a).d();
                }
            }
            if (CleanupFragment.u(a) != null)
            {
                CleanupFragment.u(a).a(l3);
            }
            if (CleanupFragment.v(a) != null)
            {
                CleanupFragment.v(a).a(l);
            }
            if (CleanupFragment.w(a) != null)
            {
                CleanupFragment.w(a).a(l1);
            }
            if (CleanupFragment.x(a) != null)
            {
                CleanupFragment.x(a).a(l2);
            }
            if (CleanupFragment.y(a) != null)
            {
                CleanupFragment.y(a).a(i);
            }
            return;
            exception;
            d1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        static void a(CleanupFragment._cls20 _pcls20, d d1)
        {
            _pcls20.a(d1);
        }

        static boolean a(CleanupFragment._cls20 _pcls20, boolean flag)
        {
            _pcls20.b = flag;
            return flag;
        }

        static byte[] a(CleanupFragment._cls20 _pcls20)
        {
            return _pcls20.c;
        }

        static boolean b(CleanupFragment._cls20 _pcls20)
        {
            return _pcls20.b;
        }

        public void a()
        {
            b = false;
            if (CleanupFragment.a(a) || !a.isAdded())
            {
                return;
            }
            CleanupFragment.a(a, new CleanupFragment.b(new CleanupFragment._cls20._cls1(), 1));
            CleanupFragment.u(a).a();
            com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a, new CleanupFragment.b(new CleanupFragment._cls20._cls2(this), 1));
            CleanupFragment.v(a).a();
            CleanupFragment.c(a, new CleanupFragment.b(new CleanupFragment._cls20._cls3(), 1));
            CleanupFragment.w(a).a();
            com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.d(a, new CleanupFragment.b(new CleanupFragment._cls20._cls4(), 1));
            CleanupFragment.x(a).a();
            com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.e(a, new CleanupFragment.b(new CleanupFragment._cls20._cls5(), 2));
            CleanupFragment.y(a).a();
            if (!SharedPref.b(CleanupFragment.k(a), "sp_key_has_clear_memory", false))
            {
                ProcessClearService.d();
            }
            d d1 = new d();
            d1.k.n = CleanupFragment.I(a);
            com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a).runOnUiThread(new CleanupFragment._cls20._cls6(d1));
        }

        public void a(int i, Map map)
        {
            map = CleanupFragment.c(a, e.a(i, map));
            ((d) (map)).k.n = CleanupFragment.I(a);
            if (CleanupFragment.a(a) || !a.isAdded())
            {
                CleanupFragment.J(a);
                return;
            } else
            {
                com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a).runOnUiThread(new CleanupFragment._cls20._cls7(map));
                return;
            }
        }

        public void a(Map map)
        {
        }

        public void b()
        {
            synchronized (CleanupFragment.q(a))
            {
                com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.e(a, false);
            }
            return;
            exception;
            abyte0;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void b(int i, Map map)
        {
            map = e.a(i, map);
            ((d) (map)).k.n = CleanupFragment.I(a);
            map.c = true;
            com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.d(a, map);
            com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a).runOnUiThread(new CleanupFragment._cls20._cls8(map));
            CleanupFragment.K(a);
            long l = System.currentTimeMillis();
            if (CleanupFragment.a(a))
            {
                return;
            }
            com.qihoo.security.support.b.b(18012, ((d) (map)).j.e());
            if (!SharedPref.b(CleanupFragment.k(a), "sp_key_has_clear_memory", false) && CleanupFragment.I(a) > 0L)
            {
                com.qihoo.security.support.b.a(18013, String.valueOf(((d) (map)).k.e()), String.valueOf(CleanupFragment.I(a)));
            } else
            {
                com.qihoo.security.support.b.b(18013, ((d) (map)).k.e());
            }
            com.qihoo.security.support.b.c(18316, (int)(l - CleanupFragment.L(a)));
        }

        public void c()
        {
            if (CleanupFragment.H(a) != null)
            {
                CleanupFragment.H(a).b();
            }
            if (CleanupFragment.g(a) != null)
            {
                CleanupFragment.g(a).a();
            }
            CleanupFragment.J(a);
            com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a).runOnUiThread(new CleanupFragment._cls20._cls9());
            CleanupFragment.K(a);
            synchronized (CleanupFragment.q(a))
            {
                com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.e(a, false);
                b = true;
            }
            return;
            exception;
            abyte0;
            JVM INSTR monitorexit ;
            throw exception;
        }

            
            {
                a = cleanupfragment;
                super();
            }

        // Unreferenced inner class com/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$1

/* anonymous class */
        class CleanupFragment._cls20._cls1 extends CleanupFragment.a
        {

            final CleanupFragment._cls20 a;

            public void a(long l, long l1)
            {
                if (CleanupFragment.a(a.a) || !a.a.isAdded())
                {
                    return;
                } else
                {
                    String as[] = CleanupFragment.a(CleanupFragment.a(SecurityApplication.a(), l), CleanupFragment.z(a.a));
                    com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a.a).runOnUiThread(new CleanupFragment._cls20._cls1._cls1(this, as));
                    return;
                }
            }

                    
                    {
                        a = CleanupFragment._cls20.this;
                        super(null);
                    }
        }


        // Unreferenced inner class com/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$1$1

/* anonymous class */
        class CleanupFragment._cls20._cls1._cls1
            implements Runnable
        {

            final String a[];
            final CleanupFragment._cls20._cls1 b;

            public void run()
            {
label0:
                {
                    synchronized (CleanupFragment._cls20.a(b.a))
                    {
                        if (!CleanupFragment.a(b.a.a) && b.a.a.isAdded())
                        {
                            break label0;
                        }
                    }
                    return;
                }
                if (!com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment._cls20.b(b.a))
                {
                    break MISSING_BLOCK_LABEL_69;
                }
                abyte0;
                JVM INSTR monitorexit ;
                return;
                exception;
                abyte0;
                JVM INSTR monitorexit ;
                throw exception;
                CleanupFragment.A(b.a.a).setText(a[0]);
                CleanupFragment.B(b.a.a).setText(a[1]);
                abyte0;
                JVM INSTR monitorexit ;
            }

                    
                    {
                        b = _pcls1;
                        a = as;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3

/* anonymous class */
        class CleanupFragment._cls20._cls3 extends CleanupFragment.a
        {

            final CleanupFragment._cls20 a;

            public void a(long l, long l1)
            {
                if (CleanupFragment.a(a.a) || !a.a.isAdded())
                {
                    return;
                } else
                {
                    String s = CleanupFragment.a(SecurityApplication.a(), l);
                    com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a.a).runOnUiThread(new CleanupFragment._cls20._cls3._cls1(this, l, s));
                    return;
                }
            }

                    
                    {
                        a = CleanupFragment._cls20.this;
                        super(null);
                    }
        }


        // Unreferenced inner class com/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3$1

/* anonymous class */
        class CleanupFragment._cls20._cls3._cls1
            implements Runnable
        {

            final long a;
            final String b;
            final CleanupFragment._cls20._cls3 c;

            public void run()
            {
                if (CleanupFragment.a(c.a.a) || !c.a.a.isAdded())
                {
                    return;
                }
                synchronized (CleanupFragment._cls20.a(c.a))
                {
                    if (!com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment._cls20.b(c.a))
                    {
                        break MISSING_BLOCK_LABEL_67;
                    }
                }
                return;
                exception;
                abyte0;
                JVM INSTR monitorexit ;
                throw exception;
                synchronized (CleanupFragment.E(c.a.a))
                {
                    CleanupFragment.E(c.a.a).setTag(Long.valueOf(a));
                    CleanupFragment.E(c.a.a).setTitle(b);
                    if (a > 0L)
                    {
                        CleanupFragment.E(c.a.a).setTitleColor(CleanupFragment.D(c.a.a));
                        CleanupFragment.E(c.a.a).setColor(CleanupFragment.D(c.a.a));
                        CleanupFragment.E(c.a.a).setSummaryColor(CleanupFragment.D(c.a.a));
                    }
                }
                abyte0;
                JVM INSTR monitorexit ;
                return;
                exception1;
                revealpanel;
                JVM INSTR monitorexit ;
                throw exception1;
            }

                    
                    {
                        c = _pcls3;
                        a = l;
                        b = s;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$4

/* anonymous class */
        class CleanupFragment._cls20._cls4 extends CleanupFragment.a
        {

            final CleanupFragment._cls20 a;

            public void a(long l, long l1)
            {
                if (CleanupFragment.a(a.a) || !a.a.isAdded())
                {
                    return;
                } else
                {
                    String s = CleanupFragment.a(SecurityApplication.a(), l);
                    com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a.a).runOnUiThread(new CleanupFragment._cls20._cls4._cls1(this, l, s));
                    return;
                }
            }

                    
                    {
                        a = CleanupFragment._cls20.this;
                        super(null);
                    }
        }


        // Unreferenced inner class com/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$4$1

/* anonymous class */
        class CleanupFragment._cls20._cls4._cls1
            implements Runnable
        {

            final long a;
            final String b;
            final CleanupFragment._cls20._cls4 c;

            public void run()
            {
                if (CleanupFragment.a(c.a.a) || !c.a.a.isAdded())
                {
                    return;
                }
                synchronized (CleanupFragment._cls20.a(c.a))
                {
                    if (!com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment._cls20.b(c.a))
                    {
                        break MISSING_BLOCK_LABEL_67;
                    }
                }
                return;
                exception;
                abyte0;
                JVM INSTR monitorexit ;
                throw exception;
                synchronized (CleanupFragment.F(c.a.a))
                {
                    CleanupFragment.F(c.a.a).setTag(Long.valueOf(a));
                    CleanupFragment.F(c.a.a).setTitle(b);
                    if (a > 0L)
                    {
                        CleanupFragment.F(c.a.a).setTitleColor(CleanupFragment.D(c.a.a));
                        CleanupFragment.F(c.a.a).setColor(CleanupFragment.D(c.a.a));
                        CleanupFragment.F(c.a.a).setSummaryColor(CleanupFragment.D(c.a.a));
                    }
                }
                abyte0;
                JVM INSTR monitorexit ;
                return;
                exception1;
                revealpanel;
                JVM INSTR monitorexit ;
                throw exception1;
            }

                    
                    {
                        c = _pcls4;
                        a = l;
                        b = s;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$5

/* anonymous class */
        class CleanupFragment._cls20._cls5 extends CleanupFragment.a
        {

            final CleanupFragment._cls20 a;

            public void a()
            {
                if (CleanupFragment.H(a.a) != null)
                {
                    CleanupFragment.H(a.a).b();
                }
                if (CleanupFragment.g(a.a) != null)
                {
                    CleanupFragment.g(a.a).a();
                }
                synchronized (CleanupFragment._cls20.a(a))
                {
                    CleanupFragment._cls20.a(a, true);
                    CleanupFragment.G(a.a).a(true);
                }
                if (!CleanupFragment.a(a.a))
                {
                    if (a.a.isAdded());
                }
                return;
                exception;
                abyte0;
                JVM INSTR monitorexit ;
                throw exception;
            }

            public void a(long l, long l1)
            {
                if (CleanupFragment.a(a.a) || !a.a.isAdded())
                {
                    return;
                } else
                {
                    int i = (int)l;
                    com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus = com.qihoo.security.opti.trashclear.ui.mainpage.a.a((i * 100) / 1000);
                    com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a.a).runOnUiThread(new CleanupFragment._cls20._cls5._cls1(this, i, examstatus));
                    return;
                }
            }

                    
                    {
                        a = CleanupFragment._cls20.this;
                        super(null);
                    }
        }


        // Unreferenced inner class com/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$5$1

/* anonymous class */
        class CleanupFragment._cls20._cls5._cls1
            implements Runnable
        {

            final int a;
            final com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus b;
            final CleanupFragment._cls20._cls5 c;

            public void run()
            {
                if (CleanupFragment.a(c.a.a) || !c.a.a.isAdded())
                {
                    return;
                }
                synchronized (CleanupFragment._cls20.a(c.a))
                {
                    if (!com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment._cls20.b(c.a))
                    {
                        break MISSING_BLOCK_LABEL_67;
                    }
                }
                return;
                exception;
                abyte0;
                JVM INSTR monitorexit ;
                throw exception;
                CleanupFragment.G(c.a.a).setProgress(a);
                c.a.a.a(b, true);
                abyte0;
                JVM INSTR monitorexit ;
            }

                    
                    {
                        c = _pcls5;
                        a = i;
                        b = examstatus;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$6

/* anonymous class */
        class CleanupFragment._cls20._cls6
            implements Runnable
        {

            final d a;
            final CleanupFragment._cls20 b;

            public void run()
            {
                if (CleanupFragment.a(b.a) || !b.a.isAdded())
                {
                    CleanupFragment.J(b.a);
                    return;
                } else
                {
                    CleanupFragment._cls20.a(b, a);
                    return;
                }
            }

                    
                    {
                        b = CleanupFragment._cls20.this;
                        a = d1;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$7

/* anonymous class */
        class CleanupFragment._cls20._cls7
            implements Runnable
        {

            final d a;
            final CleanupFragment._cls20 b;

            public void run()
            {
                if (CleanupFragment.a(b.a) || !b.a.isAdded())
                {
                    CleanupFragment.J(b.a);
                    return;
                } else
                {
                    CleanupFragment._cls20.a(b, a);
                    return;
                }
            }

                    
                    {
                        b = CleanupFragment._cls20.this;
                        a = d1;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$8

/* anonymous class */
        class CleanupFragment._cls20._cls8
            implements Runnable
        {

            final d a;
            final CleanupFragment._cls20 b;

            public void run()
            {
                if (!CleanupFragment.a(b.a) && b.a.isAdded())
                {
                    CleanupFragment._cls20.a(b, a);
                }
                CleanupFragment.J(b.a);
            }

                    
                    {
                        b = CleanupFragment._cls20.this;
                        a = d1;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$9

/* anonymous class */
        class CleanupFragment._cls20._cls9
            implements Runnable
        {

            final CleanupFragment._cls20 a;

            public void run()
            {
                if (CleanupFragment.a(a.a) || !a.a.isAdded())
                {
                    return;
                } else
                {
                    CleanupFragment.a(a.a, true);
                    return;
                }
            }

                    
                    {
                        a = CleanupFragment._cls20.this;
                        super();
                    }
        }

    }


    // Unreferenced inner class com/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$2

/* anonymous class */
    class CleanupFragment._cls20._cls2 extends CleanupFragment.a
    {

        final CleanupFragment._cls20 a;

        public void a(long l, long l1)
        {
            if (CleanupFragment.a(a.a) || !a.a.isAdded())
            {
                return;
            } else
            {
                String s = CleanupFragment.a(SecurityApplication.a(), l);
                com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a.a).runOnUiThread(new CleanupFragment._cls20._cls2._cls1(this, l, s));
                return;
            }
        }

            
            {
                a = _pcls20;
                super(null);
            }
    }

}
