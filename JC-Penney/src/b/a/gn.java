// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            ky, kw, gr

public final class gn
{

    final int a;
    final int b;
    final int c;
    final gr d;
    final boolean e;

    public gn(int i, int j, int k, gr gr, boolean flag)
    {
        if (!ky.a(i))
        {
            throw new IllegalArgumentException("bogus opcode");
        }
        if (!ky.a(j))
        {
            throw new IllegalArgumentException("bogus family");
        }
        if (!ky.a(k))
        {
            throw new IllegalArgumentException("bogus nextOpcode");
        }
        if (gr == null)
        {
            throw new NullPointerException("format == null");
        } else
        {
            a = i;
            b = j;
            c = k;
            d = gr;
            e = flag;
            return;
        }
    }

    public final String toString()
    {
        return kw.a(a);
    }
}
