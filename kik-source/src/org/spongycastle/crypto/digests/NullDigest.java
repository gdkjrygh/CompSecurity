// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.digests;

import java.io.ByteArrayOutputStream;
import org.spongycastle.crypto.Digest;

public class NullDigest
    implements Digest
{

    private ByteArrayOutputStream a;

    public NullDigest()
    {
        a = new ByteArrayOutputStream();
    }

    public final int a(byte abyte0[], int i)
    {
        byte abyte1[] = a.toByteArray();
        System.arraycopy(abyte1, 0, abyte0, i, abyte1.length);
        a.reset();
        return abyte1.length;
    }

    public final String a()
    {
        return "NULL";
    }

    public final void a(byte byte0)
    {
        a.write(byte0);
    }

    public final void a(byte abyte0[], int i, int j)
    {
        a.write(abyte0, i, j);
    }

    public final int b()
    {
        return a.size();
    }

    public final void c()
    {
        a.reset();
    }
}
