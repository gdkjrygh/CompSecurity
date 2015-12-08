// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.IOException;

public interface TlsCipher
{

    public abstract byte[] decodeCiphertext(short word0, byte abyte0[], int i, int j)
        throws IOException;

    public abstract byte[] encodePlaintext(short word0, byte abyte0[], int i, int j)
        throws IOException;
}
