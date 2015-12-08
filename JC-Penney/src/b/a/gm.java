// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.ArrayList;

// Referenced classes of package b.a:
//            pe, gl, pn, ow, 
//            pd, gi, nv, gn

public final class gm extends pe
{

    public final int a;

    private gm(int i, int j)
    {
        super(i);
        a = j;
    }

    public static gm a(ArrayList arraylist, int i)
    {
        int j = arraylist.size();
        gm gm1 = new gm(j, i);
        for (i = 0; i < j; i++)
        {
            gm1.a(i, (gl)arraylist.get(i));
        }

        gm1.L = false;
        return gm1;
    }

    public final gl a(int i)
    {
        return (gl)d(i);
    }

    public final void a(ow ow1)
    {
        boolean flag = false;
        int l = ow1.f();
        int i1 = super.K.length;
        int k = ((flag) ? 1 : 0);
        if (ow1.a())
        {
            boolean flag1 = ow1.b();
            int i = 0;
            do
            {
                k = ((flag) ? 1 : 0);
                if (i >= i1)
                {
                    break;
                }
                Object obj = (gl)d(i);
                k = ((gl) (obj)).f() * 2;
                if (k != 0 || flag1)
                {
                    obj = ((gl) (obj)).a("  ", ow1.d());
                } else
                {
                    obj = null;
                }
                if (obj != null)
                {
                    ow1.a(k, ((String) (obj)));
                } else
                if (k != 0)
                {
                    ow1.a(k, "");
                }
                i++;
            } while (true);
        }
        while (k < i1) 
        {
            gl gl1 = (gl)d(k);
            try
            {
                gl1.a(ow1);
            }
            // Misplaced declaration of an exception variable
            catch (ow ow1)
            {
                throw pd.a(ow1, (new StringBuilder("...while writing ")).append(gl1).toString());
            }
            k++;
        }
        int j = (ow1.f() - l) / 2;
        if (j != b())
        {
            throw new RuntimeException((new StringBuilder("write length mismatch; expected ")).append(b()).append(" but actually wrote ").append(j).toString());
        } else
        {
            return;
        }
    }

    public final int b()
    {
        int i = super.K.length;
        if (i == 0)
        {
            return 0;
        } else
        {
            gl gl1 = a(i - 1);
            i = gl1.d();
            return gl1.f() + i;
        }
    }

    public final int c()
    {
        int l = super.K.length;
        int j = 0;
        int i = 0;
        while (j < l) 
        {
            gl gl1 = (gl)d(j);
            if (!(gl1 instanceof gi))
            {
                continue;
            }
            nr nr = ((gi)gl1).a;
            if (!(nr instanceof nv))
            {
                continue;
            }
            int k;
            boolean flag;
            if (gl1.d.b == 113)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            k = ((nv)nr).a(flag);
            if (k > i)
            {
                i = k;
            }
            j++;
        }
        return i;
    }
}
