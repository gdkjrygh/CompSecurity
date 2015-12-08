// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.http;


public interface HttpClientConfiguration
{

    public abstract int getHttpConnectionTimeout();

    public abstract int getHttpDefaultMaxPerRoute();

    public abstract int getHttpMaxTotalConnections();

    public abstract String getHttpProxyHost();

    public abstract String getHttpProxyPassword();

    public abstract int getHttpProxyPort();

    public abstract String getHttpProxyUser();

    public abstract int getHttpReadTimeout();

    public abstract int getHttpRetryCount();

    public abstract int getHttpRetryIntervalSeconds();

    public abstract boolean isGZIPEnabled();

    public abstract boolean isPrettyDebugEnabled();
}
