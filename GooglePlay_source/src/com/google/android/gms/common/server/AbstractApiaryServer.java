// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server;

import android.content.Context;
import android.text.TextUtils;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.GoogleAuthUtil;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.server.error.ErrorUtils;
import com.google.android.gms.common.util.AndroidUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.android.gms.common.server:
//            AbstractServer

public abstract class AbstractApiaryServer extends AbstractServer
{
    protected static final class DefaultApiaryRetryPolicy extends DefaultRetryPolicy
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

        protected DefaultApiaryRetryPolicy(Context context, String s)
        {
            mContext = context;
            mAuthToken = s;
        }

        public DefaultApiaryRetryPolicy(Context context, String s, int i, int j, float f)
        {
            super(i, j, f);
            mContext = context;
            mAuthToken = s;
        }
    }


    private static final HashMap sConstructorStackTraces = null;
    protected final String mApiKey = null;
    private final String mApiaryBackendOverride;
    private final String mApiaryTrace;
    private final ConcurrentHashMap mApiaryTraceOptions = new ConcurrentHashMap();
    private int mAppUid;
    private final String mBaseServer;
    private final String mBaseUri;
    private String mCachedCallingPackage;
    private String mCachedCertificate;
    public final boolean mEnableCache;
    private int mNetworkClientTag;
    private final boolean mVerboseVolleyLogging;

    AbstractApiaryServer(Context context, String s, String s1, boolean flag, boolean flag1, String s2, String s3, 
            String s4)
    {
        super(context);
        mBaseServer = s;
        mBaseUri = (new StringBuilder()).append(s).append(s1).toString();
        mEnableCache = flag;
        mVerboseVolleyLogging = flag1;
        mApiaryTrace = s2;
        mApiaryBackendOverride = s3;
        mNetworkClientTag = 153;
        mAppUid = -1;
    }

    public static boolean isInvalidTokenError(VolleyError volleyerror)
    {
        if (volleyerror.networkResponse != null && volleyerror.networkResponse.statusCode == 401)
        {
            volleyerror = ErrorUtils.analyzeReason(volleyerror);
            if (volleyerror != null && ("authError".equalsIgnoreCase(volleyerror) || "expired".equalsIgnoreCase(volleyerror)))
            {
                return true;
            }
        }
        return false;
    }

    protected static int overrideHttpMethod(int i, Map map)
    {
        int j = i;
        if (i == 7)
        {
            map.put("X-HTTP-Method-Override", "PATCH");
            j = 1;
        }
        return j;
    }

    protected final void checkVolleyError(ExecutionException executionexception, String s)
        throws VolleyError
    {
        executionexception = executionexception.getCause();
        if (executionexception instanceof VolleyError)
        {
            executionexception = (VolleyError)executionexception;
            if (isInvalidTokenError(executionexception))
            {
                GoogleAuthUtil.invalidateToken(mContext, s);
            }
            throw executionexception;
        } else
        {
            return;
        }
    }

    public HashMap createHeaders(Context context, ClientContext clientcontext, String s)
    {
        context = new HashMap();
        if (!TextUtils.isEmpty(mApiaryBackendOverride))
        {
            context.put("X-Google-Backend-Override", mApiaryBackendOverride);
        }
        if (mApiKey != null && clientcontext != null)
        {
            clientcontext = clientcontext.mAuthPackageName;
            if (!TextUtils.equals(clientcontext, mCachedCallingPackage))
            {
                mCachedCallingPackage = clientcontext;
                mCachedCertificate = AndroidUtils.getAndroidCertHeaderValue(mContext, clientcontext);
            }
            context.put("X-Android-Package", mCachedCallingPackage);
            context.put("X-Android-Cert", mCachedCertificate);
        }
        return context;
    }

    public String getBaseUri()
    {
        return mBaseUri;
    }

    public int getNetworkClientTag()
    {
        return mNetworkClientTag;
    }

    public int getUid()
    {
        return mAppUid;
    }

    public void setNetworkClientTag(int i)
    {
        mNetworkClientTag = i;
    }

    public void setRetryPolicy(Request request, String s)
    {
        request.setRetryPolicy(new DefaultApiaryRetryPolicy(mContext, s));
    }

    public void setUid(int i)
    {
        mAppUid = i;
    }

    protected final String toUrl(String s, String s1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(s).append(s1);
        if (!TextUtils.isEmpty(mApiaryTrace))
        {
            if (stringbuilder.indexOf("?") != -1)
            {
                s = "&";
            } else
            {
                s = "?";
            }
            stringbuilder.append(s).append("trace=").append(mApiaryTrace);
            for (s = mApiaryTraceOptions.entrySet().iterator(); s.hasNext(); stringbuilder.append("&").append((String)s1.getKey()).append("=").append((String)s1.getValue()))
            {
                s1 = (java.util.Map.Entry)s.next();
            }

        }
        s1 = stringbuilder.toString();
        s = s1;
        if (mApiKey != null)
        {
            char c;
            if (s1.contains("?"))
            {
                c = '&';
            } else
            {
                c = '?';
            }
            s = (new StringBuilder()).append(s1).append(c).append("key=").append(mApiKey).toString();
        }
        return s;
    }

}
