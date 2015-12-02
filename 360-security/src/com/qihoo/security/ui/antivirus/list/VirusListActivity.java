// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus.list;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Message;
import android.support.v4.content.g;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.qihoo.security.app.BaseActivity;
import com.qihoo.security.dialog.i;
import com.qihoo.security.leak.c;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.malware.a.b;
import com.qihoo.security.malware.db.a;
import com.qihoo.security.malware.vo.MaliciousInfo;
import com.qihoo.security.ui.antivirus.LeakDetailActivity;
import com.qihoo.security.ui.antivirus.MalwareDetailActivity;
import com.qihoo.security.ui.antivirus.VirusIgnoreListActivity;
import com.qihoo.security.ui.main.HomeActivity;
import com.qihoo.security.ui.result.f;
import com.qihoo360.common.utils.FileUtil;
import com.qihoo360.mobilesafe.b.d;
import com.qihoo360.mobilesafe.b.e;
import com.qihoo360.mobilesafe.b.p;
import com.qihoo360.mobilesafe.b.q;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.qihoo.security.ui.antivirus.list:
//            c, b, a, d, 
//            PackageReceiver

public class VirusListActivity extends BaseActivity
    implements android.view.View.OnClickListener, android.widget.AbsListView.OnScrollListener, com.qihoo.security.opti.trashclear.ui.a.c, com.qihoo.security.opti.trashclear.ui.a.d, com.qihoo360.mobilesafe.b.e.a
{
    private static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static final a e[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/qihoo/security/ui/antivirus/list/VirusListActivity$a, s1);
        }

        public static a[] values()
        {
            return (a[])e.clone();
        }

        static 
        {
            a = new a("NORMAL", 0);
            b = new a("RISKYAPP", 1);
            c = new a("ADVAPP", 2);
            d = new a("MALWARE", 3);
            e = (new a[] {
                a, b, c, d
            });
        }

        private a(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    private static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        private static final b e[];

        public static b valueOf(String s1)
        {
            return (b)Enum.valueOf(com/qihoo/security/ui/antivirus/list/VirusListActivity$b, s1);
        }

        public static b[] values()
        {
            return (b[])e.clone();
        }

        static 
        {
            a = new b("REPAIR_ALL", 0);
            b = new b("REPAIR_SELECTED", 1);
            c = new b("REPAIR", 2);
            d = new b("FINISH", 3);
            e = (new b[] {
                a, b, c, d
            });
        }

        private b(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private static String y = "VirusListActivity";
    private LocaleTextView A;
    private LocaleTextView B;
    private View C;
    private ListView D;
    private com.qihoo.security.ui.antivirus.list.c E;
    private List F;
    private com.qihoo.security.ui.antivirus.list.d G;
    private FrameLayout H;
    private View I;
    private View J;
    private LocaleTextView K;
    private int L;
    private e M;
    private boolean N;
    private boolean O;
    private com.qihoo.security.malware.a.b P;
    private b Q;
    private boolean R;
    private a S;
    private int T;
    private com.qihoo.security.opti.trashclear.ui.i U;
    private com.qihoo.security.ui.antivirus.list.a V;
    private final List W = new ArrayList();
    private final List X = new ArrayList();
    private final List Y = new ArrayList();
    private final List Z = new ArrayList();
    private com.qihoo.security.opti.trashclear.ui.i aa;
    private int ab;
    private boolean ac;
    private boolean ad;
    private boolean ae;
    private boolean af;
    private boolean ag;
    private boolean ah;
    private com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus ai;
    private final BroadcastReceiver aj = new BroadcastReceiver() {

        final VirusListActivity a;

        public void onReceive(Context context, Intent intent)
        {
            while (intent == null || !"com.qihoo.action.MONITOR_UPDATE".equals(intent.getAction())) 
            {
                return;
            }
            com.qihoo.security.ui.antivirus.list.VirusListActivity.a(a);
        }

            
            {
                a = VirusListActivity.this;
                super();
            }
    };
    private PackageReceiver ak;
    private com.qihoo.security.ui.antivirus.list.b al;
    private com.qihoo.security.dialog.g am;
    private boolean an;
    private boolean ao;
    private List ap;
    private List aq;
    private List ar;
    private List as;
    private List at;
    private List au;
    private List av;
    private List aw;
    private final com.qihoo.security.malware.a.a.a ax = new com.qihoo.security.malware.a.a.a() {

        final VirusListActivity a;

        public void a()
        {
            com.qihoo.security.ui.antivirus.list.VirusListActivity.b(a, false);
            if (VirusListActivity.k(a).size() > 0)
            {
                VirusListActivity.l(a);
            }
            if (VirusListActivity.m(a))
            {
                com.qihoo.security.opti.trashclear.ui.i i1;
                for (Iterator iterator = VirusListActivity.n(a).iterator(); iterator.hasNext(); com.qihoo.security.ui.antivirus.list.VirusListActivity.b(a, i1))
                {
                    i1 = (com.qihoo.security.opti.trashclear.ui.i)iterator.next();
                }

                com.qihoo.security.ui.antivirus.list.VirusListActivity.p(a).postDelayed(new Runnable(this) {

                    final _cls9 a;

                    public void run()
                    {
                        VirusListActivity.o(a.a);
                    }

            
            {
                a = _pcls9;
                super();
            }
                }, 400L);
            }
        }

        public void a(MaliciousInfo maliciousinfo, int i1, int j1)
        {
        }

        public void b()
        {
        }

            
            {
                a = VirusListActivity.this;
                super();
            }
    };
    private final a.a ay = new a.a() {

        final VirusListActivity a;

        public void a(com.qihoo.security.opti.trashclear.ui.i i1)
        {
label0:
            {
                com.qihoo.security.ui.antivirus.list.VirusListActivity.d(a, false);
                com.qihoo.security.ui.antivirus.list.VirusListActivity.c(a, i1);
                if (com.qihoo.security.ui.antivirus.list.VirusListActivity.q(a) != null && VirusListActivity.r(a))
                {
                    com.qihoo.security.ui.antivirus.list.VirusListActivity.q(a).c();
                    if (VirusListActivity.s(a) < VirusListActivity.n(a).size())
                    {
                        VirusListActivity.t(a).a();
                    }
                }
                if (VirusListActivity.u(a))
                {
                    if (VirusListActivity.s(a) >= VirusListActivity.k(a).size())
                    {
                        break label0;
                    }
                    i1 = ((MaliciousInfo)((com.qihoo.security.opti.trashclear.ui.i)VirusListActivity.k(a).get(VirusListActivity.s(a))).c()).packageName;
                    com.qihoo360.mobilesafe.b.a.a(a.p, i1);
                    VirusListActivity.t(a).b();
                }
                return;
            }
            com.qihoo.security.ui.antivirus.list.VirusListActivity.c(a, false);
        }

            
            {
                a = VirusListActivity.this;
                super();
            }
    };
    private final PackageReceiver.a az = new PackageReceiver.a() {

        final VirusListActivity a;

        public void a(String s1)
        {
        }

        public void b(String s1)
        {
label0:
            {
                if (VirusListActivity.h(a) == null || TextUtils.isEmpty(s1))
                {
                    break label0;
                }
                Iterator iterator = VirusListActivity.h(a).a().iterator();
                com.qihoo.security.opti.trashclear.ui.i i1;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    i1 = (com.qihoo.security.opti.trashclear.ui.i)iterator.next();
                } while (!s1.equals(((MaliciousInfo)i1.c()).packageName));
                if (!VirusListActivity.r(a) && !VirusListActivity.u(a) && !VirusListActivity.v(a))
                {
                    VirusListActivity.w(a).postDelayed(new Runnable(this, i1) {

                        final com.qihoo.security.opti.trashclear.ui.i a;
                        final _cls11 b;

                        public void run()
                        {
                            com.qihoo.security.ui.antivirus.list.VirusListActivity.a(b.a, a);
                        }

            
            {
                b = _pcls11;
                a = i1;
                super();
            }
                    }, 400L);
                }
            }
        }

        public void c(String s1)
        {
        }

            
            {
                a = VirusListActivity.this;
                super();
            }
    };
    private LinearLayout z;

    public VirusListActivity()
    {
        F = null;
        N = false;
        Q = com.qihoo.security.ui.antivirus.list.b.d;
        R = false;
        S = com.qihoo.security.ui.antivirus.list.a.a;
        T = -1;
        U = null;
        ab = 0;
        ai = com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT;
    }

    private void A()
    {
        SharedPref.a(p, "sp_key_virus_show_dialog_uninstall", false);
        i i1 = new i(this, 0x7f0c0148, 0x7f0c0149);
        i1.setButtonText(new int[] {
            0x7f0c00ee, 0x7f0c014f
        });
        i1.setButtonOnClickListener(new android.view.View.OnClickListener[] {
            new android.view.View.OnClickListener(i1) {

                final i a;
                final VirusListActivity b;

                public void onClick(View view)
                {
                    com.qihoo.security.ui.antivirus.list.VirusListActivity.i(b);
                    com.qihoo360.mobilesafe.b.d.b(a);
                }

            
            {
                b = VirusListActivity.this;
                a = i1;
                super();
            }
            }, new android.view.View.OnClickListener(i1) {

                final i a;
                final VirusListActivity b;

                public void onClick(View view)
                {
                    com.qihoo.security.ui.antivirus.list.VirusListActivity.b(b, false);
                    com.qihoo360.mobilesafe.b.d.b(a);
                }

            
            {
                b = VirusListActivity.this;
                a = i1;
                super();
            }
            }
        });
        i1.setOnKeyListener(new android.content.DialogInterface.OnKeyListener(i1) {

            final i a;
            final VirusListActivity b;

            public boolean onKey(DialogInterface dialoginterface, int j1, KeyEvent keyevent)
            {
                boolean flag = false;
                if (j1 == 4)
                {
                    com.qihoo.security.ui.antivirus.list.VirusListActivity.b(b, false);
                    com.qihoo360.mobilesafe.b.d.b(a);
                    flag = true;
                }
                return flag;
            }

            
            {
                b = VirusListActivity.this;
                a = i1;
                super();
            }
        });
        com.qihoo360.mobilesafe.b.d.a(i1);
    }

    private void B()
    {
        SharedPref.a(p, "sp_key_virus_show_dialog_forcestop", false);
        i i1 = new i(this, 0x7f0c010b, 0x7f0c014a);
        i1.setButtonText(new int[] {
            0x7f0c0151, 0x7f0c014f
        });
        i1.setButtonOnClickListener(new android.view.View.OnClickListener[] {
            new android.view.View.OnClickListener(i1) {

                final i a;
                final VirusListActivity b;

                public void onClick(View view)
                {
                    VirusListActivity.j(b);
                    com.qihoo360.mobilesafe.b.d.b(a);
                }

            
            {
                b = VirusListActivity.this;
                a = i1;
                super();
            }
            }, new android.view.View.OnClickListener(i1) {

                final i a;
                final VirusListActivity b;

                public void onClick(View view)
                {
                    com.qihoo.security.ui.antivirus.list.VirusListActivity.c(b, false);
                    com.qihoo360.mobilesafe.b.d.b(a);
                }

            
            {
                b = VirusListActivity.this;
                a = i1;
                super();
            }
            }
        });
        i1.setOnKeyListener(new android.content.DialogInterface.OnKeyListener(i1) {

            final i a;
            final VirusListActivity b;

            public boolean onKey(DialogInterface dialoginterface, int j1, KeyEvent keyevent)
            {
                boolean flag = false;
                if (j1 == 4)
                {
                    com.qihoo.security.ui.antivirus.list.VirusListActivity.c(b, false);
                    com.qihoo360.mobilesafe.b.d.b(a);
                    flag = true;
                }
                return flag;
            }

            
            {
                b = VirusListActivity.this;
                a = i1;
                super();
            }
        });
        com.qihoo360.mobilesafe.b.d.a(i1);
    }

    private void C()
    {
        Z.clear();
        ab = 0;
        Object obj = new ArrayList();
        for (Iterator iterator = Y.iterator(); iterator.hasNext();)
        {
            com.qihoo.security.opti.trashclear.ui.i i1 = (com.qihoo.security.opti.trashclear.ui.i)iterator.next();
            MaliciousInfo maliciousinfo = (MaliciousInfo)i1.c();
            if (maliciousinfo.isInstalled)
            {
                Z.add(maliciousinfo);
            } else
            {
                ((List) (obj)).add(i1);
                FileUtil.deleteFile(maliciousinfo.filePath);
                com.qihoo.security.malware.db.a.a(p, maliciousinfo._id);
                iterator.remove();
            }
        }

        int j1 = E.b();
        if (((List) (obj)).size() == j1 && j1 > 0)
        {
            for (obj = aw.iterator(); ((Iterator) (obj)).hasNext(); g((com.qihoo.security.opti.trashclear.ui.i)((Iterator) (obj)).next())) { }
        } else
        {
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); f((com.qihoo.security.opti.trashclear.ui.i)((Iterator) (obj)).next())) { }
        }
        if (!N) goto _L2; else goto _L1
