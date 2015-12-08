// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.RectF;

public class njn
{

    public final nbj a;
    private njv b;

    public njn(Context context)
    {
        b = null;
        a = (nbj)olm.a(context, nbj);
    }

    private njt a(njv njv1, nxe nxe)
    {
        njt njt1 = (njt)a.a(njv1);
        if (njt1 == null)
        {
            njv1 = new njt(a, njv1);
        } else
        {
            njv1.d = b;
            b = njv1;
            njv1 = njt1;
        }
        a.a(njv1, nxe);
        return njv1;
    }

    private njv a(njr njr, int i, int j, int k, int l, RectF rectf, k k1, 
            int i1)
    {
        njv njv1;
        if (b != null)
        {
            njv1 = b;
            b = b.d;
            njv1.d = null;
        } else
        {
            njv1 = new njv();
        }
        njv1.a(i1, njr, i, j, k, l, rectf, k1);
        return njv1;
    }

    public final njt a(njr njr, int i, int j, int k, int l, RectF rectf, k k1, 
            int i1, nxe nxe)
    {
        return a(a(njr, i, j, k, l, rectf, k1, i1), nxe);
    }

    public final njt a(njr njr, int i, int j, int k, k k1, int l, nxe nxe)
    {
        return a(a(njr, i, j, k, -1, null, null, l), nxe);
    }
}
