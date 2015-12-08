// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.amazon;

import com.urbanairship.Logger;

// Referenced classes of package com.urbanairship.amazon:
//            ADMWrapper

public class ADMUtils
{

    private static Boolean isADMAvailable;

    public ADMUtils()
    {
    }

    public static boolean isADMAvailable()
    {
        if (isADMAvailable != null)
        {
            return isADMAvailable.booleanValue();
        }
        try
        {
            Class.forName("com.amazon.device.messaging.ADM");
            isADMAvailable = Boolean.valueOf(true);
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            isADMAvailable = Boolean.valueOf(false);
        }
        return isADMAvailable.booleanValue();
    }

    public static boolean isADMSupported()
    {
        return isADMAvailable() && ADMWrapper.isSupported();
    }

    public static void validateManifest()
    {
        if (isADMAvailable())
        {
            ADMWrapper.validateManifest();
            return;
        } else
        {
            Logger.warn("ADM is not available on this device.");
            return;
        }
    }
}
