// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.api2.framework.HttpMethod;

public final class mv extends oV
{

    private final String mDownloadContextMediaType;
    private final boolean mIsPostRequest;
    private final String mMediaType;
    private final pn mPayload;
    private final String mPosterId;
    private final String mRequestTag;
    private final Pb mResponseBuffer;
    private final String mUrl;

    public mv(String s, Pb pb, String s1, String s2, String s3, String s4)
    {
        mUrl = s;
        mResponseBuffer = pb;
        mPayload = null;
        mIsPostRequest = false;
        mDownloadContextMediaType = s1;
        mMediaType = s2;
        mPosterId = s3;
        mRequestTag = s4;
    }

    public mv(String s, Pb pb, pn pn, String s1, String s2, String s3, String s4)
    {
        mUrl = s;
        mResponseBuffer = pb;
        mPayload = pn;
        mIsPostRequest = true;
        mDownloadContextMediaType = s1;
        mMediaType = s2;
        mPosterId = s3;
        mRequestTag = s4;
    }

    public final EasyMetric addAdditionalParams(EasyMetric easymetric)
    {
        if (mDownloadContextMediaType != null)
        {
            easymetric.a("type", mDownloadContextMediaType);
        }
        if (mMediaType != null)
        {
            easymetric.a("media_type", mMediaType);
        }
        if (mPosterId != null)
        {
            easymetric.a("poster_id", mPosterId);
        }
        return super.addAdditionalParams(easymetric);
    }

    public final HttpMethod getMethod()
    {
        if (mIsPostRequest)
        {
            return HttpMethod.POST;
        } else
        {
            return HttpMethod.GET;
        }
    }

    public final pn getRequestPayload()
    {
        return mPayload;
    }

    public final String getRequestTag()
    {
        return mRequestTag;
    }

    public final Pb getResponseBuffer()
    {
        return mResponseBuffer;
    }

    public final String getUrl()
    {
        return mUrl;
    }
}
