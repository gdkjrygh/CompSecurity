// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cn;

import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.ac;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p.bz.x;

class d
{
    static class a
    {

        final aa a;
        long b;
        final int c;
        final String d;

        a(aa aa1, int i, String s1, long l)
        {
            a = aa1;
            b = l;
            c = i;
            d = s1;
        }
    }


    private final ArrayList a;
    private final LinkedHashMap b;

    d(int i)
    {
        a = new ArrayList(i);
        b = new LinkedHashMap(i);
    }

    private String b(String s1, int i)
    {
        if (s1 == null)
        {
            throw new InvalidParameterException("makeTrackKey: trackToken must not be null");
        } else
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("sbkbu_");
            stringbuilder.append(i);
            stringbuilder.append("_");
            stringbuilder.append(s1);
            return stringbuilder.toString();
        }
    }

    int a()
    {
        return a.size();
    }

    public int a(String s1)
    {
        s1 = (a)b.get(s1);
        return a.indexOf(s1);
    }

    aa a(int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        if (i < a.size())
        {
            break MISSING_BLOCK_LABEL_21;
        }
        this;
        JVM INSTR monitorexit ;
        return null;
        Object obj = (a)a.get(i);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        obj = null;
_L1:
        this;
        JVM INSTR monitorexit ;
        return ((aa) (obj));
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj = ((a) (obj)).a;
          goto _L1
    }

    String a(aa aa1)
    {
        this;
        JVM INSTR monitorenter ;
        if (aa1 != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new InvalidParameterException("TrackHistoryCollection.add(): TrackHistoryItem must contain TrackData");
        aa1;
        this;
        JVM INSTR monitorexit ;
        throw aa1;
        String s1;
        if (s.a(aa1.w()))
        {
            throw new InvalidParameterException("TrackHistoryCollection.add(): TrackHistoryItem must contain TrackData woth a track token");
        }
        s1 = b(aa1.w(), a());
        aa1 = new a(aa1, a(), s1, System.currentTimeMillis());
        a.add(aa1);
        b.put(s1, aa1);
        aa1 = new x(((a) (aa1)).a, s1);
        b.a.e().a(aa1);
        this;
        JVM INSTR monitorexit ;
        return s1;
    }

    String a(String s1, int i)
    {
        this;
        JVM INSTR monitorenter ;
        s1 = b(s1, i);
        this;
        JVM INSTR monitorexit ;
        return s1;
        s1;
        this;
        JVM INSTR monitorexit ;
        throw s1;
    }

    void a(d d1)
    {
        this;
        JVM INSTR monitorenter ;
        d1 = d1.b().iterator();
        do
        {
            if (!d1.hasNext())
            {
                break;
            }
            a a1 = (a)d1.next();
            if (b(a1.a))
            {
                a(a1.a);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_59;
        d1;
        this;
        JVM INSTR monitorexit ;
        throw d1;
        this;
        JVM INSTR monitorexit ;
    }

    ArrayList b()
    {
        return a;
    }

    boolean b(aa aa1)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[ac.values().length];
                try
                {
                    a[ac.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[ac.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[ac.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[aa1.l().ordinal()])
        {
        default:
            return false;

        case 1: // '\001'
            return true;
        }
    }

    void c()
    {
        this;
        JVM INSTR monitorenter ;
        a.clear();
        b.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    int d()
    {
        return a() - 1;
    }

    String e()
    {
        this;
        JVM INSTR monitorenter ;
        if (!a.isEmpty())
        {
            break MISSING_BLOCK_LABEL_16;
        }
        this;
        JVM INSTR monitorexit ;
        return null;
        String s1 = ((a)a.get(d())).d;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
