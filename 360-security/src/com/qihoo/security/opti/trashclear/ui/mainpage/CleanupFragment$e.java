// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.mainpage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui.mainpage:
//            CleanupFragment

private static class a extends Thread
{

    private static final SparseArray c;
    private static final List d;
    private final d a;
    private boolean b;

    public void a()
    {
        b = true;
    }

    public boolean b()
    {
        return b;
    }

    public void c()
    {
        if (a != null)
        {
            a.a(0, 0);
        }
        start();
    }

    public void d()
    {
        if (a != null)
        {
            a.a();
        }
    }

    public void run()
    {
        int j = 0;
        int i = 0;
        do
        {
            if (b || j == d.size())
            {
                return;
            }
            int k = ((Integer)d.get(j)).intValue();
            a a1 = (d)c.get(k);
            if (a(a1) == i)
            {
                if (a != null)
                {
                    a.a(k, b(a1) * 1000);
                }
                j++;
                i = 0;
            }
            try
            {
                Thread.sleep(1000L);
            }
            catch (InterruptedException interruptedexception)
            {
                interruptedexception.printStackTrace();
            }
            i++;
        } while (true);
    }

    static 
    {
        c = new SparseArray(7);
        d = new ArrayList();
        c.put(Integer.valueOf(50).intValue(), new <init>(0, 10));
        c.put(Integer.valueOf(90).intValue(), new <init>(10, 80));
        c.put(Integer.valueOf(99).intValue(), new <init>(80, 1024));
        d.add(Integer.valueOf(50));
        d.add(Integer.valueOf(90));
        d.add(Integer.valueOf(99));
    }

    public ( )
    {
        a = ;
    }
}
