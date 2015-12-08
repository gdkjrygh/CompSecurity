// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.util.Pack;

// Referenced classes of package org.bouncycastle.crypto.digests:
//            LongDigest

public class SHA384Digest extends LongDigest
{

    public SHA384Digest()
    {
    }

    public SHA384Digest(SHA384Digest sha384digest)
    {
        super(sha384digest);
    }

    public int doFinal(byte abyte0[], int i)
    {
        finish();
        Pack.longToBigEndian(a, abyte0, i);
        Pack.longToBigEndian(b, abyte0, i + 8);
        Pack.longToBigEndian(c, abyte0, i + 16);
        Pack.longToBigEndian(d, abyte0, i + 24);
        Pack.longToBigEndian(e, abyte0, i + 32);
        Pack.longToBigEndian(f, abyte0, i + 40);
        reset();
        return 48;
    }

    public String getAlgorithmName()
    {
        return "SHA-384";
    }

    public int getDigestSize()
    {
        return 48;
    }

    public void reset()
    {
        super.reset();
        a = 0xcbbb9d5dc1059ed8L;
        b = 0x629a292a367cd507L;
        c = 0x9159015a3070dd17L;
        d = 0x152fecd8f70e5939L;
        e = 0x67332667ffc00b31L;
        f = 0x8eb44a8768581511L;
        g = 0xdb0c2e0d64f98fa7L;
        h = 0x47b5481dbefa4fa4L;
    }
}
