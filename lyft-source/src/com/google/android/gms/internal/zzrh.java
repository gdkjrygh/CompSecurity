// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzrn, zzrj, zzrk, zzrf, 
//            zzrq, zzrp, zzrl, zzrg

public abstract class zzrh extends zzrn
{

    protected zzrj o;

    public zzrh()
    {
    }

    public void a(zzrg zzrg)
    {
        if (o != null)
        {
            int i = 0;
            while (i < o.a()) 
            {
                o.b(i).a(zzrg);
                i++;
            }
        }
    }

    protected final boolean a(zzrf zzrf1, int i)
    {
        int j = zzrf1.q();
        if (!zzrf1.b(i))
        {
            return false;
        }
        int k = zzrq.b(i);
        zzrp zzrp1 = new zzrp(i, zzrf1.a(j, zzrf1.q() - j));
        zzrf1 = null;
        Object obj;
        if (o == null)
        {
            o = new zzrj();
        } else
        {
            zzrf1 = o.a(k);
        }
        obj = zzrf1;
        if (zzrf1 == null)
        {
            obj = new zzrk();
            o.a(k, ((zzrk) (obj)));
        }
        ((zzrk) (obj)).a(zzrp1);
        return true;
    }

    protected final boolean a(zzrh zzrh1)
    {
        if (o == null || o.b())
        {
            return zzrh1.o == null || zzrh1.o.b();
        } else
        {
            return o.equals(zzrh1.o);
        }
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
                if (j >= o.a())
                {
                    break;
                }
                i += o.b(j).a();
                j++;
            } while (true);
        } else
        {
            k = 0;
        }
        return k;
    }

    public Object clone()
    {
        return e();
    }

    protected final int d()
    {
        if (o == null || o.b())
        {
            return 0;
        } else
        {
            return o.hashCode();
        }
    }

    public zzrh e()
    {
        zzrh zzrh1 = (zzrh)super.f();
        zzrl.a(this, zzrh1);
        return zzrh1;
    }

    public zzrn f()
    {
        return e();
    }
}
