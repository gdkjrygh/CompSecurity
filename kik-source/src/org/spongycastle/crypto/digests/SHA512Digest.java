// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.digests;

import org.spongycastle.crypto.util.Pack;

// Referenced classes of package org.spongycastle.crypto.digests:
//            LongDigest

public class SHA512Digest extends LongDigest
{

    public SHA512Digest()
    {
    }

    public SHA512Digest(SHA512Digest sha512digest)
    {
        super(sha512digest);
    }

    public final int a(byte abyte0[], int i)
    {
        e();
        Pack.a(a, abyte0, i);
        Pack.a(b, abyte0, i + 8);
        Pack.a(c, abyte0, i + 16);
        Pack.a(d, abyte0, i + 24);
        Pack.a(e, abyte0, i + 32);
        Pack.a(f, abyte0, i + 40);
        Pack.a(g, abyte0, i + 48);
        Pack.a(h, abyte0, i + 56);
        c();
        return 64;
    }

    public final String a()
    {
        return "SHA-512";
    }

    public final int b()
    {
        return 64;
    }

    public final void c()
    {
        super.c();
        a = 0x6a09e667f3bcc908L;
        b = 0xbb67ae8584caa73bL;
        c = 0x3c6ef372fe94f82bL;
        d = 0xa54ff53a5f1d36f1L;
        e = 0x510e527fade682d1L;
        f = 0x9b05688c2b3e6c1fL;
        g = 0x1f83d9abfb41bd6bL;
        h = 0x5be0cd19137e2179L;
    }
}
