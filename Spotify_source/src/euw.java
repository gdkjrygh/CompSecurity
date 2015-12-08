// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.spotlets.momentsstart.model.MomentContext;
import com.spotify.mobile.android.util.SpotifyLink;
import com.squareup.picasso.Picasso;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class euw extends eql
    implements euu
{

    private final android.view.View.OnClickListener A = new android.view.View.OnClickListener() {

        private euw a;

        public final void onClick(View view)
        {
            boolean flag1 = true;
            if (euw.c(a) != null)
            {
                view = a.n;
                String s1 = euw.c(a).uri;
                com.spotify.mobile.android.util.SpotifyLink.LinkType linktype;
                boolean flag;
                if (!euw.b(a))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                linktype = (new SpotifyLink(s1)).c;
                if (((eun) (view)).a.containsKey(linktype))
                {
                    ((eup)((eun) (view)).a.get(linktype)).a(s1, flag);
                }
                view = a;
                if (!euw.b(a))
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                view.b(flag);
            }
        }

            
            {
                a = euw.this;
                super();
            }
    };
    private TextView j;
    public final ImageView k;
    public final ToggleButton l;
    protected final Context m;
    protected final eun n;
    protected final euk o;
    private View p;
    private TextView q;
    private TextView r;
    private final List s;
    private final View t;
    private MomentContext u;
    private final boolean v;
    private boolean w;
    private final boolean x;
    private final boolean y;
    private final euo z = new euo() {

        private euw a;

        public final void a(boolean flag, boolean flag1)
        {
            ToggleButton togglebutton = a.l;
            int i1;
            if (flag)
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            togglebutton.setVisibility(i1);
            if (flag)
            {
                a.l.setOnClickListener(euw.a(a));
                if (euw.b(a) != flag1)
                {
                    a.b(flag1);
                }
                euw.a(a, flag1);
            }
        }

            
            {
                a = euw.this;
                super();
            }
    };

    public euw(ViewGroup viewgroup, int i, euk euk, eun eun1)
    {
        super(LayoutInflater.from(viewgroup.getContext()).inflate(0x7f030086, viewgroup, false));
        a.setTag(this);
        n = eun1;
        o = euk;
        viewgroup = (ViewStub)a.findViewById(0x7f11037a);
        viewgroup.setLayoutResource(i);
        p = viewgroup.inflate();
        m = a.getContext();
        j = (TextView)a.findViewById(0x7f110379);
        k = (ImageView)a.findViewById(0x7f11026a);
        q = (TextView)a.findViewById(0x7f11037b);
        r = (TextView)a.findViewById(0x7f1102a3);
        l = (ToggleButton)a.findViewById(0x7f11004f);
        l.setBackgroundResource(0x7f020068);
        t = a.findViewById(0x7f11037c);
        v = ggi.b(m);
        s = ImmutableList.a(j, q, r);
        x = m.getResources().getBoolean(0x7f0a0008);
        y = m.getResources().getBoolean(0x7f0a0007);
        if (gfv.b(m))
        {
            viewgroup = a;
            i = gfv.c(m);
            viewgroup.setPadding(viewgroup.getPaddingLeft(), i, viewgroup.getPaddingRight(), viewgroup.getPaddingBottom());
        }
        if (!ggi.b(m))
        {
            viewgroup = a;
            i = m.getResources().getDimensionPixelSize(0x7f0c002d);
            viewgroup.setPadding(viewgroup.getPaddingLeft(), viewgroup.getPaddingTop(), viewgroup.getPaddingRight(), i);
        }
    }

    public static Uri a(String s1)
    {
        Uri uri = dto.a(s1);
        s1 = uri;
        if (uri == Uri.EMPTY)
        {
            s1 = null;
        }
        return s1;
    }

    static android.view.View.OnClickListener a(euw euw1)
    {
        return euw1.A;
    }

    static boolean a(euw euw1, boolean flag)
    {
        euw1.w = flag;
        return flag;
    }

    static boolean b(euw euw1)
    {
        return euw1.w;
    }

    static MomentContext c(euw euw1)
    {
        return euw1.u;
    }

    public final List D_()
    {
        return s;
    }

    protected Drawable a(MomentContext momentcontext)
    {
        momentcontext = new SpotifyLink(momentcontext.uri);
        final class _cls4
        {

            static final int a[];

            static 
            {
                a = new int[com.spotify.mobile.android.util.SpotifyLink.LinkType.values().length];
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.x.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.g.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.u.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.ae.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aO.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aH.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.v.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.c.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.E.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.az.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aE.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aF.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls4.a[((SpotifyLink) (momentcontext)).c.ordinal()])
        {
        default:
            return dff.e(m);

        case 6: // '\006'
            return dff.b(m, SpotifyIcon.N, 0.66F, false);

        case 7: // '\007'
        case 8: // '\b'
            return dff.c(m, SpotifyIcon.b);

        case 1: // '\001'
        case 2: // '\002'
            return dff.a(m);

        case 3: // '\003'
        case 9: // '\t'
            return dff.b(m, SpotifyIcon.o, 0.66F, false);

        case 4: // '\004'
            return dff.b(m, SpotifyIcon.w, 0.66F, false);

        case 10: // '\n'
            return dff.l(m);

        case 11: // '\013'
        case 12: // '\f'
            return dff.b(m, SpotifyIcon.bs, 0.66F, false);

        case 5: // '\005'
            return dff.c(m, SpotifyIcon.V);
        }
    }

    public void a(MomentContext momentcontext, int i)
    {
        u = momentcontext;
        b(momentcontext);
        a(momentcontext, new android.view.View.OnClickListener(momentcontext, i) {

            private MomentContext a;
            private int b;
            private euw c;

            public final void onClick(View view)
            {
                if (c.o != null)
                {
                    c.o.a(a, b);
                }
            }

            
            {
                c = euw.this;
                a = momentcontext;
                b = i;
                super();
            }
        });
        momentcontext = momentcontext.uri;
        eun eun1 = n;
        euo euo1 = z;
        com.spotify.mobile.android.util.SpotifyLink.LinkType linktype = (new SpotifyLink(momentcontext)).c;
        if (eun1.a.containsKey(linktype))
        {
            ((eup)eun1.a.get(linktype)).a(momentcontext, euo1);
            return;
        } else
        {
            euo1.a(false, false);
            return;
        }
    }

    protected void a(MomentContext momentcontext, android.view.View.OnClickListener onclicklistener)
    {
        Object obj;
        Object obj1 = null;
        if (x)
        {
            j.setText(momentcontext.tagline);
            TextView textview = j;
            if (TextUtils.isEmpty(momentcontext.tagline))
            {
                obj = null;
            } else
            {
                obj = onclicklistener;
            }
            textview.setOnClickListener(((android.view.View.OnClickListener) (obj)));
            if (v)
            {
                obj = j;
                TextView textview1;
                byte byte0;
                if (TextUtils.isEmpty(momentcontext.tagline))
                {
                    byte0 = 8;
                } else
                {
                    byte0 = 0;
                }
                ((TextView) (obj)).setVisibility(byte0);
            }
        } else
        {
            j.setVisibility(8);
        }
        k.setOnClickListener(onclicklistener);
        textview1 = q;
        if (TextUtils.isEmpty(momentcontext.name)) goto _L2; else goto _L1
_L1:
        obj = momentcontext.name;
_L4:
        textview1.setText(((CharSequence) (obj)));
        q.setOnClickListener(onclicklistener);
        if (y)
        {
            r.setVisibility(0);
            r.setText(momentcontext.description);
            obj = r;
            if (TextUtils.isEmpty(momentcontext.description))
            {
                momentcontext = obj1;
            } else
            {
                momentcontext = onclicklistener;
            }
            ((TextView) (obj)).setOnClickListener(momentcontext);
            return;
        } else
        {
            r.setVisibility(8);
            return;
        }
_L2:
        obj = new SpotifyLink(momentcontext.uri);
        switch (_cls4.a[((SpotifyLink) (obj)).c.ordinal()])
        {
        default:
            obj = "";
            break;

        case 3: // '\003'
            obj = m.getString(0x7f0801a8);
            break;

        case 4: // '\004'
            obj = m.getString(0x7f08023d);
            break;

        case 5: // '\005'
            obj = m.getString(0x7f0803ff);
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public volatile void a(Object obj, int i)
    {
        a((MomentContext)obj, i);
    }

    public final View b()
    {
        if (v)
        {
            return t;
        } else
        {
            return p;
        }
    }

    protected void b(MomentContext momentcontext)
    {
        Object obj = ((gft)dmz.a(gft)).a();
        ((Picasso) (obj)).a(k);
        obj = ((Picasso) (obj)).a(a(momentcontext.imageUri)).a(a(momentcontext)).b(k.getLayoutParams().width, k.getLayoutParams().height).b();
        momentcontext = new SpotifyLink(momentcontext.uri);
        switch (_cls4.a[((SpotifyLink) (momentcontext)).c.ordinal()])
        {
        default:
            c(0x7f020067);
            ((gwb) (obj)).a(k, null);
            return;

        case 1: // '\001'
        case 2: // '\002'
            c(0x7f020066);
            break;
        }
        ((gwb) (obj)).a(gft.a(k, dfo.a()));
    }

    protected final void b(boolean flag)
    {
        l.setChecked(flag);
    }

    public void c(int i)
    {
        ggp.a(p, i);
    }

    public void w()
    {
        super.w();
        l.setOnClickListener(null);
        if (u != null)
        {
            Object obj = n;
            String s1 = u.uri;
            euo euo1 = z;
            com.spotify.mobile.android.util.SpotifyLink.LinkType linktype = (new SpotifyLink(s1)).c;
            if (((eun) (obj)).a.containsKey(linktype))
            {
                obj = (eup)((eun) (obj)).a.get(linktype);
                if (((eup) (obj)).a.containsKey(s1))
                {
                    ((Set)((eup) (obj)).a.get(s1)).remove(euo1);
                    if (((Set)((eup) (obj)).a.get(s1)).size() == 0)
                    {
                        ((eup) (obj)).a.remove(s1);
                    }
                }
            }
        }
    }
}
