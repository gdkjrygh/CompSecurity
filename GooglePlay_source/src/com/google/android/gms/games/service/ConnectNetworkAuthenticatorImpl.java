// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.content.Context;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.GoogleAuthUtil;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.server.auth.AuthSessionAuthenticator;
import com.google.android.gms.games.internal.GamesLog;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.games.service:
//            ConnectNetworkAuthenticator

public final class ConnectNetworkAuthenticatorImpl
    implements ConnectNetworkAuthenticator
{

    public ConnectNetworkAuthenticatorImpl()
    {
    }

    public final String getAuthToken(Context context, ClientContext clientcontext, boolean flag)
        throws GoogleAuthException
    {
        String s = null;
        AuthSessionAuthenticator authsessionauthenticator = new AuthSessionAuthenticator(clientcontext, (byte)0);
        clientcontext = s;
        try
        {
            s = authsessionauthenticator.getOrThrow(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            GamesLog.e("RoomServiceClient", (new StringBuilder("Error when getting auth token: ")).append(context.getMessage()).toString());
            return clientcontext;
        }
        clientcontext = s;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        clientcontext = s;
        GoogleAuthUtil.clearToken(context, s);
        clientcontext = s;
        context = authsessionauthenticator.getOrThrow(context);
        clientcontext = context;
        return clientcontext;
    }
}
