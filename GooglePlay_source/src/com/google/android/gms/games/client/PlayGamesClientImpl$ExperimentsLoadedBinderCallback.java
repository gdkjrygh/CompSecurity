// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.client;

import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.games.client:
//            AbstractPlayGamesCallbacks, PlayGamesClientImpl

private static final class mResultHolder extends AbstractPlayGamesCallbacks
{

    private final com.google.android.gms.common.api.internal.Holder mResultHolder;

    public final void onExperimentsLoaded(int i, long al[])
    {
        mResultHolder.Holder(new (i, al));
    }

    (com.google.android.gms.common.api.internal. )
    {
        mResultHolder = (com.google.android.gms.common.api.internal.Holder)Preconditions.checkNotNull(, "Holder must not be null");
    }
}
