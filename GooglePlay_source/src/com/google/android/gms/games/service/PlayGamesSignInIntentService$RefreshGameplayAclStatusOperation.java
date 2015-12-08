// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.content.Context;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.internal.GamesLog;

// Referenced classes of package com.google.android.gms.games.service:
//            PlayGamesSignInIntentService

static final class mExternalGameId extends mExternalGameId
{

    private final ClientContext mClientContext;
    private final String mExternalGameId;

    public final int executeInternal(Context context, DataBroker databroker)
    {
        Object obj = null;
        context = databroker.getGameplayAcl(context, mClientContext, mExternalGameId);
        databroker = context;
        if (context != null)
        {
            context.close();
            databroker = context;
        }
_L1:
        if (databroker != null)
        {
            return ((DataHolder) (databroker)).mStatusCode;
        } else
        {
            return 1;
        }
        context;
        GamesLog.w("SignInIntentService", "Failed to update gameplay ACL status");
        databroker = obj;
          goto _L1
        context;
        throw context;
    }

    public final void provideResult(int i)
    {
    }

    i(ClientContext clientcontext, String s)
    {
        mClientContext = clientcontext;
        mExternalGameId = s;
    }
}
