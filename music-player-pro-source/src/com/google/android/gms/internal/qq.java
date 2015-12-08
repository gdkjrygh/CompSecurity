// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            qw, qr, qz, qs, 
//            qt, qo, qy, qp

public abstract class qq extends qw
{

    protected qs ayW;

    public qq()
    {
    }

    public final Object a(qr qr1)
    {
        qt qt1;
        if (ayW != null)
        {
            if ((qt1 = ayW.hh(qz.hl(qr1.tag))) != null)
            {
                return qt1.b(qr1);
            }
        }
        return null;
    }

    public void a(qp qp)
        throws IOException
    {
        if (ayW != null)
        {
            int i = 0;
            while (i < ayW.size()) 
            {
                ayW.hi(i).a(qp);
                i++;
            }
        }
    }

    protected final boolean a(qo qo1, int i)
        throws IOException
    {
        int j = qo1.getPosition();
        if (!qo1.gQ(i))
        {
            return false;
        }
        int k = qz.hl(i);
        qy qy1 = new qy(i, qo1.s(j, qo1.getPosition() - j));
        qo1 = null;
        Object obj;
        if (ayW == null)
        {
            ayW = new qs();
        } else
        {
            qo1 = ayW.hh(k);
        }
        obj = qo1;
        if (qo1 == null)
        {
            obj = new qt();
            ayW.a(k, ((qt) (obj)));
        }
        ((qt) (obj)).a(qy1);
        return true;
    }

    protected final boolean a(qq qq1)
    {
        if (ayW == null || ayW.isEmpty())
        {
            return qq1.ayW == null || qq1.ayW.isEmpty();
        } else
        {
            return ayW.equals(qq1.ayW);
        }
    }

    protected int c()
    {
        int j = 0;
        int k;
        if (ayW != null)
        {
            int i = 0;
            do
            {
                k = i;
                if (j >= ayW.size())
                {
                    break;
                }
                i += ayW.hi(j).c();
                j++;
            } while (true);
        } else
        {
            k = 0;
        }
        return k;
    }

    protected final int rQ()
    {
        if (ayW == null || ayW.isEmpty())
        {
            return 0;
        } else
        {
            return ayW.hashCode();
        }
    }
}
