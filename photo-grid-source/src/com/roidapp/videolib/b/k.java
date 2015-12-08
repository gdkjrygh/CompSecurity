// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib.b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jp.co.cyberagent.android.a.h;

// Referenced classes of package com.roidapp.videolib.b:
//            w, x

public final class k
{

    private List a;
    private h b;
    private w c;
    private List d;

    public k()
    {
        a = new ArrayList();
        b = null;
        c = new w();
        d = new ArrayList();
    }

    public final void a()
    {
        a.clear();
        d.clear();
        c.a();
    }

    public final void a(long l)
    {
        d.clear();
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            x x1 = (x)iterator.next();
            if (l >= x1.b && l < x1.c)
            {
                d.add(x1);
            }
        } while (true);
        c.a();
        iterator = d.iterator();
        do
        {
            if (iterator.hasNext())
            {
                x x2 = (x)iterator.next();
                switch (x2.a)
                {
                case 1: // '\001'
                    c.a(x2.d, x2.e, x2.b, x2.c);
                    break;

                case 2: // '\002'
                    c.b(x2.d, x2.e, x2.b, x2.c);
                    break;

                case 3: // '\003'
                    c.c(x2.d, x2.e, x2.b, x2.c);
                    break;

                case 4: // '\004'
                    c.d(x2.d, x2.e, x2.b, x2.c);
                    break;

                case 5: // '\005'
                    c.f(x2.d, x2.e, x2.b, x2.c);
                    break;

                case 6: // '\006'
                    c.e(x2.d, x2.e, x2.b, x2.c);
                    break;

                case 7: // '\007'
                    c.a(x2.d, x2.e, x2.b, x2.c, x2.f, x2.g, x2.h);
                    break;

                case 8: // '\b'
                    c.g(x2.d, x2.e, x2.b, x2.c);
                    break;
                }
            } else
            {
                c.a(l);
                return;
            }
        } while (true);
    }

    public final void a(x x1)
    {
        if (a.size() == 0)
        {
            a.add(x1);
            return;
        }
        int i;
        for (i = 0; i < a.size() && ((x)a.get(i)).b <= x1.b; i++) { }
        if (i >= a.size())
        {
            a.add(x1);
            return;
        }
        a.add(x1);
        for (int j = a.size() - 2; j >= i; j--)
        {
            a.set(j + 1, a.get(j));
        }

        a.set(i, x1);
    }

    public final void a(h h)
    {
        b = h;
        c.a(h);
    }
}
