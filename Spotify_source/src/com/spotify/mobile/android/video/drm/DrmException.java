// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.video.drm;


public final class DrmException extends Exception
{

    private static final long serialVersionUID = 0x16f1e1c642L;
    public final int mReason;

    public DrmException(int i)
    {
        mReason = i;
    }

    public DrmException(int i, Exception exception)
    {
        super(exception);
        mReason = i;
    }
}
