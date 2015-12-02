// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;

import android.content.Context;
import com.facebook.base.b;
import com.facebook.debug.d.e;
import com.google.common.a.hy;
import com.google.common.base.Preconditions;
import com.google.inject.a;
import com.google.inject.f;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.facebook.inject:
//            a, bd, v, x, 
//            y, z, l, w, 
//            ao, al, aq, t, 
//            bb, ba, ab

public class u extends com.facebook.inject.a
    implements bd
{

    private final Map a;
    private final Map b;
    private final Map c;
    private final Map d = (new hy()).n();
    private final x e = new x(this);
    private final l f;
    private final ba g;
    private final boolean h = com.facebook.base.b.a();
    private boolean i;
    private final ThreadLocal j = new v(this);

    u(Context context, List list, boolean flag)
    {
        e e1 = com.facebook.debug.d.e.a("FbInjectorImpl.init");
        z z1;
        boolean flag1;
        if (context == context.getApplicationContext())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkArgument(flag1);
        list = new y(this, context, list, flag, h);
        z1 = list.a();
        a = z1.a;
        b = z1.e;
        c = z1.d;
        g = z1.b;
        f = new l(this, z1.c, context);
        i = true;
        list.b();
        e1.a();
    }

    static ba a(u u1)
    {
        return u1.g;
    }

    private void c()
    {
        if (!i)
        {
            throw new RuntimeException("Called injector during binding");
        } else
        {
            return;
        }
    }

    private javax.inject.a e(a a1)
    {
        if (a1.c() != null || a1.b() != null)
        {
            return null;
        }
        Object obj = a1.a().b();
        if ((obj instanceof GenericArrayType) || (obj instanceof ParameterizedType) || (obj instanceof WildcardType) || (obj instanceof TypeVariable))
        {
            return null;
        }
        a1 = a1.a().a();
        try
        {
            obj = a1.getConstructor(new Class[0]);
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            return null;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        com.facebook.debug.log.b.c("OrcaInjector", (new StringBuilder()).append("Created just-in-time provider for ").append(a1).toString());
        a1 = new w(this, ((java.lang.reflect.Constructor) (obj)));
        return a1;
        return null;
    }

    public void a()
    {
        List list = (List)j.get();
        list.remove(list.size() - 1);
    }

    public void a(t t1)
    {
        ((List)j.get()).add(t1);
    }

    public x b()
    {
        return e;
    }

    public javax.inject.a b(a a1)
    {
        c();
        if (h)
        {
            com.facebook.inject.al.a(ao.PROVIDER_GET, a1);
        }
        javax.inject.a a3 = (javax.inject.a)c.get(a1);
        javax.inject.a a2;
        a2 = a3;
        if (a3 != null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        a3 = (javax.inject.a)b.get(a1);
        a2 = a3;
        if (a3 != null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        a3 = (javax.inject.a)d.get(a1);
        a2 = a3;
        if (a3 != null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        a3 = e(a1);
        a2 = a3;
        if (a3 == null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        d.put(a1, a3);
        a2 = a3;
        if (a2 != null)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        throw new aq((new StringBuilder()).append("No provider bound for ").append(a1).toString());
        a1;
        if (h)
        {
            com.facebook.inject.al.a();
        }
        throw a1;
        if (h)
        {
            com.facebook.inject.al.a();
        }
        return a2;
    }

    public javax.inject.a c(a a1)
    {
        c();
        List list = (List)j.get();
        if (!list.isEmpty())
        {
            return ((t)list.get(list.size() - 1)).c(a1);
        } else
        {
            return b(a1);
        }
    }

    public Map d()
    {
        return a;
    }

    public boolean d(a a1)
    {
        return c.containsKey(a1) || b.containsKey(a1);
    }

    public ab e()
    {
        return f;
    }

    public ab f(Class class1)
    {
        return g(class1);
    }

    public t g(Class class1)
    {
        Object obj = this;
        if (h)
        {
            obj = new bb(this, class1);
        }
        return ((t) (obj));
    }
}
