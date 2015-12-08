// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class ebp
    implements emd
{

    private final elp a;
    private final ebr b;

    public ebp(Context context, elp elp1)
    {
        a = elp1;
        b = new ebr(context);
    }

    public static ekq a(ebv ebv1, elm elm)
    {
        return new ebv(ebv1.a, ebv1.b, ebv1.c, ebv1.d, elm);
    }

    public final volatile ekq a(ekq ekq, elm elm)
    {
        return a((ebv)ekq, elm);
    }

    public final elm a(ebv ebv1, ekk ekk)
    {
        nsx nsx1 = b.a(ebv1.a, ebv1.c);
        if (!nsx1.moveToFirst())
        {
            throw new ekd(ebv1);
        }
        break MISSING_BLOCK_LABEL_43;
        ebv1;
        if (nsx1 != null)
        {
            nsx1.close();
        }
        throw ebv1;
        ozs ozs = ebr.a(nsx1);
        if (ozs != null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        throw new ekd(ebv1);
        ebv1 = a.a(ebv1.a, ozs, ekk);
        if (nsx1 != null)
        {
            nsx1.close();
        }
        return ebv1;
    }

    public final volatile elm a(ekq ekq, ekk ekk)
    {
        return a((ebv)ekq, ekk);
    }

    public final Class a()
    {
        return ebv;
    }
}
