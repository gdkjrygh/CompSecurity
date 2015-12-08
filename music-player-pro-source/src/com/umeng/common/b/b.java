// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.common.b;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.umeng.common.b:
//            c

public class b
{

    private static byte a[] = "uLi4/f4+Pb39.T19".getBytes();
    private static byte b[] = "nmeug.f9/Om+L823".getBytes();

    public b()
    {
    }

    public static String a(String s, String s1)
        throws Exception
    {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, new SecretKeySpec(a, "AES"), new IvParameterSpec(b));
        return c.d(cipher.doFinal(s.getBytes(s1)));
    }

    public static String b(String s, String s1)
        throws Exception
    {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, new SecretKeySpec(a, "AES"), new IvParameterSpec(b));
        return new String(cipher.doFinal(c.b(s)), s1);
    }

}
