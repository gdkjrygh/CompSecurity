// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.digest;

import java.security.MessageDigest;
import org.spongycastle.crypto.Digest;

public class BCMessageDigest extends MessageDigest
{

    protected Digest a;

    protected BCMessageDigest(Digest digest)
    {
        super(digest.a());
        a = digest;
    }

    public byte[] engineDigest()
    {
        byte abyte0[] = new byte[a.b()];
        a.a(abyte0, 0);
        return abyte0;
    }

    public void engineReset()
    {
        a.c();
    }

    public void engineUpdate(byte byte0)
    {
        a.a(byte0);
    }

    public void engineUpdate(byte abyte0[], int i, int j)
    {
        a.a(abyte0, i, j);
    }
}
