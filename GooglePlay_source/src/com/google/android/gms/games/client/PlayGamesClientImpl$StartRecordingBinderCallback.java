// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.client;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.games.client:
//            AbstractPlayGamesCallbacks, PlayGamesClientImpl

private static final class mResultHolder extends AbstractPlayGamesCallbacks
{

    private final com.google.android.gms.common.api.internal.Holder mResultHolder;

    public final void onLaunchGameForRecording(int i)
    {
        mResultHolder.Holder(new Status(i));
    }

    public (com.google.android.gms.common.api.internal.a a)
    {
        mResultHolder = (com.google.android.gms.common.api.internal.Holder)Preconditions.checkNotNull(a, "Holder must not be null");
    }
}
