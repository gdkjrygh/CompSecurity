// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.a;

import com.bumptech.glide.i;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

// Referenced classes of package com.bumptech.glide.load.a:
//            c

public class b
    implements c
{

    private final byte a[];
    private final String b;

    public b(byte abyte0[], String s)
    {
        a = abyte0;
        b = s;
    }

    public InputStream a(i i)
    {
        return new ByteArrayInputStream(a);
    }

    public void a()
    {
    }

    public Object b(i i)
        throws Exception
    {
        return a(i);
    }

    public String b()
    {
        return b;
    }

    public void c()
    {
    }
}
