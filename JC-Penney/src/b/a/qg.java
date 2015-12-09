// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package b.a:
//            qe, c, j, qh

public final class qg extends qe
{

    private qh a;
    private int b;
    private int c;

    public qg(qh qh1, int i)
    {
        super(qh1);
        c = 0;
        a = qh1;
        b = i;
    }

    public final qe a()
    {
        return a;
    }

    public final boolean a(int i)
    {
        if (c < b + 2)
        {
            if (i == -1)
            {
                super.d.b(f());
                super.d.a(j.a);
                return true;
            }
            f = f + 1;
            i = (char)i;
            c = c + 1;
            if (c > b)
            {
                if (i == 10)
                {
                    a.b(f());
                    super.d.a(a);
                    return true;
                }
                if (c == b + 2 && i != 10)
                {
                    super.d.a(j.a);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean a(CharArrayBuffer chararraybuffer)
    {
        return true;
    }

    public final qe c()
    {
        return null;
    }

    protected final int d()
    {
        return 0;
    }

    protected final int e()
    {
        return 0;
    }

    public final void g()
    {
        super.d.b(f());
        super.d.a(j.a);
    }
}
