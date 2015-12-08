// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import com.google.android.gms.common.internal.z;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.common:
//            j

static abstract class a
{

    private int a;

    protected static byte[] a(String s)
    {
        try
        {
            s = s.getBytes("ISO-8859-1");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError(s);
        }
        return s;
    }

    abstract byte[] a();

    public boolean equals(Object obj)
    {
        if (obj == null || !(obj instanceof a))
        {
            return false;
        } else
        {
            obj = (a)obj;
            return Arrays.equals(a(), ((a) (obj)).a());
        }
    }

    public int hashCode()
    {
        return a;
    }

    protected on(byte abyte0[])
    {
        boolean flag;
        if (abyte0.length == 25)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        z.b(flag, "cert hash data has incorrect length");
        a = Arrays.hashCode(abyte0);
    }
}
