// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.wireless.security.open.staticdataencrypt;

import com.alibaba.wireless.security.open.IComponent;
import com.alibaba.wireless.security.open.SecException;

public interface IStaticDataEncryptComponent
    extends IComponent
{

    public static final int ALGORITHM_MAX_NUMBER = 19;
    public static final int OPEN_ENUM_CIPHER_AES128 = 16;
    public static final int OPEN_ENUM_CIPHER_AES192 = 17;
    public static final int OPEN_ENUM_CIPHER_AES256 = 18;

    public abstract byte[] staticBinarySafeDecrypt(int i, String s, byte abyte0[], String s1)
        throws SecException;

    public abstract byte[] staticBinarySafeEncrypt(int i, String s, byte abyte0[], String s1)
        throws SecException;

    public abstract String staticSafeDecrypt(int i, String s, String s1, String s2)
        throws SecException;

    public abstract String staticSafeEncrypt(int i, String s, String s1, String s2)
        throws SecException;
}
