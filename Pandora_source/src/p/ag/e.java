// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ag;

import java.io.IOException;
import java.io.InputStream;
import p.s.k;
import p.x.g;

public class e
    implements p.q.e
{

    private final p.q.e a;

    public e(p.q.e e1)
    {
        a = e1;
    }

    public String a()
    {
        return a.a();
    }

    public k a(InputStream inputstream, int i, int j)
        throws IOException
    {
        return a.a(new g(inputstream, null), i, j);
    }

    public volatile k a(Object obj, int i, int j)
        throws IOException
    {
        return a((InputStream)obj, i, j);
    }
}
