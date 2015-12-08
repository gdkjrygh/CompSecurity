// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.ota;

import java.io.Serializable;

public class GalileoOtaMessages
{
    public static final class BootMode extends Enum
    {

        public static final BootMode a;
        public static final BootMode b;
        private static final BootMode c[];
        public final byte byteValue;

        public static BootMode a(byte byte0)
        {
            BootMode abootmode[] = values();
            int j1 = abootmode.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                BootMode bootmode = abootmode[i1];
                if (bootmode.byteValue == byte0)
                {
                    return bootmode;
                }
            }

            throw new IllegalArgumentException((new StringBuilder()).append("cannot parse value = ").append(byte0).toString());
        }

        public static BootMode valueOf(String s1)
        {
            return (BootMode)Enum.valueOf(com/fitbit/galileo/ota/GalileoOtaMessages$BootMode, s1);
        }

        public static BootMode[] values()
        {
            return (BootMode[])c.clone();
        }

        static 
        {
            a = new BootMode("RF_BOOTMODE_APP", 0, (byte)0);
            b = new BootMode("RF_BOOTMODE_BSL", 1, (byte)1);
            c = (new BootMode[] {
                a, b
            });
        }

        private BootMode(String s1, int i1, byte byte0)
        {
            super(s1, i1);
            byteValue = byte0;
        }
    }

    public static class RFBondInfoPacket
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

        public RFBondInfoPacket(byte abyte0[])
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


    public static final byte A = 0;
    public static final byte B = 1;
    public static final byte C = 2;
    public static final byte D = 3;
    public static final byte E = 4;
    public static final byte F = 5;
    public static final byte G = 0;
    public static final byte H = 1;
    public static final byte I = 2;
    public static final byte J = 3;
    public static final byte K = 4;
    public static final byte L = 0;
    public static final byte M = 1;
    public static final byte N = 2;
    public static final byte O = 0;
    public static final byte P = 1;
    public static final byte Q = 2;
    public static final byte R = 0;
    public static final byte S = 1;
    public static final byte T = 2;
    public static final byte U = 0;
    public static final byte V = 1;
    public static final byte W = 2;
    public static final byte X = 3;
    public static final byte Y = 4;
    public static final byte Z = 5;
    public static final int a = 8;
    public static final byte aa = 6;
    public static final byte ab = 7;
    public static final byte ac = 1;
    public static final byte b = -64;
    public static final byte c = -37;
    public static final byte d = -36;
    public static final byte e = -35;
    public static final byte f = 0;
    public static final byte g = 1;
    public static final byte h = 2;
    public static final byte i = 3;
    public static final byte j = 4;
    public static final byte k = 5;
    public static final byte l = 6;
    public static final byte m = 7;
    public static final byte n = 0;
    public static final byte o = 1;
    public static final byte p = 2;
    public static final byte q = 3;
    public static final byte r = 4;
    public static final byte s = 4;
    public static final byte t = 5;
    public static final byte u = 6;
    public static final byte v = 7;
    public static final byte w = 8;
    public static final byte x = 9;
    public static final byte y = 10;
    public static final byte z = 11;

    public GalileoOtaMessages()
    {
    }

    // Unreferenced inner class com/fitbit/galileo/ota/GalileoOtaMessages$FBActivityStatus
    /* block-local class not found */
    class FBActivityStatus {}


    // Unreferenced inner class com/fitbit/galileo/ota/GalileoOtaMessages$RFLiveDataPacket
    /* block-local class not found */
    class RFLiveDataPacket {}


    // Unreferenced inner class com/fitbit/galileo/ota/GalileoOtaMessages$TrackerBlock
    /* block-local class not found */
    class TrackerBlock {}


    // Unreferenced inner class com/fitbit/galileo/ota/GalileoOtaMessages$a
    /* block-local class not found */
    class a {}


    // Unreferenced inner class com/fitbit/galileo/ota/GalileoOtaMessages$b
    /* block-local class not found */
    class b {}


    // Unreferenced inner class com/fitbit/galileo/ota/GalileoOtaMessages$c
    /* block-local class not found */
    class c {}


    // Unreferenced inner class com/fitbit/galileo/ota/GalileoOtaMessages$d
    /* block-local class not found */
    class d {}


    // Unreferenced inner class com/fitbit/galileo/ota/GalileoOtaMessages$e
    /* block-local class not found */
    class e {}


    // Unreferenced inner class com/fitbit/galileo/ota/GalileoOtaMessages$f
    /* block-local class not found */
    class f {}


    // Unreferenced inner class com/fitbit/galileo/ota/GalileoOtaMessages$g
    /* block-local class not found */
    class g {}


    // Unreferenced inner class com/fitbit/galileo/ota/GalileoOtaMessages$h
    /* block-local class not found */
    class h {}


    // Unreferenced inner class com/fitbit/galileo/ota/GalileoOtaMessages$i
    /* block-local class not found */
    class i {}


    // Unreferenced inner class com/fitbit/galileo/ota/GalileoOtaMessages$j
    /* block-local class not found */
    class j {}


    // Unreferenced inner class com/fitbit/galileo/ota/GalileoOtaMessages$k
    /* block-local class not found */
    class k {}


    // Unreferenced inner class com/fitbit/galileo/ota/GalileoOtaMessages$l
    /* block-local class not found */
    class l {}


    // Unreferenced inner class com/fitbit/galileo/ota/GalileoOtaMessages$m
    /* block-local class not found */
    class m {}


    // Unreferenced inner class com/fitbit/galileo/ota/GalileoOtaMessages$n
    /* block-local class not found */
    class n {}


    // Unreferenced inner class com/fitbit/galileo/ota/GalileoOtaMessages$o
    /* block-local class not found */
    class o {}


    // Unreferenced inner class com/fitbit/galileo/ota/GalileoOtaMessages$p
    /* block-local class not found */
    class p {}


    // Unreferenced inner class com/fitbit/galileo/ota/GalileoOtaMessages$q
    /* block-local class not found */
    class q {}


    // Unreferenced inner class com/fitbit/galileo/ota/GalileoOtaMessages$r
    /* block-local class not found */
    class r {}


    // Unreferenced inner class com/fitbit/galileo/ota/GalileoOtaMessages$s
    /* block-local class not found */
    class s {}


    // Unreferenced inner class com/fitbit/galileo/ota/GalileoOtaMessages$t
    /* block-local class not found */
    class t {}


    // Unreferenced inner class com/fitbit/galileo/ota/GalileoOtaMessages$u
    /* block-local class not found */
    class u {}


    // Unreferenced inner class com/fitbit/galileo/ota/GalileoOtaMessages$v
    /* block-local class not found */
    class v {}


    // Unreferenced inner class com/fitbit/galileo/ota/GalileoOtaMessages$w
    /* block-local class not found */
    class w {}

}
