// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class Ww
{
    public final class a
    {

        public Wv a;
        public Wv.a b;
        Wv.b c;

        public a(Wv wv, Wv.a a1, Wv.b b1)
        {
            a = wv;
            b = a1;
            c = b1;
        }
    }


    public final Queue a = new ConcurrentLinkedQueue();
    public final Lock b = new ReentrantLock();
    public a c;

    public Ww()
    {
        c = null;
    }

    public final void a()
    {
        b.lock();
        if (c != null || a.isEmpty())
        {
            b.unlock();
            return;
        } else
        {
            a a1 = (a)a.poll();
            c = a1;
            b.unlock();
            Wv wv = a1.a;
            Wv.a a2 = new Wv.a(a1) {

                private a a;
                private Ww b;

                public final void a(Wv.c c1, String s)
                {
                    Ww ww = b;
                    Wv.a a3 = a.b;
                    if (a3 != null)
                    {
                        a3.a(c1, s);
                    }
                    ww.b.lock();
                    ww.c = null;
                    ww.b.unlock();
                    ww.a();
                }

            
            {
                b = Ww.this;
                a = a1;
                super();
            }
            };
            (new Thread(new Wv._cls1(wv, wv, a1.c, a2))).start();
            return;
        }
    }

    public final void a(Wv wv, Wv.a a1, Wv.b b1)
    {
        dv.a(wv);
        b.lock();
        a.add(new a(wv, a1, b1));
        b.unlock();
        a();
    }
}
