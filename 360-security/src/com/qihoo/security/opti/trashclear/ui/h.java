// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.support.b;
import com.qihoo.security.widget.ShadowTextView;
import com.qihoo360.mobilesafe.b.c;
import com.qihoo360.mobilesafe.b.e;
import com.qihoo360.mobilesafe.b.f;
import com.qihoo360.mobilesafe.b.q;
import com.qihoo360.mobilesafe.b.r;
import com.qihoo360.mobilesafe.b.s;
import com.qihoo360.mobilesafe.opti.i.trashclear.TrashInfo;
import com.qihoo360.mobilesafe.share.SharedPref;
import com.qihoo360.mobilesafe.support.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui:
//            e, i, TrashItemInfo, c, 
//            g, b

public class h extends FrameLayout
    implements android.view.View.OnClickListener, android.widget.AbsListView.OnScrollListener, android.widget.AdapterView.OnItemClickListener, com.qihoo360.mobilesafe.b.e.a
{
    class a
    {

        public int a;
        public int b;
        public int c;
        public int d;
        final h e;

        private a()
        {
            e = h.this;
            super();
            a = 0;
            b = 0;
            c = 0;
            d = 0;
        }

    }


    private int A;
    private com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.a B;
    private com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus C;
    private boolean D;
    private List E;
    private e F;
    private boolean G;
    private final int H = 1;
    private final int I = 2;
    private final int J = 3;
    private final int K = 4;
    private final int L = 5;
    private final int M = 6;
    private final int N = 7;
    private final int O = 8;
    private final int P = 9;
    private final int Q = 10;
    private final int R = 11;
    private final int S = 12;
    private final int T = 13;
    private final Handler U = new Handler() {

        final h a;

        public void handleMessage(Message message)
        {
            int i1 = 0;
            message.what;
            JVM INSTR tableswitch 1 13: default 72
        //                       1 406
        //                       2 498
        //                       3 526
        //                       4 727
        //                       5 735
        //                       6 747
        //                       7 885
        //                       8 1040
        //                       9 1055
        //                       10 258
        //                       11 223
        //                       12 73
        //                       13 1098;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L1:
            return;
_L13:
            Bundle bundle = message.getData();
            long l4 = bundle.getLong("targetSize");
            long l6 = bundle.getLong("initSize");
            long l1 = (l4 / 10L) * (long)message.arg1 + l6;
            if (message.arg1 == 10)
            {
                l1 = l6 + l4;
            }
            com.qihoo.security.opti.trashclear.ui.h.a(a, l1);
            if (message.arg1 < 10)
            {
                Message message1 = com.qihoo.security.opti.trashclear.ui.h.f(a).obtainMessage();
                message1.what = 12;
                message1.arg1 = message.arg1 + 1;
                message = new Bundle();
                message.putLong("targetSize", l4);
                message.putLong("initSize", l6);
                message1.setData(message);
                message1.what = 12;
                com.qihoo.security.opti.trashclear.ui.h.f(a).sendMessageDelayed(message1, 60L);
                return;
            }
            continue; /* Loop/switch isn't completed */
_L12:
            h.g(a).setVisibility(8);
            h.h(a).setVisibility(4);
            h.i(a).setVisibility(0);
            return;
_L11:
            if (h.j(a) == null || h.j(a).getCount() <= 0)
            {
                h.g(a).setVisibility(8);
                return;
            }
            for (i1 = 0; i1 < h.i(a).getChildCount(); i1++)
            {
                h.i(a).getChildAt(i1).setVisibility(4);
                h.k(a).a(h.i(a).getChildAt(i1));
            }

            h.k(a).a(new com.qihoo.security.a.a.a.a(this) {

                final _cls5 a;

                public void a()
                {
                    if (h.j(a.a).getCount() > 0 && h.l(a.a).getVisibility() != 0)
                    {
                        h.l(a.a).setVisibility(0);
                    }
                    h.m(a.a).setEnabled(true);
                    h.i(a.a).setEnabled(true);
                    h.k(a.a).a(true);
                }

            
            {
                a = _pcls5;
                super();
            }
            });
            h.k(a).b();
            h.i(a).setEnabled(false);
            com.qihoo.security.opti.trashclear.ui.h.f(a).sendEmptyMessage(11);
            return;
_L2:
            for (; i1 < h.i(a).getChildCount(); i1++)
            {
                h.n(a).a(h.i(a).getChildAt(i1));
            }

            message = (Long)message.obj;
            h.n(a).a(new com.qihoo.security.a.a.a.a(this, message) {

                final Long a;
                final _cls5 b;

                public void a()
                {
                    com.qihoo.security.opti.trashclear.ui.h.a(b.a, true);
                    com.qihoo.security.opti.trashclear.ui.h.a(b.a, a);
                }

            
            {
                b = _pcls5;
                a = long1;
                super();
            }
            });
            h.l(a).setVisibility(8);
            h.n(a).b();
            return;
_L3:
            if (h.j(a) != null)
            {
                h.j(a).notifyDataSetChanged();
                h.o(a);
                return;
            }
            if (true) goto _L1; else goto _L4
_L4:
            long l2;
            if (message.arg1 < 10)
            {
                l2 = (h.p(a).d(com.qihoo.security.opti.trashclear.ui.h.c(a)) / 10L) * (long)message.arg1;
                long l5 = h.p(a).e(com.qihoo.security.opti.trashclear.ui.h.c(a)) / 10L;
                l5 = message.arg1;
                Message message2 = new Message();
                message2.what = 3;
                message2.arg1 = message.arg1 + 1;
                com.qihoo.security.opti.trashclear.ui.h.f(a).sendMessageDelayed(message2, 50L);
            } else
            {
                l2 = h.p(a).d(com.qihoo.security.opti.trashclear.ui.h.c(a));
                h.p(a).e(com.qihoo.security.opti.trashclear.ui.h.c(a));
            }
            message = com.qihoo.security.opti.trashclear.ui.h.a(l2);
            com.qihoo.security.opti.trashclear.ui.h.q(a).setLocalText(message[0]);
            com.qihoo.security.opti.trashclear.ui.h.r(a).setVisibility(0);
            com.qihoo.security.opti.trashclear.ui.h.s(a).setVisibility(0);
            com.qihoo.security.opti.trashclear.ui.h.r(a).setLocalText(message[1]);
            return;
_L5:
            h.t(a);
            return;
_L6:
            h.i(a).setSelection(0);
            return;
_L7:
            if (com.qihoo.security.opti.trashclear.ui.h.c(a) != 0)
            {
                com.qihoo.security.opti.trashclear.ui.h.a(a, com.qihoo.security.opti.trashclear.ui.mainpage.a.a(com.qihoo.security.opti.trashclear.ui.mainpage.a.a(h.p(a).c(com.qihoo.security.opti.trashclear.ui.h.c(a)) - h.p(a).e(com.qihoo.security.opti.trashclear.ui.h.c(a)))));
                int j1 = com.qihoo.security.opti.trashclear.ui.h.b(a, h.u(a));
                a.setAllBgColor(j1);
                h.v(a).a(h.u(a));
                return;
            } else
            {
                int k1 = com.qihoo.security.opti.trashclear.ui.h.b(a, com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT);
                a.setAllBgColor(k1);
                h.v(a).a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT);
                return;
            }
_L8:
            h.p(a).e(com.qihoo.security.opti.trashclear.ui.h.c(a));
            long l3;
            if (message.arg1 > 1)
            {
                l3 = (h.p(a).e(com.qihoo.security.opti.trashclear.ui.h.c(a)) / 10L) * (long)message.arg1;
                Message message3 = new Message();
                message3.what = 7;
                message3.arg1 = message.arg1 - 1;
                com.qihoo.security.opti.trashclear.ui.h.f(a).sendMessageDelayed(message3, 50L);
            } else
            {
                l3 = 0L;
            }
            message = com.qihoo.security.opti.trashclear.ui.h.a(l3);
            com.qihoo.security.opti.trashclear.ui.h.q(a).setLocalText(message[0]);
            com.qihoo.security.opti.trashclear.ui.h.r(a).setVisibility(0);
            com.qihoo.security.opti.trashclear.ui.h.s(a).setVisibility(0);
            com.qihoo.security.opti.trashclear.ui.h.r(a).setLocalText(message[1]);
            return;
_L9:
            com.qihoo.security.opti.trashclear.ui.h.a(a, h.w(a));
            return;
_L10:
            if (!h.x(a))
            {
                com.qihoo.security.opti.trashclear.ui.h.a(a, (Long)message.obj);
                com.qihoo.security.opti.trashclear.ui.h.b(a, false);
                com.qihoo.security.opti.trashclear.ui.h.a(a, false);
                return;
            }
            if (true) goto _L1; else goto _L14
_L14:
            h.l(a).setVisibility(8);
            h.i(a).setVisibility(4);
            h.h(a).setVisibility(0);
            h.m(a).setLocalText(0x7f0c0150);
            h.g(a).setVisibility(8);
            h.m(a).setEnabled(true);
            return;
        }

            
            {
                a = h.this;
                super();
            }
    };
    private com.qihoo.security.opti.trashclear.ui.b V;
    private com.qihoo.security.opti.trashclear.ui.c W;
    private com.qihoo.security.opti.trashclear.ui.b Z;
    private ShadowTextView a;
    private LocaleTextView b;
    private LocaleTextView c;
    private LocaleTextView d;
    private LocaleTextView e;
    private LocaleTextView f;
    private d g;
    private LinearLayout h;
    private ListView i;
    private FrameLayout j;
    private View k;
    private Context l;
    private com.qihoo.security.enginehelper.clean.a m;
    private int n;
    private i o;
    private final LayoutInflater p;
    private View q;
    private List r;
    private List s;
    private com.qihoo.security.opti.trashclear.ui.e t;
    private boolean u;
    private com.qihoo.security.opti.trashclear.ui.mainpage.opti.b v;
    private boolean w;
    private com.qihoo.security.a.a.a x;
    private com.qihoo.security.a.a.a y;
    private boolean z;

    public h(Context context)
    {
        super(context.getApplicationContext());
        a = null;
        e = null;
        f = null;
        g = null;
        h = null;
        k = null;
        l = null;
        m = null;
        n = -1;
        o = null;
        r = null;
        s = null;
        t = null;
        u = false;
        v = null;
        w = false;
        z = false;
        A = com.qihoo.security.opti.trashclear.ui.e.a;
        B = null;
        C = com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT;
        D = true;
        E = null;
        F = null;
        G = false;
        l = context;
        g = com.qihoo.security.locale.d.a();
        p = (LayoutInflater)l.getSystemService("layout_inflater");
        z = com.qihoo360.mobilesafe.support.a.c(l);
    }

    private int a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus)
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

    static com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus a(h h1, com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus)
    {
        h1.C = examstatus;
        return examstatus;
    }

    private void a(int i1, TrashItemInfo trashiteminfo, int j1, i k1, boolean flag)
    {
        TrashItemInfo trashiteminfo1 = (TrashItemInfo)k1.c();
        trashiteminfo1.checkStatus;
        JVM INSTR tableswitch 0 4: default 52
    //                   0 501
    //                   1 726
    //                   2 53
    //                   3 52
    //                   4 949;
           goto _L1 _L2 _L3 _L4 _L1 _L5
_L1:
        return;
_L4:
        if (i1 != 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        trashiteminfo1.checkStatus = i1;
        if (k1.b() == null || k1.b().size() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (flag)
        {
            b(k1, i1);
            return;
        }
        if (true) goto _L1; else goto _L6
_L6:
        Object obj = trashiteminfo1.oraginalData;
        if (obj != null && ((List) (obj)).size() > 0)
        {
            obj = (TrashInfo)((List) (obj)).get(0);
            String s3 = trashiteminfo1.rootTitle;
            t.a(A, 1, s3, 1);
            if (t.a(A, obj))
            {
                t.c(A, obj);
                t.a(A, trashiteminfo);
                if (A == 0 && E.contains(k1))
                {
                    E.remove(k1);
                }
                a(t.e(A), -trashiteminfo1.size);
                t.b(A, j1, trashiteminfo1.size);
            }
            obj.isSelected = false;
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (i1 != 0) goto _L1; else goto _L7
_L7:
        trashiteminfo1.checkStatus = i1;
        if (k1.b() == null || k1.b().size() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (flag)
        {
            b(k1, i1);
            return;
        }
        if (true) goto _L1; else goto _L8
_L8:
        Object obj2 = trashiteminfo1.oraginalData;
        String s1 = trashiteminfo1.rootTitle;
        if (obj2 != null && ((List) (obj2)).size() > 0)
        {
            obj2 = (TrashInfo)((List) (obj2)).get(0);
            t.a(A, 0, s1, 1);
            obj2.isSelected = true;
            if (!t.a(A, obj2))
            {
                t.b(A, obj2);
                t.b(A, trashiteminfo);
                if (A == 0 && !E.contains(k1))
                {
                    E.add(k1);
                }
                a(t.e(A), trashiteminfo1.size);
                t.a(A, j1, trashiteminfo1.size);
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (i1 != 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        trashiteminfo1.checkStatus = i1;
        if (k1.b() == null || k1.b().size() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (flag)
        {
            b(k1, i1);
            return;
        }
        if (true) goto _L1; else goto _L9
_L9:
        Object obj1 = trashiteminfo1.oraginalData;
        if (obj1 != null && ((List) (obj1)).size() > 0)
        {
            obj1 = (TrashInfo)((List) (obj1)).get(0);
            String s4 = trashiteminfo1.rootTitle;
            t.a(A, 1, s4, 1);
            if (t.a(A, obj1))
            {
                t.c(A, obj1);
                t.a(A, trashiteminfo);
                if (A == 0 && E.contains(k1))
                {
                    E.remove(k1);
                }
                a(t.e(A), -trashiteminfo1.size);
                t.b(A, j1, trashiteminfo1.size);
            }
            obj1.isSelected = false;
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (i1 != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        trashiteminfo1.checkStatus = i1;
        if (k1.b() == null || k1.b().size() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (flag)
        {
            b(k1, i1);
            return;
        }
        if (true) goto _L1; else goto _L10
_L10:
        Object obj3 = trashiteminfo1.oraginalData;
        String s2 = trashiteminfo1.rootTitle;
        if (obj3 != null && ((List) (obj3)).size() > 0)
        {
            obj3 = (TrashInfo)((List) (obj3)).get(0);
            t.a(A, 0, s2, 1);
            obj3.isSelected = true;
            if (!t.a(A, obj3))
            {
                t.b(A, obj3);
                t.b(A, trashiteminfo);
                if (A == 0 && !E.contains(k1))
                {
                    E.add(k1);
                }
                a(t.e(A), trashiteminfo1.size);
                t.a(A, j1, trashiteminfo1.size);
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (k1.b() != null)
        {
            trashiteminfo1.checkStatus = i1;
            if (flag)
            {
                b(k1, i1);
                return;
            }
        }
        if (true) goto _L1; else goto _L11
_L11:
    }

    private void a(long l1, long l2)
    {
        Message message = U.obtainMessage();
        Bundle bundle = new Bundle();
        bundle.putLong("targetSize", l2);
        bundle.putLong("initSize", l1);
        message.arg1 = 0;
        message.setData(bundle);
        message.what = 12;
        U.removeMessages(12);
        U.sendMessage(message);
    }

    private void a(TrashItemInfo trashiteminfo, int i1, int j1)
    {
        Object obj;
        String s2;
        if (j1 == 0)
        {
            s2 = "1";
        } else
        {
            s2 = "0";
        }
        if (i1 != 3 || trashiteminfo.oraginalData == null) goto _L2; else goto _L1
_L1:
        obj = (TrashInfo)trashiteminfo.oraginalData.get(0);
        if (obj == null) goto _L2; else goto _L3
_L3:
        obj = ((TrashInfo) (obj)).path;
_L5:
        String s1 = ((String) (obj));
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            if (trashiteminfo.pkgName != null)
            {
                s1 = trashiteminfo.pkgName;
            } else
            {
                s1 = trashiteminfo.name;
            }
        }
        com.qihoo.security.support.b.a(18007, s2, s1);
        return;
_L2:
        obj = "";
        if (true) goto _L5; else goto _L4
_L4:
    }

    static void a(h h1)
    {
        h1.g();
    }

    static void a(h h1, long l1)
    {
        h1.b(l1);
    }

    static void a(h h1, i i1)
    {
        h1.e(i1);
    }

    static void a(h h1, i i1, int j1, int k1)
    {
        h1.a(i1, j1, k1);
    }

    static void a(h h1, i i1, boolean flag, boolean flag1)
    {
        h1.a(i1, flag, flag1);
    }

    static void a(h h1, TrashInfo trashinfo, i i1)
    {
        h1.a(trashinfo, i1);
    }

    static void a(h h1, Long long1)
    {
        h1.a(long1);
    }

    static void a(h h1, String s1, int i1, List list, boolean flag)
    {
        h1.a(s1, i1, list, flag);
    }

    static void a(h h1, List list)
    {
        h1.a(list);
    }

    private void a(i i1)
    {
        if (i1.b() != null && i1.b().size() > 0)
        {
            i1 = i1.b();
            if (i1 != null && i1.size() != 0)
            {
                for (i1 = i1.iterator(); i1.hasNext(); a((i)i1.next())) { }
            }
        } else
        if (((TrashItemInfo)i1.c()).checkStatus == 3 && !s.contains(i1))
        {
            s.add(i1);
        }
    }

    private void a(i i1, int j1)
    {
        Object obj;
        boolean flag;
        int l1;
        flag = true;
        i1 = i1.a();
        obj = i1.b();
        l1 = ((List) (obj)).size();
        if (l1 < 1) goto _L2; else goto _L1
_L1:
        a a1;
        a1 = new a();
        obj = ((List) (obj)).iterator();
_L14:
        if (!((Iterator) (obj)).hasNext()) goto _L4; else goto _L3
_L3:
        switch (((TrashItemInfo)((i)((Iterator) (obj)).next()).c()).checkStatus)
        {
        case 0: // '\0'
            a1.b = a1.b + 1;
            break;

        case 1: // '\001'
            a1.c = a1.c + 1;
            break;

        case 4: // '\004'
            a1.d = a1.d + 1;
            break;

        case 3: // '\003'
            a1.a = a1.a + 1;
            break;
        }
          goto _L5
_L4:
        if (a1.b != l1 && (a1.b <= 0 || a1.b + a1.a != l1)) goto _L7; else goto _L6
_L6:
        int k1 = 0;
_L12:
        ((TrashItemInfo)i1.c()).checkStatus = k1;
        if (o != null && o.c() != null && ((TrashItemInfo)o.c()).name.equals(((TrashItemInfo)i1.c()).name))
        {
            ((TrashItemInfo)o.c()).checkStatus = k1;
            b(k1);
        }
_L2:
        if (i1.a() != null)
        {
            a(i1, j1);
        }
        return;
_L7:
        k1 = ((flag) ? 1 : 0);
        if (a1.c == l1) goto _L9; else goto _L8
_L8:
        if (a1.c <= 0) goto _L11; else goto _L10
_L10:
        k1 = ((flag) ? 1 : 0);
        if (a1.c + a1.a == l1) goto _L9; else goto _L11
_L11:
        if (a1.a == l1)
        {
            k1 = 3;
        } else
        {
            k1 = 4;
        }
_L9:
        if (true) goto _L12; else goto _L5
_L5:
        if (true) goto _L14; else goto _L13
_L13:
    }

    private void a(i i1, int j1, int k1)
    {
        TrashItemInfo trashiteminfo;
        int l1;
        trashiteminfo = (TrashItemInfo)i1.c();
        l1 = trashiteminfo.TrashType;
        t.a(A, l1);
        k1;
        JVM INSTR tableswitch 0 4: default 68
    //                   0 141
    //                   1 146
    //                   2 68
    //                   3 140
    //                   4 141;
           goto _L1 _L2 _L3 _L1 _L4 _L2
_L1:
        a(trashiteminfo, j1, k1);
        a(k1, trashiteminfo, l1, i1, false);
        if (i1.b() != null && i1.b().size() > 0)
        {
            b(i1, k1);
        }
        if (i1.a() != null)
        {
            a(i1, k1);
        }
        U.sendEmptyMessage(2);
_L4:
        return;
_L2:
        k1 = 1;
        continue; /* Loop/switch isn't completed */
_L3:
        k1 = 0;
        if (true) goto _L1; else goto _L5
_L5:
    }

    private void a(i i1, TrashInfo trashinfo, boolean flag)
    {
        int j1;
        if (i1.a() != null && ((TrashItemInfo)i1.a().c()).keepCount != -1)
        {
            j1 = ((TrashItemInfo)i1.a().c()).keepCount;
        } else
        {
            j1 = 0;
        }
        if (flag)
        {
            if (trashinfo.clearType != 2 && ((TrashItemInfo)i1.a().c()).keepCount != -1)
            {
                ((TrashItemInfo)i1.a().c()).keepCount = j1 - 1;
            }
        } else
        if (trashinfo.clearType != 2 && ((TrashItemInfo)i1.a().c()).keepCount != -1)
        {
            ((TrashItemInfo)i1.a().c()).keepCount = j1 + 1;
            return;
        }
    }

    private void a(i i1, boolean flag, boolean flag1)
    {
        TrashItemInfo trashiteminfo = (TrashItemInfo)i1.c();
        if (trashiteminfo != null)
        {
            int j1 = trashiteminfo.checkStatus;
            TrashInfo trashinfo = (TrashInfo)trashiteminfo.oraginalData.get(0);
            int l1;
            int i2;
            if (trashiteminfo.TrashType != -1)
            {
                l1 = trashiteminfo.TrashType;
            } else
            {
                l1 = 0;
            }
            i2 = ((TrashItemInfo)i1.c()).level;
            if (trashinfo != null)
            {
                trashinfo.isInWhiteList = flag;
                String s1;
                int k1;
                long l2;
                if (flag)
                {
                    k1 = 3;
                } else
                if (trashinfo.clearType == 2)
                {
                    k1 = 0;
                } else
                {
                    k1 = 1;
                }
                trashiteminfo.checkStatus = k1;
                s1 = trashiteminfo.rootTitle;
                l2 = trashinfo.size;
                if (k1 == 0)
                {
                    t.a(A, 0, s1, 1);
                    if (A == 1)
                    {
                        trashinfo.isSelected = true;
                    } else
                    {
                        trashinfo.isSelected = false;
                    }
                    if (!t.a(A, trashinfo))
                    {
                        t.b(A, trashinfo);
                        t.b(A, trashiteminfo);
                        a(t.e(A), l2);
                        t.a(A, l1, l2);
                    }
                    if (t.a(A, i1))
                    {
                        t.c(A, i1);
                    }
                    if (s.contains(i1))
                    {
                        s.remove(i1);
                    }
                } else
                {
                    if (t.a(A, trashinfo))
                    {
                        t.c(A, trashinfo);
                        t.a(A, trashiteminfo);
                        a(t.e(A), -l2);
                        t.b(A, l1, l2);
                    }
                    if (k1 == 1)
                    {
                        if (t.a(A, i1))
                        {
                            t.c(A, i1);
                        }
                        if (s.contains(i1))
                        {
                            s.remove(i1);
                        }
                    } else
                    {
                        if (!t.a(A, i1))
                        {
                            t.b(A, i1);
                        }
                        if (!s.contains(i1))
                        {
                            s.add(i1);
                        }
                        if (A == 1)
                        {
                            t.a(A, 1, s1, 1);
                        }
                    }
                    if (A == 1)
                    {
                        trashinfo.isSelected = true;
                    } else
                    {
                        trashinfo.isSelected = false;
                    }
                }
                if (flag)
                {
                    com.qihoo.security.support.b.a(trashinfo.path);
                }
                if (flag1)
                {
                    m.b(trashinfo);
                }
                k1 = d(i1);
                ((TrashItemInfo)i1.a().c()).checkStatus = k1;
                if (i2 == 3)
                {
                    k1 = d(i1.a());
                    ((TrashItemInfo)i1.a().a().c()).checkStatus = k1;
                    try
                    {
                        flag = ((TrashItemInfo)o.c()).name.equals(((TrashItemInfo)i1.a().a().c()).name);
                    }
                    // Misplaced declaration of an exception variable
                    catch (i i1)
                    {
                        flag = false;
                    }
                    if (flag)
                    {
                        ((TrashItemInfo)o.c()).checkStatus = k1;
                        b(k1);
                    }
                } else
                if (i2 == 2)
                {
                    try
                    {
                        flag = ((TrashItemInfo)o.c()).name.equals(((TrashItemInfo)i1.a().c()).name);
                    }
                    // Misplaced declaration of an exception variable
                    catch (i i1)
                    {
                        flag = false;
                    }
                    if (flag)
                    {
                        ((TrashItemInfo)o.c()).checkStatus = k1;
                        b(k1);
                    }
                }
            }
            U.sendEmptyMessage(2);
        }
    }

    private void a(TrashInfo trashinfo, i i1)
    {
        if (trashinfo != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj = ((TrashItemInfo)i1.c()).rootTitle;
        int l1 = ((TrashItemInfo)i1.c()).TrashType;
        int k1 = ((TrashItemInfo)i1.c()).level;
        Object obj1;
        ArrayList arraylist;
        int j1;
        int i2;
        long l2;
        long l3;
        boolean flag;
        if (k1 == 3)
        {
            j1 = 3;
        } else
        if (k1 == 2)
        {
            j1 = 2;
        } else
        {
            j1 = 1;
        }
        i2 = ((TrashItemInfo)i1.c()).TrashType;
        t.a(A, i2);
        if (!(trashinfo instanceof TrashInfo)) goto _L1; else goto _L3
_L3:
        obj1 = trashinfo.clone();
        flag = trashinfo.isSelected;
        l3 = trashinfo.size;
        com.qihoo.security.opti.trashclear.ui.e.a(trashinfo);
        obj1.isSelected = true;
        if (flag)
        {
            a(t.e(A), -l3);
            t.b(A, l1, l3);
        }
        t.a(A, 1, ((String) (obj)), l3);
        SharedPref.a(l, "last_trash_clear_time", System.currentTimeMillis());
        SharedPref.a(l, l3);
        SharedPref.a(l, "first_time_in_this_open", true);
        com.qihoo.security.support.b.a(18008, ((TrashInfo) (obj1)).path, "");
        if (A == 0 && E.contains(i1))
        {
            E.remove(i1);
        }
        arraylist = new ArrayList();
        arraylist.add(obj1);
        if (v.getCount() == j1)
        {
            B.b(arraylist);
            SharedPref.b(l, com.qihoo.security.opti.b.d.b(l));
            B.a(t.c(A), l3, false);
            c();
            s = null;
            r = null;
            return;
        }
          goto _L4
        obj;
_L10:
        j1 = i1.a().b().size();
        if (j1 > 0)
        {
            if (((TrashItemInfo)i1.a().c()).keepCount != -1)
            {
                l1 = ((TrashItemInfo)i1.a().c()).keepCount;
                if (trashinfo.clearType != 2 && ((TrashItemInfo)i1.a().c()).keepCount != -1)
                {
                    ((TrashItemInfo)i1.a().c()).keepCount = l1 - 1;
                }
            }
            l1 = i1.a().b().indexOf(i1);
            if (j1 > 1 && l1 == j1 - 1)
            {
                ((TrashItemInfo)((i)i1.a().b().get(j1 - 2)).c()).lineType = 1;
                ((TrashItemInfo)((i)i1.a().b().get(j1 - 2)).c()).downShadowType = 0;
            } else
            if (j1 != 1)
            {
                if (k1 == 3)
                {
                    l1 = i1.a().a().b().size();
                    j1 -= 2;
                    if (j1 < l1)
                    {
                        ((TrashItemInfo)((i)i1.a().a().b().get(j1)).c()).lineType = 1;
                        ((TrashItemInfo)((i)i1.a().a().b().get(j1)).c()).downShadowType = 0;
                    }
                }
            } else
            if (j1 == 1 && k1 == 3)
            {
                j1 = i1.a().a().b().size() - 2;
                if (j1 >= 0)
                {
                    ((TrashItemInfo)((i)i1.a().a().b().get(j1)).c()).lineType = 1;
                    ((TrashItemInfo)((i)i1.a().a().b().get(j1)).c()).downShadowType = 0;
                }
            }
            l2 = ((TrashItemInfo)i1.a().c()).size - l3;
            ((TrashItemInfo)i1.a().c()).size = l2;
            if (k1 == 3)
            {
                l2 = ((TrashItemInfo)i1.a().a().c()).size - l3;
                ((TrashItemInfo)i1.a().a().c()).size = l2;
            }
            ((TrashItemInfo)i1.c()).checkStatus = 3;
            j1 = d(i1);
            ((TrashItemInfo)i1.a().c()).checkStatus = j1;
            if (k1 == 3)
            {
                j1 = d(i1.a());
                ((TrashItemInfo)i1.a().a().c()).checkStatus = j1;
                try
                {
                    flag = ((TrashItemInfo)o.c()).name.equals(((TrashItemInfo)i1.a().a().c()).name);
                }
                // Misplaced declaration of an exception variable
                catch (TrashInfo trashinfo)
                {
                    flag = false;
                }
                if (flag)
                {
                    ((TrashItemInfo)o.c()).checkStatus = j1;
                    b(j1);
                    ((LocaleTextView)k.findViewById(0x7f0b00e4)).setText(com.qihoo360.mobilesafe.b.s.a(l2));
                }
            } else
            if (k1 == 2)
            {
                try
                {
                    flag = ((TrashItemInfo)o.c()).name.equals(((TrashItemInfo)i1.a().c()).name);
                }
                // Misplaced declaration of an exception variable
                catch (TrashInfo trashinfo)
                {
                    flag = false;
                }
                if (flag)
                {
                    ((TrashItemInfo)o.c()).checkStatus = j1;
                    b(j1);
                    ((LocaleTextView)k.findViewById(0x7f0b00e4)).setText(com.qihoo360.mobilesafe.b.s.a(l2));
                }
            }
        }
        v.a(i1);
        trashinfo = i1.a().a();
        if (v.getCount() == 0) goto _L1; else goto _L5
_L5:
        if (trashinfo != null && trashinfo.b().size() <= 0)
        {
            v.a(trashinfo);
        }
        if (v.getCount() == 0)
        {
            j();
            return;
        } else
        {
            U.sendEmptyMessage(2);
            d.setLocalText(g.a(0x7f0c001d, new Object[] {
                com.qihoo360.mobilesafe.b.s.a(t.c(A))
            }));
            return;
        }
_L4:
        B.b(arraylist);
        SharedPref.b(l, com.qihoo.security.opti.b.d.b(l));
        if (A == 1)
        {
            obj1 = com.qihoo.security.opti.trashclear.ui.mainpage.a.a(com.qihoo.security.opti.trashclear.ui.mainpage.a.a(t.c(A)));
            setBackgroundExamStatus(((com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus) (obj1)));
            B.a(((com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus) (obj1)));
        }
        t.a(A, trashinfo);
        if (!t.a(A, trashinfo)) goto _L7; else goto _L6
_L6:
        if (l1 == 0) goto _L9; else goto _L8
_L8:
        t.c(A, trashinfo);
        t.a(A, (TrashItemInfo)i1.c());
_L7:
        t.a(A, 1, ((String) (obj)), 1);
          goto _L10
_L9:
        if (((TrashItemInfo)i1.c()).name.equals(g.a(0x7f0c020d))) goto _L7; else goto _L11
_L11:
        t.c(A, trashinfo);
        t.a(A, (TrashItemInfo)i1.c());
          goto _L7
    }

    private void a(Long long1)
    {
        long l1;
        if (long1 == null)
        {
            l1 = 0L;
        } else
        {
            l1 = long1.longValue();
        }
        if (A == 0)
        {
            D = false;
            if (E.size() > 0)
            {
                U.sendEmptyMessage(8);
            } else
            {
                B.a(t.c(A) - l1, l1, false);
                x.a(true);
            }
        } else
        {
            B.a(t.c(A) - l1, l1, false);
            x.a(true);
        }
        w = false;
    }

    private void a(String s1, int i1, List list, boolean flag)
    {
        int k1 = list.size();
        for (i1 = 0; i1 < k1; i1++)
        {
            i j1 = (i)list.get(i1);
            TrashInfo trashinfo = (TrashInfo)((TrashItemInfo)j1.c()).oraginalData.get(0);
            if (!(trashinfo instanceof TrashInfo) || !s1.equals(trashinfo.path))
            {
                continue;
            }
            boolean flag1 = m.a(trashinfo);
            a(j1, flag1, false);
            if (flag)
            {
                a(j1, trashinfo, flag1);
            }
        }

    }

    private void a(List list)
    {
        long l1 = t.e(A);
        long l2 = t.c(A);
        Iterator iterator;
        int j1;
        if (A == 0)
        {
            j1 = 0;
        } else
        {
            j1 = 1;
        }
        t.b(A, j1, l1);
        iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            i i1 = (i)iterator.next();
            long l3 = ((TrashItemInfo)i1.c()).size;
            String s1 = ((TrashItemInfo)i1.c()).rootTitle;
            list = s1;
            if (TextUtils.isEmpty(s1))
            {
                list = ((TrashItemInfo)i1.c()).name;
            }
            if (((TrashItemInfo)i1.c()).isExpand == 2)
            {
                t.a(A, 1, list, l3);
                t.b(A, 1, l3);
            }
            v.a(i1);
            r.remove(i1);
            list = i1.a();
            if (list != null)
            {
                if (list.b().size() <= 0)
                {
                    v.a(list);
                    r.remove(list);
                } else
                {
                    ((TrashItemInfo)list.c()).checkStatus = 1;
                    ((TrashItemInfo)list.c()).size = ((TrashItemInfo)list.c()).size - l3;
                }
                list = i1.a().a();
                if (list != null)
                {
                    if (list.b().size() <= 0)
                    {
                        v.a(list);
                        r.remove(list);
                    } else
                    {
                        ((TrashItemInfo)list.c()).checkStatus = 1;
                        ((TrashItemInfo)list.c()).size = ((TrashItemInfo)list.c()).size - l3;
                    }
                }
            }
        } while (true);
        a();
        i.setVisibility(4);
        B.a(l2, l1, false);
        x.a(true);
        if (v.getCount() != 0);
    }

    static boolean a(h h1, boolean flag)
    {
        h1.G = flag;
        return flag;
    }

    public static String[] a(long l1)
    {
        return com.qihoo360.mobilesafe.b.s.b(l1);
    }

    static int b(h h1, com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus)
    {
        return h1.a(examstatus);
    }

    static i b(h h1)
    {
        return h1.o;
    }

    private void b(int i1)
    {
        if (A == 1 && v != null)
        {
            v.a(k, i1);
        }
    }

    private void b(long l1)
    {
        String as[] = a(l1);
        a.setLocalText(as[0]);
        c.setVisibility(0);
        e.setVisibility(0);
        c.setLocalText(as[1]);
    }

    static void b(h h1, i i1)
    {
        h1.b(i1);
    }

    private void b(i i1)
    {
        if (i1 != null) goto _L2; else goto _L1
_L1:
        int j1;
        return;
_L2:
        if ((j1 = ((TrashItemInfo)i1.c()).isExpand) == -1)
        {
            continue; /* Loop/switch isn't completed */
        }
        j1;
        JVM INSTR tableswitch 0 2: default 52
    //                   0 106
    //                   1 84
    //                   2 95;
           goto _L3 _L4 _L5 _L6
_L4:
        break MISSING_BLOCK_LABEL_106;
_L3:
        break; /* Loop/switch isn't completed */
_L5:
        break; /* Loop/switch isn't completed */
_L8:
        U.sendEmptyMessage(2);
        if (o != null)
        {
            v.a(k, o);
            return;
        }
        if (true) goto _L1; else goto _L7
_L7:
        v.b(i1);
          goto _L8
_L6:
        v.b(i1);
          goto _L8
        if ((W == null || !W.isShowing()) && com.qihoo360.mobilesafe.b.f.b())
        {
            c(i1);
        }
          goto _L8
    }

    private void b(i i1, int j1)
    {
        TrashItemInfo trashiteminfo = (TrashItemInfo)i1.c();
        int k1 = trashiteminfo.TrashType;
        i1 = i1.b();
        if (i1.size() >= 1)
        {
            for (i1 = i1.iterator(); i1.hasNext(); a(j1, trashiteminfo, k1, (i)i1.next(), true)) { }
        }
    }

    static boolean b(h h1, boolean flag)
    {
        h1.w = flag;
        return flag;
    }

    static int c(h h1)
    {
        return h1.A;
    }

    private void c(i i1)
    {
        TrashItemInfo trashiteminfo = (TrashItemInfo)i1.c();
        if (trashiteminfo != null && trashiteminfo.level != 1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        Object obj1;
        Object obj2;
        String s2;
        ArrayList arraylist;
        TrashInfo trashinfo;
        int j1;
label0:
        {
            String s3 = ((TrashItemInfo)i1.a().c()).name;
            s2 = trashiteminfo.name;
            trashinfo = (TrashInfo)trashiteminfo.oraginalData.get(0);
            boolean flag1 = false;
            j1 = 0;
            boolean flag = flag1;
            if (trashiteminfo.TrashType == -1)
            {
                break label0;
            }
            int k1 = trashiteminfo.TrashType;
            if (k1 != 1 && k1 != 2)
            {
                boolean flag3;
                if (A == 0)
                {
                    obj = g.a(0x7f0c000e);
                } else
                {
                    obj = g.a(0x7f0c000d);
                }
                if (!s3.equals(obj))
                {
                    flag = flag1;
                    j1 = k1;
                    if (k1 != 3)
                    {
                        break label0;
                    }
                }
            }
            flag = true;
            j1 = k1;
        }
        arraylist = new ArrayList();
        flag3 = m.a(trashinfo);
        if (j1 != 3 || trashinfo.bundle == null || !trashinfo.bundle.containsKey("src"))
        {
            break MISSING_BLOCK_LABEL_1782;
        }
        obj1 = trashinfo.bundle.getString("src");
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            break MISSING_BLOCK_LABEL_1782;
        }
_L9:
        trashinfo.clearType;
        JVM INSTR tableswitch 0 2: default 256
    //                   0 946
    //                   1 1049
    //                   2 1163;
           goto _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_1163;
_L3:
        obj = "";
_L8:
        if (j1 == 1)
        {
            obj2 = null;
        } else
        {
            obj2 = (new StringBuilder()).append(g.a(0x7f0c022d)).append(com.qihoo360.mobilesafe.b.s.a(trashinfo.size)).toString();
        }
        if (j1 != 0 || trashiteminfo.level != 3 || !s3.equals(g.a(0x7f0c020d)))
        {
            break MISSING_BLOCK_LABEL_363;
        }
        if (!z) goto _L1; else goto _L7
_L7:
        if (trashinfo.clearType == 2)
        {
            obj = (new StringBuilder()).append(g.a(0x7f0c0247, new Object[] {
                obj1
            })).append(g.a(0x7f0c0240)).toString();
        } else
        {
            obj = g.a(0x7f0c0241, new Object[] {
                obj1
            });
            s1 = (new StringBuilder()).append(g.a(0x7f0c0247, new Object[] {
                obj1
            })).append(((String) (obj))).toString();
            obj = com.qihoo360.mobilesafe.b.r.a(l, s1, 0x7f080018, ((String) (obj)));
        }
label1:
        {
            String s1;
            Object obj3;
            Object obj4;
            boolean flag2;
            if (trashinfo.path != null)
            {
                arraylist.add(com.qihoo.security.opti.trashclear.ui.g.a(trashinfo.path, l));
            } else
            if (trashinfo.bundle.containsKey("multiPathList"))
            {
label2:
                {
                    obj3 = (ArrayList)trashinfo.bundle.get("multiPathList");
                    s1 = "";
                    int l1 = 0;
                    obj4 = ((List) (obj3)).iterator();
                    do
                    {
                        obj3 = s1;
                        if (!((Iterator) (obj4)).hasNext())
                        {
                            break label2;
                        }
                        obj3 = (String)((Iterator) (obj4)).next();
                        if (l1 >= 30)
                        {
                            break;
                        }
                        l1++;
                        s1 = (new StringBuilder()).append(s1).append(((String) (obj3))).append("\n").toString();
                    } while (true);
                    obj3 = (new StringBuilder()).append(s1).append("......").append("\n").toString();
                }
                s1 = com.qihoo.security.opti.trashclear.ui.g.a(((String) (obj3)), l);
                arraylist.add((new StringBuilder()).append("\n").append(s1).toString());
            }
            if (j1 == 1 || j1 == 2)
            {
                s1 = g.a(0x7f0c0237, new Object[] {
                    String.valueOf(trashinfo.count), com.qihoo360.mobilesafe.b.s.a(trashinfo.size)
                });
            } else
            if (j1 == 3)
            {
                s1 = g.a(0x7f0c0244);
            } else
            {
                s1 = "";
            }
            if (s3.equals(g.a(0x7f0c005e)))
            {
                flag = false;
            }
            if (j1 == 3)
            {
                obj4 = obj;
                if (TextUtils.isEmpty(((CharSequence) (obj))))
                {
                    obj4 = g.a(0x7f0c0245);
                }
                obj1 = com.qihoo.security.opti.trashclear.ui.g.a(s2, 18, (new StringBuilder()).append(g.a(0x7f0c0236)).append(".").append(s2.substring(s2.lastIndexOf(".") + 1)).toString());
                obj3 = null;
            } else
            {
                obj3 = obj2;
                obj4 = obj;
            }
            if (!s3.equals(g.a(0x7f0c005e)))
            {
                obj2 = obj3;
                obj = obj4;
                if (j1 != 0)
                {
                    break label1;
                }
                obj2 = obj3;
                obj = obj4;
                if (trashiteminfo.level != 2)
                {
                    break label1;
                }
            }
            if (j1 == 0 && g.a(0x7f0c020e).equals(s2))
            {
                obj = g.a(0x7f0c0245);
                obj2 = null;
            } else
            {
                obj = null;
                obj2 = obj3;
            }
        }
        if (A == 0)
        {
            obj3 = g.a(0x7f0c000e);
        } else
        {
            obj3 = g.a(0x7f0c000d);
        }
        if (s3.equals(obj3))
        {
            obj3 = null;
            obj = obj3;
            if (trashinfo.bundle != null)
            {
                obj = obj3;
                if (trashinfo.bundle.containsKey("apkVersionName"))
                {
                    obj = trashinfo.bundle.getString("apkVersionName");
                }
            }
            obj3 = obj;
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                obj3 = "0.1.0";
            }
            if (trashinfo.dataType == 8)
            {
                obj = (new StringBuilder()).append(g.a(0x7f0c0242)).append("\n").append(obj2).append("\n").append(g.a(0x7f0c0011, new Object[] {
                    obj3
                })).toString();
            } else
            if (trashinfo.dataType == 6)
            {
                obj = (new StringBuilder()).append(g.a(0x7f0c0243)).append("\n").append(obj2).append("\n").append(g.a(0x7f0c0011, new Object[] {
                    obj3
                })).toString();
            } else
            {
                obj = (new StringBuilder()).append(obj2).append("\n").append(g.a(0x7f0c0011, new Object[] {
                    obj3
                })).toString();
            }
            obj2 = null;
        } else
        {
            obj3 = obj;
            obj = obj2;
            obj2 = obj3;
        }
        obj3 = l;
        obj4 = new c.a(trashinfo, j1, i1, trashiteminfo) {

            final TrashInfo a;
            final int b;
            final i c;
            final TrashItemInfo d;
            final h e;

            public void a()
            {
                com.qihoo.security.opti.trashclear.ui.g.a(com.qihoo.security.opti.trashclear.ui.h.e(e), a, a.desc);
            }

            public void a(com.qihoo.security.opti.trashclear.ui.c c1)
            {
                if (com.qihoo.security.opti.trashclear.ui.h.c(e) == 0)
                {
                    com.qihoo.security.opti.trashclear.ui.h.a(e, c, 3, ((TrashItemInfo)c.c()).checkStatus);
                    return;
                }
                if (d.TrashType != -1)
                {
                    if (d.TrashType == 0)
                    {
                        if (a.type == 322)
                        {
                            if (com.qihoo.security.opti.trashclear.ui.h.d(e))
                            {
                                com.qihoo.security.opti.trashclear.ui.h.a(e, (TrashInfo)((TrashItemInfo)c.c()).oraginalData.get(0), c);
                            } else
                            {
                                com.qihoo360.mobilesafe.b.s.d(com.qihoo.security.opti.trashclear.ui.h.e(e), a.packageName);
                            }
                        } else
                        {
                            com.qihoo.security.opti.trashclear.ui.h.a(e, (TrashInfo)((TrashItemInfo)c.c()).oraginalData.get(0), c);
                        }
                    } else
                    {
                        com.qihoo.security.opti.trashclear.ui.h.a(e, (TrashInfo)((TrashItemInfo)c.c()).oraginalData.get(0), c);
                    }
                } else
                {
                    com.qihoo.security.opti.trashclear.ui.h.a(e, (TrashInfo)((TrashItemInfo)c.c()).oraginalData.get(0), c);
                }
                com.qihoo360.mobilesafe.b.q.a().a(0x7f0c0246);
            }

            public void a(com.qihoo.security.opti.trashclear.ui.c c1, boolean flag4, i i2, View view)
            {
label0:
                {
                    if (i2 != null)
                    {
                        com.qihoo.security.support.b.c(18009);
                        com.qihoo.security.opti.trashclear.ui.h.a(e, i2, flag4, true);
                        c1 = a;
                        com.qihoo.security.opti.trashclear.ui.h.a(e, ((TrashInfo) (c1)).path, b, i2.a().b(), false);
                        int j2;
                        if (i2.a() != null && ((TrashItemInfo)i2.a().c()).keepCount != -1)
                        {
                            j2 = ((TrashItemInfo)i2.a().c()).keepCount;
                        } else
                        {
                            j2 = 0;
                        }
                        if (!flag4)
                        {
                            break label0;
                        }
                        if (((TrashInfo) (c1)).clearType != 2 && ((TrashItemInfo)i2.a().c()).keepCount != -1)
                        {
                            ((TrashItemInfo)i2.a().c()).keepCount = j2 - 1;
                        }
                        com.qihoo360.mobilesafe.b.q.a().a(0x7f0c0239);
                    }
                    return;
                }
                if (((TrashInfo) (c1)).clearType != 2 && ((TrashItemInfo)i2.a().c()).keepCount != -1)
                {
                    ((TrashItemInfo)i2.a().c()).keepCount = j2 + 1;
                }
                com.qihoo360.mobilesafe.b.q.a().a(0x7f0c023a);
            }

            public void b()
            {
            }

            
            {
                e = h.this;
                a = trashinfo;
                b = i1;
                c = j1;
                d = trashiteminfo;
                super();
            }
        };
        if (j1 != 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        W = new com.qihoo.security.opti.trashclear.ui.c(((Context) (obj3)), i1, ((c.a) (obj4)), flag2);
        if (A == 1)
        {
            i1 = ((i) (obj1));
        } else
        {
            i1 = g.a(0x7f0c0252);
        }
        obj1 = W;
        if (!flag3)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        ((com.qihoo.security.opti.trashclear.ui.c) (obj1)).a(i1, ((CharSequence) (obj2)), ((CharSequence) (obj)), arraylist, s1, flag2, flag, false);
        if (A == 0)
        {
            W.a(com.qihoo.security.locale.d.a().a(0x7f0c022e), com.qihoo.security.locale.d.a().a(0x7f0c014f));
        }
        W.setCancelable(true);
        com.qihoo360.mobilesafe.b.d.a(W);
        return;
_L4:
        if (trashinfo.clearAdvice == null)
        {
            if (j1 == 1 || j1 == 2 || j1 == 3)
            {
                obj = g.a(0x7f0c023f);
                obj = com.qihoo360.mobilesafe.b.r.a(l, ((String) (obj)), 0x7f080018, ((String) (obj)));
            } else
            if (j1 == 3)
            {
                obj = g.a(0x7f0c0245);
            } else
            {
                obj = g.a(0x7f0c022c);
            }
        } else
        {
            obj = com.qihoo.security.opti.trashclear.ui.g.a(l, trashinfo.clearAdvice);
        }
          goto _L8
_L5:
        if (trashinfo.clearAdvice == null)
        {
            if (j1 == 1 || j1 == 2 || j1 == 3)
            {
                obj = g.a(0x7f0c023f);
                s1 = g.a(0x7f0c023f);
                obj = com.qihoo360.mobilesafe.b.r.a(l, s1, 0x7f080018, ((String) (obj)));
            } else
            if (j1 == 3)
            {
                obj = g.a(0x7f0c0245);
            } else
            {
                obj = g.a(0x7f0c022b);
            }
        } else
        {
            obj = com.qihoo.security.opti.trashclear.ui.g.a(l, trashinfo.clearAdvice);
        }
          goto _L8
        if (trashinfo.clearAdvice == null)
        {
            if (j1 == 1 || j1 == 2)
            {
                obj = g.a(0x7f0c0240);
            } else
            {
                obj = (new StringBuilder()).append(g.a(0x7f0c0247, new Object[] {
                    obj1
                })).append(g.a(0x7f0c0240)).toString();
            }
        } else
        {
            obj = g.a(0x7f0c0240);
        }
          goto _L8
        obj1 = s2;
          goto _L9
    }

    private int d(i i1)
    {
        int i2 = i1.a().b().size();
        int j1;
        int k1;
        int l1;
        int j2;
        if (i2 > 0)
        {
            k1 = ((TrashItemInfo)((i)i1.a().b().get(0)).c()).checkStatus;
        } else
        {
            k1 = 3;
        }
        if (i2 <= 1)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        if (k1 == 3)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        l1 = 1;
        if (l1 >= i2) goto _L2; else goto _L1
_L1:
        j2 = ((TrashItemInfo)((i)i1.a().b().get(l1)).c()).checkStatus;
        if (3 == j2) goto _L4; else goto _L3
_L3:
        if (j2 != 1) goto _L6; else goto _L5
_L5:
        if (k1 != 0) goto _L8; else goto _L7
_L7:
        k1 = 4;
_L2:
        l1 = k1;
        if (j1 != 0)
        {
            l1 = k1;
            if (j1 == i2)
            {
                l1 = 3;
            }
        }
        return l1;
_L8:
        if (k1 == 3)
        {
            k1 = 1;
        }
_L10:
        l1++;
        break MISSING_BLOCK_LABEL_71;
_L6:
        if (j2 == 4)
        {
            k1 = 4;
        } else
        {
label0:
            {
                if (k1 != 1)
                {
                    break label0;
                }
                k1 = 4;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (k1 == 3)
        {
            k1 = 0;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        j1++;
        if (true) goto _L10; else goto _L9
_L9:
        j1 = 0;
        if (true) goto _L2; else goto _L11
_L11:
    }

    private void d()
    {
        int k1 = r.size();
        Object obj = new ArrayList();
        int j1 = 0;
        do
        {
            if (j1 >= k1)
            {
                break;
            }
            if (A == 0)
            {
                if (((TrashItemInfo)((i)r.get(j1)).c()).level == 1 && ((TrashItemInfo)((i)r.get(j1)).c()).isExpand != 1)
                {
                    ((List) (obj)).add(r.get(j1));
                }
            } else
            if (1 == ((TrashItemInfo)((i)r.get(j1)).c()).TrashType && ((TrashItemInfo)((i)r.get(j1)).c()).level == 1 && ((TrashItemInfo)((i)r.get(j1)).c()).isExpand != 1)
            {
                ((List) (obj)).add(r.get(j1));
            }
            j1++;
        } while (true);
        if (((List) (obj)).size() > 0)
        {
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                i i1 = (i)((Iterator) (obj)).next();
                if (r.contains(i1) && !i1.d())
                {
                    v.b(i1);
                }
            } while (true);
        }
        U.sendEmptyMessage(2);
    }

    static boolean d(h h1)
    {
        return h1.z;
    }

    static Context e(h h1)
    {
        return h1.l;
    }

    private void e()
    {
        if (i != null && i.getChildCount() > 0)
        {
            if (v != null && v.getCount() > 0)
            {
                if (o == null)
                {
                    o = v.a(0);
                }
                if (o != null)
                {
                    j.setVisibility(0);
                    v.a(k, o);
                }
            }
            return;
        } else
        {
            j.setVisibility(8);
            return;
        }
    }

    private void e(i i1)
    {
        TrashItemInfo trashiteminfo;
        int j1;
        int j2;
        int k2;
        trashiteminfo = (TrashItemInfo)i1.c();
        j2 = trashiteminfo.level;
        j1 = trashiteminfo.TrashType;
        k2 = trashiteminfo.checkStatus;
        if (k2 != 1) goto _L2; else goto _L1
_L1:
        if (A != 1) goto _L4; else goto _L3
_L3:
        a(i1, j2, k2);
_L6:
        return;
_L4:
        if (j2 != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        List list = trashiteminfo.oraginalData;
        String s3 = trashiteminfo.name;
        if (trashiteminfo.keepCount != -1 || j1 == 3 || (i1.b() == null || i1.b().size() == 0) && ((TrashInfo)list.get(0)).clearType != 2)
        {
            if (j1 == 0 && (i1.b() == null || i1.b().size() == 0) && ((TrashInfo)list.get(0)).clearType == 2)
            {
                a(i1, j2, k2);
                return;
            }
            int k1 = trashiteminfo.keepCount;
            if (k1 > 0 || j1 == 3 || (i1.b() == null || i1.b().size() == 0) && ((TrashInfo)list.get(0)).clearType != 2)
            {
                if (V == null || !V.isShowing())
                {
                    V = new com.qihoo.security.opti.trashclear.ui.b(l, new b.a(i1, j2, k2) {

                        final i a;
                        final int b;
                        final int c;
                        final h d;

                        public void a(com.qihoo.security.opti.trashclear.ui.b b1)
                        {
                            b1.dismiss();
                            com.qihoo.security.opti.trashclear.ui.h.a(d, a, b, c);
                        }

            
            {
                d = h.this;
                a = i1;
                b = j1;
                c = k1;
                super();
            }
                    });
                    Object obj = trashiteminfo.name;
                    Object obj3;
                    boolean flag;
                    if (A == 0)
                    {
                        obj3 = g.a(0x7f0c000e);
                    } else
                    {
                        obj3 = g.a(0x7f0c000d);
                    }
                    if (s3.equals(obj3) || s3.equals(g.a(0x7f0c005e)))
                    {
                        i1 = (new StringBuilder()).append(g.a(0x7f0c0231, new Object[] {
                            Integer.valueOf(k1)
                        })).append(g.a(0x7f0c0232)).append(g.a(0x7f0c023e)).toString();
                        obj3 = com.qihoo360.mobilesafe.b.r.a(l, i1, 0x7f080018, g.a(0x7f0c0232));
                        i1 = ((i) (obj));
                        flag = true;
                        obj = obj3;
                    } else
                    if (j1 == 3)
                    {
                        i1 = com.qihoo.security.opti.trashclear.ui.g.a(((String) (obj)), 18, g.a(0x7f0c0236));
                        obj = trashiteminfo.bigFileFrom;
                        obj = g.a(0x7f0c023c, new Object[] {
                            obj
                        });
                        String s1 = (new StringBuilder()).append(g.a(0x7f0c023b)).append(((String) (obj))).append(g.a(0x7f0c023e)).toString();
                        obj = com.qihoo360.mobilesafe.b.r.a(l, s1, 0x7f080018, ((String) (obj)));
                        flag = false;
                    } else
                    if (j1 == 0)
                    {
                        if (i1.b() == null || i1.b().size() == 0)
                        {
                            String s2 = (new StringBuilder()).append(g.a(0x7f0c0245)).append(g.a(0x7f0c023e)).toString();
                            i1 = ((i) (obj));
                            flag = true;
                            obj = s2;
                        } else
                        {
                            i1 = (new StringBuilder()).append(g.a(0x7f0c0231, new Object[] {
                                Integer.valueOf(k1)
                            })).append(g.a(0x7f0c0232)).append(g.a(0x7f0c023e)).toString();
                            android.text.SpannableStringBuilder spannablestringbuilder = com.qihoo360.mobilesafe.b.r.a(l, i1, 0x7f080018, g.a(0x7f0c0232));
                            flag = false;
                            i1 = ((i) (obj));
                            obj = spannablestringbuilder;
                        }
                    } else
                    {
                        i1 = g.a(0x7f0c023c, new Object[] {
                            obj
                        });
                        Object obj4 = (new StringBuilder()).append(g.a(0x7f0c023d, new Object[] {
                            i1
                        })).append(g.a(0x7f0c023e)).toString();
                        obj4 = com.qihoo360.mobilesafe.b.r.a(l, ((String) (obj4)), 0x7f080018, i1);
                        flag = false;
                        i1 = ((i) (obj));
                        obj = obj4;
                    }
                    if (A == 0)
                    {
                        i1 = g.a(0x7f0c0252);
                    }
                    V.a(i1, ((CharSequence) (obj)), flag);
                    com.qihoo360.mobilesafe.b.d.a(V);
                    return;
                }
            } else
            {
                a(i1, j2, k2);
                return;
            }
        } else
        {
            a(i1, j2, k2);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (j2 != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        int l2 = i1.b().size();
        int l1 = 0;
        j1 = 0;
        for (; l1 < l2; l1++)
        {
            if (((TrashItemInfo)((i)i1.b().get(l1)).c()).keepCount != -1)
            {
                j1 = ((TrashItemInfo)((i)i1.b().get(l1)).c()).keepCount + j1;
            }
        }

        if (j1 > 0)
        {
            if (V == null || !V.isShowing())
            {
                V = new com.qihoo.security.opti.trashclear.ui.b(l, new b.a(i1, j2, k2) {

                    final i a;
                    final int b;
                    final int c;
                    final h d;

                    public void a(com.qihoo.security.opti.trashclear.ui.b b1)
                    {
                        b1.dismiss();
                        com.qihoo.security.opti.trashclear.ui.h.a(d, a, b, c);
                    }

            
            {
                d = h.this;
                a = i1;
                b = j1;
                c = k1;
                super();
            }
                });
                i1 = trashiteminfo.name;
                Object obj1 = (new StringBuilder()).append(g.a(0x7f0c0231, new Object[] {
                    Integer.valueOf(j1)
                })).append(g.a(0x7f0c0232)).append(g.a(0x7f0c023e)).toString();
                obj1 = com.qihoo360.mobilesafe.b.r.a(l, ((String) (obj1)), 0x7f080018, g.a(0x7f0c0232));
                V.a(i1, ((CharSequence) (obj1)), false);
                com.qihoo360.mobilesafe.b.d.a(V);
                return;
            }
        } else
        {
            a(i1, j2, k2);
            return;
        }
        if (true) goto _L6; else goto _L7
_L7:
        if (j2 == 3)
        {
            List list1 = trashiteminfo.oraginalData;
            if (list1 != null && list1.size() > 0)
            {
                Object obj5 = (TrashInfo)list1.get(0);
                int i2 = ((TrashInfo) (obj5)).clearType;
                if (i2 != 2 || j1 == 3 || j1 == 0 && z && i2 != 2)
                {
                    if (V == null || !V.isShowing())
                    {
                        V = new com.qihoo.security.opti.trashclear.ui.b(l, new b.a(i1, j2, k2) {

                            final i a;
                            final int b;
                            final int c;
                            final h d;

                            public void a(com.qihoo.security.opti.trashclear.ui.b b1)
                            {
                                b1.dismiss();
                                com.qihoo.security.opti.trashclear.ui.h.a(d, a, b, c);
                            }

            
            {
                d = h.this;
                a = i1;
                b = j1;
                c = k1;
                super();
            }
                        });
                        Object obj2 = trashiteminfo.name;
                        if (j1 == 3)
                        {
                            if (((TrashInfo) (obj5)).bundle != null && ((TrashInfo) (obj5)).bundle.containsKey("src"))
                            {
                                if (TextUtils.isEmpty(((TrashInfo) (obj5)).bundle.getString("src")));
                            }
                            if (TextUtils.isEmpty(((TrashInfo) (obj5)).clearAdvice))
                            {
                                com.qihoo.security.opti.trashclear.ui.g.a(((String) (obj2)), 18, (new StringBuilder()).append(g.a(0x7f0c0236)).append(".").append(((String) (obj2)).substring(((String) (obj2)).lastIndexOf(".") + 1)).toString());
                                i1 = (new StringBuilder()).append(g.a(0x7f0c0245)).append(g.a(0x7f0c023e)).toString();
                            } else
                            {
                                i1 = com.qihoo.security.opti.trashclear.ui.g.a(l, ((TrashInfo) (obj5)).clearAdvice);
                            }
                        } else
                        if (j1 == 0)
                        {
                            obj5 = ((TrashItemInfo)i1.a().c()).name;
                            if (A == 0)
                            {
                                i1 = g.a(0x7f0c000e);
                            } else
                            {
                                i1 = g.a(0x7f0c000d);
                            }
                            if (((String) (obj5)).equals(i1))
                            {
                                obj5 = (TrashInfo)trashiteminfo.oraginalData.get(0);
                                obj2 = null;
                                i1 = ((i) (obj2));
                                if (((TrashInfo) (obj5)).bundle != null)
                                {
                                    i1 = ((i) (obj2));
                                    if (((TrashInfo) (obj5)).bundle.containsKey("apkVersionName"))
                                    {
                                        i1 = ((TrashInfo) (obj5)).bundle.getString("apkVersionName");
                                    }
                                }
                                obj2 = i1;
                                if (TextUtils.isEmpty(i1))
                                {
                                    obj2 = "0.1.0";
                                }
                                i1 = (new StringBuilder()).append(g.a(0x7f0c022d)).append(com.qihoo360.mobilesafe.b.s.a(((TrashInfo) (obj5)).size)).toString();
                                if (((TrashInfo) (obj5)).dataType == 8)
                                {
                                    i1 = (new StringBuilder()).append(g.a(0x7f0c0242)).append(g.a(0x7f0c023e)).toString();
                                } else
                                if (((TrashInfo) (obj5)).dataType == 6)
                                {
                                    i1 = (new StringBuilder()).append(g.a(0x7f0c0243)).append(g.a(0x7f0c023e)).toString();
                                } else
                                {
                                    i1 = (new StringBuilder()).append(i1).append("\n").append(g.a(0x7f0c0011, new Object[] {
                                        obj2
                                    })).toString();
                                }
                            } else
                            {
                                i1 = g.a(0x7f0c023c, new Object[] {
                                    obj2
                                });
                                obj2 = (new StringBuilder()).append(g.a(0x7f0c023d, new Object[] {
                                    i1
                                })).append(g.a(0x7f0c023e)).toString();
                                i1 = com.qihoo360.mobilesafe.b.r.a(l, ((String) (obj2)), 0x7f080018, i1);
                            }
                        } else
                        if (j1 == 1 || j1 == 2)
                        {
                            if (TextUtils.isEmpty(((TrashInfo) (obj5)).clearAdvice))
                            {
                                i1 = g.a(0x7f0c023f);
                                obj2 = (new StringBuilder()).append(i1).append(g.a(0x7f0c023e)).toString();
                                i1 = com.qihoo360.mobilesafe.b.r.a(l, ((String) (obj2)), 0x7f080018, i1);
                            } else
                            {
                                i1 = com.qihoo.security.opti.trashclear.ui.g.a(l, (new StringBuilder()).append(((TrashInfo) (obj5)).clearAdvice).append(g.a(0x7f0c023e)).toString());
                            }
                        } else
                        {
                            i1 = (new StringBuilder()).append(g.a(0x7f0c022f, new Object[] {
                                obj2
                            })).append(g.a(0x7f0c0230)).append(g.a(0x7f0c023e)).toString();
                            i1 = com.qihoo360.mobilesafe.b.r.a(l, i1, 0x7f080018, g.a(0x7f0c0230));
                        }
                        obj2 = g.a(0x7f0c0252);
                        V.a(((CharSequence) (obj2)), i1, true);
                        com.qihoo360.mobilesafe.b.d.a(V);
                        return;
                    }
                } else
                {
                    a(i1, j2, k2);
                    return;
                }
            }
        } else
        {
            a(i1, j2, k2);
            return;
        }
        if (true) goto _L6; else goto _L2
_L2:
        a(i1, j2, k2);
        return;
    }

    static Handler f(h h1)
    {
        return h1.U;
    }

    private i f(i i1)
    {
        i j1;
        if (i1 == null)
        {
            j1 = null;
        } else
        {
            j1 = i1;
            if (i1.a() != null)
            {
                return f(i1.a());
            }
        }
        return j1;
    }

    private void f()
    {
        if (Z == null || !Z.isShowing())
        {
            String s1 = g.a(0x7f0c0214);
            long l1 = t.e(A);
            String s2 = (new StringBuilder()).append(g.a(0x7f0c022d)).append(com.qihoo360.mobilesafe.b.s.a(l1)).toString();
            s2 = (new StringBuilder()).append(g.a(0x7f0c023f)).append("\n").append(s2).toString();
            Z = new com.qihoo.security.opti.trashclear.ui.b(l, new b.a() {

                final h a;

                public void a(com.qihoo.security.opti.trashclear.ui.b b1)
                {
                    b1.dismiss();
                    com.qihoo.security.opti.trashclear.ui.h.a(a);
                }

            
            {
                a = h.this;
                super();
            }
            });
            Z.a(s1, s2, true);
            Z.a(com.qihoo.security.locale.d.a().a(0x7f0c0234), com.qihoo.security.locale.d.a().a(0x7f0c014f));
            com.qihoo360.mobilesafe.b.d.a(Z);
        }
    }

    static View g(h h1)
    {
        return h1.q;
    }

    private void g()
    {
        Object obj = t.f(A);
        if (obj == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = ((List) (obj)).iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L3
_L3:
        if (((TrashInfo)iterator.next()).type != 37) goto _L5; else goto _L4
_L4:
        boolean flag = true;
_L7:
        long l1;
        if (flag && t.b() > 0L)
        {
            com.qihoo.security.support.b.a(18317, String.valueOf(t.e(A)), String.valueOf(t.b()));
        } else
        {
            com.qihoo.security.support.b.a(18317, t.e(A));
        }
        SharedPref.a(l, "last_trash_clear_time", System.currentTimeMillis());
        SharedPref.a(l, t.e(A));
        SharedPref.a(l, "first_time_in_this_open", true);
        B.a(((List) (obj)));
        SharedPref.b(l, com.qihoo.security.opti.b.d.b(l));
        l1 = t.e(A);
        if (A != 0)
        {
            r.clear();
        }
        if (android.os.Build.VERSION.SDK_INT <= 11)
        {
            a(Long.valueOf(l1));
            f.setEnabled(true);
        }
        obj = new Message();
        obj.what = 7;
        obj.arg1 = 10;
        U.sendMessage(((Message) (obj)));
        U.sendMessageDelayed(U.obtainMessage(1, Long.valueOf(l1)), 100L);
        U.sendEmptyMessageDelayed(6, 100L);
        U.sendMessageDelayed(U.obtainMessage(9, Long.valueOf(l1)), 3000L);
        return;
_L2:
        flag = false;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static LocaleTextView h(h h1)
    {
        return h1.b;
    }

    private void h()
    {
        k();
        if (v != null && v.getCount() != 0)
        {
            i.setVisibility(4);
            i.setAdapter(v);
        }
        d();
        i();
        if (android.os.Build.VERSION.SDK_INT <= 11)
        {
            q.setVisibility(8);
            b.setVisibility(4);
            U.sendEmptyMessage(11);
            f.setEnabled(true);
            return;
        } else
        {
            j.setVisibility(8);
            U.sendEmptyMessage(10);
            return;
        }
    }

    static ListView i(h h1)
    {
        return h1.i;
    }

    private void i()
    {
        if (A == 0 && com.qihoo.security.opti.trashclear.ui.e.a(A).size() == 0)
        {
            i.setVisibility(4);
            b.setVisibility(0);
            b.setText(g.a(0x7f0c024f));
            d.setLocalText(g.a(0x7f0c001d, new Object[] {
                com.qihoo360.mobilesafe.b.s.a(t.c(A))
            }));
        }
        String as[] = a(t.d(A));
        a.setLocalText(as[0]);
        c.setVisibility(0);
        e.setVisibility(0);
        c.setLocalText(as[1]);
        d.setLocalText(g.a(0x7f0c001d, new Object[] {
            com.qihoo360.mobilesafe.b.s.a(t.c(A))
        }));
    }

    static com.qihoo.security.opti.trashclear.ui.mainpage.opti.b j(h h1)
    {
        return h1.v;
    }

    private void j()
    {
        int j1;
        if (r != null)
        {
            if ((j1 = r.size()) != 0)
            {
                for (int i1 = 0; i1 < j1 && v.getCount() > i1; i1++)
                {
                    if (!v.a(i1).d())
                    {
                        continue;
                    }
                    v.b(v.a(i1));
                    if (o != null)
                    {
                        ((TrashItemInfo)o.c()).isExpand = 2;
                        v.a(k, o);
                    }
                }

                U.sendEmptyMessage(2);
                return;
            }
        }
    }

    static com.qihoo.security.a.a.a k(h h1)
    {
        return h1.y;
    }

    private void k()
    {
        if (r == null)
        {
            r = new ArrayList();
        }
        if (s == null)
        {
            s = new ArrayList();
        }
        v = new com.qihoo.security.opti.trashclear.ui.mainpage.opti.b(l, r);
        v.b(A);
        if (v.getCount() != 0)
        {
            v.a(new a.c() {

                final h a;

                public void a(i k1)
                {
                    com.qihoo.security.opti.trashclear.ui.h.a(a, k1);
                    int l1 = ((TrashItemInfo)com.qihoo.security.opti.trashclear.ui.h.b(a).c()).checkStatus;
                }

            
            {
                a = h.this;
                super();
            }
            });
            v.a(new a.d() {

                final h a;

                public void a(View view, i k1)
                {
                    com.qihoo.security.opti.trashclear.ui.h.b(a, k1);
                }

            
            {
                a = h.this;
                super();
            }
            });
            int j1 = v.getCount();
            for (int i1 = 0; i1 < j1; i1++)
            {
                a(v.a(i1));
            }

            if (A == 0 && D)
            {
                b();
                return;
            }
        }
    }

    static FrameLayout l(h h1)
    {
        return h1.j;
    }

    static LocaleTextView m(h h1)
    {
        return h1.f;
    }

    static com.qihoo.security.a.a.a n(h h1)
    {
        return h1.x;
    }

    static void o(h h1)
    {
        h1.e();
    }

    static com.qihoo.security.opti.trashclear.ui.e p(h h1)
    {
        return h1.t;
    }

    static ShadowTextView q(h h1)
    {
        return h1.a;
    }

    static LocaleTextView r(h h1)
    {
        return h1.c;
    }

    static LocaleTextView s(h h1)
    {
        return h1.e;
    }

    static void t(h h1)
    {
        h1.h();
    }

    static com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus u(h h1)
    {
        return h1.C;
    }

    static com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.a v(h h1)
    {
        return h1.B;
    }

    static List w(h h1)
    {
        return h1.E;
    }

    static boolean x(h h1)
    {
        return h1.G;
    }

    public void a()
    {
        if (A == 0)
        {
            j.setVisibility(8);
            if (r != null && r.size() > 0 && v != null)
            {
                Iterator iterator = r.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    i i1 = (i)iterator.next();
                    if (1 == ((TrashItemInfo)i1.c()).level && i1.d())
                    {
                        v.b(i1);
                    }
                } while (true);
            }
        }
    }

    public void a(int i1)
    {
    }

    public void b()
    {
        f.setEnabled(true);
        if (u)
        {
            break MISSING_BLOCK_LABEL_313;
        }
        u = true;
        if (s == null || s.size() <= 0) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        int j1;
        int k1;
        k1 = s.size();
        arraylist = new ArrayList();
        arraylist.addAll(s);
        j1 = 0;
_L3:
        if (j1 >= k1)
        {
            break; /* Loop/switch isn't completed */
        }
        i i1 = (i)arraylist.get(j1);
        if (((TrashItemInfo)i1.c()).oraginalData != null)
        {
            TrashInfo trashinfo = (TrashInfo)((TrashItemInfo)i1.c()).oraginalData.get(0);
            int l1 = ((TrashItemInfo)i1.c()).TrashType;
            String s2 = trashinfo.path;
            String s1;
            if (i1.a() != null)
            {
                s1 = ((TrashItemInfo)i1.a().c()).name;
            } else
            {
                s1 = "";
            }
            if (l1 == 2 || l1 == 1 || l1 == 3)
            {
                a(s2, l1, i1.a().b(), true);
            } else
            {
                String s3;
                if (A == 0)
                {
                    s3 = g.a(0x7f0c000e);
                } else
                {
                    s3 = g.a(0x7f0c000d);
                }
                if (s1.equals(s3))
                {
                    a(i1, m.a(trashinfo), false);
                    a(i1, trashinfo, m.a(trashinfo));
                }
            }
        }
_L4:
        j1++;
        if (true) goto _L3; else goto _L2
_L2:
        u = false;
          goto _L4
    }

    public void c()
    {
        j();
    }

    public void onClick(View view)
    {
        if (!com.qihoo360.mobilesafe.b.f.a())
        {
            switch (view.getId())
            {
            default:
                return;

            case 2131427574: 
                break;
            }
            if (g.a(0x7f0c0150).equals(f.getText()))
            {
                B.a();
                return;
            }
            if (t != null)
            {
                if (v == null || v.getCount() == 0)
                {
                    B.a(0.0F, 0.0F, true);
                    b.setText(g.a(0x7f0c024a));
                    return;
                }
                if (A == 1)
                {
                    com.qihoo.security.support.b.c(18003);
                }
                com.qihoo.utils.notice.a.a().b(4103);
                com.qihoo.utils.notice.a.a().b(4110);
                w = true;
                if (t.b(A) != null && t.b(A).size() != 0 && t.e(A) > 0L)
                {
                    if (A == 0)
                    {
                        f();
                        return;
                    } else
                    {
                        g();
                        return;
                    }
                } else
                {
                    com.qihoo360.mobilesafe.b.q.a().a(0x7f0c0213);
                    return;
                }
            }
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
    }

    public void onScroll(AbsListView abslistview, int i1, int j1, int k1)
    {
        if (v != null && i1 < v.getCount() && v != null && v.getCount() > 0 && !w)
        {
            abslistview = v.a(i1);
            if (abslistview != null)
            {
                abslistview = f(abslistview);
                if (o != abslistview)
                {
                    o = abslistview;
                    k.setOnClickListener(new android.view.View.OnClickListener() {

                        final h a;

                        public void onClick(View view)
                        {
                            com.qihoo.security.opti.trashclear.ui.h.b(a, com.qihoo.security.opti.trashclear.ui.h.b(a));
                        }

            
            {
                a = h.this;
                super();
            }
                    });
                    v.a(k, o);
                }
                k1 = 1;
                int l1 = 0;
                for (; k1 < j1 && abslistview == f(v.a(i1 + k1)); k1++)
                {
                    l1 = k1;
                }

                i1 = i.getHeight();
                abslistview = i.getChildAt(l1);
                if (abslistview != null)
                {
                    i1 = abslistview.getBottom();
                }
                j1 = j.getHeight();
                if (i1 < j1)
                {
                    abslistview = (android.widget.RelativeLayout.LayoutParams)j.getLayoutParams();
                    abslistview.topMargin = i1 - j1;
                    j.setLayoutParams(abslistview);
                    return;
                } else
                {
                    abslistview = (android.widget.RelativeLayout.LayoutParams)j.getLayoutParams();
                    abslistview.topMargin = 0;
                    j.setLayoutParams(abslistview);
                    return;
                }
            }
        }
    }

    public void onScrollStateChanged(AbsListView abslistview, int i1)
    {
        if (-1 == n)
        {
            e();
        }
        n = i1;
    }

    public void setAllBgColor(int i1)
    {
        F.a(i1);
    }

    public void setBackgroundExamStatus(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus)
    {
        int i1 = a(examstatus);
        F.a(i1);
    }

    public void setClearCallBack(com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.a a1)
    {
        B = a1;
    }

    public void setColor(int i1)
    {
        h.setBackgroundColor(i1);
        com.qihoo360.mobilesafe.b.c.a(f, i1);
    }

    public void setData(com.qihoo.security.opti.trashclear.ui.e e1)
    {
        t = e1;
        r = com.qihoo.security.opti.trashclear.ui.e.a(A);
        if (r != null && r.size() == 0)
        {
            U.sendEmptyMessage(13);
            return;
        }
        if (A == 0)
        {
            C = com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT;
            E = new ArrayList();
        }
        U.sendEmptyMessage(4);
        e1 = new Message();
        e1.what = 3;
        e1.arg1 = 0;
        U.sendMessage(e1);
    }

    public void setExamStatus(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus)
    {
        C = examstatus;
    }

    public void setListViewAndListener(View view)
    {
        f = (LocaleTextView)view.findViewById(0x7f0b00f6);
        f.setLocalText(0x7f0c0214);
        f.setEnabled(false);
        a = (ShadowTextView)view.findViewById(0x7f0b00ec);
        c = (LocaleTextView)view.findViewById(0x7f0b00ed);
        e = (LocaleTextView)view.findViewById(0x7f0b00ee);
        if (A == 0)
        {
            e.setText(0x7f0c0253);
        }
        q = view.findViewById(0x7f0b009b);
        q.setVisibility(0);
        d = (LocaleTextView)view.findViewById(0x7f0b00ef);
        f.setOnClickListener(this);
        i = (ListView)view.findViewById(0x7f0b00f2);
        i.setOnItemClickListener(this);
        i.setDivider(null);
        i.setOnScrollListener(this);
        b = (LocaleTextView)view.findViewById(0x7f0b00f3);
        b.setText(g.a(0x7f0c024a));
        i.setEmptyView(b);
        b.setVisibility(4);
        i.setVisibility(4);
        h = (LinearLayout)view.findViewById(0x7f0b00eb);
        j = (FrameLayout)view.findViewById(0x7f0b00f4);
        k = p.inflate(0x7f030042, j);
        x = new com.qihoo.security.a.a.a(3, 3, 30L, com.qihoo360.mobilesafe.b.a.a(l), com.qihoo360.mobilesafe.b.a.b(l));
        y = new com.qihoo.security.a.a.a(2, 3, 70L, com.qihoo360.mobilesafe.b.a.a(l), com.qihoo360.mobilesafe.b.a.b(l));
        int i1 = a(C);
        F = new e(a(C));
        F.a(this);
        h.setBackgroundColor(i1);
        com.qihoo360.mobilesafe.b.c.a(f, i1);
    }

    public void setTrashClearEngine(com.qihoo.security.enginehelper.clean.a a1)
    {
        m = a1;
    }

    public void setViewType(int i1)
    {
        A = i1;
        if (v != null)
        {
            v.b(i1);
        }
    }
}
