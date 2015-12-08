// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class aqh
{

    final aqq a = new aqq();
    final aqu b = new aqu();
    final Map c = new HashMap();
    final Map d = new HashMap();
    final int e;
    int f;

    public aqh(int i)
    {
        new HashMap();
        e = i;
    }

    public Object a(int i, Class class1)
    {
        aqg aqg1 = b(class1);
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = (Integer)a(class1).ceilingKey(Integer.valueOf(i));
        if (!a(i, ((Integer) (obj))))
        {
            break MISSING_BLOCK_LABEL_116;
        }
        obj = b.a(((Integer) (obj)).intValue(), class1);
_L1:
        obj = a.a(((aqy) (obj)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        f = f - aqg1.a(obj) * aqg1.b();
        b(aqg1.a(obj), class1);
        this;
        JVM INSTR monitorexit ;
        if (obj != null)
        {
            aqg1.b(obj);
            return obj;
        }
        break MISSING_BLOCK_LABEL_134;
        obj = b.a(i, class1);
          goto _L1
        class1;
        this;
        JVM INSTR monitorexit ;
        throw class1;
        if (Log.isLoggable(aqg1.a(), 2))
        {
            (new StringBuilder(27)).append("Allocated ").append(i).append(" bytes");
        }
        return aqg1.a(i);
    }

    NavigableMap a(Class class1)
    {
        NavigableMap navigablemap = (NavigableMap)c.get(class1);
        Object obj = navigablemap;
        if (navigablemap == null)
        {
            obj = new TreeMap();
            c.put(class1, obj);
        }
        return ((NavigableMap) (obj));
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        c(0);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (i < 40) goto _L2; else goto _L1
_L1:
        a();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (i < 20)
        {
            continue; /* Loop/switch isn't completed */
        }
        c(e / 2);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void a(Object obj, Class class1)
    {
        this;
        JVM INSTR monitorenter ;
        aqg aqg1;
        int j;
        boolean flag;
        aqg1 = b(class1);
        j = aqg1.a(obj);
        flag = b(j);
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        int k;
        aqt aqt1 = b.a(j, class1);
        a.a(aqt1, obj);
        obj = a(class1);
        class1 = (Integer)((NavigableMap) (obj)).get(Integer.valueOf(aqt1.a));
        k = aqt1.a;
        int i;
        if (class1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        i = 1;
_L4:
        ((NavigableMap) (obj)).put(Integer.valueOf(k), Integer.valueOf(i));
        f = f + aqg1.b() * j;
        c();
        if (true) goto _L1; else goto _L3
        obj;
        throw obj;
_L3:
        i = class1.intValue();
        i++;
          goto _L4
    }

    boolean a(int i, Integer integer)
    {
        return integer != null && (b() || integer.intValue() <= i * 8);
    }

    aqg b(Class class1)
    {
        Object obj;
        aqg aqg1;
        aqg1 = (aqg)d.get(class1);
        obj = aqg1;
        if (aqg1 != null) goto _L2; else goto _L1
_L1:
        if (!class1.equals([I)) goto _L4; else goto _L3
_L3:
        obj = new aqs();
_L6:
        d.put(class1, obj);
_L2:
        return ((aqg) (obj));
_L4:
        if (!class1.equals([B))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = new aqo();
        if (true) goto _L6; else goto _L5
_L5:
        class1 = String.valueOf(class1.getSimpleName());
        if (class1.length() != 0)
        {
            class1 = "No array pool found for: ".concat(class1);
        } else
        {
            class1 = new String("No array pool found for: ");
        }
        throw new IllegalArgumentException(class1);
    }

    void b(int i, Class class1)
    {
        class1 = a(class1);
        Object obj = (Integer)class1.get(Integer.valueOf(i));
        if (obj == null)
        {
            class1 = String.valueOf("Tried to decrement empty size, size: ");
            obj = String.valueOf(this);
            throw new NullPointerException((new StringBuilder(String.valueOf(class1).length() + 19 + String.valueOf(obj).length())).append(class1).append(i).append(", this: ").append(((String) (obj))).toString());
        }
        if (((Integer) (obj)).intValue() == 1)
        {
            class1.remove(Integer.valueOf(i));
            return;
        } else
        {
            class1.put(Integer.valueOf(i), Integer.valueOf(((Integer) (obj)).intValue() - 1));
            return;
        }
    }

    boolean b()
    {
        return f == 0 || e / f >= 2;
    }

    boolean b(int i)
    {
        return i <= e / 2;
    }

    void c()
    {
        c(e);
    }

    void c(int i)
    {
        do
        {
            if (f <= i)
            {
                break;
            }
            Object obj = a.a();
            aqg aqg1 = b(obj.getClass());
            f = f - aqg1.a(obj) * aqg1.b();
            b(aqg1.a(obj), obj.getClass());
            if (Log.isLoggable(aqg1.a(), 2))
            {
                int j = aqg1.a(obj);
                (new StringBuilder(20)).append("evicted: ").append(j);
            }
        } while (true);
    }
}
