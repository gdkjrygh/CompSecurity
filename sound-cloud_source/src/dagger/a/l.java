// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

// Referenced classes of package dagger.a:
//            a, b, h, e, 
//            j, n, d, m

public final class l
{
    private static final class a extends dagger.a.b
    {

        final ClassLoader a;
        final String b;
        final boolean c;

        public final void getDependencies(Set set, Set set1)
        {
            throw new UnsupportedOperationException("Deferred bindings must resolve first.");
        }

        public final void injectMembers(Object obj)
        {
            throw new UnsupportedOperationException("Deferred bindings must resolve first.");
        }

        public final String toString()
        {
            return (new StringBuilder("DeferredBinding[deferredKey=")).append(b).append("]").toString();
        }

        private a(String s, ClassLoader classloader, Object obj, boolean flag)
        {
            super(null, null, false, obj);
            b = s;
            a = classloader;
            c = flag;
        }

        a(String s, ClassLoader classloader, Object obj, boolean flag, byte byte0)
        {
            this(s, classloader, obj, flag);
        }
    }

    public static interface b
    {

        public static final b a = new m();

        public abstract void a(List list);

    }

    private static final class c extends dagger.a.b
    {

        private final dagger.a.b a;
        private volatile Object b;

        public final void attach(l l1)
        {
            a.attach(l1);
        }

        public final boolean dependedOn()
        {
            return a.dependedOn();
        }

        public final Object get()
        {
            if (b != l.b()) goto _L2; else goto _L1
_L1:
            this;
            JVM INSTR monitorenter ;
            if (b == l.b())
            {
                b = a.get();
            }
            this;
            JVM INSTR monitorexit ;
_L2:
            return b;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final void getDependencies(Set set, Set set1)
        {
            a.getDependencies(set, set1);
        }

        public final void injectMembers(Object obj)
        {
            a.injectMembers(obj);
        }

        public final boolean isCycleFree()
        {
            return a.isCycleFree();
        }

        public final boolean isLinked()
        {
            return a.isLinked();
        }

        protected final boolean isSingleton()
        {
            return true;
        }

        public final boolean isVisiting()
        {
            return a.isVisiting();
        }

        public final boolean library()
        {
            return a.library();
        }

        public final void setCycleFree(boolean flag)
        {
            a.setCycleFree(flag);
        }

        public final void setDependedOn(boolean flag)
        {
            a.setDependedOn(flag);
        }

        public final void setLibrary(boolean flag)
        {
            a.setLibrary(true);
        }

        protected final void setLinked()
        {
            a.setLinked();
        }

        public final void setVisiting(boolean flag)
        {
            a.setVisiting(flag);
        }

        public final String toString()
        {
            return (new StringBuilder("@Singleton/")).append(a.toString()).toString();
        }

        private c(dagger.a.b b1)
        {
            super(b1.provideKey, b1.membersKey, true, b1.requiredBy);
            b = l.b();
            a = b1;
        }

        c(dagger.a.b b1, byte byte0)
        {
            this(b1);
        }
    }


    private static final Object a = new Object();
    private final l b;
    private final Queue c = new dagger.a.a();
    private boolean d;
    private final List e = new ArrayList();
    private final Map f = new HashMap();
    private volatile Map g;
    private final n h;
    private final b i;

    public l(n n1, b b1)
    {
        d = true;
        g = null;
        if (n1 == null)
        {
            throw new NullPointerException("plugin");
        } else
        {
            b = null;
            h = n1;
            i = b1;
            return;
        }
    }

    private static dagger.a.b a(dagger.a.b b1)
    {
        if (!b1.isSingleton() || (b1 instanceof c))
        {
            return b1;
        } else
        {
            return new c(b1, (byte)0);
        }
    }

    private void a(String s)
    {
        e.add(s);
    }

    private static void a(Map map, Object obj, Object obj1)
    {
        obj1 = map.put(obj, obj1);
        if (obj1 != null)
        {
            map.put(obj, obj1);
        }
    }

    static Object b()
    {
        return a;
    }

    private void c()
    {
        if (!Thread.holdsLock(this))
        {
            throw new AssertionError();
        } else
        {
            return;
        }
    }

    public final dagger.a.b a(String s, Object obj, ClassLoader classloader)
    {
        return a(s, obj, classloader, true);
    }

