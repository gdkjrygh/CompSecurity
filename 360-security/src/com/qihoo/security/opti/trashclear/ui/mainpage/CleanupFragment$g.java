// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.mainpage;


// Referenced classes of package com.qihoo.security.opti.trashclear.ui.mainpage:
//            CleanupFragment

private static class c extends Thread
{

    private boolean a;
    private final c b;
    private final String c[];

    public void a()
    {
        start();
    }

    public void b()
    {
        a = true;
    }

    public void run()
    {
        int j;
        if (c == null)
        {
            j = 0;
        } else
        {
            j = c.length;
        }
        if (j > 0)
        {
            int i = 0;
            while (!a) 
            {
                if (b != null)
                {
                    b.a(c[i]);
                }
                int k = i + 1;
                i = k;
                if (k == j)
                {
                    i = 0;
                }
                try
                {
                    Thread.sleep(600L);
                }
                catch (InterruptedException interruptedexception)
                {
                    interruptedexception.printStackTrace();
                }
            }
        }
    }

    public ( , String as[])
    {
        b = ;
        if (as == null)
        {
             = null;
        } else
        {
             = (String[])as.clone();
        }
        c = ;
    }
}
