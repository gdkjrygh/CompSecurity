// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;
import java.util.regex.Pattern;

public final class ejg extends eja
{

    static final Pattern a = Pattern.compile("spotify:artist:([a-zA-Z0-9]+):(albums|singles|appears_on|compilations)");
    public final com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ReleaseType c;

    public ejg(String s, com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ReleaseType releasetype)
    {
        super(s);
        c = releasetype;
    }

    public final String a()
    {
        return c.name().toLowerCase(Locale.US);
    }

    public final String d()
    {
        return (new StringBuilder("hm://artist/v1/")).append(super.b).append("/").append(c.name().toLowerCase(Locale.US)).append("/android?format=json").toString();
    }

}
