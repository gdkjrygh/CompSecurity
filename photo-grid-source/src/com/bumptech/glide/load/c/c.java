// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.c;

import android.content.Context;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.bumptech.glide.load.c:
//            d, s, t

public final class c
{

    private static final s c = new d();
    private final Map a = new HashMap();
    private final Map b = new HashMap();
    private final Context d;

    public c(Context context)
    {
        d = context.getApplicationContext();
    }

    private void a(Class class1, Class class2, s s1)
    {
        Map map = (Map)b.get(class1);
        Object obj = map;
        if (map == null)
        {
            obj = new HashMap();
            b.put(class1, obj);
        }
        ((Map) (obj)).put(class2, s1);
    }

    public final s a(Class class1, Class class2)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = (Map)b.get(class1);
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = (s)((Map) (obj)).get(class2);
_L15:
        if (obj == null) goto _L4; else goto _L3
_L3:
        boolean flag = c.equals(obj);
        if (flag)
        {
            obj = null;
        }
_L16:
        this;
        JVM INSTR monitorexit ;
        return ((s) (obj));
_L4:
        Object obj1 = (Map)a.get(class1);
        if (obj1 == null) goto _L6; else goto _L5
_L5:
        obj1 = (t)((Map) (obj1)).get(class2);
_L14:
        Object obj2 = obj1;
        if (obj1 != null) goto _L8; else goto _L7
_L7:
        Iterator iterator = a.keySet().iterator();
_L12:
        if (!iterator.hasNext()) goto _L10; else goto _L9
_L9:
        obj2 = (Class)iterator.next();
        if (!((Class) (obj2)).isAssignableFrom(class1)) goto _L12; else goto _L11
_L11:
        obj2 = (Map)a.get(obj2);
        if (obj2 == null) goto _L12; else goto _L13
_L13:
        obj1 = (t)((Map) (obj2)).get(class2);
        obj2 = obj1;
        if (obj1 != null) goto _L8; else goto _L12
_L8:
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        obj = ((t) (obj2)).a(d, this);
        a(class1, class2, ((s) (obj)));
        class1 = ((Class) (obj));
        break MISSING_BLOCK_LABEL_263;
        a(class1, class2, c);
        class1 = ((Class) (obj));
        break MISSING_BLOCK_LABEL_263;
        class1;
        throw class1;
_L6:
        obj1 = null;
          goto _L14
_L2:
        obj = null;
          goto _L15
_L10:
        obj2 = obj1;
          goto _L8
        obj = class1;
          goto _L16
    }

    public final t a(Class class1, Class class2, t t1)
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
        class2 = (t)((Map) (obj)).put(class2, t1);
        class1 = class2;
        if (class2 == null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        t1 = a.values().iterator();
_L2:
        class1 = class2;
        boolean flag;
        if (!t1.hasNext())
        {
            break MISSING_BLOCK_LABEL_126;
        }
        flag = ((Map)t1.next()).containsValue(class2);
        if (!flag) goto _L2; else goto _L1
_L1:
        class1 = null;
        return class1;
        class1;
        throw class1;
    }

}
