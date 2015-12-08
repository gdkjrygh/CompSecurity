// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            mf, mc, mh, ma, 
//            lz

public abstract class mb extends mf
{

    protected List amU;

    public mb()
    {
    }

    public final Object a(mc mc1)
    {
        return mc1.i(amU);
    }

    public void a(ma ma1)
        throws IOException
    {
        int i;
        int j;
        if (amU == null)
        {
            i = 0;
        } else
        {
            i = amU.size();
        }
        for (j = 0; j < i; j++)
        {
            mh mh1 = (mh)amU.get(j);
            ma1.eI(mh1.tag);
            ma1.t(mh1.amZ);
        }

    }

    protected final boolean a(lz lz1, int i)
        throws IOException
    {
        int j = lz1.getPosition();
        if (!lz1.ev(i))
        {
            return false;
        }
        if (amU == null)
        {
            amU = new ArrayList();
        }
        lz1 = lz1.o(j, lz1.getPosition() - j);
        amU.add(new mh(i, lz1));
        return true;
    }

    protected int c()
    {
        int i;
        int j;
        int k;
        if (amU == null)
        {
            i = 0;
        } else
        {
            i = amU.size();
        }
        j = 0;
        k = 0;
        for (; j < i; j++)
        {
            mh mh1 = (mh)amU.get(j);
            k = k + ma.eJ(mh1.tag) + mh1.amZ.length;
        }

        return k;
    }
}
