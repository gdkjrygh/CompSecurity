// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import org.xbmc.kore.provider.MediaDatabase;

// Referenced classes of package org.xbmc.kore.ui:
//            MovieListFragment

private static interface 
{

    public static final String PROJECTION[] = {
        "_id", "movieid", "title", "thumbnail", "year", "genres", "runtime", "rating", "tagline"
    };
    public static final String SORT_BY_NAME_IGNORE_ARTICLES = (new StringBuilder()).append(MediaDatabase.sortCommonTokens("title")).append(" ASC").toString();

}
