// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.media;


// Referenced classes of package org.chromium.media:
//            MediaDrmBridge

private static class <init>
{

    private final byte mInitData[];
    private final String mMimeType;
    private final int mSessionId;

    private byte[] initData()
    {
        return mInitData;
    }

    private String mimeType()
    {
        return mMimeType;
    }

    private int sessionId()
    {
        return mSessionId;
    }




    private (int i, byte abyte0[], String s)
    {
        mSessionId = i;
        mInitData = abyte0;
        mMimeType = s;
    }

    mMimeType(int i, byte abyte0[], String s, mMimeType mmimetype)
    {
        this(i, abyte0, s);
    }
}
