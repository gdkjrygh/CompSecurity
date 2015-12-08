// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.spec;

import java.security.PublicKey;
import java.security.spec.KeySpec;
import org.bouncycastle.jce.interfaces.MQVPublicKey;

public class MQVPublicKeySpec
    implements KeySpec, MQVPublicKey
{

    private PublicKey a;
    private PublicKey b;

    public final PublicKey a()
    {
        return a;
    }

    public final PublicKey b()
    {
        return b;
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
