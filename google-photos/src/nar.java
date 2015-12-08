// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.SparseArray;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.chromium.net.UserAgent;

final class nar
    implements nal, nug
{

    private final SparseArray a = new SparseArray();
    private final String b;
    private final nat c;
    private final boolean d = true;
    private Map e;

    nar(Context context, nat nat1, nam nam1, boolean flag)
    {
        c = nat1;
        nam1.a().a(this, false);
        b = String.valueOf(UserAgent.a(context)).concat(" (gzip)");
    }

    private void b()
    {
        this;
        JVM INSTR monitorenter ;
        a.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final Map a()
    {
        this;
        JVM INSTR monitorenter ;
        if (e == null) goto _L2; else goto _L1
_L1:
        Map map = e;
_L4:
        this;
        JVM INSTR monitorexit ;
        return map;
_L2:
        e = new HashMap(1);
        e.put("User-Agent", b);
        e = Collections.unmodifiableMap(e);
        map = e;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final Map a(int i)
    {
        if (d)
        {
            b.v();
        }
        this;
        JVM INSTR monitorenter ;
        Map map = (Map)a.get(i);
        this;
        JVM INSTR monitorexit ;
        if (map != null)
        {
            return map;
        }
        break MISSING_BLOCK_LABEL_37;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        Object obj;
        obj = new HashMap(3);
        ((Map) (obj)).put("User-Agent", b);
        Map map1 = c.a(i);
        if (map1 != null)
        {
            ((Map) (obj)).putAll(map1);
        }
        obj = Collections.unmodifiableMap(((Map) (obj)));
        if (map1 == null && i != -1)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        this;
        JVM INSTR monitorenter ;
        a.put(i, obj);
        this;
        JVM INSTR monitorexit ;
        return ((Map) (obj));
        map1;
        this;
        JVM INSTR monitorexit ;
        throw map1;
        return ((Map) (obj));
    }

    public final Map b(int i)
    {
        this;
        JVM INSTR monitorenter ;
        Map map = (Map)a.get(i);
        this;
        JVM INSTR monitorexit ;
        return map;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b_(Object obj)
    {
        b();
    }
}
