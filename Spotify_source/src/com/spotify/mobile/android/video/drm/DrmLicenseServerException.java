// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.video.drm;


public class DrmLicenseServerException extends Exception
{

    private static final long serialVersionUID = 0x16f1e1c687L;
    public final int mHttpStatusCode;
    public final String mMessage;

    public DrmLicenseServerException(int i, String s)
    {
        mHttpStatusCode = i;
        mMessage = s;
    }
}
