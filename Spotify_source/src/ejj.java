// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

public final class ejj
    implements cua
{

    public String a;

    private ejj()
    {
    }

    public ejj(byte byte0)
    {
        this();
    }

    public final boolean a(Object obj)
    {
        obj = (com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Release)obj;
        if (obj != null)
        {
            String s = String.valueOf(((com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Release) (obj)).year);
            if (((com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Release) (obj)).name.toLowerCase(Locale.getDefault()).contains(a.toLowerCase(Locale.getDefault())) || s.startsWith(a) || s.endsWith(a))
            {
                return true;
            }
        }
        return false;
    }
}
