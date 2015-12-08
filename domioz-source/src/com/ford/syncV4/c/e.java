// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.c;

import com.ford.syncV4.util.c;
import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;

// Referenced classes of package com.ford.syncV4.c:
//            f, a

public final class e
{

    PriorityBlockingQueue a;
    a b;
    private Thread c;
    private Boolean d;

    public e(String s, Comparator comparator, a a1)
    {
        a = null;
        c = null;
        b = null;
        d = Boolean.valueOf(false);
        a = new PriorityBlockingQueue(10, comparator);
        b = a1;
        c = new Thread(new f(this));
        c.setName(s);
        c.setDaemon(true);
        c.start();
    }

    static void a(e e1)
    {
        try
        {
            Object obj;
            for (; !e1.d.booleanValue(); e1.b.a(obj))
            {
                obj = e1.a.take();
            }

        }
        // Misplaced declaration of an exception variable
        catch (e e1) { }
        catch (Exception exception)
        {
            com.ford.syncV4.util.c.a("Error occurred dispating message.", exception);
            e1.b.a("Error occurred dispating message.", exception);
            return;
        }
    }

    public final void a()
    {
        d = Boolean.valueOf(true);
        if (c != null)
        {
            c.interrupt();
            c = null;
        }
    }

    public final void a(Object obj)
    {
        try
        {
            a.put(obj);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            b.b("ClassCastException encountered when queueing message.", ((Exception) (obj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            b.b("Exception encountered when queueing message.", ((Exception) (obj)));
        }
    }
}
