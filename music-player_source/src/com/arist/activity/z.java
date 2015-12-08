// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import android.os.Handler;
import com.arist.a.e;
import com.arist.b.b;
import com.arist.b.c;
import com.arist.model.b.d;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.arist.activity:
//            MyApplication, MainActivity, aa

final class z extends Thread
{

    final MainActivity a;
    private final int b;
    private final int c;

    z(MainActivity mainactivity, int i, int j)
    {
        a = mainactivity;
        b = i;
        c = j;
        super();
    }

    static MainActivity a(z z1)
    {
        return z1.a;
    }

    public final void run()
    {
        c c1 = (c)MyApplication.l.get(b);
        ArrayList arraylist = c1.f();
        Object obj = MainActivity.a(a).b(c).f();
        d d1 = new d();
        obj = ((ArrayList) (obj)).iterator();
        do
        {
            b b1;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    MainActivity.l(a).post(new aa(this));
                    return;
                }
                b1 = (b)((Iterator) (obj)).next();
            } while (arraylist.contains(b1));
            arraylist.add(b1);
            d1.a(b1, c1);
        } while (true);
    }
}
