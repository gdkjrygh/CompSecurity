// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.hubs.shows.keeplistening;


// Referenced classes of package com.spotify.mobile.android.spotlets.hubs.shows.keeplistening:
//            UnfinishedEpisodes

final class ow.CoverSize
{

    static final int a[];

    static 
    {
        a = new int[ow.CoverSize.values().length];
        try
        {
            a[ow.CoverSize.d.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[ow.CoverSize.c.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[ow.CoverSize.a.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[ow.CoverSize.b.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
