// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.x;

import android.content.Context;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package p.x:
//            j, k

public class c
{

    private static final j c = new j() {

        public p.r.c a(Object obj, int i, int l)
        {
            throw new NoSuchMethodError("This should never be called!");
        }

        public String toString()
        {
            return "NULL_MODEL_LOADER";
        }

    };
    private final Map a = new HashMap();
    private final Map b = new HashMap();
    private final Context d;

    public c(Context context)
    {
        d = context.getApplicationContext();
    }

    private void a(Class class1, Class class2, j j1)
    {
        Map map = (Map)b.get(class1);
        Object obj = map;
        if (map == null)
        {
            obj = new HashMap();
            b.put(class1, obj);
        }
        ((Map) (obj)).put(class2, j1);
    }

    private void b(Class class1, Class class2)
    {
        a(class1, class2, c);
    }

    private j c(Class class1, Class class2)
    {
        class1 = (Map)b.get(class1);
        if (class1 != null)
        {
            return (j)class1.get(class2);
        } else
        {
            return null;
        }
    }

    private k d(Class class1, Class class2)
    {
label0:
        {
            Object obj = (Map)a.get(class1);
            Object obj1;
            if (obj != null)
            {
                obj = (k)((Map) (obj)).get(class2);
            } else
            {
                obj = null;
            }
            obj1 = obj;
            if (obj == null)
            {
                Iterator iterator = a.keySet().iterator();
                do
                {
                    do
                    {
                        do
                        {
                            if (!iterator.hasNext())
                            {
                                break label0;
                            }
                            obj1 = (Class)iterator.next();
                        } while (!((Class) (obj1)).isAssignableFrom(class1));
                        obj1 = (Map)a.get(obj1);
                    } while (obj1 == null);
                    obj1 = (k)((Map) (obj1)).get(class2);
                    obj = obj1;
                } while (obj1 == null);
            }
            return ((k) (obj1));
        }
        return ((k) (obj));
    }

    public j a(Class class1, Class class2)
    {
        this;
        JVM INSTR monitorenter ;
        j j1 = c(class1, class2);
        if (j1 == null) goto _L2; else goto _L1
_L1:
        boolean flag = c.equals(j1);
        class1 = j1;
        if (flag)
        {
            class1 = null;
        }
_L4:
        this;
        JVM INSTR monitorexit ;
        return class1;
_L2:
        k k1 = d(class1, class2);
        if (k1 == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        j1 = k1.a(d, this);
        a(class1, class2, j1);
        class1 = j1;
        continue; /* Loop/switch isn't completed */
        class1;
        throw class1;
        b(class1, class2);
        class1 = j1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public k a(Class class1, Class class2, k k1)
    {
        this;
        JVM INSTR monitorenter ;
        Map map;
        b.clear();
        map = (Map)a.get(class1);
        Object obj;
        obj = map;
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        obj = new HashMap();
        a.put(class1, obj);
        class2 = (k)((Map) (obj)).put(class2, k1);
        class1 = class2;
        if (class2 == null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        k1 = a.values().iterator();
_L2:
        class1 = class2;
        boolean flag;
        if (!k1.hasNext())
        {
            break MISSING_BLOCK_LABEL_126;
        }
        flag = ((Map)k1.next()).containsValue(class2);
        if (!flag) goto _L2; else goto _L1
_L1:
        class1 = null;
        return class1;
        class1;
        throw class1;
    }

}
