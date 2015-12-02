// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.mainpage;

import com.qihoo.security.SecurityApplication;
import com.qihoo.security.service.ProcessClearService;
import com.qihoo.security.support.b;
import com.qihoo360.mobilesafe.share.SharedPref;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui.mainpage:
//            CleanupFragment

private static class b extends Thread
{

    private boolean a;
    private final a b;
    private long c;
    private long d;
    private long e;

    public void a()
    {
        a = false;
        start();
    }

    public void a(long l)
    {
        c = l;
    }

    public void b()
    {
        a = true;
        com.qihoo.security.support.b.a(18315, String.valueOf(d), String.valueOf(e), String.valueOf(0));
    }

    public void run()
    {
        int i = 0;
        do
        {
            if (a)
            {
                break;
            }
            int j;
            try
            {
                Thread.sleep(1000L);
            }
            catch (InterruptedException interruptedexception)
            {
                interruptedexception.printStackTrace();
            }
            j = i + 1;
            if (j == 1 || j == 2 || j == 3 || j == 5)
            {
                i = j;
                if (j != 1)
                {
                    if (j == 2)
                    {
                        if (!SharedPref.b(SecurityApplication.a(), "sp_key_has_clear_memory", false))
                        {
                            ProcessClearService.e();
                        }
                        d = c;
                        i = j;
                        if (b != null)
                        {
                            b.a(c);
                            i = j;
                        }
                    } else
                    {
                        i = j;
                        if (j == 5)
                        {
                            if (!SharedPref.b(SecurityApplication.a(), "sp_key_has_clear_memory", false))
                            {
                                ProcessClearService.e();
                            }
                            e = c;
                            i = j;
                            if (b != null)
                            {
                                b.a(c);
                                i = j;
                            }
                        }
                    }
                }
            } else
            {
                i = j;
                if (j == 10)
                {
                    com.qihoo.security.support.b.a(18315, String.valueOf(d), String.valueOf(e), String.valueOf(c));
                    if (b != null)
                    {
                        b.a(c);
                        b.a();
                    }
                    a = true;
                    i = j;
                }
            }
        } while (true);
    }

    public ( )
    {
        d = 0L;
        e = 0L;
        b = ;
    }
}
