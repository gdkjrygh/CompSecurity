// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.ota;

import java.io.Serializable;

// Referenced classes of package com.fitbit.galileo.ota:
//            GalileoOtaMessages

public static class reservedBit
    implements Serializable
{

    public static final int a = 5;
    private static final long serialVersionUID = 1L;
    public final byte canDisplayNumberBit;
    public final byte colorCode4Bits;
    public final byte isAncsReady;
    public final byte isBondedToCurrentPeer;
    public final byte isTrackerBonded;
    public final byte productId;
    public final byte reservedBit;
    public final byte specialModeBit;
    public final byte syncedRecentlyBit;

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("BondInfo[");
        stringbuilder.append("isTrackerBonded = ").append(isTrackerBonded).append(", ");
        stringbuilder.append("isBondedToCurrentPeer = ").append(isBondedToCurrentPeer).append(", ");
        stringbuilder.append("isAncsReady = ").append(isAncsReady);
        return stringbuilder.append("]").toString();
    }

    public (byte abyte0[])
    {
        isTrackerBonded = abyte0[0];
        isBondedToCurrentPeer = abyte0[1];
        isAncsReady = abyte0[2];
        productId = abyte0[3];
        specialModeBit = (byte)(abyte0[4] & 1);
        syncedRecentlyBit = (byte)(abyte0[4] >>> 1 & 1);
        canDisplayNumberBit = (byte)(abyte0[4] >>> 2 & 1);
        colorCode4Bits = (byte)(abyte0[4] >>> 3 & 0xf);
        reservedBit = (byte)(abyte0[4] >>> 7 & 1);
    }
}
