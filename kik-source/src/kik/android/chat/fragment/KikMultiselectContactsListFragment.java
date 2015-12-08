// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Point;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.HeaderViewListAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.WrapperListAdapter;
import com.kik.cache.ad;
import com.kik.e.a;
import com.kik.g.f;
import com.kik.g.p;
import com.kik.view.adapters.MultiselectContactsCursorAdapter;
import java.util.LinkedHashSet;
import kik.a.d.k;
import kik.a.e.r;
import kik.android.chat.KikApplication;
import kik.android.sdkutils.concurrent.c;
import kik.android.util.cq;
import kik.android.util.cu;
import kik.android.widget.KikContactImageThumbNailList;
import kik.android.widget.ResizeEventList;

// Referenced classes of package kik.android.chat.fragment:
//            KikContactsListFragment, ml, mw, mx, 
//            ms, mr, mp, mo, 
//            mn, mv, mq, mt, 
//            mu, my, mz, na, 
//            nb, nc, nd, mm

public abstract class KikMultiselectContactsListFragment extends KikContactsListFragment
    implements cu
{

    private static final int N = KikApplication.a(150);
    protected com.kik.android.a L;
    public boolean M;
    private int O;
    private TextView U;
    private View V;
    private KikContactImageThumbNailList W;
    private View X;
    private View Y;
    private ImageView Z;
    protected ad a;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private boolean ad;
    private int ae;
    private int af;
    private boolean ag;
    private f ah;
    private android.widget.AdapterView.OnItemClickListener ai;
    private android.view.View.OnClickListener aj;
    private android.view.View.OnClickListener ak;

    public KikMultiselectContactsListFragment()
    {
        O = KikApplication.a(56);
        aa = true;
        ab = true;
        ad = true;
        ag = true;
        ah = new f();
        M = false;
        ai = new ml(this);
        aj = new mw(this);
        ak = new mx(this);
    }

    static void a(KikMultiselectContactsListFragment kikmultiselectcontactslistfragment, Bundle bundle)
    {
        Object obj;
label0:
        {
            bundle = bundle.getString("chatContactJID");
            obj = kikmultiselectcontactslistfragment.H.a(bundle, false);
            kikmultiselectcontactslistfragment.C.add(bundle);
            kikmultiselectcontactslistfragment.a(((k) (obj)));
            obj = (ImageView)kikmultiselectcontactslistfragment.h.findViewById(0x7f0e016c);
            if (obj != null)
            {
                if (!kikmultiselectcontactslistfragment.b())
                {
                    break label0;
                }
                ((ImageView) (obj)).setVisibility(0);
                int i;
                if (kikmultiselectcontactslistfragment.C.contains(bundle))
                {
                    i = kikmultiselectcontactslistfragment.af;
                } else
                {
                    i = kikmultiselectcontactslistfragment.ae;
                }
                ((ImageView) (obj)).setBackgroundResource(i);
            }
            return;
        }
        ((ImageView) (obj)).setVisibility(8);
    }

    static boolean a(KikMultiselectContactsListFragment kikmultiselectcontactslistfragment)
    {
        return kikmultiselectcontactslistfragment.ab;
    }

    static boolean b(KikMultiselectContactsListFragment kikmultiselectcontactslistfragment)
    {
        kikmultiselectcontactslistfragment.ab = false;
        return false;
    }

    static View c(KikMultiselectContactsListFragment kikmultiselectcontactslistfragment)
    {
        return kikmultiselectcontactslistfragment.X;
    }

    static View d(KikMultiselectContactsListFragment kikmultiselectcontactslistfragment)
    {
        return kikmultiselectcontactslistfragment.Y;
    }

    static KikContactImageThumbNailList e(KikMultiselectContactsListFragment kikmultiselectcontactslistfragment)
    {
        return kikmultiselectcontactslistfragment.W;
    }

    protected boolean S()
    {
        return true;
    }

    protected int T()
    {
        return 0;
    }

    protected abstract void Y();

    protected abstract String Z();

    protected String a()
    {
        return KikApplication.f(0x7f090269);
    }

    public final void a(int i, int j)
    {
        boolean flag = true;
        if (V.getResources().getConfiguration().orientation == 2)
        {
            b(true);
        } else
        if (Math.abs(j - i) >= O)
        {
            if (i <= N)
            {
                flag = false;
            }
            ag = flag;
            b(ag);
            return;
        }
    }

    protected void a(String s, k k1)
    {
        W.post(new ms(this, s, k1));
    }

    protected final void a(String s, boolean flag)
    {
        b = s.trim();
        super.a(s, flag);
        c.invalidateViews();
        if (m != null)
        {
            View view = m;
            byte byte0;
            if (cq.c(s))
            {
                byte0 = 8;
            } else
            {
                byte0 = 0;
            }
            view.setVisibility(byte0);
        }
    }

    protected void a(k k1)
    {
        W.post(new mr(this, k1));
    }

    protected void a(k k1, com.kik.view.adapters.ContactsCursorAdapter.a a1, Cursor cursor, int i)
    {
        com.kik.view.adapters.k k2;
        Object obj;
        if (k1.m())
        {
            a1 = new KikChatInfoFragment.a();
            a1.a(k1).b(1);
            a(((kik.android.util.an) (a1))).a(new mp(this));
            return;
        }
        if (!C.remove(k1.b()))
        {
            C.add(k1.b());
            a(k1);
        } else
        {
            d(k1);
        }
        obj = (HeaderViewListAdapter)c.getAdapter();
        k2 = (com.kik.view.adapters.k)((HeaderViewListAdapter) (obj)).getWrappedAdapter();
        obj = (MultiselectContactsCursorAdapter)k2.a(i - ((HeaderViewListAdapter) (obj)).getHeadersCount());
        if (a1 == null || cursor == null) goto _L2; else goto _L1
_L1:
        ((MultiselectContactsCursorAdapter) (obj)).a(a1, cursor);
_L4:
        c.invalidateViews();
        return;
_L2:
        if (obj != null)
        {
            ((MultiselectContactsCursorAdapter)k2.a(i)).a(k1.b(), C.contains(k1.b()));
        } else
        {
            a1 = (k)h.getTag();
            if (a1 == k1)
            {
                k1 = (ImageView)h.findViewById(0x7f0e016c);
                if (k1 != null)
                {
                    if (C.contains(a1.a()))
                    {
                        i = af;
                    } else
                    {
                        i = ae;
                    }
                    k1.setBackgroundResource(i);
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean a(Cursor cursor)
    {
        cursor = cursor.getString(cursor.getColumnIndex("suggest_intent_data_id"));
        return C.contains(cursor);
    }

    protected abstract String aa();

    protected abstract void b(Bundle bundle);

    protected final void b(String s)
    {
        super.b(s);
        com.kik.view.adapters.k k1 = (com.kik.view.adapters.k)((WrapperListAdapter)c.getAdapter()).getWrappedAdapter();
        int i;
        if (k1 != null)
        {
            i = k1.a();
        } else
        {
            i = 0;
        }
        if (aa)
        {
            aa = false;
            if ((c.getCount() != 0 || i != 0) && !g() && i >= 10)
            {
                c.postDelayed(new mo(this), 100L);
            }
        }
        if (ac)
        {
            ac = false;
            if (c.getCount() == 0 && s != null && s.length() > 0)
            {
                a(this.s, 1);
                a(this.s);
            }
        }
        z();
    }

    protected void b(k k1)
    {
    }

    protected final void b(boolean flag)
    {
        if (X != null)
        {
            float f1;
            Display display;
            Point point;
            int i;
            if (flag && ad && ag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            display = getActivity().getWindowManager().getDefaultDisplay();
            point = new Point();
            display.getSize(point);
            i = point.y;
            if (flag)
            {
                getResources().getDimension(0x7f0d0023);
            }
            if (flag)
            {
                f1 = 0.0F;
            } else
            {
                f1 = getResources().getDimension(0x7f0d0023);
            }
            X.animate().cancel();
            X.setTranslationY(f1);
            X.animate().translationY(f1).setDuration(10L).setListener(new mn(this, flag)).start();
        }
    }

    public boolean b()
    {
        return true;
    }

    protected void c(k k1)
    {
    }

    protected final void c(boolean flag)
    {
        ad = flag;
    }

    protected final LinkedHashSet d()
    {
        return C;
    }

    protected void d(k k1)
    {
        W.post(new mv(this, k1));
    }

    protected final void d(boolean flag)
    {
        if (V != null)
        {
            V.setEnabled(flag);
        }
    }

    protected final void e()
    {
        super.e();
        KikAddContactFragment.b b1 = new KikAddContactFragment.b();
        b1.b(5).a(b).a(F.h());
        if (j())
        {
            b1.a(z);
        }
        a(b1).a(new mq(this));
    }

    protected void e(String s)
    {
        f(s);
    }

    protected abstract void e(k k1);

    protected final void f()
    {
        if (Z() != null)
        {
            U.setText(Z());
        }
    }

    protected void f(String s)
    {
        W.post(new mt(this, s));
    }

    protected void g(String s)
    {
        W.post(new mu(this, s));
    }

    protected String h()
    {
        return getResources().getString(0x7f0900e8);
    }

    protected final boolean k()
    {
        return true;
    }

    protected void l()
    {
        if (b != null)
        {
            b = "";
            A = true;
            s.setText("");
            a(b, true);
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 1559 && j == -1 && intent.hasExtra("SimpleFragmentWrapperActivity.EXTRA_FRAGMENT_RESULT"))
        {
            intent = intent.getBundleExtra("SimpleFragmentWrapperActivity.EXTRA_FRAGMENT_RESULT").getString("chatContactJID");
            Object obj = H.a(intent, false);
            C.add(intent);
            a(((k) (obj)));
            obj = (ImageView)h.findViewById(0x7f0e016c);
            if (obj != null)
            {
                if (b())
                {
                    ((ImageView) (obj)).setVisibility(0);
                    if (C.contains(intent))
                    {
                        i = af;
                    } else
                    {
                        i = ae;
                    }
                    ((ImageView) (obj)).setBackgroundResource(i);
                } else
                {
                    ((ImageView) (obj)).setVisibility(8);
                }
            }
        }
        l();
        c.invalidateViews();
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        menuitem = (android.widget.AdapterView.AdapterContextMenuInfo)menuitem.getMenuInfo();
        menuitem = (Cursor)c.getItemAtPosition(((android.widget.AdapterView.AdapterContextMenuInfo) (menuitem)).position);
        menuitem = menuitem.getString(menuitem.getColumnIndex("suggest_intent_data_id"));
        e(H.a(menuitem, true));
        return true;
    }

    public void onCreate(Bundle bundle)
    {
        V().a(this);
        super.onCreate(bundle);
        getActivity().setDefaultKeyMode(3);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        viewgroup = layoutinflater.inflate(0x7f030011, viewgroup, false);
        U = (TextView)viewgroup.findViewById(0x7f0e0078);
        f();
        X = viewgroup.findViewById(0x7f0e005e);
        Y = viewgroup.findViewById(0x7f0e0061);
        W = (KikContactImageThumbNailList)viewgroup.findViewById(0x7f0e0134);
        W.a(a);
        W.a(L);
        V = viewgroup.findViewById(0x7f0e005a);
        if (!S())
        {
            V.setVisibility(8);
        }
        ah.a(W.a(), new my(this));
        ah.a(W.b(), new mz(this));
        O = KikApplication.a((int)X.getResources().getDimension(0x7f0d0023));
        ae = 0x7f020163;
        af = 0x7f020161;
        e = (LinearLayout)viewgroup.findViewById(0x7f0e003e);
        p = (TextView)viewgroup.findViewById(0x7f0e003f);
        c = (ListView)viewgroup.findViewById(0x7f0e003d);
        if (c instanceof ResizeEventList)
        {
            ((ResizeEventList)c).a(this);
        }
        c.setOnItemClickListener(ai);
        g = layoutinflater.inflate(0x7f030078, c, false);
        o = (AnimationDrawable)((ImageView)g.findViewById(0x7f0e018c)).getDrawable();
        o.start();
        h = layoutinflater.inflate(0x7f03006f, c, false);
        h.setOnClickListener(ak);
        this.i = layoutinflater.inflate(0x7f030075, c, false);
        j = layoutinflater.inflate(0x7f030076, c, false);
        q = (TextView)this.i.findViewById(0x7f0e0188);
        r = (TextView)j.findViewById(0x7f0e0189);
        k = layoutinflater.inflate(0x7f03007a, c, false);
        k.setOnClickListener(aj);
        n = (TextView)layoutinflater.inflate(0x7f03007c, c, false);
        n.setText(getResources().getString(0x7f0900e9));
        t();
        t = new LinearLayout(getActivity());
        t.setOrientation(1);
        t.addView(n);
        t.addView(h);
        t.addView(this.i);
        t.addView(j);
        t.addView(k);
        t.addView(g);
        c.addFooterView(t, null, true);
        x = new c("", H);
        c.setChoiceMode(2);
        c.addHeaderView(layoutinflater.inflate(0x7f03002e, c, false));
        s = (EditText)viewgroup.findViewById(0x7f0e0074);
        s.setImeOptions(6);
        s.addTextChangedListener(new na(this));
        s.setOnEditorActionListener(new nb(this));
        Z = (ImageView)viewgroup.findViewById(0x7f0e0073);
        int i = T();
        if (i != 0)
        {
            Z.setBackgroundResource(i);
            Z.setVisibility(0);
        } else
        {
            Z.setVisibility(8);
        }
        c.setOnScrollListener(new nc(this));
        if (b != null)
        {
            s.setText(b);
        }
        if (aa() != null)
        {
            c.setOnCreateContextMenuListener(new nd(this));
        }
        V.setOnClickListener(new mm(this));
        b(getArguments());
        return viewgroup;
    }

    public void onResume()
    {
        super.onResume();
        ac = true;
        a(s, 1);
        a(s);
    }

    protected final boolean u()
    {
        return true;
    }

    protected final boolean x()
    {
        return true;
    }

}
