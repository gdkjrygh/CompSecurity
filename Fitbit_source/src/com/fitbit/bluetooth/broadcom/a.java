// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom;

import com.fitbit.galileo.a.c;
import java.util.Arrays;
import java.util.UUID;

public class a
{

    public a()
    {
    }

    public static String a(int i)
    {
        if (i == 0)
        {
            return "SUCCESS";
        } else
        {
            return (new StringBuilder()).append("ERROR ").append(i).toString();
        }
    }

    public static UUID a(byte abyte0[])
    {
        Object obj = null;
        UUID uuid = obj;
        if (abyte0 != null)
        {
            uuid = obj;
            if (abyte0.length >= 21)
            {
                abyte0 = new StringBuffer(com.fitbit.galileo.a.c.a(com.fitbit.galileo.a.c.b(Arrays.copyOfRange(abyte0, 5, 21))).replace(" ", ""));
                abyte0.insert(8, "-").insert(13, "-").insert(18, "-").insert(23, "-");
                try
                {
                    uuid = UUID.fromString(abyte0.toString());
                }
                // Misplaced declaration of an exception variable
                catch (byte abyte0[])
                {
                    return null;
                }
            }
        }
        return uuid;
    }

    public static String b(int i)
    {
        switch (i)
        {
        default:
            return "UNKNOWN_STATE";

        case 2: // '\002'
            return "STATE_CONNECTED";

        case 0: // '\0'
            return "STATE_DISCONNECTED";

        case 1: // '\001'
            return "STATE_CONNECTING";

        case 3: // '\003'
            return "STATE_DISCONNECTING";
        }
    }

    public static String b(byte abyte0[])
    {
        if (abyte0.length >= 27)
        {
            return com.fitbit.galileo.a.c.a(com.fitbit.galileo.a.c.b(Arrays.copyOfRange(abyte0, 25, 27)));
        } else
        {
            return null;
        }
    }

    public static byte c(byte abyte0[])
    {
        byte byte0 = 0;
        if (abyte0.length >= 27)
        {
            byte0 = Arrays.copyOfRange(abyte0, 25, 26)[0];
        }
        return byte0;
    }
}
