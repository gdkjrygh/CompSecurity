// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.analytics.tracking.android:
//            Tracker, EasyTracker, ExceptionParser, Transaction

class mSampleRate extends Tracker
{

    private String mAppId;
    private String mAppInstallerId;
    private ExceptionParser mExceptionParser;
    private boolean mIsAnonymizeIp;
    private boolean mIsUseSecure;
    private double mSampleRate;
    final EasyTracker this$0;

    public void close()
    {
    }

    public Map constructEvent(String s, String s1, String s2, Long long1)
    {
        return new HashMap();
    }

    public Map constructException(String s, boolean flag)
    {
        return new HashMap();
    }

    public Map constructRawException(String s, Throwable throwable, boolean flag)
    {
        return new HashMap();
    }

    public Map constructSocial(String s, String s1, String s2)
    {
        return new HashMap();
    }

    public Map constructTiming(String s, long l, String s1, String s2)
    {
        return new HashMap();
    }

    public Map constructTransaction(Transaction transaction)
    {
        return new HashMap();
    }

    public String get(String s)
    {
        return "";
    }

    public String getAppId()
    {
        return mAppId;
    }

    public String getAppInstallerId()
    {
        return mAppInstallerId;
    }

    public ExceptionParser getExceptionParser()
    {
        return mExceptionParser;
    }

    public double getSampleRate()
    {
        return mSampleRate;
    }

    public String getTrackingId()
    {
        return "";
    }

    public boolean isAnonymizeIpEnabled()
    {
        return mIsAnonymizeIp;
    }

    public boolean isUseSecure()
    {
        return mIsUseSecure;
    }

    public void send(String s, Map map)
    {
    }

    public void sendEvent(String s, String s1, String s2, Long long1)
    {
    }

    public void sendException(String s, Throwable throwable, boolean flag)
    {
    }

    public void sendException(String s, boolean flag)
    {
    }

    public void sendSocial(String s, String s1, String s2)
    {
    }

    public void sendTiming(String s, long l, String s1, String s2)
    {
    }

    public void sendTransaction(Transaction transaction)
    {
    }

    public void sendView()
    {
    }

    public void sendView(String s)
    {
    }

    public void set(String s, String s1)
    {
    }

    public void setAnonymizeIp(boolean flag)
    {
        mIsAnonymizeIp = flag;
    }

    public void setAppId(String s)
    {
        mAppId = s;
    }

    public void setAppInstallerId(String s)
    {
        mAppInstallerId = s;
    }

    public void setAppName(String s)
    {
    }

    public void setAppScreen(String s)
    {
    }

    public void setAppVersion(String s)
    {
    }

    public void setCampaign(String s)
    {
    }

    public void setCustomDimension(int i, String s)
    {
    }

    public void setCustomDimensionsAndMetrics(Map map, Map map1)
    {
    }

    public void setCustomMetric(int i, Long long1)
    {
    }

    public void setExceptionParser(ExceptionParser exceptionparser)
    {
        mExceptionParser = exceptionparser;
    }

    public void setReferrer(String s)
    {
    }

    public void setSampleRate(double d)
    {
        mSampleRate = d;
    }

    public void setStartSession(boolean flag)
    {
    }

    public void setUseSecure(boolean flag)
    {
        mIsUseSecure = flag;
    }

    ()
    {
        this$0 = EasyTracker.this;
        super();
        mSampleRate = 100D;
    }
}
