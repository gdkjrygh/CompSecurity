// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.regex.Pattern;

public final class eje extends eja
{

    static final Pattern a = Pattern.compile("spotify:artist:([a-zA-Z0-9]+):playlists");

    public eje(String s)
    {
        super(s);
    }

    public final String a()
    {
        return "playlists";
    }

    public final String d()
    {
        return (new StringBuilder("hm://artist/v1/")).append(super.b).append("/android?format=json").toString();
    }

}
