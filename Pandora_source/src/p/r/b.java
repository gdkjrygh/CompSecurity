// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.r;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import p.l.i;

// Referenced classes of package p.r:
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
