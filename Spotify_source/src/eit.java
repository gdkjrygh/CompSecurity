// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import com.google.common.collect.Maps;
import com.spotify.mobile.android.spotlets.artist.util.Releases;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import java.util.HashMap;
import java.util.List;

abstract class eit extends BaseAdapter
    implements eiw
{

    protected final Context a;
    protected List b;
    protected final HashMap c = Maps.b();
    protected ejn d;
    protected boolean e;
    protected final gji f;
    private final String g;
    private final Flags h;
    private List i;
    private gfp j;
    private String k;
    private fuj l;

    eit(Context context, String s, List list, ejn ejn, Flags flags)
    {
        j = Releases.b;
        k = "";
        l = new fuj() {

            private eit a;

            public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
            {
                obj = (com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Release)obj;
                fve.a(a.a).b(((com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Release) (obj)).uri, ((com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Release) (obj)).name).a(ViewUri.an.a(eit.b(a))).a(false).a().b(false).a(eit.a(a)).a(spotifycontextmenu);
            }

            
            {
                a = eit.this;
                super();
            }
        };
        a = context;
        g = s;
        i = list;
        b = list;
        d = ejn;
        h = flags;
        dmz.a(gjj);
        f = gjj.a(context);
    }

    static Flags a(eit eit1)
    {
        return eit1.h;
    }

    static String b(eit eit1)
    {
        return eit1.g;
    }

    private void c()
    {
        b = Releases.a(i, j, k);
        notifyDataSetChanged();
    }

    protected abstract View a(int i1, View view, ViewGroup viewgroup);

    public final ListAdapter a()
    {
        return this;
    }

    public com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Release a(int i1)
    {
        return (com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Release)b.get(i1);
    }

    protected final void a(View view, int i1)
    {
        gae.a(a, view, l, b.get(i1));
    }

    protected final void a(dhu dhu1, int i1)
    {
        dhu1.a(gae.a(a, l, b.get(i1)));
    }

    public final void a(gfp gfp)
    {
        j = gfp;
        c();
    }

    public final void a(String s)
    {
        k = s;
        c();
    }

    public final void b()
    {
        e = true;
    }

    public Object getItem(int i1)
    {
        return a(i1);
    }

    public final View getView(int i1, View view, ViewGroup viewgroup)
    {
        return a(i1, view, viewgroup);
    }
}
