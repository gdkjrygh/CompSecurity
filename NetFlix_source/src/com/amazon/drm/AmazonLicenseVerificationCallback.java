// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.drm;

import com.netflix.mediaclient.Log;

public class AmazonLicenseVerificationCallback
{

    private static final String TAG = "amazon";
    private static boolean called = false;

    public AmazonLicenseVerificationCallback()
    {
    }

    public static boolean isCalled()
    {
        com/amazon/drm/AmazonLicenseVerificationCallback;
        JVM INSTR monitorenter ;
        boolean flag = called;
        com/amazon/drm/AmazonLicenseVerificationCallback;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public static void onDRMSuccess()
    {
        com/amazon/drm/AmazonLicenseVerificationCallback;
        JVM INSTR monitorenter ;
        Log.v("amazon", "onDRMSuccess called!");
        called = true;
        com/amazon/drm/AmazonLicenseVerificationCallback;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
