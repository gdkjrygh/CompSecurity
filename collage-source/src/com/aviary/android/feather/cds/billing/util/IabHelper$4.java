// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds.billing.util;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.aviary.android.feather.cds.billing.util:
//            d, c, Purchase, e

class _cls2.a
    implements Runnable
{

    final List a;
    final _cls2.a b;
    final Handler c;
    final _cls2.a d;
    final d e;

    public void run()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            Purchase purchase = (Purchase)iterator.next();
            try
            {
                e.a(purchase);
                arraylist.add(new e(0, (new StringBuilder()).append("Successful consume of sku ").append(purchase.c()).toString()));
            }
            catch (c c1)
            {
                arraylist.add(c1.a());
            }
        }

        e.d();
        if (!e.d && b != null)
        {
            c.post(new Runnable(arraylist) {

                final List a;
                final IabHelper._cls4 b;

                public void run()
                {
                    b.b.a((Purchase)b.a.get(0), (e)a.get(0));
                }

            
            {
                b = IabHelper._cls4.this;
                a = list;
                super();
            }
            });
        }
        if (!e.d && d != null)
        {
            c.post(new Runnable(arraylist) {

                final List a;
                final IabHelper._cls4 b;

                public void run()
                {
                    b.d.a(b.a, a);
                }

            
            {
                b = IabHelper._cls4.this;
                a = list;
                super();
            }
            });
        }
    }
}
