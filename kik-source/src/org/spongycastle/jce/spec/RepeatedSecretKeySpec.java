// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.spec;

import javax.crypto.SecretKey;

public class RepeatedSecretKeySpec
    implements SecretKey
{

    private String a;

    public String getAlgorithm()
    {
        return a;
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
