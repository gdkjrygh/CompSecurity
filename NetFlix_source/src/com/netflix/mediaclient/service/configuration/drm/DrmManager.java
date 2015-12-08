// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration.drm;


public interface DrmManager
{
    public static interface DrmReadyCallback
    {

        public abstract void drmError(int i);

        public abstract void drmReady();
    }


    public static final int DRM_TYPE_NONE = 0;
    public static final int DRM_TYPE_WIDEVINE = 1;

    public abstract void destroy();

    public abstract byte[] getDeviceId();

    public abstract String getDeviceType();

    public abstract int getDrmType();

    public abstract void init();
}
