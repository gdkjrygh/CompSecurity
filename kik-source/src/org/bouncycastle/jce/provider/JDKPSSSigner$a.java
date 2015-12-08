// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.Digest;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JDKPSSSigner

private final class c
    implements Digest
{

    final JDKPSSSigner a;
    private ByteArrayOutputStream b;
    private Digest c;
    private boolean d;

    public final int doFinal(byte abyte0[], int i)
    {
        boolean flag = false;
        byte abyte1[] = b.toByteArray();
        if (d)
        {
            System.arraycopy(abyte1, 0, abyte0, i, abyte1.length);
        } else
        {
            c.update(abyte1, 0, abyte1.length);
            c.doFinal(abyte0, i);
        }
        reset();
        if (!d)
        {
            flag = true;
        }
        d = flag;
        return abyte1.length;
    }

    public final String getAlgorithmName()
    {
        return "NULL";
    }

    public final int getDigestSize()
    {
        return c.getDigestSize();
    }

    public final void reset()
    {
        b.reset();
        c.reset();
    }

    public final void update(byte byte0)
    {
        b.write(byte0);
    }

    public final void update(byte abyte0[], int i, int j)
    {
        b.write(abyte0, i, j);
    }

    public (JDKPSSSigner jdkpsssigner, Digest digest)
    {
        a = jdkpsssigner;
        super();
        b = new ByteArrayOutputStream();
        d = true;
        c = digest;
    }
}
