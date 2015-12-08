// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.spotify.mobile.android.spotlets.artist.model.Image;
import com.spotify.mobile.android.spotlets.artist.util.Playlists;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.squareup.picasso.Picasso;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class eip extends fsx
{

    public gfp a;
    protected String b;
    private final Flags e;
    private final Verified f;
    private final List g;
    private final ejn h;
    private final Map i = Maps.b();
    private final boolean j;
    private final gji k;
    private final cua l = new cua() {

        private eip a;

        public final boolean a(Object obj)
        {
            obj = (com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Playlist)obj;
            return obj != null && ((com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Playlist) (obj)).name.toLowerCase(Locale.getDefault()).contains(a.b.toLowerCase(Locale.getDefault()));
        }

            
            {
                a = eip.this;
                super();
            }
    };
    private final fuj m = new fuj() {

        private eip a;

        public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
        {
            obj = (com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Playlist)obj;
            fve.a(eip.c(a)).d(((com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Playlist) (obj)).uri, ((com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Playlist) (obj)).name).a(eip.b(a)).a(false).a(false).a(eip.a(a)).a(spotifycontextmenu);
        }

            
            {
                a = eip.this;
                super();
            }
    };

    public eip(Context context, List list, Verified verified, boolean flag, ejn ejn1, Flags flags)
    {
        super(context);
        a = Playlists.a;
        b = "";
        e = (Flags)ctz.a(flags);
        h = (ejn)ctz.a(ejn1);
        f = (Verified)ctz.a(verified);
        j = flag;
        g = ImmutableList.a(list);
        if (flag && g.size() > 3)
        {
            d = g.subList(0, 4);
        } else
        {
            d = g;
        }
        dmz.a(gjj);
        k = gjj.a(context);
    }

    static Flags a(eip eip1)
    {
        return eip1.e;
    }

    private eju a(String s, int i1)
    {
        eju eju2 = (eju)i.get(s);
        eju eju1 = eju2;
        if (eju2 == null)
        {
            eju1 = new eju(i1, s);
            i.put(s, eju1);
        }
        eju1.a(i1);
        return eju1;
    }

    static Verified b(eip eip1)
    {
        return eip1.f;
    }

    static Context c(eip eip1)
    {
        return eip1.c;
    }

    public final View a(Context context, int i1, ViewGroup viewgroup)
    {
        if (getItemViewType(i1) == 1)
        {
            return h.a(viewgroup).v();
        } else
        {
            return h.b(viewgroup).v();
        }
    }

    public final void a()
    {
        Object obj = com.spotify.mobile.android.spotlets.artist.util.Playlists.SortOrder.valueOf(a.a);
        Iterable iterable = cuv.b(g, l);
        boolean flag = a.b();
        if (((com.spotify.mobile.android.spotlets.artist.util.Playlists.SortOrder) (obj)).mOrdering == null)
        {
            obj = Lists.a(iterable);
        } else
        if (flag)
        {
            obj = ((com.spotify.mobile.android.spotlets.artist.util.Playlists.SortOrder) (obj)).mOrdering.a().a(iterable);
        } else
        {
            obj = ((com.spotify.mobile.android.spotlets.artist.util.Playlists.SortOrder) (obj)).mOrdering.a(iterable);
        }
        d = ((List) (obj));
        notifyDataSetChanged();
    }

    public final void a(View view, Context context, int i1)
    {
        if (getItemViewType(i1) == 1)
        {
            view = dhu.b(view);
            context = (dhw)view.u();
            view.e(true);
            view.b(a("viewall", i1));
            context.a(c.getString(0x7f0800cf));
            return;
        }
        context = dhu.b(view);
        dib dib1 = (dib)context.u();
        com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Playlist playlist = (com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Playlist)getItem(i1);
        context.e(true);
        context.b(a(playlist.uri, i1));
        context.a(gae.a(c, m, playlist));
        dib1.a(playlist.name);
        gji gji1 = k;
        android.widget.ImageView imageview = dib1.d();
        if (playlist.cover != null)
        {
            view = playlist.cover.getUri();
        } else
        {
            view = null;
        }
        gji1.b.a(view).a(0x7f02006e).b(0x7f02006e).a(imageview, null);
        dib1.c(c.getResources().getQuantityString(0x7f090002, playlist.followerCount, new Object[] {
            Integer.valueOf(playlist.followerCount)
        }));
        gae.a(c, context.v(), m, playlist);
    }

    public final void a(String s)
    {
        b = (String)ctz.a(s);
        a();
    }

    public final int getItemViewType(int i1)
    {
        return !j || i1 != 3 ? 0 : 1;
    }

    public final int getViewTypeCount()
    {
        return 2;
    }
}
