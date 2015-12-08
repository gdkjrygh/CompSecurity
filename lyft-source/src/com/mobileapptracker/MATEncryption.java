// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobileapptracker;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class MATEncryption
{

    private IvParameterSpec a;
    private SecretKeySpec b;
    private Cipher c;

    public MATEncryption(String s, String s1)
    {
        a = new IvParameterSpec(s1.getBytes());
        b = new SecretKeySpec(s.getBytes(), "AES");
        try
        {
            c = Cipher.getInstance("AES/CBC/NoPadding");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }

    private static String b(String s)
    {
        int j = s.length();
        for (int i = 0; i < 16 - j % 16; i++)
        {
            s = (new StringBuilder()).append(s).append(' ').toString();
        }

        return s;
    }

    public byte[] a(String s)
    {
        if (s == null || s.length() == 0)
        {
            throw new Exception("Empty string");
        }
        try
        {
            c.init(1, b, a);
            s = c.doFinal(b(s).getBytes());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new Exception((new StringBuilder()).append("[encrypt] ").append(s.getMessage()).toString());
        }
        return s;
    }
}
