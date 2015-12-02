// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taobao.wireless.security.sdk.staticdataencrypt;

import com.taobao.wireless.security.sdk.IComponent;

public interface IStaticDataEncryptComponent
    extends IComponent
{

    public static final int ALGORITHM_MAX_NUMBER = 19;
    public static final int GCRY_CIPHER_3DES = 2;
    public static final int GCRY_CIPHER_AES128 = 16;
    public static final int GCRY_CIPHER_AES192 = 17;
    public static final int GCRY_CIPHER_AES256 = 18;
    public static final int GCRY_CIPHER_ARCFOUR = 3;
    public static final int GCRY_CIPHER_BLOWFISH = 0;
    public static final int GCRY_CIPHER_CAMELLIA128 = 12;
    public static final int GCRY_CIPHER_CAMELLIA192 = 13;
    public static final int GCRY_CIPHER_CAMELLIA256 = 14;
    public static final int GCRY_CIPHER_CAST5 = 5;
    public static final int GCRY_CIPHER_DES = 1;
    public static final int GCRY_CIPHER_IDEA = 4;
    public static final int GCRY_CIPHER_RFC2268_40 = 15;
    public static final int GCRY_CIPHER_SEED = 11;
    public static final int GCRY_CIPHER_SERPENT128 = 8;
    public static final int GCRY_CIPHER_SERPENT192 = 9;
    public static final int GCRY_CIPHER_SERPENT256 = 10;
    public static final int GCRY_CIPHER_TWOFISH = 6;
    public static final int GCRY_CIPHER_TWOFISH128 = 7;

    public abstract byte[] staticBinarySafeDecrypt(int i, String s, byte abyte0[]);

    public abstract byte[] staticBinarySafeEncrypt(int i, String s, byte abyte0[]);

    public abstract String staticSafeDecrypt(int i, String s, String s1);

    public abstract String staticSafeEncrypt(int i, String s, String s1);
}
