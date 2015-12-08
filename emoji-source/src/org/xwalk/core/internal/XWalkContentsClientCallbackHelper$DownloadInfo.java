// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;


// Referenced classes of package org.xwalk.core.internal:
//            XWalkContentsClientCallbackHelper

private static class mContentLength
{

    final String mContentDisposition;
    final long mContentLength;
    final String mMimeType;
    final String mUrl;
    final String mUserAgent;

    (String s, String s1, String s2, String s3, long l)
    {
        mUrl = s;
        mUserAgent = s1;
        mContentDisposition = s2;
        mMimeType = s3;
        mContentLength = l;
    }
}
