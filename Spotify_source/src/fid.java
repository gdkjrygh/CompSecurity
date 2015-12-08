// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.spotlets.collection.adapter.HeaderableAdapter;
import com.spotify.mobile.android.spotlets.show.model.Covers;
import com.spotify.mobile.android.spotlets.show.model.Show;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.squareup.picasso.Picasso;

public final class fid extends HeaderableAdapter
{

    private Picasso h;
    private fuj i;

    public fid(Context context, epf epf, Verified verified, Flags flags)
    {
        super(context, epf, verified, flags);
        h = ((gft)dmz.a(gft)).a();
        i = new fuj() {

            private fid a;

            public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
            {
                obj = (Show)obj;
                fve.a(fid.a(a)).f(((Show) (obj)).b(), ((Show) (obj)).a()).a(((HeaderableAdapter) (a)).b).a().a(((HeaderableAdapter) (a)).c).a(spotifycontextmenu);
            }

            
            {
                a = fid.this;
                super();
            }
        };
    }

    static Context a(fid fid1)
    {
        return fid1.a;
    }

    protected final void a(env env, dhu dhu1, int j)
    {
        env = (Show)a(j);
        boolean flag;
        if (!TextUtils.isEmpty(super.d) && TextUtils.equals(super.d, env.b()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dhu1.b(env);
        dhu1.b(true);
        dhu1.e(true);
        dhu1.a(gae.a(a, i, env));
        dhu1.c(new fxh(i, env));
        dhu1.c(flag);
        dhu1 = (dib)dhu1.u();
        dhu1.a(env.a());
        dhu1.b(env.d());
        if (env.c() != null)
        {
            env = env.c().getImageUri(com.spotify.mobile.android.spotlets.show.model.Covers.Size.a);
        } else
        {
            env = "";
        }
        env = dto.a(env);
        h.a(dhu1.d());
        h.a(env).a(dff.b(a, SpotifyIcon.aX)).a(dhu1.d(), null);
    }
}
