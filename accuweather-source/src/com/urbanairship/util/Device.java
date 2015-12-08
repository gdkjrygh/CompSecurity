// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.util;

import android.content.Context;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// Referenced classes of package com.urbanairship.util:
//            UAStringUtil

public class Device
{

    public Device()
    {
    }

    private static String computeHashedId(String s)
    {
        if (UAStringUtil.isEmpty(s))
        {
            return null;
        }
        s = s.getBytes();
        Object obj;
        int i;
        int j;
        try
        {
            obj = MessageDigest.getInstance("SHA-1");
            ((MessageDigest) (obj)).update(s, 0, s.length);
            s = ((MessageDigest) (obj)).digest();
            obj = new StringBuilder();
            j = s.length;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.error("Unable to hash the device ID: SHA1 digester not present");
            return null;
        }
        i = 0;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((StringBuilder) (obj)).append(String.format("%02x", new Object[] {
            Byte.valueOf(s[i])
        }));
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_46;
_L1:
        s = ((StringBuilder) (obj)).toString();
        return s;
    }

    public static String getHashedDeviceId()
    {
        String s = null;
        Object obj = UAirship.getApplicationContext();
        if (obj != null)
        {
            s = computeHashedId(android.provider.Settings.Secure.getString(((Context) (obj)).getContentResolver(), "android_id"));
        }
        obj = s;
        if (UAStringUtil.isEmpty(s))
        {
            obj = "unavailable";
        }
        return ((String) (obj));
    }
}
