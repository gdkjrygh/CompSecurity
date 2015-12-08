// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.spec;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.KeySpec;
import org.bouncycastle.jce.interfaces.IESKey;

public class IEKeySpec
    implements KeySpec, IESKey
{

    private PublicKey a;
    private PrivateKey b;

    public final PublicKey a()
    {
        return a;
    }

    public final PrivateKey b()
    {
        return b;
    }

    public String getAlgorithm()
    {
        return "IES";
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
