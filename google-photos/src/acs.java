// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;

final class acs
    implements Runnable
{

    private ArrayList a;
    private acq b;

    acs(acq acq1, ArrayList arraylist)
    {
        b = acq1;
        a = arraylist;
        super();
    }

    public final void run()
    {
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            acz acz1 = (acz)iterator.next();
            acq acq1 = b;
            Object obj = acz1.a;
            Object obj1;
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = ((afn) (obj)).a;
            }
            obj1 = acz1.b;
            if (obj1 != null)
            {
                obj1 = ((afn) (obj1)).a;
            } else
            {
                obj1 = null;
            }
            if (obj != null)
            {
                obj = mk.r(((android.view.View) (obj))).a(((aer) (acq1)).l);
                acq1.g.add(acz1.a);
                ((ob) (obj)).b(acz1.e - acz1.c);
                ((ob) (obj)).c(acz1.f - acz1.d);
                ((ob) (obj)).a(0.0F).a(new acx(acq1, acz1, ((ob) (obj)))).b();
            }
            if (obj1 != null)
            {
                obj = mk.r(((android.view.View) (obj1)));
                acq1.g.add(acz1.b);
                ((ob) (obj)).b(0.0F).c(0.0F).a(((aer) (acq1)).l).a(1.0F).a(new acy(acq1, acz1, ((ob) (obj)), ((android.view.View) (obj1)))).b();
            }
        } while (true);
        a.clear();
        b.c.remove(a);
    }
}