    public final dagger.a.b a(String s, Object obj, ClassLoader classloader, boolean flag)
    {
        c();
        l l1 = this;
        dagger.a.b b1 = null;
        dagger.a.b b2;
        do
        {
            b2 = b1;
            if (l1 == null)
            {
                break;
            }
            b1 = (dagger.a.b)l1.f.get(s);
            if (b1 != null)
            {
                b2 = b1;
                if (l1 != this)
                {
                    b2 = b1;
                    if (!b1.isLinked())
                    {
                        throw new AssertionError();
                    }
                }
                break;
            }
            l1 = l1.b;
        } while (true);
        if (b2 == null)
        {
            s = new a(s, classloader, obj, flag, (byte)0);
            s.setLibrary(true);
            s.setDependedOn(true);
            c.add(s);
            d = false;
            return null;
        }
        if (!b2.isLinked())
        {
            c.add(b2);
        }
        b2.setLibrary(true);
        b2.setDependedOn(true);
        return b2;
    }

    public final void a()
    {
        c();
_L6:
        Object obj1;
        dagger.a.b b1;
        String s;
        boolean flag;
        b1 = (dagger.a.b)c.poll();
        if (b1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!(b1 instanceof a))
        {
            break MISSING_BLOCK_LABEL_507;
        }
        obj1 = (a)b1;
        s = ((a) (obj1)).b;
        flag = ((a) (obj1)).c;
        if (f.containsKey(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        Object obj;
        String s1;
        obj = b1.requiredBy;
        obj1 = ((a) (obj1)).a;
        s1 = dagger.a.h.a(s);
        if (s1 == null) goto _L2; else goto _L1
_L1:
        obj = new e(s, obj, ((ClassLoader) (obj1)), s1);
_L3:
        ((dagger.a.b) (obj)).setLibrary(b1.library());
        ((dagger.a.b) (obj)).setDependedOn(b1.dependedOn());
        if (!s.equals(((dagger.a.b) (obj)).provideKey) && !s.equals(((dagger.a.b) (obj)).membersKey))
        {
            throw new IllegalStateException((new StringBuilder("Unable to create binding for ")).append(s).toString());
        }
        break MISSING_BLOCK_LABEL_440;
_L2:
        s1 = dagger.a.h.b(s);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_307;
        }
        obj = new j(s, obj, ((ClassLoader) (obj1)), s1);
          goto _L3
        s1 = dagger.a.h.d(s);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_327;
        }
        if (!dagger.a.h.c(s))
        {
            break MISSING_BLOCK_LABEL_389;
        }
        throw new IllegalArgumentException(s);
        obj1 = h.a(s, s1, ((ClassLoader) (obj1)), flag);
        obj = obj1;
        if (obj1 != null) goto _L3; else goto _L4
_L4:
        try
        {
            throw new b.a(s1, (new StringBuilder("could not be bound with key ")).append(s).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a((new StringBuilder()).append(((b.a) (obj)).a).append(" ").append(((b.a) (obj)).getMessage()).append(" required by ").append(b1.requiredBy).toString());
            f.put(s, dagger.a.b.UNRESOLVED);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a((new StringBuilder("Unsupported: ")).append(((UnsupportedOperationException) (obj)).getMessage()).append(" required by ").append(b1.requiredBy).toString());
            f.put(s, dagger.a.b.UNRESOLVED);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a((new StringBuilder()).append(((IllegalArgumentException) (obj)).getMessage()).append(" required by ").append(b1.requiredBy).toString());
            f.put(s, dagger.a.b.UNRESOLVED);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        catch (Exception exception)
        {
            throw new RuntimeException(exception);
        }
        continue; /* Loop/switch isn't completed */
        obj = a(((dagger.a.b) (obj)));
        c.add(obj);
        if (((dagger.a.b) (obj)).provideKey != null)
        {
            a(f, ((dagger.a.b) (obj)).provideKey, obj);
        }
        if (((dagger.a.b) (obj)).membersKey != null)
        {
            a(f, ((dagger.a.b) (obj)).membersKey, obj);
        }
        continue; /* Loop/switch isn't completed */
        d = true;
        b1.attach(this);
        if (d)
        {
            b1.setLinked();
        } else
        {
            c.add(b1);
        }
        if (true) goto _L6; else goto _L5
_L5:
        i.a(e);
        e.clear();
        return;
        Exception exception1;
        exception1;
        e.clear();
        throw exception1;
    }

    public final void a(d d1)
    {
        if (g != null)
        {
            throw new IllegalStateException("Cannot install further bindings after calling linkAll().");
        }
        java.util.Map.Entry entry;
        for (d1 = d1.b.entrySet().iterator(); d1.hasNext(); f.put(entry.getKey(), a((dagger.a.b)entry.getValue())))
        {
            entry = (java.util.Map.Entry)d1.next();
        }

    }

}
