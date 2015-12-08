// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration.esn;

import android.content.Context;
import android.os.Build;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.configuration.drm.DrmManager;
import com.netflix.mediaclient.util.DeviceCategory;
import com.netflix.mediaclient.util.StringUtils;

// Referenced classes of package com.netflix.mediaclient.service.configuration.esn:
//            BaseEsnProvider

public class EsnCdmProvider extends BaseEsnProvider
{

    private static final String CATEGORY_TYPE_PHONE = "P-";
    private static final String CATEGORY_TYPE_TABLET = "T-";
    private static final String DASH = "-";
    private static final String DEVICE_TYPE_PREFIX = "PRV-";
    private String mCdmModelId;
    private String mDrmSystemId;
    private String mDrmUniqueDeviceId;

    EsnCdmProvider(DrmManager drmmanager, DeviceCategory devicecategory)
    {
        if (drmmanager == null)
        {
            throw new IllegalArgumentException("DrmManager is null!");
        }
        byte abyte0[] = drmmanager.getDeviceId();
        mDrmSystemId = drmmanager.getDeviceType();
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("MediaDrm.uniqueDeviceId is null! We can not use this ESN implementation!");
        } else
        {
            mDrmUniqueDeviceId = new String(abyte0);
            mCdmModelId = findCdmModelId(devicecategory);
            return;
        }
    }

    private String findCdmModelId(DeviceCategory devicecategory)
    {
        boolean flag = false;
        if (devicecategory == DeviceCategory.PHONE)
        {
            flag = true;
        }
        StringBuilder stringbuilder = new StringBuilder("PRV-");
        String s;
        if (flag)
        {
            stringbuilder.append("P-");
        } else
        {
            stringbuilder.append("T-");
        }
        if (Log.isLoggable("ESN", 3))
        {
            Log.d("ESN", (new StringBuilder()).append("MANUFACTURER ").append(Build.MANUFACTURER).toString());
            Log.d("ESN", (new StringBuilder()).append("Model ").append(Build.MODEL).toString());
        }
        s = Build.MODEL;
        devicecategory = s;
        if (s.length() > 45)
        {
            s = s.substring(0, 45);
            devicecategory = s;
            if (Log.isLoggable("ESN", 3))
            {
                Log.d("ESN", (new StringBuilder()).append("Model was bigger than: 45. Using first 45 characters: ").append(s).toString());
                devicecategory = s;
            }
        }
        devicecategory = (new StringBuilder()).append(getManufactorer()).append(StringUtils.replaceWhiteSpace(devicecategory, DELIM)).toString();
        if (Log.isLoggable("ESN", 3))
        {
            Log.d("ESN", (new StringBuilder()).append("Model ID: ").append(devicecategory).toString());
        }
        stringbuilder.append(validateChars(devicecategory));
        stringbuilder.append("-");
        stringbuilder.append(mDrmSystemId);
        return stringbuilder.toString();
    }

    public void destroy()
    {
    }

    protected String findDeviceId(Context context)
    {
        return mDrmUniqueDeviceId;
    }

    protected String findModelId()
    {
        return mCdmModelId;
    }

    public int getCryptoFactoryType()
    {
        return 2;
    }
}
