// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;

import p.df.a;

// Referenced classes of package p.cx:
//            g, v

class .String extends g
{

    final int a;
    final int b;
    final b c;
    final v d;

    public void run()
    {
        if (!d.b())
        {
            try
            {
                sleep(a);
                if (!d.b())
                {
                    if (b < 0)
                    {
                        c.a(this);
                        return;
                    }
                    continue; /* Loop/switch isn't completed */
                }
            }
            catch (InterruptedException interruptedexception)
            {
                p.df.a.c("PandoraTimer", "workerThread interrupted!");
                return;
            }
        }
_L2:
        return;
_L3:
        sleep(b);
        if (b()) goto _L2; else goto _L1
_L1:
        boolean flag;
        c.a(this);
        flag = b();
        if (flag)
        {
            return;
        }
          goto _L3
    }

    .String(v v1, String s, int i, int j, .String s1)
    {
        d = v1;
        a = i;
        b = j;
        c = s1;
        super(s);
    }
}
