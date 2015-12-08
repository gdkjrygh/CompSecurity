// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.util;

import com.dominos.android.sdk.common.LogUtil;
import com.dominos.beacon.model.Beacon;

public final class BeaconValidator
{

    private static final int BEACON_START_BYTE = 2;
    private static final char HEX_ARRAY[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'a', 'b', 'c', 'd', 'e', 'f'
    };
    private static final String HYPHEN = "-";
    private static final String TAG = com/dominos/beacon/util/BeaconValidator.getSimpleName();

    public BeaconValidator()
    {
    }

    public static String bytesToHex(byte abyte0[])
    {
        char ac[] = new char[abyte0.length * 2];
        for (int i = 0; i < abyte0.length; i++)
        {
            int j = abyte0[i] & 0xff;
            ac[i * 2] = HEX_ARRAY[j >>> 4];
            ac[i * 2 + 1] = HEX_ARRAY[j & 0xf];
        }

        return new String(ac);
    }

    public static Beacon getBeaconFromScannedRecord(byte abyte0[])
    {
        int i;
        LogUtil.d(TAG, bytesToHex(abyte0), new Object[0]);
        i = 2;
_L3:
        if (i > 5)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        if ((abyte0[i + 2] & 0xff) != 2 || (abyte0[i + 3] & 0xff) != 21) goto _L2; else goto _L1
_L1:
        byte byte0;
        byte0 = 1;
        LogUtil.d(TAG, "Found a valid beacon", new Object[0]);
_L4:
        if (byte0 == 0)
        {
            LogUtil.d(TAG, "This is not a beacon", new Object[0]);
            return null;
        } else
        {
            byte0 = abyte0[i + 20];
            byte byte1 = abyte0[i + 21];
            byte byte2 = abyte0[i + 22];
            byte byte3 = abyte0[i + 23];
            byte abyte1[] = new byte[16];
            System.arraycopy(abyte0, i + 4, abyte1, 0, 16);
            return new Beacon(toBeaconUUIDString(abyte1), (byte1 & 0xff) + (byte0 & 0xff) * 256, (byte3 & 0xff) + (byte2 & 0xff) * 256);
        }
_L2:
        i++;
          goto _L3
        byte0 = 0;
          goto _L4
    }

    public static String toBeaconUUIDString(byte abyte0[])
    {
        abyte0 = bytesToHex(abyte0);
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(abyte0.substring(0, 8));
        stringbuilder.append("-");
        stringbuilder.append(abyte0.substring(8, 12));
        stringbuilder.append("-");
        stringbuilder.append(abyte0.substring(12, 16));
        stringbuilder.append("-");
        stringbuilder.append(abyte0.substring(16, 20));
        stringbuilder.append("-");
        stringbuilder.append(abyte0.substring(20, 32));
        return stringbuilder.toString();
    }

}
