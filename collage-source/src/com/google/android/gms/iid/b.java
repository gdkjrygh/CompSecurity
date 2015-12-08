// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.iid;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class b
{

    public static KeyPair a()
    {
        Object obj;
        try
        {
            obj = KeyPairGenerator.getInstance("RSA");
            ((KeyPairGenerator) (obj)).initialize(2048);
            obj = ((KeyPairGenerator) (obj)).generateKeyPair();
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            throw new AssertionError(nosuchalgorithmexception);
        }
        return ((KeyPair) (obj));
    }
}
