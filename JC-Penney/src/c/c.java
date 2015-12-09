// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.io.IOException;

// Referenced classes of package c:
//            ad, a, f, ae

class c
    implements ad
{

    final ad a;
    final a b;

    c(a a1, ad ad1)
    {
        b = a1;
        a = ad1;
        super();
    }

    public void close()
    {
        a.close();
        b.exit(true);
        return;
        Object obj;
        obj;
        throw b.exit(((IOException) (obj)));
        obj;
        b.exit(false);
        throw obj;
    }

    public long read(f f, long l)
    {
        b.enter();
        l = a.read(f, l);
        b.exit(true);
        return l;
        f;
        throw b.exit(f);
        f;
        b.exit(false);
        throw f;
    }

    public ae timeout()
    {
        return b;
    }

    public String toString()
    {
        return (new StringBuilder()).append("AsyncTimeout.source(").append(a).append(")").toString();
    }
}
