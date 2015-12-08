// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.OutputStream;

public class JDKPKCS12StoreParameter
    implements java.security.KeyStore.LoadStoreParameter
{

    private OutputStream outputStream;
    private java.security.KeyStore.ProtectionParameter protectionParameter;
    private boolean useDEREncoding;

    public JDKPKCS12StoreParameter()
    {
    }

    public OutputStream getOutputStream()
    {
        return outputStream;
    }

    public java.security.KeyStore.ProtectionParameter getProtectionParameter()
    {
        return protectionParameter;
    }

    public boolean isUseDEREncoding()
    {
        return useDEREncoding;
    }

    public void setOutputStream(OutputStream outputstream)
    {
        outputStream = outputstream;
    }

    public void setPassword(char ac[])
    {
        protectionParameter = new java.security.KeyStore.PasswordProtection(ac);
    }

    public void setProtectionParameter(java.security.KeyStore.ProtectionParameter protectionparameter)
    {
        protectionParameter = protectionparameter;
    }

    public void setUseDEREncoding(boolean flag)
    {
        useDEREncoding = flag;
    }
}
