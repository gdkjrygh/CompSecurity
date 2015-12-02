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
    implements com.qihoo.security.malware.V3._cls1
{

    final VirusScanFragmentV3 a;

    private void a(List list)
    {
        while (!a.isAdded() || com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a) != 2) 
        {
            return;
        }
        obj = new Thread(new Runnable() {

            final VirusScanFragmentV3._cls1 a;

            public void run()
            {
                while (!a.a.isAdded() || com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a.a) != 2) 
                {
                    return;
                }
                (new Thread(this) {

                    final _cls9 a;

                    public void run()
                    {
                        long l = System.currentTimeMillis();
                        SharedPref.a(VirusScanFragmentV3.h(a.a.a), "malware_scan_time", l);
                        SharedPref.a(VirusScanFragmentV3.h(a.a.a), "malware_fast_scan_time", l);
                    }

            
            {
                a = _pcls9;
                super();
            }
                }).start();
                int ai[] = VirusScanFragmentV3.I(a.a);
                int ai1[] = com.qihoo.security.ui.antivirus.VirusScanFragmentV3.b(a.a);
                int i = VirusScanFragmentV3.J(a.a);
                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.b(a.a, false);
                VirusScanFragmentV3.H(a.a).postDelayed(new Runnable(this) {

                    final _cls9 a;

                    public void run()
                    {
                        VirusScanFragmentV3.K(a.a.a);
                    }

            
            {
                a = _pcls9;
                super();
            }
                }, 10L);
                com.qihoo.security.support.b.b(14006, VirusScanFragmentV3.L(a.a));
                if (ai[3] > 0)
                {
                    if (VirusScanFragmentV3.M(a.a)[1] > 0)
                    {
                        com.qihoo.security.support.b.c(14029);
                    }
                    com.qihoo.security.support.b.c(14007);
                }
                com.qihoo.security.support.b.b(14009, ai[3]);
                if (ai[1] > 0)
                {
                    com.qihoo.security.support.b.c(14011);
                }
                com.qihoo.security.support.b.b(14013, ai[1]);
                if (ai1[0] > 0)
                {
                    com.qihoo.security.support.b.c(14014);
                }
                com.qihoo.security.support.b.b(14016, ai1[0]);
                if (i > 0)
                {
                    com.qihoo.security.support.b.c(14017);
                }
                if (ai[2] > 0)
                {
                    com.qihoo.security.support.b.c(14021);
                    if (!VirusScanFragmentV3.i(a.a))
                    {
                        com.qihoo.security.support.b.c(14024);
                    }
                }
                com.qihoo.security.support.b.b(14023, ai[2]);
            }

            
            {
                a = VirusScanFragmentV3._cls1.this;
                super();
            }
        });
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

    public void a(com.qihoo.security.malware.V3._cls1 _pcls1)
    {
        com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a, System.currentTimeMillis());
        (new Thread() {

            final VirusScanFragmentV3._cls1 a;

            public void run()
            {
                SharedPref.a(VirusScanFragmentV3.h(a.a), "malware_is_scanning", false);
            }

            
            {
                a = VirusScanFragmentV3._cls1.this;
                super();
            }
        }).start();
        com.qihoo.security.ui.antivirus.VirusScanFragmentV3.b(a, false);
        com.qihoo.security.ui.antivirus.VirusScanFragmentV3.c(a, true);
        com.qihoo.security.support.b.a(14317, "0", (new StringBuilder()).append(_pcls1.a).append("").toString());
        VirusScanFragmentV3.H(a).postDelayed(new Runnable() {

            final VirusScanFragmentV3._cls1 a;

            public void run()
            {
                VirusScanFragmentV3.G(a.a);
            }

            
            {
                a = VirusScanFragmentV3._cls1.this;
                super();
            }
        }, 10L);
    }

    public void a(com.qihoo.security.malware.V3._cls1 _pcls1)
    {
        while (!a.isAdded() || com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a) != 2) 
        {
            return;
        }
        if (com.qihoo.security.ui.antivirus.VirusScanFragmentV3.b(a)[0] > 0)
        {
            VirusScanFragmentV3.g(a).runOnUiThread(new Runnable() {

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
            });
        }
        _pcls1 = (MaliciousInfo)_pcls1._fld1.get(0);
        if (((MaliciousInfo) (_pcls1)).state == 127 && _pcls1.isWarning() && c.a(VirusScanFragmentV3.h(a), _pcls1))
        {
            _pcls1.riskClass = 0;
        }
        if (((MaliciousInfo) (_pcls1)).state == 127 && _pcls1.isWarning() && (!((MaliciousInfo) (_pcls1)).isSystem || !com.qihoo360.mobilesafe.b.a.b(VirusScanFragmentV3.h(a), ((MaliciousInfo) (_pcls1)).packageName) || VirusScanFragmentV3.i(a)))
        {
            SharedPref.a(VirusScanFragmentV3.h(a), "malware_find_issue_time", System.currentTimeMillis());
            VirusScanFragmentV3.g(a).runOnUiThread(new Runnable() {

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
            });
        }
        if (((MaliciousInfo) (_pcls1)).state == 127 && _pcls1.isMalware() && (!((MaliciousInfo) (_pcls1)).isSystem || !com.qihoo360.mobilesafe.b.a.b(VirusScanFragmentV3.h(a), ((MaliciousInfo) (_pcls1)).packageName) || VirusScanFragmentV3.i(a)))
        {
            (new Thread() {

                final VirusScanFragmentV3._cls1 a;

                public void run()
                {
                    SharedPref.a(VirusScanFragmentV3.h(a.a), "malware_find_issue_time", System.currentTimeMillis());
                }

            
            {
                a = VirusScanFragmentV3._cls1.this;
                super();
            }
            }).start();
            VirusScanFragmentV3.g(a).runOnUiThread(new Runnable() {

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
            });
        }
        if (((MaliciousInfo) (_pcls1)).state == 127 && _pcls1.isTrojan() && (!((MaliciousInfo) (_pcls1)).isSystem || !com.qihoo360.mobilesafe.b.a.b(VirusScanFragmentV3.h(a), ((MaliciousInfo) (_pcls1)).packageName) || VirusScanFragmentV3.i(a)) && _pcls1.isFileExist())
        {
            (new Thread() {

                final VirusScanFragmentV3._cls1 a;

                public void run()
                {
                    SharedPref.a(VirusScanFragmentV3.h(a.a), "malware_find_issue_time", System.currentTimeMillis());
                }

            
            {
                a = VirusScanFragmentV3._cls1.this;
                super();
            }
            }).start();
            VirusScanFragmentV3.g(a).runOnUiThread(new Runnable() {

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
            });
        }
        VirusScanFragmentV3.g(a).runOnUiThread(new Runnable() {

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
        });
    }

    public void b(com.qihoo.security.malware.V3._cls1 _pcls1)
    {
        if (a.isAdded() && com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a) == 2)
        {
            if (com.qihoo.security.ui.antivirus.VirusScanFragmentV3.b(a)[0] > 0)
            {
                VirusScanFragmentV3.g(a).runOnUiThread(new Runnable() {

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
                });
            }
            Iterator iterator = _pcls1._fld1.iterator();
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
                    VirusScanFragmentV3.g(a).runOnUiThread(new Runnable() {

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
                    });
                }
                if (maliciousinfo.state == 127 && maliciousinfo.isMalware() && (!maliciousinfo.isSystem || !com.qihoo360.mobilesafe.b.a.b(VirusScanFragmentV3.h(a), maliciousinfo.packageName) || VirusScanFragmentV3.i(a)) && !c.a(VirusScanFragmentV3.h(a), maliciousinfo) && maliciousinfo.isFileExist())
                {
                    (new Thread() {

                        final VirusScanFragmentV3._cls1 a;

                        public void run()
                        {
                            SharedPref.a(VirusScanFragmentV3.h(a.a), "malware_find_issue_time", System.currentTimeMillis());
                        }

            
            {
                a = VirusScanFragmentV3._cls1.this;
                super();
            }
                    }).start();
                    VirusScanFragmentV3.g(a).runOnUiThread(new Runnable() {

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
                    });
                }
                if (maliciousinfo.state == 127 && maliciousinfo.isTrojan() && (!maliciousinfo.isSystem || !com.qihoo360.mobilesafe.b.a.b(VirusScanFragmentV3.h(a), maliciousinfo.packageName) || VirusScanFragmentV3.i(a)) && !c.a(VirusScanFragmentV3.h(a), maliciousinfo) && maliciousinfo.isFileExist())
                {
                    (new Thread() {

                        final VirusScanFragmentV3._cls1 a;

                        public void run()
                        {
                            SharedPref.a(VirusScanFragmentV3.h(a.a), "malware_find_issue_time", System.currentTimeMillis());
                        }

            
            {
                a = VirusScanFragmentV3._cls1.this;
                super();
            }
                    }).start();
                    VirusScanFragmentV3.g(a).runOnUiThread(new Runnable() {

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
                    });
                }
            } while (true);
            if (!_pcls1._fld1)
            {
                if (VirusScanFragmentV3.v(a).ages(6))
                {
                    VirusScanFragmentV3.w(a).essages(6);
                }
                if (VirusScanFragmentV3.x(a).ages(7))
                {
                    VirusScanFragmentV3.y(a).essages(7);
                }
                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a, System.currentTimeMillis());
                if (!VirusScanFragmentV3.z(a))
                {
                    com.qihoo.security.support.b.a(14315, String.valueOf(VirusScanFragmentV3.A(a) - VirusScanFragmentV3.B(a)), String.valueOf(100), (new StringBuilder()).append(String.valueOf(VirusScanFragmentV3.C(a))).append("|").append(com.qihoo.security.locale.language.b.d(VirusScanFragmentV3.h(a))).append("|").append(VirusScanFragmentV3.D(a).f()).append("|").append(System.currentTimeMillis() - VirusScanFragmentV3.E(a)).toString());
                } else
                {
                    com.qihoo.security.support.b.a(14316, String.valueOf(VirusScanFragmentV3.A(a) - VirusScanFragmentV3.B(a)), String.valueOf(100), (new StringBuilder()).append(String.valueOf(VirusScanFragmentV3.C(a))).append("|").append(com.qihoo.security.locale.language.b.d(VirusScanFragmentV3.h(a))).append("|").append(VirusScanFragmentV3.D(a).f()).append("|").append(System.currentTimeMillis() - VirusScanFragmentV3.E(a)).toString());
                }
                a(_pcls1.a);
                if (SharedPref.b(VirusScanFragmentV3.h(a), "malware_last_scan_time", -1L) == -1L)
                {
                    SharedPref.a(VirusScanFragmentV3.h(a), "malware_last_scan_time", System.currentTimeMillis() - VirusScanFragmentV3.F(a));
                }
                (new Thread() {

                    final VirusScanFragmentV3._cls1 a;

                    public void run()
                    {
                        SharedPref.a(VirusScanFragmentV3.h(a.a), "malware_is_scanning", false);
                    }

            
            {
                a = VirusScanFragmentV3._cls1.this;
                super();
            }
                }).start();
                com.qihoo.utils.notice.a.a().b(4100);
                return;
            }
        }
    }

    _cls9.a(VirusScanFragmentV3 virusscanfragmentv3)
    {
        a = virusscanfragmentv3;
        super();
    }
}
