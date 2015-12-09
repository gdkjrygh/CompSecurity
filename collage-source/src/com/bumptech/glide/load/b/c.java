// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b;

import android.content.Context;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.bumptech.glide.load.b:
//            l, m

public class c
{

    private static final l c = new l() {

        public com.bumptech.glide.load.a.c a(Object obj, int i, int j)
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

    private void a(Class class1, Class class2, l l1)
    {
        Map map = (Map)b.get(class1);
        Object obj = map;
        if (map == null)
        {
            obj = new HashMap();
            b.put(class1, obj);
        }
        ((Map) (obj)).put(class2, l1);
    }

    private void b(Class class1, Class class2)
    {
        a(class1, class2, c);
    }

    private l c(Class class1, Class class2)
    {
        class1 = (Map)b.get(class1);
        if (class1 != null)
        {
            return (l)class1.get(class2);
        } else
        {
            return null;
        }
    }

    private m d(Class class1, Class class2)
    {
label0:
        {
            Object obj = (Map)a.get(class1);
            Object obj1;
            if (obj != null)
            {
                obj = (m)((Map) (obj)).get(class2);
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
                    obj1 = (m)((Map) (obj1)).get(class2);
                    obj = obj1;
                } while (obj1 == null);
            }
            return ((m) (obj1));
        }
        return ((m) (obj));
    }

    public l a(Class class1, Class class2)
    {
        this;
        JVM INSTR monitorenter ;
        l l1 = c(class1, class2);
        if (l1 == null) goto _L2; else goto _L1
_L1:
        boolean flag = c.equals(l1);
        class1 = l1;
        if (flag)
        {
            class1 = null;
        }
_L4:
        this;
        JVM INSTR monitorexit ;
        return class1;
_L2:
        m m1 = d(class1, class2);
        if (m1 == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        l1 = m1.a(d, this);
        a(class1, class2, l1);
        class1 = l1;
        continue; /* Loop/switch isn't completed */
        class1;
        throw class1;
        b(class1, class2);
        class1 = l1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public m a(Class class1, Class class2, m m1)
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
        class2 = (m)((Map) (obj)).put(class2, m1);
        class1 = class2;
        if (class2 == null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        m1 = a.values().iterator();
_L2:
        class1 = class2;
        boolean flag;
        if (!m1.hasNext())
        {
            break MISSING_BLOCK_LABEL_126;
        }
        flag = ((Map)m1.next()).containsValue(class2);
        if (!flag) goto _L2; else goto _L1
_L1:
        class1 = null;
        return class1;
        class1;
        throw class1;
    }

}
