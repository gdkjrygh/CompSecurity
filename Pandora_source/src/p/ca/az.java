// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.pandora.android.provider.b;
import com.pandora.android.view.AlbumArtsGallery;
import com.pandora.android.view.EcoGalleryAdapterView;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.ac;
import p.bz.w;
import p.bz.x;
import p.ci.a;
import p.cn.e;
import p.cw.c;

// Referenced classes of package p.ca:
//            k, ay, ae

public abstract class az extends k
    implements ay
{
    private class a
    {

        final az a;

        public void a()
        {
            b.a.b().c(this);
            b.a.e().b(this);
        }

        public void onTrackHistory(x x)
        {
            a.b(true);
            p.ca.az.b(a).notifyDataSetChanged();
        }

        public void onTrackHistoryCleared(w w)
        {
            a.b(false);
        }

        public a()
        {
            a = az.this;
            super();
            b.a.b().b(this);
            b.a.e().c(this);
        }
    }


    protected View a;
    protected boolean b;
    protected boolean c;
    protected AlbumArtsGallery d;
    protected ImageView e;
    protected ImageView f;
    protected ImageView g;
    protected ae h;
    protected TextView i;
    protected TextView j;
    protected TextView k;
    private boolean l;
    private boolean m;
    private a n;
    private View o;
    private com.pandora.android.view.EcoGalleryAdapterView.e p;

    public az()
    {
        h = new ae();
        p = new com.pandora.android.view.EcoGalleryAdapterView.e() {

            final az a;

            private void a()
            {
                if (p.ca.az.a(a))
                {
                    p.ci.a a1 = p.ca.az.b(a);
                    int j1 = a.d.getChildCount();
                    int i1 = 0;
                    while (i1 < j1) 
                    {
                        a1.a(a.d.getFirstVisiblePosition() + i1, a.d.getChildAt(i1), true);
                        i1++;
                    }
                }
            }

            public void a(EcoGalleryAdapterView ecogalleryadapterview)
            {
            }

            public void a(EcoGalleryAdapterView ecogalleryadapterview, View view, int i1, long l1)
            {
                boolean flag = ((p.ci.a)ecogalleryadapterview.getAdapter()).b(i1);
                a.d.setIsNowPlayingItemSelected(flag);
                a();
                p.ca.az.a(a, flag);
                ecogalleryadapterview = a.a();
                a.c();
                a.a(ecogalleryadapterview, i1);
                if (ecogalleryadapterview.l() == ac.c)
                {
                    com.pandora.android.artist.a.a((com.pandora.radio.data.c)ecogalleryadapterview, com.pandora.android.artist.a.a.b);
                }
                a.h.a(i1, ecogalleryadapterview);
            }

            
            {
                a = az.this;
                super();
            }
        };
    }

    protected static ay a(az az1, boolean flag, boolean flag1, boolean flag2)
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("intent_update_fragment_on_resume", flag);
        bundle.putBoolean("intent_select_nowplaying", flag1);
        bundle.putBoolean("intent_enable_thumbs_overlay", flag2);
        az1.setArguments(bundle);
        return az1;
    }

    private void a(p.ci.a a1)
    {
        if (d != null)
        {
            d.setAdapter(a1);
        }
    }

    static boolean a(az az1)
    {
        return az1.m;
    }

    static boolean a(az az1, boolean flag)
    {
        az1.l = flag;
        return flag;
    }

    static p.ci.a b(az az1)
    {
        return az1.h();
    }

    private void b(int i1)
    {
label0:
        {
            if (d != null)
            {
                if (i1 != d())
                {
                    break label0;
                }
                a(false);
            }
            return;
        }
        a(true);
    }

    private p.ci.a g()
    {
        return new p.ci.a(getActivity(), m);
    }

    private p.ci.a h()
    {
        if (d != null)
        {
            return (p.ci.a)d.getAdapter();
        } else
        {
            return null;
        }
    }

    public aa a()
    {
        return p.cn.e.a().a(d.getSelectedItemPosition());
    }

    public void a(int i1)
    {
        boolean flag = true;
        if (i1 < d.getAdapter().getCount() && i1 > -1)
        {
            aa aa1 = p.cn.e.a().a(i1);
            h.a(i1, aa1);
            d.b(i1, true);
            d.onFling(null, null, 100F, 0.0F);
            if (i1 != d())
            {
                flag = false;
            }
            l = flag;
            b(i1);
        }
    }

    protected void a(View view, LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        a = o.findViewById(0x7f10023b);
        e = (ImageView)o.findViewById(0x7f100239);
        f = (ImageView)o.findViewById(0x7f10023a);
        g = (ImageView)o.findViewById(0x7f100238);
        e.bringToFront();
        f.bringToFront();
        a(false);
        l = true;
        i = (TextView)view.findViewById(0x7f10021b);
        j = (TextView)view.findViewById(0x7f10021c);
        k = (TextView)view.findViewById(0x7f1002da);
        d = (AlbumArtsGallery)o.findViewById(0x7f100237);
        d.setHorizontalFadingEdgeEnabled(false);
        d.setCallbackDuringFling(true);
        d.setClickable(true);
        d.setOnItemClickListener(new com.pandora.android.view.EcoGalleryAdapterView.c() {

            final az a;

            public void a(EcoGalleryAdapterView ecogalleryadapterview, View view1, int i1, long l1)
            {
                if (i1 == a.d())
                {
                    a.h.p_();
                }
            }

            
            {
                a = az.this;
                super();
            }
        });
        d.setOnItemSelectedListener(p);
        c();
        a(g());
    }

    protected void a(aa aa1, int i1)
    {
        i.setText(aa1.t());
        j.setText(aa1.s());
        k.setText(aa1.u());
    }

    protected abstract void a(boolean flag);

    public String b()
    {
        return p.cn.e.a().b(a().w(), d.getSelectedItemPosition());
    }

    public void b(boolean flag)
    {
        p.df.a.a("TrackHistoryFragmentImpl", (new StringBuilder()).append("TrackHistoryFragmentImpl.refresh() selectNowPlayingTile = ").append(flag).toString());
        if (d != null)
        {
            a(g());
        }
        if (flag)
        {
            f();
        }
    }

    protected void c()
    {
        i.setText("");
        j.setText("");
        k.setText("");
    }

    protected int d()
    {
        return d.getCount() - 1;
    }

    public int e()
    {
        return d.getSelectedItemPosition();
    }

    public void f()
    {
        if (d != null && d.getAdapter() != null)
        {
            int i1 = d.getAdapter().getCount();
            if (i1 > 0)
            {
                a(i1 - 1);
            }
        }
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        h.a(activity);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null)
        {
            b = bundle.getBoolean("intent_update_fragment_on_resume");
            c = bundle.getBoolean("intent_select_nowplaying");
            m = bundle.getBoolean("intent_enable_thumbs_overlay");
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        o = layoutinflater.inflate(0x7f0400b6, viewgroup, false);
        viewgroup = (ViewGroup)o.findViewById(0x7f10023b);
        a(o, layoutinflater, viewgroup);
        n = new a();
        return o;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        n.a();
        n = null;
        p.ci.a a1 = h();
        if (a1 != null)
        {
            a1.d();
        }
        a(((p.ci.a) (null)));
    }

    public void onDetach()
    {
        super.onDetach();
        h.b();
    }

    public void onResume()
    {
        super.onResume();
        if (b)
        {
            a(g());
            if (c)
            {
                f();
            }
            b = false;
        }
    }
}
