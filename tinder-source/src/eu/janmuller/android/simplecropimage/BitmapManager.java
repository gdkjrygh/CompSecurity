// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package eu.janmuller.android.simplecropimage;

import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

public final class BitmapManager
{
    private static final class State extends Enum
    {

        public static final State a;
        public static final State b;
        private static final State c[];

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(eu/janmuller/android/simplecropimage/BitmapManager$State, s);
        }

        public static State[] values()
        {
            return (State[])c.clone();
        }

        static 
        {
            a = new State("CANCEL", 0);
            b = new State("ALLOW", 1);
            c = (new State[] {
                a, b
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class a
        implements Iterable
    {

        private final WeakHashMap a = new WeakHashMap();

        public final Iterator iterator()
        {
            return a.keySet().iterator();
        }

        public a()
        {
        }
    }

    private static final class b
    {

        public State a;
        public android.graphics.BitmapFactory.Options b;

        public final String toString()
        {
            String s;
            if (a == State.a)
            {
                s = "Cancel";
            } else
            if (a == State.b)
            {
                s = "Allow";
            } else
            {
                s = "?";
            }
            return (new StringBuilder("thread state = ")).append(s).append(", options = ").append(b).toString();
        }

        private b()
        {
            a = State.b;
        }

        b(byte byte0)
        {
            this();
        }
    }


    private static BitmapManager a = null;
    private final WeakHashMap b = new WeakHashMap();

    private BitmapManager()
    {
    }

    private b a(Thread thread)
    {
        this;
        JVM INSTR monitorenter ;
        b b2 = (b)b.get(thread);
        b b1;
        b1 = b2;
        if (b2 != null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        b1 = new b((byte)0);
        b.put(thread, b1);
        this;
        JVM INSTR monitorexit ;
        return b1;
        thread;
        throw thread;
    }

    public static BitmapManager a()
    {
        eu/janmuller/android/simplecropimage/BitmapManager;
        JVM INSTR monitorenter ;
        BitmapManager bitmapmanager;
        if (a == null)
        {
            a = new BitmapManager();
        }
        bitmapmanager = a;
        eu/janmuller/android/simplecropimage/BitmapManager;
        JVM INSTR monitorexit ;
        return bitmapmanager;
        Exception exception;
        exception;
        throw exception;
    }

    private void b(Thread thread)
    {
        this;
        JVM INSTR monitorenter ;
        thread = a(thread);
        thread.a = State.a;
        if (((b) (thread)).b != null)
        {
            ((b) (thread)).b.requestCancelDecode();
        }
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
        thread;
        throw thread;
    }

    public final void a(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        for (a1 = a1.iterator(); a1.hasNext(); b((Thread)a1.next())) { }
        break MISSING_BLOCK_LABEL_37;
        a1;
        throw a1;
        this;
        JVM INSTR monitorexit ;
    }

}
