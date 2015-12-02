// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus;

import android.app.Activity;
import com.qihoo.security.malware.db.c;
import com.qihoo.security.malware.vo.MaliciousInfo;
import com.qihoo.security.malware.widget.RadarView;
import com.qihoo.security.support.b;
import com.qihoo360.mobilesafe.b.a;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.qihoo.security.ui.antivirus:
//            VirusScanFragmentV3

class a
    implements Runnable
{

    final a a;

    public void run()
    {
        while (!a.a.isAdded() || com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a.a) != 2) 
        {
            return;
        }
        (new Thread() {

            final VirusScanFragmentV3._cls1._cls9 a;

            public void run()
            {
                long l = System.currentTimeMillis();
                SharedPref.a(VirusScanFragmentV3.h(a.a.a), "malware_scan_time", l);
                SharedPref.a(VirusScanFragmentV3.h(a.a.a), "malware_fast_scan_time", l);
            }

            
            {
                a = VirusScanFragmentV3._cls1._cls9.this;
                super();
            }
        }).start();
        int ai[] = VirusScanFragmentV3.I(a.a);
        int ai1[] = com.qihoo.security.ui.antivirus.VirusScanFragmentV3.b(a.a);
        int i = VirusScanFragmentV3.J(a.a);
        com.qihoo.security.ui.antivirus.VirusScanFragmentV3.b(a.a, false);
        VirusScanFragmentV3.H(a.a).postDelayed(new Runnable() {

            final VirusScanFragmentV3._cls1._cls9 a;

            public void run()
            {
                VirusScanFragmentV3.K(a.a.a);
            }

            
            {
                a = VirusScanFragmentV3._cls1._cls9.this;
                super();
            }
        }, 10L);
        b.b(14006, VirusScanFragmentV3.L(a.a));
        if (ai[3] > 0)
        {
            if (VirusScanFragmentV3.M(a.a)[1] > 0)
            {
                b.c(14029);
            }
            b.c(14007);
        }
        b.b(14009, ai[3]);
        if (ai[1] > 0)
        {
            b.c(14011);
        }
        b.b(14013, ai[1]);
        if (ai1[0] > 0)
        {
            b.c(14014);
        }
        b.b(14016, ai1[0]);
        if (i > 0)
        {
            b.c(14017);
        }
        if (ai[2] > 0)
        {
            b.c(14021);
            if (!VirusScanFragmentV3.i(a.a))
            {
                b.c(14024);
            }
        }
        b.b(14023, ai[2]);
    }

    a(a a1)
    {
        a = a1;
        super();
    }

    // Unreferenced inner class com/qihoo/security/ui/antivirus/VirusScanFragmentV3$1

