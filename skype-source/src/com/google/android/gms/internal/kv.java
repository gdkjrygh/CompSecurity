// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            lb, kz, kx, ky, 
//            kt, lf, ld, ku

public abstract class kv extends lb
{

    protected kx r;

    public kv()
    {
    }

    private kv b()
        throws CloneNotSupportedException
    {
        kv kv1 = (kv)super.d();
        kz.a(this, kv1);
        return kv1;
    }

    protected int a()
    {
        int j = 0;
        int k;
        if (r != null)
        {
            int i = 0;
            do
            {
                k = i;
                if (j >= r.a())
                {
                    break;
                }
                i += r.b(j).a();
                j++;
            } while (true);
        } else
        {
            k = 0;
        }
        return k;
    }

    public void a(ku ku)
        throws IOException
    {
        if (r != null)
        {
            int i = 0;
            while (i < r.a()) 
            {
                r.b(i).a(ku);
                i++;
            }
        }
    }

    protected final boolean a(kt kt1, int i)
        throws IOException
    {
        int j = kt1.j();
        if (!kt1.b(i))
        {
            return false;
        }
        int k = lf.b(i);
        ld ld1 = new ld(i, kt1.a(j, kt1.j() - j));
        kt1 = null;
        Object obj;
        if (r == null)
        {
            r = new kx();
        } else
        {
            kt1 = r.a(k);
        }
        obj = kt1;
        if (kt1 == null)
        {
            obj = new ky();
            r.a(k, ((ky) (obj)));
        }
        ((ky) (obj)).a(ld1);
        return true;
    }

    protected final boolean a(kv kv1)
    {
        if (r == null || r.b())
        {
            return kv1.r == null || kv1.r.b();
        } else
        {
            return r.equals(kv1.r);
        }
    }

    protected final int c()
    {
        if (r == null || r.b())
        {
            return 0;
        } else
        {
            return r.hashCode();
        }
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return b();
    }

    public final lb d()
        throws CloneNotSupportedException
    {
        return b();
    }
}
