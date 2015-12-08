// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cj;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.j;
import android.text.Editable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.util.Switch;
import com.pandora.android.util.p;
import com.pandora.android.util.s;
import com.pandora.android.view.AlbumArtsGallery;
import com.pandora.android.view.EcoGalleryAdapterView;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.ag;
import com.pandora.radio.data.ai;
import com.pandora.radio.data.w;
import com.pandora.radio.data.y;
import p.bz.n;
import p.bz.o;
import p.bz.x;
import p.ca.ay;
import p.ci.d;
import p.ck.a;
import p.cm.i;
import p.cn.e;
import p.cw.c;
import p.dd.au;
import p.dd.bb;
import p.dd.bc;
import p.dd.bd;

// Referenced classes of package p.cj:
//            a, c

public class b extends p.cj.a
    implements android.view.View.OnClickListener, android.view.View.OnFocusChangeListener, android.widget.AdapterView.OnItemClickListener, ay
{

    private String b;
    private String c;
    private String d;
    private View e;
    private TextView f;
    private EditText g;
    private EditText h;
    private Button i;
    private AlbumArtsGallery j;
    private p.ci.c k;
    private TextView l;
    private TextView m;
    private TextView n;
    private y o;
    private d p;
    private ListView q;
    private View r;
    private Switch s;
    private boolean t;
    private com.pandora.android.view.EcoGalleryAdapterView.e u;

    public b()
    {
        t = false;
        u = new com.pandora.android.view.EcoGalleryAdapterView.e() {

            final b a;

            private void a()
            {
                p.ci.a a1 = p.cj.b.a(a);
                int j1 = b.b(a).getChildCount();
                for (int i1 = 0; i1 < j1; i1++)
                {
                    a1.a(b.b(a).getFirstVisiblePosition() + i1, b.b(a).getChildAt(i1), true);
                }

            }

            public void a(EcoGalleryAdapterView ecogalleryadapterview)
            {
            }

            public void a(EcoGalleryAdapterView ecogalleryadapterview, View view, int i1, long l1)
            {
                a();
                ecogalleryadapterview = a.a();
                p.cj.b.a(a, ecogalleryadapterview, i1);
            }

            
            {
                a = b.this;
                super();
            }
        };
    }

    static p.ci.a a(b b1)
    {
        return b1.n();
    }

    public static b a(y y1)
    {
        b b1 = new b();
        Bundle bundle = new Bundle();
        bundle.putSerializable("intent_station_data", y1);
        b1.setArguments(bundle);
        return b1;
    }

    private void a(View view)
    {
        r = view.findViewById(0x7f100207);
        s = (Switch)view.findViewById(0x7f10020a);
        if (!com.pandora.android.artist.b.a(o))
        {
            r.setVisibility(8);
            return;
        }
        r.setVisibility(0);
        view = (TextView)view.findViewById(0x7f100208);
        if (!com.pandora.android.artist.b.b())
        {
            view.setText(getString(0x7f08025d, new Object[] {
                "- Off"
            }));
            s.setVisibility(8);
            s.setEnabled(false);
        } else
        {
            view.setText(getString(0x7f08025d, new Object[] {
                ""
            }));
            s.setVisibility(0);
            s.setEnabled(true);
            s.setChecked(o.J());
            s.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

                final b a;

                public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
                {
                    p.cj.b.a(a, flag);
                }

            
            {
                a = b.this;
                super();
            }
            });
        }
        r.setOnClickListener(new android.view.View.OnClickListener() {

            final b a;

            public void onClick(View view1)
            {
                com.pandora.android.provider.b.a.C().a((new PandoraIntent("show_page")).putExtra("intent_page_name", p.A).putExtra("intent_show_force_screen", true));
            }

            
            {
                a = b.this;
                super();
            }
        });
    }

    private void a(aa aa1, int i1)
    {
        if (aa1 != null)
        {
            l.setText(aa1.t());
            m.setText(aa1.s());
        }
    }

    static void a(b b1, aa aa1, int i1)
    {
        b1.a(aa1, i1);
    }

    static void a(b b1, boolean flag)
    {
        b1.d(flag);
    }

    static AlbumArtsGallery b(b b1)
    {
        return b1.j;
    }

    static void b(b b1, boolean flag)
    {
        b1.c(flag);
    }

    private void c(boolean flag)
    {
        i.setVisibility(8);
        g.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0x7f0200e1, 0);
        String s1 = g.getText().toString();
        if (!com.pandora.android.util.s.a(s1))
        {
            b = s1;
            getActivity().setTitle(b);
        }
        if (flag)
        {
            g.clearFocus();
            h.clearFocus();
            com.pandora.android.util.s.a(getActivity(), h);
        }
        m();
    }

    private void d(boolean flag)
    {
        ai ai1 = com.pandora.android.provider.b.a.b().k().t();
        com.pandora.radio.data.ai.a a1 = ai1.v();
        static class _cls5
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[com.pandora.radio.data.ai.a.values().length];
                try
                {
                    b[com.pandora.radio.data.ai.a.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    b[com.pandora.radio.data.ai.a.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    b[com.pandora.radio.data.ai.a.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    b[com.pandora.radio.data.ai.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
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

        switch (_cls5.b[a1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
            if (o.J() != flag)
            {
                o.a(flag);
            }
            a(ai1, o);
            return;

        case 3: // '\003'
            throw new IllegalStateException("Artist Message switch should not be available, when feature is DISABLED");

        case 4: // '\004'
            throw new IllegalStateException("Artist Message switch should not be selectable, when feature is OFF");
        }
    }

    private void h()
    {
        l();
        j();
        if (com.pandora.android.util.s.u())
        {
            p.bz.i i1 = (new p.bz.i.a()).a(com.pandora.android.view.HeaderLayout.d.c).a(com.pandora.android.view.HeaderLayout.b.c).b(com.pandora.android.view.HeaderLayout.a.e).a(d().toString()).a();
            com.pandora.android.provider.b.a.e().a(i1);
        }
    }

    private void j()
    {
        if (o.l())
        {
            f.setVisibility(0);
            e.setVisibility(0);
            e.setOnClickListener(this);
            return;
        } else
        {
            f.setVisibility(8);
            e.setVisibility(8);
            return;
        }
    }

    private void k()
    {
        i.setVisibility(0);
        g.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }

    private void l()
    {
        if (o.B() != null)
        {
            p.a(o.B());
        }
    }

    private void m()
    {
        String s2 = null;
        String s1;
        String s3;
        if (g.getText() != null)
        {
            s1 = g.getText().toString();
        } else
        {
            s1 = null;
        }
        if (h.getText() != null)
        {
            s2 = h.getText().toString();
        }
        s3 = s1;
        if (com.pandora.android.util.s.a(s1))
        {
            s3 = c;
        }
        if (c.equals(s3) && (com.pandora.android.util.s.a(s2) || s2.equals(d)))
        {
            return;
        } else
        {
            (new a()).execute(new Object[] {
                com.pandora.android.provider.b.a.b(), o.c(), s3, s2
            });
            return;
        }
    }

    private p.ci.a n()
    {
        if (j != null)
        {
            return (p.ci.a)j.getAdapter();
        } else
        {
            return null;
        }
    }

    public aa a()
    {
        return p.cn.e.a().a(o.h(), j.getSelectedItemPosition());
    }

    public void a(int i1)
    {
        int j1 = j.getAdapter().getCount();
        if (j1 > 0 && i1 < j1 && i1 > -1)
        {
            j.b(i1, true);
            j.onFling(null, null, 100F, 0.0F);
        }
    }

    protected void a(View view, LayoutInflater layoutinflater)
    {
        layoutinflater.inflate(0x7f040083, (ViewGroup)view.findViewById(0x7f10023b));
        view.findViewById(0x7f100238).setVisibility(4);
        view.findViewById(0x7f100239).bringToFront();
        view.findViewById(0x7f10023a).setVisibility(8);
        l = (TextView)view.findViewById(0x7f10021b);
        m = (TextView)view.findViewById(0x7f10021c);
        j = (AlbumArtsGallery)view.findViewById(0x7f100237);
        j.setHorizontalFadingEdgeEnabled(false);
        j.setCallbackDuringFling(true);
        j.setOnItemSelectedListener(u);
        n = (TextView)view.findViewById(0x7f10023c);
        if (t)
        {
            n.setText(0x7f08025b);
        }
        j.setEmptyView(n);
        a(g());
        f();
    }

    void a(ai ai1, y y1)
    {
        (new i(ai1, y1)).a_(new Object[0]);
    }

    public void a(String s1, int i1)
    {
    }

    void a(p.ci.a a1)
    {
        if (j != null)
        {
            j.setAdapter(a1);
        }
    }

    public void a(boolean flag)
    {
        p.df.a.a("PersonalizationFragment", (new StringBuilder()).append("PersonalizationFragment.refresh() selectNowPlayingTile = ").append(flag).toString());
        if (j != null)
        {
            ((BaseAdapter)j.getAdapter()).notifyDataSetChanged();
        }
        if (flag)
        {
            f();
        }
    }

    public void a_(String s1)
    {
    }

    public String b()
    {
        return p.cn.e.a().b(a().w(), j.getSelectedItemPosition());
    }

    public boolean c()
    {
        return false;
    }

    public CharSequence d()
    {
        return b;
    }

    public int e()
    {
        return j.getSelectedItemPosition();
    }

    public void f()
    {
        if (j != null && j.getAdapter() != null)
        {
            int i1 = j.getAdapter().getCount();
            if (i1 > 0)
            {
                a(i1 - 1);
            }
        }
    }

    protected p.ci.a g()
    {
        if (k == null)
        {
            k = new p.ci.c(o.h(), getActivity());
        }
        return k;
    }

    public void onClick(View view)
    {
        if (view.getId() == e.getId())
        {
            view = new PandoraIntent("action_show_add_variety");
            com.pandora.android.provider.b.a.C().a(view);
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        o = (y)getArguments().getSerializable("intent_station_data");
        if (o != null)
        {
            com.pandora.android.util.s.j();
            if (bundle != null)
            {
                c = bundle.getString("intent_station_name");
                d = bundle.getString("intent_station_description");
            } else
            {
                c = o.d();
                d = o.e();
            }
            b = c;
            p.cn.e.a().d(o.h());
            t = true;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        bundle = layoutinflater;
        if (com.pandora.android.util.s.u())
        {
            bundle = layoutinflater.cloneInContext(new ContextThemeWrapper(getActivity(), 0x7f0d0014));
        }
        layoutinflater = bundle.inflate(0x7f04007e, viewgroup, false);
        viewgroup = bundle.inflate(0x7f040081, null);
        View view = bundle.inflate(0x7f04007d, null);
        g = (EditText)view.findViewById(0x7f10011b);
        h = (EditText)view.findViewById(0x7f10020b);
        i = (Button)view.findViewById(0x7f1000a0);
        p = new d(getActivity());
        q = (ListView)layoutinflater.findViewById(0x7f10020c);
        e = view.findViewById(0x7f100202);
        f = (TextView)viewgroup.findViewById(0x7f100211);
        q.addHeaderView(viewgroup);
        q.addFooterView(view);
        a(view);
        a(viewgroup.findViewById(0x7f100236), bundle);
        viewgroup = getParentFragment();
        if ((viewgroup instanceof p.cj.c) && d() != null)
        {
            ((p.cj.c)viewgroup).a(d());
        }
        return layoutinflater;
    }

    public void onFocusChange(View view, boolean flag)
    {
        int i1 = view.getId();
        if (!flag || i.getVisibility() == 0)
        {
            return;
        }
        if (i1 == g.getId() && g.getText() != null)
        {
            g.setSelection(g.getText().length());
        }
        k();
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        int j1 = ((ListView)adapterview).getHeaderViewsCount();
        String s1;
        if (i1 >= j1)
        {
            if ((view = (w)p.getItem(i1 - j1)).e() != null && !view.e().isEmpty() && ((s1 = view.e()) != null && !s1.isEmpty()))
            {
                if (view.i() == com.pandora.radio.data.m.a.a)
                {
                    adapterview = p.D;
                } else
                {
                    adapterview = p.C;
                }
                s1 = p.cp.b.a(s1, adapterview);
                if (view.i() == com.pandora.radio.data.m.a.a)
                {
                    adapterview = p.cr.a.a.toString();
                } else
                {
                    adapterview = p.cr.a.b.toString();
                }
                com.pandora.android.activity.a.a(getActivity(), s1, null, null, null, adapterview, null);
                return;
            }
        }
    }

    public void onPersonalizationThumbView(n n1)
    {
        if (!n1.b)
        {
            return;
        }
        PandoraIntent pandoraintent = new PandoraIntent("action_show_thumb_history");
        Bundle bundle = new Bundle();
        switch (p.cj._cls5.a[n1.a.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            bundle.putBoolean("intent_jump_to_thumbs_down", true);
            // fall through

        case 2: // '\002'
        case 3: // '\003'
            pandoraintent.putExtras(bundle);
            break;
        }
        com.pandora.android.provider.b.a.C().a(pandoraintent);
    }

    public void onResume()
    {
        super.onResume();
        g.setText(c);
        h.setText(d);
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString("intent_station_name", o.d());
        bundle.putString("intent_station_description", o.e());
    }

    public void onSessionTrackHistoryLoaded(o o1)
    {
        t = false;
        if (o != null && o1.a.equals(o.h()) && k != null)
        {
            k.notifyDataSetChanged();
            f();
        }
        n.setText(0x7f08025a);
        com.pandora.android.util.s.k();
    }

    public void onStationPersonalizationChange(au au1)
    {
        o = au1.a;
        c = o.d();
        d = o.e();
        h();
    }

    public void onThumbDown(bb bb1)
    {
        if (p.cw.d.a(bb1.a))
        {
            return;
        } else
        {
            j.a(bb1.b.w(), -1);
            return;
        }
    }

    public void onThumbRevert(bc bc1)
    {
        j.a(bc1.a.w(), bc1.b);
    }

    public void onThumbUp(bd bd1)
    {
        if (p.cw.d.a(bd1.a))
        {
            return;
        } else
        {
            j.a(bd1.b.w(), 1);
            return;
        }
    }

    public void onTrackHistory(x x1)
    {
        if (o.h().equals(x1.a.r()))
        {
            a(true);
        }
    }

    public void onTrackHistoryCleared(p.bz.w w1)
    {
        a(false);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        (new p.di.j()).execute(new Object[] {
            com.pandora.android.provider.b.a.b(), o.c()
        });
        g.setOnFocusChangeListener(this);
        h.setOnFocusChangeListener(this);
        q.setAdapter(p);
        q.setOnItemClickListener(this);
        i.setOnClickListener(new android.view.View.OnClickListener() {

            final b a;

            public void onClick(View view1)
            {
                b.b(a, true);
            }

            
            {
                a = b.this;
                super();
            }
        });
        h();
    }

    public com.pandora.android.util.af.c v()
    {
        return com.pandora.android.util.af.c.f;
    }
}
