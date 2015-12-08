// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.pandora.android.activity.a;
import com.pandora.android.provider.b;
import com.pandora.android.util.ad;
import com.pandora.android.util.f;
import com.pandora.android.util.o;
import com.pandora.android.util.r;
import com.pandora.android.util.s;
import com.pandora.android.view.AlbumArtsGallery;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.ac;
import com.pandora.radio.data.y;
import java.security.InvalidParameterException;
import java.util.List;
import p.bz.v;
import p.cn.e;
import p.cr.k;
import p.cw.c;
import p.dd.at;
import p.dd.ay;
import p.dd.bh;
import p.dd.n;

// Referenced classes of package p.ca:
//            az, ay

public class ba extends az
{
    private class a
    {

        final ba a;
        private com.pandora.android.util.o.a b;
        private boolean c;
        private y d;
        private boolean e;

        static y a(a a1)
        {
            return a1.d;
        }

        private void a(com.pandora.android.util.o.a a1, y y1)
        {
            c = true;
            b = a1;
            if (y1 == null)
            {
                ba.d(a).a(b, false);
                return;
            } else
            {
                ba.d(a).a(y1).a(b, false);
                return;
            }
        }

        private void a(String s1)
        {
            c = true;
            b = com.pandora.android.util.o.a.d;
            if (s1 != null)
            {
                ba.d(a).a(s1, false);
            }
        }

        private void a(boolean flag)
        {
label0:
            {
                if (ba.d(a) != null)
                {
                    if (!flag)
                    {
                        break label0;
                    }
                    e = true;
                    a(com.pandora.android.util.o.a.c, null);
                }
                return;
            }
            e = false;
            b();
        }

        private void b()
        {
            if (b.a.c().i())
            {
                return;
            }
            if (e)
            {
                e = false;
                return;
            } else
            {
                ba.d(a).a(false);
                c = false;
                b = null;
                return;
            }
        }

        public void a()
        {
            b.a.b().c(this);
            b.a.e().b(this);
        }

        public void a(Bundle bundle)
        {
            bundle.putSerializable("ccStationData", d);
            if (c)
            {
                bundle.putBoolean("messageShowing", c);
                bundle.putSerializable("messageType", b);
            }
        }

        public void b(Bundle bundle)
        {
            if (bundle != null && !bundle.isEmpty())
            {
                c = bundle.getBoolean("messageShowing", false);
                if (bundle.containsKey("ccStationData"))
                {
                    d = (y)bundle.getSerializable("ccStationData");
                }
                if (c)
                {
                    a((com.pandora.android.util.o.a)bundle.getSerializable("messageType"), d);
                    return;
                }
            }
        }

        public void onChromecastConnected(p.bz.f f1)
        {
            if (ba.d(a) != null && f1.b != null)
            {
                a(a.getString(0x7f0800c5, new Object[] {
                    f1.b
                }));
            }
        }

        public void onCustomContentStationNotFound(n n1)
        {
            a(true);
        }

        public void onOnePlaylistEnded(p.dd.aa aa1)
        {
label0:
            {
                if (ba.d(a) != null)
                {
                    if (!aa1.b)
                    {
                        break label0;
                    }
                    a(com.pandora.android.util.o.a.b, aa1.a);
                }
                return;
            }
            a(com.pandora.android.util.o.a.a, aa1.a);
        }

        public void onStationData(at at1)
        {
            if (at1.a == null)
            {
                return;
            } else
            {
                d = at1.a;
                return;
            }
        }

