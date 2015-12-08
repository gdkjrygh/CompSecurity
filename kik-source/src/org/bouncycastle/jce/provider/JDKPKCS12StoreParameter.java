// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.OutputStream;

public class JDKPKCS12StoreParameter
    implements java.security.KeyStore.LoadStoreParameter
{

    private OutputStream a;
    private java.security.KeyStore.ProtectionParameter b;
    private boolean c;

    public JDKPKCS12StoreParameter()
    {
    }

    public final OutputStream a()
    {
        return a;
    }

    public final boolean b()
    {
        return c;
    }

    public java.security.KeyStore.ProtectionParameter getProtectionParameter()
    {
        return b;
    }
}
