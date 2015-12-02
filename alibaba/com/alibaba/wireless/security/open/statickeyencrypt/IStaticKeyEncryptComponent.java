// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.wireless.security.open.statickeyencrypt;

import com.alibaba.wireless.security.open.IComponent;
import com.alibaba.wireless.security.open.SecException;

public interface IStaticKeyEncryptComponent
    extends IComponent
{

    public static final int OPEN_ALGORITHM_MAX_NUMBER = 20;
    public static final int OPEN_CIPHER_AES128 = 16;
    public static final int OPEN_CIPHER_AES192 = 17;
    public static final int OPEN_CIPHER_AES256 = 18;
    public static final int OPEN_NO_SUCH_ITEM = 2;
    public static final int OPEN_OVERRIDE_SUCCESS = 2;
    public static final int OPEN_REMOVE_FAILED = 0;
    public static final int OPEN_REMOVE_SUCCESS = 1;
    public static final int OPEN_SAVE_FAILED = 0;
    public static final int OPEN_SAVE_SUCCESS = 1;

    public abstract byte[] decrypt(int i, String s, byte abyte0[])
        throws SecException;

    public abstract byte[] encrypt(int i, String s, byte abyte0[])
        throws SecException;

    public abstract byte[] encryptSecretData(int i, String s, String s1)
        throws SecException;

    public abstract boolean isSecretExist(String s)
        throws SecException;

    public abstract int removeSecret(String s)
        throws SecException;

    public abstract int saveSecret(String s, byte abyte0[])
        throws SecException;
}
