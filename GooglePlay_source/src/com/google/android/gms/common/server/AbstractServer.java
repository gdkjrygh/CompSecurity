// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.appcert.AppCertServiceClient;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.server.auth.AuthSessionAuthenticator;
import java.io.IOException;

public abstract class AbstractServer
{

    public final Context mContext;

    AbstractServer(Context context)
    {
        mContext = context;
    }

    public String getAppCert(ClientContext clientcontext)
    {
        try
        {
            clientcontext = (new AppCertServiceClient(mContext)).getAppCert(clientcontext.mAuthPackageName);
        }
        // Misplaced declaration of an exception variable
        catch (ClientContext clientcontext)
        {
            Log.w("AbstractServer", "IOException while getting app cert is being ignored.", clientcontext);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (ClientContext clientcontext)
        {
            Log.w("AbstractServer", "GoogleAuthException while getting app cert is being ignored.", clientcontext);
            return null;
        }
        return clientcontext;
    }

    public String getAuthTokenOrThrow(ClientContext clientcontext)
        throws GoogleAuthException, VolleyError
    {
        String s = clientcontext.getExtra("auth_token");
        if (!TextUtils.isEmpty(s))
        {
            return s;
        }
        if (clientcontext.getResolvedAccountName() == null)
        {
            return null;
        }
        clientcontext = getAuthenticator(clientcontext);
        try
        {
            clientcontext = clientcontext.getOrThrow(mContext);
        }
        // Misplaced declaration of an exception variable
        catch (ClientContext clientcontext)
        {
            throw new VolleyError(clientcontext);
        }
        return clientcontext;
    }

    public AuthSessionAuthenticator getAuthenticator(ClientContext clientcontext)
    {
        return new AuthSessionAuthenticator(clientcontext);
    }
}
