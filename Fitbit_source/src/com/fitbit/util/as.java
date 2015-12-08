// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.nfc.NdefRecord;
import java.nio.charset.Charset;

public class as
{

    public static final Charset a = Charset.forName("UTF-8");
    public static final Charset b = Charset.forName("UTF-16BE");
    private static final byte c = 31;
    private static final short d = 128;

    public as()
    {
    }

    public static String a(NdefRecord ndefrecord)
    {
        byte abyte0[] = ndefrecord.getPayload();
        int i = abyte0[0] & 0xff;
        int j = i & 0x1f;
        if ((i & 0x80) != 0)
        {
            ndefrecord = b;
        } else
        {
            ndefrecord = a;
        }
        return new String(abyte0, j + 1, abyte0.length - j - 1, ndefrecord);
    }

}
