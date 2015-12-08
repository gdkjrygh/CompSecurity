// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import com.arist.b.c;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.arist.activity:
//            MyApplication, a, AddToListActivity

final class b
    implements Runnable
{

    final a a;
    private final ArrayList b;

    b(a a1, ArrayList arraylist)
    {
        a = a1;
        b = arraylist;
        super();
    }

    public final void run()
    {
        Iterator iterator = MyApplication.l.iterator();
        do
        {
            c c1;
            do
            {
                if (!iterator.hasNext())
                {
                    AddToListActivity.g(com.arist.activity.a.a(a));
                    com.arist.activity.a.a(a).setResult(-1);
                    com.arist.activity.a.a(a).onBackPressed();
                    return;
                }
                c1 = (c)iterator.next();
            } while (c1.d() != com.arist.activity.a.a(a).a.d());
            c1.a(b);
        } while (true);
    }
}
