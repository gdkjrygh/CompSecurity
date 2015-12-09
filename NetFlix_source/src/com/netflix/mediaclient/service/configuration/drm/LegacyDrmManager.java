// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration.drm;


// Referenced classes of package com.netflix.mediaclient.service.configuration.drm:
//            DrmManager

public final class LegacyDrmManager
    implements DrmManager
{

    private DrmManager.DrmReadyCallback mCallback;

    LegacyDrmManager(DrmManager.DrmReadyCallback drmreadycallback)
    {
        mCallback = drmreadycallback;
    }

    public void destroy()
    {
    }

    public byte[] getDeviceId()
    {
        return null;
    }

    public String getDeviceType()
    {
        return null;
    }

    public int getDrmType()
    {
        return 0;
    }

    public void init()
    {
        mCallback.drmReady();
    }
}
