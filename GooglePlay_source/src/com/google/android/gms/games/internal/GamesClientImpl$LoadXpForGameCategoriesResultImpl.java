// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class mXpBundle
    implements com.google.android.gms.games.sultImpl
{

    private final List mSortedCategories;
    private final Status mStatus;
    private final Bundle mXpBundle;

    public final List getGameCategories()
    {
        return mSortedCategories;
    }

    public final Status getStatus()
    {
        return mStatus;
    }

    public final long getXpForCategory(String s)
    {
        return mXpBundle.getLong(s, -1L);
    }

    (Status status, Bundle bundle)
    {
        mStatus = status;
        mSortedCategories = bundle.getStringArrayList("game_category_list");
        mXpBundle = bundle;
    }
}
