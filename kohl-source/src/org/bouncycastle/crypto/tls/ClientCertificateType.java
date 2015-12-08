// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;


public class ClientCertificateType
{

    public static final short dss_fixed_dh = 4;
    public static final short dss_sign = 2;
    public static final short ecdsa_fixed_ecdh = 66;
    public static final short ecdsa_sign = 64;
    public static final short rsa_fixed_dh = 3;
    public static final short rsa_fixed_ecdh = 65;
    public static final short rsa_sign = 1;

    public ClientCertificateType()
    {
    }
}
