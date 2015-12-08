// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;


public class XWalkHttpAuthHandler
{

    private final boolean mFirstAttempt;
    private long mNativeXWalkHttpAuthHandler;

    private XWalkHttpAuthHandler(long l, boolean flag)
    {
        mNativeXWalkHttpAuthHandler = l;
        mFirstAttempt = flag;
    }

    public static XWalkHttpAuthHandler create(long l, boolean flag)
    {
        return new XWalkHttpAuthHandler(l, flag);
    }

    private native void nativeCancel(long l);

    private native void nativeProceed(long l, String s, String s1);

    public void cancel()
    {
        if (mNativeXWalkHttpAuthHandler != 0L)
        {
            nativeCancel(mNativeXWalkHttpAuthHandler);
            mNativeXWalkHttpAuthHandler = 0L;
        }
    }

    void handlerDestroyed()
    {
        mNativeXWalkHttpAuthHandler = 0L;
    }

    public boolean isFirstAttempt()
    {
        return mFirstAttempt;
    }

    public void proceed(String s, String s1)
    {
        if (mNativeXWalkHttpAuthHandler != 0L)
        {
            nativeProceed(mNativeXWalkHttpAuthHandler, s, s1);
            mNativeXWalkHttpAuthHandler = 0L;
        }
    }
}
