// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.auth;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.GoogleAuthUtil;
import com.google.android.gms.common.internal.ClientContext;
import java.io.IOException;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.common.server.auth:
//            AuthTokenTimeCache

public final class AuthSessionAuthenticator
{

    protected final String mAccountName;
    protected final Bundle mExtras;
    protected final String mPackageName;
    protected final String mScope;
    protected String mToken;

    public AuthSessionAuthenticator(ClientContext clientcontext)
    {
        mPackageName = clientcontext.mAuthPackageName;
        mExtras = new Bundle();
        mExtras.putString(GoogleAuthUtil.KEY_ANDROID_PACKAGE_NAME, mPackageName);
        if (!clientcontext.isProxyingAuthentication())
        {
            mExtras.putInt("callerUid", clientcontext.mCallingUid);
        }
        if (clientcontext.getVisibleActions() != null)
        {
            mExtras.putString("request_visible_actions", TextUtils.join(" ", clientcontext.getVisibleActions()));
        }
        mAccountName = clientcontext.getResolvedAccountName();
        mScope = clientcontext.getScopesString();
    }

    public AuthSessionAuthenticator(ClientContext clientcontext, byte byte0)
    {
        this(clientcontext);
        mExtras.putBoolean("suppressProgressScreen", true);
    }

    public final String getOrThrow(Context context)
        throws IOException, GoogleAuthException
    {
        mToken = GoogleAuthUtil.getToken(context, mAccountName, mScope, mExtras);
        AuthTokenTimeCache authtokentimecache = AuthTokenTimeCache.getInstance();
        String s = mPackageName;
        synchronized (authtokentimecache.mTokenTimes)
        {
            if (!authtokentimecache.mTokenTimes.containsKey(s))
            {
                authtokentimecache.mTokenTimes.put(s, Long.valueOf(System.currentTimeMillis()));
            }
        }
        return mToken;
        exception;
        context;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
