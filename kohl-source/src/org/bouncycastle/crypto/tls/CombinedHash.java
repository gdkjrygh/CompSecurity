// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.MD5Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsClientContext, ProtocolVersion, SSL3Mac, SecurityParameters

class CombinedHash
    implements Digest
{

    protected TlsClientContext context;
    protected MD5Digest md5;
    protected SHA1Digest sha1;

    CombinedHash()
    {
        md5 = new MD5Digest();
        sha1 = new SHA1Digest();
    }

    CombinedHash(CombinedHash combinedhash)
    {
        context = combinedhash.context;
        md5 = new MD5Digest(combinedhash.md5);
        sha1 = new SHA1Digest(combinedhash.sha1);
    }

    CombinedHash(TlsClientContext tlsclientcontext)
    {
        context = tlsclientcontext;
        md5 = new MD5Digest();
        sha1 = new SHA1Digest();
    }

    public int doFinal(byte abyte0[], int i)
    {
        if (context != null)
        {
            boolean flag;
            if (context.getServerVersion().getFullVersion() >= ProtocolVersion.TLSv10.getFullVersion())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                ssl3Complete(md5, SSL3Mac.MD5_IPAD, SSL3Mac.MD5_OPAD);
                ssl3Complete(sha1, SSL3Mac.SHA1_IPAD, SSL3Mac.SHA1_OPAD);
            }
        }
        return md5.doFinal(abyte0, i) + sha1.doFinal(abyte0, i + 16);
    }

    public String getAlgorithmName()
    {
        return (new StringBuilder()).append(md5.getAlgorithmName()).append(" and ").append(sha1.getAlgorithmName()).toString();
    }

    public int getDigestSize()
    {
        return 36;
    }

    public void reset()
    {
        md5.reset();
        sha1.reset();
    }

    protected void ssl3Complete(Digest digest, byte abyte0[], byte abyte1[])
    {
        byte abyte2[] = context.getSecurityParameters().masterSecret;
        digest.update(abyte2, 0, abyte2.length);
        digest.update(abyte0, 0, abyte0.length);
        abyte0 = new byte[digest.getDigestSize()];
        digest.doFinal(abyte0, 0);
        digest.update(abyte2, 0, abyte2.length);
        digest.update(abyte1, 0, abyte1.length);
        digest.update(abyte0, 0, abyte0.length);
    }

    public void update(byte byte0)
    {
        md5.update(byte0);
        sha1.update(byte0);
    }

    public void update(byte abyte0[], int i, int j)
    {
        md5.update(abyte0, i, j);
        sha1.update(abyte0, i, j);
    }
}
