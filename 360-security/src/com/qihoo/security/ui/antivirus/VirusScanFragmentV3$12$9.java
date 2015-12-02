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
        if (com.qihoo.security.ui.antivirus.VirusScanFragmentV3.c(a.a) != com.qihoo.security.ui.exam.N_DANGER)
        {
            com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a.a, true);
            if (VirusScanFragmentV3.P(a.a).s(0))
            {
                VirusScanFragmentV3.Q(a.a).ages(0);
            }
            VirusScanFragmentV3.f(a.a);
        }
    }

    a(a a1)
    {
        a = a1;
        super();
    }

    // Unreferenced inner class com/qihoo/security/ui/antivirus/VirusScanFragmentV3$12

/* anonymous class */
    class VirusScanFragmentV3._cls12
        implements com.qihoo.security.malware.a.e
    {

        final VirusScanFragmentV3 a;

        private void a(List list)
        {
            while (!a.isAdded() || com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a) != 3) 
            {
                return;
            }
            obj = new Thread(new VirusScanFragmentV3._cls12._cls5());
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
            (new VirusScanFragmentV3._cls12._cls3()).start();
            com.qihoo.security.ui.antivirus.VirusScanFragmentV3.b(a, false);
            com.qihoo.security.ui.antivirus.VirusScanFragmentV3.c(a, true);
            com.qihoo.security.support.b.a(14317, "1", (new StringBuilder()).append(a1.a).append("").toString());
            VirusScanFragmentV3.H(a).postDelayed(new VirusScanFragmentV3._cls12._cls4(), 10L);
        }

        public void a(com.qihoo.security.malware.a.d d)
        {
            while (!a.isAdded() || com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a) != 3) 
            {
                return;
            }
            if (com.qihoo.security.ui.antivirus.VirusScanFragmentV3.b(a)[0] > 0)
            {
                VirusScanFragmentV3.g(a).runOnUiThread(new VirusScanFragmentV3._cls12._cls1());
            }
            d = (MaliciousInfo)d.b.get(0);
            if (((MaliciousInfo) (d)).state == 127 && d.isWarning() && c.a(VirusScanFragmentV3.h(a), d))
            {
                d.riskClass = 0;
            }
            VirusScanFragmentV3.g(a).runOnUiThread(new VirusScanFragmentV3._cls12._cls6());
        }

        public void b(com.qihoo.security.malware.a.d d)
        {
            if (a.isAdded() && com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a) == 3)
            {
                if (com.qihoo.security.ui.antivirus.VirusScanFragmentV3.b(a)[0] > 0)
                {
                    VirusScanFragmentV3.g(a).runOnUiThread(new VirusScanFragmentV3._cls12._cls7());
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
                        (new VirusScanFragmentV3._cls12._cls8()).start();
                        VirusScanFragmentV3.g(a).runOnUiThread(new VirusScanFragmentV3._cls12._cls9(this));
                    }
                    if (maliciousinfo.state == 127 && maliciousinfo.isMalware() && (!maliciousinfo.isSystem || !com.qihoo360.mobilesafe.b.a.b(VirusScanFragmentV3.h(a), maliciousinfo.packageName) || VirusScanFragmentV3.i(a)) && !c.a(VirusScanFragmentV3.h(a), maliciousinfo) && maliciousinfo.isFileExist())
                    {
                        (new VirusScanFragmentV3._cls12._cls10()).start();
                        VirusScanFragmentV3.g(a).runOnUiThread(new VirusScanFragmentV3._cls12._cls11());
                    }
                    if (maliciousinfo.state == 127 && maliciousinfo.isTrojan() && (!maliciousinfo.isSystem || !com.qihoo360.mobilesafe.b.a.b(VirusScanFragmentV3.h(a), maliciousinfo.packageName) || VirusScanFragmentV3.i(a)) && !c.a(VirusScanFragmentV3.h(a), maliciousinfo) && maliciousinfo.isFileExist())
                    {
                        (new VirusScanFragmentV3._cls12._cls12()).start();
                        VirusScanFragmentV3.g(a).runOnUiThread(new VirusScanFragmentV3._cls12._cls13());
                    }
                } while (true);
                if (!d.a)
                {
                    if (VirusScanFragmentV3.V(a).hasMessages(6))
                    {
                        VirusScanFragmentV3.W(a).removeMessages(6);
                    }
                    com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a, System.currentTimeMillis());
                    if (!VirusScanFragmentV3.z(a))
                    {
                        com.qihoo.security.support.b.a(14331, String.valueOf(VirusScanFragmentV3.A(a) - VirusScanFragmentV3.B(a)), String.valueOf(100), (new StringBuilder()).append(String.valueOf(VirusScanFragmentV3.C(a))).append("|").append(com.qihoo.security.locale.language.b.d(VirusScanFragmentV3.h(a))).append("|").append(VirusScanFragmentV3.D(a).f()).append("|").append(System.currentTimeMillis() - VirusScanFragmentV3.E(a)).toString());
                    } else
                    {
                        com.qihoo.security.support.b.a(14332, String.valueOf(VirusScanFragmentV3.A(a) - VirusScanFragmentV3.B(a)), String.valueOf(100), (new StringBuilder()).append(String.valueOf(VirusScanFragmentV3.C(a))).append("|").append(com.qihoo.security.locale.language.b.d(VirusScanFragmentV3.h(a))).append("|").append(VirusScanFragmentV3.D(a).f()).append("|").append(System.currentTimeMillis() - VirusScanFragmentV3.E(a)).toString());
                    }
                    a(d.b);
                    SharedPref.a(VirusScanFragmentV3.h(a), "malware_last_scan_time", System.currentTimeMillis() - VirusScanFragmentV3.F(a));
                    (new VirusScanFragmentV3._cls12._cls2()).start();
                    com.qihoo.utils.notice.a.a().b(4100);
                    return;
                }
            }
        }

            
            {
                a = virusscanfragmentv3;
                super();
            }

        // Unreferenced inner class com/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$1

