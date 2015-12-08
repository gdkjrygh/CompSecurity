// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.crypto;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class KeyGeneratorWrapper
{

    private static final String ALGORITHM = "AES";
    static final int GENERATED_KEY_SIZE = 16;
    private static final int KEY_SIZE = 128;

    public KeyGeneratorWrapper()
    {
    }

    public byte[] generateKey(SecureRandom securerandom)
        throws NoSuchAlgorithmException
    {
        KeyGenerator keygenerator = KeyGenerator.getInstance("AES");
        keygenerator.init(128, securerandom);
        return keygenerator.generateKey().getEncoded();
    }
}
