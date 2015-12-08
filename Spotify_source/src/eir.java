// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.common.collect.Maps;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.Verified;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class eir extends fsx
{

    private static final String b = "< 1000";
    public String a;
    private final Flags e;
    private final ejn f;
    private final Verified g;
    private final Map h = Maps.b();
    private final Drawable i;
    private final fuj j = new fuj() {

        private eir a;

        public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
        {
            obj = (com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Track)obj;
            fve.a(eir.c(a)).a(((com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Track) (obj)).uri, ((com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Track) (obj)).name).a(eir.b(a)).a(true).a(false).a(true).a(false, null).a(eir.a(a)).a(spotifycontextmenu);
        }

            
            {
                a = eir.this;
                super();
            }
    };

    public eir(Context context, List list, Verified verified, ejn ejn1, Flags flags)
    {
        super(context, list);
        f = ejn1;
        g = verified;
        e = flags;
        i = ggk.a(dgp.d(context));
    }

    static Flags a(eir eir1)
    {
        return eir1.e;
    }

    static Verified b(eir eir1)
    {
        return eir1.g;
    }

    static Context c(eir eir1)
    {
        return eir1.c;
    }

    public final View a(Context context, int k, ViewGroup viewgroup)
    {
        context = f;
        boolean flag;
        if (!gex.a(e))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        viewgroup = dds.c(((ejn) (context)).a, viewgroup, flag);
        viewgroup.a().setOnClickListener(((ejn) (context)).b);
        ggp.a(viewgroup.a(), 0x7f0200df);
        return viewgroup.a();
    }

    public final void a(View view, Context context, int k)
    {
        com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Track track = (com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Track)getItem(k);
        ddp ddp1 = (ddp)dds.a(view);
        ddp1.a(k + 1);
        ddp1.a(track.name);
        View view1;
        if (track.playcount < 1000)
        {
            view = b;
        } else
        {
            int l = track.playcount;
            view = NumberFormat.getNumberInstance(Locale.getDefault()).format(l);
        }
        ddp1.c(view);
        context = ddp1.d();
        if (track.explicit)
        {
            view = i;
        } else
        {
            view = null;
        }
        context.setCompoundDrawables(view, null, null, null);
        ddp1.b(TextUtils.equals(a, track.uri));
        ddp1.a(gae.a(c, j, track));
        ddp1.a(gex.a(e));
        view1 = ddp1.a();
        context = (ejx)h.get(track.uri);
        view = context;
        if (context == null)
        {
            view = track.uri;
            view = new ejx(k);
            h.put(track.uri, view);
        }
        view.a(k);
        view1.setTag(view);
        gae.a(c, ddp1.a(), j, track);
    }
}
