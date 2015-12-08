// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.cache;

import com.google.android.gms.games.provider.ColumnSpec;
import com.google.android.gms.games.utils.GamesDataUtils;

// Referenced classes of package com.google.android.gms.games.cache:
//            AppContentBaseCache

public final class AppContentSectionAndCardCache extends AppContentBaseCache
{

    private static final ColumnSpec CARD_SECTION_SPEC;

    public AppContentSectionAndCardCache()
    {
        super(CARD_SECTION_SPEC.mColumnNames, "card_id");
    }

    static 
    {
        CARD_SECTION_SPEC = ColumnSpec.builder().withColumnsFrom(GamesDataUtils.APP_CONTENT_SECTION_SPEC).withColumnsFrom(GamesDataUtils.APP_CONTENT_CARD_SPEC).build();
    }
}
