// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ngy extends omp
    implements nfv
{

    private nga a;
    private mmv b;

    public ngy()
    {
    }

    public final void a(ngg ngg)
    {
        ngg = new ArrayList();
        Iterator iterator = b.a().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            int i = ((Integer)iterator.next()).intValue();
            mmx mmx1 = b.a(i);
            if (!mmx1.c("logged_in") && !mmx1.c("is_managed_account"))
            {
                ngg.add(Integer.valueOf(i));
            }
        } while (true);
        if (ngg.isEmpty())
        {
            a.a();
            return;
        }
        int ai[] = new int[ngg.size()];
        for (int j = 0; j < ngg.size(); j++)
        {
            ai[j] = ((Integer)ngg.get(j)).intValue();
        }

        ngg = super.q;
        ay ay;
        if (ngg != null)
        {
            ngg = ngg.getString("dialog_title");
        } else
        {
            ngg = null;
        }
        ay = h();
        if (ngg == null)
        {
            ngg = ad.getString(b.Gk);
        }
        ngv.a(ay, ngg, ai, true);
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        a = (nga)ae.a(nga);
        b = (mmv)ae.a(mmv);
    }
}
