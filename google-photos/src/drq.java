// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Point;
import java.util.Iterator;
import java.util.List;

final class drq
    implements Runnable
{

    private Point a;
    private int b;
    private hbn c;
    private boolean d;
    private jho e;
    private drp f;

    drq(drp drp1, Point point, int i, hbn hbn1, boolean flag, jho jho1)
    {
        f = drp1;
        a = point;
        b = i;
        c = hbn1;
        d = flag;
        e = jho1;
        super();
    }

    public final void run()
    {
        Object obj;
        f.a(a, b);
        Object obj1;
        Object obj2;
        hbn hbn1;
        long l;
        if (c.a == null)
        {
            l = System.currentTimeMillis();
        } else
        {
            l = (new ive()).a(c.a.b).b();
        }
        obj1 = c.c.iterator();
        if (((Iterator) (obj1)).hasNext())
        {
            obj = (hbp)((Iterator) (obj1)).next();
            if (((hbp) (obj)).b == hbq.b)
            {
                continue; /* Loop/switch isn't completed */
            }
            obj2 = ((hbp) (obj)).a.iterator();
            do
            {
                if (!((Iterator) (obj2)).hasNext())
                {
                    continue; /* Loop/switch isn't completed */
                }
                obj = (hbo)((Iterator) (obj2)).next();
            } while (((hbo) (obj)).b == -1L || ((hbo) (obj)).b > l);
            break; /* Loop/switch isn't completed */
        }
        obj = null;
          goto _L1
        if (true) goto _L3; else goto _L2
_L3:
        break MISSING_BLOCK_LABEL_43;
_L2:
        obj2 = c;
        hbn1 = f.a;
        obj1 = obj;
        if (obj == null)
        {
            obj1 = c.b;
        }
        ((hbn) (obj2)).a(hbn1, ((hbo) (obj1)), f.a.b);
        f.b(d);
        e.aA_();
        return;
_L1:
        if (true) goto _L2; else goto _L4
_L4:
    }
}
