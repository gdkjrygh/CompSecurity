// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.server.ApiaryRequest;
import com.google.android.gms.common.server.BaseApiaryRequest;
import java.util.HashMap;

public final class GamesRequest extends ApiaryRequest
{

    private final String mCacheKey;

    public GamesRequest(ClientContext clientcontext, int i, String s, Object obj, Class class1, com.android.volley.Response.Listener listener, com.android.volley.Response.ErrorListener errorlistener, 
            String s1, String s2, boolean flag, HashMap hashmap)
    {
        super(i, s, obj, class1, null, listener, errorlistener, s1, s2, flag, hashmap, 3584, -1);
        if (clientcontext != null && clientcontext.getResolvedAccountName() != null)
        {
            mCacheKey = (new StringBuilder()).append(clientcontext.getResolvedAccountName().hashCode()).append(":").append(s).toString();
            super.mAppUid = clientcontext.mCallingUid;
            return;
        } else
        {
            mCacheKey = s;
            return;
        }
    }

    public final String getCacheKey()
    {
        return mCacheKey;
    }
}
