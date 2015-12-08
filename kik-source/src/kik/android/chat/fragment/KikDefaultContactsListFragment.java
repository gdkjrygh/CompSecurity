// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.kik.android.a;
import com.kik.cache.ad;
import com.kik.g.p;
import com.kik.sdkutils.y;
import java.util.Map;
import kik.a.d.k;
import kik.a.e.r;
import kik.android.chat.KikApplication;
import kik.android.sdkutils.concurrent.d;
import kik.android.util.ck;
import org.c.b;
import org.c.c;

// Referenced classes of package kik.android.chat.fragment:
//            KikContactsListFragment, ks, kt, ku, 
//            kv, kw, kx, ky, 
//            kz, la, KikComposeFragment

public abstract class KikDefaultContactsListFragment extends KikContactsListFragment
{

    private static final b V = org.c.c.a("DefaultContactsList");
    protected boolean L;
    protected ck M;
    protected a N;
    protected ad O;
    private boolean U;
    private android.widget.AdapterView.OnItemClickListener W;
    private TextWatcher X;
    private android.view.View.OnClickListener Y;
    private android.view.View.OnClickListener Z;
    private boolean a;

    public KikDefaultContactsListFragment()
    {
        L = false;
        W = new ks(this);
        X = new kt(this);
        Y = new ku(this);
        Z = new kv(this);
    }

    private void Y()
    {
        if (b != null)
        {
            b = "";
            A = true;
            s.setText("");
        }
    }

    protected final String R()
    {
        if (c != null)
        {
            return c.getContext().getResources().getString(0x7f090014);
        } else
        {
            return "";
        }
    }

    protected final void S()
    {
        Y();
        a(b, true);
        s.requestFocus();
    }

    protected final String T()
    {
        return b;
    }

    public final p a(k k1, int i)
    {
        KikContactsListFragment.a a1 = new KikContactsListFragment.a();
        a1.a(getArguments());
        KikChatInfoFragment.a a2 = new KikChatInfoFragment.a();
        a2.a(k1).a("inline-username-search").b(i).a(a1.h());
        k1 = a(((kik.android.util.an) (a2)));
        Y();
        return k1;
    }

    protected void a(String s, boolean flag)
    {
        d(s);
        super.a(s, flag);
        c.invalidateViews();
        if (m != null)
        {
            View view = m;
            byte byte0;
            if (s == null || s.equals(""))
            {
                byte0 = 8;
            } else
            {
                byte0 = 0;
            }
            view.setVisibility(byte0);
        }
    }

    protected abstract void a(k k1);

    protected abstract void a_(String s, String s1);

    protected abstract void b(Bundle bundle);

