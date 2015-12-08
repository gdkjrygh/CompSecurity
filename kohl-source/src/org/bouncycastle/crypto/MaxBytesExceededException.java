// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto;


// Referenced classes of package org.bouncycastle.crypto:
//            RuntimeCryptoException

public class MaxBytesExceededException extends RuntimeCryptoException
{

    public MaxBytesExceededException()
    {
    }

    public MaxBytesExceededException(String s)
    {
        super(s);
    }
}
