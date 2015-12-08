// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.io.IOException;
import java.math.BigInteger;

public interface DSAEncoder
{

    public abstract BigInteger[] decode(byte abyte0[])
        throws IOException;

    public abstract byte[] encode(BigInteger biginteger, BigInteger biginteger1)
        throws IOException;
}
