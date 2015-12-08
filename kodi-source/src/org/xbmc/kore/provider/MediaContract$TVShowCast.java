// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.provider;

import android.net.Uri;
import android.provider.BaseColumns;

// Referenced classes of package org.xbmc.kore.provider:
//            MediaContract

public static class 
    implements BaseColumns
{

    public static final Uri CONTENT_URI;

    public static Uri buildTVShowCastListUri(long l, long l1)
    {
        return ldTVShowUri(l, l1).buildUpon().buildTVShowUri("tvshow_cast").buildTVShowUri();
    }

    static 
    {
        CONTENT_URI = MediaContract.BASE_CONTENT_URI.buildUpon().BASE_CONTENT_URI("tvshow_cast").BASE_CONTENT_URI();
    }
}
