// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;

final class act
    implements Runnable
{

    private ArrayList a;
    private acq b;

    act(acq acq1, ArrayList arraylist)
    {
        b = acq1;
        a = arraylist;
        super();
    }

    public final void run()
    {
        afn afn1;
        acq acq1;
        ob ob1;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ob1.a(1.0F).a(((aer) (acq1)).i).a(new acv(acq1, afn1, ob1)).b())
        {
            afn1 = (afn)iterator.next();
            acq1 = b;
            ob1 = mk.r(afn1.a);
            acq1.d.add(afn1);
        }

        a.clear();
        b.a.remove(a);
    }
}
