// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server;

import android.content.Context;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.GoogleAuthUtil;
import com.google.android.gms.common.server.error.ErrorUtils;

// Referenced classes of package com.google.android.gms.common.server:
//            AbstractApiaryServer

protected static final class mAuthToken extends DefaultRetryPolicy
{

    protected final String mAuthToken;
    protected final Context mContext;

    public final void retry(VolleyError volleyerror)
        throws VolleyError
    {
        boolean flag;
        if (volleyerror.networkResponse != null && volleyerror.networkResponse.statusCode >= 400 && volleyerror.networkResponse.statusCode < 500)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && !"userRateLimitExceeded".equalsIgnoreCase(ErrorUtils.analyzeReason(volleyerror)))
        {
            if (mAuthToken != null && AbstractApiaryServer.isInvalidTokenError(volleyerror))
            {
                GoogleAuthUtil.invalidateToken(mContext, mAuthToken);
            }
            throw volleyerror;
        } else
        {
            super.retry(volleyerror);
            return;
        }
    }

    protected (Context context, String s)
    {
        mContext = context;
        mAuthToken = s;
    }

    public mAuthToken(Context context, String s, int i, int j, float f)
    {
        super(i, j, f);
        mContext = context;
        mAuthToken = s;
    }
}
