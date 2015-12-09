// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class mIsExplicitlySet extends mIsExplicitlySet
    implements com.google.android.gms.games.
{

    private final boolean mIsExplicitlySet;
    private final boolean mIsVisible;

    public final Status getStatus()
    {
        return mStatus;
    }

    public final boolean isProfileVisible()
    {
        return mIsVisible;
    }

    Y(DataHolder dataholder)
    {
        super(dataholder);
        if (dataholder.mRowCount <= 0) goto _L2; else goto _L1
_L1:
        int i = dataholder.getWindowIndex(0);
        mIsVisible = dataholder.getBoolean("profile_visible", 0, i);
        mIsExplicitlySet = dataholder.getBoolean("profile_visibility_explicitly_set", 0, i);
_L4:
        dataholder.close();
        return;
_L2:
        mIsVisible = true;
        mIsExplicitlySet = false;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        dataholder.close();
        throw exception;
    }
}
