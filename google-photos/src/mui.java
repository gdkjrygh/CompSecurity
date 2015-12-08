// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;

public final class mui
    implements mug
{

    private Context a;
    private nbj b;
    private int c;
    private muk d;
    private mum e;
    private mun f;
    private nxb g;

    public mui(Context context)
    {
        c = -1;
        d = null;
        e = new mum(this);
        f = new mun(this);
        g = new mul();
        a = context;
        context = olm.b(context);
        b = (nbj)context.a(nbj);
        if ((muh)context.b(muh) != null)
        {
            c = 0;
        }
    }

    private muk a(njr njr1, int i, int j, int k, int l)
    {
        muk muk1;
        if (d != null)
        {
            muk1 = d;
            d = (muk)((njv) (d)).d;
            muk1.d = null;
        } else
        {
            muk1 = new muk(this);
        }
        muk1.a(l & 0xffffffdf & -5 & 0xfffffeff, njr1, b.c(a, i), j, k);
        return muk1;
    }

    static nbj a(mui mui1)
    {
        return mui1.b;
    }

    static njt a(mui mui1, muk muk1, nxe nxe)
    {
        return mui1.a(muk1, nxe);
    }

    private njt a(muk muk1, nxe nxe)
    {
        njt njt1 = (njt)b.a(muk1);
        if (njt1 != null) goto _L2; else goto _L1
_L1:
        njt1 = new njt(b, muk1);
        muk1.a;
        JVM INSTR tableswitch 1 2: default 56
    //                   1 76
    //                   2 89;
           goto _L3 _L4 _L5
_L3:
        njt1.b = null;
        muk1 = njt1;
_L7:
        b.a(muk1, nxe);
        return muk1;
_L4:
        njt1.b = e;
        muk1 = njt1;
        continue; /* Loop/switch isn't completed */
_L5:
        njt1.b = f;
        muk1 = njt1;
        continue; /* Loop/switch isn't completed */
_L2:
        muk1.d = d;
        d = muk1;
        muk1 = njt1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static Context b(mui mui1)
    {
        return mui1.a;
    }

    public final Object a(String s, int i, int j)
    {
        i = c;
        if (TextUtils.isEmpty(s))
        {
            return g;
        } else
        {
            return (new muj(this, null, a(njr.a(a, s, njx.a), 2, i, j, 16))).a();
        }
    }

    public final nxb a(Context context, String s, int i, int j, nxe nxe)
    {
        if (TextUtils.isEmpty(s))
        {
            return g;
        } else
        {
            return a(a(njr.a(context, s, njx.a), i, c, j, 0), nxe);
        }
    }
}
