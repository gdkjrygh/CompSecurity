// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.server;

import android.content.Context;
import android.text.TextUtils;
import com.android.volley.Request;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.server.BaseApiaryServer;
import com.google.android.gms.common.server.SpamAndAbuseHeaders;
import com.google.android.gms.common.server.UserAgent;
import com.google.android.gms.common.server.auth.AuthSessionAuthenticator;
import com.google.android.gms.common.server.auth.AuthTokenTimeCache;
import com.google.android.gms.plus.config.G;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.plus.server:
//            ContainerParam, SocialClient

public final class PlusServer extends BaseApiaryServer
{

    private PlusServer(Context context, String s, String s1, boolean flag, boolean flag1, String s2, String s3)
    {
        super(context, s, s1, flag, flag1, s2, s3);
        setNetworkClientTag(6400);
    }

    public static BaseApiaryServer createPlusV1Server(Context context)
    {
        return new PlusServer(context, (String)G.plusV1ServerUrl.get(), (String)G.plusV1ServerApiPath.get(), ((Boolean)G.cacheEnabled.get()).booleanValue(), ((Boolean)G.verboseLogging.get()).booleanValue(), (String)G.apiaryTrace.get(), (String)G.plusV1BackendOverride.get());
    }

    public static BaseApiaryServer createPlusV1WhitelistedServer(Context context)
    {
        return new PlusServer(context, (String)G.plusWhitelistedServerUrl.get(), (String)G.plusWhitelistedServerApiPath.get(), ((Boolean)G.cacheEnabled.get()).booleanValue(), ((Boolean)G.verboseLogging.get()).booleanValue(), (String)G.apiaryTrace.get(), (String)G.plusWhitelistedBackendOverride.get());
    }

    protected final HashMap createHeaders(Context context, ClientContext clientcontext, String s)
    {
        HashMap hashmap = super.createHeaders(context, clientcontext, s);
        s = SpamAndAbuseHeaders.getInstance();
        Context context1 = mContext;
        Object obj = mContext.getPackageManager();
        String s1 = clientcontext.mCallingPackageName;
        obj = new ContainerParam(((android.content.pm.PackageManager) (obj)));
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme("http");
        builder.authority(String.format("%s.%s", new Object[] {
            ((ContainerParam) (obj)).getCertificate(s1), "apps.googleusercontent.com"
        }));
        builder.path("/");
        builder.appendQueryParameter("pkg", s1);
        if (!TextUtils.isEmpty((String)G.posAnonymousApiKey.get()))
        {
            builder.appendQueryParameter("api_key", (String)G.posAnonymousApiKey.get());
        }
        s1 = builder.toString();
        obj = AuthTokenTimeCache.getInstance().getTokenTime(clientcontext.mAuthPackageName);
        hashmap.put("X-Container-Url", s1);
        hashmap.put("X-Network-ID", s.getNetworkId(context1));
        if (obj == null)
        {
            s = "none";
        } else
        {
            s = ((Long) (obj)).toString();
        }
        hashmap.put("X-Auth-Time", s);
        SocialClient.getInstance();
        s = mContext;
        if (clientcontext != null)
        {
            clientcontext = clientcontext.getExtra("application_name");
        } else
        {
            clientcontext = null;
        }
        SocialClient.addHeaders(s, hashmap, clientcontext);
        hashmap.put("User-Agent", UserAgent.get(context, "G+ SDK/1.0.1"));
        return hashmap;
    }

    protected final AuthSessionAuthenticator getAuthenticator(ClientContext clientcontext)
    {
        return new AuthSessionAuthenticator(clientcontext, (byte)0);
    }

    protected final void setRetryPolicy(Request request, String s)
    {
        int i = G.getTimeoutMs(request.getMethod(), request.getUrl());
        request.setRetryPolicy(new com.google.android.gms.common.server.AbstractApiaryServer.DefaultApiaryRetryPolicy(mContext, s, i, 1, 1.0F));
    }
}
