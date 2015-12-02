// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.wireless.security.open.dynamicdataencrypt;

import com.alibaba.wireless.security.open.IComponent;
import com.alibaba.wireless.security.open.SecException;

public interface IDynamicDataEncryptComponent
    extends IComponent
{

    public abstract String dynamicDecrypt(String s)
        throws SecException;

    public abstract byte[] dynamicDecryptByteArray(byte abyte0[])
        throws SecException;

    public abstract String dynamicEncrypt(String s)
        throws SecException;

    public abstract byte[] dynamicEncryptByteArray(byte abyte0[])
        throws SecException;
}
