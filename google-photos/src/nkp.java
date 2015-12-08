// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Base64;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public final class nkp
    implements nko
{

    private static final int c;
    public final byte a[];
    public final long b;

    public nkp(byte abyte0[], long l)
    {
        if (abyte0 == null || abyte0.length != c)
        {
            throw new IllegalArgumentException("Incorrect fingerprint size");
        } else
        {
            a = abyte0;
            b = l;
            return;
        }
    }

    public static String a(InputStream inputstream)
    {
        if (inputstream == null)
        {
            return null;
        } else
        {
            return b(inputstream).a();
        }
    }

    public static String a(String s)
    {
        if (s == null)
        {
            return null;
        }
        s = String.valueOf(s.substring(0, 32));
        if (s.length() != 0)
        {
            return "cs_01_".concat(s);
        } else
        {
            return new String("cs_01_");
        }
    }

    public static nkp b(InputStream inputstream)
    {
        Object obj1;
        byte abyte0[];
        abyte0 = new byte[8192];
        obj1 = null;
        Object obj;
        obj = MessageDigest.getInstance("SHA-1");
        obj = new DigestInputStream(new BufferedInputStream(inputstream, 8192), ((MessageDigest) (obj)));
        long l = 0L;
_L2:
        inputstream = ((InputStream) (obj));
        int i = ((DigestInputStream) (obj)).read(abyte0);
        if (i >= 0)
        {
            l += i;
        } else
        {
            ((DigestInputStream) (obj)).close();
            return new nkp(((DigestInputStream) (obj)).getMessageDigest().digest(), l);
        }
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        inputstream = null;
_L6:
        throw new IllegalStateException(((Throwable) (obj1)));
        obj1;
        obj = inputstream;
        inputstream = ((InputStream) (obj1));
_L4:
        if (obj != null)
        {
            ((DigestInputStream) (obj)).close();
        }
        throw inputstream;
        inputstream;
        obj = obj1;
        if (true) goto _L4; else goto _L3
_L3:
        obj1;
        inputstream = ((InputStream) (obj));
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final String a()
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < c; i++)
        {
            byte byte0 = a[i];
            stringbuilder.append(Integer.toHexString(byte0 >> 4 & 0xf));
            stringbuilder.append(Integer.toHexString(byte0 & 0xf));
        }

        return stringbuilder.toString();
    }

    public final String b()
    {
        return Base64.encodeToString(a, 11);
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof nkp))
        {
            return false;
        } else
        {
            obj = (nkp)obj;
            return Arrays.equals(a, ((nkp) (obj)).a);
        }
    }

    public final int hashCode()
    {
        return Arrays.hashCode(a);
    }

    static 
    {
        try
        {
            c = MessageDigest.getInstance("SHA-1").getDigestLength();
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            throw new IllegalStateException(nosuchalgorithmexception);
        }
    }
}
