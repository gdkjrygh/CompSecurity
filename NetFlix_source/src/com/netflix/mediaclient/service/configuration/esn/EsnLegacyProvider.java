// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration.esn;

import android.content.Context;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.StringUtils;

// Referenced classes of package com.netflix.mediaclient.service.configuration.esn:
//            BaseEsnProvider

public class EsnLegacyProvider extends BaseEsnProvider
{

    EsnLegacyProvider()
    {
    }

    public void destroy()
    {
    }

    protected String findDeviceId(Context context)
    {
        String s1 = getIMEA(context);
        String s = s1;
        if (s1 == null)
        {
            s = getMacAddress(context);
        }
        s1 = s;
        if (s == null)
        {
            s1 = getAndroidId(context);
        }
        if (s1 == null)
        {
            Log.w("ESN", "Device ID not found");
            return "UKNOWN";
        }
        if ("000000000000000".equalsIgnoreCase(s1))
        {
            Log.w("ESN", "Emulator");
            return "1012UAR71QB0A91";
        } else
        {
            return StringUtils.replaceWhiteSpace(s1, DELIM);
        }
    }

    protected String findModelId()
    {
        return findBaseModelId();
    }

    public int getCryptoFactoryType()
    {
        return 1;
    }
}
