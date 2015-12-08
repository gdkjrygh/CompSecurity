// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.internal.GamesLog;

// Referenced classes of package com.google.android.gms.games.service:
//            GamesSessionRecorder, PlayGamesAsyncService

final class fo
    implements mesSessionCalls
{

    public final com.google.android.gms.ads.identifier.o getAdInfo(Context context)
    {
        try
        {
            context = AdvertisingIdClient.getAdvertisingIdInfo(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            GamesLog.e("GamesSessionRecorder", "Failed to retrieve tracking information", context);
            return null;
        }
        return context;
    }

    public final void recordSession(Context context, ClientContext clientcontext, String s, String s1, long l, long l1, com.google.android.gms.ads.identifier.o o)
    {
        clientcontext = GamesClientContext.buildContextForTargetGame(context, clientcontext, s);
        context = null;
        boolean flag = false;
        if (o != null)
        {
            context = o.mAdvertisingId;
            flag = o.mLimitAdTrackingEnabled;
        }
        PlayGamesAsyncService.recordApplicationSession(clientcontext, s1, l, l1, context, flag);
    }

    fo()
    {
    }
}
