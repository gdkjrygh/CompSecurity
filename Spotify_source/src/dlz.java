// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.music.spotlets.FeatureIdentifier;

public final class dlz
    implements gbd
{

    public ClientEvent a;
    public boolean b;
    public ClientEvent c;
    public boolean d;
    public com.spotify.mobile.android.util.viewuri.ViewUri.SubView e;
    private Context f;
    private SpotifyLink g;
    private Verified h;
    private FeatureIdentifier i;
    private FeatureIdentifier j;
    private dma k;
    private final Flags l;
    private fos m;

    public dlz(Context context, SpotifyLink spotifylink, Verified verified, FeatureIdentifier featureidentifier, FeatureIdentifier featureidentifier1, dma dma1, Flags flags)
    {
        dmz.a(fop);
        m = (fos)dmz.a(fos);
        ctz.a(context);
        ctz.a(spotifylink);
        ctz.a(verified);
        ctz.a(dma1);
        f = context;
        g = spotifylink;
        k = dma1;
        h = verified;
        i = featureidentifier;
        j = featureidentifier1;
        l = flags;
    }

    public final void a()
    {
        if (!g.d().equals(k.a())) goto _L2; else goto _L1
_L1:
        fos.c(f);
_L4:
        if (b)
        {
            fop.a(f, h, e, a);
        }
        return;
_L2:
        android.net.Uri uri = gfs.a(g);
        if (uri != null)
        {
            fos.a(f, h, i, j, uri, l);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void b()
    {
        fos.c(f);
        if (d)
        {
            fop.a(f, h, e, c);
        }
    }
}
