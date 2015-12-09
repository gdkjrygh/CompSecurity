// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.iab.util;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.iab.util:
//            d, c, g, e

class d
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
            c.post(new Runnable(arraylist) {

                final List a;
                final IabHelper._cls3 b;

                public void run()
                {
                    b.b.a((g)b.a.get(0), (e)a.get(0));
                }

            
            {
                b = IabHelper._cls3.this;
                a = list;
                super();
            }
            });
        }
        if (!e.d && d != null)
        {
            c.post(new Runnable(arraylist) {

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
            });
        }
    }

    _cls2.a(d d1, List list, _cls2.a a1, Handler handler, _cls2.a a2)
    {
        e = d1;
        a = list;
        b = a1;
        c = handler;
        d = a2;
        super();
    }
}
