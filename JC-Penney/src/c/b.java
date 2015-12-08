// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.io.IOException;

// Referenced classes of package c:
//            ac, a, ae, f

class b
    implements ac
{

    final ac a;
    final a b;

    b(a a1, ac ac1)
    {
        b = a1;
        a = ac1;
        super();
    }

    public void close()
    {
        b.enter();
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

    public void flush()
    {
        b.enter();
        a.flush();
        b.exit(true);
        return;
        Object obj;
        obj;
        throw b.exit(((IOException) (obj)));
        obj;
        b.exit(false);
        throw obj;
    }

    public ae timeout()
    {
        return b;
    }

    public String toString()
    {
        return (new StringBuilder()).append("AsyncTimeout.sink(").append(a).append(")").toString();
    }

    public void write(f f, long l)
    {
        b.enter();
        a.write(f, l);
        b.exit(true);
        return;
        f;
        throw b.exit(f);
        f;
        b.exit(false);
        throw f;
    }
}
