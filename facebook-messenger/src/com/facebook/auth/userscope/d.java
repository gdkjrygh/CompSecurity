// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.userscope;

import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.auth.viewercontext.e;
import com.facebook.debug.log.b;
import com.facebook.inject.aq;
import com.facebook.inject.av;
import com.facebook.inject.n;
import com.facebook.inject.t;
import com.google.common.a.ik;
import java.util.Map;
import javax.inject.a;

// Referenced classes of package com.facebook.auth.userscope:
//            b, UserScoped, a, c

class d
    implements a
{

    final com.facebook.auth.userscope.b a;
    private final com.google.inject.a b;
    private final a c;

    private d(com.facebook.auth.userscope.b b1, com.google.inject.a a1, a a2)
    {
        a = b1;
        super();
        b = a1;
        c = a2;
    }

    d(com.facebook.auth.userscope.b b1, com.google.inject.a a1, a a2, c c1)
    {
        this(b1, a1, a2);
    }

    private Object a(av av1, e e1, Map map)
    {
        Object obj1 = map.get(b);
        if (obj1 != b.access$1000()) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return obj;
_L2:
        obj = obj1;
        if (obj1 != null) goto _L4; else goto _L3
_L3:
        av1.a(com/facebook/auth/userscope/b);
        obj = (e)com.facebook.auth.userscope.b.h(a).get();
        com.facebook.auth.userscope.b.h(a).set(e1);
        com.facebook.auth.userscope.b.a(a).a();
        e1 = ((e) (c.b()));
        com.facebook.auth.userscope.b.a(a).b();
        if (e1 != null)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        map.put(b, b.access$1000());
_L5:
        com.facebook.auth.userscope.b.h(a).set(obj);
        av1.b(com/facebook/auth/userscope/b);
        return e1;
        e1;
        com.facebook.auth.userscope.b.a(a).b();
        throw e1;
        e1;
        com.facebook.auth.userscope.b.h(a).set(obj);
        av1.b(com/facebook/auth/userscope/b);
        throw e1;
        map.put(b, e1);
          goto _L5
    }

    public Object b()
    {
        Object obj;
        av av1;
        Object obj2;
        obj = com.facebook.auth.userscope.b.a(a).getContext();
        if (obj == null)
        {
            throw new aq("Called user scoped provider outside of context scope");
        }
        com.facebook.auth.userscope.b.b(a);
        av1 = av.a();
        av1.a(b.access$300(), com/facebook/auth/userscope/UserScoped);
        obj2 = (e)t.a(((android.content.Context) (obj))).a(com/facebook/auth/viewercontext/e);
        obj = ((e) (obj2)).c();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_308;
        }
        obj = ((e) (obj2)).b();
        Object obj1 = com.facebook.auth.userscope.b.c(a);
        obj1;
        JVM INSTR monitorenter ;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_181;
        }
        Map map;
        com.facebook.debug.log.b.d(b.access$500(), "Called user scoped provider with no viewer. ViewerContextManager was created with no ViewerContext. Using EmptyViewerContextManager to return fake logged in instance.");
        obj2 = com.facebook.auth.userscope.b.d(a).c().a();
        map = (Map)com.facebook.auth.userscope.b.e(a).get(obj2);
        obj = map;
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_162;
        }
        obj = ik.a();
        com.facebook.auth.userscope.b.e(a).put(obj2, obj);
        obj = a(av1, com.facebook.auth.userscope.b.d(a), ((Map) (obj)));
        obj1;
        JVM INSTR monitorexit ;
        return obj;
        obj = ((ViewerContext) (obj)).a();
        if (!com.facebook.auth.userscope.b.f(a).containsKey(obj))
        {
            break MISSING_BLOCK_LABEL_245;
        }
        com.facebook.debug.log.b.c(b.access$500(), "Called user scoped provider with no viewer. Getting or creating instance according to creation time ViewerContext and old instance map.");
        obj = a(av1, ((e) (obj2)), (Map)com.facebook.auth.userscope.b.f(a).get(obj));
        obj1;
        JVM INSTR monitorexit ;
        return obj;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        if (!com.facebook.auth.userscope.b.e(a).containsKey(obj))
        {
            break MISSING_BLOCK_LABEL_298;
        }
        com.facebook.debug.log.b.c(b.access$500(), "Called user scoped provider with no viewer. Getting or creating instance using creation time ViewerContext and current instance map.");
        obj = a(av1, ((e) (obj2)), (Map)com.facebook.auth.userscope.b.e(a).get(obj));
        obj1;
        JVM INSTR monitorexit ;
        return obj;
        throw new aq("Called user scoped provider with no viewer. No instance map (current or old) exists for creation time ViewerContext.");
        String s = ((ViewerContext) (obj)).a();
        obj1 = com.facebook.auth.userscope.b.c(a);
        obj1;
        JVM INSTR monitorenter ;
        map = (Map)com.facebook.auth.userscope.b.e(a).get(s);
        obj = map;
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_377;
        }
        obj = ik.a();
        com.facebook.auth.userscope.b.e(a).put(s, obj);
        com.facebook.auth.userscope.b.g(a);
        obj = a(av1, ((e) (obj2)), ((Map) (obj)));
        obj1;
        JVM INSTR monitorexit ;
        return obj;
        Exception exception;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
