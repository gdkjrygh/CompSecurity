// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration.esn;

import android.content.Context;
import com.netflix.mediaclient.service.configuration.drm.DrmManager;

// Referenced classes of package com.netflix.mediaclient.service.configuration.esn:
//            BaseEsnProvider

public class EsnCdmNexus7Provider extends BaseEsnProvider
{

    private static final String DEVICE_TYPE_PREFIX = "PRV-";
    private String drmSystemId;
    private String drmUniqueDeviceId;

    EsnCdmNexus7Provider(DrmManager drmmanager)
    {
        if (drmmanager == null)
        {
            throw new IllegalArgumentException("DrmManager is null!");
        }
        byte abyte0[] = drmmanager.getDeviceId();
        drmSystemId = drmmanager.getDeviceType();
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("MediaDrm.uniqueDeviceId is null! We can not use this ESN implementation!");
        } else
        {
            drmUniqueDeviceId = new String(abyte0);
            return;
        }
    }

    public void destroy()
    {
    }

    protected String findDeviceId(Context context)
    {
        return drmUniqueDeviceId;
    }

    protected String findModelId()
    {
        return (new StringBuilder()).append("PRV-").append(drmSystemId).toString();
    }

    public int getCryptoFactoryType()
    {
        return 2;
    }
}
