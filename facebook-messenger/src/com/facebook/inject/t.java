// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;

import android.content.Context;
import com.google.common.a.hy;
import com.google.common.a.ik;
import com.google.inject.a;
import com.google.inject.a.g;
import com.google.inject.f;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.facebook.inject:
//            ab, bi, aa, l, 
//            n, u

public abstract class t
    implements ab
{

    private static ConcurrentMap a = (new hy()).f().h().n();

    public t()
    {
    }

    public static t a(Context context)
    {
        return a(context, com/facebook/inject/bi);
    }

    public static t a(Context context, Class class1)
    {
        Object obj1 = (Map)a.get(context);
        Object obj;
        l l1;
        if (obj1 == null)
        {
            obj1 = ik.c();
            a.put(context, obj1);
            obj = null;
        } else
        {
            obj = (l)((Map) (obj1)).get(class1);
        }
        l1 = ((l) (obj));
        if (obj == null)
        {
            obj = ((aa)context.getApplicationContext()).f();
            if (obj == null)
            {
                throw new IllegalStateException("Can NOT get FbInjector instance! Probably because this method was called in ContentProvider's onCreate.");
            }
            l1 = new l(((t) (obj)).f(class1), (n)((t) (obj)).a(com/facebook/inject/n), context);
            ((Map) (obj1)).put(class1, l1);
        }
        return l1;
    }

    public static t a(Context context, List list)
    {
        return new u(context, list, true);
    }

    protected static a f(Class class1, Class class2)
    {
        class1 = com.google.inject.f.a(new g(null, java/util/Set, new Type[] {
            class1
        }));
        if (class2 != null)
        {
            return com.google.inject.a.a(class1, class2);
        } else
        {
            return com.google.inject.a.a(class1);
        }
    }

}
