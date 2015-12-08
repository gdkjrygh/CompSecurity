// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private static final class mResultHolder extends AbstractGamesCallbacks
{

    private final com.google.android.gms.common.api.internal.ltHolder mResultHolder;

    public final void onContactSettingsLoaded(DataHolder dataholder)
    {
        mResultHolder.ltHolder(new mResultHolder(dataholder));
    }

    public (com.google.android.gms.common.api.internal. )
    {
        mResultHolder = (com.google.android.gms.common.api.internal.ltHolder)Preconditions.checkNotNull(, "Holder must not be null");
    }
}
