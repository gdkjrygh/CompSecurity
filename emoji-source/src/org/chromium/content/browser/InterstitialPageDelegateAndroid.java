// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;


public class InterstitialPageDelegateAndroid
{

    private long mNativePtr;

    public InterstitialPageDelegateAndroid(String s)
    {
        mNativePtr = nativeInit(s);
    }

    private native void nativeDontProceed(long l);

    private native long nativeInit(String s);

    private native void nativeProceed(long l);

    private void onNativeDestroyed()
    {
        mNativePtr = 0L;
    }

    protected void commandReceived(String s)
    {
    }

    protected void dontProceed()
    {
        if (mNativePtr != 0L)
        {
            nativeDontProceed(mNativePtr);
        }
    }

    public long getNative()
    {
        return mNativePtr;
    }

    protected void onDontProceed()
    {
    }

    protected void onProceed()
    {
    }

    protected void proceed()
    {
        if (mNativePtr != 0L)
        {
            nativeProceed(mNativePtr);
        }
    }
}