    protected final void b(String s)
    {
        super.b(s);
        c.getAdapter();
        if (a)
        {
            a = false;
            a(this.s, 1);
            a(this.s);
        }
        if (U)
        {
            U = false;
            if (c.getCount() == 0 && s != null && s.length() > 0)
            {
                a(this.s, 1);
                a(this.s);
            }
        }
        if (s == null || !s.equals("") || l == null) goto _L2; else goto _L1
_L1:
        if (((Cursor)E.get(h())).getCount() == 0)
        {
            l.setVisibility(0);
        } else
        {
            l.setVisibility(8);
        }
_L4:
        z();
        return;
_L2:
        if (l != null)
        {
            l.setVisibility(8);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected abstract void b(k k1);

    protected final void c(k k1)
    {
        String s;
label0:
        {
            if (k1 != null)
            {
                s = k1.b();
                String s1 = k1.e();
                N.b("Premium Promoted Chat Click").a("Bots", new String[] {
                    s1
                }).a("Is Contact", k1.l()).b();
                if (!k1.m() && k1.p())
                {
                    break label0;
                }
                a(s);
            }
            return;
        }
        c(s);
    }

    protected abstract boolean d();

    protected abstract String f();

    protected String h()
    {
        if (c != null)
        {
            return c.getContext().getResources().getString(0x7f0900e8);
        } else
        {
            return "";
        }
    }

    protected boolean k()
    {
        return true;
    }

    protected Drawable l()
    {
        return null;
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        if (menuitem == null || menuitem.getGroupId() != 19582)
        {
            return false;
        }
        if (menuitem.getItemId() == 19583)
        {
            menuitem = (android.widget.AdapterView.AdapterContextMenuInfo)menuitem.getMenuInfo();
            menuitem = (Cursor)c.getItemAtPosition(((android.widget.AdapterView.AdapterContextMenuInfo) (menuitem)).position);
            if (menuitem != null)
            {
                menuitem = menuitem.getString(menuitem.getColumnIndex("suggest_intent_data_id"));
                b(H.a(menuitem, true));
                return true;
            }
        }
        return false;
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
        b(getArguments());
        if (L)
        {
            viewgroup = layoutinflater.inflate(0x7f030044, viewgroup, false);
        } else
        if (this instanceof KikComposeFragment)
        {
            viewgroup = layoutinflater.inflate(0x7f030009, viewgroup, false);
            M.a(kik.android.util.ck.b.a);
        } else
        {
            viewgroup = layoutinflater.inflate(0x7f030008, viewgroup, false);
        }
        a = true;
        m = viewgroup.findViewById(0x7f0e0075);
        if (m != null)
        {
            m.setOnClickListener(new kw(this));
        }
        e = (LinearLayout)viewgroup.findViewById(0x7f0e003e);
        p = (TextView)viewgroup.findViewById(0x7f0e003f);
        e.setVisibility(8);
        c = (ListView)viewgroup.findViewById(0x7f0e003d);
        if (!y.b(9))
        {
            c.setOverscrollFooter(null);
        }
        c.setOnItemClickListener(W);
        g = layoutinflater.inflate(0x7f030078, c, false);
        o = (AnimationDrawable)((ImageView)g.findViewById(0x7f0e018c)).getDrawable();
        o.start();
        h = layoutinflater.inflate(0x7f03006e, c, false);
        h.setOnClickListener(Z);
        i = layoutinflater.inflate(0x7f030075, c, false);
        j = layoutinflater.inflate(0x7f030076, c, false);
        q = (TextView)i.findViewById(0x7f0e0188);
        r = (TextView)j.findViewById(0x7f0e0189);
        l = viewgroup.findViewById(0x7f0e0041);
        k = layoutinflater.inflate(0x7f03007a, c, false);
        k.setOnClickListener(Y);
        n = (TextView)layoutinflater.inflate(0x7f03007c, c, false);
        n.setText(KikApplication.f(0x7f0900e9));
        t();
        t = new LinearLayout(getActivity());
        t.setOrientation(1);
        t.addView(n);
        t.addView(h);
        t.addView(i);
        t.addView(j);
        t.addView(k);
        t.addView(g);
        c.addFooterView(t, null, true);
        x = new kik.android.sdkutils.concurrent.c("", H);
        y = new d("", G);
        s = (EditText)viewgroup.findViewById(0x7f0e0074);
        s.setImeOptions(6);
        s.addTextChangedListener(X);
        s.setOnEditorActionListener(new kx(this));
        if (s != null)
        {
            com.kik.m.d.a(s, "AUTOMATION_TITLE_KIK_USERNAME");
        }
        c.setOnScrollListener(new ky(this));
        layoutinflater = (ImageView)viewgroup.findViewById(0x7f0e01d7);
        bundle = (ViewGroup)viewgroup.findViewById(0x7f0e012f);
        if (layoutinflater != null && bundle != null)
        {
            if (d())
            {
                if (l() != null)
                {
                    layoutinflater.setImageDrawable(l());
                }
                bundle.setOnClickListener(new kz(this));
            } else
            {
                bundle.setVisibility(8);
            }
            com.kik.m.d.a(bundle, "AUTOMATION_EXPLICIT_SEARCH");
        }
        if (b != null && b.length() > 0)
        {
            s.setText(b);
        }
        if (f() != null)
        {
            c.setOnCreateContextMenuListener(new la(this));
        }
        return viewgroup;
    }

    public void onResume()
    {
        super.onResume();
        U = true;
        if (s != null)
        {
            d(s.getText().toString().trim());
            s.requestFocus();
        }
    }

    protected final boolean u()
    {
        return true;
    }

}
