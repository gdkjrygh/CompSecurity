// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj;

import ar.com.hjg.pngj.chunks.d;

// Referenced classes of package ar.com.hjg.pngj:
//            b, f

public class e extends b
{

    protected final f d;
    protected boolean e;

    public e(int i, String s, long l, f f1)
    {
        super(i, s, l, b.a.b);
        e = false;
        d = f1;
        f1.a(this);
    }

    protected final void b(byte abyte0[], int i, int j)
    {
        if (j > 0)
        {
            d.a(abyte0, i, j);
            if (e)
            {
                System.arraycopy(abyte0, i, a().d, b, j);
            }
        }
    }

    protected void d()
    {
    }
}
