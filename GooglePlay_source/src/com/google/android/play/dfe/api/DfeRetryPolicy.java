// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.dfe.api;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.VolleyError;
import com.google.android.play.utils.config.GservicesValue;
import com.google.android.play.utils.config.PlayG;

// Referenced classes of package com.google.android.play.dfe.api:
//            PlayDfeApiContext

public final class DfeRetryPolicy extends DefaultRetryPolicy
{

    private boolean mHadAuthException;
    private final PlayDfeApiContext mPlayDfeApiContext;

    public DfeRetryPolicy(PlayDfeApiContext playdfeapicontext)
    {
        super(((Integer)PlayG.dfeRequestTimeoutMs.get()).intValue(), ((Integer)PlayG.dfeMaxRetries.get()).intValue(), ((Float)PlayG.dfeBackoffMultipler.get()).floatValue());
        mPlayDfeApiContext = playdfeapicontext;
    }

    public final void retry(VolleyError volleyerror)
        throws VolleyError
    {
        if (volleyerror instanceof AuthFailureError)
        {
            if (mHadAuthException)
            {
                throw volleyerror;
            }
            mHadAuthException = true;
            mPlayDfeApiContext.invalidateAuthToken();
        }
        super.retry(volleyerror);
    }
}
