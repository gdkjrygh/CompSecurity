// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.util;

import android.util.Base64;

public final class Base64Utils
{

    public static byte[] decodeUrlSafe(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return Base64.decode(s, 10);
        }
    }

    public static String encode(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return null;
        } else
        {
            return Base64.encodeToString(abyte0, 0);
        }
    }

    public static String encodeUrlSafe(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return null;
        } else
        {
            return Base64.encodeToString(abyte0, 10);
        }
    }
}
