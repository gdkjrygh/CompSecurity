// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Message;
import android.os.PowerManager;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.f;
import android.support.v4.app.h;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.nineoldandroids.a.k;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.alasticbutton.ElasticImageButton;
import com.qihoo.security.engine.cloudscan.SampleDetector;
import com.qihoo.security.leak.c;
import com.qihoo.security.leak.d;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.malware.vo.MaliciousInfo;
import com.qihoo.security.malware.widget.RadarProgressBar;
import com.qihoo.security.malware.widget.RadarView;
import com.qihoo.security.recommend.RecommendHelper;
import com.qihoo.security.service.PackageMonitorService;
import com.qihoo.security.support.b;
import com.qihoo.security.ui.antivirus.list.VirusListActivity;
import com.qihoo.security.ui.fragment.utils.FragmentAction;
import com.qihoo.security.ui.main.BaseHomeFragment;
import com.qihoo.security.ui.main.FragmentsObservable;
import com.qihoo.security.ui.main.a;
import com.qihoo.security.ui.result.view.VirusResultFragment;
import com.qihoo360.common.utils.FileUtil;
import com.qihoo360.common.utils.NativeLoader;
import com.qihoo360.mobilesafe.b.e;
import com.qihoo360.mobilesafe.b.g;
import com.qihoo360.mobilesafe.b.r;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.qihoo.security.ui.antivirus:
//            ScanButtonTopView

