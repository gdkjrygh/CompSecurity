// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package b.a:
//            qe, j, c

public final class i extends qe
{

    private qe a;

    public i(qe qe1)
    {
        super(qe1);
        a = qe1;
    }

    public final qe a()
    {
        return this;
    }

    public final boolean a(int k)
    {
        if (k == -1)
        {
            super.d.a(j.a);
            return true;
        }
        f = f + 1;
        if ((char)k == '\n')
        {
            a.b(f());
            super.d.a(a);
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean a(CharArrayBuffer chararraybuffer)
    {
        return true;
    }

    public final qe c()
    {
        return this;
    }

    protected final int d()
    {
        return 0;
    }

    protected final int e()
    {
        return 0;
    }
}
