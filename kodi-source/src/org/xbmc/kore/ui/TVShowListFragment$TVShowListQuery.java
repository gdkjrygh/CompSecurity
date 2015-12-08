// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import org.xbmc.kore.provider.MediaDatabase;

// Referenced classes of package org.xbmc.kore.ui:
//            TVShowListFragment

private static interface _cls9
{

    public static final String PROJECTION[] = {
        "_id", "tvshowid", "title", "thumbnail", "premiered", "episode", "watchedepisodes"
    };
    public static final String SORT_BY_NAME_IGNORE_ARTICLES = (new StringBuilder()).append(MediaDatabase.sortCommonTokens("title")).append(" ASC").toString();

}
