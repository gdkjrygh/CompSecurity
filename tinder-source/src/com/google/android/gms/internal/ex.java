// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            fd, fc, fa, fb, 
//            ew, fg, ff, zzrx

public abstract class ex extends fd
{

    protected fa o;

    public ex()
    {
    }

    private ex a()
        throws CloneNotSupportedException
    {
        ex ex1 = (ex)super.c();
        fc.a(this, ex1);
        return ex1;
    }

    public void a(zzrx zzrx)
        throws IOException
    {
        if (o != null)
        {
            int i = 0;
            while (i < o.b()) 
            {
                o.a(i).a(zzrx);
                i++;
            }
        }
    }

    protected final boolean a(ew ew1, int i)
        throws IOException
    {
        int j = ew1.h();
        if (!ew1.b(i))
        {
            return false;
        }
        int i1 = fg.b(i);
        int j1 = ew1.h() - j;
        Object obj;
        ff ff1;
        if (j1 == 0)
        {
            ew1 = fg.h;
        } else
        {
            obj = new byte[j1];
            int k1 = ew1.b;
            System.arraycopy(ew1.a, j + k1, obj, 0, j1);
            ew1 = ((ew) (obj));
        }
        ff1 = new ff(i, ew1);
        if (o == null)
        {
            o = new fa();
            ew1 = null;
        } else
        {
            ew1 = o;
            i = ew1.c(i1);
            if (i < 0 || ((fa) (ew1)).d[i] == fa.a)
            {
                ew1 = null;
            } else
            {
                ew1 = ((fa) (ew1)).d[i];
            }
        }
        obj = ew1;
        if (ew1 == null)
        {
            ew1 = new fb();
            obj = o;
            i = ((fa) (obj)).c(i1);
            if (i >= 0)
            {
                ((fa) (obj)).d[i] = ew1;
                obj = ew1;
            } else
            {
                int k = ~i;
                if (k < ((fa) (obj)).e && ((fa) (obj)).d[k] == fa.a)
                {
                    ((fa) (obj)).c[k] = i1;
                    ((fa) (obj)).d[k] = ew1;
                    obj = ew1;
                } else
                {
                    i = k;
                    if (((fa) (obj)).b)
                    {
                        i = k;
                        if (((fa) (obj)).e >= ((fa) (obj)).c.length)
                        {
                            ((fa) (obj)).a();
                            i = ~((fa) (obj)).c(i1);
                        }
                    }
                    if (((fa) (obj)).e >= ((fa) (obj)).c.length)
                    {
                        int l = fa.b(((fa) (obj)).e + 1);
                        int ai[] = new int[l];
                        fb afb[] = new fb[l];
                        System.arraycopy(((fa) (obj)).c, 0, ai, 0, ((fa) (obj)).c.length);
                        System.arraycopy(((fa) (obj)).d, 0, afb, 0, ((fa) (obj)).d.length);
                        obj.c = ai;
                        obj.d = afb;
                    }
                    if (((fa) (obj)).e - i != 0)
                    {
                        System.arraycopy(((fa) (obj)).c, i, ((fa) (obj)).c, i + 1, ((fa) (obj)).e - i);
                        System.arraycopy(((fa) (obj)).d, i, ((fa) (obj)).d, i + 1, ((fa) (obj)).e - i);
                    }
                    ((fa) (obj)).c[i] = i1;
                    ((fa) (obj)).d[i] = ew1;
                    obj.e = ((fa) (obj)).e + 1;
                    obj = ew1;
                }
            }
        }
        ((fb) (obj)).a.add(ff1);
        return true;
    }

    protected int b()
    {
        int j = 0;
        int k;
        if (o != null)
        {
            int i = 0;
            do
            {
                k = i;
                if (j >= o.b())
                {
                    break;
                }
                i += o.a(j).a();
                j++;
            } while (true);
        } else
        {
            k = 0;
        }
        return k;
    }

    public final fd c()
        throws CloneNotSupportedException
    {
        return a();
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return a();
    }
}
