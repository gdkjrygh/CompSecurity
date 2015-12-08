// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.anrwatchdog;

import android.os.Looper;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// Referenced classes of package com.github.anrwatchdog:
//            ANRError$$

public class ANRError extends Error
{

    private static final long serialVersionUID = 1L;
    private final Map _stackTraces;

    private ANRError(.._Thread _pthread, Map map)
    {
        super("Application Not Responding", _pthread);
        _stackTraces = map;
    }

    public static ANRError a()
    {
        Object obj = Looper.getMainLooper().getThread();
        StackTraceElement astacktraceelement[] = ((Thread) (obj)).getStackTrace();
        HashMap hashmap = new HashMap(1);
        hashmap.put(obj, astacktraceelement);
        obj = new ANRError$$(((Thread) (obj)).getName(), astacktraceelement, (byte)0);
        obj.getClass();
        class .._Thread extends Throwable
        {

            final ANRError$$ this$0;

            public Throwable fillInStackTrace()
            {
                setStackTrace(b);
                return this;
            }

            private .._Thread(.._Thread _pthread)
            {
                this$0 = ANRError$$.this;
                super(a, _pthread);
            }

            .._Thread(.._Thread _pthread, byte byte0)
            {
                this(_pthread);
            }
        }

        return new ANRError(((.._Thread) (obj)). new .._Thread(null, (byte)0), hashmap);
    }

    public static ANRError a(String s)
    {
        Object obj = Looper.getMainLooper().getThread();
        TreeMap treemap = new TreeMap(new Comparator(((Thread) (obj))) {

            private Thread a;

            public final int compare(Object obj2, Object obj3)
            {
                obj2 = (Thread)obj2;
                obj3 = (Thread)obj3;
                if (obj2 == obj3)
                {
                    return 0;
                }
                if (obj2 == a)
                {
                    return 1;
                }
                if (obj3 == a)
                {
                    return -1;
                } else
                {
                    return ((Thread) (obj3)).getName().compareTo(((Thread) (obj2)).getName());
                }
            }

            
            {
                a = thread;
                super();
            }
        });
        Iterator iterator = Thread.getAllStackTraces().entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (entry.getKey() == obj || ((Thread)entry.getKey()).getName().startsWith(s) && ((StackTraceElement[])entry.getValue()).length > 0)
            {
                treemap.put(entry.getKey(), entry.getValue());
            }
        } while (true);
        obj = treemap.entrySet().iterator();
        Object obj1;
        for (s = null; ((Iterator) (obj)).hasNext(); s = ((.._Thread) (obj1)). new .._Thread(s, (byte)0))
        {
            obj1 = (java.util.Map.Entry)((Iterator) (obj)).next();
            obj1 = new ANRError$$(((Thread)((java.util.Map.Entry) (obj1)).getKey()).getName(), (StackTraceElement[])((java.util.Map.Entry) (obj1)).getValue(), (byte)0);
            obj1.getClass();
        }

        return new ANRError(s, treemap);
    }

    public Throwable fillInStackTrace()
    {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
