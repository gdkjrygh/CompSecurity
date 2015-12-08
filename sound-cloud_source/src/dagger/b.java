// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger;

import dagger.a.d;
import dagger.a.h;
import dagger.a.l;
import dagger.a.n;
import dagger.a.r;
import dagger.a.s;
import dagger.a.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class dagger.b
{
    public static final class a extends dagger.b
    {

        private final a a = null;
        private final l b;
        private final n c;
        private final Map d;
        private final Map e;
        private final List f;

        private dagger.a.b a(ClassLoader classloader, String s1, String s2)
        {
            Class class1;
            class1 = null;
            a a1 = this;
            do
            {
                if (a1 == null)
                {
                    break;
                }
                Class class2 = (Class)a1.e.get(s1);
                class1 = class2;
                if (class2 != null)
                {
                    break;
                }
                a1 = a1.a;
                class1 = class2;
            } while (true);
            if (class1 == null)
            {
                throw new IllegalArgumentException((new StringBuilder("No inject registered for ")).append(s1).append(". You must explicitly add it to the 'injects' option in one of your modules.").toString());
            }
            l l1 = b;
            l1;
            JVM INSTR monitorenter ;
            dagger.a.b b1 = b.a(s2, class1, classloader, false);
            if (b1 == null)
            {
                break MISSING_BLOCK_LABEL_123;
            }
            s1 = b1;
            if (b1.isLinked())
            {
                break MISSING_BLOCK_LABEL_143;
            }
            b.a();
            s1 = b.a(s2, class1, classloader, false);
            l1;
            JVM INSTR monitorexit ;
            return s1;
            classloader;
            l1;
            JVM INSTR monitorexit ;
            throw classloader;
        }

        public static transient dagger.b a(n n1, Object aobj[])
        {
            c c1;
            b b1;
            LinkedHashMap linkedhashmap;
            LinkedHashMap linkedhashmap1;
            Iterator iterator;
            linkedhashmap = new LinkedHashMap();
            linkedhashmap1 = new LinkedHashMap();
            c1 = new c();
            b1 = new b();
            iterator = s.a(n1, aobj).entrySet().iterator();
_L2:
            r r1;
            java.util.Map.Entry entry;
            if (!iterator.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            entry = (java.util.Map.Entry)iterator.next();
            r1 = (r)entry.getKey();
            for (int i = 0; i < r1.injectableTypes.length; i++)
            {
                linkedhashmap.put(r1.injectableTypes[i], r1.moduleClass);
            }

            for (int j = 0; j < r1.staticInjections.length; j++)
            {
                linkedhashmap1.put(r1.staticInjections[j], null);
            }

            if (r1.overrides)
            {
                aobj = b1;
            } else
            {
                aobj = c1;
            }
            try
            {
                r1.getBindings(((d) (aobj)), entry.getValue());
            }
            // Misplaced declaration of an exception variable
            catch (n n1)
            {
                throw new IllegalArgumentException((new StringBuilder()).append(r1.moduleClass.getSimpleName()).append(": ").append(n1.getMessage()).toString(), n1);
            }
            if (true) goto _L2; else goto _L1
_L1:
            aobj = new l(n1, new u());
            ((l) (aobj)).a(c1);
            ((l) (aobj)).a(b1);
            return new a(((l) (aobj)), n1, linkedhashmap1, linkedhashmap, c1.a);
        }

        private static Object a(Object obj, String s1)
        {
            if (obj == null)
            {
                throw new NullPointerException(s1);
            } else
            {
                return obj;
            }
        }

        public final Object a(Object obj)
        {
            String s1 = h.a(obj.getClass());
            a(obj.getClass().getClassLoader(), s1, s1).injectMembers(obj);
            return obj;
        }

        private a(l l1, n n1, Map map, Map map1, List list)
        {
            b = (l)a(l1, "linker");
            c = (n)a(n1, "plugin");
            d = (Map)a(map, "staticInjections");
            e = (Map)a(map1, "injectableTypes");
            f = (List)a(list, "setBindings");
        }
    }

    private static final class b extends d
    {

        b()
        {
        }
    }

    private static final class c extends d
    {

        final List a = new ArrayList();

        public c()
        {
        }
    }


    dagger.b()
    {
    }

    public abstract Object a(Object obj);
}
