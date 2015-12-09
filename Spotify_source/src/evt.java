// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.util.SpotifyError;

public final class evt
    implements evv
{

    private final evs a;
    private final evr b;
    private evp c;
    private boolean d;
    private boolean e;

    public evt(evs evs1, evr evr1)
    {
        a = evs1;
        b = evr1;
    }

    public final void a(SpotifyError spotifyerror)
    {
        if (e && spotifyerror == SpotifyError.b)
        {
            e = false;
            b.b(false);
        }
    }

    public final void a(evp evp1)
    {
        c = evp1;
        if (!d)
        {
            a.a(c.a(), c.b());
        }
        if (d && !c.c())
        {
            d = false;
            b.a(true);
        }
    }

    public final void a(boolean flag)
    {
        if (!flag)
        {
            b.a(flag);
            return;
        }
        if (c.c())
        {
            b.b(true);
            d = true;
            e = true;
            return;
        } else
        {
            b.a(flag);
            return;
        }
    }
}
