// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;

final class acr
    implements Runnable
{

    private ArrayList a;
    private acq b;

    acr(acq acq1, ArrayList arraylist)
    {
        b = acq1;
        a = arraylist;
        super();
    }

    public final void run()
    {
        acq acq1;
        afn afn1;
        Object obj;
        int i;
        int k;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((ob) (obj)).a(((aer) (acq1)).k).a(new acw(acq1, afn1, k, i, ((ob) (obj)))).b())
        {
            obj = (ada)iterator.next();
            acq1 = b;
            afn1 = ((ada) (obj)).a;
            k = ((ada) (obj)).b;
            i = ((ada) (obj)).c;
            int l = ((ada) (obj)).d;
            int j = ((ada) (obj)).e;
            obj = afn1.a;
            k = l - k;
            i = j - i;
            if (k != 0)
            {
                mk.r(((android.view.View) (obj))).b(0.0F);
            }
            if (i != 0)
            {
                mk.r(((android.view.View) (obj))).c(0.0F);
            }
            obj = mk.r(((android.view.View) (obj)));
            acq1.e.add(afn1);
        }

        a.clear();
        b.b.remove(a);
    }
}