public class VirusScanFragmentV3 extends BaseHomeFragment
    implements android.view.View.OnClickListener, com.qihoo.security.malware.widget.RadarView.a, com.qihoo360.mobilesafe.b.e.a
{
    private static class a
        implements com.qihoo.security.malware.a.c
    {

        private final WeakReference a;

        public void a()
        {
            VirusScanFragmentV3 virusscanfragmentv3 = (VirusScanFragmentV3)a.get();
            if (virusscanfragmentv3 != null)
            {
                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(virusscanfragmentv3, true);
            }
        }

        public a(VirusScanFragmentV3 virusscanfragmentv3)
        {
            a = new WeakReference(virusscanfragmentv3);
        }
    }


    private static boolean k = false;
    private android.widget.LinearLayout.LayoutParams A;
    private List B;
    private g C;
    private boolean D;
    private boolean E;
    private final boolean F = false;
    private boolean G;
    private boolean H;
    private e I;
    private String J[];
    private int K;
    private String L;
    private String M;
    private boolean N;
    private int O;
    private int P;
    private com.qihoo.security.malware.vo.a Q;
    private boolean R;
    private int S;
    private int T;
    private int U;
    private int V;
    private boolean W;
    private int X[];
    private int Y[];
    private final int Z = 252;
    View a;
    private int aA;
    private long aB;
    private boolean aC;
    private boolean aD;
    private int aE;
    private long aF;
    private Random aG;
    private final com.qihoo.security.malware.a.e aH = new com.qihoo.security.malware.a.e() {

        final VirusScanFragmentV3 a;

        private void a(List list)
        {
            while (!a.isAdded() || com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a) != 2) 
            {
                return;
            }
            obj = new Thread(new Runnable(this) {

                final _cls1 a;

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
                            long l1 = System.currentTimeMillis();
                            SharedPref.a(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a.a.a), "malware_scan_time", l1);
                            SharedPref.a(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a.a.a), "malware_fast_scan_time", l1);
                        }

            
            {
                a = _pcls9;
                super();
            }
                    }).start();
                    int ai1[] = VirusScanFragmentV3.I(a.a);
                    int ai2[] = com.qihoo.security.ui.antivirus.VirusScanFragmentV3.b(a.a);
                    int i1 = VirusScanFragmentV3.J(a.a);
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
                    if (ai1[3] > 0)
                    {
                        if (VirusScanFragmentV3.M(a.a)[1] > 0)
                        {
                            com.qihoo.security.support.b.c(14029);
                        }
                        com.qihoo.security.support.b.c(14007);
                    }
                    com.qihoo.security.support.b.b(14009, ai1[3]);
                    if (ai1[1] > 0)
                    {
                        com.qihoo.security.support.b.c(14011);
                    }
                    com.qihoo.security.support.b.b(14013, ai1[1]);
                    if (ai2[0] > 0)
                    {
                        com.qihoo.security.support.b.c(14014);
                    }
                    com.qihoo.security.support.b.b(14016, ai2[0]);
                    if (i1 > 0)
                    {
                        com.qihoo.security.support.b.c(14017);
                    }
                    if (ai1[2] > 0)
                    {
                        com.qihoo.security.support.b.c(14021);
                        if (!VirusScanFragmentV3.i(a.a))
                        {
                            com.qihoo.security.support.b.c(14024);
                        }
                    }
                    com.qihoo.security.support.b.b(14023, ai1[2]);
                }

            
            {
                a = _pcls1;
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

        public void a(com.qihoo.security.malware.a.a a1)
        {
            com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a, System.currentTimeMillis());
            (new Thread(this) {

                final _cls1 a;

                public void run()
                {
                    SharedPref.a(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a.a), "malware_is_scanning", false);
                }

            
            {
                a = _pcls1;
                super();
            }
            }).start();
            com.qihoo.security.ui.antivirus.VirusScanFragmentV3.b(a, false);
            com.qihoo.security.ui.antivirus.VirusScanFragmentV3.c(a, true);
            com.qihoo.security.support.b.a(14317, "0", (new StringBuilder()).append(a1.a).append("").toString());
            VirusScanFragmentV3.H(a).postDelayed(new Runnable(this) {

                final _cls1 a;

                public void run()
                {
                    VirusScanFragmentV3.G(a.a);
                }

            
            {
                a = _pcls1;
                super();
            }
            }, 10L);
        }

        public void a(com.qihoo.security.malware.a.d d1)
        {
            while (!a.isAdded() || com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a) != 2) 
            {
                return;
            }
            if (com.qihoo.security.ui.antivirus.VirusScanFragmentV3.b(a)[0] > 0)
            {
                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.g(a).runOnUiThread(new Runnable(this) {

                    final _cls1 a;

                    public void run()
                    {
                        while (!a.a.isAdded() || com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a.a) != 2 || com.qihoo.security.ui.antivirus.VirusScanFragmentV3.c(a.a) == com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER) 
                        {
                            return;
                        }
                        a.a.a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.NEED_OPTIMIZE, true);
                        com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a.a, true);
                        if (com.qihoo.security.ui.antivirus.VirusScanFragmentV3.d(a.a).hasMessages(0))
                        {
                            com.qihoo.security.ui.antivirus.VirusScanFragmentV3.e(a.a).removeMessages(0);
                        }
                        com.qihoo.security.ui.antivirus.VirusScanFragmentV3.f(a.a);
                    }

            
            {
                a = _pcls1;
                super();
            }
                });
            }
            d1 = (MaliciousInfo)d1.b.get(0);
            if (((MaliciousInfo) (d1)).state == 127 && d1.isWarning() && com.qihoo.security.malware.db.c.a(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a), d1))
            {
                d1.riskClass = 0;
            }
            if (((MaliciousInfo) (d1)).state == 127 && d1.isWarning() && (!((MaliciousInfo) (d1)).isSystem || !com.qihoo360.mobilesafe.b.a.b(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a), ((MaliciousInfo) (d1)).packageName) || VirusScanFragmentV3.i(a)))
            {
                SharedPref.a(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a), "malware_find_issue_time", System.currentTimeMillis());
                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.g(a).runOnUiThread(new Runnable(this) {

                    final _cls1 a;

                    public void run()
                    {
                        if (com.qihoo.security.ui.antivirus.VirusScanFragmentV3.c(a.a) != com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER)
                        {
                            a.a.a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.NEED_OPTIMIZE, true);
                            com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a.a, true);
                            if (VirusScanFragmentV3.j(a.a).hasMessages(0))
                            {
                                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.k(a.a).removeMessages(0);
                            }
                            com.qihoo.security.ui.antivirus.VirusScanFragmentV3.f(a.a);
                        }
                    }

            
            {
                a = _pcls1;
                super();
            }
                });
            }
            if (((MaliciousInfo) (d1)).state == 127 && d1.isMalware() && (!((MaliciousInfo) (d1)).isSystem || !com.qihoo360.mobilesafe.b.a.b(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a), ((MaliciousInfo) (d1)).packageName) || VirusScanFragmentV3.i(a)))
            {
                (new Thread(this) {

                    final _cls1 a;

                    public void run()
                    {
                        SharedPref.a(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a.a), "malware_find_issue_time", System.currentTimeMillis());
                    }

            
            {
                a = _pcls1;
                super();
            }
                }).start();
                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.g(a).runOnUiThread(new Runnable(this) {

                    final _cls1 a;

                    public void run()
                    {
                        a.a.a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER, true);
                        com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a.a, true);
                        if (VirusScanFragmentV3.l(a.a).hasMessages(0))
                        {
                            VirusScanFragmentV3.m(a.a).removeMessages(0);
                        }
                        com.qihoo.security.ui.antivirus.VirusScanFragmentV3.f(a.a);
                    }

            
            {
                a = _pcls1;
                super();
            }
                });
            }
            if (((MaliciousInfo) (d1)).state == 127 && d1.isTrojan() && (!((MaliciousInfo) (d1)).isSystem || !com.qihoo360.mobilesafe.b.a.b(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a), ((MaliciousInfo) (d1)).packageName) || VirusScanFragmentV3.i(a)) && d1.isFileExist())
            {
                (new Thread(this) {

                    final _cls1 a;

                    public void run()
                    {
                        SharedPref.a(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a.a), "malware_find_issue_time", System.currentTimeMillis());
                    }

            
            {
                a = _pcls1;
                super();
            }
                }).start();
                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.g(a).runOnUiThread(new Runnable(this) {

                    final _cls1 a;

                    public void run()
                    {
                        a.a.a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER, true);
                        com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a.a, true);
                        if (VirusScanFragmentV3.n(a.a).hasMessages(0))
                        {
                            VirusScanFragmentV3.o(a.a).removeMessages(0);
                        }
                        com.qihoo.security.ui.antivirus.VirusScanFragmentV3.f(a.a);
                    }

            
            {
                a = _pcls1;
                super();
            }
                });
            }
            com.qihoo.security.ui.antivirus.VirusScanFragmentV3.g(a).runOnUiThread(new Runnable(this) {

                final _cls1 a;

                public void run()
                {
                    while (!a.a.isAdded() || com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a.a) == 2) 
                    {
                        return;
                    }
                }

            
            {
                a = _pcls1;
                super();
            }
            });
        }

        public void b(com.qihoo.security.malware.a.d d1)
        {
            if (a.isAdded() && com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a) == 2)
            {
                if (com.qihoo.security.ui.antivirus.VirusScanFragmentV3.b(a)[0] > 0)
                {
                    com.qihoo.security.ui.antivirus.VirusScanFragmentV3.g(a).runOnUiThread(new Runnable(this) {

                        final _cls1 a;

                        public void run()
                        {
                            while (!a.a.isAdded() || com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a.a) == 2) 
                            {
                                return;
                            }
                        }

            
            {
                a = _pcls1;
                super();
            }
                    });
                }
                Iterator iterator = d1.b.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    MaliciousInfo maliciousinfo = (MaliciousInfo)iterator.next();
                    if (maliciousinfo.state == 127 && maliciousinfo.isWarning() && com.qihoo.security.malware.db.c.a(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a), maliciousinfo))
                    {
                        maliciousinfo.riskClass = 0;
                    }
                    if (maliciousinfo.state == 127 && maliciousinfo.isWarning())
                    {
                        com.qihoo.security.ui.antivirus.VirusScanFragmentV3.g(a).runOnUiThread(new Runnable(this) {

                            final _cls1 a;

                            public void run()
                            {
                                if (com.qihoo.security.ui.antivirus.VirusScanFragmentV3.c(a.a) != com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER)
                                {
                                    com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a.a, true);
                                    if (VirusScanFragmentV3.p(a.a).hasMessages(0))
                                    {
                                        VirusScanFragmentV3.q(a.a).removeMessages(0);
                                    }
                                    com.qihoo.security.ui.antivirus.VirusScanFragmentV3.f(a.a);
                                }
                            }

            
            {
                a = _pcls1;
                super();
            }
                        });
                    }
                    if (maliciousinfo.state == 127 && maliciousinfo.isMalware() && (!maliciousinfo.isSystem || !com.qihoo360.mobilesafe.b.a.b(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a), maliciousinfo.packageName) || VirusScanFragmentV3.i(a)) && !com.qihoo.security.malware.db.c.a(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a), maliciousinfo) && maliciousinfo.isFileExist())
                    {
                        (new Thread(this) {

                            final _cls1 a;

                            public void run()
                            {
                                SharedPref.a(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a.a), "malware_find_issue_time", System.currentTimeMillis());
                            }

            
            {
                a = _pcls1;
                super();
            }
                        }).start();
                        com.qihoo.security.ui.antivirus.VirusScanFragmentV3.g(a).runOnUiThread(new Runnable(this) {

                            final _cls1 a;

                            public void run()
                            {
                                a.a.a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER, true);
                                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a.a, true);
                                if (com.qihoo.security.ui.antivirus.VirusScanFragmentV3.r(a.a).hasMessages(0))
                                {
                                    VirusScanFragmentV3.s(a.a).removeMessages(0);
                                }
                                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.f(a.a);
                            }

            
            {
                a = _pcls1;
                super();
            }
                        });
                    }
                    if (maliciousinfo.state == 127 && maliciousinfo.isTrojan() && (!maliciousinfo.isSystem || !com.qihoo360.mobilesafe.b.a.b(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a), maliciousinfo.packageName) || VirusScanFragmentV3.i(a)) && !com.qihoo.security.malware.db.c.a(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a), maliciousinfo) && maliciousinfo.isFileExist())
                    {
                        (new Thread(this) {

                            final _cls1 a;

                            public void run()
                            {
                                SharedPref.a(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a.a), "malware_find_issue_time", System.currentTimeMillis());
                            }

            
            {
                a = _pcls1;
                super();
            }
                        }).start();
                        com.qihoo.security.ui.antivirus.VirusScanFragmentV3.g(a).runOnUiThread(new Runnable(this) {

                            final _cls1 a;

                            public void run()
                            {
                                a.a.a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER, true);
                                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a.a, true);
                                if (VirusScanFragmentV3.t(a.a).hasMessages(0))
                                {
                                    VirusScanFragmentV3.u(a.a).removeMessages(0);
                                }
                                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.f(a.a);
                            }

            
            {
                a = _pcls1;
                super();
            }
                        });
                    }
                } while (true);
                if (!d1.a)
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
                        com.qihoo.security.support.b.a(14315, String.valueOf(VirusScanFragmentV3.A(a) - VirusScanFragmentV3.B(a)), String.valueOf(100), (new StringBuilder()).append(String.valueOf(VirusScanFragmentV3.C(a))).append("|").append(com.qihoo.security.locale.language.b.d(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a))).append("|").append(VirusScanFragmentV3.D(a).f()).append("|").append(System.currentTimeMillis() - VirusScanFragmentV3.E(a)).toString());
                    } else
                    {
                        com.qihoo.security.support.b.a(14316, String.valueOf(VirusScanFragmentV3.A(a) - VirusScanFragmentV3.B(a)), String.valueOf(100), (new StringBuilder()).append(String.valueOf(VirusScanFragmentV3.C(a))).append("|").append(com.qihoo.security.locale.language.b.d(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a))).append("|").append(VirusScanFragmentV3.D(a).f()).append("|").append(System.currentTimeMillis() - VirusScanFragmentV3.E(a)).toString());
                    }
                    a(d1.b);
                    if (SharedPref.b(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a), "malware_last_scan_time", -1L) == -1L)
                    {
                        SharedPref.a(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a), "malware_last_scan_time", System.currentTimeMillis() - VirusScanFragmentV3.F(a));
                    }
                    (new Thread(this) {

                        final _cls1 a;

                        public void run()
                        {
                            SharedPref.a(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a.a), "malware_is_scanning", false);
                        }

            
            {
                a = _pcls1;
                super();
            }
                    }).start();
                    com.qihoo.utils.notice.a.a().b(4100);
                    return;
                }
            }
        }

            
            {
                a = VirusScanFragmentV3.this;
                super();
            }
    };
    private final com.qihoo.security.malware.a.e aI = new com.qihoo.security.malware.a.e() {

        final VirusScanFragmentV3 a;

        private void a(List list)
        {
            while (!a.isAdded() || com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a) != 3) 
            {
                return;
            }
            obj = new Thread(new Runnable(this) {

                final _cls12 a;

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
                            long l1 = System.currentTimeMillis();
                            SharedPref.a(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a.a.a), "malware_scan_time", l1);
                            SharedPref.a(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a.a.a), "malware_full_scan_time", l1);
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
                a = _pcls12;
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

        public void a(com.qihoo.security.malware.a.a a1)
        {
            com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a, System.currentTimeMillis());
            (new Thread(this) {

                final _cls12 a;

                public void run()
                {
                    SharedPref.a(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a.a), "malware_is_scanning", false);
                }

            
            {
                a = _pcls12;
                super();
            }
            }).start();
            com.qihoo.security.ui.antivirus.VirusScanFragmentV3.b(a, false);
            com.qihoo.security.ui.antivirus.VirusScanFragmentV3.c(a, true);
            com.qihoo.security.support.b.a(14317, "1", (new StringBuilder()).append(a1.a).append("").toString());
            VirusScanFragmentV3.H(a).postDelayed(new Runnable(this) {

                final _cls12 a;

                public void run()
                {
                    VirusScanFragmentV3.G(a.a);
                }

            
            {
                a = _pcls12;
                super();
            }
            }, 10L);
        }

        public void a(com.qihoo.security.malware.a.d d1)
        {
            while (!a.isAdded() || com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a) != 3) 
            {
                return;
            }
            if (com.qihoo.security.ui.antivirus.VirusScanFragmentV3.b(a)[0] > 0)
            {
                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.g(a).runOnUiThread(new Runnable(this) {

                    final _cls12 a;

                    public void run()
                    {
                        while (!a.a.isAdded() || com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a.a) == 3) 
                        {
                            return;
                        }
                    }

            
            {
                a = _pcls12;
                super();
            }
                });
            }
            d1 = (MaliciousInfo)d1.b.get(0);
            if (((MaliciousInfo) (d1)).state == 127 && d1.isWarning() && com.qihoo.security.malware.db.c.a(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a), d1))
            {
                d1.riskClass = 0;
            }
            com.qihoo.security.ui.antivirus.VirusScanFragmentV3.g(a).runOnUiThread(new Runnable(this) {

                final _cls12 a;

                public void run()
                {
                    while (!a.a.isAdded() || com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a.a) == 3) 
                    {
                        return;
                    }
                }

            
            {
                a = _pcls12;
                super();
            }
            });
        }

        public void b(com.qihoo.security.malware.a.d d1)
        {
            if (a.isAdded() && com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a) == 3)
            {
                if (com.qihoo.security.ui.antivirus.VirusScanFragmentV3.b(a)[0] > 0)
                {
                    com.qihoo.security.ui.antivirus.VirusScanFragmentV3.g(a).runOnUiThread(new Runnable(this) {

                        final _cls12 a;

                        public void run()
                        {
                            while (!a.a.isAdded() || com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a.a) == 3) 
                            {
                                return;
                            }
                        }

            
            {
                a = _pcls12;
                super();
            }
                    });
                }
                Iterator iterator = d1.b.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    MaliciousInfo maliciousinfo = (MaliciousInfo)iterator.next();
                    if (maliciousinfo.state == 127 && maliciousinfo.isWarning() && com.qihoo.security.malware.db.c.a(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a), maliciousinfo))
                    {
                        maliciousinfo.riskClass = 0;
                    }
                    if (maliciousinfo.state == 127 && maliciousinfo.isWarning())
                    {
                        (new Thread(this) {

                            final _cls12 a;

                            public void run()
                            {
                                SharedPref.a(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a.a), "malware_find_issue_time", System.currentTimeMillis());
                            }

            
            {
                a = _pcls12;
                super();
            }
                        }).start();
                        com.qihoo.security.ui.antivirus.VirusScanFragmentV3.g(a).runOnUiThread(new Runnable(this) {

                            final _cls12 a;

                            public void run()
                            {
                                if (com.qihoo.security.ui.antivirus.VirusScanFragmentV3.c(a.a) != com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER)
                                {
                                    com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a.a, true);
                                    if (VirusScanFragmentV3.P(a.a).hasMessages(0))
                                    {
                                        VirusScanFragmentV3.Q(a.a).removeMessages(0);
                                    }
                                    com.qihoo.security.ui.antivirus.VirusScanFragmentV3.f(a.a);
                                }
                            }

            
            {
                a = _pcls12;
                super();
            }
                        });
                    }
                    if (maliciousinfo.state == 127 && maliciousinfo.isMalware() && (!maliciousinfo.isSystem || !com.qihoo360.mobilesafe.b.a.b(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a), maliciousinfo.packageName) || VirusScanFragmentV3.i(a)) && !com.qihoo.security.malware.db.c.a(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a), maliciousinfo) && maliciousinfo.isFileExist())
                    {
                        (new Thread(this) {

                            final _cls12 a;

                            public void run()
                            {
                                SharedPref.a(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a.a), "malware_find_issue_time", System.currentTimeMillis());
                            }

            
            {
                a = _pcls12;
                super();
            }
                        }).start();
                        com.qihoo.security.ui.antivirus.VirusScanFragmentV3.g(a).runOnUiThread(new Runnable(this) {

                            final _cls12 a;

                            public void run()
                            {
                                a.a.a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER, true);
                                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a.a, true);
                                if (VirusScanFragmentV3.R(a.a).hasMessages(0))
                                {
                                    VirusScanFragmentV3.S(a.a).removeMessages(0);
                                }
                                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.f(a.a);
                            }

            
            {
                a = _pcls12;
                super();
            }
                        });
                    }
                    if (maliciousinfo.state == 127 && maliciousinfo.isTrojan() && (!maliciousinfo.isSystem || !com.qihoo360.mobilesafe.b.a.b(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a), maliciousinfo.packageName) || VirusScanFragmentV3.i(a)) && !com.qihoo.security.malware.db.c.a(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a), maliciousinfo) && maliciousinfo.isFileExist())
                    {
                        (new Thread(this) {

                            final _cls12 a;

                            public void run()
                            {
                                SharedPref.a(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a.a), "malware_find_issue_time", System.currentTimeMillis());
                            }

            
            {
                a = _pcls12;
                super();
            }
                        }).start();
                        com.qihoo.security.ui.antivirus.VirusScanFragmentV3.g(a).runOnUiThread(new Runnable(this) {

                            final _cls12 a;

                            public void run()
                            {
                                a.a.a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER, true);
                                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a.a, true);
                                if (VirusScanFragmentV3.T(a.a).hasMessages(0))
                                {
                                    VirusScanFragmentV3.U(a.a).removeMessages(0);
                                }
                                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.f(a.a);
                            }

            
            {
                a = _pcls12;
                super();
            }
                        });
                    }
                } while (true);
                if (!d1.a)
                {
                    if (VirusScanFragmentV3.V(a).hasMessages(6))
                    {
                        VirusScanFragmentV3.W(a).removeMessages(6);
                    }
                    com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a, System.currentTimeMillis());
                    if (!VirusScanFragmentV3.z(a))
                    {
                        com.qihoo.security.support.b.a(14331, String.valueOf(VirusScanFragmentV3.A(a) - VirusScanFragmentV3.B(a)), String.valueOf(100), (new StringBuilder()).append(String.valueOf(VirusScanFragmentV3.C(a))).append("|").append(com.qihoo.security.locale.language.b.d(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a))).append("|").append(VirusScanFragmentV3.D(a).f()).append("|").append(System.currentTimeMillis() - VirusScanFragmentV3.E(a)).toString());
                    } else
                    {
                        com.qihoo.security.support.b.a(14332, String.valueOf(VirusScanFragmentV3.A(a) - VirusScanFragmentV3.B(a)), String.valueOf(100), (new StringBuilder()).append(String.valueOf(VirusScanFragmentV3.C(a))).append("|").append(com.qihoo.security.locale.language.b.d(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a))).append("|").append(VirusScanFragmentV3.D(a).f()).append("|").append(System.currentTimeMillis() - VirusScanFragmentV3.E(a)).toString());
                    }
                    a(d1.b);
                    SharedPref.a(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a), "malware_last_scan_time", System.currentTimeMillis() - VirusScanFragmentV3.F(a));
                    (new Thread(this) {

                        final _cls12 a;

                        public void run()
                        {
                            SharedPref.a(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a.a), "malware_is_scanning", false);
                        }

            
            {
                a = _pcls12;
                super();
            }
                    }).start();
                    com.qihoo.utils.notice.a.a().b(4100);
                    return;
                }
            }
        }

            
            {
                a = VirusScanFragmentV3.this;
                super();
            }
    };
    private com.qihoo.security.ui.b.a.f aJ;
    private long aK;
    private long aL;
    private boolean aM;
    private boolean aN;
    private boolean aO;
    private final int aP = 0;
    private final int aQ = 2;
    private final int aR = 3;
    private final int aS = 4;
    private final int aT = 5;
    private final int aU = 6;
    private final int aV = 7;
    private final int aa = 270;
    private final int ab = 288;
    private final int ac = 306;
    private final int ad = 324;
    private final int ae = 342;
    private final int af = 359;
    private int ag;
    private int ah;
    private int ai;
    private int aj;
    private int ak;
    private float al[] = {
        252F, 270F, 288F, 306F, 324F, 342F, 359F
    };
    private float am[];
    private com.qihoo.security.malware.a an;
    private boolean ao;
    private int ap;
    private int aq;
    private com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus ar;
    private boolean as;
    private ExecutorService at;
    private ExecutorService au;
    private final byte av[] = new byte[0];
    private boolean aw;
    private boolean ax;
    private android.os.PowerManager.WakeLock ay;
    private boolean az;
    private Context l;
    private Activity m;
    private com.qihoo.security.locale.d n;
    private RadarView o;
    private ElasticImageButton p;
    private boolean q;
    private ScanButtonTopView r;
    private RadarProgressBar s;
    private LocaleTextView t;
    private LocaleTextView u;
    private LocaleTextView v;
    private LocaleTextView w;
    private LinearLayout x;
    private LinearLayout y;
    private android.widget.LinearLayout.LayoutParams z;

    public VirusScanFragmentV3()
    {
        C = null;
        D = false;
        E = false;
        G = false;
        H = false;
        I = null;
        K = 0;
        W = false;
        X = new int[7];
        Y = new int[7];
        ag = 252;
        ah = 270;
        ai = 288;
        aj = 306;
        ak = 0;
        am = (new float[] {
            (float)ag, (float)ah, (float)ai, (float)aj, (float)ak
        });
        ax = true;
        az = false;
        aC = false;
        aD = false;
        aE = 0;
        aF = 0L;
        aM = true;
        aO = false;
    }

    static long A(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.aK;
    }

    private int[] A()
    {
        int ai1[] = new int[2];
        if (!SharedPref.a("malware_is_scanning") && !SharedPref.a("malware_find_issue_time"))
        {
            return ai1;
        }
        Iterator iterator = com.qihoo.security.leak.d.a().c().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            c c1 = (c)iterator.next();
            if (!c1.c())
            {
                ai1[0] = ai1[0] + 1;
                if (c1.a().equals("leak_samsung_backup"))
                {
                    ai1[1] = ai1[1] + 1;
                }
                if (k && !c1.a().equals("leak_samsung_backup"))
                {
                    ai1[1] = ai1[1] + 1;
                }
            }
        } while (true);
        return ai1;
    }

    private int B()
    {
        return SharedPref.b(l, "setting_auto_start", true) ? 0 : 1;
    }

    static long B(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.aL;
    }

    static int C(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.V;
    }

    private void C()
    {
        if (v == null || v.getText() == null)
        {
            return;
        } else
        {
            String s1 = v.getText().toString();
            String s2 = (new StringBuilder()).append("RecommendType.").append(com.qihoo.security.recommend.RecommendHelper.RecommendType.Anitvirus.name()).toString();
            RecommendHelper.a().a(s2, s1);
            return;
        }
    }

    static com.qihoo.security.malware.a D(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.an;
    }

    private void D()
    {
        Intent intent = new Intent(l, com/qihoo/security/ui/antivirus/list/VirusListActivity);
        int i1;
        boolean flag;
        if (ar == com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER)
        {
            i1 = S;
        } else
        if (ar == com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.NEED_OPTIMIZE)
        {
            i1 = T;
        } else
        {
            i1 = U;
        }
        if (aq == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        intent.putExtra("is_deep_scan", flag);
        intent.putExtra("color", i1);
        startActivityForResult(intent, 10);
    }

    static long E(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.aF;
    }

    private void E()
    {
        w();
        M();
        c(com.qihoo.security.recommend.RecommendHelper.RecommendType.Anitvirus);
        a(false);
        t();
        a(true, true);
        J();
    }

    static long F(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.aB;
    }

    private void F()
    {
        B.clear();
        y.removeAllViews();
    }

    private int G()
    {
        int ai1[] = y();
        int ai2[] = A();
        int i1 = B();
        return ai1[0] + i1 + ai2[0];
    }

    static void G(VirusScanFragmentV3 virusscanfragmentv3)
    {
        virusscanfragmentv3.E();
    }

    static RadarView H(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.o;
    }

    private void H()
    {
        boolean flag = true;
        H = false;
        if (d())
        {
            if (ar == com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT && G() < 1)
            {
                if (aq != 3)
                {
                    flag = false;
                }
                d(flag);
            } else
            {
                (new Thread() {

                    final VirusScanFragmentV3 a;

                    public void run()
                    {
                        SharedPref.a(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a), "malware_find_issue_time", System.currentTimeMillis());
                    }

            
            {
                a = VirusScanFragmentV3.this;
                super();
            }
                }).start();
                D();
                E = false;
            }
        } else
        {
            H = true;
        }
        o.postDelayed(new Runnable() {

            final VirusScanFragmentV3 a;

            public void run()
            {
                VirusScanFragmentV3.am(a).b();
                VirusScanFragmentV3.i(a, false);
                VirusScanFragmentV3.an(a);
                VirusScanFragmentV3.ag(a).setVisibility(8);
            }

            
            {
                a = VirusScanFragmentV3.this;
                super();
            }
        }, 200L);
    }

    private void I()
    {
        J();
        ay.acquire();
    }

    static int[] I(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.y();
    }

    static int J(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.B();
    }

    private void J()
    {
        ay.setReferenceCounted(false);
        ay.release();
    }

    private void K()
    {
        SharedPref.a(l, "malware_scan_finish_time", System.currentTimeMillis());
        s.a(s.getProgress(), 359F, 300, new com.qihoo.security.malware.widget.RadarProgressBar.a() {

            final VirusScanFragmentV3 a;

            public void a()
            {
                VirusScanFragmentV3.am(a).a(VirusScanFragmentV3.am(a).getProgress(), 360F, 200, new com.qihoo.security.malware.widget.RadarProgressBar.a(this) {

                    final _cls26 a;

                    public void a()
                    {
                        VirusScanFragmentV3.as(a.a);
                        com.qihoo.security.ui.b.b.b(12);
                        VirusScanFragmentV3.am(a.a).b();
                        VirusScanFragmentV3.H(a.a).a();
                        VirusScanFragmentV3.at(a.a);
                    }

                    public void a(float f1)
                    {
                        VirusScanFragmentV3.aj(a.a).setText("100");
                        com.qihoo.security.ui.antivirus.VirusScanFragmentV3.c(a.a, 100);
                    }

            
            {
                a = _pcls26;
                super();
            }
                });
            }

            public void a(float f1)
            {
                VirusScanFragmentV3.aj(a).setText((new StringBuilder()).append((int)(f1 * 100F) / 360).append("").toString());
                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.c(a, (int)(f1 * 100F) / 360);
            }

            
            {
                a = VirusScanFragmentV3.this;
                super();
            }
        });
        J();
    }

    static void K(VirusScanFragmentV3 virusscanfragmentv3)
    {
        virusscanfragmentv3.K();
    }

    static int L(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.ap;
    }

    private void L()
    {
        (new Thread(new Runnable() {

            final VirusScanFragmentV3 a;

            public void run()
            {
                Object obj = com.qihoo.security.malware.db.a.a(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a));
                if (obj != null && ((List) (obj)).size() > 0)
                {
                    System.currentTimeMillis();
                    obj = ((List) (obj)).iterator();
                    do
                    {
                        if (!((Iterator) (obj)).hasNext())
                        {
                            break;
                        }
                        MaliciousInfo maliciousinfo = (MaliciousInfo)((Iterator) (obj)).next();
                        long l1 = maliciousinfo.getDangerousPermissionList(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a));
                        if (l1 != 0L)
                        {
                            com.qihoo.security.support.b.a(14318, maliciousinfo.getMfsha1HexString(), (new StringBuilder()).append(maliciousinfo.packageName).append("|").append(maliciousinfo.getVersionCode(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a))).append("|").append(maliciousinfo.getSignHash(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a))).append("|").append(l1).toString());
                        }
                    } while (true);
                }
            }

            
            {
                a = VirusScanFragmentV3.this;
                super();
            }
        })).start();
    }

    private void M()
    {
        aN = false;
        (new Thread() {

            final VirusScanFragmentV3 a;

            public void run()
            {
                SharedPref.a(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a), "malware_is_scanning", false);
            }

            
            {
                a = VirusScanFragmentV3.this;
                super();
            }
        }).start();
        if (getActivity() != null && !getActivity().isFinishing())
        {
            f f1 = getActivity().e();
            a(f1);
            f1.b("virus_result_fragment", 1);
            t();
            a(false, true);
            p.a(true);
            J();
            b(((com.nineoldandroids.a.a.a) (null)), false);
            a_(n.a(0x7f0c01d3));
            az = false;
        }
    }

    static int[] M(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.z();
    }

    private void N()
    {
        (new Thread() {

            final VirusScanFragmentV3 a;

            public void run()
            {
                int ai1[] = VirusScanFragmentV3.I(a);
                int ai2[] = com.qihoo.security.ui.antivirus.VirusScanFragmentV3.b(a);
                int i1 = VirusScanFragmentV3.J(a);
                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.b(a, ai1[0] + ai2[0] + i1);
                Message message = VirusScanFragmentV3.aw(a).obtainMessage();
                message.what = 3;
                message.arg1 = VirusScanFragmentV3.ax(a);
                VirusScanFragmentV3.ay(a).sendMessage(message);
            }

            
            {
                a = VirusScanFragmentV3.this;
                super();
            }
        }).start();
    }

    static byte[] N(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.av;
    }

    static ExecutorService O(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.at;
    }

    private void O()
    {
        int ai1[];
        int i1;
        int l1;
label0:
        {
label1:
            {
                i1 = 0x7f0f0003;
                ai1 = x();
                l1 = ai1[0] + ai1[1] + ai1[2] + ai1[3] + ai1[4];
                if (l1 != 0)
                {
                    break label0;
                }
                if (R)
                {
                    if (!Q())
                    {
                        break label1;
                    }
                    v.setLocalText(0x7f0c0130);
                }
                return;
            }
            v.setLocalText(0x7f0c012f);
            return;
        }
        if (ai1[0] > 0)
        {
            int j1 = i1;
            if (P())
            {
                j1 = i1;
                if (!D)
                {
                    j1 = 0x7f0f0004;
                }
            }
            b(n.a(j1, l1, new Object[] {
                Integer.valueOf(l1)
            }));
            return;
        }
        int k1 = ai1[3];
        if (ai1[4] + k1 == 0)
        {
            if (!D)
            {
                i1 = 0x7f0f0002;
            }
            b(n.a(i1, l1, new Object[] {
                Integer.valueOf(l1)
            }));
            return;
        }
        k1 = i1;
        if (P())
        {
            k1 = i1;
            if (!D)
            {
                k1 = 0x7f0f0004;
            }
        }
        b(n.a(k1, l1, new Object[] {
            Integer.valueOf(l1)
        }));
    }

    static com.qihoo.security.ui.fragment.BaseFragment.a P(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.h;
    }

    private boolean P()
    {
        for (long l1 = SharedPref.b(l, "malware_find_issue_time", 0L); l1 <= 0L || System.currentTimeMillis() - l1 <= 0x6ddd00L;)
        {
            return false;
        }

        return true;
    }

    static com.qihoo.security.ui.fragment.BaseFragment.a Q(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.h;
    }

    private boolean Q()
    {
        for (long l1 = SharedPref.b(l, "malware_scan_finish_time", 0L); l1 <= 0L || System.currentTimeMillis() - l1 >= 60000L;)
        {
            return false;
        }

        return true;
    }

    static com.qihoo.security.ui.fragment.BaseFragment.a R(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.h;
    }

    private boolean R()
    {
        boolean flag1 = true;
        boolean flag = false;
        File file = l.getFileStreamPath("ave");
        if (file != null && file.exists() && file.isDirectory())
        {
            if (!a(file, "heurmod_v2.jar") || !a(file, "v_sig.db"))
            {
                try
                {
                    FileUtil.deleteDirectory(file);
                    file.mkdir();
                    flag = b(file, "avedb.zip");
                }
                catch (IOException ioexception)
                {
                    return false;
                }
                if (flag)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
            }
        } else
        {
            file.mkdir();
            if (b(file, "avedb.zip"))
            {
                return true;
            }
        }
        return flag;
    }

    static com.qihoo.security.ui.fragment.BaseFragment.a S(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.h;
    }

    static com.qihoo.security.ui.fragment.BaseFragment.a T(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.h;
    }

    static com.qihoo.security.ui.fragment.BaseFragment.a U(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.h;
    }

    static com.qihoo.security.ui.fragment.BaseFragment.a V(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.h;
    }

    static com.qihoo.security.ui.fragment.BaseFragment.a W(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.h;
    }

    static boolean X(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.R();
    }

    static void Y(VirusScanFragmentV3 virusscanfragmentv3)
    {
        virusscanfragmentv3.r();
    }

    static boolean Z(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.P();
    }

    static int a(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.aq;
    }

    static int a(VirusScanFragmentV3 virusscanfragmentv3, int i1)
    {
        virusscanfragmentv3.V = i1;
        return i1;
    }

    private int a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus)
    {
        if (examstatus == com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER)
        {
            return S;
        }
        if (examstatus == com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.NEED_OPTIMIZE)
        {
            return T;
        } else
        {
            return U;
        }
    }

    static long a(VirusScanFragmentV3 virusscanfragmentv3, long l1)
    {
        virusscanfragmentv3.aK = l1;
        return l1;
    }

    static com.qihoo.security.malware.vo.a a(VirusScanFragmentV3 virusscanfragmentv3, com.qihoo.security.malware.vo.a a1)
    {
        virusscanfragmentv3.Q = a1;
        return a1;
    }

    static String a(VirusScanFragmentV3 virusscanfragmentv3, String s1)
    {
        virusscanfragmentv3.L = s1;
        return s1;
    }

    private void a(boolean flag)
    {
        if (h.hasMessages(0))
        {
            h.removeMessages(0);
        }
        o.a();
        o.clearAnimation();
        s.b();
        t.setVisibility(4);
        u.setVisibility(4);
        t.clearAnimation();
        u.clearAnimation();
        if (flag)
        {
            com.qihoo.security.ui.main.a.a(t, null, 1.0F, 0.0F, 100L);
            com.qihoo.security.ui.main.a.a(u, new com.nineoldandroids.a.b() {

                final VirusScanFragmentV3 a;

                public void b(com.nineoldandroids.a.a a1)
                {
                    VirusScanFragmentV3.aj(a).setVisibility(4);
                    VirusScanFragmentV3.ak(a).setVisibility(4);
                }

            
            {
                a = VirusScanFragmentV3.this;
                super();
            }
            }, 1.0F, 0.0F, 100L);
            return;
        } else
        {
            t.setVisibility(4);
            u.setVisibility(4);
            return;
        }
    }

    private void a(boolean flag, com.qihoo.security.malware.vo.a a1, boolean flag1)
    {
        Object obj;
        int ai1[];
        int i1;
        if (flag)
        {
            try
            {
                Thread.sleep(200L);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((InterruptedException) (obj)).printStackTrace();
            }
        }
        obj = a1.a();
        ai1 = a1.b();
        i1 = a1.c();
        if (flag && obj[1] + ai1[0] + i1 > 0)
        {
            D();
            return;
        }
        if (flag && obj[0] + ai1[0] + i1 == 0)
        {
            M();
        }
        if (flag1)
        {
            if ((!flag || obj[0] + ai1[0] + i1 <= 0) && !q && !aN)
            {
                p.a(true);
            }
        } else
        {
            p.b(false);
        }
        if (!as && a(((android.support.v4.app.Fragment) (this))) && az)
        {
            az = false;
        } else
        {
            as = false;
        }
        if (obj[0] + ai1[0] + i1 != 0) goto _L2; else goto _L1
_L1:
        r.setText(n.a(0x7f0c012a));
        a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT, true);
        long l1 = SharedPref.b(SecurityApplication.a(), "malware_scan_time", 0L);
        long l2 = SharedPref.b(SecurityApplication.a(), "malware_update_timestamp", 0L);
        if (E)
        {
            v.setLocalText(0x7f0c013b);
        } else
        if (l1 == 0L)
        {
            if (R)
            {
                if (Q())
                {
                    v.setLocalText(0x7f0c0130);
                } else
                {
                    v.setLocalText(0x7f0c012f);
                }
            } else
            {
                v.setLocalText(0x7f0c012e);
            }
        } else
        {
            long l3 = System.currentTimeMillis() / 0x5265c00L - l1 / 0x5265c00L;
            if (l1 - l2 < 0xf731400L)
            {
                if (Q())
                {
                    v.setLocalText(0x7f0c0130);
                } else
                {
                    v.setLocalText(0x7f0c012f);
                }
            } else
            if (l3 > 3L)
            {
                v.setLocalText(n.a(0x7f0c00f8, new Object[] {
                    Long.valueOf(l3)
                }));
            } else
            if (Q())
            {
                v.setLocalText(0x7f0c0130);
            } else
            {
                v.setLocalText(0x7f0c012f);
            }
        }
        if (d() && ar == com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT && !D)
        {
            y.setVisibility(8);
            y.clearAnimation();
            com.nineoldandroids.b.a.a(x, 1.0F);
            x.setVisibility(0);
        } else
        {
            x.setVisibility(8);
        }
        x.clearAnimation();
