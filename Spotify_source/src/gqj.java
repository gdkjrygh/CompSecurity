// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.music.spotlets.FeatureIdentifier;

public abstract class gqj
{

    public static final SpotifyIcon g;
    public static final SpotifyIcon h;
    private final fos a = (fos)dmz.a(fos);
    private Button b;
    private ViewGroup c;
    private String d;
    public final Resolver i;
    public final Context j;
    final SpotifyIcon k;
    final SpotifyIcon l;
    public final gcu m;
    final android.view.View.OnClickListener n = new android.view.View.OnClickListener() {

        private gqj a;

        public final void onClick(View view)
        {
            if (a.a(gqj.a(a)))
            {
                gqj.c(a);
                fos.c(gqj.b(a));
                return;
            } else
            {
                view = a;
                gqj.c(a);
                view.a();
                return;
            }
        }

            
            {
                a = gqj.this;
                super();
            }
    };

    public gqj(Context context, Verified verified, ViewGroup viewgroup, SpotifyIcon spotifyicon, SpotifyIcon spotifyicon1, FeatureIdentifier featureidentifier, FeatureIdentifier featureidentifier1)
    {
        j = (Context)ctz.a(context);
        i = Cosmos.getResolver(context);
        context = ((PlayerFactory)dmz.a(com/spotify/mobile/android/cosmos/player/v2/PlayerFactory)).create(i, ((Verified)ctz.a(verified)).toString(), (FeatureIdentifier)ctz.a(featureidentifier), (FeatureIdentifier)ctz.a(featureidentifier1));
        c = viewgroup;
        k = spotifyicon;
        l = spotifyicon1;
        m = new gcu(context) {

            private gqj b;

            protected final void a(PlayerState playerstate)
            {
                gqj.a(b, playerstate.entityUri(), playerstate.isPaused());
            }

            protected final boolean a(PlayerState playerstate, PlayerState playerstate1)
            {
                return b(playerstate, playerstate1) || c(playerstate, playerstate1);
            }

            
            {
                b = gqj.this;
                super(player);
            }
        };
    }

    static String a(gqj gqj1)
    {
        return gqj1.d;
    }

    static void a(gqj gqj1, String s, boolean flag)
    {
        gqj1.a(s, flag);
    }

    private void a(String s, boolean flag)
    {
        d = s;
        if (a(d) && !flag)
        {
            d();
        } else
        {
            e();
        }
        if (b.getVisibility() != 0)
        {
            s = b;
            if (s.getVisibility() != 0)
            {
                s.clearAnimation();
                s.setVisibility(0);
                s.startAnimation(AnimationUtils.loadAnimation(s.getContext(), 0x7f040010));
            }
        }
        if (b.getParent() != null)
        {
            b.getParent().requestLayout();
        }
    }

    static Context b(gqj gqj1)
    {
        return gqj1.j;
    }

    static fos c(gqj gqj1)
    {
        return gqj1.a;
    }

    public final View a(boolean flag)
    {
        if (b == null || flag)
        {
            b = c();
            a("", true);
            b.setVisibility(4);
            b();
        }
        return b;
    }

    public abstract void a();

    public abstract boolean a(String s);

    protected void b()
    {
        b.setOnClickListener(n);
    }

    protected Button c()
    {
        return gad.a(j, c, k, 0x7f0802fd);
    }

    protected void d()
    {
        gad.a(j, b, l, 0x7f0802fc);
    }

    protected void e()
    {
        gad.a(j, b, k, 0x7f0802fd);
    }

    static 
    {
        g = SpotifyIcon.au;
        h = SpotifyIcon.av;
    }
}
