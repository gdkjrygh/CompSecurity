// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.b;

import com.nuance.a.a.a.a.d.a.f;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class l extends f
{

    public l()
    {
    }

    protected final byte[] a(byte abyte0[], byte abyte1[])
    {
        return a(abyte0, abyte1, 0);
    }

    protected final byte[] a(byte abyte0[], byte abyte1[], int i)
    {
        if (abyte0 == null || abyte1 == null)
        {
            return new byte[0];
        }
        try
        {
            abyte0 = new SecretKeySpec(abyte0, "HmacSHA1");
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(abyte0);
            mac.update(abyte1, i, abyte1.length - i);
            abyte0 = mac.doFinal();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return new byte[0];
        }
        return abyte0;
    }
}
