// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.util.SpotifyError;

public abstract class dxx extends dxj
{

    public dxx()
    {
    }

    public boolean J()
    {
        return true;
    }

    protected void a(SpotifyError spotifyerror)
    {
    }

    public void a(dxy dxy)
    {
    }

    public final void c(int i)
    {
        SpotifyError spotifyerror = SpotifyError.a(i);
        if (!SpotifyError.e.equals(spotifyerror))
        {
            a(spotifyerror);
        }
    }
}
