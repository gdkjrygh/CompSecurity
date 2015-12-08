// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            o, zznr

class s
    implements o
{

    private zznr a;
    private byte b[];
    private final int c;

    public s(int i)
    {
        c = i;
        a();
    }

    public void a()
    {
        b = new byte[c];
        a = zznr.zzw(b);
    }

    public void a(int i, long l)
        throws IOException
    {
        a.zzb(i, l);
    }

    public void a(int i, String s1)
        throws IOException
    {
        a.zzb(i, s1);
    }

    public byte[] b()
        throws IOException
    {
        int i = a.zzzN();
        if (i < 0)
        {
            throw new IOException();
        }
        if (i == 0)
        {
            return b;
        } else
        {
            byte abyte0[] = new byte[b.length - i];
            System.arraycopy(b, 0, abyte0, 0, abyte0.length);
            return abyte0;
        }
    }
}