        public void onStationStateChange(ay ay1)
        {
            if (ay1.a != null)
            {
                d = ay1.a;
                static class _cls5
                {

                    static final int a[];
                    static final int b[];

                    static 
                    {
                        b = new int[p.dd.bh.a.values().length];
                        try
                        {
                            b[p.dd.bh.a.b.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror8) { }
                        try
                        {
                            b[p.dd.bh.a.a.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror7) { }
                        try
                        {
                            b[p.dd.bh.a.c.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror6) { }
                        try
                        {
                            b[p.dd.bh.a.d.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror5) { }
                        try
                        {
                            b[p.dd.bh.a.e.ordinal()] = 5;
                        }
                        catch (NoSuchFieldError nosuchfielderror4) { }
                        a = new int[p.dd.ay.a.values().length];
                        try
                        {
                            a[p.dd.ay.a.c.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            a[p.dd.ay.a.d.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            a[p.dd.ay.a.b.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            a[p.dd.ay.a.a.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                if (ba.d(a) != null)
                {
                    if (d.w())
                    {
                        a(com.pandora.android.util.o.a.b, d);
                    } else
                    {
                        b();
                    }
                }
            }
            switch (p.ca._cls5.a[ay1.b.ordinal()])
            {
            default:
                throw new InvalidParameterException((new StringBuilder()).append("onStationStateChange called with unknown stationStateChangeType: ").append(ay1.b).toString());

            case 3: // '\003'
            case 4: // '\004'
                a.c();
                // fall through

            case 1: // '\001'
            case 2: // '\002'
                return;
            }
        }

        public void onTrackAvailableAppEvent(v v1)
        {
            if (b != com.pandora.android.util.o.a.a)
            {
                boolean flag;
                if (!v1.a())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                a(flag);
            }
        }

        public void onTrackState(bh bh1)
        {
            switch (p.ca._cls5.b[bh1.a.ordinal()])
            {
            default:
                throw new IllegalArgumentException((new StringBuilder()).append(" TrackHisoryFragmentTabletImpl onTrackState: unknown event type ").append(bh1.a).toString());

            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
                break;

            case 1: // '\001'
                if (ba.d(a) != null && bh1.b != null)
                {
                    b();
                }
                break;
            }
        }

        public a()
        {
            a = ba.this;
            super();
            c = false;
            e = false;
            b.a.b().b(this);
            b.a.e().c(this);
        }
    }


    private ImageButton l;
    private ImageButton m;
    private ImageButton n;
    private View o;
    private TextView p;
    private String q;
    private com.pandora.android.coachmark.e r;
    private aa s;
    private android.view.View.OnClickListener t;
    private a u;
    private o v;
    private Bundle w;
    private Runnable x;

    public ba()
    {
        w = null;
        x = new Runnable() {

            final ba a;

            public void run()
            {
                if (p.ca.ba.f(a) != null)
                {
                    p.ca.ba.f(a).a();
                }
                p.ca.ba.a(a, null);
                ad.a(p.ca.ba.b(a), ba.g(a), null);
            }

            
            {
                a = ba.this;
                super();
            }
        };
    }

    static String a(ba ba1)
    {
        return ba1.q;
    }

    static String a(ba ba1, String s1)
    {
        ba1.q = s1;
        return s1;
    }

    public static p.ca.ay a(boolean flag, boolean flag1, com.pandora.android.coachmark.e e1)
    {
        ba ba1 = new ba();
        ba1.a(e1);
        a(((az) (ba1)), flag, flag1, true);
        return ba1;
    }

    private transient void a(android.view.View.OnClickListener onclicklistener, ImageButton aimagebutton[])
    {
        int j = aimagebutton.length;
        for (int i = 0; i < j; i++)
        {
            aimagebutton[i].setOnClickListener(onclicklistener);
        }

    }

    private void a(View view)
    {
        getActivity().openContextMenu(view);
    }

    private void a(aa aa1)
    {
        com.pandora.android.util.f.a(getActivity(), aa1);
    }

    static void a(ba ba1, View view)
    {
        ba1.a(view);
    }

    static void a(ba ba1, aa aa1)
    {
        ba1.a(aa1);
    }

    static void a(ba ba1, aa aa1, int i)
    {
        ba1.b(aa1, i);
    }

    static TextView b(ba ba1)
    {
        return ba1.p;
    }

    private void b(aa aa1, int i)
    {
        if (aa1 == null)
        {
            return;
        } else
        {
            String s1 = p.cn.e.a().b(aa1.w(), i);
            com.pandora.android.activity.a.a(getActivity(), 2, null, aa1, s1);
            return;
        }
    }

    static Runnable c(ba ba1)
    {
        return ba1.x;
    }

    static o d(ba ba1)
    {
        return ba1.v;
    }

    static void e(ba ba1)
    {
        ba1.h();
    }

    static com.pandora.android.coachmark.e f(ba ba1)
    {
        return ba1.r;
    }

    static View g(ba ba1)
    {
        return ba1.o;
    }

    private void g()
    {
        o.setAlpha(0.0F);
        if (p.getHeight() == 0)
        {
            p.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

                final ba a;

                public void onGlobalLayout()
                {
                    if (android.os.Build.VERSION.SDK_INT < 16)
                    {
                        p.ca.ba.b(a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    } else
                    {
                        p.ca.ba.b(a).getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                    p.ca.ba.e(a);
                }

            
            {
                a = ba.this;
                super();
            }
            });
            return;
        } else
        {
            h();
            return;
        }
    }

    private void h()
    {
        if (r != null)
        {
            r.b();
        }
        p.setText(q);
        ad.a(p, o);
        getView().postDelayed(x, getResources().getInteger(0x7f0c0009));
    }

    protected void a(View view, LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        layoutinflater.inflate(0x7f0400b5, viewgroup);
        super.a(view, layoutinflater, viewgroup);
        l = (ImageButton)view.findViewById(0x7f1002d6);
        m = (ImageButton)view.findViewById(0x7f1002d7);
        n = (ImageButton)view.findViewById(0x7f1002d8);
        p = (TextView)view.findViewById(0x7f1002db);
        p.setAlpha(0.0F);
        if (com.pandora.android.util.r.a())
        {
            m.setVisibility(8);
        }
        t = new android.view.View.OnClickListener() {

            final ba a;

            public void onClick(View view1)
            {
                switch (view1.getId())
                {
                default:
                    return;

                case 2131755734: 
                    p.ca.ba.a(a, a.a(), a.d.getSelectedItemPosition());
                    return;

                case 2131755735: 
                    p.ca.ba.a(a, a.a());
                    return;

                case 2131755736: 
                    p.ca.ba.a(a, view1);
                    break;
                }
            }

            
            {
                a = ba.this;
                super();
            }
        };
        a(t, new ImageButton[] {
            l, m, n
        });
        o = view.findViewById(0x7f1002d9);
        o.setOnClickListener(new android.view.View.OnClickListener() {

            final ba a;

            public void onClick(View view1)
            {
                if (!com.pandora.android.util.s.a(p.ca.ba.a(a)) || p.ca.ba.b(a).getAlpha() == 1.0F)
                {
                    a.getView().removeCallbacks(p.ca.ba.c(a));
                    p.ca.ba.c(a).run();
                } else
                {
                    view1 = a.a();
                    if (view1.l() != ac.c)
                    {
                        view1 = (String)Uri.parse(view1.I()).getPathSegments().get(3);
                        if (!com.pandora.android.util.s.a(view1))
                        {
                            k.a(Uri.parse("pandorav4://backstage/artist").buildUpon().appendQueryParameter("token", view1).build());
                            return;
                        }
                    }
                }
            }

            
            {
                a = ba.this;
                super();
            }
        });
        v = new o(view);
        u = new a();
        if (b.a.c().i())
        {
            view = b.a.c().j();
            v.a(getString(0x7f0800c5, new Object[] {
                view
            }), false);
        }
        if (w != null)
        {
            u.b(w.getBundle("track_history_state"));
        }
    }

    public void a(com.pandora.android.coachmark.e e1)
    {
        r = e1;
    }

    protected void a(aa aa1, int i)
    {
        byte byte0 = 8;
        boolean flag = true;
        super.a(aa1, i);
        if (i == 0 && i == d() && !com.pandora.android.util.s.a(q))
        {
            g();
        }
        d.a(aa1, i);
        ImageButton imagebutton = n;
        if (aa1.i() || aa1.o() || aa1.n())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        imagebutton.setVisibility(i);
        if (aa1.j() && !com.pandora.android.util.r.a())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        imagebutton = m;
        if (i != 0)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        imagebutton.setVisibility(i);
        imagebutton = l;
        i = byte0;
        if (aa1.h())
        {
            i = 0;
        }
        imagebutton.setVisibility(i);
        if (u != null && p.ca.a.a(u) != null)
        {
            aa1 = o;
            if (p.ca.a.a(u).A())
            {
                flag = false;
            }
            aa1.setClickable(flag);
            return;
        } else
        {
            o.setClickable(true);
            return;
        }
    }

    public void a(String s1, int i)
    {
        d.a(s1, i);
    }

    protected void a(boolean flag)
    {
        f.setVisibility(8);
        e.setVisibility(0);
        a.setVisibility(0);
        g.setVisibility(8);
    }

    public void a_(String s1)
    {
        q = s1;
        if (d != null)
        {
            int i = e();
            if (i >= 0 && i < d.getChildCount())
            {
                s1 = p.cn.e.a().a(i);
                if (s1 != null)
                {
                    a(s1, i);
                }
            }
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        registerForContextMenu(n);
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        aa aa1;
        int i;
        aa1 = s;
        if (aa1 == null)
        {
            return super.onContextItemSelected(menuitem);
        }
        i = menuitem.getItemId();
        i;
        JVM INSTR lookupswitch 4: default 64
    //                   2131755013: 82
    //                   2131755041: 70
    //                   2131755043: 70
    //                   2131755046: 91;
           goto _L1 _L2 _L3 _L3 _L4
_L1:
        return super.onContextItemSelected(menuitem);
_L3:
        com.pandora.android.activity.a.a(getActivity(), aa1, i);
_L6:
        return true;
_L2:
        com.pandora.android.activity.a.b(aa1, i);
        continue; /* Loop/switch isn't completed */
_L4:
        com.pandora.android.activity.a.a(aa1, i);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        w = bundle;
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        super.onCreateContextMenu(contextmenu, view, contextmenuinfo);
        view = a();
        if (view != null)
        {
            s = view;
            contextmenu.setHeaderTitle(view.s());
            if (view.i())
            {
                contextmenu.add(0, 0x7f100021, 0, 0x7f0801d3);
                contextmenu.add(0, 0x7f100023, 0, 0x7f0801d5);
            }
            if (view.o())
            {
                contextmenu.add(0, 0x7f100005, 0, 0x7f0800bc);
            }
            if (view.n())
            {
                contextmenu.add(0, 0x7f100026, 0, 0x7f08027c);
            }
        }
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        u.a();
        u = null;
        if (r != null)
        {
            r.a();
        }
    }

    public void onResume()
    {
        b = false;
        c = false;
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        Bundle bundle1 = new Bundle();
        u.a(bundle1);
        bundle.putBundle("track_history_state", bundle1);
    }
}
