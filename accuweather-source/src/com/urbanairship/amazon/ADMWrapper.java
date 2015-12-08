// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.amazon;

import com.amazon.device.messaging.ADM;
import com.amazon.device.messaging.development.ADMManifest;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;

class ADMWrapper
{

    ADMWrapper()
    {
    }

    public static boolean isSupported()
    {
        boolean flag;
        try
        {
            flag = (new ADM(UAirship.getApplicationContext())).isSupported();
        }
        catch (RuntimeException runtimeexception)
        {
            Logger.error("Failed to call ADM. Make sure ADM jar is not bundled with the APK.");
            return false;
        }
        return flag;
    }

    public static void validateManifest()
    {
        try
        {
            ADMManifest.checkManifestAuthoredProperly(UAirship.getApplicationContext());
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            Logger.error("AndroidManifest invalid ADM setup.", runtimeexception);
        }
    }
}
