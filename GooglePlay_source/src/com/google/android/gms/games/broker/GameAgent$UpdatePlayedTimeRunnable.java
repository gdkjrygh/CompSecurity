// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import com.android.volley.VolleyError;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.server.BaseApiaryServer;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.server.api.ApplicationsApi;

// Referenced classes of package com.google.android.gms.games.broker:
//            GameAgent

private final class mClientContext
    implements Runnable
{

    private final ClientContext mClientContext;
    final GameAgent this$0;

    public final void run()
    {
        try
        {
            ApplicationsApi applicationsapi = GameAgent.access$000(GameAgent.this);
            ClientContext clientcontext = mClientContext;
            applicationsapi.mServer.performNoResponseRequestBlocking(clientcontext, 1, "applications/played", null);
            return;
        }
        catch (VolleyError volleyerror)
        {
            GamesLog.w("GameAgent", "Volley error when reporting played", volleyerror);
            return;
        }
        catch (GoogleAuthException googleauthexception)
        {
            GamesLog.w("GameAgent", "Auth exception while recording played", googleauthexception);
        }
    }

    public (ClientContext clientcontext)
    {
        this$0 = GameAgent.this;
        super();
        mClientContext = new ClientContext(clientcontext);
        if (!mClientContext.hasScope("https://www.googleapis.com/auth/games") && mClientContext.hasScope("https://www.googleapis.com/auth/games.firstparty"))
        {
            mClientContext.addGrantedScope("https://www.googleapis.com/auth/games");
        }
    }
}
