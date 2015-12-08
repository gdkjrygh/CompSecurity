// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.util.Pack;

// Referenced classes of package org.bouncycastle.crypto.digests:
//            LongDigest

public class SHA384Digest extends LongDigest
{

    private static final int DIGEST_LENGTH = 48;

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
        Pack.longToBigEndian(H1, abyte0, i);
        Pack.longToBigEndian(H2, abyte0, i + 8);
        Pack.longToBigEndian(H3, abyte0, i + 16);
        Pack.longToBigEndian(H4, abyte0, i + 24);
        Pack.longToBigEndian(H5, abyte0, i + 32);
        Pack.longToBigEndian(H6, abyte0, i + 40);
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
        H1 = 0xcbbb9d5dc1059ed8L;
        H2 = 0x629a292a367cd507L;
        H3 = 0x9159015a3070dd17L;
        H4 = 0x152fecd8f70e5939L;
        H5 = 0x67332667ffc00b31L;
        H6 = 0x8eb44a8768581511L;
        H7 = 0xdb0c2e0d64f98fa7L;
        H8 = 0x47b5481dbefa4fa4L;
    }
}