/* anonymous class */
        class VirusScanFragmentV3._cls12._cls1
            implements Runnable
        {

            final VirusScanFragmentV3._cls12 a;

            public void run()
            {
                while (!a.a.isAdded() || com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a.a) == 3) 
                {
                    return;
                }
            }

                    
                    {
                        a = VirusScanFragmentV3._cls12.this;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$10

/* anonymous class */
        class VirusScanFragmentV3._cls12._cls10 extends Thread
        {

            final VirusScanFragmentV3._cls12 a;

            public void run()
            {
                SharedPref.a(VirusScanFragmentV3.h(a.a), "malware_find_issue_time", System.currentTimeMillis());
            }

                    
                    {
                        a = VirusScanFragmentV3._cls12.this;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$11

/* anonymous class */
        class VirusScanFragmentV3._cls12._cls11
            implements Runnable
        {

            final VirusScanFragmentV3._cls12 a;

            public void run()
            {
                a.a.a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER, true);
                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a.a, true);
                if (VirusScanFragmentV3.R(a.a).hasMessages(0))
                {
                    VirusScanFragmentV3.S(a.a).removeMessages(0);
                }
                VirusScanFragmentV3.f(a.a);
            }

                    
                    {
                        a = VirusScanFragmentV3._cls12.this;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$12

/* anonymous class */
        class VirusScanFragmentV3._cls12._cls12 extends Thread
        {

            final VirusScanFragmentV3._cls12 a;

            public void run()
            {
                SharedPref.a(VirusScanFragmentV3.h(a.a), "malware_find_issue_time", System.currentTimeMillis());
            }

                    
                    {
                        a = VirusScanFragmentV3._cls12.this;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$13

/* anonymous class */
        class VirusScanFragmentV3._cls12._cls13
            implements Runnable
        {

            final VirusScanFragmentV3._cls12 a;

            public void run()
            {
                a.a.a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER, true);
                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a.a, true);
                if (VirusScanFragmentV3.T(a.a).hasMessages(0))
                {
                    VirusScanFragmentV3.U(a.a).removeMessages(0);
                }
                VirusScanFragmentV3.f(a.a);
            }

                    
                    {
                        a = VirusScanFragmentV3._cls12.this;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$2

/* anonymous class */
        class VirusScanFragmentV3._cls12._cls2 extends Thread
        {

            final VirusScanFragmentV3._cls12 a;

            public void run()
            {
                SharedPref.a(VirusScanFragmentV3.h(a.a), "malware_is_scanning", false);
            }

                    
                    {
                        a = VirusScanFragmentV3._cls12.this;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$3

/* anonymous class */
        class VirusScanFragmentV3._cls12._cls3 extends Thread
        {

            final VirusScanFragmentV3._cls12 a;

            public void run()
            {
                SharedPref.a(VirusScanFragmentV3.h(a.a), "malware_is_scanning", false);
            }

                    
                    {
                        a = VirusScanFragmentV3._cls12.this;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$4

/* anonymous class */
        class VirusScanFragmentV3._cls12._cls4
            implements Runnable
        {

            final VirusScanFragmentV3._cls12 a;

            public void run()
            {
                VirusScanFragmentV3.G(a.a);
            }

                    
                    {
                        a = VirusScanFragmentV3._cls12.this;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$5

/* anonymous class */
        class VirusScanFragmentV3._cls12._cls5
            implements Runnable
        {

            final VirusScanFragmentV3._cls12 a;

            public void run()
            {
                while (!a.a.isAdded() || com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a.a) != 3) 
                {
                    return;
                }
                (new VirusScanFragmentV3._cls12._cls5._cls1(this)).start();
                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.b(a.a, false);
                VirusScanFragmentV3.H(a.a).postDelayed(new VirusScanFragmentV3._cls12._cls5._cls2(this), 10L);
            }

                    
                    {
                        a = VirusScanFragmentV3._cls12.this;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$5$1

/* anonymous class */
        class VirusScanFragmentV3._cls12._cls5._cls1 extends Thread
        {

            final VirusScanFragmentV3._cls12._cls5 a;

            public void run()
            {
                long l = System.currentTimeMillis();
                SharedPref.a(VirusScanFragmentV3.h(a.a.a), "malware_scan_time", l);
                SharedPref.a(VirusScanFragmentV3.h(a.a.a), "malware_full_scan_time", l);
            }

                    
                    {
                        a = _pcls5;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$5$2

/* anonymous class */
        class VirusScanFragmentV3._cls12._cls5._cls2
            implements Runnable
        {

            final VirusScanFragmentV3._cls12._cls5 a;

            public void run()
            {
                VirusScanFragmentV3.K(a.a.a);
            }

                    
                    {
                        a = _pcls5;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$6

/* anonymous class */
        class VirusScanFragmentV3._cls12._cls6
            implements Runnable
        {

            final VirusScanFragmentV3._cls12 a;

            public void run()
            {
                while (!a.a.isAdded() || com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a.a) == 3) 
                {
                    return;
                }
            }

                    
                    {
                        a = VirusScanFragmentV3._cls12.this;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$7

/* anonymous class */
        class VirusScanFragmentV3._cls12._cls7
            implements Runnable
        {

            final VirusScanFragmentV3._cls12 a;

            public void run()
            {
                while (!a.a.isAdded() || com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a.a) == 3) 
                {
                    return;
                }
            }

                    
                    {
                        a = VirusScanFragmentV3._cls12.this;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$8

/* anonymous class */
        class VirusScanFragmentV3._cls12._cls8 extends Thread
        {

            final VirusScanFragmentV3._cls12 a;

            public void run()
            {
                SharedPref.a(VirusScanFragmentV3.h(a.a), "malware_find_issue_time", System.currentTimeMillis());
            }

                    
                    {
                        a = VirusScanFragmentV3._cls12.this;
                        super();
                    }
        }

    }

}
