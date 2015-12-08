// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.a;

import java.util.Iterator;
import java.util.List;

public class c
{

    public c()
    {
    }

    public static int a(List list)
    {
        list = list.iterator();
        int i;
        for (i = 0; list.hasNext(); i = ((byte[])list.next()).length + i) { }
        return i;
    }

    public static String a(byte abyte0[])
    {
        int i = 0;
        if (abyte0 == null || abyte0.length <= 0)
        {
            return null;
        }
        String as[] = new String[16];
        as[0] = "0";
        as[1] = "1";
        as[2] = "2";
        as[3] = "3";
        as[4] = "4";
        as[5] = "5";
        as[6] = "6";
        as[7] = "7";
        as[8] = "8";
        as[9] = "9";
        as[10] = "A";
        as[11] = "B";
        as[12] = "C";
        as[13] = "D";
        as[14] = "E";
        as[15] = "F";
        StringBuffer stringbuffer = new StringBuffer(abyte0.length * 2);
        do
        {
            if (i >= abyte0.length)
            {
                break;
            }
            stringbuffer.append(as[(byte)((byte)((byte)(abyte0[i] & 0xf0) >>> 4) & 0xf)]);
            stringbuffer.append(as[(byte)(abyte0[i] & 0xf)]);
            int j = i + 1;
            i = j;
            if (j % 4 == 0)
            {
                stringbuffer.append(" ");
                i = j;
            }
        } while (true);
        return new String(stringbuffer);
    }

    public static byte[] a(String s)
    {
        int j = s.length();
        byte abyte0[] = new byte[j / 2];
        for (int i = 0; i < j; i += 2)
        {
            abyte0[i / 2] = (byte)((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
        }

        return abyte0;
    }

    public static byte[] b(byte abyte0[])
    {
        if (abyte0 != null) goto _L2; else goto _L1
_L1:
        byte abyte1[] = null;
_L4:
        return abyte1;
_L2:
        int j = abyte0.length;
        byte abyte2[] = new byte[j];
        int i = 0;
        do
        {
            abyte1 = abyte2;
            if (i >= j)
            {
                continue;
            }
            abyte2[j - i - 1] = abyte0[i];
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
