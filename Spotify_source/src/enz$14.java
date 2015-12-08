// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class ng.Object
    implements enw
{

    private String a;

    public final boolean canAddToCollection()
    {
        return false;
    }

    public final int getAddTime()
    {
        return 0;
    }

    public final enr getAlbum()
    {
        return null;
    }

    public final List getArtists()
    {
        return null;
    }

    public final String getHeader()
    {
        return a;
    }

    public final String getName()
    {
        return "";
    }

    public final int getOfflineState()
    {
        return 0;
    }

    public final String getUri()
    {
        return "";
    }

    public final boolean inCollection()
    {
        return false;
    }

    public final boolean isAvailable()
    {
        return false;
    }

    public final boolean isExplicit()
    {
        return false;
    }

    public final boolean isHeader()
    {
        return true;
    }

    public final boolean isLocal()
    {
        return false;
    }

    public final boolean isPlayable()
    {
        return false;
    }

    ng.String(String s)
    {
        a = s;
        super();
    }
}
