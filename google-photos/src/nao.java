// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class nao
    implements nug
{

    private static List d = Collections.unmodifiableList(Arrays.asList(new String[] {
        "Authorization", "X-Auth-Time", "User-Agent"
    }));
    private final nal a;
    private final boolean b = true;
    private final SparseArray c = new SparseArray();

    nao(nal nal1, nam nam1, boolean flag)
    {
        a = nal1;
        nam1.a().a(this, false);
    }

    private void a()
    {
        this;
        JVM INSTR monitorenter ;
        c.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final atb a(int i)
    {
        if (b)
        {
            b.v();
        }
        this;
        JVM INSTR monitorenter ;
        Object obj = (atb)c.get(i);
        this;
        JVM INSTR monitorexit ;
        if (obj != null)
        {
            return ((atb) (obj));
        }
        break MISSING_BLOCK_LABEL_37;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        Object obj1;
        Iterator iterator;
        exception = a.a(i);
        obj1 = new ate();
        iterator = exception.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj2 = (java.util.Map.Entry)iterator.next();
            String s = (String)((java.util.Map.Entry) (obj2)).getKey();
            obj2 = new atf((String)((java.util.Map.Entry) (obj2)).getValue());
            if (((ate) (obj1)).a && "Accept-Encoding".equalsIgnoreCase(s) || ((ate) (obj1)).c && "User-Agent".equalsIgnoreCase(s))
            {
                ((ate) (obj1)).a();
                if (obj2 == null)
                {
                    ((ate) (obj1)).b.remove(s);
                } else
                {
                    List list = ((ate) (obj1)).a(s);
                    list.clear();
                    list.add(obj2);
                }
                if (((ate) (obj1)).a && "Accept-Encoding".equalsIgnoreCase(s))
                {
                    obj1.a = false;
                }
                if (((ate) (obj1)).c && "User-Agent".equalsIgnoreCase(s))
                {
                    obj1.c = false;
                }
            } else
            {
                ((ate) (obj1)).a();
                ((ate) (obj1)).a(s).add(obj2);
            }
        } while (true);
        obj1 = ((ate) (obj1)).b();
        iterator = d.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        if (exception.containsKey((String)iterator.next())) goto _L4; else goto _L3
_L3:
        boolean flag = false;
_L6:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        this;
        JVM INSTR monitorenter ;
        c.put(i, obj1);
        this;
        JVM INSTR monitorexit ;
        break; /* Loop/switch isn't completed */
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        flag = true;
        if (true) goto _L6; else goto _L5
_L5:
        return ((atb) (obj1));
    }

    public final void b_(Object obj)
    {
        a();
    }

}
