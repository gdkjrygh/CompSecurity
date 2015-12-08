// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.ao;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.ab;
import com.roidapp.cloudlib.sns.af;
import com.roidapp.cloudlib.sns.b.a;
import com.roidapp.cloudlib.sns.b.n;
import com.roidapp.cloudlib.sns.b.o;
import com.roidapp.cloudlib.sns.b.p;
import com.roidapp.cloudlib.sns.i;
import com.roidapp.cloudlib.sns.main.b;
import com.roidapp.cloudlib.sns.modifiedrefresh.SwipeRefreshLayout2;
import com.roidapp.cloudlib.sns.q;
import com.roidapp.cloudlib.upload.x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            ah, ag, aj, au, 
//            aq, ai, w, aw, 
//            af, az, ba, ar, 
//            ae, ak, al, am, 
//            an, ao, ap

public final class ad extends b
    implements android.view.View.OnClickListener, android.widget.AbsListView.OnScrollListener
{

    private FrameLayout A;
    private au B;
    private au C;
    private boolean D;
    private boolean E;
    private List a;
    private ListView b;
    private w c;
    private EditText d;
    private ImageView e;
    private n f;
    private String g;
    private long h;
    private boolean i;
    private com.roidapp.cloudlib.sns.b.x j;
    private p k;
    private boolean l;
    private boolean m;
    private com.roidapp.cloudlib.sns.o n;
    private com.roidapp.cloudlib.sns.o o;
    private boolean p;
    private SwipeRefreshLayout2 q;
    private View r;
    private HashSet v;
    private ArrayList w;
    private ProgressBar x;
    private int y;
    private x z;

    public ad()
    {
    }

    static boolean A(ad ad1)
    {
        return ad1.z();
    }

    static boolean B(ad ad1)
    {
        return ad1.z();
    }

    static boolean C(ad ad1)
    {
        ad1.i = false;
        return false;
    }

    static boolean D(ad ad1)
    {
        return ad1.z();
    }

    static boolean E(ad ad1)
    {
        return ad1.z();
    }

    static ListView F(ad ad1)
    {
        return ad1.b;
    }

    static com.roidapp.cloudlib.sns.o G(ad ad1)
    {
        ad1.n = null;
        return null;
    }

    static boolean H(ad ad1)
    {
        return ad1.z();
    }

    static boolean I(ad ad1)
    {
        return ad1.z();
    }

    static com.roidapp.cloudlib.sns.o J(ad ad1)
    {
        ad1.o = null;
        return null;
    }

    static boolean K(ad ad1)
    {
        return ad1.z();
    }

    static au a(ad ad1, au au1)
    {
        ad1.B = au1;
        return au1;
    }

    static List a(ad ad1)
    {
        return ad1.a;
    }

    private void a(long l1, String s1)
    {
        a(com.roidapp.cloudlib.sns.q.a(g, h, f.a.a, s1, new ah(this, l1)));
    }

    static void a(ad ad1, int i1)
    {
        if (ad1.getUserVisibleHint() && ad1.getActivity() != null)
        {
            ad1.v().a(ad1.getActivity().getString(i1));
        }
    }

    static void a(ad ad1, long l1)
    {
        ad1.E = true;
        ad1.q.setEnabled(false);
        ad1.x.setVisibility(0);
        ad1.x.bringToFront();
        com.roidapp.cloudlib.sns.q.a(ad1.g, ad1.h, ad1.f.a.a, l1, new ag(ad1, l1)).a(ad1);
    }

    static void a(ad ad1, long l1, String s1)
    {
        ad1.a(l1, s1);
    }

    static void a(ad ad1, View view, a a1)
    {
        if (!ad1.E)
        {
            if (ad1.v == null)
            {
                ad1.v = new HashSet();
                ad1.v.add(Long.valueOf(a1.a));
                ad1.w = new ArrayList();
                ad1.w.add(a1);
                view.setBackgroundColor(ad1.y);
            } else
            if (ad1.v.add(Long.valueOf(a1.a)))
            {
                ad1.w.add(a1);
                view.setBackgroundColor(ad1.y);
            } else
            {
                ad1.v.remove(Long.valueOf(a1.a));
                ad1.w.remove(a1);
                view.setBackgroundColor(-1);
            }
            ad1.d();
        }
    }

    static void a(ad ad1, a a1)
    {
        if (ad1.i)
        {
            if (ad1.q.b())
            {
                ad1.q.a(false);
            }
            return;
        } else
        {
            ad1.i = true;
            ad1.o = com.roidapp.cloudlib.sns.q.a(ad1.g, ad1.h, ad1.f.a.a, a1.a, a1.b, new aj(ad1));
            ad1.a(ad1.o);
            return;
        }
    }

    static void a(ad ad1, String s1, int i1, int j1)
    {
        if (ad1.z == null)
        {
            ad1.B = new au(ad1, s1, i1, j1);
            ad1.C = null;
            ad1.A.bringToFront();
            ad1.z = new x();
            ad1.z.a();
            ad1.z.a(new aq(ad1));
            ad1.D = true;
            ad1.z.b(s1);
            ad1.getChildFragmentManager().beginTransaction().add(ar.S, ad1.z).commit();
        } else
        {
            ad1.C = new au(ad1, s1, i1, j1);
            if (!ad1.D)
            {
                ad1.D = true;
                ad1.B = ad1.C;
                ad1.z.a(s1);
                return;
            }
        }
    }

    private void a(com.roidapp.cloudlib.sns.o o1)
    {
        l = true;
        o1.a(this);
    }

    static boolean a(ad ad1, boolean flag)
    {
        ad1.D = flag;
        return flag;
    }

    static n b(ad ad1)
    {
        return ad1.f;
    }

    static SwipeRefreshLayout2 c(ad ad1)
    {
        return ad1.q;
    }

    private void d()
    {
        TextView textview;
        TextView textview1;
        TextView textview2;
        if (r == null)
        {
            r = LayoutInflater.from(getActivity()).inflate(as.s, null);
            a(r, this);
        }
        TextView textview3 = (TextView)r.findViewById(ar.Y);
        TextView textview4 = (TextView)r.findViewById(ar.Z);
        textview = (TextView)r.findViewById(ar.aa);
        textview1 = (TextView)r.findViewById(ar.ab);
        textview2 = (TextView)r.findViewById(ar.X);
        textview3.setOnClickListener(this);
        textview.setOnClickListener(this);
        textview1.setOnClickListener(this);
        textview2.setOnClickListener(this);
        int i1 = v.size();
        if (i1 == 0)
        {
            f();
            return;
        }
        textview4.setText(String.valueOf(i1));
        if (i1 == 1)
        {
            a a1 = (a)w.get(0);
            if (a1.d.a == j.a)
            {
                if (a1.e != 0 && a1.e == com.roidapp.cloudlib.sns.b.b.a)
                {
                    textview.setVisibility(0);
                } else
                {
                    textview.setVisibility(8);
                }
                textview1.setVisibility(8);
            } else
            {
                textview1.setVisibility(0);
                textview1.setTag(a1);
                if (f.b.a == j.a)
                {
                    textview.setVisibility(0);
                } else
                {
                    textview.setVisibility(8);
                }
            }
            textview2.setVisibility(0);
            return;
        }
        if (f.b.a != j.a) goto _L2; else goto _L1
_L1:
        Iterator iterator = w.iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        if (((a)iterator.next()).e == com.roidapp.cloudlib.sns.b.b.a) goto _L6; else goto _L5
_L5:
        int j1 = 0;
_L8:
        Iterator iterator1;
        a a2;
        if (j1 != 0)
        {
            j1 = 0;
        } else
        {
            j1 = 8;
        }
        textview.setVisibility(j1);
        textview1.setVisibility(8);
        textview2.setVisibility(0);
        return;
_L4:
        j1 = 1;
        continue; /* Loop/switch isn't completed */
_L2:
        for (iterator1 = w.iterator(); iterator1.hasNext();)
        {
            a2 = (a)iterator1.next();
            if (a2.d.a != j.a || a2.e != com.roidapp.cloudlib.sns.b.b.a)
            {
                j1 = 0;
                continue; /* Loop/switch isn't completed */
            }
        }

        j1 = 1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static void d(ad ad1)
    {
        if (ad1.i)
        {
            if (ad1.q.c())
            {
                ad1.q.a();
            }
        } else
        {
            ad1.i = true;
            if (ad1.z())
            {
                ad1.n = com.roidapp.cloudlib.sns.q.d(ad1.g, ad1.h, ad1.f.a.a, new ai(ad1));
                ad1.n.l();
                ad1.a(ad1.n);
                return;
            }
        }
    }

    static void e(ad ad1)
    {
        ad1.g();
    }

    static View f(ad ad1)
    {
        return ad1.r;
    }

    private void f()
    {
        a(a(getActivity()), this);
        r = null;
        boolean flag;
        if (v.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        v.clear();
        w.clear();
        if (flag && c != null)
        {
            c.notifyDataSetChanged();
        }
    }

    private void g()
    {
        InputMethodManager inputmethodmanager = (InputMethodManager)getActivity().getSystemService("input_method");
        if (inputmethodmanager != null)
        {
            inputmethodmanager.hideSoftInputFromWindow(d.getWindowToken(), 0);
        }
    }

    static void g(ad ad1)
    {
        ad1.f();
    }

    static com.roidapp.cloudlib.sns.b.x h(ad ad1)
    {
        return ad1.j;
    }

    private void h()
    {
        if (z != null)
        {
            getChildFragmentManager().beginTransaction().remove(z).commit();
            z = null;
        }
        D = false;
    }

    static HashSet i(ad ad1)
    {
        return ad1.v;
    }

    private void i()
    {
        Editable editable = d.getEditableText();
        Object obj = Pattern.compile("@\\w+").matcher(editable.toString());
        HashSet hashset = new HashSet();
        for (; ((Matcher) (obj)).find(); hashset.add(((Matcher) (obj)).group().substring(1))) { }
        obj = new StringBuilder();
        HashSet hashset1 = new HashSet();
        Iterator iterator = w.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = ((a)iterator.next()).d.b;
            if (hashset1.add(s1) && !hashset.contains(s1))
            {
                ((StringBuilder) (obj)).append((new StringBuilder("@")).append(s1).append(" ").toString());
            }
        } while (true);
        hashset1.clear();
        int i1 = d.getSelectionStart();
        if (i1 < 0 || i1 >= editable.length())
        {
            editable.append(((StringBuilder) (obj)).toString());
        } else
        {
            editable.insert(i1, ((StringBuilder) (obj)).toString());
        }
        f();
    }

    static ArrayList j(ad ad1)
    {
        return ad1.w;
    }

    private void j()
    {
        String s1 = d.getText().toString();
        if (TextUtils.isEmpty(s1.trim()))
        {
            return;
        } else
        {
            d.setText(null);
            a a1 = new a();
            a1.d = j;
            a1.c = s1;
            a1.e = com.roidapp.cloudlib.sns.b.b.b;
            long l1 = System.currentTimeMillis();
            a1.b = l1;
            a1.a = l1;
            c.a(a1);
            c.notifyDataSetChanged();
            b.setSelection(c.getCount() - 1);
            getActivity();
            com.roidapp.baselib.c.b.a("SNS", "click", "SNS/Comment/Send/Click");
            al.g().a(getActivity(), "SNS", "click", "SNS/Comment/Send/Click", Long.valueOf(1L));
            a(l1, s1);
            return;
        }
    }

    static void k(ad ad1)
    {
        ad1.d();
    }

    static w l(ad ad1)
    {
        return ad1.c;
    }

    static ImageView m(ad ad1)
    {
        return ad1.e;
    }

    static EditText n(ad ad1)
    {
        return ad1.d;
    }

    static x o(ad ad1)
    {
        return ad1.z;
    }

    static void p(ad ad1)
    {
        ad1.h();
    }

    static void q(ad ad1)
    {
        ad1.j();
    }

    static au r(ad ad1)
    {
        return ad1.C;
    }

    static au s(ad ad1)
    {
        return ad1.B;
    }

    static ProgressBar t(ad ad1)
    {
        return ad1.x;
    }

    static String u(ad ad1)
    {
        return ad1.g;
    }

    static long v(ad ad1)
    {
        return ad1.h;
    }

    static boolean w(ad ad1)
    {
        return ad1.z();
    }

    static boolean x(ad ad1)
    {
        return ad1.z();
    }

    static boolean y(ad ad1)
    {
        return ad1.z();
    }

    static boolean z(ad ad1)
    {
        ad1.E = false;
        return false;
    }

    public final View a(Context context)
    {
        ab ab1 = new ab(context);
        ab1.a(context.getString(at.q));
        ab1.a(u);
        return ab1;
    }

    public final void a(String s1, long l1, boolean flag, n n1)
    {
        g = s1;
        h = l1;
        p = flag;
        f = n1;
        a = new ArrayList();
        if (n1.c != null)
        {
            a.addAll(n1.c);
        }
    }

    public final boolean h_()
    {
        if (z())
        {
            g();
        }
        if (z != null)
        {
            h();
            return true;
        }
        if (r != null)
        {
            f();
            return true;
        } else
        {
            getActivity().getWindow().setSoftInputMode(34);
            return super.h_();
        }
    }

    public final void onClick(View view)
    {
        int i1 = view.getId();
        if (i1 != ar.W) goto _L2; else goto _L1
_L1:
        j();
_L4:
        return;
_L2:
        if (i1 == ar.V)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (i1 != ar.Y)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!E)
        {
            f();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (i1 != ar.aa)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!E)
        {
            long l1 = ((a)w.get(0)).a;
            Object obj = getActivity().getResources();
            i1 = w.size();
            String s1 = ((Resources) (obj)).getString(at.ap);
            String s2;
            aw aw1;
            android.app.AlertDialog.Builder builder;
            if (i1 == 1)
            {
                view = ((Resources) (obj)).getString(at.m);
            } else
            {
                view = ((Resources) (obj)).getString(at.n, new Object[] {
                    Integer.valueOf(i1)
                });
            }
            s2 = ((Resources) (obj)).getString(at.v);
            obj = ((Resources) (obj)).getString(at.j);
            aw1 = new aw(new com.roidapp.cloudlib.sns.basepost.af(this, l1));
            builder = (new android.app.AlertDialog.Builder(getActivity())).setCancelable(true);
            if (s1 != null)
            {
                builder.setTitle(s1);
            }
            if (view != null)
            {
                builder.setMessage(view);
            }
            if (s2 != null)
            {
                builder.setPositiveButton(s2, new az(aw1));
            }
            if (obj != null)
            {
                builder.setNegativeButton(((CharSequence) (obj)), new ba(aw1));
            }
            view = builder.create();
            view.setCanceledOnTouchOutside(true);
            view.show();
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (i1 != ar.ab)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (E) goto _L4; else goto _L6
_L6:
        view = (a)view.getTag();
        (new aw(new com.roidapp.cloudlib.sns.basepost.ar(this, ((a) (view)).a, ((a) (view)).c))).a(getActivity(), at.aA, at.az, at.ap, at.j);
        return;
        if (i1 != ar.X || E) goto _L4; else goto _L7
_L7:
        i();
        return;
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (af.a(getActivity()))
        {
            k = com.roidapp.cloudlib.sns.b.q.a(getActivity()).c();
            j = k.b;
        }
        y = getResources().getColor(ao.d);
        m = true;
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(as.q, viewgroup, false);
        x = (ProgressBar)layoutinflater.findViewById(ar.T);
        q = (SwipeRefreshLayout2)layoutinflater.findViewById(ar.U);
        A = (FrameLayout)layoutinflater.findViewById(ar.S);
        a(q, true, true);
        q.a(new ae(this));
        q.a(new ak(this));
        b = (ListView)layoutinflater.findViewById(ar.R);
        b.setTranscriptMode(1);
        b.setStackFromBottom(true);
        com.roidapp.cloudlib.sns.a.a.a(b, s.b(), false, Integer.valueOf(hashCode()), this);
        d = (EditText)layoutinflater.findViewById(ar.V);
        e = (ImageView)layoutinflater.findViewById(ar.W);
        e.setOnClickListener(this);
        if (c == null || b.getAdapter() == null)
        {
            c = new w(this, a, new com.roidapp.cloudlib.sns.basepost.al(this));
            b.setAdapter(c);
            b.setSelection(c.getCount() - 1);
        }
        b.setOnItemClickListener(new am(this));
        b.setOnItemLongClickListener(new an(this));
        if (m)
        {
            m = false;
        }
        d.addTextChangedListener(new com.roidapp.cloudlib.sns.basepost.ao(this));
        d.setOnEditorActionListener(new ap(this));
        return layoutinflater;
    }

    public final void onDestroy()
    {
        super.onDestroy();
    }

    public final void onResume()
    {
        super.onResume();
        getActivity().getWindow().setSoftInputMode(16);
        d.clearFocus();
        if (p)
        {
            p = false;
            d.setFocusable(true);
            d.requestFocus();
            InputMethodManager inputmethodmanager = (InputMethodManager)getActivity().getSystemService("input_method");
            if (inputmethodmanager != null)
            {
                inputmethodmanager.showSoftInput(d, 1);
            }
        }
    }

    public final void onScroll(AbsListView abslistview, int i1, int j1, int k1)
    {
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i1)
    {
    }
}
