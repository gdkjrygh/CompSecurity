// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.tls;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.util.Arrays;

public class SSL3Mac
    implements Mac
{

    static final byte a[] = a((byte)54, 48);
    static final byte b[] = a((byte)92, 48);
    static final byte c[] = a((byte)54, 40);
    static final byte d[] = a((byte)92, 40);
    private Digest e;
    private byte f[];
    private byte g[];
    private byte h[];

    private static byte[] a(byte byte0, int i)
    {
        byte abyte0[] = new byte[i];
        Arrays.a(abyte0, byte0);
        return abyte0;
    }

    public final int a()
    {
        return e.b();
    }

    public final int a(byte abyte0[], int i)
    {
        byte abyte1[] = new byte[e.b()];
        e.a(abyte1, 0);
        e.a(f, 0, f.length);
        e.a(h, 0, h.length);
        e.a(abyte1, 0, abyte1.length);
        i = e.a(abyte0, i);
        b();
        return i;
    }

    public final void a(byte byte0)
    {
        e.a(byte0);
    }

    public final void a(CipherParameters cipherparameters)
    {
        f = Arrays.b(((KeyParameter)cipherparameters).a());
        b();
    }

    public final void a(byte abyte0[], int i, int j)
    {
        e.a(abyte0, i, j);
    }

    public final void b()
    {
        e.c();
        e.a(f, 0, f.length);
        e.a(g, 0, g.length);
    }

}