/* anonymous class */
    class VirusScanFragmentV3._cls1
        implements com.qihoo.security.malware.a.e
    {

        final VirusScanFragmentV3 a;

        private void a(List list)
        {
            while (!a.isAdded() || com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a) != 2) 
            {
                return;
            }
            obj = new Thread(new VirusScanFragmentV3._cls1._cls9(this));
            synchronized (VirusScanFragmentV3.N(a))
            {
                if (VirusScanFragmentV3.O(a) != null && !VirusScanFragmentV3.O(a).isShutdown())
                {
                    break MISSING_BLOCK_LABEL_81;
                }
            }
            return;
            obj;
            list;
            JVM INSTR monitorexit ;
            throw obj;
            VirusScanFragmentV3.O(a).execute(((Runnable) (obj)));
            list;
            JVM INSTR monitorexit ;
        }

        public void a(com.qihoo.security.malware.a.a a1)
        {
            com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a, System.currentTimeMillis());
            (new VirusScanFragmentV3._cls1._cls7()).start();
            com.qihoo.security.ui.antivirus.VirusScanFragmentV3.b(a, false);
            com.qihoo.security.ui.antivirus.VirusScanFragmentV3.c(a, true);
            com.qihoo.security.support.b.a(14317, "0", (new StringBuilder()).append(a1.a).append("").toString());
            VirusScanFragmentV3.H(a).postDelayed(new VirusScanFragmentV3._cls1._cls8(), 10L);
        }

        public void a(com.qihoo.security.malware.a.d d)
        {
            while (!a.isAdded() || com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a) != 2) 
            {
                return;
            }
            if (com.qihoo.security.ui.antivirus.VirusScanFragmentV3.b(a)[0] > 0)
            {
                VirusScanFragmentV3.g(a).runOnUiThread(new VirusScanFragmentV3._cls1._cls1());
            }
            d = (MaliciousInfo)d.b.get(0);
            if (((MaliciousInfo) (d)).state == 127 && d.isWarning() && c.a(VirusScanFragmentV3.h(a), d))
            {
                d.riskClass = 0;
            }
            if (((MaliciousInfo) (d)).state == 127 && d.isWarning() && (!((MaliciousInfo) (d)).isSystem || !com.qihoo360.mobilesafe.b.a.b(VirusScanFragmentV3.h(a), ((MaliciousInfo) (d)).packageName) || VirusScanFragmentV3.i(a)))
            {
                SharedPref.a(VirusScanFragmentV3.h(a), "malware_find_issue_time", System.currentTimeMillis());
                VirusScanFragmentV3.g(a).runOnUiThread(new VirusScanFragmentV3._cls1._cls10());
            }
            if (((MaliciousInfo) (d)).state == 127 && d.isMalware() && (!((MaliciousInfo) (d)).isSystem || !com.qihoo360.mobilesafe.b.a.b(VirusScanFragmentV3.h(a), ((MaliciousInfo) (d)).packageName) || VirusScanFragmentV3.i(a)))
            {
                (new VirusScanFragmentV3._cls1._cls11()).start();
                VirusScanFragmentV3.g(a).runOnUiThread(new VirusScanFragmentV3._cls1._cls12());
            }
            if (((MaliciousInfo) (d)).state == 127 && d.isTrojan() && (!((MaliciousInfo) (d)).isSystem || !com.qihoo360.mobilesafe.b.a.b(VirusScanFragmentV3.h(a), ((MaliciousInfo) (d)).packageName) || VirusScanFragmentV3.i(a)) && d.isFileExist())
            {
                (new VirusScanFragmentV3._cls1._cls13()).start();
                VirusScanFragmentV3.g(a).runOnUiThread(new VirusScanFragmentV3._cls1._cls14());
            }
            VirusScanFragmentV3.g(a).runOnUiThread(new VirusScanFragmentV3._cls1._cls15());
        }

        public void b(com.qihoo.security.malware.a.d d)
        {
            if (a.isAdded() && com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a) == 2)
            {
                if (com.qihoo.security.ui.antivirus.VirusScanFragmentV3.b(a)[0] > 0)
                {
                    VirusScanFragmentV3.g(a).runOnUiThread(new VirusScanFragmentV3._cls1._cls16());
                }
                Iterator iterator = d.b.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    MaliciousInfo maliciousinfo = (MaliciousInfo)iterator.next();
                    if (maliciousinfo.state == 127 && maliciousinfo.isWarning() && c.a(VirusScanFragmentV3.h(a), maliciousinfo))
                    {
                        maliciousinfo.riskClass = 0;
                    }
                    if (maliciousinfo.state == 127 && maliciousinfo.isWarning())
                    {
                        VirusScanFragmentV3.g(a).runOnUiThread(new VirusScanFragmentV3._cls1._cls17());
                    }
                    if (maliciousinfo.state == 127 && maliciousinfo.isMalware() && (!maliciousinfo.isSystem || !com.qihoo360.mobilesafe.b.a.b(VirusScanFragmentV3.h(a), maliciousinfo.packageName) || VirusScanFragmentV3.i(a)) && !c.a(VirusScanFragmentV3.h(a), maliciousinfo) && maliciousinfo.isFileExist())
                    {
                        (new VirusScanFragmentV3._cls1._cls2()).start();
                        VirusScanFragmentV3.g(a).runOnUiThread(new VirusScanFragmentV3._cls1._cls3());
                    }
                    if (maliciousinfo.state == 127 && maliciousinfo.isTrojan() && (!maliciousinfo.isSystem || !com.qihoo360.mobilesafe.b.a.b(VirusScanFragmentV3.h(a), maliciousinfo.packageName) || VirusScanFragmentV3.i(a)) && !c.a(VirusScanFragmentV3.h(a), maliciousinfo) && maliciousinfo.isFileExist())
                    {
                        (new VirusScanFragmentV3._cls1._cls4()).start();
                        VirusScanFragmentV3.g(a).runOnUiThread(new VirusScanFragmentV3._cls1._cls5());
                    }
                } while (true);
                if (!d.a)
                {
                    if (VirusScanFragmentV3.v(a).hasMessages(6))
                    {
                        VirusScanFragmentV3.w(a).removeMessages(6);
                    }
                    if (VirusScanFragmentV3.x(a).hasMessages(7))
                    {
                        VirusScanFragmentV3.y(a).removeMessages(7);
                    }
                    com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a, System.currentTimeMillis());
                    if (!VirusScanFragmentV3.z(a))
                    {
                        com.qihoo.security.support.b.a(14315, String.valueOf(VirusScanFragmentV3.A(a) - VirusScanFragmentV3.B(a)), String.valueOf(100), (new StringBuilder()).append(String.valueOf(VirusScanFragmentV3.C(a))).append("|").append(com.qihoo.security.locale.language.b.d(VirusScanFragmentV3.h(a))).append("|").append(VirusScanFragmentV3.D(a).f()).append("|").append(System.currentTimeMillis() - VirusScanFragmentV3.E(a)).toString());
                    } else
                    {
                        com.qihoo.security.support.b.a(14316, String.valueOf(VirusScanFragmentV3.A(a) - VirusScanFragmentV3.B(a)), String.valueOf(100), (new StringBuilder()).append(String.valueOf(VirusScanFragmentV3.C(a))).append("|").append(com.qihoo.security.locale.language.b.d(VirusScanFragmentV3.h(a))).append("|").append(VirusScanFragmentV3.D(a).f()).append("|").append(System.currentTimeMillis() - VirusScanFragmentV3.E(a)).toString());
                    }
                    a(d.b);
                    if (SharedPref.b(VirusScanFragmentV3.h(a), "malware_last_scan_time", -1L) == -1L)
                    {
                        SharedPref.a(VirusScanFragmentV3.h(a), "malware_last_scan_time", System.currentTimeMillis() - VirusScanFragmentV3.F(a));
                    }
                    (new VirusScanFragmentV3._cls1._cls6()).start();
                    com.qihoo.utils.notice.a.a().b(4100);
                    return;
                }
            }
        }

            
            {
                a = virusscanfragmentv3;
                super();
            }

        // Unreferenced inner class com/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$1

