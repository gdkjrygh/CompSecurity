// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.iab.util;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.iab.util:
//            g, e, d, c

class a
    implements Runnable
{

    final List a;
    final a b;

    public void run()
    {
        b.b.b((g)b.b.get(0), (e)a.get(0));
    }

    a(a a1, List list)
    {
        b = a1;
        a = list;
        super();
    }

    // Unreferenced inner class com/cardinalblue/android/piccollage/iab/util/IabHelper$3

/* anonymous class */
    class IabHelper._cls3
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
                g g1 = (g)iterator.next();
                try
                {
                    e.a(g1);
                    arraylist.add(new e(0, (new StringBuilder()).append("Successful consume of sku ").append(g1.d()).toString()));
                }
                catch (c c1)
                {
                    arraylist.add(c1.a());
                }
            }

            e.b();
            if (!e.d && b != null)
            {
                c.post(new IabHelper._cls3._cls1(this, arraylist));
            }
            if (!e.d && d != null)
            {
                c.post(new IabHelper._cls3._cls2(arraylist));
            }
        }

            
            {
                e = d1;
                a = list;
                b = a1;
                c = handler;
                d = b1;
                super();
            }

        // Unreferenced inner class com/cardinalblue/android/piccollage/iab/util/IabHelper$3$2

/* anonymous class */
        class IabHelper._cls3._cls2
            implements Runnable
        {

            final List a;
            final IabHelper._cls3 b;

            public void run()
            {
                b.d.a(b.a, a);
            }

                    
                    {
                        b = IabHelper._cls3.this;
                        a = list;
                        super();
                    }
        }

    }

}
