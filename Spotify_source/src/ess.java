// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Locale;

abstract class ess extends doq
{

    private static final cub ag;
    private static Uri ah = Uri.parse("hm://hubview/android/v1");
    SpotifyLink aa;
    private String ai;

    ess()
    {
    }

    protected final SpotifyIcon G()
    {
        return SpotifyIcon.g;
    }

    protected final Request H()
    {
        Flags flags = fyw.a(this);
        return RequestBuilder.get(eta.a(l(), a(aa), flags)).build();
    }

    protected abstract gjm L();

    protected abstract String M();

    protected abstract String N();

    protected android.net.Uri.Builder a(SpotifyLink spotifylink)
    {
        Object obj = spotifylink.d();
        String s = (String)ctz.a(M());
        if (!((String) (obj)).startsWith(s))
        {
            throw new AssertionError((new StringBuilder("Invalid link: ")).append(spotifylink).append(", should start with ").append(s).toString());
        }
        spotifylink = ah.buildUpon().appendEncodedPath(N());
        cub cub1 = ag;
        obj = ((String) (obj)).replaceFirst(s, "");
        ctz.a(obj);
        for (obj = (new cub._cls2(cub1, ((CharSequence) (obj)))).iterator(); ((Iterator) (obj)).hasNext(); spotifylink.appendPath((String)((Iterator) (obj)).next())) { }
        return spotifylink;
    }

    public final String a(Context context, Flags flags)
    {
        if (!TextUtils.isEmpty(ai))
        {
            return ai;
        } else
        {
            return b(context);
        }
    }

    public void a(Bundle bundle)
    {
        aa = new SpotifyLink((String)ctz.a(g().getString("spotlets.hubs.hubfragment.uri")));
        ai = g().getString("spotlets.hubs.hubfragment.title", "");
        super.a(bundle);
    }

    final void a(Flags flags, String s, String s1)
    {
        Bundle bundle1 = g();
        Bundle bundle = bundle1;
        if (bundle1 == null)
        {
            bundle = new Bundle();
            f(bundle);
        }
        bundle.putString("spotlets.hubs.hubfragment.uri", s);
        bundle.putString("spotlets.hubs.hubfragment.title", s1);
        fyw.a(this, flags);
    }

    protected final void a(dor dor1)
    {
        super.a(dor1);
        dqj dqj1 = new dqj(new SimpleDateFormat("yyyy-MM-dd", Locale.US));
        dor1.a.c(Pair.create("porcelain_calendar_icon", dqj1));
    }

    protected abstract String b(Context context);

    protected final FeatureIdentifier r_()
    {
        return u_();
    }

    public Verified v_()
    {
        return L().a(aa.d());
    }

    static 
    {
        cub cub1;
        boolean flag;
        if (":".length() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.a(flag, "The separator may not be the empty string.");
        cub1 = new cub(new cub._cls1(":"));
        ag = new cub(cub1.c, true, cub1.a, cub1.d);
    }
}
