// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.opti.sysclear;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import com.qihoo.security.app.BaseActivity;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.opti.a.c;
import com.qihoo.security.quc.AccountLog;
import com.qihoo360.mobilesafe.b.f;
import com.qihoo360.mobilesafe.b.g;
import com.qihoo360.mobilesafe.b.q;
import java.lang.ref.SoftReference;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ProcessClearWhiteListActivity extends BaseActivity
    implements android.widget.AdapterView.OnItemClickListener
{
    public class a extends BaseAdapter
    {

        final ProcessClearWhiteListActivity a;
        private final LayoutInflater b;
        private final boolean c = true;

        private void b(List list)
        {
            if (list != null && ProcessClearWhiteListActivity.a(a) != null && ProcessClearWhiteListActivity.k(a) != null)
            {
                ProcessClearWhiteListActivity.a(a).clear();
                ProcessClearWhiteListActivity.k(a).clear();
                ProcessClearWhiteListActivity.m(a).clear();
                ProcessClearWhiteListActivity.m(a).addAll(list);
                list = ProcessClearWhiteListActivity.m(a).iterator();
                while (list.hasNext()) 
                {
                    com.qihoo.security.opti.a.c.a a1 = (com.qihoo.security.opti.a.c.a)list.next();
                    if (a1.c)
                    {
                        ProcessClearWhiteListActivity.a(a).add(a1);
                    } else
                    {
                        ProcessClearWhiteListActivity.k(a).add(a1);
                    }
                }
            }
        }

        public com.qihoo.security.opti.a.c.a a(int i1)
        {
            if (ProcessClearWhiteListActivity.b(a))
            {
                return (com.qihoo.security.opti.a.c.a)ProcessClearWhiteListActivity.k(a).get(i1);
            } else
            {
                return (com.qihoo.security.opti.a.c.a)ProcessClearWhiteListActivity.a(a).get(i1);
            }
        }

        public void a(List list)
        {
            if (!a.isFinishing())
            {
                ArrayList arraylist = new ArrayList();
                ArrayList arraylist1 = new ArrayList();
                for (Iterator iterator = list.iterator(); iterator.hasNext();)
                {
                    com.qihoo.security.opti.a.c.a a1 = (com.qihoo.security.opti.a.c.a)iterator.next();
                    if (a1.d)
                    {
                        arraylist1.add(a1);
                    } else
                    {
                        arraylist.add(a1);
                    }
                }

                list.clear();
                list.addAll(arraylist);
                list.addAll(arraylist1);
                b(list);
                arraylist1.clear();
                arraylist.clear();
                notifyDataSetChanged();
            }
        }

        public int getCount()
        {
            if (ProcessClearWhiteListActivity.a(a) == null || ProcessClearWhiteListActivity.k(a) == null)
            {
                return 0;
            }
            if (ProcessClearWhiteListActivity.b(a))
            {
                return ProcessClearWhiteListActivity.k(a).size();
            } else
            {
                return ProcessClearWhiteListActivity.a(a).size();
            }
        }

        public Object getItem(int i1)
        {
            return a(i1);
        }

        public long getItemId(int i1)
        {
            return (long)i1;
        }

        public View getView(int i1, View view, ViewGroup viewgroup)
        {
            View view1;
            Object obj;
            if (view == null)
            {
                view1 = b.inflate(0x7f03009c, null);
                viewgroup = new b();
                obj = new a(this);
                viewgroup.a = (ImageView)view1.findViewById(0x7f0b020b);
                viewgroup.b = (LocaleTextView)view1.findViewById(0x7f0b020c);
                viewgroup.c = (LocaleTextView)view1.findViewById(0x7f0b020d);
                viewgroup.d = (ImageView)view1.findViewById(0x7f0b020e);
                ((b) (viewgroup)).d.setOnClickListener(((android.view.View.OnClickListener) (obj)));
                viewgroup.e = (ImageView)view1.findViewById(0x7f0b020f);
                ((b) (viewgroup)).e.setOnClickListener(((android.view.View.OnClickListener) (obj)));
                view1.setTag(viewgroup);
                view1.setTag(((b) (viewgroup)).d.getId(), obj);
            } else
            {
                viewgroup = (b)view.getTag();
                obj = (a)view.getTag(((b) (viewgroup)).d.getId());
                view1 = view;
            }
            ((a) (obj)).a(i1);
            if (ProcessClearWhiteListActivity.b(a))
            {
                obj = (com.qihoo.security.opti.a.c.a)ProcessClearWhiteListActivity.k(a).get(i1);
            } else
            {
                obj = (com.qihoo.security.opti.a.c.a)ProcessClearWhiteListActivity.a(a).get(i1);
            }
            if (ProcessClearWhiteListActivity.b(a))
            {
                ((b) (viewgroup)).d.setVisibility(8);
                ((b) (viewgroup)).e.setVisibility(0);
                Object obj1;
                if (((com.qihoo.security.opti.a.c.a) (obj)).c)
                {
                    ((b) (viewgroup)).e.setImageResource(0x7f020055);
                } else
                {
                    ((b) (viewgroup)).e.setImageResource(0x7f020054);
                }
            } else
            {
                ((b) (viewgroup)).d.setVisibility(0);
                ((b) (viewgroup)).e.setVisibility(8);
            }
            ((b) (viewgroup)).b.setLocalText(((com.qihoo.security.opti.a.c.a) (obj)).b);
            if (((com.qihoo.security.opti.a.c.a) (obj)).d)
            {
                ((b) (viewgroup)).c.setLocalText(0x7f0c00be);
            } else
            {
                ((b) (viewgroup)).c.setLocalText(0x7f0c00bf);
            }
            if (!ProcessClearWhiteListActivity.n(a).containsKey(((com.qihoo.security.opti.a.c.a) (obj)).a)) goto _L2; else goto _L1
_L1:
            view = (SoftReference)ProcessClearWhiteListActivity.n(a).get(((com.qihoo.security.opti.a.c.a) (obj)).a);
            if (view == null) goto _L2; else goto _L3
_L3:
            view = (Drawable)view.get();
_L5:
            obj1 = view;
            if (view == null)
            {
                obj1 = ProcessClearWhiteListActivity.b(a, ((com.qihoo.security.opti.a.c.a) (obj)).a);
                ProcessClearWhiteListActivity.n(a).put(((com.qihoo.security.opti.a.c.a) (obj)).a, new SoftReference(obj1));
            }
            ((b) (viewgroup)).a.setImageDrawable(((Drawable) (obj1)));
            ((b) (viewgroup)).d.setTag(Integer.valueOf(i1));
            return view1;
_L2:
            view = null;
            if (true) goto _L5; else goto _L4
_L4:
        }

        public a(Context context, List list)
        {
            a = ProcessClearWhiteListActivity.this;
            super();
            b = LayoutInflater.from(context);
        }
    }

    private class a.a
        implements android.view.View.OnClickListener
    {

        final a a;
        private int b;

        public void a(int i1)
        {
            b = i1;
        }

        public void onClick(View view)
        {
            if (b >= 0 && b < ProcessClearWhiteListActivity.e(a.a).getCount())
            {
                com.qihoo.security.opti.a.c.a a1;
                if (ProcessClearWhiteListActivity.b(a.a))
                {
                    a1 = (com.qihoo.security.opti.a.c.a)ProcessClearWhiteListActivity.k(a.a).get(b);
                } else
                {
                    a1 = (com.qihoo.security.opti.a.c.a)ProcessClearWhiteListActivity.a(a.a).get(b);
                }
                if (!a1.a.equals("com.qihoo.security.lite"))
                {
                    boolean flag;
                    if (!a1.c)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    a1.c = flag;
                    if (!ProcessClearWhiteListActivity.b(a.a))
                    {
                        ProcessClearWhiteListActivity.a(a.a).remove(a1);
                        ProcessClearWhiteListActivity.k(a.a).add(0, a1);
                        com.qihoo.security.ui.opti.sysclear.ProcessClearWhiteListActivity.d(a.a).a(a1.a, false);
                        ProcessClearWhiteListActivity.e(a.a).notifyDataSetChanged();
                        com.qihoo.security.ui.opti.sysclear.ProcessClearWhiteListActivity.f(a.a);
                        com.qihoo.security.ui.opti.sysclear.ProcessClearWhiteListActivity.c(a.a, true);
                        if (ProcessClearWhiteListActivity.h(a.a) == 0)
                        {
                            com.qihoo.security.support.b.c(11026);
                        } else
                        {
                            com.qihoo.security.support.b.b(11315, ProcessClearWhiteListActivity.a(a.a).size());
                        }
                        com.qihoo360.mobilesafe.b.q.a().a(a.a.o.a(0x7f0c002a));
                        return;
                    } else
                    {
                        ProcessClearWhiteListActivity.a(a.a, a1, (ImageView)view);
                        return;
                    }
                }
            }
        }

        private a.a(a a1)
        {
            a = a1;
            super();
        }

    }

    private static class b
    {

        ImageView a;
        LocaleTextView b;
        LocaleTextView c;
        ImageView d;
        ImageView e;

        private b()
        {
            a = null;
            b = null;
            c = null;
            d = null;
            e = null;
        }

    }


    private static final String y = com/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity.getSimpleName();
    private ListView A;
    private LocaleTextView B;
    private View C;
    private c D;
    private boolean E;
    private LocaleTextView F;
    private int G;
    private boolean H;
    private boolean I;
    private g J;
    private int K;
    private final Handler L = new Handler() {

        final ProcessClearWhiteListActivity a;

        public void handleMessage(Message message)
        {
            if (!a.isFinishing()) goto _L2; else goto _L1
_L1:
            return;
_L2:
            switch (message.what)
            {
            default:
                break;

            case 0: // '\0'
                break;

            case 1: // '\001'
                break;
            }
            break; /* Loop/switch isn't completed */
            return;
            if (true) goto _L1; else goto _L3
_L3:
            if (ProcessClearWhiteListActivity.a(a) != null && ProcessClearWhiteListActivity.a(a).size() == 0 && !ProcessClearWhiteListActivity.b(a))
            {
                com.qihoo.security.ui.opti.sysclear.ProcessClearWhiteListActivity.c(a).setVisibility(8);
            } else
            {
                com.qihoo.security.ui.opti.sysclear.ProcessClearWhiteListActivity.c(a).setVisibility(8);
            }
            ProcessClearWhiteListActivity.e(a).a(com.qihoo.security.ui.opti.sysclear.ProcessClearWhiteListActivity.d(a).c());
            com.qihoo.security.ui.opti.sysclear.ProcessClearWhiteListActivity.f(a);
            if (!com.qihoo.security.ui.opti.sysclear.ProcessClearWhiteListActivity.g(a))
            {
                AccountLog.b(com.qihoo.security.quc.AccountLog.FUNC_LIST.UI_ENTER_IGNORE_PAGE);
                ProcessClearWhiteListActivity.a(a, true);
            }
            if (ProcessClearWhiteListActivity.a(a) != null)
            {
                if (ProcessClearWhiteListActivity.h(a) == 0)
                {
                    com.qihoo.security.support.b.b(11024, ProcessClearWhiteListActivity.a(a).size());
                    return;
                } else
                {
                    com.qihoo.security.support.b.b(11313, ProcessClearWhiteListActivity.a(a).size());
                    return;
                }
            }
            if (true) goto _L1; else goto _L4
_L4:
        }

            
            {
                a = ProcessClearWhiteListActivity.this;
                super();
            }
    };
    private final com.qihoo.security.opti.a.c.b M = new com.qihoo.security.opti.a.c.b() {

        final ProcessClearWhiteListActivity a;

        public void a()
        {
            ProcessClearWhiteListActivity.l(a).sendEmptyMessage(0);
        }

        public void b()
        {
            ProcessClearWhiteListActivity.l(a).sendEmptyMessage(1);
        }

        public void c()
        {
        }

            
            {
                a = ProcessClearWhiteListActivity.this;
                super();
            }
    };
    private List N;
    private List O;
    private List P;
    private Map Q;
    private final Comparator R = new Comparator() {

        final ProcessClearWhiteListActivity a;
        private final Collator b = Collator.getInstance();

        public final int a(com.qihoo.security.opti.a.c.a a1, com.qihoo.security.opti.a.c.a a2)
        {
            if (a1.d == a2.d)
            {
                return b.compare(a1.b, a2.b);
            }
            return !a1.d ? -1 : 1;
        }

        public int compare(Object obj, Object obj1)
        {
            return a((com.qihoo.security.opti.a.c.a)obj, (com.qihoo.security.opti.a.c.a)obj1);
        }

            
            {
                a = ProcessClearWhiteListActivity.this;
                super();
            }
    };
    private a z;

    public ProcessClearWhiteListActivity()
    {
        z = null;
        A = null;
        D = null;
        E = false;
        G = 0;
        H = false;
        K = 0;
        N = null;
        O = null;
        P = null;
        Q = null;
    }

    static int a(ProcessClearWhiteListActivity processclearwhitelistactivity, int i1)
    {
        processclearwhitelistactivity.G = i1;
        return i1;
    }

    static List a(ProcessClearWhiteListActivity processclearwhitelistactivity)
    {
        return processclearwhitelistactivity.N;
    }

    private void a(com.qihoo.security.opti.a.c.a a1, ImageView imageview)
    {
        if (!a1.c)
        {
            if (E)
            {
                G = G - 1;
                if (G > 0)
                {
                    F.setLocalText(o.a(0x7f0c0027, new Object[] {
                        Integer.valueOf(G)
                    }));
                } else
                {
                    F.setLocalText(o.a(0x7f0c0026));
                }
            }
            imageview.setImageResource(0x7f0200b1);
        } else
        {
            if (E)
            {
                G = G + 1;
                if (G > 0)
                {
                    F.setLocalText(o.a(0x7f0c0027, new Object[] {
                        Integer.valueOf(G)
                    }));
                } else
                {
                    F.setLocalText(o.a(0x7f0c0026));
                }
            }
            imageview.setImageResource(0x7f0200b8);
        }
        z.notifyDataSetChanged();
    }

    static void a(ProcessClearWhiteListActivity processclearwhitelistactivity, com.qihoo.security.opti.a.c.a a1, ImageView imageview)
    {
        processclearwhitelistactivity.a(a1, imageview);
    }

    static void a(ProcessClearWhiteListActivity processclearwhitelistactivity, String s)
    {
        processclearwhitelistactivity.b(s);
    }

    static boolean a(ProcessClearWhiteListActivity processclearwhitelistactivity, boolean flag)
    {
        processclearwhitelistactivity.I = flag;
        return flag;
    }

    static Drawable b(ProcessClearWhiteListActivity processclearwhitelistactivity, String s)
    {
        return processclearwhitelistactivity.c(s);
    }

    static boolean b(ProcessClearWhiteListActivity processclearwhitelistactivity)
    {
        return processclearwhitelistactivity.E;
    }

    static boolean b(ProcessClearWhiteListActivity processclearwhitelistactivity, boolean flag)
    {
        processclearwhitelistactivity.E = flag;
        return flag;
    }

    private Drawable c(String s)
    {
        return J.a(s, null);
    }

    static View c(ProcessClearWhiteListActivity processclearwhitelistactivity)
    {
        return processclearwhitelistactivity.C;
    }

    static boolean c(ProcessClearWhiteListActivity processclearwhitelistactivity, boolean flag)
    {
        processclearwhitelistactivity.H = flag;
        return flag;
    }

    static c d(ProcessClearWhiteListActivity processclearwhitelistactivity)
    {
        return processclearwhitelistactivity.D;
    }

    static a e(ProcessClearWhiteListActivity processclearwhitelistactivity)
    {
        return processclearwhitelistactivity.z;
    }

    static void f(ProcessClearWhiteListActivity processclearwhitelistactivity)
    {
        processclearwhitelistactivity.p();
    }

    static boolean g(ProcessClearWhiteListActivity processclearwhitelistactivity)
    {
        return processclearwhitelistactivity.I;
    }

    static int h(ProcessClearWhiteListActivity processclearwhitelistactivity)
    {
        return processclearwhitelistactivity.K;
    }

    static LocaleTextView i(ProcessClearWhiteListActivity processclearwhitelistactivity)
    {
        return processclearwhitelistactivity.F;
    }

    static ListView j(ProcessClearWhiteListActivity processclearwhitelistactivity)
    {
        return processclearwhitelistactivity.A;
    }

    static List k(ProcessClearWhiteListActivity processclearwhitelistactivity)
    {
        return processclearwhitelistactivity.O;
    }

    static Handler l(ProcessClearWhiteListActivity processclearwhitelistactivity)
    {
        return processclearwhitelistactivity.L;
    }

    static List m(ProcessClearWhiteListActivity processclearwhitelistactivity)
    {
        return processclearwhitelistactivity.P;
    }

    static Map n(ProcessClearWhiteListActivity processclearwhitelistactivity)
    {
        return processclearwhitelistactivity.Q;
    }

    private void o()
    {
        K = getIntent().getIntExtra("white_list_type", 0);
    }

    private void p()
    {
        if (E)
        {
            B.setLocalText(o.a(0x7f0c0025));
            b(o.a(0x7f0c0024));
        } else
        {
            B.setLocalText(o.a(0x7f0c0022));
            b(o.a(0x7f0c0021));
            if (N != null)
            {
                return;
            }
        }
    }

    private void q()
    {
        Intent intent = getIntent();
        if (intent != null)
        {
            if (H)
            {
                intent.putExtra("has_changed", H);
            }
            setResult(-1, intent);
        }
    }

    private void r()
    {
        if (E)
        {
            E = false;
            b(o.a(0x7f0c0021));
            F.setLocalText(0x7f0c0023);
            Iterator iterator = O.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.qihoo.security.opti.a.c.a a1 = (com.qihoo.security.opti.a.c.a)iterator.next();
                if (a1.c)
                {
                    a1.c = false;
                }
            } while (true);
            z.notifyDataSetChanged();
            p();
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    public void finish()
    {
        q();
        super.finish();
    }

    protected void j()
    {
        super.j();
        if (r != null)
        {
            b(o.a(0x7f0c0021));
        }
    }

    protected void n()
    {
        r();
    }

    public void onBackPressed()
    {
        r();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03009d);
        o();
        C = findViewById(0x7f0b009b);
        C.setVisibility(0);
        A = (ListView)findViewById(0x7f0b0146);
        A.setOnItemClickListener(this);
        A.setEmptyView(findViewById(0x7f0b0094));
        B = (LocaleTextView)findViewById(0x7f0b0077);
        N = new ArrayList();
        O = new ArrayList();
        P = new ArrayList();
        Q = new HashMap();
        D = new c(p);
        D.a(M);
        D.a();
        z = new a(p, D.c());
        A.setAdapter(z);
        J = new g(p, 48, 48);
        F = (LocaleTextView)findViewById(0x7f0b00f6);
        com.qihoo360.mobilesafe.b.c.a(F, getResources().getColor(0x7f080056));
        F.setLocalText(0x7f0c0023);
        F.setOnClickListener(new android.view.View.OnClickListener() {

            final ProcessClearWhiteListActivity a;

            public void onClick(View view)
            {
                if (com.qihoo360.mobilesafe.b.f.a())
                {
                    return;
                }
                if (!ProcessClearWhiteListActivity.b(a))
                {
                    ProcessClearWhiteListActivity.a(a, 0);
                    ProcessClearWhiteListActivity.i(a).setLocalText(a.o.a(0x7f0c0026));
                    ProcessClearWhiteListActivity.b(a, true);
                    ProcessClearWhiteListActivity.e(a).notifyDataSetChanged();
                    ProcessClearWhiteListActivity.j(a).setSelection(0);
                    com.qihoo.security.ui.opti.sysclear.ProcessClearWhiteListActivity.f(a);
                    return;
                }
                if (ProcessClearWhiteListActivity.k(a).size() <= 0)
                {
                    ProcessClearWhiteListActivity.i(a).setLocalText(a.o.a(0x7f0c0023));
                    ProcessClearWhiteListActivity.b(a, false);
                    ProcessClearWhiteListActivity.e(a).notifyDataSetChanged();
                    ProcessClearWhiteListActivity.j(a).setSelection(0);
                    com.qihoo.security.ui.opti.sysclear.ProcessClearWhiteListActivity.f(a);
                    com.qihoo.security.ui.opti.sysclear.ProcessClearWhiteListActivity.c(a, false);
                    return;
                }
                view = ProcessClearWhiteListActivity.k(a).iterator();
                int i1;
                int j1;
                for (i1 = 0; view.hasNext(); i1 = j1)
                {
                    com.qihoo.security.opti.a.c.a a1 = (com.qihoo.security.opti.a.c.a)view.next();
                    j1 = i1;
                    if (a1.c)
                    {
                        j1 = i1 + 1;
                        ProcessClearWhiteListActivity.a(a).add(0, a1);
                        view.remove();
                        com.qihoo.security.ui.opti.sysclear.ProcessClearWhiteListActivity.d(a).a(a1.a, a1.c);
                    }
                }

                if (i1 > 0)
                {
                    if (ProcessClearWhiteListActivity.h(a) == 0)
                    {
                        com.qihoo.security.support.b.b(11025, i1);
                    } else
                    {
                        com.qihoo.security.support.b.b(11314, ProcessClearWhiteListActivity.a(a).size());
                    }
                    ProcessClearWhiteListActivity.a(a, a.o.a(0x7f0c00b9));
                    ProcessClearWhiteListActivity.i(a).setLocalText(a.o.a(0x7f0c0023));
                    ProcessClearWhiteListActivity.b(a, false);
                    com.qihoo360.mobilesafe.b.q.a().a(a.o.a(0x7f0c00ba, new Object[] {
                        Integer.valueOf(i1)
                    }));
                    com.qihoo.security.ui.opti.sysclear.ProcessClearWhiteListActivity.d(a).d();
                    ProcessClearWhiteListActivity.e(a).notifyDataSetChanged();
                    ProcessClearWhiteListActivity.j(a).setSelection(0);
                    com.qihoo.security.ui.opti.sysclear.ProcessClearWhiteListActivity.f(a);
                    com.qihoo.security.ui.opti.sysclear.ProcessClearWhiteListActivity.c(a, true);
                    return;
                } else
                {
                    com.qihoo360.mobilesafe.b.q.a().a(0x7f0c00bb);
                    return;
                }
            }

            
            {
                a = ProcessClearWhiteListActivity.this;
                super();
            }
        });
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (D != null)
        {
            D.b();
        }
        if (N != null)
        {
            N.clear();
            N = null;
        }
        if (O != null)
        {
            O.clear();
            O = null;
        }
        if (P != null)
        {
            P.clear();
            P = null;
        }
        if (Q != null)
        {
            Q.clear();
            Q = null;
        }
        if (J != null)
        {
            J.a();
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        if (E && i1 >= 0 && i1 < z.getCount())
        {
            adapterview = z.a(i1);
            if (!((com.qihoo.security.opti.a.c.a) (adapterview)).a.equals("com.qihoo.security.lite"))
            {
                boolean flag;
                if (!((com.qihoo.security.opti.a.c.a) (adapterview)).c)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                adapterview.c = flag;
                a(adapterview, (ImageView)view.findViewById(0x7f0b020f));
                return;
            }
        }
    }

    protected void onPause()
    {
        super.onPause();
        if (D != null)
        {
            D.d();
        }
    }

    public void onStop()
    {
        super.onStop();
    }

}
