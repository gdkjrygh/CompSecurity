// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;

import java.security.InvalidParameterException;

// Referenced classes of package p.cx:
//            g

public class v
{
    public static abstract class a
    {

        public abstract void a(g g1);

        public a()
        {
        }
    }


    private g a;

    public v()
    {
    }

    public void a()
    {
        if (a != null)
        {
            a.a();
        }
    }

    public void a(a a1)
    {
        if (a1 == null)
        {
            throw new InvalidParameterException("startWorker() must be called with a valid timerTask");
        } else
        {
            a(a1, 0, 1000);
            return;
        }
    }

    public void a(a a1, int i, int j)
    {
        String s = a1.getClass().getName();
        StringBuilder stringbuilder = new StringBuilder();
        if (s == null)
        {
            s = "No name";
        }
        s = stringbuilder.append(s).append(" worker").toString();
        a = new g(s.substring(s.lastIndexOf('.') + 1), i, j, a1) {

            final int a;
            final int b;
            final a c;
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

            
            {
                d = v.this;
                a = i;
                b = j;
                c = a1;
                super(s);
            }
        };
        a.start();
    }

    public boolean b()
    {
        if (a != null)
        {
            return a.b();
        } else
        {
            return true;
        }
    }
}
