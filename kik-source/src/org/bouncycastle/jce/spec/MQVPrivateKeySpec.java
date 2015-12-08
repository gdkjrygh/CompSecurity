// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.spec;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.KeySpec;
import org.bouncycastle.jce.interfaces.MQVPrivateKey;

public class MQVPrivateKeySpec
    implements KeySpec, MQVPrivateKey
{

    private PrivateKey a;
    private PrivateKey b;
    private PublicKey c;

    public final PrivateKey a()
    {
        return a;
    }

    public final PrivateKey b()
    {
        return b;
    }

    public final PublicKey c()
    {
        return c;
    }

    public String getAlgorithm()
    {
        return "ECMQV";
    }

    public byte[] getEncoded()
    {
        return null;
    }

    public String getFormat()
    {
        return null;
    }
}
