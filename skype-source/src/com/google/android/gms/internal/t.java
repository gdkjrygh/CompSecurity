// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            r, ku

final class t
    implements r
{

    private ku a;
    private byte b[];
    private final int c = 239;

    public t()
    {
        a();
    }

    public final void a()
    {
        b = new byte[c];
        a = ku.a(b);
    }

    public final void a(int i, long l)
        throws IOException
    {
        a.a(i, l);
    }

    public final void a(int i, String s)
        throws IOException
    {
        a.a(i, s);
    }

    public final byte[] b()
        throws IOException
    {
        int i = a.a();
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
