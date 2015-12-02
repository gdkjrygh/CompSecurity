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
    implements com.qihoo.security.malware._cls3._cls12
{

    final VirusScanFragmentV3 a;

    private void a(List list)
    {
        while (!a.isAdded() || com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a) != 3) 
        {
            return;
        }
        obj = new Thread(new Runnable() {

            final VirusScanFragmentV3._cls12 a;

            public void run()
            {
                while (!a.a.isAdded() || com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a.a) != 3) 
                {
                    return;
                }
                (new Thread(this) {

                    final _cls5 a;

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
                }).start();
                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.b(a.a, false);
                VirusScanFragmentV3.H(a.a).postDelayed(new Runnable(this) {

                    final _cls5 a;

                    public void run()
                    {
                        VirusScanFragmentV3.K(a.a.a);
                    }

            
            {
                a = _pcls5;
                super();
            }
                }, 10L);
            }

            
            {
                a = VirusScanFragmentV3._cls12.this;
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

    public void a(com.qihoo.security.malware._cls3._cls12 _pcls12)
    {
        com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a, System.currentTimeMillis());
        (new Thread() {

            final VirusScanFragmentV3._cls12 a;

            public void run()
            {
                SharedPref.a(VirusScanFragmentV3.h(a.a), "malware_is_scanning", false);
            }

            
            {
                a = VirusScanFragmentV3._cls12.this;
                super();
            }
        }).start();
        com.qihoo.security.ui.antivirus.VirusScanFragmentV3.b(a, false);
        com.qihoo.security.ui.antivirus.VirusScanFragmentV3.c(a, true);
        com.qihoo.security.support.b.a(14317, "1", (new StringBuilder()).append(_pcls12.a).append("").toString());
        VirusScanFragmentV3.H(a).postDelayed(new Runnable() {

            final VirusScanFragmentV3._cls12 a;

            public void run()
            {
                VirusScanFragmentV3.G(a.a);
            }

            
            {
                a = VirusScanFragmentV3._cls12.this;
                super();
            }
        }, 10L);
    }

    public void a(com.qihoo.security.malware._cls3._cls12 _pcls12)
    {
        while (!a.isAdded() || com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a) != 3) 
        {
            return;
        }
        if (com.qihoo.security.ui.antivirus.VirusScanFragmentV3.b(a)[0] > 0)
        {
            VirusScanFragmentV3.g(a).runOnUiThread(new Runnable() {

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
            });
        }
        _pcls12 = (MaliciousInfo)_pcls12._fld12.get(0);
        if (((MaliciousInfo) (_pcls12)).state == 127 && _pcls12.isWarning() && c.a(VirusScanFragmentV3.h(a), _pcls12))
        {
            _pcls12.riskClass = 0;
        }
        VirusScanFragmentV3.g(a).runOnUiThread(new Runnable() {

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
        });
    }

    public void b(com.qihoo.security.malware._cls3._cls12 _pcls12)
    {
        if (a.isAdded() && com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a) == 3)
        {
            if (com.qihoo.security.ui.antivirus.VirusScanFragmentV3.b(a)[0] > 0)
            {
                VirusScanFragmentV3.g(a).runOnUiThread(new Runnable() {

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
                });
            }
            Iterator iterator = _pcls12._fld12.iterator();
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
                    (new Thread() {

                        final VirusScanFragmentV3._cls12 a;

                        public void run()
                        {
                            SharedPref.a(VirusScanFragmentV3.h(a.a), "malware_find_issue_time", System.currentTimeMillis());
                        }

            
            {
                a = VirusScanFragmentV3._cls12.this;
                super();
            }
                    }).start();
                    VirusScanFragmentV3.g(a).runOnUiThread(new Runnable() {

                        final VirusScanFragmentV3._cls12 a;

                        public void run()
                        {
                            if (com.qihoo.security.ui.antivirus.VirusScanFragmentV3.c(a.a) != com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER)
                            {
                                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a.a, true);
                                if (VirusScanFragmentV3.P(a.a).hasMessages(0))
                                {
                                    VirusScanFragmentV3.Q(a.a).removeMessages(0);
                                }
                                VirusScanFragmentV3.f(a.a);
                            }
                        }

            
            {
                a = VirusScanFragmentV3._cls12.this;
                super();
            }
                    });
                }
                if (maliciousinfo.state == 127 && maliciousinfo.isMalware() && (!maliciousinfo.isSystem || !com.qihoo360.mobilesafe.b.a.b(VirusScanFragmentV3.h(a), maliciousinfo.packageName) || VirusScanFragmentV3.i(a)) && !c.a(VirusScanFragmentV3.h(a), maliciousinfo) && maliciousinfo.isFileExist())
                {
                    (new Thread() {

                        final VirusScanFragmentV3._cls12 a;

                        public void run()
                        {
                            SharedPref.a(VirusScanFragmentV3.h(a.a), "malware_find_issue_time", System.currentTimeMillis());
                        }

            
            {
                a = VirusScanFragmentV3._cls12.this;
                super();
            }
                    }).start();
                    VirusScanFragmentV3.g(a).runOnUiThread(new Runnable() {

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
                    });
                }
                if (maliciousinfo.state == 127 && maliciousinfo.isTrojan() && (!maliciousinfo.isSystem || !com.qihoo360.mobilesafe.b.a.b(VirusScanFragmentV3.h(a), maliciousinfo.packageName) || VirusScanFragmentV3.i(a)) && !c.a(VirusScanFragmentV3.h(a), maliciousinfo) && maliciousinfo.isFileExist())
                {
                    (new Thread() {

                        final VirusScanFragmentV3._cls12 a;

                        public void run()
                        {
                            SharedPref.a(VirusScanFragmentV3.h(a.a), "malware_find_issue_time", System.currentTimeMillis());
                        }

            
            {
                a = VirusScanFragmentV3._cls12.this;
                super();
            }
                    }).start();
                    VirusScanFragmentV3.g(a).runOnUiThread(new Runnable() {

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
                    });
                }
            } while (true);
            if (!_pcls12._fld12)
            {
                if (VirusScanFragmentV3.V(a).ges(6))
                {
                    VirusScanFragmentV3.W(a).ssages(6);
                }
                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a, System.currentTimeMillis());
                if (!VirusScanFragmentV3.z(a))
                {
                    com.qihoo.security.support.b.a(14331, String.valueOf(VirusScanFragmentV3.A(a) - VirusScanFragmentV3.B(a)), String.valueOf(100), (new StringBuilder()).append(String.valueOf(VirusScanFragmentV3.C(a))).append("|").append(com.qihoo.security.locale.language.b.d(VirusScanFragmentV3.h(a))).append("|").append(VirusScanFragmentV3.D(a).f()).append("|").append(System.currentTimeMillis() - VirusScanFragmentV3.E(a)).toString());
                } else
                {
                    com.qihoo.security.support.b.a(14332, String.valueOf(VirusScanFragmentV3.A(a) - VirusScanFragmentV3.B(a)), String.valueOf(100), (new StringBuilder()).append(String.valueOf(VirusScanFragmentV3.C(a))).append("|").append(com.qihoo.security.locale.language.b.d(VirusScanFragmentV3.h(a))).append("|").append(VirusScanFragmentV3.D(a).f()).append("|").append(System.currentTimeMillis() - VirusScanFragmentV3.E(a)).toString());
                }
                a(_pcls12.a);
                SharedPref.a(VirusScanFragmentV3.h(a), "malware_last_scan_time", System.currentTimeMillis() - VirusScanFragmentV3.F(a));
                (new Thread() {

                    final VirusScanFragmentV3._cls12 a;

                    public void run()
                    {
                        SharedPref.a(VirusScanFragmentV3.h(a.a), "malware_is_scanning", false);
                    }

            
            {
                a = VirusScanFragmentV3._cls12.this;
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
