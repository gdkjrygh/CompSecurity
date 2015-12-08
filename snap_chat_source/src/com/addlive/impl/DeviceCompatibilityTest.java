// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.impl;

import android.os.Build;
import com.addlive.platform.DeviceSupportLevel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.addlive.impl:
//            Log

public class DeviceCompatibilityTest
{

    private static final String AUDIO_ONLY_DEVICES[] = new String[0];
    private static final String SUPPORTED_DEVICES[] = {
        "Nexus 4", "Nexus 5", "Nexus 7", "GT-N8000", "SM-P601", "GT-I93..", "GT-I95..", "SGH-M919", "GT-I91..", "GT-N7000", 
        "SC-02C", "SHW-M250.", "SPH-D710BST", "GT-N71..", "htc_jewel", "EVO", "HTC 801e", "HTCONE", "HTC One", "HTC One 801e", 
        "HTL22", "M7", "DROID RAZR HD", "XT1058"
    };
    private static String TAG = "DeviceCompatibilityTest";

    public DeviceCompatibilityTest()
    {
    }

    public static DeviceSupportLevel assessCompatibility()
    {
        if (android.os.Build.VERSION.SDK_INT < 16 && !isGalaxyS3())
        {
            return DeviceSupportLevel.NOT_FUNCTIONAL;
        }
        if (isWhiteListed(SUPPORTED_DEVICES))
        {
            return DeviceSupportLevel.FULLY_SUPPORTED;
        }
        if (!supportsNeon())
        {
            return DeviceSupportLevel.NOT_FUNCTIONAL;
        }
        if (isWhiteListed(AUDIO_ONLY_DEVICES))
        {
            return DeviceSupportLevel.AUDIO_ONLY;
        } else
        {
            return DeviceSupportLevel.NOT_SUPPORTED;
        }
    }

    private static boolean checkForNeonSupport(BufferedReader bufferedreader)
    {
        do
        {
            String s = bufferedreader.readLine();
            if (s != null)
            {
                if (s.contains("Features") && Arrays.asList(s.split(" ")).contains("neon"))
                {
                    Log.i(TAG, "Device supports neon extension");
                    return true;
                }
            } else
            {
                Log.i(TAG, "Device does not support neon extension");
                return false;
            }
        } while (true);
    }

    private static boolean isGalaxyS3()
    {
        boolean flag = false;
        if (Build.DEVICE.equals("m0") || Build.DEVICE.regionMatches(false, 0, "d2", 0, 2))
        {
            flag = true;
        }
        return flag;
    }

    private static boolean isWhiteListed(String as[])
    {
        boolean flag1 = false;
        String s = Build.MODEL;
        int j = as.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    if (!s.matches(as[i]))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    private static boolean supportsNeon()
    {
        BufferedReader bufferedreader = new BufferedReader(new FileReader("/proc/cpuinfo"));
        boolean flag = checkForNeonSupport(bufferedreader);
        bufferedreader.close();
        return flag;
        Exception exception;
        exception;
        try
        {
            bufferedreader.close();
            throw exception;
        }
        catch (IOException ioexception)
        {
            Log.e(TAG, "Could not read cpuinfo file, assuming neon isn't supported");
        }
        return false;
    }

}
