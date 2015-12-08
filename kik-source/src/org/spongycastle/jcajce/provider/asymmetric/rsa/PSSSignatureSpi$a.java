// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.rsa;

import java.io.ByteArrayOutputStream;
import org.spongycastle.crypto.Digest;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric.rsa:
//            PSSSignatureSpi

private final class c
    implements Digest
{

    final PSSSignatureSpi a;
    private ByteArrayOutputStream b;
    private Digest c;
    private boolean d;

    public final int a(byte abyte0[], int i)
    {
        boolean flag = false;
        byte abyte1[] = b.toByteArray();
        if (d)
        {
            System.arraycopy(abyte1, 0, abyte0, i, abyte1.length);
        } else
        {
            c.a(abyte1, 0, abyte1.length);
            c.a(abyte0, i);
        }
        c();
        if (!d)
        {
            flag = true;
        }
        d = flag;
        return abyte1.length;
    }

    public final String a()
    {
        return "NULL";
    }

    public final void a(byte byte0)
    {
        b.write(byte0);
    }

    public final void a(byte abyte0[], int i, int j)
    {
        b.write(abyte0, i, j);
    }

    public final int b()
    {
        return c.b();
    }

    public final void c()
    {
        b.reset();
        c.c();
    }

    public (PSSSignatureSpi psssignaturespi, Digest digest)
    {
        a = psssignaturespi;
        super();
        b = new ByteArrayOutputStream();
        d = true;
        c = digest;
    }
}