/* anonymous class */
        class VirusScanFragmentV3._cls1._cls1
            implements Runnable
        {

            final VirusScanFragmentV3._cls1 a;

            public void run()
            {
                while (!a.a.isAdded() || com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a.a) != 2 || com.qihoo.security.ui.antivirus.VirusScanFragmentV3.c(a.a) == com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER) 
                {
                    return;
                }
                a.a.a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.NEED_OPTIMIZE, true);
                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a.a, true);
                if (VirusScanFragmentV3.d(a.a).hasMessages(0))
                {
                    VirusScanFragmentV3.e(a.a).removeMessages(0);
                }
                VirusScanFragmentV3.f(a.a);
            }

                    
                    {
                        a = VirusScanFragmentV3._cls1.this;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$10

/* anonymous class */
        class VirusScanFragmentV3._cls1._cls10
            implements Runnable
        {

            final VirusScanFragmentV3._cls1 a;

            public void run()
            {
                if (com.qihoo.security.ui.antivirus.VirusScanFragmentV3.c(a.a) != com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER)
                {
                    a.a.a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.NEED_OPTIMIZE, true);
                    com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a.a, true);
                    if (VirusScanFragmentV3.j(a.a).hasMessages(0))
                    {
                        VirusScanFragmentV3.k(a.a).removeMessages(0);
                    }
                    VirusScanFragmentV3.f(a.a);
                }
            }

                    
                    {
                        a = VirusScanFragmentV3._cls1.this;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$11

/* anonymous class */
        class VirusScanFragmentV3._cls1._cls11 extends Thread
        {

            final VirusScanFragmentV3._cls1 a;

            public void run()
            {
                SharedPref.a(VirusScanFragmentV3.h(a.a), "malware_find_issue_time", System.currentTimeMillis());
            }

                    
                    {
                        a = VirusScanFragmentV3._cls1.this;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$12

/* anonymous class */
        class VirusScanFragmentV3._cls1._cls12
            implements Runnable
        {

            final VirusScanFragmentV3._cls1 a;

            public void run()
            {
                a.a.a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER, true);
                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a.a, true);
                if (VirusScanFragmentV3.l(a.a).hasMessages(0))
                {
                    VirusScanFragmentV3.m(a.a).removeMessages(0);
                }
                VirusScanFragmentV3.f(a.a);
            }

                    
                    {
                        a = VirusScanFragmentV3._cls1.this;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$13

/* anonymous class */
        class VirusScanFragmentV3._cls1._cls13 extends Thread
        {

            final VirusScanFragmentV3._cls1 a;

            public void run()
            {
                SharedPref.a(VirusScanFragmentV3.h(a.a), "malware_find_issue_time", System.currentTimeMillis());
            }

                    
                    {
                        a = VirusScanFragmentV3._cls1.this;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$14

/* anonymous class */
        class VirusScanFragmentV3._cls1._cls14
            implements Runnable
        {

            final VirusScanFragmentV3._cls1 a;

            public void run()
            {
                a.a.a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER, true);
                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a.a, true);
                if (VirusScanFragmentV3.n(a.a).hasMessages(0))
                {
                    VirusScanFragmentV3.o(a.a).removeMessages(0);
                }
                VirusScanFragmentV3.f(a.a);
            }

                    
                    {
                        a = VirusScanFragmentV3._cls1.this;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$15

/* anonymous class */
        class VirusScanFragmentV3._cls1._cls15
            implements Runnable
        {

            final VirusScanFragmentV3._cls1 a;

            public void run()
            {
                while (!a.a.isAdded() || com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a.a) == 2) 
                {
                    return;
                }
            }

                    
                    {
                        a = VirusScanFragmentV3._cls1.this;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$16

/* anonymous class */
        class VirusScanFragmentV3._cls1._cls16
            implements Runnable
        {

            final VirusScanFragmentV3._cls1 a;

            public void run()
            {
                while (!a.a.isAdded() || com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a.a) == 2) 
                {
                    return;
                }
            }

                    
                    {
                        a = VirusScanFragmentV3._cls1.this;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$17

/* anonymous class */
        class VirusScanFragmentV3._cls1._cls17
            implements Runnable
        {

            final VirusScanFragmentV3._cls1 a;

            public void run()
            {
                if (com.qihoo.security.ui.antivirus.VirusScanFragmentV3.c(a.a) != com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER)
                {
                    com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a.a, true);
                    if (VirusScanFragmentV3.p(a.a).hasMessages(0))
                    {
                        VirusScanFragmentV3.q(a.a).removeMessages(0);
                    }
                    VirusScanFragmentV3.f(a.a);
                }
            }

                    
                    {
                        a = VirusScanFragmentV3._cls1.this;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$2

/* anonymous class */
        class VirusScanFragmentV3._cls1._cls2 extends Thread
        {

            final VirusScanFragmentV3._cls1 a;

            public void run()
            {
                SharedPref.a(VirusScanFragmentV3.h(a.a), "malware_find_issue_time", System.currentTimeMillis());
            }

                    
                    {
                        a = VirusScanFragmentV3._cls1.this;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$3

/* anonymous class */
        class VirusScanFragmentV3._cls1._cls3
            implements Runnable
        {

            final VirusScanFragmentV3._cls1 a;

            public void run()
            {
                a.a.a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER, true);
                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a.a, true);
                if (VirusScanFragmentV3.r(a.a).hasMessages(0))
                {
                    VirusScanFragmentV3.s(a.a).removeMessages(0);
                }
                VirusScanFragmentV3.f(a.a);
            }

                    
                    {
                        a = VirusScanFragmentV3._cls1.this;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$4

/* anonymous class */
        class VirusScanFragmentV3._cls1._cls4 extends Thread
        {

            final VirusScanFragmentV3._cls1 a;

            public void run()
            {
                SharedPref.a(VirusScanFragmentV3.h(a.a), "malware_find_issue_time", System.currentTimeMillis());
            }

                    
                    {
                        a = VirusScanFragmentV3._cls1.this;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$5

/* anonymous class */
        class VirusScanFragmentV3._cls1._cls5
            implements Runnable
        {

            final VirusScanFragmentV3._cls1 a;

            public void run()
            {
                a.a.a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER, true);
                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a.a, true);
                if (VirusScanFragmentV3.t(a.a).hasMessages(0))
                {
                    VirusScanFragmentV3.u(a.a).removeMessages(0);
                }
                VirusScanFragmentV3.f(a.a);
            }

                    
                    {
                        a = VirusScanFragmentV3._cls1.this;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$6

/* anonymous class */
        class VirusScanFragmentV3._cls1._cls6 extends Thread
        {

            final VirusScanFragmentV3._cls1 a;

            public void run()
            {
                SharedPref.a(VirusScanFragmentV3.h(a.a), "malware_is_scanning", false);
            }

                    
                    {
                        a = VirusScanFragmentV3._cls1.this;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$7

/* anonymous class */
        class VirusScanFragmentV3._cls1._cls7 extends Thread
        {

            final VirusScanFragmentV3._cls1 a;

            public void run()
            {
                SharedPref.a(VirusScanFragmentV3.h(a.a), "malware_is_scanning", false);
            }

                    
                    {
                        a = VirusScanFragmentV3._cls1.this;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$8

/* anonymous class */
        class VirusScanFragmentV3._cls1._cls8
            implements Runnable
        {

            final VirusScanFragmentV3._cls1 a;

            public void run()
            {
                VirusScanFragmentV3.G(a.a);
            }

                    
                    {
                        a = VirusScanFragmentV3._cls1.this;
                        super();
                    }
        }

    }

}
