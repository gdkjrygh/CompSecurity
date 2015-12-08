// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cj;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.pandora.android.activity.a;
import com.pandora.android.util.p;
import com.pandora.android.util.s;
import com.pandora.radio.data.h;
import com.pandora.radio.data.i;
import com.pandora.radio.data.y;
import p.bz.n;
import p.ci.b;
import p.dd.au;
import p.dd.bb;
import p.dd.bc;
import p.dd.bd;
import p.di.j;

// Referenced classes of package p.cj:
//            a, c

public class d extends p.cj.a
    implements android.widget.AdapterView.OnItemClickListener
{

    private String b;
    private y c;
    private b d;
    private ListView e;
    private View f;
    private View g;
    private boolean h;

    public d()
    {
    }

    static ListView a(d d1)
    {
        return d1.e;
    }

    public static d a(y y1, boolean flag)
    {
        d d1 = new d();
        Bundle bundle = new Bundle();
        bundle.putBoolean("intent_jump_to_thumbs_down", flag);
        bundle.putSerializable("intent_station_data", y1);
        d1.setArguments(bundle);
        return d1;
    }

    private void a()
    {
        g.setVisibility(8);
        e();
    }

    private void b()
    {
        h ah[] = c.C().a;
        if (h && ah.length > 0)
        {
            h ah1[] = c.C().b;
            e.setSelection(ah1.length + 1);
            return;
        } else
        {
            e.setSelection(0);
            return;
        }
    }

    static void b(d d1)
    {
        d1.b();
    }

    private void e()
    {
        boolean flag = false;
        if (c.C().a())
        {
            i k = c.C();
            e.setVisibility(0);
            f.setVisibility(8);
            if (d.getCount() == 0)
            {
                flag = true;
            }
            d.a(k);
            if (flag)
            {
                e.post(new Runnable() {

                    final d a;

                    public void run()
                    {
                        Object obj = a.getResources();
                        int l = p.cj.d.a(a).getMeasuredHeight();
                        int i1 = ((Resources) (obj)).getDimensionPixelOffset(0x7f090144);
                        int j1 = ((Resources) (obj)).getDimensionPixelOffset(0x7f090100);
                        obj = new LinearLayout(a.getActivity());
                        ((LinearLayout) (obj)).setBackgroundColor(0);
                        ((LinearLayout) (obj)).setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, l - i1 - j1));
                        p.cj.d.a(a).addFooterView(((View) (obj)), null, false);
                        p.cj.d.b(a);
                    }

            
            {
                a = d.this;
                super();
            }
                });
                b();
            }
            return;
        } else
        {
            e.setVisibility(8);
            f.setVisibility(0);
            return;
        }
    }

    private void f()
    {
        (new j()).execute(new Object[] {
            com.pandora.android.provider.b.a.b(), c.c()
        });
        e.setVisibility(8);
        f.setVisibility(8);
        g.setVisibility(0);
    }

    public boolean c()
    {
        return false;
    }

    public CharSequence d()
    {
        return b;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        c = (y)getArguments().getSerializable("intent_station_data");
        b = (new StringBuilder()).append(getString(0x7f080277)).append("\n").append(c.d()).toString();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        bundle = layoutinflater;
        if (s.u())
        {
            bundle = layoutinflater.cloneInContext(new ContextThemeWrapper(getActivity(), 0x7f0d0014));
        }
        layoutinflater = bundle.inflate(0x7f04007e, viewgroup, false);
        e = (ListView)layoutinflater.findViewById(0x7f10020c);
        bundle.inflate(0x7f0400b3, (ViewGroup)layoutinflater);
        f = layoutinflater.findViewById(0x7f1002cf);
        g = layoutinflater.findViewById(0x7f1002ce);
        (new j()).execute(new Object[] {
            com.pandora.android.provider.b.a.b(), c.c()
        });
        viewgroup = getParentFragment();
        if ((viewgroup instanceof c) && d() != null)
        {
            ((c)viewgroup).a(d());
        }
        return layoutinflater;
    }

    public void onItemClick(AdapterView adapterview, View view, int k, long l)
    {
        adapterview = (h)d.getItem(k);
        if (adapterview.c() == com.pandora.radio.data.h.a.c)
        {
            view = adapterview.e();
            if (view != null && !view.isEmpty())
            {
                if (adapterview.i() == com.pandora.radio.data.m.a.a)
                {
                    adapterview = p.D;
                } else
                {
                    adapterview = p.C;
                }
                adapterview = p.cp.b.a(view, adapterview);
                com.pandora.android.activity.a.a(getActivity(), adapterview, null, null, null, p.cr.b.a.b.toString(), null);
            }
        }
    }

    public void onPersonalizationThumbView(n n1)
    {
        if (!n1.b || !c.D())
        {
            return;
        }
        static class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[p.bz.n.a.values().length];
                try
                {
                    a[p.bz.n.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.bz.n.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.bz.n.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (p.cj._cls2.a[n1.a.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            h = true;
            b();
            return;

        case 2: // '\002'
            h = false;
            break;
        }
        b();
    }

    public void onStationPersonalizationChange(au au1)
    {
        if (au1.a.D() && c.c().equals(au1.a.c()))
        {
            c = au1.a;
            a();
        }
    }

    public void onThumbDown(bb bb)
    {
        if (s.u())
        {
            f();
        }
    }

    public void onThumbRevert(bc bc)
    {
        if (s.u())
        {
            f();
        }
    }

    public void onThumbUp(bd bd)
    {
        if (s.u())
        {
            f();
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        h = getArguments().getBoolean("intent_jump_to_thumbs_down");
        d = new b(getActivity(), c);
        e.setAdapter(d);
        e.setOnItemClickListener(this);
        e.setVisibility(8);
        f.setVisibility(8);
        g.setVisibility(0);
    }

    public com.pandora.android.util.af.c v()
    {
        return com.pandora.android.util.af.c.e;
    }
}
