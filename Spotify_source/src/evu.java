// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.util.SpotifyError;

public final class evu
    implements evv
{

    private evs a;
    private evr b;

    public evu(evs evs1, evr evr1)
    {
        a = evs1;
        b = evr1;
    }

    public final void a(SpotifyError spotifyerror)
    {
    }

    public final void a(evp evp1)
    {
        if (evp1.c())
        {
            a.a();
            return;
        } else
        {
            a.a(evp1.a(), evp1.b());
            return;
        }
    }

    public final void a(boolean flag)
    {
        b.a(flag);
    }
}
