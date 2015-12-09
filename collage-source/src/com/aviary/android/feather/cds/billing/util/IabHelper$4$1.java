// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds.billing.util;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.aviary.android.feather.cds.billing.util:
//            Purchase, e, d, c

class a
    implements Runnable
{

    final List a;
    final a b;

    public void run()
    {
        b.b.b((Purchase)b.b.get(0), (e)a.get(0));
    }

    a(a a1, List list)
    {
        b = a1;
        a = list;
        super();
    }

    // Unreferenced inner class com/aviary/android/feather/cds/billing/util/IabHelper$4

/* anonymous class */
    class IabHelper._cls4
        implements Runnable
    {

        final List a;
        final d.a b;
        final Handler c;
        final d.b d;
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
                c.post(new IabHelper._cls4._cls1(this, arraylist));
            }
            if (!e.d && d != null)
            {
                c.post(new IabHelper._cls4._cls2(arraylist));
            }
        }

        // Unreferenced inner class com/aviary/android/feather/cds/billing/util/IabHelper$4$2

/* anonymous class */
        class IabHelper._cls4._cls2
            implements Runnable
        {

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
        }

    }

}
