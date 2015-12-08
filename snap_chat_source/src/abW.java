// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

public final class abW
{
    final class a
        implements Runnable
    {

        private abb a;
        private abW b;

        private boolean a(abb abb1)
        {
label0:
            {
                String s = abb1.a();
                synchronized (b.b)
                {
                    Iterator iterator = b.b.iterator();
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
                synchronized (b.c)
                {
                    Iterator iterator = b.c.iterator();
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
            if (a(a))
            {
                return;
            }
            String s = a.a();
            if (a(s))
            {
                int i = s.indexOf("?");
                if (i != -1)
                {
                    abb abb1 = a;
                    s = s.substring(0, i);
                    if (s == null)
                    {
                        throw new NullPointerException();
                    }
                    abb1.k = s;
                }
            }
            List list = b.a;
            list;
            JVM INSTR monitorenter ;
            for (Iterator iterator = b.a.iterator(); iterator.hasNext(); ((acx)iterator.next()).a(a)) { }
            break MISSING_BLOCK_LABEL_127;
            Exception exception;
            exception;
            throw exception;
            list;
            JVM INSTR monitorexit ;
        }

        private a(abb abb1)
        {
            b = abW.this;
            super();
            a = abb1;
        }

        a(abb abb1, byte byte0)
        {
            this(abb1);
        }
    }


    List a;
    final Set b;
    final Set c;
    private Executor d;

    public abW(Executor executor)
    {
        this(executor, ((List) (new LinkedList())), ((List) (new LinkedList())));
    }

    private abW(Executor executor, List list, List list1)
    {
        a = new LinkedList();
        b = new HashSet();
        c = new HashSet();
        d = executor;
        a(list);
        b(list1);
    }

    public final void a(abb abb1, abb.a a1)
    {
        if (abb1.c)
        {
            return;
        } else
        {
            abb1.c = true;
            abb1.d = a1;
            d.execute(new a(abb1, (byte)0));
            return;
        }
    }

    public final void a(acx acx)
    {
        synchronized (a)
        {
            a.add(acx);
        }
    }

    public final void a(List list)
    {
        synchronized (b)
        {
            b.addAll(list);
            b.remove(null);
        }
    }

    public final void b(List list)
    {
        synchronized (c)
        {
            c.addAll(list);
            c.remove(null);
        }
    }
}
