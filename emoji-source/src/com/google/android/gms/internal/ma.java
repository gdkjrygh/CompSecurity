// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            me, mb, mg, lz, 
//            ly

public abstract class ma extends me
{

    protected List amX;

    public ma()
    {
    }

    public final Object a(mb mb1)
    {
        return mb1.i(amX);
    }

    public void a(lz lz1)
        throws IOException
    {
        int i;
        int j;
        if (amX == null)
        {
            i = 0;
        } else
        {
            i = amX.size();
        }
        for (j = 0; j < i; j++)
        {
            mg mg1 = (mg)amX.get(j);
            lz1.eI(mg1.tag);
            lz1.t(mg1.anc);
        }

    }

    protected final boolean a(ly ly1, int i)
        throws IOException
    {
        int j = ly1.getPosition();
        if (!ly1.ev(i))
        {
            return false;
        }
        if (amX == null)
        {
            amX = new ArrayList();
        }
        ly1 = ly1.o(j, ly1.getPosition() - j);
        amX.add(new mg(i, ly1));
        return true;
    }

    protected int c()
    {
        int i;
        int j;
        int k;
        if (amX == null)
        {
            i = 0;
        } else
        {
            i = amX.size();
        }
        j = 0;
        k = 0;
        for (; j < i; j++)
        {
            mg mg1 = (mg)amX.get(j);
            k = k + lz.eJ(mg1.tag) + mg1.anc.length;
        }

        return k;
    }
}
