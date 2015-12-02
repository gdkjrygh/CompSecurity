// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.mainpage.opti;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import com.qihoo.security.app.BaseActivity;
import com.qihoo.security.clearengine.TrashType;
import com.qihoo.security.enginehelper.clean.a;
import com.qihoo.security.locale.d;
import com.qihoo.security.opti.trashclear.ui.ClearWhiteListActivity;
import com.qihoo.security.opti.trashclear.ui.h;
import com.qihoo.security.service.ProcessClearService;
import com.qihoo.security.support.b;
import com.qihoo.security.ui.result.f;
import com.qihoo360.mobilesafe.b.e;
import com.qihoo360.mobilesafe.opti.i.trashclear.TrashInfo;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ClearListActivity extends BaseActivity
    implements com.qihoo360.mobilesafe.b.e.a
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(float f1, float f2, boolean flag);

        public abstract void a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus);

        public abstract void a(List list);

        public abstract void b(List list);
    }


    private boolean A;
    private MenuItem B;
    private MenuItem C;
    private com.qihoo.security.enginehelper.clean.a D;
    private h E;
    private com.qihoo.security.opti.trashclear.ui.e F;
    private int G;
    private com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus H;
    private boolean I;
    private boolean J;
    private final boolean K = true;
    private int L;
    private e M;
    private boolean N;
    private long O;
    private final int P = 0;
    private final int Q = 1;
    private final int R = 2;
    private final int S = 3;
    private final Handler T = new Handler() {

        final ClearListActivity a;

        public void handleMessage(Message message)
        {
            if (!a.isFinishing()) goto _L2; else goto _L1
_L1:
            return;
_L2:
            switch (message.what)
            {
            default:
                return;

            case 0: // '\0'
                message = com.qihoo.security.opti.trashclear.ui.mainpage.a.a(com.qihoo.security.opti.trashclear.ui.mainpage.a.a(com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.a(a).c(com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.d(a))));
                if (com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.d(a) == 0)
                {
                    a.a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT);
                } else
                if (message != com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.e(a))
                {
                    com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.a(a, message);
                    com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.f(a).setExamStatus(com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.e(a));
                    com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.f(a).setBackgroundExamStatus(com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.e(a));
                    ClearListActivity.g(a).a(com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.b(a, com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.e(a)));
                }
                if (com.qihoo.security.opti.trashclear.ui.e.a(com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.d(a)).size() == 0)
                {
                    if (com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.d(a) != 0)
                    {
                        a.p();
                        return;
                    } else
                    {
                        com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.f(a).setData(com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.a(a));
                        return;
                    }
                } else
                {
                    com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.f(a).setData(com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.a(a));
                    return;
                }

            case 1: // '\001'
                com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.h(a);
                return;

            case 2: // '\002'
                if (!ClearListActivity.i(a))
                {
                    com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.f(a).setData(com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.a(a));
                    message = com.qihoo.security.opti.trashclear.ui.mainpage.a.a(com.qihoo.security.opti.trashclear.ui.mainpage.a.a(com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.a(a).c(com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.d(a))));
                    if (com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.d(a) == 0)
                    {
                        a.a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT);
                        return;
                    }
                    if (message != com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.e(a))
                    {
                        com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.a(a, message);
                        com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.f(a).setExamStatus(com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.e(a));
                        com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.f(a).setBackgroundExamStatus(com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.e(a));
                        ClearListActivity.g(a).a(com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.b(a, com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.e(a)));
                        return;
                    }
                } else
                {
                    ClearListActivity.c(a).sendEmptyMessage(0);
                    return;
                }
                break;

            case 3: // '\003'
                if (System.currentTimeMillis() - ClearListActivity.j(a) > 10000L)
                {
                    a.a(0.0F, 0.0F, true, ClearListActivity.i(a));
                    return;
                }
                com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.a(a, ClearListActivity.k(a).d());
                if (com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.a(a) == null)
                {
                    ClearListActivity.c(a).sendEmptyMessageDelayed(3, 50L);
                    return;
                } else
                {
                    ClearListActivity.l(a);
                    return;
                }
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

            
            {
                a = ClearListActivity.this;
                super();
            }
    };
    private final a U = new a() {

        final ClearListActivity a;

        public void a()
        {
            a.p();
        }

        public void a(float f1, float f2, boolean flag)
        {
            a.a(f1, f2, flag, ClearListActivity.i(a));
        }

        public void a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus)
        {
            com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.a(a, examstatus);
            ClearListActivity.g(a).a(com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.b(a, examstatus));
        }

        public void a(List list)
        {
            if (list == null || list.size() <= 0) goto _L2; else goto _L1
_L1:
            com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.a(a, com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.d(a));
            ClearListActivity.k(a).a(list);
            list = list.iterator();
_L6:
            if (!list.hasNext()) goto _L4; else goto _L3
_L3:
            if (((TrashInfo)list.next()).type != 37) goto _L6; else goto _L5
_L5:
            boolean flag = true;
_L8:
            if (flag)
            {
                ProcessClearService.c();
            }
_L2:
            return;
_L4:
            flag = false;
            if (true) goto _L8; else goto _L7
_L7:
        }

        public void b(List list)
        {
label0:
            {
                if (list != null && list.size() > 0)
                {
                    com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.a(a, com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.d(a));
                    if (((TrashInfo)list.get(0)).type != 37)
                    {
                        break label0;
                    }
                    ProcessClearService.c();
                }
                return;
            }
            ClearListActivity.k(a).a(list);
        }

            
            {
                a = ClearListActivity.this;
                super();
            }
    };
    private long y;
    private final String z = "";

    public ClearListActivity()
    {
        y = 0L;
        A = true;
        E = null;
        F = null;
        G = 1;
        H = com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT;
        I = true;
        J = false;
        L = 1;
        M = null;
        N = true;
    }

    static int a(ClearListActivity clearlistactivity, int i1)
    {
        clearlistactivity.L = i1;
        return i1;
    }

    public static Bundle a(boolean flag, com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus, boolean flag1)
    {
        Bundle bundle;
        byte byte0;
        byte byte1;
        byte1 = 2;
        bundle = new Bundle();
        bundle.putBoolean("bundle_is_deep", flag);
        byte0 = byte1;
        static class _cls4
        {

            static final int a[];

            static 
            {
                a = new int[com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.values().length];
                try
                {
                    a[com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.NEED_OPTIMIZE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.qihoo.security.opti.trashclear.ui.mainpage.opti._cls4.a[examstatus.ordinal()];
        JVM INSTR tableswitch 1 3: default 56
    //                   1 77
    //                   2 83
    //                   3 60;
           goto _L1 _L2 _L3 _L4
_L4:
        break; /* Loop/switch isn't completed */
_L1:
        byte0 = byte1;
_L6:
        bundle.putInt("bundle_status", byte0);
        bundle.putBoolean("bundle_is_scan_cancled", flag1);
        return bundle;
_L2:
        byte0 = 0;
        continue; /* Loop/switch isn't completed */
_L3:
        byte0 = 1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static com.qihoo.security.opti.trashclear.ui.e a(ClearListActivity clearlistactivity)
    {
        return clearlistactivity.F;
    }

    static com.qihoo.security.opti.trashclear.ui.e a(ClearListActivity clearlistactivity, com.qihoo.security.opti.trashclear.ui.e e1)
    {
        clearlistactivity.F = e1;
        return e1;
    }

    static com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus a(ClearListActivity clearlistactivity, com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus)
    {
        clearlistactivity.H = examstatus;
        return examstatus;
    }

    static int b(ClearListActivity clearlistactivity, com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus)
    {
        return clearlistactivity.b(examstatus);
    }

    private int b(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus)
    {
        if (examstatus == com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER)
        {
            return getResources().getColor(0x7f080058);
        }
        if (examstatus == com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.NEED_OPTIMIZE)
        {
            return getResources().getColor(0x7f080057);
        } else
        {
            return getResources().getColor(0x7f080056);
        }
    }

    static long b(ClearListActivity clearlistactivity)
    {
        return clearlistactivity.O;
    }

    static Handler c(ClearListActivity clearlistactivity)
    {
        return clearlistactivity.T;
    }

    static int d(ClearListActivity clearlistactivity)
    {
        return clearlistactivity.G;
    }

    private void d(int i1)
    {
        a(new ColorDrawable(i1));
        c(i1);
    }

    static com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus e(ClearListActivity clearlistactivity)
    {
        return clearlistactivity.H;
    }

    static h f(ClearListActivity clearlistactivity)
    {
        return clearlistactivity.E;
    }

    static e g(ClearListActivity clearlistactivity)
    {
        return clearlistactivity.M;
    }

    static void h(ClearListActivity clearlistactivity)
    {
        clearlistactivity.s();
    }

    static boolean i(ClearListActivity clearlistactivity)
    {
        return clearlistactivity.I;
    }

    static long j(ClearListActivity clearlistactivity)
    {
        return clearlistactivity.y;
    }

    static com.qihoo.security.enginehelper.clean.a k(ClearListActivity clearlistactivity)
    {
        return clearlistactivity.D;
    }

    static void l(ClearListActivity clearlistactivity)
    {
        clearlistactivity.t();
    }

    private void q()
    {
        a(H);
        M = new e(b(H));
        M.a(this);
        r();
        u();
    }

    private void r()
    {
        if (G == 0)
        {
            b(o.a(0x7f0c0254));
            return;
        } else
        {
            b(o.a(0x7f0c0250));
            return;
        }
    }

    private void s()
    {
        if (isFinishing())
        {
            return;
        }
        D = com.qihoo.security.enginehelper.clean.a.a(p);
        D.e();
        E.setTrashClearEngine(D);
        F = D.d();
        if (F == null)
        {
            y = System.currentTimeMillis();
            T.sendEmptyMessageDelayed(3, 50L);
            return;
        } else
        {
            t();
            return;
        }
    }

    private void t()
    {
        (new Thread() {

            final ClearListActivity a;

            public void run()
            {
                System.currentTimeMillis();
                Map map = com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.a(a).a();
                if (!SharedPref.b(a.p, "sp_key_has_clear_memory", false) && com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.b(a) > 0L)
                {
                    TrashInfo trashinfo = new TrashInfo();
                    trashinfo.type = 37;
                    trashinfo.clearType = 2;
                    trashinfo.isSelected = true;
                    trashinfo.size = com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.b(a);
                    trashinfo.desc = a.o.a(0x7f0c0217);
                    ArrayList arraylist = new ArrayList();
                    arraylist.add(trashinfo);
                    map.put(TrashType.CATE_MEMORY, arraylist);
                    com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.a(a).a(com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.b(a));
                }
                com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.a(a).b(map);
                ClearListActivity.c(a).sendEmptyMessage(2);
            }

            
            {
                a = ClearListActivity.this;
                super();
            }
        }).start();
    }

    private void u()
    {
        E = new h(this);
        E.setExamStatus(H);
        E.setClearCallBack(U);
        E.setViewType(G);
        E.setListViewAndListener(findViewById(0x7f0b00ea));
    }

    private void v()
    {
        finish();
    }

    public void a(float f1, float f2, boolean flag, boolean flag1)
    {
        Intent intent = new Intent();
        intent.putExtra("cleanSize", f2);
        if (G == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        intent.putExtra("isDeep", flag);
        intent.putExtra("isCancel", flag1);
        setResult(-1, intent);
        v();
    }

    public void a(int i1)
    {
    }

    public void a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus)
    {
        d(b(examstatus));
    }

    public void c(boolean flag)
    {
        if (B != null)
        {
            B.setVisible(flag);
        }
        if (C != null)
        {
            C.setVisible(false);
        }
    }

    protected void j()
    {
        super.j();
        b(o.a(0x7f0c01d3));
        a(H);
    }

    protected boolean o()
    {
        char c1;
        if (G == 0)
        {
            c1 = '\u4788';
        } else
        {
            c1 = '\u4787';
        }
        com.qihoo.security.support.b.c(c1);
        E.a();
        p();
        return true;
    }

    public void onBackPressed()
    {
        if (o())
        {
            return;
        } else
        {
            p();
            super.onBackPressed();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030040);
        com.qihoo.security.support.b.c(18310);
        bundle = getIntent().getExtras();
        if (bundle == null) goto _L2; else goto _L1
_L1:
        int i1;
        boolean flag;
        boolean flag1;
        flag = bundle.getBoolean("bundle_is_deep");
        i1 = bundle.getInt("bundle_status");
        O = bundle.getLong("memorySize", 0L);
        flag1 = bundle.getBoolean("bundle_is_scan_cancled");
        i1;
        JVM INSTR tableswitch 0 2: default 92
    //                   0 146
    //                   1 156
    //                   2 166;
           goto _L3 _L4 _L5 _L6
_L3:
        if (flag)
        {
            com.qihoo.security.ui.result.f.a().a(4);
            G = 0;
            J = true;
            H = com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT;
        }
        I = flag1;
_L2:
        q();
        T.sendEmptyMessageDelayed(1, 50L);
        ProcessClearService.a();
        return;
_L4:
        H = com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER;
        continue; /* Loop/switch isn't completed */
_L5:
        H = com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.NEED_OPTIMIZE;
        continue; /* Loop/switch isn't completed */
_L6:
        H = com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT;
        if (true) goto _L3; else goto _L7
_L7:
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        (new com.qihoo.security.locale.widget.a(p)).inflate(0x7f100000, menu);
        a(menu, 0x7f0b0250, 0x7f020066);
        if (menu.hasVisibleItems())
        {
            B = menu.getItem(0);
            c(true);
        }
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (D != null)
        {
            D.f();
        }
        ProcessClearService.b();
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4 && o())
        {
            return true;
        } else
        {
            return super.onKeyDown(i1, keyevent);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 2131427920: 
            break;
        }
        if (A)
        {
            A = false;
            startActivityForResult(new Intent(p, com/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity), 101);
        }
        return true;
    }

    protected void onResume()
    {
        super.onResume();
        A = true;
        if (!N)
        {
            if (E != null)
            {
                E.b();
            }
            return;
        } else
        {
            N = false;
            return;
        }
    }

    public void p()
    {
        Intent intent = new Intent();
        boolean flag;
        if (G == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        intent.putExtra("isDeep", flag);
        setResult(0, intent);
        v();
    }

    public void setColor(int i1)
    {
        d(i1);
    }
}
