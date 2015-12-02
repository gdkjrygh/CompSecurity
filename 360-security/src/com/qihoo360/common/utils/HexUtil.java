// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;

import java.math.BigInteger;
import org.apache.commons.codec.binary.Hex;

public class HexUtil
{

    public HexUtil()
    {
    }

    public static String bytes2HexStr(byte abyte0[])
    {
        if (abyte0 != null)
        {
            return new String(Hex.encodeHex(abyte0));
        } else
        {
            return null;
        }
    }

    public static byte[] hexStr2Bytes(String s)
    {
        s = (new BigInteger((new StringBuilder("10")).append(s).toString(), 16)).toByteArray();
        byte abyte0[] = new byte[s.length - 1];
        int i = 0;
        do
        {
            if (i >= abyte0.length)
            {
                return abyte0;
            }
            abyte0[i] = s[i + 1];
            i++;
        } while (true);
    }
}
