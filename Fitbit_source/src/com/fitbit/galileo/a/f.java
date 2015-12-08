// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.a;

import android.bluetooth.BluetoothDevice;

// Referenced classes of package com.fitbit.galileo.a:
//            c

public class f
{

    public f()
    {
    }

    public static String a(BluetoothDevice bluetoothdevice)
    {
        if (bluetoothdevice != null)
        {
            return a(bluetoothdevice.getAddress().replaceAll("[:]", ""));
        } else
        {
            return null;
        }
    }

    public static String a(String s)
    {
        if (s == null)
        {
            return null;
        }
        StringBuilder stringbuilder = new StringBuilder();
        byte byte0 = -1;
        if (s.length() % 2 != 0)
        {
            byte0 = 0;
        }
        for (int i = s.length() - 1; i > byte0; i -= 2)
        {
            stringbuilder.append(s.charAt(i - 1));
            stringbuilder.append(s.charAt(i));
        }

        stringbuilder.append(s.substring(0, s.length() - stringbuilder.length()));
        return stringbuilder.toString();
    }

    public static boolean a(String s, String s1)
    {
        boolean flag1 = true;
        boolean flag;
        if (s == null || s1 == null)
        {
            flag = false;
        } else
        {
            flag = flag1;
            if (!s.equalsIgnoreCase(s1))
            {
                flag = flag1;
                if (!s.equalsIgnoreCase(a(s1)))
                {
                    return false;
                }
            }
        }
        return flag;
    }

    public static String b(BluetoothDevice bluetoothdevice)
    {
        bluetoothdevice = com.fitbit.galileo.a.c.a(a(bluetoothdevice));
        byte byte1 = (byte)(bluetoothdevice[0] ^ bluetoothdevice[2] ^ bluetoothdevice[4]);
        byte byte2 = bluetoothdevice[1];
        byte byte3 = bluetoothdevice[3];
        byte byte0 = (byte)(bluetoothdevice[5] ^ (byte2 ^ byte3));
        return String.format("%02X%02X", new Object[] {
            Byte.valueOf((byte)(byte1 & 0x7f)), Byte.valueOf(byte0)
        });
    }

    public static String b(String s)
    {
        if (s == null || s.length() != 12)
        {
            return null;
        }
        StringBuilder stringbuilder = new StringBuilder(15);
        for (int i = 0; i < 12; i++)
        {
            if (i > 0 && i % 2 == 0)
            {
                stringbuilder.append(':');
            }
            stringbuilder.append(s.charAt(i));
        }

        return stringbuilder.toString();
    }

    public static String c(String s)
    {
        if (s != null)
        {
            return a(s.replaceAll("[:]", ""));
        } else
        {
            return null;
        }
    }
}
