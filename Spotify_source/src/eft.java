// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.spotlets.album.model.AlbumArtist;
import com.spotify.mobile.android.spotlets.album.model.AlbumTrack;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.Verified;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class eft extends fsx
{

    public String a;
    private final Context b;
    private final Verified e;
    private final Flags f;
    private fuj g;

    public eft(Context context, Verified verified, Flags flags)
    {
        super(context);
        g = new fuj() {

            private eft a;

            public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
            {
                obj = (AlbumTrack)obj;
                fve.a(eft.c(a)).a(((AlbumTrack) (obj)).uri, ((AlbumTrack) (obj)).name).a(eft.b(a)).a(false).a(true).a(true).a(false, null).a(eft.a(a)).a(spotifycontextmenu);
            }

            
            {
                a = eft.this;
                super();
            }
        };
        b = (Context)ctz.a(context);
        e = (Verified)ctz.a(verified);
        f = (Flags)ctz.a(flags);
    }

    static Flags a(eft eft1)
    {
        return eft1.f;
    }

    static Verified b(eft eft1)
    {
        return eft1.e;
    }

    static Context c(eft eft1)
    {
        return eft1.b;
    }

    public final View a(Context context, int i, ViewGroup viewgroup)
    {
        boolean flag;
        if (!gex.a(f))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return dhv.a(context, viewgroup, flag).v();
    }

    public final void a(View view, Context context, int i)
    {
        AlbumTrack albumtrack = (AlbumTrack)getItem(i);
        view = dhu.b(view);
        dia dia1 = (dia)view.u();
        dia1.a(albumtrack.name);
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = albumtrack.artists.iterator(); iterator.hasNext(); arraylist.add(((AlbumArtist)iterator.next()).name)) { }
        dia1.b(ctw.a(", ").a(arraylist));
        view.e(gex.a(f));
        view.c(TextUtils.equals(a, albumtrack.uri));
        view.a(gae.a(context, g, albumtrack));
    }

    public final void a(String s)
    {
        a = s;
        notifyDataSetChanged();
    }
}
