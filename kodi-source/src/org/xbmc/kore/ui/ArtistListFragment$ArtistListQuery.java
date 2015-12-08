// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import org.xbmc.kore.provider.MediaDatabase;

// Referenced classes of package org.xbmc.kore.ui:
//            ArtistListFragment

private static interface _cls9
{

    public static final String PROJECTION[] = {
        "_id", "artistid", "artist", "genre", "thumbnail"
    };
    public static final String SORT = (new StringBuilder()).append(MediaDatabase.sortCommonTokens("artist")).append(" ASC").toString();

}
