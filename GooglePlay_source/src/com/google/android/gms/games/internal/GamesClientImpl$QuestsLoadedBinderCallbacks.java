// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private static final class mQuestsLoadedHolder extends AbstractGamesCallbacks
{

    private final com.google.android.gms.common.api.internal.tsLoadedHolder mQuestsLoadedHolder;

    public final void onQuestsLoaded(DataHolder dataholder)
    {
        mQuestsLoadedHolder.tsLoadedHolder(new lt(dataholder));
    }

    public (com.google.android.gms.common.api.internal. )
    {
        mQuestsLoadedHolder = (com.google.android.gms.common.api.internal.tsLoadedHolder)Preconditions.checkNotNull(, "Holder must not be null");
    }
}
