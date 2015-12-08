// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

// Referenced classes of package crittercism.android:
//            c, f

public final class e
{
    final class a
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

        private a(c c1)
        {
            a = e.this;
            super();
            b = c1;
        }

        a(c c1, byte byte0)
        {
            this(c1);
        }
    }


    List a;
    final Set b;
    final Set c;
    private Executor d;

    public e(Executor executor)
    {
        this(executor, ((List) (new LinkedList())), ((List) (new LinkedList())));
    }

    private e(Executor executor, List list, List list1)
    {
        a = new LinkedList();
        b = new HashSet();
        c = new HashSet();
        d = executor;
        a(list);
        b(list1);
    }

    public final void a(c c1)
    {
        a(c1, c.a.e);
    }

    public final void a(c c1, c.a a1)
    {
        if (c1.b)
        {
            return;
        } else
        {
            c1.b = true;
            c1.c = a1;
            d.execute(new a(c1, (byte)0));
            return;
        }
    }

    public final void a(f f)
    {
        synchronized (a)
        {
            a.add(f);
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
