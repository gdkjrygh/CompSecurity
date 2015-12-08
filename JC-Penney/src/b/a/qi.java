// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package b.a:
//            qe, c, j

public final class qi extends qe
{

    public qi(qe qe1)
    {
        super(qe1);
    }

    public final int a(byte abyte0[], int i, int k)
    {
        if (k == -1)
        {
            super.d.b(f());
            super.d.a(j.a);
            return -1;
        } else
        {
            f = f + k;
            return k;
        }
    }

    public final qe a()
    {
        return j.a;
    }

    public final boolean a(int i)
    {
        if (i == -1)
        {
            super.d.b(f());
            super.d.a(j.a);
            return true;
        } else
        {
            f = f + 1;
            return false;
        }
    }

    public final boolean a(CharArrayBuffer chararraybuffer)
    {
        return true;
    }

    public final qe c()
    {
        return j.a;
    }

    protected final int d()
    {
        return 0;
    }

    protected final int e()
    {
        return 0x7fffffff;
    }

    public final void g()
    {
        super.d.b(f());
        super.d.a(j.a);
    }
}
