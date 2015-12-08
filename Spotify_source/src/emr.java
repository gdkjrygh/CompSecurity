// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.squareup.picasso.Picasso;

public final class emr extends aav
{

    public RadioStationModel c[];
    final Context d;
    final String e;
    fuj f;
    private final Picasso g = ((gft)dmz.a(gft)).a();
    private final Drawable h;
    private final dfz i;
    private final dfz j;
    private String k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final android.view.View.OnClickListener p = new android.view.View.OnClickListener() {

        private emr a;

        public final void onClick(View view)
        {
            view = gms.a(a.d, ViewUri.T.toString()).a;
            view.putExtra("start_radio", true);
            view.putExtra("close_search_on_click", true);
            a.d.startActivity(view);
        }

            
            {
                a = emr.this;
                super();
            }
    };
    private final android.view.View.OnClickListener q = new android.view.View.OnClickListener() {

        private emr a;

        public final void onClick(View view)
        {
            view = gms.a(a.d, ViewUri.X.a((new StringBuilder("spotify:station:user:")).append(a.e).append(":clusters").toString()).toString()).a;
            a.d.startActivity(view);
        }

            
            {
                a = emr.this;
                super();
            }
    };
    private final android.view.View.OnClickListener r = new android.view.View.OnClickListener() {

        private emr a;

        public final void onClick(View view)
        {
            view = (RadioStationModel)view.getTag();
            view = gms.a(a.d, ((RadioStationModel) (view)).uri).a(((RadioStationModel) (view)).title).a;
            a.d.startActivity(view);
        }

            
            {
                a = emr.this;
                super();
            }
    };
    private final android.view.View.OnLongClickListener s = new android.view.View.OnLongClickListener() {

        private emr a;

        public final boolean onLongClick(View view)
        {
            view = (RadioStationModel)view.getTag();
            fud.a(a.d, a.f, view);
            return true;
        }

            
            {
                a = emr.this;
                super();
            }
    };

