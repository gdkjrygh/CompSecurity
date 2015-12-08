// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;

public abstract class kyw
    implements Comparable
{

    final int a;
    final String b;
    final int c;
    final lab d;
    Integer e;
    kyz f;
    boolean g;
    boolean h;
    las i;
    ksw j;
    private final lex k;
    private boolean l;
    private long m;

    public kyw(int i1, String s, lab lab)
    {
        lex lex1;
        if (lex.a)
        {
            lex1 = new lex();
        } else
        {
            lex1 = null;
        }
        k = lex1;
        g = true;
        l = false;
        h = false;
        m = 0L;
        j = null;
        a = i1;
        b = s;
        d = lab;
        i = new las();
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        s = Uri.parse(s);
        if (s == null) goto _L2; else goto _L3
_L3:
        s = s.getHost();
        if (s == null) goto _L2; else goto _L4
_L4:
        i1 = s.hashCode();
_L6:
        c = i1;
        return;
_L2:
        i1 = 0;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected static lev a(lev lev)
    {
        return lev;
    }

    static lex a(kyw kyw1)
    {
        return kyw1.k;
    }

    private static byte[] a(Map map, String s)
    {
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        try
        {
            for (map = map.entrySet().iterator(); map.hasNext(); stringbuilder.append('&'))
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                stringbuilder.append(URLEncoder.encode((String)entry.getKey(), s));
                stringbuilder.append('=');
                stringbuilder.append(URLEncoder.encode((String)entry.getValue(), s));
            }

        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            throw new RuntimeException((new StringBuilder("Encoding not supported: ")).append(s).toString(), map);
        }
        map = stringbuilder.toString().getBytes(s);
        return map;
    }

    public Map a()
    {
        return Collections.emptyMap();
    }

    protected abstract laa a(kwt kwt);

    protected abstract void a(Object obj);

    public final void a(String s)
    {
        if (lex.a)
        {
            k.a(s, Thread.currentThread().getId());
        } else
        if (m == 0L)
        {
            m = SystemClock.elapsedRealtime();
            return;
        }
    }

    public final String b()
    {
        return d();
    }

    final void b(String s)
    {
        if (f == null) goto _L2; else goto _L1
_L1:
        kyz kyz1;
        kyz1 = f;
        synchronized (kyz1.b)
        {
            kyz1.b.remove(this);
        }
        obj = kyz1.d;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = kyz1.d.iterator(); iterator.hasNext(); iterator.next()) { }
        break MISSING_BLOCK_LABEL_81;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        obj;
        JVM INSTR monitorexit ;
        if (!g) goto _L2; else goto _L3
_L3:
        Map map = kyz1.a;
        map;
        JVM INSTR monitorenter ;
        String s1;
        Queue queue;
        s1 = b;
        queue = (Queue)kyz1.a.remove(s1);
        if (queue == null)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        if (lew.a)
        {
            lew.a("Releasing %d waiting requests for cacheKey=%s.", new Object[] {
                Integer.valueOf(queue.size()), s1
            });
        }
        kyz1.c.addAll(queue);
        map;
        JVM INSTR monitorexit ;
_L2:
        if (!lex.a) goto _L5; else goto _L4
_L4:
        long l1 = Thread.currentThread().getId();
        if (Looper.myLooper() == Looper.getMainLooper()) goto _L7; else goto _L6
_L6:
        (new Handler(Looper.getMainLooper())).post(new kyx(this, s, l1));
_L9:
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
_L7:
        k.a(s, l1);
        k.a(toString());
        return;
_L5:
        long l2 = SystemClock.elapsedRealtime() - m;
        if (l2 >= 3000L)
        {
            lew.b("%d ms: %s", new Object[] {
                Long.valueOf(l2), toString()
            });
            return;
        }
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final byte[] c()
    {
        if (false)
        {
            throw new NullPointerException();
        } else
        {
            return null;
        }
    }

    public int compareTo(Object obj)
    {
        obj = (kyw)obj;
        kyy kyy1 = kyy.a;
        kyy kyy2 = kyy.a;
        if (kyy1 == kyy2)
        {
            return e.intValue() - ((kyw) (obj)).e.intValue();
        } else
        {
            return kyy2.ordinal() - kyy1.ordinal();
        }
    }

    public final String d()
    {
        return (new StringBuilder("application/x-www-form-urlencoded; charset=")).append("UTF-8").toString();
    }

    public final int e()
    {
        return i.a();
    }

    public String toString()
    {
        String s = (new StringBuilder("0x")).append(Integer.toHexString(c)).toString();
        return (new StringBuilder("[ ] ")).append(b).append(" ").append(s).append(" ").append(kyy.a).append(" ").append(e).toString();
    }
}
