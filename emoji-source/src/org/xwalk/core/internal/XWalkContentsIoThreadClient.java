// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;


// Referenced classes of package org.xwalk.core.internal:
//            InterceptedRequestData

interface XWalkContentsIoThreadClient
{

    public abstract int getCacheMode();

    public abstract void newLoginRequest(String s, String s1, String s2);

    public abstract void onDownloadStart(String s, String s1, String s2, String s3, long l);

    public abstract boolean shouldBlockContentUrls();

    public abstract boolean shouldBlockFileUrls();

    public abstract boolean shouldBlockNetworkLoads();

    public abstract InterceptedRequestData shouldInterceptRequest(String s, boolean flag);
}
