// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import java.io.InputStream;

class InterceptedRequestData
{

    private String mCharset;
    private InputStream mData;
    private String mMimeType;

    public InterceptedRequestData(String s, String s1, InputStream inputstream)
    {
        mMimeType = s;
        mCharset = s1;
        mData = inputstream;
    }

    public String getCharset()
    {
        return mCharset;
    }

    public InputStream getData()
    {
        return mData;
    }

    public String getMimeType()
    {
        return mMimeType;
    }
}
