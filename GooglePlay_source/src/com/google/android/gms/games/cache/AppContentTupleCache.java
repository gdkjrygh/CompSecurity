// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.cache;

import com.google.android.gms.games.provider.ColumnSpec;
import com.google.android.gms.games.utils.GamesDataUtils;

// Referenced classes of package com.google.android.gms.games.cache:
//            AppContentBaseCache

public final class AppContentTupleCache extends AppContentBaseCache
{

    public AppContentTupleCache()
    {
        super(GamesDataUtils.APP_CONTENT_TUPLE_SPEC.mColumnNames, "tuple_id");
    }
}
