// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package crittercism.android:
//            e, c, f

final class <init>
    implements Runnable
{

    final e a;
    private c b;

    private boolean a(c c1)
    {
label0:
        {
            String s = c1.a();
            synchronized (a.b)
            {
                Iterator iterator = a.b.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                } while (!s.contains((String)iterator.next()));
            }
            return true;
        }
        return false;
        exception;
        throw exception;
    }

    private boolean a(String s)
    {
label0:
        {
            synchronized (a.c)
            {
                Iterator iterator = a.c.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                } while (!s.contains((String)iterator.next()));
            }
            return false;
        }
        return true;
        s;
        throw s;
    }

    public final void run()
    {
        if (a(b))
        {
            return;
        }
        String s = b.a();
        if (a(s))
        {
            int i = s.indexOf("?");
            if (i != -1)
            {
                b.a(s.substring(0, i));
            }
        }
        List list = a.a;
        list;
        JVM INSTR monitorenter ;
        for (Iterator iterator = a.a.iterator(); iterator.hasNext(); ((f)iterator.next()).a(b)) { }
        break MISSING_BLOCK_LABEL_111;
        Exception exception;
        exception;
        throw exception;
        list;
        JVM INSTR monitorexit ;
    }

    private (e e1, c c1)
    {
        a = e1;
        super();
        b = c1;
    }

    b(e e1, c c1, byte byte0)
    {
        this(e1, c1);
    }
}
