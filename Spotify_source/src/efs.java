// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.spotlets.album.model.AlbumImage;
import com.spotify.mobile.android.spotlets.album.model.AlbumRelease;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.Verified;

public final class efs extends fsx
{

    private final Context a;
    private final Verified b;
    private final Flags e;
    private final gji f;
    private fuj g;

    public efs(Context context, Verified verified, Flags flags)
    {
        super(context);
        g = new fuj() {

            private efs a;

            public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
            {
                obj = (AlbumRelease)obj;
                fve.a(efs.c(a)).b(((AlbumRelease) (obj)).uri, ((AlbumRelease) (obj)).name).a(efs.b(a)).a(true).a().b(false).a(efs.a(a)).a(spotifycontextmenu);
            }

            
            {
                a = efs.this;
                super();
            }
        };
        a = (Context)ctz.a(context);
        b = (Verified)ctz.a(verified);
        e = (Flags)ctz.a(flags);
        dmz.a(gjj);
        f = gjj.a(context);
    }

    static Flags a(efs efs1)
    {
        return efs1.e;
    }

    static Verified b(efs efs1)
    {
        return efs1.b;
    }

    static Context c(efs efs1)
    {
        return efs1.a;
    }

    public final View a(Context context, int i, ViewGroup viewgroup)
    {
        return dhv.e(context, viewgroup).v();
    }

    public final void a(View view, Context context, int i)
    {
        AlbumRelease albumrelease = (AlbumRelease)getItem(i);
        view = dhu.b(view);
        dib dib1 = (dib)view.u();
        dib1.a(albumrelease.name);
        dib1.b(String.valueOf(albumrelease.year));
        view.e(true);
        view.a(gae.a(context, g, albumrelease));
        f.f(dib1.d(), dto.a(albumrelease.cover.uri));
    }
}