_L1:
        if (Z.size() <= 0) goto _L4; else goto _L3
_L3:
        P.a(Z);
_L6:
        return;
_L4:
        if (an)
        {
            z();
            return;
        }
        if (ao)
        {
            w.sendMessageDelayed(w.obtainMessage(1000), 400L);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (Z.size() > 0)
        {
            ac = true;
            P.a(Z);
            al.a();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void D()
    {
        X.clear();
        ab = 0;
        for (Iterator iterator = W.iterator(); iterator.hasNext();)
        {
            com.qihoo.security.opti.trashclear.ui.i i1 = (com.qihoo.security.opti.trashclear.ui.i)iterator.next();
            MaliciousInfo maliciousinfo = (MaliciousInfo)i1.c();
            if (maliciousinfo.isInstalled)
            {
                X.add(maliciousinfo);
            } else
            {
                FileUtil.deleteFile(maliciousinfo.filePath);
                com.qihoo.security.malware.db.a.a(p, maliciousinfo._id);
                f(i1);
                iterator.remove();
            }
        }

        if (X.size() > 0)
        {
            ad = true;
            aa = (com.qihoo.security.opti.trashclear.ui.i)W.get(ab);
            com.qihoo360.mobilesafe.b.a.a(p, ((MaliciousInfo)aa.c()).packageName);
            al.b();
        }
    }

    private void E()
    {
        al.e();
        if (!ah) goto _L2; else goto _L1
_L1:
        if (ag || com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT == ai)
        {
            setResult(-1, getIntent().putExtra("is_deep_scan", O));
        }
_L4:
        finish();
        return;
_L2:
        if (ag)
        {
            setResult(-1, getIntent().putExtra("is_deep_scan", O));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(Intent intent, boolean flag)
    {
        String s1;
        O = intent.getBooleanExtra("is_deep_scan", false);
        L = intent.getIntExtra("color", getResources().getColor(0x7f080057));
        s1 = intent.getAction();
        if (!"com.qihoo.security.notify.ACTION_RISKY_APP".equals(s1)) goto _L2; else goto _L1
_L1:
        S = com.qihoo.security.ui.antivirus.list.a.b;
_L4:
        if (intent.getBooleanExtra("from_notify", false))
        {
            com.qihoo.security.ui.result.f.a().a(5);
        }
        if (flag && F != null)
        {
            t();
        }
        com.qihoo.utils.notice.a.a().b(4097);
        com.qihoo.utils.notice.a.a().b(4098);
        com.qihoo.utils.notice.a.a().b(4109);
        return;
_L2:
        if ("com.qihoo.security.notify.ACTION_ADV_APP".equals(s1))
        {
            S = com.qihoo.security.ui.antivirus.list.a.c;
        } else
        if ("com.qihoo.security.notify.ACTION_MALWARE".equals(s1))
        {
            S = com.qihoo.security.ui.antivirus.list.a.d;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(c c1)
    {
        Intent intent = new Intent(p, com/qihoo/security/ui/antivirus/LeakDetailActivity);
        intent.putExtra("extra_leak_id", c1.a());
        startActivityForResult(intent, 200);
    }

    private void a(MaliciousInfo maliciousinfo)
    {
        af = true;
        Intent intent = new Intent(p, com/qihoo/security/ui/antivirus/MalwareDetailActivity);
        intent.putExtra("extra_detail_info", maliciousinfo);
        intent.putExtra("extra_from_virus_list", true);
        startActivityForResult(intent, 100);
    }

    static void a(VirusListActivity viruslistactivity)
    {
        viruslistactivity.q();
    }

    static void a(VirusListActivity viruslistactivity, com.qihoo.security.opti.trashclear.ui.i i1)
    {
        viruslistactivity.f(i1);
    }

    private void a(int ai1[])
    {
        int i1 = ai1[0] + ai1[1] + ai1[2] + ai1[3] + ai1[4];
        if (i1 == 0)
        {
            return;
        }
        if (ai1[0] > 0)
        {
            A.setLocalText(o.a(0x7f0c0121));
            B.setLocalText(o.a(0x7f0f0003, i1, new Object[] {
                Integer.valueOf(i1)
            }));
            a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER);
            com.qihoo.security.support.b.b(14031, ai1[0]);
            return;
        }
        if (ai1[3] + ai1[4] == 0)
        {
            A.setLocalText(o.a(0x7f0c0138));
            B.setLocalText(o.a(0x7f0f0002, i1, new Object[] {
                Integer.valueOf(i1)
            }));
            a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT);
            return;
        } else
        {
            A.setLocalText(o.a(0x7f0c0122));
            B.setLocalText(o.a(0x7f0f0003, i1, new Object[] {
                Integer.valueOf(i1)
            }));
            a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.NEED_OPTIMIZE);
            return;
        }
    }

    private void a(int ai1[], int ai2[])
    {
        int i1 = ai1[0] + ai1[1] + ai1[2] + ai1[3] + ai1[4];
        int j1 = ai2[0] + ai2[1] + ai2[2] + ai2[3] + ai2[4];
        static class _cls13
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[b.values().length];
                try
                {
                    b[com.qihoo.security.ui.antivirus.list.b.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    b[com.qihoo.security.ui.antivirus.list.b.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    b[com.qihoo.security.ui.antivirus.list.b.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    b[com.qihoo.security.ui.antivirus.list.b.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                a = new int[com.qihoo.security.malware.vo.MaliciousInfo.GroupType.values().length];
                try
                {
                    a[com.qihoo.security.malware.vo.MaliciousInfo.GroupType.GROUP_TYPE_MALWARE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.qihoo.security.malware.vo.MaliciousInfo.GroupType.GROUP_TYPE_WARNING.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.qihoo.security.malware.vo.MaliciousInfo.GroupType.GROUP_TYPE_ADVERT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.qihoo.security.malware.vo.MaliciousInfo.GroupType.GROUP_TYPE_FLAW.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.qihoo.security.malware.vo.MaliciousInfo.GroupType.GROUP_TYPE_PROTECTION.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        if (i1 > 0)
        {
            if (j1 == 0)
            {
                if (ai1[0] + ai1[3] + ai1[4] == 0)
                {
                    Q = com.qihoo.security.ui.antivirus.list.b.d;
                } else
                {
                    Q = com.qihoo.security.ui.antivirus.list.b.c;
                }
            } else
            if (j1 == i1)
            {
                Q = com.qihoo.security.ui.antivirus.list.b.a;
            } else
            {
                Q = com.qihoo.security.ui.antivirus.list.b.b;
            }
        } else
        {
            Q = com.qihoo.security.ui.antivirus.list.b.d;
        }
        switch (com.qihoo.security.ui.antivirus.list._cls13.b[Q.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            K.setLocalText(0x7f0c0146);
            return;

        case 2: // '\002'
            K.setLocalText(0x7f0c0147);
            return;

        case 3: // '\003'
            K.setLocalText(0x7f0c0100);
            return;

        case 4: // '\004'
            K.setLocalText(0x7f0c0155);
            break;
        }
    }

    static boolean a(VirusListActivity viruslistactivity, boolean flag)
    {
        viruslistactivity.ae = flag;
        return flag;
    }

    static View b(VirusListActivity viruslistactivity)
    {
        return viruslistactivity.I;
    }

    private void b(com.qihoo.security.opti.trashclear.ui.i i1)
    {
        if (U != null)
        {
            com.qihoo.security.opti.trashclear.ui.i j1 = i1.a();
            if (j1 != null)
            {
                b(j1);
                return;
            }
            if (U == i1 && E != null)
            {
                E.a(I, i1);
                return;
            }
        }
    }

    static void b(VirusListActivity viruslistactivity, com.qihoo.security.opti.trashclear.ui.i i1)
    {
        viruslistactivity.g(i1);
    }

    static boolean b(VirusListActivity viruslistactivity, boolean flag)
    {
        viruslistactivity.ac = flag;
        return flag;
    }

    static com.qihoo.security.opti.trashclear.ui.i c(VirusListActivity viruslistactivity)
    {
        return viruslistactivity.U;
    }

    private void c(com.qihoo.security.opti.trashclear.ui.i i1)
    {
        aa = i1;
        MaliciousInfo maliciousinfo = (MaliciousInfo)i1.c();
        switch (com.qihoo.security.ui.antivirus.list._cls13.a[maliciousinfo.groupType.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            a(maliciousinfo);
            return;

        case 4: // '\004'
            a(maliciousinfo.leakItem);
            return;

        case 5: // '\005'
            d(i1);
            break;
        }
    }

    static void c(VirusListActivity viruslistactivity, com.qihoo.security.opti.trashclear.ui.i i1)
    {
        viruslistactivity.h(i1);
    }

    static boolean c(VirusListActivity viruslistactivity, boolean flag)
    {
        viruslistactivity.ad = flag;
        return flag;
    }

    static com.qihoo.security.ui.antivirus.list.d d(VirusListActivity viruslistactivity)
    {
        return viruslistactivity.G;
    }

    private void d(com.qihoo.security.opti.trashclear.ui.i i1)
    {
        com.qihoo.security.support.b.c(14020);
        com.qihoo.security.ui.antivirus.a a1 = new com.qihoo.security.ui.antivirus.a(this);
        a1.setDialogTitle(0x7f0c0108);
        a1.c();
        a1.setCancelable(true);
        a1.setButtonText(new int[] {
            0x7f0c0109
        });
        a1.setButtonOnClickListener(new android.view.View.OnClickListener[] {
            new android.view.View.OnClickListener(a1, i1) {

                final com.qihoo.security.ui.antivirus.a a;
                final com.qihoo.security.opti.trashclear.ui.i b;
                final VirusListActivity c;

                public void onClick(View view)
                {
                    if (!SharedPref.b(c.p, "setting_auto_start", true))
                    {
                        SharedPref.a(c.p, "setting_auto_start", true);
                    }
                    com.qihoo360.mobilesafe.b.d.b(a);
                    com.qihoo.security.opti.trashclear.ui.i j1;
                    for (view = VirusListActivity.h(c).h(b.a()).iterator(); view.hasNext(); com.qihoo.security.ui.antivirus.list.VirusListActivity.b(c, j1))
                    {
                        j1 = (com.qihoo.security.opti.trashclear.ui.i)view.next();
                    }

                    com.qihoo.security.support.b.c(14019);
                }

            
            {
                c = VirusListActivity.this;
                a = a1;
                b = i1;
                super();
            }
            }
        });
        a1.setOnKeyListener(new android.content.DialogInterface.OnKeyListener(a1) {

            final com.qihoo.security.ui.antivirus.a a;
            final VirusListActivity b;

            public boolean onKey(DialogInterface dialoginterface, int j1, KeyEvent keyevent)
            {
                if (j1 == 4)
                {
                    com.qihoo360.mobilesafe.b.d.b(a);
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                b = VirusListActivity.this;
                a = a1;
                super();
            }
        });
        a1.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final VirusListActivity a;

            public void onCancel(DialogInterface dialoginterface)
            {
                SharedPref.a(a.p, "setting_auto_start", false);
            }

            
            {
                a = VirusListActivity.this;
                super();
            }
        });
        com.qihoo360.mobilesafe.b.d.a(a1);
    }

    static boolean d(VirusListActivity viruslistactivity, boolean flag)
    {
        viruslistactivity.af = flag;
        return flag;
    }

    private com.qihoo.security.opti.trashclear.ui.i e(com.qihoo.security.opti.trashclear.ui.i i1)
    {
        com.qihoo.security.opti.trashclear.ui.i j1;
        if (i1 == null)
        {
            j1 = null;
        } else
        {
            j1 = i1;
            if (i1.a() != null)
            {
                return e(i1.a());
            }
        }
        return j1;
    }

    static void e(VirusListActivity viruslistactivity)
    {
        viruslistactivity.r();
    }

    private void f(com.qihoo.security.opti.trashclear.ui.i i1)
    {
        if (i1 != null)
        {
            ArrayList arraylist = new ArrayList();
            com.qihoo.security.opti.trashclear.ui.i j1 = i1.a();
            List list = j1.b();
            list.size();
            if (j1.d())
            {
                if (list.size() == 1)
                {
                    arraylist.add(j1);
                    arraylist.add(i1);
                } else
                {
                    arraylist.add(i1);
                }
            } else
            if (list.size() == 1)
            {
                arraylist.add(j1);
            } else
            {
                h(i1);
            }
            for (i1 = arraylist.iterator(); i1.hasNext(); g((com.qihoo.security.opti.trashclear.ui.i)i1.next())) { }
        }
    }

    static void f(VirusListActivity viruslistactivity)
    {
        viruslistactivity.t();
    }

    static com.qihoo.security.opti.trashclear.ui.i g(VirusListActivity viruslistactivity)
    {
        return viruslistactivity.aa;
    }

    private void g(com.qihoo.security.opti.trashclear.ui.i i1)
    {
        int j1 = E.e(i1);
        if (j1 <= D.getLastVisiblePosition())
        {
            View view = D.getChildAt(j1);
            if (view == null)
            {
                V.a(i1);
                return;
            } else
            {
                V.a(view, i1);
                return;
            }
        } else
        {
            V.a(i1);
            return;
        }
    }

    static com.qihoo.security.ui.antivirus.list.c h(VirusListActivity viruslistactivity)
    {
        return viruslistactivity.E;
    }

    private void h(com.qihoo.security.opti.trashclear.ui.i i1)
    {
        if (E != null && i1 != null)
        {
            E.a(i1);
            E.a(i1, 0);
            E.a(I, U);
            s();
            if (E.getCount() == 0)
            {
                ag = true;
                E();
            }
        }
    }

    static void i(VirusListActivity viruslistactivity)
    {
        viruslistactivity.C();
    }

    static void j(VirusListActivity viruslistactivity)
    {
        viruslistactivity.D();
    }

    static List k(VirusListActivity viruslistactivity)
    {
        return viruslistactivity.W;
    }

    static void l(VirusListActivity viruslistactivity)
    {
        viruslistactivity.B();
    }

    static boolean m(VirusListActivity viruslistactivity)
    {
        return viruslistactivity.N;
    }

    static List n(VirusListActivity viruslistactivity)
    {
        return viruslistactivity.Y;
    }

    private void o()
    {
        z = (LinearLayout)findViewById(0x7f0b00eb);
        B = (LocaleTextView)findViewById(0x7f0b0228);
        A = (LocaleTextView)findViewById(0x7f0b0227);
        C = findViewById(0x7f0b009b);
        C.setVisibility(0);
        J = findViewById(0x7f0b00f3);
        D = (ListView)findViewById(0x7f0b00f2);
        D.setOnScrollListener(this);
        H = (FrameLayout)findViewById(0x7f0b00f4);
        I = View.inflate(p, 0x7f0300ad, H);
        I.setOnClickListener(new android.view.View.OnClickListener() {

            final VirusListActivity a;

            public void onClick(View view)
            {
                a.a(com.qihoo.security.ui.antivirus.list.VirusListActivity.b(a), com.qihoo.security.ui.antivirus.list.VirusListActivity.c(a));
            }

            
            {
                a = VirusListActivity.this;
                super();
            }
        });
        K = (LocaleTextView)findViewById(0x7f0b00f6);
        K.setOnClickListener(this);
    }

    static void o(VirusListActivity viruslistactivity)
    {
        viruslistactivity.z();
    }

    static com.qihoo.security.app.BaseActivity.a p(VirusListActivity viruslistactivity)
    {
        return viruslistactivity.w;
    }

    private void p()
    {
        setColor(L);
        N = com.qihoo360.mobilesafe.support.a.c(p);
        P = new com.qihoo.security.malware.a.b(this, N, ax);
        M = new e(L);
        M.a(this);
        G = new com.qihoo.security.ui.antivirus.list.d();
    }

    static com.qihoo.security.malware.a.b q(VirusListActivity viruslistactivity)
    {
        return viruslistactivity.P;
    }

    private void q()
    {
        if (ae)
        {
            return;
        } else
        {
            com.qihoo360.mobilesafe.b.p.a().execute(new Runnable() {

                final VirusListActivity a;

                public void run()
                {
                    com.qihoo.security.ui.antivirus.list.VirusListActivity.a(a, true);
                    com.qihoo.security.ui.antivirus.list.VirusListActivity.d(a).b();
                    a.runOnUiThread(new Runnable(this) {

                        final _cls14 a;

                        public void run()
                        {
                            com.qihoo.security.ui.antivirus.list.VirusListActivity.e(a.a);
                            com.qihoo.security.ui.antivirus.list.VirusListActivity.f(a.a);
                        }

            
            {
                a = _pcls14;
                super();
            }
                    });
                    com.qihoo.security.ui.antivirus.list.VirusListActivity.a(a, false);
                }

            
            {
                a = VirusListActivity.this;
                super();
            }
            });
            return;
        }
    }

    private void r()
    {
        F = G.a();
        if (F == null || F.isEmpty())
        {
            ag = true;
            E();
            return;
        } else
        {
            E = new com.qihoo.security.ui.antivirus.list.c(p, F);
            D.setAdapter(E);
            E.a(this);
            E.a(this);
            s();
            C.setVisibility(8);
            return;
        }
    }

    static boolean r(VirusListActivity viruslistactivity)
    {
        return viruslistactivity.ac;
    }

    static int s(VirusListActivity viruslistactivity)
    {
        return viruslistactivity.ab;
    }

    private void s()
    {
        int ai1[] = new int[5];
        int ai2[] = new int[5];
        Iterator iterator = F.iterator();
        do
        {
            if (iterator.hasNext())
            {
                Object obj = (com.qihoo.security.opti.trashclear.ui.i)iterator.next();
                MaliciousInfo maliciousinfo = (MaliciousInfo)((com.qihoo.security.opti.trashclear.ui.i) (obj)).c();
                switch (com.qihoo.security.ui.antivirus.list._cls13.a[maliciousinfo.groupType.ordinal()])
                {
                case 1: // '\001'
                    ai1[0] = ((com.qihoo.security.opti.trashclear.ui.i) (obj)).b().size();
                    ai2[0] = E.g(((com.qihoo.security.opti.trashclear.ui.i) (obj))).size();
                    break;

                case 2: // '\002'
                    obj = ((com.qihoo.security.opti.trashclear.ui.i) (obj)).b();
                    if (obj != null && ((List) (obj)).size() > 0)
                    {
                        obj = (com.qihoo.security.opti.trashclear.ui.i)((List) (obj)).get(0);
                        ai1[2] = ((com.qihoo.security.opti.trashclear.ui.i) (obj)).b().size();
                        ai2[2] = E.g(((com.qihoo.security.opti.trashclear.ui.i) (obj))).size();
                    } else
                    {
                        ai1[2] = 0;
                        ai2[2] = 0;
                    }
                    break;

                case 3: // '\003'
                    ai1[1] = ((com.qihoo.security.opti.trashclear.ui.i) (obj)).b().size();
                    ai2[1] = E.g(((com.qihoo.security.opti.trashclear.ui.i) (obj))).size();
                    break;

                case 4: // '\004'
                    ai1[3] = ((com.qihoo.security.opti.trashclear.ui.i) (obj)).b().size();
                    ai2[3] = E.g(((com.qihoo.security.opti.trashclear.ui.i) (obj))).size();
                    break;

                case 5: // '\005'
                    ai1[4] = ((com.qihoo.security.opti.trashclear.ui.i) (obj)).b().size();
                    ai2[4] = E.g(((com.qihoo.security.opti.trashclear.ui.i) (obj))).size();
                    break;
                }
            } else
            {
                a(ai1);
                a(ai1, ai2);
                return;
            }
        } while (true);
    }

    static com.qihoo.security.ui.antivirus.list.b t(VirusListActivity viruslistactivity)
    {
        return viruslistactivity.al;
    }

    private void t()
    {
        Iterator iterator = F.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (com.qihoo.security.opti.trashclear.ui.i)iterator.next();
            MaliciousInfo maliciousinfo = (MaliciousInfo)((com.qihoo.security.opti.trashclear.ui.i) (obj)).c();
            if (maliciousinfo.isExpand != 0)
            {
                switch (com.qihoo.security.ui.antivirus.list._cls13.a[maliciousinfo.groupType.ordinal()])
                {
                default:
                    break;

                case 1: // '\001'
                    if (com.qihoo.security.ui.antivirus.list.a.c == S || com.qihoo.security.ui.antivirus.list.a.b == S)
                    {
                        if (((com.qihoo.security.opti.trashclear.ui.i) (obj)).d())
                        {
                            E.b(((com.qihoo.security.opti.trashclear.ui.i) (obj)));
                        }
                        break;
                    }
                    if (com.qihoo.security.ui.antivirus.list.a.d == S)
                    {
                        if (!((com.qihoo.security.opti.trashclear.ui.i) (obj)).d())
                        {
                            E.b(((com.qihoo.security.opti.trashclear.ui.i) (obj)));
                        }
                    } else
                    {
                        E.b(((com.qihoo.security.opti.trashclear.ui.i) (obj)));
                    }
                    break;

                case 2: // '\002'
                case 3: // '\003'
                    if (com.qihoo.security.ui.antivirus.list.a.c == S || com.qihoo.security.ui.antivirus.list.a.b == S)
                    {
                        if (!((com.qihoo.security.opti.trashclear.ui.i) (obj)).d())
                        {
                            E.b(((com.qihoo.security.opti.trashclear.ui.i) (obj)));
                        }
                        obj = ((com.qihoo.security.opti.trashclear.ui.i) (obj)).b();
                        if (obj == null || ((List) (obj)).size() <= 0)
                        {
                            break;
                        }
                        obj = (com.qihoo.security.opti.trashclear.ui.i)((List) (obj)).get(0);
                        if (!((com.qihoo.security.opti.trashclear.ui.i) (obj)).d())
                        {
                            E.b(((com.qihoo.security.opti.trashclear.ui.i) (obj)));
                        }
                        break;
                    }
                    if (com.qihoo.security.ui.antivirus.list.a.d == S)
                    {
                        if (((com.qihoo.security.opti.trashclear.ui.i) (obj)).d())
                        {
                            E.b(((com.qihoo.security.opti.trashclear.ui.i) (obj)));
                        }
                    } else
                    {
                        E.b(((com.qihoo.security.opti.trashclear.ui.i) (obj)));
                    }
                    break;

                case 4: // '\004'
                case 5: // '\005'
                    if (com.qihoo.security.ui.antivirus.list.a.c == S || com.qihoo.security.ui.antivirus.list.a.b == S || com.qihoo.security.ui.antivirus.list.a.d == S)
                    {
                        if (((com.qihoo.security.opti.trashclear.ui.i) (obj)).d())
                        {
                            E.b(((com.qihoo.security.opti.trashclear.ui.i) (obj)));
                        }
                    } else
                    {
                        E.b(((com.qihoo.security.opti.trashclear.ui.i) (obj)));
                    }
                    break;
                }
            }
        } while (true);
    }

    private void u()
    {
        if (D != null && D.getChildCount() > 0)
        {
            if (E != null && E.getCount() > 0)
            {
                if (U == null)
                {
                    U = E.a(0);
                }
                if (U != null)
                {
                    H.setVisibility(0);
                    E.a(I, U);
                }
            }
            return;
        } else
        {
            H.setVisibility(8);
            return;
        }
    }

    static boolean u(VirusListActivity viruslistactivity)
    {
        return viruslistactivity.ad;
    }

    private void v()
    {
        Y.clear();
        W.clear();
        ap = new ArrayList();
        aq = new ArrayList();
        ar = new ArrayList();
        as = new ArrayList();
        at = new ArrayList();
        au = new ArrayList();
        av = new ArrayList();
        aw = new ArrayList();
    }

    static boolean v(VirusListActivity viruslistactivity)
    {
        return viruslistactivity.af;
    }

    static com.qihoo.security.app.BaseActivity.a w(VirusListActivity viruslistactivity)
    {
        return viruslistactivity.w;
    }

    private void w()
    {
        Iterator iterator = F.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.qihoo.security.opti.trashclear.ui.i i1 = (com.qihoo.security.opti.trashclear.ui.i)iterator.next();
            MaliciousInfo maliciousinfo = (MaliciousInfo)i1.c();
            switch (com.qihoo.security.ui.antivirus.list._cls13.a[maliciousinfo.groupType.ordinal()])
            {
            case 1: // '\001'
                as = E.g(i1);
                aw = E.h(i1);
                break;

            case 2: // '\002'
                List list = i1.b();
                if (list != null && list.size() > 0)
                {
                    ar = E.g((com.qihoo.security.opti.trashclear.ui.i)list.get(0));
                }
                av = E.h(i1);
                break;

            case 3: // '\003'
                ar = E.g(i1);
                break;

            case 4: // '\004'
                ap = E.g(i1);
                at = E.h(i1);
                break;

            case 5: // '\005'
                aq = E.g(i1);
                au = E.h(i1);
                break;
            }
        } while (true);
    }

    private void x()
    {
        v();
        w();
        int i1 = ap.size() + aq.size() + as.size() + ar.size();
        if (i1 == 0)
        {
            com.qihoo360.mobilesafe.b.q.a().a(0x7f0c010c);
            return;
        }
        if (ap.size() + aq.size() + ar.size() == 0)
        {
            an = false;
        } else
        {
            an = true;
        }
        com.qihoo.security.support.b.b(14032, i1);
        com.qihoo.security.support.b.c(14301);
        if (as.size() > 0)
        {
            ao = true;
            com.qihoo360.mobilesafe.b.d.a(am);
            Y.addAll(as);
            C();
            return;
        } else
        {
            ao = false;
            z();
            return;
        }
    }

    private void y()
    {
        v();
        w();
        int j1 = ap.size() + aq.size() + as.size() + ar.size();
        if (j1 == 0)
        {
            com.qihoo360.mobilesafe.b.q.a().a(0x7f0c010c);
        } else
        {
            com.qihoo.security.support.b.b(14032, j1);
            com.qihoo.security.support.b.c(14301);
            z();
            for (Iterator iterator = as.iterator(); iterator.hasNext();)
            {
                com.qihoo.security.opti.trashclear.ui.i i1 = (com.qihoo.security.opti.trashclear.ui.i)iterator.next();
                if (((MaliciousInfo)i1.c()).isSystem && !N)
                {
                    W.add(i1);
                } else
                {
                    Y.add(i1);
                }
            }

            if (Y.size() > 0)
            {
                if (N)
                {
                    C();
                    return;
                }
                if (SharedPref.b(p, "sp_key_virus_show_dialog_uninstall", true))
                {
                    A();
                    return;
                } else
                {
                    C();
                    return;
                }
            }
            if (W.size() > 0)
            {
                if (SharedPref.b(p, "sp_key_virus_show_dialog_forcestop", true))
                {
                    B();
                    return;
                } else
                {
                    D();
                    return;
                }
            }
        }
    }

    private void z()
    {
        if (ap.size() > 0)
        {
            for (Iterator iterator = ap.iterator(); iterator.hasNext(); ((MaliciousInfo)((com.qihoo.security.opti.trashclear.ui.i)iterator.next()).c()).leakItem.f()) { }
            if (at.size() > 0)
            {
                for (Iterator iterator1 = at.iterator(); iterator1.hasNext(); g((com.qihoo.security.opti.trashclear.ui.i)iterator1.next())) { }
            } else
            {
                for (Iterator iterator2 = ap.iterator(); iterator2.hasNext(); h((com.qihoo.security.opti.trashclear.ui.i)iterator2.next())) { }
            }
        }
        if (aq.size() > 0)
        {
            SharedPref.a(p, "setting_auto_start", true);
            for (Iterator iterator3 = au.iterator(); iterator3.hasNext(); g((com.qihoo.security.opti.trashclear.ui.i)iterator3.next())) { }
        }
        if (ar.size() > 0)
        {
            ArrayList arraylist = new ArrayList();
            for (Iterator iterator4 = ar.iterator(); iterator4.hasNext();)
            {
                MaliciousInfo maliciousinfo = (MaliciousInfo)((com.qihoo.security.opti.trashclear.ui.i)iterator4.next()).c();
                if (maliciousinfo.isInstalled)
                {
                    arraylist.add(maliciousinfo);
                } else
                {
                    FileUtil.deleteFile(maliciousinfo.filePath);
                    com.qihoo.security.malware.db.a.a(p, maliciousinfo._id);
                }
            }

            if (av.size() > 0)
            {
                for (Iterator iterator5 = av.iterator(); iterator5.hasNext(); g((com.qihoo.security.opti.trashclear.ui.i)iterator5.next())) { }
            } else
            {
                for (Iterator iterator6 = ar.iterator(); iterator6.hasNext(); h((com.qihoo.security.opti.trashclear.ui.i)iterator6.next())) { }
            }
            com.qihoo.security.malware.db.c.a(p, arraylist, true);
        }
        if (N && ao)
        {
            w.sendMessageDelayed(w.obtainMessage(1000), 400L);
        }
    }

    public void a(int i1)
    {
    }

    protected void a(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 101: // 'e'
            al.c();
            return;

        case 102: // 'f'
            al.e();
            return;

        case 103: // 'g'
            al.d();
            return;

        case 104: // 'h'
            al.e();
            return;

        case 1000: 
            com.qihoo360.mobilesafe.b.d.b(am);
            break;
        }
    }

    public void a(View view, com.qihoo.security.opti.trashclear.ui.i i1)
    {
        ((MaliciousInfo)i1.c()).isExpand;
        JVM INSTR tableswitch 0 2: default 40
    //                   0 46
    //                   1 54
    //                   2 65;
           goto _L1 _L2 _L3 _L4
_L1:
        b(i1);
        return;
_L2:
        c(i1);
        continue; /* Loop/switch isn't completed */
_L3:
        E.b(i1);
        continue; /* Loop/switch isn't completed */
_L4:
        E.b(i1);
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void a(com.qihoo.security.opti.trashclear.ui.i i1)
    {
        E.f(i1);
        b(i1);
        s();
    }

    public void a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus)
    {
        ai = examstatus;
        int i1 = com.qihoo360.mobilesafe.b.c.a(p, examstatus);
        M.a(i1);
        L = i1;
    }

    public void finish()
    {
        Intent intent = getIntent();
        if (intent != null && intent.getBooleanExtra("from_notify", false))
        {
            intent.setClass(this, com/qihoo/security/ui/main/HomeActivity);
            intent.putExtra("fragment_index", 2);
            intent.setFlags(0x14000000);
            boolean flag;
            if (!R)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            intent.putExtra("jump_result_page", flag);
            intent.putExtra("from_notify", false);
            intent.putExtra("reset_main_page", true);
            startActivity(intent);
            R = false;
            return;
        } else
        {
            super.finish();
            return;
        }
    }

    protected void j()
    {
        super.j();
        if (r != null)
        {
            a(new ColorDrawable(L));
            b(0x7f0c0101);
        }
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (j1 == -1)
        {
            switch (i1)
            {
            default:
                return;

            case 100: // 'd'
                w.postDelayed(new Runnable() {

                    final VirusListActivity a;

                    public void run()
                    {
                        com.qihoo.security.ui.antivirus.list.VirusListActivity.a(a, com.qihoo.security.ui.antivirus.list.VirusListActivity.g(a));
                    }

            
            {
                a = VirusListActivity.this;
                super();
            }
                }, 400L);
                return;

            case 200: 
                w.postDelayed(new Runnable() {

                    final VirusListActivity a;

                    public void run()
                    {
                        com.qihoo.security.ui.antivirus.list.VirusListActivity.a(a, com.qihoo.security.ui.antivirus.list.VirusListActivity.g(a));
                    }

            
            {
                a = VirusListActivity.this;
                super();
            }
                }, 400L);
                return;

            case 300: 
                q();
                break;
            }
            return;
        } else
        {
            af = false;
            return;
        }
    }

    public void onBackPressed()
    {
        R = true;
        E();
    }

    public void onClick(View view)
    {
        if (com.qihoo360.mobilesafe.b.f.a())
        {
            return;
        }
        switch (view.getId())
        {
        default:
            return;

        case 2131427574: 
            break;
        }
        if (com.qihoo.security.ui.antivirus.list.b.d == Q)
        {
            E();
            return;
        }
        if (N)
        {
            x();
            return;
        } else
        {
            y();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f0300aa);
        a(getIntent(), false);
        o();
        p();
        q();
        com.qihoo.utils.notice.c.a(p, getIntent());
        com.qihoo360.mobilesafe.b.a.g(p);
        bundle = new IntentFilter("com.qihoo.security.FINISH_MAIN_SCREEN");
        bundle.addAction("com.qihoo.action.MONITOR_UPDATE");
        x.a(aj, bundle);
        ak = new PackageReceiver(az);
        ak.a(p);
        al = new com.qihoo.security.ui.antivirus.list.b(p, w);
        V = new com.qihoo.security.ui.antivirus.list.a(ay);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        (new com.qihoo.security.locale.widget.a(p)).inflate(0x7f100003, menu);
        a(menu, 0x7f0b0255, 0x7f020066);
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy()
    {
        al.e();
        M.a();
        com.qihoo360.mobilesafe.b.d.b(am);
        if (P != null)
        {
            P.d();
        }
        x.a(aj);
        ak.b(p);
        super.onDestroy();
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        a(intent, true);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR tableswitch 2131427925 2131427925: default 24
    //                   2131427925 30;
           goto _L1 _L2
_L1:
        return super.onOptionsItemSelected(menuitem);
_L2:
        startActivityForResult(new Intent(this, com/qihoo/security/ui/antivirus/VirusIgnoreListActivity), 300);
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void onResume()
    {
        super.onResume();
        N = com.qihoo360.mobilesafe.support.a.c(p);
        if (N && am == null)
        {
            am = new com.qihoo.security.dialog.g(this);
            am.a(0x7f0c00eb);
            am.setCancelable(false);
            am.setCanceledOnTouchOutside(false);
        }
        int i1 = W.size();
        if (ad && ab < i1)
        {
            aa = (com.qihoo.security.opti.trashclear.ui.i)W.get(ab);
            String s1 = ((MaliciousInfo)aa.c()).packageName;
            ab = ab + 1;
            if (com.qihoo360.mobilesafe.b.a.b(p, s1))
            {
                w.postDelayed(new Runnable() {

                    final VirusListActivity a;

                    public void run()
                    {
                        com.qihoo.security.ui.antivirus.list.VirusListActivity.a(a, com.qihoo.security.ui.antivirus.list.VirusListActivity.g(a));
                    }

            
            {
                a = VirusListActivity.this;
                super();
            }
                }, 400L);
            } else
            if (ab < i1)
            {
                String s2 = ((MaliciousInfo)((com.qihoo.security.opti.trashclear.ui.i)W.get(ab)).c()).packageName;
                com.qihoo360.mobilesafe.b.a.a(p, s2);
                al.b();
            } else
            {
                ad = false;
            }
        }
        i1 = Y.size();
        if (P != null && ac && ab < i1)
        {
            aa = (com.qihoo.security.opti.trashclear.ui.i)Y.get(ab);
            ab = ab + 1;
            if (!com.qihoo360.mobilesafe.b.i.a(p, ((MaliciousInfo)aa.c()).packageName))
            {
                w.postDelayed(new Runnable() {

                    final VirusListActivity a;

                    public void run()
                    {
                        com.qihoo.security.ui.antivirus.list.VirusListActivity.a(a, com.qihoo.security.ui.antivirus.list.VirusListActivity.g(a));
                    }

            
            {
                a = VirusListActivity.this;
                super();
            }
                }, 400L);
            } else
            {
                P.c();
                if (ab < i1)
                {
                    al.a();
                    return;
                }
            }
        }
    }

    public void onScroll(AbsListView abslistview, int i1, int j1, int k1)
    {
        if (E != null && i1 < E.getCount() && E != null && E.getCount() > 0)
        {
            abslistview = E.a(i1);
            if (abslistview != null)
            {
                abslistview = e(abslistview);
                if (U != abslistview)
                {
                    U = abslistview;
                    E.a(I, U);
                }
                k1 = 1;
                int l1 = 0;
                for (; k1 < j1 && abslistview == e(E.a(i1 + k1)); k1++)
                {
                    l1 = k1;
                }

                i1 = D.getHeight();
                abslistview = D.getChildAt(l1);
                if (abslistview != null)
                {
                    i1 = abslistview.getBottom();
                }
                j1 = H.getHeight();
                if (i1 < j1)
                {
                    abslistview = (android.widget.RelativeLayout.LayoutParams)H.getLayoutParams();
                    abslistview.topMargin = i1 - j1;
                    H.setLayoutParams(abslistview);
                    return;
                } else
                {
                    abslistview = (android.widget.RelativeLayout.LayoutParams)H.getLayoutParams();
                    abslistview.topMargin = 0;
                    H.setLayoutParams(abslistview);
                    return;
                }
            }
        }
    }

    public void onScrollStateChanged(AbsListView abslistview, int i1)
    {
        if (T == -1)
        {
            u();
        }
        T = i1;
    }

    protected void onStart()
    {
        super.onStart();
        if (P != null)
        {
            P.a();
        }
    }

    protected void onStop()
    {
        super.onStop();
        if (P != null)
        {
            P.b();
        }
    }

    public void setColor(int i1)
    {
        c(i1);
        z.setBackgroundColor(i1);
        com.qihoo360.mobilesafe.b.c.a(K, i1);
        a(new ColorDrawable(i1));
    }

}
