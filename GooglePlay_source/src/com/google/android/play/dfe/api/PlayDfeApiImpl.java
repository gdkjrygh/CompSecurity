// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.dfe.api;

import android.net.Uri;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.google.android.play.utils.config.GservicesValue;
import com.google.android.play.utils.config.PlayG;

// Referenced classes of package com.google.android.play.dfe.api:
//            PlayDfeApi, DfeRequest, PlayDfeApiContext

public final class PlayDfeApiImpl
    implements PlayDfeApi
{

    private static final float PLUS_PROFILE_BG_BACKOFF_MULT;
    private static final int PLUS_PROFILE_BG_MAX_RETRIES;
    private static final int PLUS_PROFILE_BG_TIMEOUT_MS;
    private final PlayDfeApiContext mApiContext;
    private final RequestQueue mQueue;

    public PlayDfeApiImpl(RequestQueue requestqueue, PlayDfeApiContext playdfeapicontext)
    {
        mQueue = requestqueue;
        mApiContext = playdfeapicontext;
    }

    public final Request getExperiments(com.android.volley.Response.Listener listener, com.android.volley.Response.ErrorListener errorlistener)
    {
        listener = new DfeRequest(EXPERIMENTS_URI.toString(), mApiContext, com/google/android/finsky/protos/Experiments$ExperimentsResponse, listener, errorlistener);
        return mQueue.add(listener);
    }

    static 
    {
        PLUS_PROFILE_BG_TIMEOUT_MS = ((Integer)PlayG.plusProfileBgTimeoutMs.get()).intValue();
        PLUS_PROFILE_BG_MAX_RETRIES = ((Integer)PlayG.plusProfileBgMaxRetries.get()).intValue();
        PLUS_PROFILE_BG_BACKOFF_MULT = ((Float)PlayG.plusProfileBgBackoffMult.get()).floatValue();
    }
}