    public emr(u u1, String s1, Flags flags)
    {
        c = new RadioStationModel[0];
        k = "";
        f = new fuj() {

            private emr a;

            public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
            {
                RadioStationModel radiostationmodel;
                emr emr1;
                String s2;
                SpotifyLink spotifylink;
                radiostationmodel = (RadioStationModel)obj;
                obj = new fuk(a.d, radiostationmodel.stationUri, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.e, spotifycontextmenu);
                emr1 = a;
                s2 = radiostationmodel.uri;
                ((fuk) (obj)).a(0x7f1100b3, 0x7f08023a, SpotifyIcon.ai).d = new fuk._cls20(((fuk) (obj)), s2);
                s2 = gpl.d(radiostationmodel.uri);
                spotifylink = new SpotifyLink(s2);
                final class _cls6
                {

                    static final int a[];

                    static 
                    {
                        a = new int[com.spotify.mobile.android.util.SpotifyLink.LinkType.values().length];
                        try
                        {
                            a[com.spotify.mobile.android.util.SpotifyLink.LinkType.c.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            a[com.spotify.mobile.android.util.SpotifyLink.LinkType.g.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            a[com.spotify.mobile.android.util.SpotifyLink.LinkType.an.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aT.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                _cls6.a[spotifylink.c.ordinal()];
                JVM INSTR tableswitch 1 4: default 128
            //                           1 187
            //                           2 200
            //                           3 221
            //                           4 256;
                   goto _L1 _L2 _L3 _L4 _L5
_L1:
                break; /* Loop/switch isn't completed */
_L5:
                break MISSING_BLOCK_LABEL_256;
_L6:
                obj = radiostationmodel.imageUri;
                String s3;
                if (obj == null)
                {
                    obj = "";
                }
                spotifycontextmenu.b((String)obj);
                spotifycontextmenu.a.a = radiostationmodel.title;
                spotifycontextmenu.a.b = gpl.a(emr1.d, new SpotifyLink(gpl.d(radiostationmodel.uri)));
                return;
_L2:
                ((fuk) (obj)).a(s2, radiostationmodel.title);
                  goto _L6
_L3:
                ((fuk) (obj)).b(s2, radiostationmodel.title);
                spotifycontextmenu.a.g = true;
                  goto _L6
_L4:
                s3 = radiostationmodel.title;
                ((fuk) (obj)).a(0x7f11002c, 0x7f08020d, SpotifyIcon.E).d = new fuk._cls36(((fuk) (obj)), s2, s3);
                  goto _L6
                if (!TextUtils.isEmpty(radiostationmodel.subtitleUri) && !TextUtils.isEmpty(radiostationmodel.subtitle))
                {
                    ((fuk) (obj)).b(radiostationmodel.subtitleUri, radiostationmodel.subtitle);
                }
                  goto _L6
            }

            
            {
                a = emr.this;
                super();
            }
        };
        d = u1;
        e = s1;
        h = dff.a(d, SpotifyIcon.J);
        o = dft.b(54F, u1.getResources());
        i = new dfz(d, SpotifyIcon.H);
        j = new dfz(d, SpotifyIcon.K);
        if (gpl.b(flags))
        {
            l = 1;
            m = 2;
            n = 2;
            return;
        } else
        {
            l = -5;
            m = 1;
            n = 1;
            return;
        }
    }

    public final int a(int i1)
    {
        if (i1 == 0)
        {
            return 0;
        }
        return i1 != l ? 2 : 1;
    }

    public final abo a(ViewGroup viewgroup, int i1)
    {
        viewgroup = dhv.e(d, viewgroup);
        if (i1 == 0)
        {
            ((dib)viewgroup.u()).d().setImageDrawable(i);
            ((dib)viewgroup.u()).d().setScaleType(android.widget.ImageView.ScaleType.CENTER);
            ((dib)viewgroup.u()).a(d.getString(0x7f080306));
            viewgroup.v().setOnClickListener(p);
            ((dib)viewgroup.u()).b().setVisibility(8);
        } else
        if (i1 == 1)
        {
            ((dib)viewgroup.u()).d().setImageDrawable(j);
            ((dib)viewgroup.u()).d().setScaleType(android.widget.ImageView.ScaleType.CENTER);
            ((dib)viewgroup.u()).a(d.getString(0x7f08018a));
            ((dib)viewgroup.u()).b().setVisibility(8);
            viewgroup.v().setOnClickListener(q);
            return viewgroup;
        }
        return viewgroup;
    }

    public final void a(abo abo, int i1)
    {
        abo = (dhu)abo;
        if (a(i1) == 2)
        {
            dib dib1 = (dib)abo.u();
            abo.e(true);
            RadioStationModel radiostationmodel = c[i1 - n];
            SpotifyLink spotifylink = new SpotifyLink(gpl.d(radiostationmodel.uri));
            ImageView imageview;
            boolean flag;
            if (spotifylink.c == com.spotify.mobile.android.util.SpotifyLink.LinkType.g)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            imageview = dib1.d();
            g.a(dto.a(radiostationmodel.imageUri)).a(radiostationmodel).a(android.graphics.Bitmap.Config.ARGB_4444).a(h).b(h).b(o, o).d().c().a(new gai(d, flag)).a(imageview, null);
            abo.b(radiostationmodel);
            dib1.a(radiostationmodel.title);
            dib1.b(gpl.a(d, spotifylink));
            dib1.b().setVisibility(0);
            abo.v().setOnClickListener(r);
            abo.a(gae.a(d, f, radiostationmodel));
            abo.x().setVisibility(0);
            abo.v().setOnLongClickListener(s);
            if (k.equals(radiostationmodel.uri))
            {
                abo.c(true);
                return;
            } else
            {
                abo.c(false);
                return;
            }
        } else
        {
            abo.b(null);
            return;
        }
    }

    public final void a(String s1)
    {
        s1 = gpl.b(s1);
        if (s1 != null && !s1.equals(k))
        {
            String s2 = k;
            k = s1;
            for (int i1 = 0; i1 < c.length; i1++)
            {
                if (s2.equals(c[i1].uri) || s1.equals(c[i1].uri))
                {
                    c(n + i1);
                }
            }

        }
    }

    public final int b()
    {
        return c.length + m;
    }
}