_L4:
        C();
        return;
_L2:
        if (obj[1] + obj[2] > 0)
        {
            r.setText(n.a(0x7f0c00e7));
            a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER, true);
            if (P())
            {
                O();
            } else
            {
                P = obj[0] + i1 + ai1[0];
                N();
                if (obj[1] > 0)
                {
                    a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER, false);
                }
                if (obj[1] == 0 && obj[3] + ai1[0] + i1 > 0)
                {
                    a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.NEED_OPTIMIZE, false);
                }
                N = true;
            }
            a(((int []) (obj)), ai1, i1);
            y.removeAllViews();
            for (a1 = B.iterator(); a1.hasNext(); y.addView(((View) (obj))))
            {
                obj = (ImageView)a1.next();
            }

            com.nineoldandroids.b.a.a(y, 1.0F);
            y.setVisibility(0);
            x.setVisibility(8);
            x.clearAnimation();
        } else
        if (ai1[0] + i1 == 0)
        {
            r.setText(n.a(0x7f0c012a));
            a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT, true);
            if (P())
            {
                O();
            } else
            {
                P = obj[0] + i1 + ai1[0];
                N();
                if (obj[1] > 0)
                {
                    a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER, false);
                }
                if (obj[1] == 0 && obj[3] + ai1[0] + i1 > 0)
                {
                    a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT, false);
                }
                N = true;
            }
            a(((int []) (obj)), ai1, i1);
            y.removeAllViews();
            for (a1 = B.iterator(); a1.hasNext(); y.addView(((View) (obj))))
            {
                obj = (ImageView)a1.next();
            }

            com.nineoldandroids.b.a.a(y, 1.0F);
            y.setVisibility(0);
            x.setVisibility(8);
            x.clearAnimation();
        } else
        if (obj[3] + i1 + ai1[0] > 0)
        {
            r.setText(n.a(0x7f0c00e7));
            a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.NEED_OPTIMIZE, true);
            if (P())
            {
                O();
            } else
            {
                P = obj[0] + i1 + ai1[0];
                N();
                if (obj[1] > 0)
                {
                    a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER, false);
                }
                if (obj[1] == 0 && obj[3] + ai1[0] + i1 > 0)
                {
                    a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.NEED_OPTIMIZE, false);
                }
                N = true;
            }
            a(((int []) (obj)), ai1, i1);
            y.removeAllViews();
            for (a1 = B.iterator(); a1.hasNext(); y.addView(((View) (obj))))
            {
                obj = (ImageView)a1.next();
            }

            com.nineoldandroids.b.a.a(y, 1.0F);
            y.setVisibility(0);
            x.setVisibility(8);
            x.clearAnimation();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(boolean flag, boolean flag1)
    {
        (new Thread(flag, flag1) {

            final boolean a;
            final boolean b;
            final VirusScanFragmentV3 c;

            public void run()
            {
                int ai1[] = VirusScanFragmentV3.I(c);
                int ai2[] = com.qihoo.security.ui.antivirus.VirusScanFragmentV3.b(c);
                int i1 = VirusScanFragmentV3.J(c);
                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.b(c, ai1[0] + ai2[0] + i1);
                if (VirusScanFragmentV3.al(c) == null)
                {
                    com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(c, new com.qihoo.security.malware.vo.a(ai1, ai2, i1));
                } else
                {
                    VirusScanFragmentV3.al(c).a(ai1);
                    VirusScanFragmentV3.al(c).b(ai2);
                    VirusScanFragmentV3.al(c).a(i1);
                }
                ai1 = VirusScanFragmentV3.au(c).obtainMessage();
                ai1.obj = VirusScanFragmentV3.al(c);
                ai1.what = 2;
                if (a)
                {
                    ai1.arg1 = 1;
                } else
                {
                    ai1.arg1 = 0;
                }
                if (b)
                {
                    ai1.arg2 = 1;
                } else
                {
                    ai1.arg2 = 0;
                }
                VirusScanFragmentV3.av(c).sendMessage(ai1);
            }

            
            {
                c = VirusScanFragmentV3.this;
                a = flag;
                b = flag1;
                super();
            }
        }).start();
    }

    private void a(int ai1[], int ai2[], int i1)
    {
        F();
        if (i1 > 0)
        {
            ai1 = new ImageView(l);
            ai1.setImageDrawable(getResources().getDrawable(0x7f020151));
            ai1.setLayoutParams(A);
            B.add(ai1);
        }
        if (ai2[0] <= 0) goto _L2; else goto _L1
_L1:
        ai1 = com.qihoo.security.leak.d.a().c().iterator();
_L10:
        if (!ai1.hasNext()) goto _L2; else goto _L3
_L3:
        ai2 = (c)ai1.next();
        if (B.size() < 4) goto _L4; else goto _L2
_L2:
        ai1 = com.qihoo.security.malware.db.a.c(l).iterator();
_L8:
        if (!ai1.hasNext()) goto _L6; else goto _L5
_L5:
        ai2 = (MaliciousInfo)ai1.next();
        if (com.qihoo.security.malware.db.c.a(l, ai2) || ((MaliciousInfo) (ai2)).isSystem && com.qihoo360.mobilesafe.b.a.b(l, ((MaliciousInfo) (ai2)).packageName) && !ao || !ai2.isFileExist()) goto _L8; else goto _L7
_L7:
        if (B.size() <= 4) goto _L9; else goto _L6
_L6:
        ai1 = com.qihoo.security.malware.db.a.d(l).iterator();
_L11:
label0:
        {
            do
            {
                if (!ai1.hasNext())
                {
                    break label0;
                }
                ai2 = (MaliciousInfo)ai1.next();
            } while (((MaliciousInfo) (ai2)).isSystem && com.qihoo360.mobilesafe.b.a.b(l, ((MaliciousInfo) (ai2)).packageName) && !ao || !ai2.isFileExist());
            if (B.size() <= 4)
            {
                break MISSING_BLOCK_LABEL_454;
            }
        }
        if (B.size() > 4)
        {
            B.remove(4);
            ai1 = new ImageView(l);
            ai1.setImageDrawable(getResources().getDrawable(0x7f020096));
            ai1.setLayoutParams(A);
            B.add(ai1);
        }
        return;
_L4:
        if (!ai2.c())
        {
            ImageView imageview = new ImageView(l);
            imageview.setImageDrawable(ai2.d());
            imageview.setLayoutParams(A);
            B.add(imageview);
        }
          goto _L10
_L9:
        ImageView imageview1 = new ImageView(l);
        imageview1.setImageDrawable(C.a(((MaliciousInfo) (ai2)).packageName, ((MaliciousInfo) (ai2)).filePath));
        imageview1.setLayoutParams(A);
        B.add(imageview1);
          goto _L8
        ImageView imageview2 = new ImageView(l);
        imageview2.setImageDrawable(C.a(((MaliciousInfo) (ai2)).packageName, ((MaliciousInfo) (ai2)).filePath));
        imageview2.setLayoutParams(A);
        B.add(imageview2);
          goto _L11
    }

    static boolean a(VirusScanFragmentV3 virusscanfragmentv3, boolean flag)
    {
        virusscanfragmentv3.N = flag;
        return flag;
    }

    private boolean a(File file, String s1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (!TextUtils.isEmpty(s1))
        {
            file = file.listFiles(new FilenameFilter(s1) {

                final String a;
                final VirusScanFragmentV3 b;

                public boolean accept(File file1, String s2)
                {
                    return s2.equals(a);
                }

            
            {
                b = VirusScanFragmentV3.this;
                a = s1;
                super();
            }
            });
            flag = flag1;
            if (file != null)
            {
                flag = flag1;
                if (file.length > 0)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    static void aa(VirusScanFragmentV3 virusscanfragmentv3)
    {
        virusscanfragmentv3.D();
    }

    static LinearLayout ab(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.y;
    }

    static boolean ac(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.D;
    }

    static void ad(VirusScanFragmentV3 virusscanfragmentv3)
    {
        virusscanfragmentv3.o();
    }

    static LocaleTextView ae(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.v;
    }

    static void af(VirusScanFragmentV3 virusscanfragmentv3)
    {
        virusscanfragmentv3.p();
    }

    static LinearLayout ag(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.x;
    }

    static com.qihoo.security.locale.d ah(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.n;
    }

    static ElasticImageButton ai(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.p;
    }

    static LocaleTextView aj(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.t;
    }

    static LocaleTextView ak(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.u;
    }

    static com.qihoo.security.malware.vo.a al(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.Q;
    }

    static RadarProgressBar am(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.s;
    }

    static void an(VirusScanFragmentV3 virusscanfragmentv3)
    {
        virusscanfragmentv3.F();
    }

    static int ao(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.aE;
    }

    static boolean ap(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.aC;
    }

    static float[] aq(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.am;
    }

    static com.qihoo.security.ui.fragment.BaseFragment.a ar(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.h;
    }

    static void as(VirusScanFragmentV3 virusscanfragmentv3)
    {
        virusscanfragmentv3.H();
    }

    static void at(VirusScanFragmentV3 virusscanfragmentv3)
    {
        virusscanfragmentv3.L();
    }

    static com.qihoo.security.ui.fragment.BaseFragment.a au(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.h;
    }

    static com.qihoo.security.ui.fragment.BaseFragment.a av(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.h;
    }

    static com.qihoo.security.ui.fragment.BaseFragment.a aw(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.h;
    }

    static int ax(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.O;
    }

    static com.qihoo.security.ui.fragment.BaseFragment.a ay(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.h;
    }

    static int b(VirusScanFragmentV3 virusscanfragmentv3, int i1)
    {
        virusscanfragmentv3.O = i1;
        return i1;
    }

    static long b(VirusScanFragmentV3 virusscanfragmentv3, long l1)
    {
        virusscanfragmentv3.aF = l1;
        return l1;
    }

    private void b(String s1)
    {
        String s2 = v.getText().toString();
        if (s2 == null || s2.length() == 0)
        {
            v.setLocalText(s1);
        } else
        if (!s2.equals(s1))
        {
            com.qihoo.security.ui.main.a.a(v, new com.nineoldandroids.a.b(s1) {

                final String a;
                final VirusScanFragmentV3 b;

                public void b(com.nineoldandroids.a.a a1)
                {
                    VirusScanFragmentV3.ae(b).setLocalText(a);
                    com.qihoo.security.ui.main.a.a(VirusScanFragmentV3.ae(b), new com.nineoldandroids.a.b(this) {

                        final _cls32 a;

                        public void b(com.nineoldandroids.a.a a1)
                        {
                            VirusScanFragmentV3.ae(a.b).setVisibility(0);
                        }

            
            {
                a = _pcls32;
                super();
            }
                    }, 0.0F, 1.0F, 300L);
                }

            
            {
                b = VirusScanFragmentV3.this;
                a = s1;
                super();
            }
            }, 1.0F, 0.0F, 300L);
            return;
        }
    }

    private void b(boolean flag)
    {
        (new Thread(flag) {

            final boolean a;
            final VirusScanFragmentV3 b;

            public void run()
            {
                try
                {
                    Thread.sleep(2500L);
                }
                catch (InterruptedException interruptedexception)
                {
                    interruptedexception.printStackTrace();
                }
                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.g(b, a);
            }

            
            {
                b = VirusScanFragmentV3.this;
                a = flag;
                super();
            }
        }).start();
    }

    static boolean b(VirusScanFragmentV3 virusscanfragmentv3, boolean flag)
    {
        virusscanfragmentv3.D = flag;
        return flag;
    }

    private boolean b(File file, String s1)
    {
        if (file != null && file.isDirectory() && !TextUtils.isEmpty(s1))
        {
            s1 = new File(file, "tmp1111");
            s1.mkdir();
            if (FileUtil.copyAssetToFile(l, "avedb.zip", new File(s1, "avedb.zip"), false) && NativeLoader.load(l, "cloudscan-jni-1.0.5.2002"))
            {
                int i1 = SampleDetector.OpenDatabase((new StringBuilder()).append(s1.getAbsolutePath()).append("/").append("avedb.zip").toString(), file.getAbsolutePath(), "360");
                if (i1 < 0)
                {
                    Log.e("VirusScanFragmentV3", (new StringBuilder()).append("Extract ").append(s1.getAbsolutePath()).append("/").append("avedb.zip").append(" failed, error = ").append(i1).toString());
                    return false;
                }
                if (FileUtil.copyAssetToFile(l, "avedb.zip.timestamp", new File(file, "avedb.zip.timestamp"), false) && FileUtil.copyAssetToFile(l, "vdb.cache", new File(file, "vdb.cache"), false))
                {
                    try
                    {
                        FileUtil.deleteDirectory(s1);
                    }
                    // Misplaced declaration of an exception variable
                    catch (File file)
                    {
                        file.printStackTrace();
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    static int[] b(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.A();
    }

    static int c(VirusScanFragmentV3 virusscanfragmentv3, int i1)
    {
        virusscanfragmentv3.aE = i1;
        return i1;
    }

    static com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus c(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.ar;
    }

    private void c(int i1)
    {
        RadarProgressBar radarprogressbar = s;
        float f1 = s.getProgress();
        float f2 = al[i1];
        int j1;
        if (aC)
        {
            j1 = Y[i1];
        } else
        {
            j1 = X[i1];
        }
        radarprogressbar.a(f1, f2, j1, new com.qihoo.security.malware.widget.RadarProgressBar.a(i1) {

            final int a;
            final VirusScanFragmentV3 b;

            public void a()
            {
                a;
                JVM INSTR tableswitch 0 6: default 48
            //                           0 87
            //                           1 140
            //                           2 193
            //                           3 246
            //                           4 299
            //                           5 352
            //                           6 405;
                   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
                if (VirusScanFragmentV3.ac(b))
                {
                    Message message = VirusScanFragmentV3.ar(b).obtainMessage();
                    message.what = 5;
                    message.arg1 = a;
                    message.sendToTarget();
                }
                return;
_L2:
                VirusScanFragmentV3 virusscanfragmentv3 = b;
                String s1;
                if (VirusScanFragmentV3.ap(b))
                {
                    s1 = VirusScanFragmentV3.ah(b).a(0x7f0c0135);
                } else
                {
                    s1 = VirusScanFragmentV3.ah(b).a(0x7f0c0131);
                }
                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(virusscanfragmentv3, s1);
                continue; /* Loop/switch isn't completed */
_L3:
                VirusScanFragmentV3 virusscanfragmentv3_1 = b;
                String s2;
                if (VirusScanFragmentV3.ap(b))
                {
                    s2 = VirusScanFragmentV3.ah(b).a(0x7f0c0136);
                } else
                {
                    s2 = VirusScanFragmentV3.ah(b).a(0x7f0c0131);
                }
                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(virusscanfragmentv3_1, s2);
                continue; /* Loop/switch isn't completed */
_L4:
                VirusScanFragmentV3 virusscanfragmentv3_2 = b;
                String s3;
                if (VirusScanFragmentV3.ap(b))
                {
                    s3 = VirusScanFragmentV3.ah(b).a(0x7f0c0133);
                } else
                {
                    s3 = VirusScanFragmentV3.ah(b).a(0x7f0c0131);
                }
                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(virusscanfragmentv3_2, s3);
                continue; /* Loop/switch isn't completed */
_L5:
                VirusScanFragmentV3 virusscanfragmentv3_3 = b;
                String s4;
                if (VirusScanFragmentV3.ap(b))
                {
                    s4 = VirusScanFragmentV3.ah(b).a(0x7f0c0131);
                } else
                {
                    s4 = VirusScanFragmentV3.ah(b).a(0x7f0c0131);
                }
                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(virusscanfragmentv3_3, s4);
                continue; /* Loop/switch isn't completed */
_L6:
                VirusScanFragmentV3 virusscanfragmentv3_4 = b;
                String s5;
                if (VirusScanFragmentV3.ap(b))
                {
                    s5 = VirusScanFragmentV3.ah(b).a(0x7f0c0134);
                } else
                {
                    s5 = VirusScanFragmentV3.ah(b).a(0x7f0c0134);
                }
                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(virusscanfragmentv3_4, s5);
                continue; /* Loop/switch isn't completed */
_L7:
                VirusScanFragmentV3 virusscanfragmentv3_5 = b;
                String s6;
                if (VirusScanFragmentV3.ap(b))
                {
                    s6 = VirusScanFragmentV3.ah(b).a(0x7f0c0134);
                } else
                {
                    s6 = VirusScanFragmentV3.ah(b).a(0x7f0c0132);
                }
                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(virusscanfragmentv3_5, s6);
                continue; /* Loop/switch isn't completed */
_L8:
                VirusScanFragmentV3 virusscanfragmentv3_6 = b;
                String s7;
                if (VirusScanFragmentV3.ap(b))
                {
                    s7 = VirusScanFragmentV3.ah(b).a(0x7f0c0132);
                } else
                {
                    s7 = VirusScanFragmentV3.ah(b).a(0x7f0c0132);
                }
                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(virusscanfragmentv3_6, s7);
                if (true) goto _L1; else goto _L9
_L9:
            }

            public void a(float f3)
            {
                VirusScanFragmentV3.aj(b).setText((new StringBuilder()).append((int)(f3 * 100F) / 360).append("").toString());
                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.c(b, (int)(f3 * 100F) / 360);
                if (VirusScanFragmentV3.ao(b) >= 98 && VirusScanFragmentV3.E(b) == 0L)
                {
                    com.qihoo.security.ui.antivirus.VirusScanFragmentV3.b(b, System.currentTimeMillis());
                }
                if (VirusScanFragmentV3.ap(b) && (float)VirusScanFragmentV3.ao(b) > VirusScanFragmentV3.aq(b)[4])
                {
                    com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(b, VirusScanFragmentV3.ah(b).a(0x7f0c0137));
                }
            }

            
            {
                b = VirusScanFragmentV3.this;
                a = i1;
                super();
            }
        });
    }

    private void c(boolean flag)
    {
        if (!isAdded())
        {
            return;
        }
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        aw = flag;
        m.runOnUiThread(new Runnable() {

            final VirusScanFragmentV3 a;

            public void run()
            {
                if (a.isAdded());
            }

            
            {
                a = VirusScanFragmentV3.this;
                super();
            }
        });
    }

    static boolean c(VirusScanFragmentV3 virusscanfragmentv3, boolean flag)
    {
        virusscanfragmentv3.E = flag;
        return flag;
    }

    static com.qihoo.security.ui.fragment.BaseFragment.a d(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.h;
    }

    private void d(boolean flag)
    {
        aN = true;
        aO = flag;
        (new Thread() {

            final VirusScanFragmentV3 a;

            public void run()
            {
                SharedPref.a(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a), "malware_is_scanning", true);
            }

            
            {
                a = VirusScanFragmentV3.this;
                super();
            }
        }).start();
        if (!az)
        {
            a(((com.nineoldandroids.a.a.a) (null)));
            az = true;
        }
        if (flag)
        {
            a_(n.a(0x7f0c0129));
        } else
        {
            a_(n.a(0x7f0c0124));
        }
        if (e())
        {
            VirusResultFragment virusresultfragment = VirusResultFragment.q();
            virusresultfragment.a(Boolean.valueOf(flag));
            h h1 = getActivity().e().a();
            h1.a(0x7f0b0073, virusresultfragment);
            h1.a("virus_result_fragment");
            h1.b();
        }
    }

    static boolean d(VirusScanFragmentV3 virusscanfragmentv3, boolean flag)
    {
        virusscanfragmentv3.q = flag;
        return flag;
    }

    static com.qihoo.security.ui.fragment.BaseFragment.a e(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.h;
    }

    static boolean e(VirusScanFragmentV3 virusscanfragmentv3, boolean flag)
    {
        virusscanfragmentv3.aM = flag;
        return flag;
    }

    static void f(VirusScanFragmentV3 virusscanfragmentv3)
    {
        virusscanfragmentv3.N();
    }

    static boolean f(VirusScanFragmentV3 virusscanfragmentv3, boolean flag)
    {
        virusscanfragmentv3.az = flag;
        return flag;
    }

    static Activity g(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.m;
    }

    static boolean g(VirusScanFragmentV3 virusscanfragmentv3, boolean flag)
    {
        virusscanfragmentv3.ax = flag;
        return flag;
    }

    static Context h(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.l;
    }

    static void h(VirusScanFragmentV3 virusscanfragmentv3, boolean flag)
    {
        virusscanfragmentv3.c(flag);
    }

    static void i(VirusScanFragmentV3 virusscanfragmentv3, boolean flag)
    {
        virusscanfragmentv3.a(flag);
    }

    static boolean i(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.ao;
    }

    static com.qihoo.security.ui.fragment.BaseFragment.a j(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.h;
    }

    static com.qihoo.security.ui.fragment.BaseFragment.a k(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.h;
    }

    static com.qihoo.security.ui.fragment.BaseFragment.a l(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.h;
    }

    private void l()
    {
        V = 155;
        m = getActivity();
        l = m.getApplicationContext();
        aG = new Random();
        S = getResources().getColor(0x7f080058);
        T = getResources().getColor(0x7f080057);
        U = getResources().getColor(0x7f080056);
        au = Executors.newFixedThreadPool(10);
        at = Executors.newSingleThreadExecutor();
        ao = com.qihoo360.mobilesafe.support.a.c(l);
        B = new ArrayList();
        C = new g(l);
        n = com.qihoo.security.locale.d.a();
        ap = 0;
        ay = ((PowerManager)getActivity().getSystemService("power")).newWakeLock(0x2000000a, "VirusScanFragmentV3");
        aq = 0;
        J = (new String[] {
            ".", "..", "..."
        });
        K = 0;
        L = n.a(0x7f0c00fb);
        M = "";
        (new Thread() {

            final VirusScanFragmentV3 a;

            public void run()
            {
                (new Intent("android.intent.action.MAIN", null)).addCategory("android.intent.category.LAUNCHER");
                if (com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a) != null && com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a).getPackageManager() != null)
                {
                    List list = com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a).getPackageManager().getInstalledApplications(0);
                    if (list.size() > VirusScanFragmentV3.C(a))
                    {
                        com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a, list.size());
                    }
                }
            }

            
            {
                a = VirusScanFragmentV3.this;
                super();
            }
        }).start();
        if (!SharedPref.b(l, "key_check_ave_config_over", false))
        {
            (new Thread() {

                final VirusScanFragmentV3 a;

                public void run()
                {
                    if (VirusScanFragmentV3.X(a))
                    {
                        SharedPref.a(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a), "key_check_ave_config_over", true);
                    }
                }

            
            {
                a = VirusScanFragmentV3.this;
                super();
            }
            }).start();
        }
    }

    static com.qihoo.security.ui.fragment.BaseFragment.a m(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.h;
    }

    private void m()
    {
        o = (RadarView)aJ.a(0x7f0b0231);
        t = (LocaleTextView)aJ.a(0x7f0b0233);
        u = (LocaleTextView)aJ.a(0x7f0b0234);
        v = (LocaleTextView)aJ.a(0x7f0b0237);
        w = (LocaleTextView)aJ.a(0x7f0b0238);
        s = (RadarProgressBar)aJ.a(0x7f0b0230);
        p = (ElasticImageButton)aJ.a(0x7f0b0235);
        int i1 = a(ar);
        r = new ScanButtonTopView(l);
        r.setText(n.a(0x7f0c012a));
        r.setIcon(com.qihoo.security.ui.b.a.a().a(0x7f020152));
        p.setTopView(r);
        I = new e(i1);
        I.a(this);
        o.setRadarViewAnimationListener(this);
        p.setOnClickListener(this);
        p.setButtonAnimatorListener(new com.qihoo.security.alasticbutton.a() {

            final VirusScanFragmentV3 a;

            public void a()
            {
                a.c_();
            }

            public void b()
            {
            }

            public void d()
            {
                com.qihoo.security.ui.b.b.a();
                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.d(a, true);
            }

            public void f()
            {
                if (com.qihoo.security.ui.antivirus.VirusScanFragmentV3.c(a) == com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT)
                {
                    VirusScanFragmentV3.Y(a);
                } else
                if (VirusScanFragmentV3.Z(a))
                {
                    VirusScanFragmentV3.Y(a);
                } else
                {
                    VirusScanFragmentV3.aa(a);
                }
                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.d(a, false);
            }

            
            {
                a = VirusScanFragmentV3.this;
                super();
            }
        });
        x = (LinearLayout)aJ.a(0x7f0b023a);
        x.setVisibility(8);
        ((ImageView)aJ.a(0x7f0b023c)).setColorFilter(getResources().getColor(0x7f080056));
        ((ImageView)aJ.a(0x7f0b0240)).setColorFilter(getResources().getColor(0x7f080056));
        ((ImageView)aJ.a(0x7f0b0244)).setColorFilter(getResources().getColor(0x7f080056));
        y = (LinearLayout)aJ.a(0x7f0b0239);
        z = new android.widget.LinearLayout.LayoutParams(-2, -2);
        z.gravity = 17;
        z.leftMargin = com.qihoo360.mobilesafe.b.r.a(l, 40F);
        z.rightMargin = com.qihoo360.mobilesafe.b.r.a(l, 40F);
        A = new android.widget.LinearLayout.LayoutParams(com.qihoo360.mobilesafe.b.r.a(l, 40F), com.qihoo360.mobilesafe.b.r.a(l, 40F));
        A.gravity = 17;
        A.leftMargin = com.qihoo360.mobilesafe.b.r.a(l, 10F);
        A.rightMargin = com.qihoo360.mobilesafe.b.r.a(l, 10F);
        y.setOnClickListener(this);
        y.setOnTouchListener(new android.view.View.OnTouchListener() {

            final VirusScanFragmentV3 a;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                int j1 = motionevent.getAction();
                if (j1 == 0)
                {
                    com.nineoldandroids.b.a.a(VirusScanFragmentV3.ab(a), 0.8F);
                }
                if (j1 == 1)
                {
                    com.nineoldandroids.b.a.a(VirusScanFragmentV3.ab(a), 1.0F);
                }
                if (j1 == 3)
                {
                    com.nineoldandroids.b.a.a(VirusScanFragmentV3.ab(a), 1.0F);
                }
                return false;
            }

            
            {
                a = VirusScanFragmentV3.this;
                super();
            }
        });
        a = aJ.a(0x7f0b00eb);
    }

    static com.qihoo.security.ui.fragment.BaseFragment.a n(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.h;
    }

    private void n()
    {
        aM = false;
        az = true;
        N = false;
        a_(n.a(0x7f0c0124));
        (new Thread() {

            final VirusScanFragmentV3 a;

            public void run()
            {
                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a).stopService(new Intent(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a), com/qihoo/security/service/PackageMonitorService));
            }

            
            {
                a = VirusScanFragmentV3.this;
                super();
            }
        }).start();
        aq = 2;
        D = true;
        I();
        com.qihoo.security.support.b.c(14002);
    }

    static com.qihoo.security.ui.fragment.BaseFragment.a o(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.h;
    }

    private void o()
    {
        long l1 = 0L;
        o.b();
        int ai1[] = y();
        int ai2[] = A();
        int i1 = B();
        if (ai1[1] + ai2[0] + i1 > 0)
        {
            N = true;
            if (h.hasMessages(0))
            {
                h.removeMessages(0);
            }
            P = ai1[0] + i1 + ai2[0];
            long l2;
            if (ai1[1] > 0)
            {
                a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER, false);
            } else
            if (ai2[0] + i1 == 0)
            {
                a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT, false);
            } else
            if (ai1[3] + ai2[0] + i1 > 0)
            {
                a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.NEED_OPTIMIZE, false);
            }
            N();
        } else
        {
            h.sendEmptyMessageDelayed(0, 10L);
        }
        u();
        (new Thread() {

            final VirusScanFragmentV3 a;

            public void run()
            {
                SharedPref.a(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a), "malware_is_scanning", true);
            }

            
            {
                a = VirusScanFragmentV3.this;
                super();
            }
        }).start();
        l2 = SharedPref.b(l, "malware_fast_scan_time", 0L);
        if (l2 != 0L)
        {
            l1 = System.currentTimeMillis() - l2;
        }
        com.qihoo.security.support.b.b(14003, (int)l1);
    }

    static com.qihoo.security.ui.fragment.BaseFragment.a p(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.h;
    }

    private void p()
    {
        a(new com.nineoldandroids.a.b(new com.nineoldandroids.a.b() {

            final VirusScanFragmentV3 a;

            public void b(com.nineoldandroids.a.a a1)
            {
                if (VirusScanFragmentV3.ac(a))
                {
                    VirusScanFragmentV3.ad(a);
                }
            }

            
            {
                a = VirusScanFragmentV3.this;
                super();
            }
        }) {

            final com.nineoldandroids.a.a.a a;
            final VirusScanFragmentV3 b;

            public void b(com.nineoldandroids.a.a a1)
            {
                a1 = com.nineoldandroids.a.k.a(b.a, "alpha", new float[] {
                    1.0F
                });
                a1.c(300L).a(a);
                a1.a();
                com.nineoldandroids.a.k.a(VirusScanFragmentV3.ae(b), "alpha", new float[] {
                    1.0F
                }).c(300L).a();
                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.e(b, true);
            }

            
            {
                b = VirusScanFragmentV3.this;
                a = a1;
                super();
            }
        });
    }

    static com.qihoo.security.ui.fragment.BaseFragment.a q(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.h;
    }

    private void q()
    {
        Object obj = new com.nineoldandroids.a.b() {

            final VirusScanFragmentV3 a;

            public void b(com.nineoldandroids.a.a a1)
            {
                VirusScanFragmentV3.ae(a).setText("");
                VirusScanFragmentV3.af(a);
            }

            
            {
                a = VirusScanFragmentV3.this;
                super();
            }
        };
        k k1 = com.nineoldandroids.a.k.a(a, "alpha", new float[] {
            0.0F
        });
        k1.c(300L).a(((com.nineoldandroids.a.a.a) (obj)));
        obj = com.nineoldandroids.a.k.a(v, "alpha", new float[] {
            0.0F
        }).c(300L);
        k1.a();
        ((k) (obj)).a();
        if (x.getVisibility() == 0)
        {
            com.qihoo.security.ui.main.a.a(x, new com.nineoldandroids.a.b() {

                final VirusScanFragmentV3 a;

                public void a(com.nineoldandroids.a.a a1)
                {
                    com.qihoo.security.ui.b.b.a(11, VirusScanFragmentV3.ag(a));
                }

                public void b(com.nineoldandroids.a.a a1)
                {
                    com.qihoo.security.ui.b.b.c(11);
                    VirusScanFragmentV3.ag(a).setVisibility(8);
                }

            
            {
                a = VirusScanFragmentV3.this;
                super();
            }
            }, 1.0F, 0.0F, 300L);
        }
        if (y.getVisibility() == 0)
        {
            com.qihoo.security.ui.main.a.a(y, new com.nineoldandroids.a.b() {

                final VirusScanFragmentV3 a;

                public void a(com.nineoldandroids.a.a a1)
                {
                    com.qihoo.security.ui.b.b.a(11, VirusScanFragmentV3.ab(a));
                }

                public void b(com.nineoldandroids.a.a a1)
                {
                    VirusScanFragmentV3.ab(a).setVisibility(8);
                    VirusScanFragmentV3.ab(a).clearAnimation();
                }

            
            {
                a = VirusScanFragmentV3.this;
                super();
            }
            }, 1.0F, 0.0F, 300L);
        }
    }

    static com.qihoo.security.ui.fragment.BaseFragment.a r(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.h;
    }

    private void r()
    {
        if (aq == 0 || aq == 1)
        {
            aC = false;
            n();
            q();
        }
    }

    static com.qihoo.security.ui.fragment.BaseFragment.a s(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.h;
    }

    private void s()
    {
        if (aq == 10)
        {
            aC = true;
            a_(n.a(0x7f0c0129));
            N = false;
            l.stopService(new Intent(l, com/qihoo/security/service/PackageMonitorService));
            aq = 3;
            int ai1[] = y();
            int ai2[] = A();
            int i1 = B();
            if (ai1[1] + ai2[0] + i1 > 0)
            {
                N = true;
                if (h.hasMessages(0))
                {
                    h.removeMessages(0);
                }
                P = ai1[0] + i1 + ai2[0];
                if (ai1[1] > 0)
                {
                    a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER, false);
                }
                if (ai1[1] == 0 && ai1[3] + ai2[0] + i1 > 0)
                {
                    a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.NEED_OPTIMIZE, false);
                }
                N();
                if (y.getVisibility() == 0)
                {
                    com.qihoo.security.ui.main.a.a(y, new com.nineoldandroids.a.b() {

                        final VirusScanFragmentV3 a;

                        public void b(com.nineoldandroids.a.a a1)
                        {
                            VirusScanFragmentV3.ab(a).setVisibility(8);
                            VirusScanFragmentV3.ab(a).clearAnimation();
                        }

            
            {
                a = VirusScanFragmentV3.this;
                super();
            }
                    }, 1.0F, 0.0F, 300L);
                }
                o.postDelayed(new Runnable() {

                    final VirusScanFragmentV3 a;

                    public void run()
                    {
                        VirusScanFragmentV3.H(a).b();
                    }

            
            {
                a = VirusScanFragmentV3.this;
                super();
            }
                }, 300L);
            } else
            {
                h.sendEmptyMessageDelayed(0, 10L);
                if (x.getVisibility() == 0)
                {
                    com.qihoo.security.ui.main.a.a(x, new com.nineoldandroids.a.b() {

                        final VirusScanFragmentV3 a;

                        public void b(com.nineoldandroids.a.a a1)
                        {
                            VirusScanFragmentV3.ag(a).setVisibility(8);
                            VirusScanFragmentV3.H(a).b();
                        }

            
            {
                a = VirusScanFragmentV3.this;
                super();
            }
                    }, 1.0F, 0.0F, 300L);
                } else
                {
                    o.postDelayed(new Runnable() {

                        final VirusScanFragmentV3 a;

                        public void run()
                        {
                            VirusScanFragmentV3.H(a).b();
                        }

            
            {
                a = VirusScanFragmentV3.this;
                super();
            }
                    }, 300L);
                }
            }
            D = true;
            I();
            v();
            com.qihoo.security.support.b.c(14004);
            (new Thread() {

                final VirusScanFragmentV3 a;

                public void run()
                {
                    SharedPref.a(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a), "malware_is_scanning", true);
                }

            
            {
                a = VirusScanFragmentV3.this;
                super();
            }
            }).start();
        }
    }

    static com.qihoo.security.ui.fragment.BaseFragment.a t(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.h;
    }

    private void t()
    {
        aq = 0;
        synchronized (av)
        {
            if (at != null)
            {
                at.shutdownNow();
                at = Executors.newSingleThreadExecutor();
            }
        }
        return;
        exception;
        abyte0;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static com.qihoo.security.ui.fragment.BaseFragment.a u(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.h;
    }

    private void u()
    {
        com.qihoo.security.ui.result.f.a().a(5);
        E = false;
        aL = System.currentTimeMillis();
        com.qihoo.security.service.e.a(getActivity(), aL);
        an = new com.qihoo.security.malware.a();
        an.a(aH);
        an.a();
        an.c();
        if (SharedPref.b(l, "malware_last_scan_time", -1L) == -1L)
        {
            aB = System.currentTimeMillis();
        }
        h.sendEmptyMessageDelayed(6, 30000L);
        h.sendEmptyMessageDelayed(7, 0x249f0L);
    }

    static com.qihoo.security.ui.fragment.BaseFragment.a v(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.h;
    }

    private void v()
    {
        com.qihoo.security.ui.result.f.a().a(6);
        E = false;
        aL = System.currentTimeMillis();
        com.qihoo.security.service.e.a(getActivity(), aL);
        an = new com.qihoo.security.malware.a();
        an.a(aI);
        an.a();
        an.d();
        aB = System.currentTimeMillis();
        h.sendEmptyMessageDelayed(6, 30000L);
        a(((com.nineoldandroids.a.a.a) (null)), false);
    }

    static com.qihoo.security.ui.fragment.BaseFragment.a w(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.h;
    }

    private void w()
    {
        char c1 = '\u37EB';
        if (h.hasMessages(6))
        {
            h.removeMessages(6);
        }
        if (h.hasMessages(7))
        {
            h.removeMessages(7);
        }
        aK = System.currentTimeMillis();
        if (D)
        {
            long l1;
            if (aE >= 98)
            {
                l1 = System.currentTimeMillis() - aF;
            } else
            {
                l1 = -1L;
            }
            if (aC)
            {
                if (an == null)
                {
                    com.qihoo.security.support.b.a(14333, String.valueOf(aE), String.valueOf(aK - aL), (new StringBuilder()).append(String.valueOf(V)).append("|").append(com.qihoo.security.locale.language.b.d(l)).append("|").append("-1").append("|").append(l1).toString());
                } else
                {
                    com.qihoo.security.support.b.a(14333, String.valueOf(aE), String.valueOf(aK - aL), (new StringBuilder()).append(String.valueOf(V)).append("|").append(com.qihoo.security.locale.language.b.d(l)).append("|").append(an.f()).append("|").append(l1).toString());
                }
            } else
            if (an == null)
            {
                com.qihoo.security.support.b.a(14308, String.valueOf(aE), String.valueOf(aK - aL), (new StringBuilder()).append(String.valueOf(V)).append("|").append(com.qihoo.security.locale.language.b.d(l)).append("|").append("-1").append("|").append(l1).toString());
            } else
            {
                com.qihoo.security.support.b.a(14308, String.valueOf(aE), String.valueOf(aK - aL), (new StringBuilder()).append(String.valueOf(V)).append("|").append(com.qihoo.security.locale.language.b.d(l)).append("|").append(an.f()).append("|").append(l1).toString());
            }
        }
        D = false;
        if (h.hasMessages(0))
        {
            h.removeMessages(0);
        }
        if (aq == 2 || aq == 3)
        {
            if (an != null && !an.g())
            {
                an.a(new a(this));
                c(false);
                aK = System.currentTimeMillis();
                if (!G)
                {
                    if (an == null)
                    {
                        if (aC)
                        {
                            c1 = '\u37FB';
                        } else
                        {
                            c1 = '\u37EB';
                        }
                        com.qihoo.security.support.b.a(c1, String.valueOf(aK - aL), String.valueOf(aE), (new StringBuilder()).append(String.valueOf(V)).append("|").append(com.qihoo.security.locale.language.b.d(l)).append("|").append("-1").append("|").append(System.currentTimeMillis() - aF).toString());
                    } else
                    {
                        if (aC)
                        {
                            c1 = '\u37FB';
                        }
                        com.qihoo.security.support.b.a(c1, String.valueOf(aK - aL), String.valueOf(aE), (new StringBuilder()).append(String.valueOf(V)).append("|").append(com.qihoo.security.locale.language.b.d(l)).append("|").append(an.f()).append("|").append(System.currentTimeMillis() - aF).toString());
                    }
                } else
                if (an == null)
                {
                    char c2;
                    if (aC)
                    {
                        c2 = '\u37FC';
                    } else
                    {
                        c2 = '\u37EC';
                    }
                    com.qihoo.security.support.b.a(c2, String.valueOf(aK - aL), String.valueOf(aE), (new StringBuilder()).append(String.valueOf(V)).append("|").append(com.qihoo.security.locale.language.b.d(l)).append("|").append("-1").append("|").append(System.currentTimeMillis() - aF).toString());
                } else
                {
                    char c3;
                    if (aC)
                    {
                        c3 = '\u37FC';
                    } else
                    {
                        c3 = '\u37EC';
                    }
                    com.qihoo.security.support.b.a(c3, String.valueOf(aK - aL), String.valueOf(aE), (new StringBuilder()).append(String.valueOf(V)).append("|").append(com.qihoo.security.locale.language.b.d(l)).append("|").append(an.f()).append("|").append(System.currentTimeMillis() - aF).toString());
                }
                (new Thread() {

                    final VirusScanFragmentV3 a;

                    public void run()
                    {
                        SharedPref.a(com.qihoo.security.ui.antivirus.VirusScanFragmentV3.h(a), "malware_is_scanning", false);
                    }

            
            {
                a = VirusScanFragmentV3.this;
                super();
            }
                }).start();
            }
            (new Thread() {

                final VirusScanFragmentV3 a;

                public void run()
                {
                    int ai1[] = VirusScanFragmentV3.I(a);
                    int ai2[] = com.qihoo.security.ui.antivirus.VirusScanFragmentV3.b(a);
                    int i1 = VirusScanFragmentV3.J(a);
                    if (ai1[1] + ai2[0] + i1 > 0)
                    {
                        return;
                    } else
                    {
                        com.qihoo.security.ui.antivirus.VirusScanFragmentV3.g(a).runOnUiThread(new Runnable(this) {

                            final _cls13 a;

                            public void run()
                            {
                                a.a.b(null);
                                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.f(a.a, false);
                                a.a.a_(VirusScanFragmentV3.ah(a.a).a(0x7f0c01d3));
                                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.f(a.a, false);
                                VirusScanFragmentV3.ai(a.a).a(true);
                            }

            
            {
                a = _pcls13;
                super();
            }
                        });
                        return;
                    }
                }

            
            {
                a = VirusScanFragmentV3.this;
                super();
            }
            }).start();
        }
    }

    static com.qihoo.security.ui.fragment.BaseFragment.a x(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.h;
    }

    private int[] x()
    {
        int ai1[] = new int[5];
        Object obj = com.qihoo.security.malware.db.a.b(l);
        if (obj != null && ((List) (obj)).size() > 0)
        {
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                MaliciousInfo maliciousinfo = (MaliciousInfo)((Iterator) (obj)).next();
                if (maliciousinfo != null)
                {
                    if (maliciousinfo.isUninstall(l))
                    {
                        ((Iterator) (obj)).remove();
                        com.qihoo.security.malware.db.a.a(l, maliciousinfo._id);
                    } else
                    if ((!maliciousinfo.isSystem || !com.qihoo360.mobilesafe.b.a.b(l, maliciousinfo.packageName) || ao) && !com.qihoo.security.malware.db.c.a(l, maliciousinfo) && maliciousinfo.isFileExist())
                    {
                        if (maliciousinfo.isMalware())
                        {
                            ai1[0] = ai1[0] + 1;
                        } else
                        if (maliciousinfo.isAdvert())
                        {
                            ai1[1] = ai1[1] + 1;
                        } else
                        if (maliciousinfo.isWarning())
                        {
                            ai1[2] = ai1[2] + 1;
                        }
                    }
                }
            } while (true);
        }
        obj = com.qihoo.security.leak.d.a().c().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            if (!((c)((Iterator) (obj)).next()).c())
            {
                ai1[3] = ai1[3] + 1;
            }
        } while (true);
        if (SharedPref.b(l, "setting_auto_start", true))
        {
            ai1[4] = 0;
            return ai1;
        } else
        {
            ai1[4] = 1;
            return ai1;
        }
    }

    static com.qihoo.security.ui.fragment.BaseFragment.a y(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.h;
    }

    private int[] y()
    {
        Object obj = com.qihoo.security.malware.db.a.b(l);
        int ai1[] = new int[4];
        if (obj != null && ((List) (obj)).size() > 0)
        {
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                MaliciousInfo maliciousinfo = (MaliciousInfo)((Iterator) (obj)).next();
                if (maliciousinfo != null)
                {
                    if (maliciousinfo.isUninstall(l))
                    {
                        ((Iterator) (obj)).remove();
                        com.qihoo.security.malware.db.a.a(l, maliciousinfo._id);
                    } else
                    {
                        if (k)
                        {
                            maliciousinfo.isSystem = true;
                        }
                        if ((!maliciousinfo.isSystem || !com.qihoo360.mobilesafe.b.a.b(l, maliciousinfo.packageName) || ao) && !com.qihoo.security.malware.db.c.a(l, maliciousinfo) && maliciousinfo.isFileExist())
                        {
                            ai1[0] = ai1[0] + 1;
                            if (maliciousinfo.isMalware())
                            {
                                ai1[1] = ai1[1] + 1;
                                if (maliciousinfo.isSystem)
                                {
                                    ai1[2] = ai1[2] + 1;
                                }
                            }
                            if (maliciousinfo.isWarning())
                            {
                                ai1[3] = ai1[3] + 1;
                            }
                        }
                    }
                }
            } while (true);
        }
        return ai1;
    }

    static boolean z(VirusScanFragmentV3 virusscanfragmentv3)
    {
        return virusscanfragmentv3.G;
    }

    private int[] z()
    {
        Object obj = com.qihoo.security.malware.db.a.b(l);
        int ai1[] = new int[4];
        if (obj != null && ((List) (obj)).size() > 0)
        {
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                MaliciousInfo maliciousinfo = (MaliciousInfo)((Iterator) (obj)).next();
                if (maliciousinfo != null)
                {
                    if (maliciousinfo.isUninstall(l))
                    {
                        ((Iterator) (obj)).remove();
                        com.qihoo.security.malware.db.a.a(l, maliciousinfo._id);
                    } else
                    {
                        if (k)
                        {
                            maliciousinfo.isSystem = true;
                        }
                        if ((!maliciousinfo.isSystem || !com.qihoo360.mobilesafe.b.a.b(l, maliciousinfo.packageName) || ao) && !com.qihoo.security.malware.db.c.a(l, maliciousinfo))
                        {
                            ai1[0] = ai1[0] + 1;
                            if (maliciousinfo.isAdvert())
                            {
                                ai1[1] = ai1[1] + 1;
                                if (maliciousinfo.isSystem)
                                {
                                    ai1[2] = ai1[2] + 1;
                                }
                            }
                            if (maliciousinfo.isWarning())
                            {
                                ai1[3] = ai1[3] + 1;
                            }
                        }
                    }
                }
            } while (true);
        }
        return ai1;
    }

    public void a()
    {
        super.a();
        if (ar != null)
        {
            a(ar, false);
        } else
        {
            a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT, false);
        }
        if (H)
        {
            H();
        }
        if (ar == com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT && !D)
        {
            if (x.getVisibility() != 0 && y.getVisibility() != 0)
            {
                com.qihoo.security.ui.main.a.a(x, new com.nineoldandroids.a.b() {

                    final VirusScanFragmentV3 a;

                    public void a(com.nineoldandroids.a.a a1)
                    {
                        VirusScanFragmentV3.ag(a).setVisibility(0);
                    }

            
            {
                a = VirusScanFragmentV3.this;
                super();
            }
                }, 0.0F, 1.0F, 300L);
            }
            if (v.getVisibility() != 0)
            {
                com.qihoo.security.ui.main.a.a(v, new com.nineoldandroids.a.b() {

                    final VirusScanFragmentV3 a;

                    public void a(com.nineoldandroids.a.a a1)
                    {
                        VirusScanFragmentV3.ae(a).setVisibility(0);
                    }

            
            {
                a = VirusScanFragmentV3.this;
                super();
            }
                }, 0.0F, 1.0F, 300L);
            }
        }
        com.qihoo.security.support.b.c(14001);
    }

    public void a(int i1)
    {
    }

    protected void a(Intent intent)
    {
        aA = intent.getIntExtra("custom_action", -1);
        if (intent.getBooleanExtra("jump_result_page", false))
        {
            b(intent);
        }
    }

    public void a(Message message)
    {
        boolean flag1 = true;
        if (isAdded()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        switch (message.what)
        {
        case 1: // '\001'
        default:
            return;

        case 0: // '\0'
            if (!N)
            {
                if (M.equals(L))
                {
                    v.setLocalText((new StringBuilder()).append(L).append(J[K % 3]).toString());
                } else
                {
                    M = L;
                    b((new StringBuilder()).append(L).append(J[K % 3]).toString());
                }
                K = K + 1;
                h.sendEmptyMessageDelayed(0, 1000L);
                return;
            }
            break;

        case 2: // '\002'
            com.qihoo.security.malware.vo.a a1;
            boolean flag;
            if (message.arg1 == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a1 = (com.qihoo.security.malware.vo.a)message.obj;
            if (message.arg2 != 1)
            {
                flag1 = false;
            }
            a(flag, a1, flag1);
            return;

        case 3: // '\003'
            P = message.arg1;
            if (O <= P)
            {
                h.sendEmptyMessageDelayed(3, 100L);
                O();
                O = O + 1;
                return;
            }
            break;

        case 4: // '\004'
            c(true);
            return;

        case 5: // '\005'
            int j1 = message.arg1 + 1;
            int i1;
            if (aC)
            {
                i1 = am.length;
            } else
            {
                i1 = al.length;
            }
            if (j1 < i1 && D)
            {
                c(j1);
                return;
            }
            break;

        case 6: // '\006'
            com.qihoo.security.support.b.a(14334, an.e(), "");
            h.sendEmptyMessageDelayed(6, 30000L);
            return;

        case 7: // '\007'
            D = false;
            com.qihoo.security.support.b.a(14335, an.e(), "");
            if (h.hasMessages(0))
            {
                h.removeMessages(0);
            }
            if (h.hasMessages(6))
            {
                h.removeMessages(6);
            }
            if ((aq == 2 || aq == 3) && an != null)
            {
                an.a(new a(this));
                c(false);
            }
            K();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus, boolean flag)
    {
        super.a(examstatus, flag);
        if (ar == com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT && examstatus != com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT)
        {
            SharedPref.a(l, "malware_find_issue_time", System.currentTimeMillis());
        }
        if (ar == com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.NEED_OPTIMIZE && examstatus == com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER)
        {
            SharedPref.a(l, "malware_find_issue_time", System.currentTimeMillis());
        }
        ar = examstatus;
        I.a(a(examstatus));
    }

    public void a(FragmentAction fragmentaction, Bundle bundle)
    {
        super.a(fragmentaction, bundle);
        static class _cls35
        {

            static final int a[];

            static 
            {
                a = new int[FragmentAction.values().length];
                try
                {
                    a[FragmentAction.RESULT_ACTION_FINISH.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[FragmentAction.RESULT_ACTION_SWITCH_TAB.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[FragmentAction.RESULT_ACTION_SKIP_SUB_MODULE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[FragmentAction.RESULT_ACTION_SKIP_DRAWER.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.qihoo.security.ui.antivirus._cls35.a[fragmentaction.ordinal()];
        JVM INSTR tableswitch 1 4: default 44
    //                   1 45
    //                   2 65
    //                   3 44
    //                   4 77;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        return;
_L2:
        if (aN)
        {
            M();
        }
        c(com.qihoo.security.recommend.RecommendHelper.RecommendType.Anitvirus);
        return;
_L3:
        if (aN)
        {
            M();
            return;
        }
          goto _L1
_L4:
        W = true;
        return;
    }

    public void a(FragmentsObservable fragmentsobservable, com.qihoo.security.ui.main.FragmentsObservable.Action action)
    {
        super.a(fragmentsobservable, action);
    }

    public void b(Intent intent)
    {
        H();
    }

    public boolean b()
    {
        if (!aM)
        {
            return true;
        }
        if (D)
        {
            E();
            return true;
        }
        if (aN)
        {
            if (aO)
            {
                com.qihoo.security.support.b.a(14326, 0L);
            } else
            {
                com.qihoo.security.support.b.a(14325, 0L);
            }
        }
        return super.b();
    }

    public void b_()
    {
        t.setVisibility(0);
        u.setVisibility(0);
        com.qihoo.security.ui.main.a.a(t, null, 0.0F, 1.0F, 100L);
        com.qihoo.security.ui.main.a.a(u, null, 0.0F, 1.0F, 100L);
        if (x.getVisibility() == 0)
        {
            com.qihoo.security.ui.main.a.a(x, new com.nineoldandroids.a.b() {

                final VirusScanFragmentV3 a;

                public void b(com.nineoldandroids.a.a a1)
                {
                    VirusScanFragmentV3.ag(a).setVisibility(8);
                }

            
            {
                a = VirusScanFragmentV3.this;
                super();
            }
            }, 1.0F, 0.0F, 300L);
        }
        if (y.getVisibility() == 0)
        {
            com.qihoo.security.ui.main.a.a(y, new com.nineoldandroids.a.b() {

                final VirusScanFragmentV3 a;

                public void b(com.nineoldandroids.a.a a1)
                {
                    VirusScanFragmentV3.ab(a).setVisibility(8);
                    VirusScanFragmentV3.ab(a).clearAnimation();
                }

            
            {
                a = VirusScanFragmentV3.this;
                super();
            }
            }, 1.0F, 0.0F, 300L);
        }
        s.b();
        String s1;
        if (aC)
        {
            s1 = n.a(0x7f0c0135);
        } else
        {
            s1 = n.a(0x7f0c0133);
        }
        L = s1;
        com.qihoo.security.ui.b.b.a(12, s, s);
        if (aC)
        {
            int i1 = aG.nextInt(7);
            ak = 99 - i1;
            am[4] = (ak * 360) / 100;
            Y[0] = 60000;
            Y[1] = 15000;
            Y[2] = 21000;
            Y[3] = 35000;
            Y[4] = i1 * 8 * 1000;
        } else
        {
            X[0] = 33000;
            X[1] = 8000;
            X[2] = 10000;
            X[3] = 19000;
            X[4] = 26000;
            X[5] = 28000;
            X[6] = 21000;
        }
        c(0);
    }

    public void c()
    {
        super.c();
        if (aN)
        {
            if (aO)
            {
                com.qihoo.security.support.b.a(14326, 1L);
            } else
            {
                com.qihoo.security.support.b.a(14325, 1L);
            }
        }
        E();
    }

    public boolean d()
    {
        while (G || !a(this)) 
        {
            return false;
        }
        return true;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        l();
        m();
        if (aD)
        {
            b(getActivity().getIntent());
        }
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (j1 == -1 && i1 == 10)
        {
            R = true;
            a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT, false);
            ar = com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT;
            v.setTextColor(getResources().getColor(0x7f080056));
            w.setTextColor(getResources().getColor(0x7f080056));
            o.setColor(getResources().getColor(0x7f080056));
            r.setColor(getResources().getColor(0x7f080056));
            s.setColor(getResources().getColor(0x7f080056));
            as = true;
            d(intent.getBooleanExtra("is_deep_scan", false));
            return;
        } else
        {
            b(((com.nineoldandroids.a.a.a) (null)), false);
            a_(n.a(0x7f0c01d3));
            az = false;
            p.a(true);
            return;
        }
    }

    public void onClick(View view)
    {
label0:
        {
            if (ax)
            {
                ax = false;
                b(true);
                if (isResumed())
                {
                    break label0;
                }
            }
            return;
        }
        switch (view.getId())
        {
        default:
            return;

        case 2131427893: 
            if (!aw)
            {
                com.qihoo.security.ui.b.b.a(20);
                p.b();
                RecommendHelper.a().d(null);
                RecommendHelper.a().b(com.qihoo.security.recommend.RecommendHelper.RecommendType.Anitvirus);
                a(com.qihoo.security.ui.main.FragmentsObservable.Action.HideRecmdAin);
                return;
            } else
            {
                h.sendEmptyMessageDelayed(4, 5000L);
                return;
            }

        case 2131427897: 
            q = false;
            D();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getActivity().getIntent().getAction();
        if ("com.qihoo.security.notify.ACTION_MALWARE".equals(bundle) || "com.qihoo.security.notify.ACTION_RISKY_APP".equals(bundle))
        {
            aD = getActivity().getIntent().getBooleanExtra("jump_result_page", false);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        aJ = com.qihoo.security.ui.b.a.a().b(0x7f0300ae);
        if (aJ == null)
        {
            aJ = new com.qihoo.security.ui.b.a.f();
            aJ.b = layoutinflater.inflate(0x7f0300ae, viewgroup, false);
        }
        return aJ.b;
    }

    public void onDestroy()
    {
        super.onDestroy();
        synchronized (av)
        {
            at.shutdownNow();
            at = null;
        }
        au.shutdownNow();
        if (h.hasMessages(6))
        {
            h.removeMessages(6);
        }
        if (h.hasMessages(0))
        {
            h.removeMessages(0);
        }
        if (h.hasMessages(7))
        {
            h.removeMessages(7);
        }
        return;
        exception;
        abyte0;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onPause()
    {
        super.onPause();
        G = true;
    }

    public void onResume()
    {
        super.onResume();
        G = false;
        if (D)
        {
            return;
        }
        if (H)
        {
            H();
            return;
        }
        if (W)
        {
            M();
            W = false;
        }
        (new Thread() {

            final VirusScanFragmentV3 a;

            public void run()
            {
                int ai1[] = VirusScanFragmentV3.I(a);
                int ai2[] = com.qihoo.security.ui.antivirus.VirusScanFragmentV3.b(a);
                int i1 = VirusScanFragmentV3.J(a);
                com.qihoo.security.ui.antivirus.VirusScanFragmentV3.b(a, ai1[0] + ai2[0] + i1);
                if (VirusScanFragmentV3.al(a) == null)
                {
                    com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a, new com.qihoo.security.malware.vo.a(ai1, ai2, i1));
                    return;
                } else
                {
                    VirusScanFragmentV3.al(a).a(ai1);
                    VirusScanFragmentV3.al(a).b(ai2);
                    VirusScanFragmentV3.al(a).a(i1);
                    return;
                }
            }

            
            {
                a = VirusScanFragmentV3.this;
                super();
            }
        }).start();
        aq = 0;
        if (ao ^ com.qihoo360.mobilesafe.support.a.c(l) && aq != 6 && aq != 7)
        {
            ao = com.qihoo360.mobilesafe.support.a.c(l);
        }
        aA = getActivity().getIntent().getIntExtra("custom_action", -1);
        getActivity().getIntent().putExtra("custom_action", -1);
        if (aA == 1)
        {
            a(false, false);
            aq = 0;
            r();
        } else
        if (aA == 2)
        {
            aq = 10;
            x.setVisibility(8);
            getChildFragmentManager().c();
            s();
            a(false, false);
        } else
        if (aA == 3)
        {
            a(false, true);
            aq = 0;
        } else
        {
            a(false, true);
        }
        R = false;
    }

    public void onSaveInstanceState(Bundle bundle)
    {
    }

    public void onStart()
    {
        super.onStart();
    }

    public void onStop()
    {
        super.onStop();
    }

    public void setColor(int i1)
    {
        v.setTextColor(i1);
        w.setTextColor(i1);
        o.setColor(i1);
        r.setColor(i1);
        s.setColor(i1);
    }

}
