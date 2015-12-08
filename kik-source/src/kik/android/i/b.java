// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.i;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import com.kik.sdkutils.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;
import kik.a.e.v;
import kik.android.chat.KikApplication;

// Referenced classes of package kik.android.i:
//            a, c

public final class b
{

    private static Handler a = new Handler();
    private final SortedMap b = Collections.synchronizedSortedMap(new TreeMap());
    private final TreeSet c = new TreeSet();
    private int d;

    public b()
    {
        d = -1;
    }

    static int a(b b1)
    {
        return b1.d;
    }

    static int a(b b1, int i)
    {
        b1.d = i;
        return i;
    }

    public static boolean a(Context context, v v1)
    {
        if (context == null)
        {
            return false;
        }
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (context == null || !context.isConnected())
        {
            return false;
        }
        String s = KikApplication.f(0x7f090367);
        String s1 = v1.b("kik.chat.video.autoplay", s);
        if (s1.equals(KikApplication.f(0x7f090368)))
        {
            if (context.getType() == 1)
            {
                return true;
            }
            if (v1.b("kik.chat.video.prefetch", KikApplication.f(0x7f090368)).equals(KikApplication.f(0x7f090367)))
            {
                return true;
            }
        } else
        if (s1.equals(s))
        {
            return true;
        }
        return false;
    }

    public static boolean a(Context context, boolean flag, v v1)
    {
        while (context == null || v1.b("kik.chat.video.autoplay", KikApplication.f(0x7f090367)).equals(KikApplication.f(0x7f09016f)) || !a(context, v1) && !flag) 
        {
            return false;
        }
        return true;
    }

    static TreeSet b(b b1)
    {
        return b1.c;
    }

    private void b()
    {
        if (y.b(9))
        {
            return;
        }
        synchronized (c)
        {
            Object obj = c.descendingIterator();
            int i;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break MISSING_BLOCK_LABEL_114;
                }
                i = ((Integer)((Iterator) (obj)).next()).intValue();
            } while (!b.containsKey(Integer.valueOf(i)));
            obj = (a)b.get(Integer.valueOf(i));
            a.removeCallbacksAndMessages(null);
            a.postDelayed(new c(this, i, ((a) (obj))), 200L);
        }
        return;
        exception;
        treeset;
        JVM INSTR monitorexit ;
        throw exception;
        treeset;
        JVM INSTR monitorexit ;
    }

    public final void a()
    {
        synchronized (c)
        {
            c.clear();
        }
        b.clear();
        this;
        JVM INSTR monitorenter ;
        d = -1;
        this;
        JVM INSTR monitorexit ;
        return;
        exception1;
        treeset;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(int i)
    {
        synchronized (c)
        {
            c.add(Integer.valueOf(i));
        }
        if (b.containsKey(Integer.valueOf(i)))
        {
            ((a)b.get(Integer.valueOf(i))).b(i);
        }
        b();
        return;
        exception;
        treeset;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(int i, a a1)
    {
        b.put(Integer.valueOf(i), a1);
        b();
    }

    public final void b(int i)
    {
        synchronized (c)
        {
            c.remove(Integer.valueOf(i));
        }
        b();
        return;
        exception;
        treeset;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void c(int i)
    {
        synchronized (c)
        {
            c.remove(Integer.valueOf(i));
        }
        if (d != i) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        d = -1;
        this;
        JVM INSTR monitorexit ;
_L2:
        if (b.remove(Integer.valueOf(i)) == null)
        {
            break MISSING_BLOCK_LABEL_381;
        }
        obj = c;
        obj;
        JVM INSTR monitorenter ;
        Object obj2 = new HashSet(c.tailSet(Integer.valueOf(i)));
        obj1 = new ArrayList();
        int j;
        for (obj2 = ((Set) (obj2)).iterator(); ((Iterator) (obj2)).hasNext(); ((List) (obj1)).add(Integer.valueOf(j)))
        {
            j = ((Integer)((Iterator) (obj2)).next()).intValue();
            c.remove(Integer.valueOf(j));
        }

        break MISSING_BLOCK_LABEL_166;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        int k;
        for (Iterator iterator = ((List) (obj1)).iterator(); iterator.hasNext(); c.add(Integer.valueOf(k - 1)))
        {
            k = ((Integer)iterator.next()).intValue();
        }

        obj;
        JVM INSTR monitorexit ;
        HashMap hashmap = new HashMap();
        for (Iterator iterator1 = (new HashSet(b.tailMap(Integer.valueOf(i)).keySet())).iterator(); iterator1.hasNext(); hashmap.put(Integer.valueOf(i), (a)b.remove(Integer.valueOf(i))))
        {
            i = ((Integer)iterator1.next()).intValue();
        }

        a a1;
        for (Iterator iterator2 = hashmap.keySet().iterator(); iterator2.hasNext(); b.put(Integer.valueOf(i - 1), a1))
        {
            i = ((Integer)iterator2.next()).intValue();
            a1 = (a)hashmap.get(Integer.valueOf(i));
        }

        b();
    }

}
