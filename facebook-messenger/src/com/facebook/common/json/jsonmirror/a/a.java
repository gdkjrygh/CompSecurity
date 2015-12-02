// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.json.jsonmirror.a;

import com.facebook.common.json.jsonmirror.f;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.facebook.common.json.jsonmirror.a:
//            l, b, i, d, 
//            j

public abstract class a
{

    public static final l a = new l();
    public static final b b = new b();
    public static final i c = new i();
    public static final d d = new d();
    public static final j e = new j();
    protected static Map f = new HashMap();

    public a()
    {
    }

    public static a a(Class class1)
    {
        com/facebook/common/json/jsonmirror/a/a;
        JVM INSTR monitorenter ;
        Object obj = (a)f.get(class1);
        Object obj2 = obj;
        if (obj != null) goto _L2; else goto _L1
_L1:
        if (class1 != java/lang/String) goto _L4; else goto _L3
_L3:
        obj = a;
_L6:
        obj2 = obj;
        if (obj == null) goto _L2; else goto _L5
_L5:
        f.put(class1, obj);
        obj2 = obj;
_L2:
        com/facebook/common/json/jsonmirror/a/a;
        JVM INSTR monitorexit ;
        return ((a) (obj2));
_L4:
        if (class1 == java/lang/Boolean)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        if (class1 != Boolean.TYPE)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        obj = b;
          goto _L6
        if (class1 == java/lang/Long)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        if (class1 == Long.TYPE || class1 == java/lang/Integer)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        if (class1 != Integer.TYPE)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        obj = c;
          goto _L6
        if (class1 == java/lang/Double)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        if (class1 == Double.TYPE || class1 == java/lang/Float)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        if (class1 != Float.TYPE)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        obj = d;
          goto _L6
label0:
        {
            if (!java/util/Map.isAssignableFrom(class1))
            {
                break label0;
            }
            obj = e;
        }
          goto _L6
        boolean flag = com/facebook/common/json/jsonmirror/a/a.isAssignableFrom(class1);
        if (!flag) goto _L6; else goto _L7
_L7:
        obj = (a)class1.newInstance();
          goto _L6
        Object obj1;
        obj1;
        throw new f((new StringBuilder()).append("Error instantiating element parser for class ").append(class1.getName()).toString());
        class1;
        com/facebook/common/json/jsonmirror/a/a;
        JVM INSTR monitorexit ;
        throw class1;
        obj1;
        throw new f((new StringBuilder()).append("Error instantiating element parser for class ").append(class1.getName()).toString());
    }

}
