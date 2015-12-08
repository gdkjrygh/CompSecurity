// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.client;

import com.google.android.gms.common.api.internal.DataHolderResult;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.GamesStatusCodes;

// Referenced classes of package com.google.android.gms.games.client:
//            PlayGamesClientImpl

private static abstract class  extends DataHolderResult
{

    protected (DataHolder dataholder)
    {
        super(dataholder, GamesStatusCodes.create(dataholder.mStatusCode));
    }
}
