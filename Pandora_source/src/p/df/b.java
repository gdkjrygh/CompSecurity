// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.df;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package p.df:
//            a

public final class b
{
    private static class a
    {

        private long a;
        private String b;

        public String a()
        {
            return b;
        }

        public long b()
        {
            return a;
        }

        public a(String s)
        {
            a = System.currentTimeMillis();
            b = s;
        }
    }


    private static boolean a = false;
    private static List b = new ArrayList();
    private static final Object c = new Object();

    public static void a()
    {
        if (a)
        {
            synchronized (c)
            {
                b = new ArrayList();
            }
            return;
        } else
        {
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void a(String s)
    {
        if (a)
        {
            synchronized (c)
            {
                b.add(new a(s));
            }
            return;
        } else
        {
            return;
        }
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static void b()
    {
        if (!a) goto _L2; else goto _L1
_L1:
        p.df.a.c("TYMER", "TYMER: \n\n\n\n");
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = b.iterator();
        Exception exception = null;
_L9:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        a a1 = (a)iterator.next();
        if (exception != null) goto _L6; else goto _L5
_L5:
        p.df.a.c("TYMER", (new StringBuilder()).append("TYMER start ").append(a1.a()).toString());
          goto _L7
_L6:
        p.df.a.c("TYMER", "TYMER %6d : %6d - %s", new Object[] {
            String.valueOf(a1.b() - exception.b()), String.valueOf(a1.b() - ((a)b.get(0)).b()), a1.a()
        });
          goto _L7
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L4:
        obj;
        JVM INSTR monitorexit ;
        a();
        p.df.a.c("TYMER", "\n\n\n\n");
_L2:
        return;
_L7:
        exception = a1;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }

}
