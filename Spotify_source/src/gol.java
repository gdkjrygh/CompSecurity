// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.android.paste.widget.CardView;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class gol extends aav
{

    final Context c;
    public String d;
    public boolean e;
    final Verified f;
    final com.spotify.mobile.android.util.viewuri.ViewUri.SubView g;
    final Flags h;
    final fuj i = new fuj() {

        private gol a;

        public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
        {
            obj = (RadioStationModel)obj;
            fuk fuk1 = new fuk(a.c, a.f, a.g, spotifycontextmenu);
            fuk1.a(((RadioStationModel) (obj)).title, a.h, new String[] {
                ((RadioStationModel) (obj)).seeds[0]
            });
            fuk1.a(((RadioStationModel) (obj)).uri);
            spotifycontextmenu.b(((RadioStationModel) (obj)).imageUri);
            spotifycontextmenu.a.a = ((RadioStationModel) (obj)).title;
            spotifycontextmenu.a.b = ((RadioStationModel) (obj)).subtitle;
        }

            
            {
                a = gol.this;
                super();
            }
    };
    private List j;
    private gft k;
    private LayoutInflater l;
    private final boolean m;
    private final int n;
    private final android.view.View.OnClickListener o = new android.view.View.OnClickListener() {

        private gol a;

        public final void onClick(View view)
        {
            view = (RadioStationModel)view.getTag();
            if (gpl.a(a.h))
            {
                view = gms.a(a.c, ((RadioStationModel) (view)).uri).a(((RadioStationModel) (view)).title).a;
                a.c.startActivity(view);
            } else
            if (a.a(view))
            {
                fos.c(a.c);
            } else
            {
                gol gol1 = a;
                fos.a(gol1.c, ((RadioStationModel) (view)).seeds, gol1.f, gol1.g);
            }
            view = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.N, com.spotify.mobile.android.util.ClientEvent.SubEvent.aQ);
            view.a("station_entities_enabled", Boolean.toString(gpl.a(a.h)));
            fop.a(a.c, ViewUri.h, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, view);
        }

            
            {
                a = gol.this;
                super();
            }
    };
    private final android.view.View.OnLongClickListener p = new android.view.View.OnLongClickListener() {

        private gol a;

        public final boolean onLongClick(View view)
        {
            gol gol1 = a;
            view = (RadioStationModel)view.getTag();
            fud.a(gol1.c, gol1.i, view);
            return true;
        }

            
            {
                a = gol.this;
                super();
            }
    };

    public gol(u u1, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, boolean flag, Flags flags)
    {
        j = new ArrayList();
        d = "";
        dmz.a(fop);
        k = (gft)dmz.a(gft);
        dmz.a(fos);
        c = u1;
        f = verified;
        g = subview;
        m = flag;
        n = dft.b(100F, u1.getResources());
        h = flags;
        l = LayoutInflater.from(u1);
    }

    public final abo a(ViewGroup viewgroup, int i1)
    {
        Object obj = l.inflate(0x7f030124, viewgroup, false);
        viewgroup = (CardView)((View) (obj)).findViewById(0x7f1102f0);
        viewgroup.setOnClickListener(o);
        viewgroup.a(true);
        viewgroup.a(com.spotify.android.paste.widget.CardView.CardTextType.c);
        obj = new got(((View) (obj)));
        obj.j = viewgroup;
        return ((abo) (obj));
    }

    public final void a(abo abo1, int i1)
    {
        boolean flag1 = true;
        Object obj = (got)abo1;
        abo1 = (RadioStationModel)j.get(i1);
        boolean flag = a(((RadioStationModel) (abo1)));
        ((got) (obj)).j.a(dft.a(8F, c.getResources()));
        Object obj1;
        Object obj2;
        if (!flag && m)
        {
            ((got) (obj)).a(p);
        } else
        {
            ((got) (obj)).a(null);
        }
        ((abo) (obj)).a.setTag(abo1);
        ((got) (obj)).j.setTag(abo1);
        obj1 = ((RadioStationModel) (abo1)).title;
        ((got) (obj)).j.a(((CharSequence) (obj1)));
        if (TextUtils.isEmpty(((RadioStationModel) (abo1)).subtitle))
        {
            ((got) (obj)).a(" ");
        } else
        {
            ((got) (obj)).a(((RadioStationModel) (abo1)).subtitle);
        }
        obj1 = new SpotifyLink(((RadioStationModel) (abo1)).seeds[0]);
        obj2 = gpl.a(c, ((SpotifyLink) (obj1)));
        ((got) (obj)).j.c(((CharSequence) (obj2)));
        obj2 = (android.view.ViewGroup.MarginLayoutParams)((got) (obj)).j.getLayoutParams();
        if (obj2 != null)
        {
            if (i1 == 0)
            {
                ((android.view.ViewGroup.MarginLayoutParams) (obj2)).setMargins(((android.view.ViewGroup.MarginLayoutParams) (obj2)).rightMargin, ((android.view.ViewGroup.MarginLayoutParams) (obj2)).topMargin, ((android.view.ViewGroup.MarginLayoutParams) (obj2)).rightMargin, ((android.view.ViewGroup.MarginLayoutParams) (obj2)).bottomMargin);
            } else
            {
                ((android.view.ViewGroup.MarginLayoutParams) (obj2)).setMargins(0, ((android.view.ViewGroup.MarginLayoutParams) (obj2)).topMargin, ((android.view.ViewGroup.MarginLayoutParams) (obj2)).rightMargin, ((android.view.ViewGroup.MarginLayoutParams) (obj2)).bottomMargin);
            }
        }
        if (flag && e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((got) (obj)).j.b(flag);
        obj = ((got) (obj)).j.b();
        if (((SpotifyLink) (obj1)).c == com.spotify.mobile.android.util.SpotifyLink.LinkType.g)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        k.a().a(dto.a(((RadioStationModel) (abo1)).imageUri)).a(0x7f02006d).a(android.graphics.Bitmap.Config.ARGB_8888).a(new gah(c, flag, (byte)0)).b(0x7f02006d).b(n, n).d().c().a(((android.widget.ImageView) (obj)), null);
    }

    public final void a(RadioStationModel aradiostationmodel[])
    {
        j.clear();
        if (aradiostationmodel != null)
        {
            Collections.addAll(j, aradiostationmodel);
        }
        c();
    }

    protected final boolean a(RadioStationModel radiostationmodel)
    {
        if (d.equals(""))
        {
            return false;
        } else
        {
            return radiostationmodel.isMyContext(d);
        }
    }

    public final int b()
    {
        return j.size();
    }
}
