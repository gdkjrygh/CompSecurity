// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar.enums;


public final class KeyPurpose extends Enum
{

    private static final KeyPurpose $VALUES[];
    public static final KeyPurpose DECRYPT_AND_ENCRYPT;
    public static final KeyPurpose ENCRYPT;
    public static final KeyPurpose SIGN_AND_VERIFY;
    public static final KeyPurpose TEST;
    public static final KeyPurpose VERIFY;
    private String name;
    private int value;

    private KeyPurpose(String s, int i, int j, String s1)
    {
        super(s, i);
        value = j;
        name = s1;
    }

    public static KeyPurpose valueOf(String s)
    {
        return (KeyPurpose)Enum.valueOf(org/keyczar/enums/KeyPurpose, s);
    }

    public static KeyPurpose[] values()
    {
        return (KeyPurpose[])$VALUES.clone();
    }

    static 
    {
        DECRYPT_AND_ENCRYPT = new KeyPurpose("DECRYPT_AND_ENCRYPT", 0, 0, "crypt");
        ENCRYPT = new KeyPurpose("ENCRYPT", 1, 1, "encrypt");
        SIGN_AND_VERIFY = new KeyPurpose("SIGN_AND_VERIFY", 2, 2, "sign");
        VERIFY = new KeyPurpose("VERIFY", 3, 3, "verify");
        TEST = new KeyPurpose("TEST", 4, 127, "test");
        $VALUES = (new KeyPurpose[] {
            DECRYPT_AND_ENCRYPT, ENCRYPT, SIGN_AND_VERIFY, VERIFY, TEST
        });
    }
}
