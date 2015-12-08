// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;


public class SecurityParameters
{

    byte a[];
    byte b[];
    byte c[];

    public SecurityParameters()
    {
        a = null;
        b = null;
        c = null;
    }

    public byte[] getClientRandom()
    {
        return a;
    }

    public byte[] getMasterSecret()
    {
        return c;
    }

    public byte[] getServerRandom()
    {
        return b;
    }
}
