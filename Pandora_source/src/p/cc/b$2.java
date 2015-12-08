// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cc;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package p.cc:
//            b, a, e, c

class .Object
    implements Runnable
{

    final List a;
    final .List b;
    final Handler c;
    final s.Handler d;
    final b e;

    public void run()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            e e1 = (e)iterator.next();
            try
            {
                e.a(e1);
                arraylist.add(new c(0, (new StringBuilder()).append("Successful consume of sku ").append(e1.c()).toString()));
            }
            catch (a a1)
            {
                arraylist.add(a1.a());
            }
        }

        e.c();
        if (b != null)
        {
            c.post(new Runnable(arraylist) {

                final List a;
                final b._cls2 b;

                public void run()
                {
                    b.b.a((e)b.a.get(0), (c)a.get(0));
                }

            
            {
                b = b._cls2.this;
                a = list;
                super();
            }
            });
        }
        if (d != null)
        {
            c.post(new Runnable(arraylist) {

                final List a;
                final b._cls2 b;

                public void run()
                {
                    b.d.a(b.a, a);
                }

            
            {
                b = b._cls2.this;
                a = list;
                super();
            }
            });
        }
    }

    (b b1, List list, .List list1, Handler handler,  )
    {
        e = b1;
        a = list;
        b = list1;
        c = handler;
        d = ;
        super();
    }
}
