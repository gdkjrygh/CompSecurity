// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.n.a;
import com.google.android.m4b.maps.y.e;
import com.google.android.m4b.maps.y.h;
import com.google.android.m4b.maps.y.j;
import com.google.android.m4b.maps.y.s;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            av, bs, at, ay, 
//            w, e

class aw extends AbstractMap
    implements Serializable, ConcurrentMap
{
    static class a
        implements s
    {

        public final aa a()
        {
            throw new UnsupportedOperationException();
        }

        public void a(long l1)
        {
            throw new UnsupportedOperationException();
        }

        public final void a(aa aa1)
        {
            throw new UnsupportedOperationException();
        }

        public void a(s s1)
        {
            throw new UnsupportedOperationException();
        }

        public final s b()
        {
            throw new UnsupportedOperationException();
        }

        public void b(s s1)
        {
            throw new UnsupportedOperationException();
        }

        public final int c()
        {
            throw new UnsupportedOperationException();
        }

        public void c(s s1)
        {
            throw new UnsupportedOperationException();
        }

        public final Object d()
        {
            throw new UnsupportedOperationException();
        }

        public void d(s s1)
        {
            throw new UnsupportedOperationException();
        }

        public long e()
        {
            throw new UnsupportedOperationException();
        }

        public s f()
        {
            throw new UnsupportedOperationException();
        }

        public s g()
        {
            throw new UnsupportedOperationException();
        }

        public s h()
        {
            throw new UnsupportedOperationException();
        }

        public s i()
        {
            throw new UnsupportedOperationException();
        }

        a()
        {
        }
    }

    static interface aa
    {

        public abstract aa a(ReferenceQueue referencequeue, Object obj, s s1);

        public abstract s a();

        public abstract void b();

        public abstract Object get();
    }

    final class ab extends AbstractCollection
    {

        private aw a;

        public final void clear()
        {
            a.clear();
        }

        public final boolean contains(Object obj)
        {
            return a.containsValue(obj);
        }

        public final boolean isEmpty()
        {
            return a.isEmpty();
        }

        public final Iterator iterator()
        {
            return a. new z();
        }

        public final int size()
        {
            return a.size();
        }

        ab()
        {
            a = aw.this;
            super();
        }
    }

    static class ac extends WeakReference
        implements s
    {

        private int a;
        private s b;
        private volatile aa c;

        public final aa a()
        {
            return c;
        }

        public void a(long l1)
        {
            throw new UnsupportedOperationException();
        }

        public final void a(aa aa1)
        {
            aa aa2 = c;
            c = aa1;
            aa2.b();
        }

        public void a(s s1)
        {
            throw new UnsupportedOperationException();
        }

        public final s b()
        {
            return b;
        }

        public void b(s s1)
        {
            throw new UnsupportedOperationException();
        }

        public final int c()
        {
            return a;
        }

        public void c(s s1)
        {
            throw new UnsupportedOperationException();
        }

        public final Object d()
        {
            return get();
        }

        public void d(s s1)
        {
            throw new UnsupportedOperationException();
        }

        public long e()
        {
            throw new UnsupportedOperationException();
        }

        public s f()
        {
            throw new UnsupportedOperationException();
        }

        public s g()
        {
            throw new UnsupportedOperationException();
        }

        public s h()
        {
            throw new UnsupportedOperationException();
        }

        public s i()
        {
            throw new UnsupportedOperationException();
        }

        ac(ReferenceQueue referencequeue, Object obj, int i1, s s1)
        {
            super(obj, referencequeue);
            c = aw.f();
            a = i1;
            b = s1;
        }
    }

    static final class ad extends ac
        implements s
    {

        private s a;
        private s b;

        public final void c(s s1)
        {
            a = s1;
        }

        public final void d(s s1)
        {
            b = s1;
        }

        public final s h()
        {
            return a;
        }

        public final s i()
        {
            return b;
        }

        ad(ReferenceQueue referencequeue, Object obj, int i1, s s1)
        {
            super(referencequeue, obj, i1, s1);
            a = aw.g();
            b = aw.g();
        }
    }

    static class b extends bs
        implements Serializable
    {

        private static final long serialVersionUID = 3L;
        final p a;
        final p b;
        final com.google.android.m4b.maps.y.e c;
        final long d;
        final long e;
        final int f;
        final int g;
        final av.c h;
        transient ConcurrentMap i;
        private com.google.android.m4b.maps.y.e j;

        protected final ConcurrentMap a()
        {
            return i;
        }

        protected final Map b()
        {
            return i;
        }

        protected final Object c()
        {
            return i;
        }

        b(p p1, p p2, com.google.android.m4b.maps.y.e e1, com.google.android.m4b.maps.y.e e2, long l1, long l2, int i1, int j1, av.c c1, ConcurrentMap concurrentmap)
        {
            a = p1;
            b = p2;
            c = e1;
            j = e2;
            d = l1;
            e = l2;
            f = i1;
            g = j1;
            h = c1;
            i = concurrentmap;
        }
    }

    static abstract class c extends Enum
    {

        private static c a;
        private static c b;
        private static c c;
        private static c d;
        private static c e;
        private static c f;
        private static c g;
        private static c h;
        private static c i[][];
        private static final c j[];

        static c a(p p1, boolean flag, boolean flag1)
        {
            byte byte0 = 0;
            boolean flag2;
            if (flag)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (flag1)
            {
                byte0 = 2;
            }
            return i[p1.ordinal()][byte0 | flag2];
        }

        static void a(s s1, s s2)
        {
            s2.a(s1.e());
            com.google.android.m4b.maps.aa.aw.a(s1.g(), s2);
            com.google.android.m4b.maps.aa.aw.a(s2, s1.f());
            aw.b(s1);
        }

        static void b(s s1, s s2)
        {
            aw.b(s1.i(), s2);
            aw.b(s2, s1.h());
            aw.c(s1);
        }

        public static c valueOf(String s1)
        {
            return (c)Enum.valueOf(com/google/android/m4b/maps/aa/aw$c, s1);
        }

        public static c[] values()
        {
            return (c[])j.clone();
        }

        s a(m m1, s s1, s s2)
        {
            return a(m1, s1.d(), s1.c(), s2);
        }

        abstract s a(m m1, Object obj, int i1, s s1);

        static 
        {
            a = new c("STRONG") {

                final s a(m m1, Object obj, int i1, s s1)
                {
                    return new u(obj, i1, s1);
                }

            };
            b = new c("STRONG_EXPIRABLE") {

                final s a(m m1, s s1, s s2)
                {
                    m1 = super.a(m1, s1, s2);
                    a(s1, ((s) (m1)));
                    return m1;
                }

                final s a(m m1, Object obj, int i1, s s1)
                {
                    return new w(obj, i1, s1);
                }

            };
            c = new c("STRONG_EVICTABLE") {

                final s a(m m1, s s1, s s2)
                {
                    m1 = super.a(m1, s1, s2);
                    b(s1, m1);
                    return m1;
                }

                final s a(m m1, Object obj, int i1, s s1)
                {
                    return new v(obj, i1, s1);
                }

            };
            d = new c("STRONG_EXPIRABLE_EVICTABLE") {

                final s a(m m1, s s1, s s2)
                {
                    m1 = super.a(m1, s1, s2);
                    a(s1, ((s) (m1)));
                    b(s1, m1);
                    return m1;
                }

                final s a(m m1, Object obj, int i1, s s1)
                {
                    return new x(obj, i1, s1);
                }

            };
            e = new c("WEAK") {

                final s a(m m1, Object obj, int i1, s s1)
                {
                    return new ac(m1.e, obj, i1, s1);
                }

            };
            f = new c("WEAK_EXPIRABLE") {

                final s a(m m1, s s1, s s2)
                {
                    m1 = super.a(m1, s1, s2);
                    a(s1, ((s) (m1)));
                    return m1;
                }

                final s a(m m1, Object obj, int i1, s s1)
                {
                    return new d(m1.e, obj, i1, s1);
                }

            };
            g = new c("WEAK_EVICTABLE") {

                final s a(m m1, s s1, s s2)
                {
                    m1 = super.a(m1, s1, s2);
                    b(s1, m1);
                    return m1;
                }

                final s a(m m1, Object obj, int i1, s s1)
                {
                    return new ad(m1.e, obj, i1, s1);
                }

            };
            h = new c("WEAK_EXPIRABLE_EVICTABLE") {

                final s a(m m1, s s1, s s2)
                {
                    m1 = super.a(m1, s1, s2);
                    a(s1, ((s) (m1)));
                    b(s1, m1);
                    return m1;
                }

                final s a(m m1, Object obj, int i1, s s1)
                {
                    return new e(m1.e, obj, i1, s1);
                }

            };
            j = (new c[] {
                a, b, c, d, e, f, g, h
            });
            c c1 = a;
            c c2 = b;
            c c3 = c;
            c c4 = d;
            c ac1[] = new c[0];
            c c5 = e;
            c c6 = f;
            c c7 = g;
            c c8 = h;
            i = (new c[][] {
                new c[] {
                    c1, c2, c3, c4
                }, ac1, new c[] {
                    c5, c6, c7, c8
                }
            });
        }

        private c(String s1, int i1)
        {
            super(s1, i1);
        }

        c(String s1, int i1, byte byte0)
        {
            this(s1, i1);
        }
    }

    static final class d extends ac
        implements s
    {

        private volatile long a;
        private s b;
        private s c;

        public final void a(long l1)
        {
            a = l1;
        }

        public final void a(s s1)
        {
            b = s1;
        }

        public final void b(s s1)
        {
            c = s1;
        }

        public final long e()
        {
            return a;
        }

        public final s f()
        {
            return b;
        }

        public final s g()
        {
            return c;
        }

        d(ReferenceQueue referencequeue, Object obj, int i1, s s1)
        {
            super(referencequeue, obj, i1, s1);
            a = 0x7fffffffffffffffL;
            b = aw.g();
            c = aw.g();
        }
    }

    static final class e extends ac
        implements s
    {

        private volatile long a;
        private s b;
        private s c;
        private s d;
        private s e;

        public final void a(long l1)
        {
            a = l1;
        }

        public final void a(s s1)
        {
            b = s1;
        }

        public final void b(s s1)
        {
            c = s1;
        }

        public final void c(s s1)
        {
            d = s1;
        }

        public final void d(s s1)
        {
            e = s1;
        }

        public final long e()
        {
            return a;
        }

        public final s f()
        {
            return b;
        }

        public final s g()
        {
            return c;
        }

        public final s h()
        {
            return d;
        }

        public final s i()
        {
            return e;
        }

        e(ReferenceQueue referencequeue, Object obj, int i1, s s1)
        {
            super(referencequeue, obj, i1, s1);
            a = 0x7fffffffffffffffL;
            b = aw.g();
            c = aw.g();
            d = aw.g();
            e = aw.g();
        }
    }

    static final class f extends WeakReference
        implements aa
    {

        private s a;

        public final aa a(ReferenceQueue referencequeue, Object obj, s s1)
        {
            return new f(referencequeue, obj, s1);
        }

        public final s a()
        {
            return a;
        }

        public final void b()
        {
            clear();
        }

        f(ReferenceQueue referencequeue, Object obj, s s1)
        {
            super(obj, referencequeue);
            a = s1;
        }
    }

    final class g extends at
    {

        private Object a;
        private Object b;
        private aw c;

        public final boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                flag = flag1;
                if (a.equals(((java.util.Map.Entry) (obj)).getKey()))
                {
                    flag = flag1;
                    if (b.equals(((java.util.Map.Entry) (obj)).getValue()))
                    {
                        flag = true;
                    }
                }
            }
            return flag;
        }

        public final Object getKey()
        {
            return a;
        }

        public final Object getValue()
        {
            return b;
        }

        public final int hashCode()
        {
            return a.hashCode() ^ b.hashCode();
        }

        public final Object setValue(Object obj)
        {
            Object obj1 = c.put(a, obj);
            b = obj;
            return obj1;
        }

        g(Object obj, Object obj1)
        {
            c = aw.this;
            super();
            a = obj;
            b = obj1;
        }
    }

    final class h extends o
    {

        private aw a;

        public final Object next()
        {
            return a();
        }

        h()
        {
            a = aw.this;
            super();
        }
    }

    final class i extends AbstractSet
    {

        private aw a;

        public final void clear()
        {
            a.clear();
        }

        public final boolean contains(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                Object obj1 = ((java.util.Map.Entry) (obj)).getKey();
                if (obj1 != null)
                {
                    obj1 = a.get(obj1);
                    if (obj1 != null && a.c.a(((java.util.Map.Entry) (obj)).getValue(), obj1))
                    {
                        return true;
                    }
                }
            }
            return false;
        }

        public final boolean isEmpty()
        {
            return a.isEmpty();
        }

        public final Iterator iterator()
        {
            return a. new h();
        }

        public final boolean remove(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                Object obj1 = ((java.util.Map.Entry) (obj)).getKey();
                if (obj1 != null && a.remove(obj1, ((java.util.Map.Entry) (obj)).getValue()))
                {
                    return true;
                }
            }
            return false;
        }

        public final int size()
        {
            return a.size();
        }

        i()
        {
            a = aw.this;
            super();
        }
    }

    static final class j extends AbstractQueue
    {

        final s a = new _cls1(this);

        private s a()
        {
            s s2 = a.h();
            s s1 = s2;
            if (s2 == a)
            {
                s1 = null;
            }
            return s1;
        }

        public final void clear()
        {
            s s2;
            for (s s1 = a.h(); s1 != a; s1 = s2)
            {
                s2 = s1.h();
                aw.c(s1);
            }

            a.c(a);
            a.d(a);
        }

        public final boolean contains(Object obj)
        {
            return ((s)obj).h() != com.google.android.m4b.maps.aa.k.a;
        }

        public final boolean isEmpty()
        {
            return a.h() == a;
        }

        public final Iterator iterator()
        {
            return new ay(this, a()) {

                private j a;

                protected final Object a(Object obj)
                {
                    s s1 = ((s)obj).h();
                    obj = s1;
                    if (s1 == a.a)
                    {
                        obj = null;
                    }
                    return obj;
                }

            
            {
                a = j1;
                super(s1);
            }
            };
        }

        public final boolean offer(Object obj)
        {
            obj = (s)obj;
            aw.b(((s) (obj)).i(), ((s) (obj)).h());
            aw.b(a.i(), ((s) (obj)));
            aw.b(((s) (obj)), a);
            return true;
        }

        public final Object peek()
        {
            return a();
        }

        public final Object poll()
        {
            s s1 = a.h();
            if (s1 == a)
            {
                return null;
            } else
            {
                remove(s1);
                return s1;
            }
        }

        public final boolean remove(Object obj)
        {
            obj = (s)obj;
            s s1 = ((s) (obj)).i();
            s s2 = ((s) (obj)).h();
            aw.b(s1, s2);
            aw.c(((s) (obj)));
            return s2 != com.google.android.m4b.maps.aa.k.a;
        }

        public final int size()
        {
            int i1 = 0;
            for (s s1 = a.h(); s1 != a; s1 = s1.h())
            {
                i1++;
            }

            return i1;
        }

        j()
        {
        }
    }

    static final class k extends Enum
        implements s
    {

        public static final k a;
        private static final k b[];

        public static k valueOf(String s1)
        {
            return (k)Enum.valueOf(com/google/android/m4b/maps/aa/aw$k, s1);
        }

        public static k[] values()
        {
            return (k[])b.clone();
        }

        public final aa a()
        {
            return null;
        }

        public final void a(long l1)
        {
        }

        public final void a(aa aa1)
        {
        }

        public final void a(s s1)
        {
        }

        public final s b()
        {
            return null;
        }

        public final void b(s s1)
        {
        }

        public final int c()
        {
            return 0;
        }

        public final void c(s s1)
        {
        }

        public final Object d()
        {
            return null;
        }

        public final void d(s s1)
        {
        }

        public final long e()
        {
            return 0L;
        }

        public final s f()
        {
            return this;
        }

        public final s g()
        {
            return this;
        }

        public final s h()
        {
            return this;
        }

        public final s i()
        {
            return this;
        }

        static 
        {
            a = new k("INSTANCE");
            b = (new k[] {
                a
            });
        }

        private k(String s1)
        {
            super(s1, 0);
        }
    }

    static final class l extends AbstractQueue
    {

        final s a = new _cls1(this);

        private s a()
        {
            s s2 = a.f();
            s s1 = s2;
            if (s2 == a)
            {
                s1 = null;
            }
            return s1;
        }

        public final void clear()
        {
            s s2;
            for (s s1 = a.f(); s1 != a; s1 = s2)
            {
                s2 = s1.f();
                aw.b(s1);
            }

            a.a(a);
            a.b(a);
        }

        public final boolean contains(Object obj)
        {
            return ((s)obj).f() != com.google.android.m4b.maps.aa.k.a;
        }

        public final boolean isEmpty()
        {
            return a.f() == a;
        }

        public final Iterator iterator()
        {
            return new ay(this, a()) {

                private l a;

                protected final Object a(Object obj)
                {
                    s s1 = ((s)obj).f();
                    obj = s1;
                    if (s1 == a.a)
                    {
                        obj = null;
                    }
                    return obj;
                }

            
            {
                a = l1;
                super(s1);
            }
            };
        }

        public final boolean offer(Object obj)
        {
            obj = (s)obj;
            com.google.android.m4b.maps.aa.aw.a(((s) (obj)).g(), ((s) (obj)).f());
            com.google.android.m4b.maps.aa.aw.a(a.g(), ((s) (obj)));
            com.google.android.m4b.maps.aa.aw.a(((s) (obj)), a);
            return true;
        }

        public final Object peek()
        {
            return a();
        }

        public final Object poll()
        {
            s s1 = a.f();
            if (s1 == a)
            {
                return null;
            } else
            {
                remove(s1);
                return s1;
            }
        }

        public final boolean remove(Object obj)
        {
            obj = (s)obj;
            s s1 = ((s) (obj)).g();
            s s2 = ((s) (obj)).f();
            com.google.android.m4b.maps.aa.aw.a(s1, s2);
            aw.b(((s) (obj)));
            return s2 != com.google.android.m4b.maps.aa.k.a;
        }

        public final int size()
        {
            int i1 = 0;
            for (s s1 = a.f(); s1 != a; s1 = s1.f())
            {
                i1++;
            }

            return i1;
        }

        l()
        {
        }
    }

    static final class m extends ReentrantLock
    {

        final aw a;
        volatile int b;
        int c;
        volatile AtomicReferenceArray d;
        final ReferenceQueue e;
        final ReferenceQueue f;
        final AtomicInteger g = new AtomicInteger();
        final Queue h;
        final Queue i;
        private int j;
        private int k;
        private Queue l;

        private s a(s s1, s s2)
        {
            if (s1.d() != null)
            {
                aa aa1 = s1.a();
                Object obj = aa1.get();
                if (obj != null)
                {
                    s1 = a.h.a(this, s1, s2);
                    s1.a(aa1.a(f, obj, s1));
                    return s1;
                }
            }
            return null;
        }

        private static AtomicReferenceArray a(int i1)
        {
            return new AtomicReferenceArray(i1);
        }

        private void a(s s1)
        {
            h.add(s1);
            if (a.c())
            {
                a(s1, a.e);
                i.add(s1);
            }
        }

        private void a(s s1, long l1)
        {
            s1.a(a.i.a() + l1);
        }

        private void a(s s1, Object obj)
        {
            s1.a(a.d.a(this, s1, obj));
            f();
            h.add(s1);
            if (a.b())
            {
                long l1;
                if (a.c())
                {
                    l1 = a.e;
                } else
                {
                    l1 = a.f;
                }
                a(s1, l1);
                i.add(s1);
            }
        }

        private void a(Object obj, Object obj1, av.b b1)
        {
            if (a.g != com.google.android.m4b.maps.aa.aw.j)
            {
                obj = new av.d(obj, obj1, b1);
                a.g.offer(obj);
            }
        }

        private static boolean a(aa aa1)
        {
            return aa1.get() == null;
        }

        private boolean a(s s1, int i1)
        {
            lock();
            s s3;
            AtomicReferenceArray atomicreferencearray;
            int j1 = b;
            atomicreferencearray = d;
            i1 &= atomicreferencearray.length() - 1;
            s3 = (s)atomicreferencearray.get(i1);
            s s2 = s3;
_L2:
            if (s2 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            if (s2 != s1)
            {
                break MISSING_BLOCK_LABEL_122;
            }
            c = c + 1;
            a(s2.d(), s2.a().get(), av.b.c);
            s1 = b(s3, s2);
            int k1 = b;
            atomicreferencearray.set(i1, s1);
            b = k1 - 1;
            unlock();
            d();
            return true;
            s2 = s2.b();
            if (true) goto _L2; else goto _L1
_L1:
            unlock();
            d();
            return false;
            s1;
            unlock();
            d();
            throw s1;
        }

        private boolean a(s s1, int i1, av.b b1)
        {
            int j1 = b;
            AtomicReferenceArray atomicreferencearray = d;
            i1 &= atomicreferencearray.length() - 1;
            s s3 = (s)atomicreferencearray.get(i1);
            for (s s2 = s3; s2 != null; s2 = s2.b())
            {
                if (s2 == s1)
                {
                    c = c + 1;
                    a(s2.d(), s2.a().get(), b1);
                    s1 = b(s3, s2);
                    int k1 = b;
                    atomicreferencearray.set(i1, s1);
                    b = k1 - 1;
                    return true;
                }
            }

            return false;
        }

        private boolean a(Object obj, int i1, aa aa1)
        {
            lock();
            s s2;
            AtomicReferenceArray atomicreferencearray;
            int j1;
            j1 = b;
            atomicreferencearray = d;
            j1 = i1 & atomicreferencearray.length() - 1;
            s2 = (s)atomicreferencearray.get(j1);
            s s1 = s2;
_L2:
            if (s1 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj1 = s1.d();
            if (s1.c() != i1 || obj1 == null)
            {
                break MISSING_BLOCK_LABEL_187;
            }
            if (!a.b.a(obj, obj1))
            {
                break MISSING_BLOCK_LABEL_187;
            }
            if (s1.a() != aa1)
            {
                break MISSING_BLOCK_LABEL_170;
            }
            c = c + 1;
            a(obj, aa1.get(), av.b.c);
            obj = b(s2, s1);
            i1 = b;
            atomicreferencearray.set(j1, obj);
            b = i1 - 1;
            unlock();
            if (!isHeldByCurrentThread())
            {
                d();
            }
            return true;
            unlock();
            if (!isHeldByCurrentThread())
            {
                d();
            }
            return false;
            s1 = s1.b();
            if (true) goto _L2; else goto _L1
_L1:
            unlock();
            if (!isHeldByCurrentThread())
            {
                d();
            }
            return false;
            obj;
            unlock();
            if (!isHeldByCurrentThread())
            {
                d();
            }
            throw obj;
        }

        private s b(s s1, s s2)
        {
            h.remove(s2);
            i.remove(s2);
            int i1 = b;
            s s4 = s2.b();
            s s3 = s1;
            s1 = s4;
            while (s3 != s2) 
            {
                s s5 = a(s3, s1);
                if (s5 != null)
                {
                    s1 = s5;
                } else
                {
                    b(s3);
                    i1--;
                }
                s3 = s3.b();
            }
            b = i1;
            return s1;
        }

        private void b(s s1)
        {
            a(s1, av.b.c);
            h.remove(s1);
            i.remove(s1);
        }

        private s d(Object obj, int i1)
        {
            Object obj1;
            if (b == 0)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            obj1 = d;
            obj1 = (s)((AtomicReferenceArray) (obj1)).get(((AtomicReferenceArray) (obj1)).length() - 1 & i1);
_L2:
            Object obj2;
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            if (((s) (obj1)).c() == i1)
            {
                obj2 = ((s) (obj1)).d();
                if (obj2 != null)
                {
                    break; /* Loop/switch isn't completed */
                }
                a();
            }
_L4:
            obj1 = ((s) (obj1)).b();
            if (true) goto _L2; else goto _L1
_L1:
            if (!a.b.a(obj, obj2)) goto _L4; else goto _L3
_L3:
            return ((s) (obj1));
            return null;
        }

        private s e(Object obj, int i1)
        {
            obj = d(obj, i1);
            if (obj == null)
            {
                return null;
            }
            if (a.b() && a.a(((s) (obj))))
            {
                b();
                return null;
            } else
            {
                return ((s) (obj));
            }
        }

        private void e()
        {
            int k1 = 0;
            if (a.d())
            {
                int i1 = 0;
                do
                {
                    Object obj = e.poll();
                    if (obj == null)
                    {
                        break;
                    }
                    obj = (s)obj;
                    aw aw1 = a;
                    int l1 = ((s) (obj)).c();
                    aw1.a(l1).a(((s) (obj)), l1);
                    i1++;
                } while (i1 != 16);
            }
            if (a.e())
            {
                int j1 = k1;
                do
                {
                    Object obj1 = f.poll();
                    if (obj1 == null)
                    {
                        break;
                    }
                    obj1 = (aa)obj1;
                    aw aw2 = a;
                    s s1 = ((aa) (obj1)).a();
                    k1 = s1.c();
                    aw2.a(k1).a(s1.d(), k1, ((aa) (obj1)));
                    k1 = j1 + 1;
                    j1 = k1;
                } while (k1 != 16);
            }
        }

        private void f()
        {
            do
            {
                s s1 = (s)l.poll();
                if (s1 == null)
                {
                    break;
                }
                if (h.contains(s1))
                {
                    h.add(s1);
                }
                if (a.c() && i.contains(s1))
                {
                    i.add(s1);
                }
            } while (true);
        }

        private void g()
        {
            f();
            if (!i.isEmpty()) goto _L2; else goto _L1
_L1:
            return;
_L2:
            long l1 = a.i.a();
            do
            {
                s s1 = (s)i.peek();
                if (s1 == null || !com.google.android.m4b.maps.aa.aw.a(s1, l1))
                {
                    continue; /* Loop/switch isn't completed */
                }
                if (!a(s1, s1.c(), av.b.d))
                {
                    throw new AssertionError();
                }
            } while (true);
            if (true) goto _L1; else goto _L3
_L3:
        }

        private void h()
        {
            if (!tryLock())
            {
                break MISSING_BLOCK_LABEL_27;
            }
            e();
            g();
            g.set(0);
            unlock();
            return;
            Exception exception;
            exception;
            unlock();
            throw exception;
        }

        final Object a(Object obj, int i1)
        {
            obj = e(obj, i1);
            if (obj == null)
            {
                c();
                return null;
            }
            Object obj1 = ((s) (obj)).a().get();
            if (obj1 == null) goto _L2; else goto _L1
_L1:
            if (a.c())
            {
                a(((s) (obj)), a.e);
            }
            l.add(obj);
_L4:
            c();
            return obj1;
_L2:
            a();
            if (true) goto _L4; else goto _L3
_L3:
            obj;
            c();
            throw obj;
        }

        final Object a(Object obj, int i1, Object obj1)
        {
            lock();
            s s2;
            AtomicReferenceArray atomicreferencearray;
            int j1;
            h();
            atomicreferencearray = d;
            j1 = i1 & atomicreferencearray.length() - 1;
            s2 = (s)atomicreferencearray.get(j1);
            s s1 = s2;
_L2:
            if (s1 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj2 = s1.d();
            if (s1.c() != i1 || obj2 == null)
            {
                break MISSING_BLOCK_LABEL_221;
            }
            aa aa1;
            Object obj3;
            if (!a.b.a(obj, obj2))
            {
                break MISSING_BLOCK_LABEL_221;
            }
            aa1 = s1.a();
            obj3 = aa1.get();
            if (obj3 != null)
            {
                break MISSING_BLOCK_LABEL_183;
            }
            if (a(aa1))
            {
                i1 = b;
                c = c + 1;
                a(obj2, obj3, av.b.c);
                obj = b(s2, s1);
                i1 = b;
                atomicreferencearray.set(j1, obj);
                b = i1 - 1;
            }
            unlock();
            d();
            return null;
            c = c + 1;
            a(obj, obj3, av.b.b);
            a(s1, obj1);
            unlock();
            d();
            return obj3;
            s1 = s1.b();
            if (true) goto _L2; else goto _L1
_L1:
            unlock();
            d();
            return null;
            obj;
            unlock();
            d();
            throw obj;
        }

        final Object a(Object obj, int i1, Object obj1, boolean flag)
        {
            lock();
            int k1;
            h();
            k1 = b + 1;
            int j1 = k1;
            if (k1 <= j) goto _L2; else goto _L1
_L1:
            Object obj5;
            int j2;
            obj5 = d;
            j2 = ((AtomicReferenceArray) (obj5)).length();
            if (j2 >= 0x40000000) goto _L4; else goto _L3
_L3:
            AtomicReferenceArray atomicreferencearray;
            int k2;
            j1 = b;
            atomicreferencearray = a(j2 << 1);
            j = (atomicreferencearray.length() * 3) / 4;
            k2 = atomicreferencearray.length() - 1;
            int l1 = 0;
_L22:
            if (l1 >= j2) goto _L6; else goto _L5
_L5:
            Object obj4 = (s)((AtomicReferenceArray) (obj5)).get(l1);
            k1 = j1;
            if (obj4 == null) goto _L8; else goto _L7
_L7:
            Object obj2;
            obj2 = ((s) (obj4)).b();
            k1 = ((s) (obj4)).c() & k2;
            if (obj2 != null)
            {
                break MISSING_BLOCK_LABEL_702;
            }
            atomicreferencearray.set(k1, obj4);
              goto _L9
_L10:
            if (obj2 == null)
            {
                break MISSING_BLOCK_LABEL_200;
            }
            int i2 = ((s) (obj2)).c() & k2;
            Object obj3;
            if (i2 != k1)
            {
                k1 = i2;
                obj3 = obj2;
            }
            obj2 = ((s) (obj2)).b();
              goto _L10
            atomicreferencearray.set(k1, obj3);
            obj2 = obj4;
_L14:
            k1 = j1;
            if (obj2 == obj3) goto _L8; else goto _L11
_L11:
            k1 = ((s) (obj2)).c() & k2;
            obj4 = a(((s) (obj2)), (s)atomicreferencearray.get(k1));
            if (obj4 == null) goto _L13; else goto _L12
_L12:
            atomicreferencearray.set(k1, obj4);
_L15:
            obj2 = ((s) (obj2)).b();
              goto _L14
_L13:
            b(((s) (obj2)));
            j1--;
              goto _L15
_L6:
            d = atomicreferencearray;
            b = j1;
_L4:
            j1 = b + 1;
_L2:
            obj4 = d;
            k1 = i1 & ((AtomicReferenceArray) (obj4)).length() - 1;
            obj3 = (s)((AtomicReferenceArray) (obj4)).get(k1);
            obj2 = obj3;
_L16:
            if (obj2 == null)
            {
                break MISSING_BLOCK_LABEL_530;
            }
            obj5 = ((s) (obj2)).d();
            if (((s) (obj2)).c() != i1 || obj5 == null)
            {
                break MISSING_BLOCK_LABEL_518;
            }
            if (!a.b.a(obj, obj5))
            {
                break MISSING_BLOCK_LABEL_518;
            }
            obj3 = ((s) (obj2)).a().get();
            if (obj3 != null)
            {
                break MISSING_BLOCK_LABEL_458;
            }
            c = c + 1;
            a(((s) (obj2)), obj1);
            a(obj, obj3, av.b.c);
            b = b;
            unlock();
            d();
            return null;
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_480;
            }
            a(((s) (obj2)));
            unlock();
            d();
            return obj3;
            c = c + 1;
            a(obj, obj3, av.b.b);
            a(((s) (obj2)), obj1);
            unlock();
            d();
            return obj3;
            obj2 = ((s) (obj2)).b();
              goto _L16
            c = c + 1;
            obj = a.h.a(this, obj, i1, ((s) (obj3)));
            a(((s) (obj)), obj1);
            ((AtomicReferenceArray) (obj4)).set(k1, obj);
            if (!a.a() || b < k) goto _L18; else goto _L17
_L17:
            f();
            obj = (s)h.remove();
            if (!a(((s) (obj)), ((s) (obj)).c(), com.google.android.m4b.maps.aa.av.b.e))
            {
                throw new AssertionError();
            }
              goto _L19
            obj;
            unlock();
            d();
            throw obj;
_L19:
            i1 = 1;
_L20:
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_677;
            }
            i1 = b + 1;
_L21:
            b = i1;
            unlock();
            d();
            return null;
_L18:
            i1 = 0;
              goto _L20
            i1 = j1;
              goto _L21
_L8:
            j1 = k1;
_L9:
            l1++;
              goto _L22
            obj3 = obj4;
              goto _L10
        }

        final void a()
        {
            if (!tryLock())
            {
                break MISSING_BLOCK_LABEL_15;
            }
            e();
            unlock();
            return;
            Exception exception;
            exception;
            unlock();
            throw exception;
        }

        final void a(s s1, av.b b1)
        {
            Object obj = s1.d();
            s1.c();
            a(obj, s1.a().get(), b1);
        }

        final boolean a(Object obj, int i1, Object obj1, Object obj2)
        {
            lock();
            s s2;
            AtomicReferenceArray atomicreferencearray;
            int j1;
            h();
            atomicreferencearray = d;
            j1 = i1 & atomicreferencearray.length() - 1;
            s2 = (s)atomicreferencearray.get(j1);
            s s1 = s2;
_L2:
            if (s1 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj3 = s1.d();
            if (s1.c() != i1 || obj3 == null)
            {
                break MISSING_BLOCK_LABEL_253;
            }
            aa aa1;
            Object obj4;
            if (!a.b.a(obj, obj3))
            {
                break MISSING_BLOCK_LABEL_253;
            }
            aa1 = s1.a();
            obj4 = aa1.get();
            if (obj4 != null)
            {
                break MISSING_BLOCK_LABEL_183;
            }
            if (a(aa1))
            {
                i1 = b;
                c = c + 1;
                a(obj3, obj4, av.b.c);
                obj = b(s2, s1);
                i1 = b;
                atomicreferencearray.set(j1, obj);
                b = i1 - 1;
            }
            unlock();
            d();
            return false;
            if (!a.c.a(obj1, obj4))
            {
                break MISSING_BLOCK_LABEL_237;
            }
            c = c + 1;
            a(obj, obj4, av.b.b);
            a(s1, obj2);
            unlock();
            d();
            return true;
            a(s1);
            unlock();
            d();
            return false;
            s1 = s1.b();
            if (true) goto _L2; else goto _L1
_L1:
            unlock();
            d();
            return false;
            obj;
            unlock();
            d();
            throw obj;
        }

        final void b()
        {
            if (!tryLock())
            {
                break MISSING_BLOCK_LABEL_15;
            }
            g();
            unlock();
            return;
            Exception exception;
            exception;
            unlock();
            throw exception;
        }

        final boolean b(Object obj, int i1)
        {
            boolean flag = false;
            if (b == 0)
            {
                break MISSING_BLOCK_LABEL_50;
            }
            obj = e(obj, i1);
            if (obj == null)
            {
                c();
                return false;
            }
            obj = ((s) (obj)).a().get();
            if (obj != null)
            {
                flag = true;
            }
            c();
            return flag;
            c();
            return false;
            obj;
            c();
            throw obj;
        }

        final boolean b(Object obj, int i1, Object obj1)
        {
            lock();
            s s2;
            AtomicReferenceArray atomicreferencearray;
            int j1;
            h();
            j1 = b;
            atomicreferencearray = d;
            j1 = i1 & atomicreferencearray.length() - 1;
            s2 = (s)atomicreferencearray.get(j1);
            s s1 = s2;
_L3:
            if (s1 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj2 = s1.d();
            if (s1.c() != i1 || obj2 == null)
            {
                break MISSING_BLOCK_LABEL_230;
            }
            Object obj3;
            if (!a.b.a(obj, obj2))
            {
                break MISSING_BLOCK_LABEL_230;
            }
            obj = s1.a();
            obj3 = ((aa) (obj)).get();
            if (!a.c.a(obj1, obj3))
            {
                break MISSING_BLOCK_LABEL_200;
            }
            obj = com.google.android.m4b.maps.aa.av.b.a;
_L1:
            c = c + 1;
            a(obj2, obj3, ((av.b) (obj)));
            obj1 = b(s2, s1);
            i1 = b;
            atomicreferencearray.set(j1, obj1);
            b = i1 - 1;
            obj1 = com.google.android.m4b.maps.aa.av.b.a;
            boolean flag;
            if (obj == obj1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            unlock();
            d();
            return flag;
label0:
            {
                if (!a(((aa) (obj))))
                {
                    break label0;
                }
                obj = av.b.c;
            }
              goto _L1
            unlock();
            d();
            return false;
            s1 = s1.b();
            if (true) goto _L3; else goto _L2
_L2:
            unlock();
            d();
            return false;
            obj;
            unlock();
            d();
            throw obj;
        }

        final Object c(Object obj, int i1)
        {
            lock();
            s s2;
            AtomicReferenceArray atomicreferencearray;
            int j1;
            h();
            j1 = b;
            atomicreferencearray = d;
            j1 = i1 & atomicreferencearray.length() - 1;
            s2 = (s)atomicreferencearray.get(j1);
            s s1 = s2;
_L3:
            if (s1 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj1 = s1.d();
            if (s1.c() != i1 || obj1 == null)
            {
                break MISSING_BLOCK_LABEL_195;
            }
            Object obj2;
            if (!a.b.a(obj, obj1))
            {
                break MISSING_BLOCK_LABEL_195;
            }
            obj = s1.a();
            obj2 = ((aa) (obj)).get();
            if (obj2 == null)
            {
                break MISSING_BLOCK_LABEL_171;
            }
            obj = com.google.android.m4b.maps.aa.av.b.a;
_L1:
            c = c + 1;
            a(obj1, obj2, ((av.b) (obj)));
            obj = b(s2, s1);
            i1 = b;
            atomicreferencearray.set(j1, obj);
            b = i1 - 1;
            unlock();
            d();
            return obj2;
label0:
            {
                if (!a(((aa) (obj))))
                {
                    break label0;
                }
                obj = av.b.c;
            }
              goto _L1
            unlock();
            d();
            return null;
            s1 = s1.b();
            if (true) goto _L3; else goto _L2
_L2:
            unlock();
            d();
            return null;
            obj;
            unlock();
            d();
            throw obj;
        }

        final void c()
        {
            if ((g.incrementAndGet() & 0x3f) == 0)
            {
                h();
                d();
            }
        }

        final void d()
        {
            if (!isHeldByCurrentThread())
            {
                for (aw aw1 = a; (av.d)aw1.g.poll() != null;) { }
            }
        }

        m(aw aw1, int i1, int j1)
        {
            Object obj1 = null;
            super();
            a = aw1;
            k = j1;
            Object obj = a(i1);
            j = (((AtomicReferenceArray) (obj)).length() * 3) / 4;
            if (j == k)
            {
                j = j + 1;
            }
            d = ((AtomicReferenceArray) (obj));
            if (aw1.d())
            {
                obj = new ReferenceQueue();
            } else
            {
                obj = null;
            }
            e = ((ReferenceQueue) (obj));
            obj = obj1;
            if (aw1.e())
            {
                obj = new ReferenceQueue();
            }
            f = ((ReferenceQueue) (obj));
            if (aw1.a() || aw1.c())
            {
                obj = new ConcurrentLinkedQueue();
            } else
            {
                obj = com.google.android.m4b.maps.aa.aw.h();
            }
            l = ((Queue) (obj));
            if (aw1.a())
            {
                obj = new j();
            } else
            {
                obj = com.google.android.m4b.maps.aa.aw.h();
            }
            h = ((Queue) (obj));
            if (aw1.b())
            {
                aw1 = new l();
            } else
            {
                aw1 = com.google.android.m4b.maps.aa.aw.h();
            }
            i = aw1;
        }
    }

    static final class n extends b
    {

        private static final long serialVersionUID = 3L;

        private void readObject(ObjectInputStream objectinputstream)
        {
            boolean flag1 = false;
            objectinputstream.defaultReadObject();
            int i1 = objectinputstream.readInt();
            Object obj = new av();
            Object obj1;
            boolean flag;
            if (((av) (obj)).b == -1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.m4b.maps.y.j.b(flag, "initial capacity was already set to %s", new Object[] {
                Integer.valueOf(((av) (obj)).b)
            });
            if (i1 >= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.m4b.maps.y.j.a(flag);
            obj.b = i1;
            obj1 = super.a;
            if (((av) (obj)).e == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.m4b.maps.y.j.b(flag, "Key strength was already set to %s", new Object[] {
                ((av) (obj)).e
            });
            obj.e = (p)com.google.android.m4b.maps.y.j.a(obj1);
            if (((av) (obj)).e != p.b)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.m4b.maps.y.j.a(flag, "Soft keys are not supported");
            if (obj1 != com.google.android.m4b.maps.aa.p.a)
            {
                obj.a = true;
            }
            obj1 = super.b;
            if (((av) (obj)).f == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.m4b.maps.y.j.b(flag, "Value strength was already set to %s", new Object[] {
                ((av) (obj)).f
            });
            obj.f = (p)com.google.android.m4b.maps.y.j.a(obj1);
            if (obj1 != com.google.android.m4b.maps.aa.p.a)
            {
                obj.a = true;
            }
            obj1 = super.c;
            if (((av) (obj)).j == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.m4b.maps.y.j.b(flag, "key equivalence was already set to %s", new Object[] {
                ((av) (obj)).j
            });
            obj.j = (com.google.android.m4b.maps.y.e)com.google.android.m4b.maps.y.j.a(obj1);
            obj.a = true;
            i1 = super.g;
            if (((av) (obj)).c == -1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.m4b.maps.y.j.b(flag, "concurrency level was already set to %s", new Object[] {
                Integer.valueOf(((av) (obj)).c)
            });
            if (i1 > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.m4b.maps.y.j.a(flag);
            obj.c = i1;
            obj1 = super.h;
            if (((av) (obj)).k == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.m4b.maps.y.j.b(flag);
            obj.k = (av.c)com.google.android.m4b.maps.y.j.a(obj1);
            obj.a = true;
            if (super.d > 0L)
            {
                long l1 = super.d;
                TimeUnit timeunit = TimeUnit.NANOSECONDS;
                ((av) (obj)).a(l1, timeunit);
                obj.g = timeunit.toNanos(l1);
                if (l1 == 0L && ((av) (obj)).i == null)
                {
                    obj.i = av.b.d;
                }
                obj.a = true;
            }
            if (super.e > 0L)
            {
                long l2 = super.e;
                TimeUnit timeunit1 = TimeUnit.NANOSECONDS;
                ((av) (obj)).a(l2, timeunit1);
                obj.h = timeunit1.toNanos(l2);
                if (l2 == 0L && ((av) (obj)).i == null)
                {
                    obj.i = av.b.d;
                }
                obj.a = true;
            }
            if (super.f != -1)
            {
                int j1 = super.f;
                Object obj2;
                if (((av) (obj)).d == -1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                com.google.android.m4b.maps.y.j.b(flag, "maximum size was already set to %s", new Object[] {
                    Integer.valueOf(((av) (obj)).d)
                });
                flag = flag1;
                if (j1 >= 0)
                {
                    flag = true;
                }
                com.google.android.m4b.maps.y.j.a(flag, "maximum size must not be negative");
                obj.d = j1;
                obj.a = true;
                if (((av) (obj)).d == 0)
                {
                    obj.i = com.google.android.m4b.maps.aa.av.b.e;
                }
            }
            i = ((av) (obj)).d();
            do
            {
                obj = objectinputstream.readObject();
                if (obj != null)
                {
                    obj2 = objectinputstream.readObject();
                    super.i.put(obj, obj2);
                } else
                {
                    return;
                }
            } while (true);
        }

        private Object readResolve()
        {
            return i;
        }

        private void writeObject(ObjectOutputStream objectoutputstream)
        {
            objectoutputstream.defaultWriteObject();
            objectoutputstream.writeInt(super.i.size());
            java.util.Map.Entry entry;
            for (Iterator iterator = super.i.entrySet().iterator(); iterator.hasNext(); objectoutputstream.writeObject(entry.getValue()))
            {
                entry = (java.util.Map.Entry)iterator.next();
                objectoutputstream.writeObject(entry.getKey());
            }

            objectoutputstream.writeObject(null);
        }

        n(p p1, p p2, com.google.android.m4b.maps.y.e e1, com.google.android.m4b.maps.y.e e2, long l1, long l2, int i1, int j1, av.c c1, ConcurrentMap concurrentmap)
        {
            super(p1, p2, e1, e2, l1, l2, i1, j1, c1, concurrentmap);
        }
    }

    abstract class o
        implements Iterator
    {

        private int a;
        private int b;
        private m c;
        private AtomicReferenceArray d;
        private s e;
        private g f;
        private g g;
        private aw h;

        private boolean a(s s1)
        {
            Object obj1 = null;
            Object obj3;
            aw aw1;
            obj3 = s1.d();
            aw1 = h;
            if (s1.d() != null) goto _L2; else goto _L1
_L1:
            Object obj = obj1;
_L4:
            if (obj == null)
            {
                break; /* Loop/switch isn't completed */
            }
            f = h. new g(obj3, obj);
            c.c();
            return true;
_L2:
            Object obj2 = s1.a().get();
            obj = obj1;
            if (obj2 == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            boolean flag;
            if (!aw1.b())
            {
                break MISSING_BLOCK_LABEL_101;
            }
            flag = aw1.a(s1);
            obj = obj1;
            if (flag)
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = obj2;
            if (true) goto _L4; else goto _L3
_L3:
            c.c();
            return false;
            s1;
            c.c();
            throw s1;
        }

        private void b()
        {
            f = null;
            break MISSING_BLOCK_LABEL_5;
            if (!c() && !d())
            {
                while (a >= 0) 
                {
                    m am[] = h.a;
                    int i1 = a;
                    a = i1 - 1;
                    c = am[i1];
                    if (c.b != 0)
                    {
                        d = c.d;
                        b = d.length() - 1;
                        if (d())
                        {
                            return;
                        }
                    }
                }
            }
            return;
        }

        private boolean c()
        {
            if (e != null)
            {
                for (e = e.b(); e != null; e = e.b())
                {
                    if (a(e))
                    {
                        return true;
                    }
                }

            }
            return false;
        }

        private boolean d()
        {
            while (b >= 0) 
            {
                Object obj = d;
                int i1 = b;
                b = i1 - 1;
                obj = (s)((AtomicReferenceArray) (obj)).get(i1);
                e = ((s) (obj));
                if (obj != null && (a(e) || c()))
                {
                    return true;
                }
            }
            return false;
        }

        final g a()
        {
            if (f == null)
            {
                throw new NoSuchElementException();
            } else
            {
                g = f;
                b();
                return g;
            }
        }

        public boolean hasNext()
        {
            return f != null;
        }

        public void remove()
        {
            boolean flag;
            if (g != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.m4b.maps.y.j.b(flag, "no calls to next() since the last call to remove()");
            h.remove(g.getKey());
            g = null;
        }

        o()
        {
            h = aw.this;
            super();
            a = aw.this.a.length - 1;
            b = -1;
            b();
        }
    }

    static abstract class p extends Enum
    {

        public static final p a;
        public static final p b;
        private static p c;
        private static final p d[];

        public static p valueOf(String s1)
        {
            return (p)Enum.valueOf(com/google/android/m4b/maps/aa/aw$p, s1);
        }

        public static p[] values()
        {
            return (p[])d.clone();
        }

        abstract aa a(m m1, s s1, Object obj);

        abstract com.google.android.m4b.maps.y.e a();

        static 
        {
            a = new p("STRONG") {

                final aa a(m m1, s s1, Object obj)
                {
                    return new y(obj);
                }

                final com.google.android.m4b.maps.y.e a()
                {
                    return com.google.android.m4b.maps.y.e.a.a;
                }

            };
            b = new p("SOFT") {

                final aa a(m m1, s s1, Object obj)
                {
                    return new t(m1.f, obj, s1);
                }

                final com.google.android.m4b.maps.y.e a()
                {
                    return com.google.android.m4b.maps.y.e.b.a;
                }

            };
            c = new p("WEAK") {

                final aa a(m m1, s s1, Object obj)
                {
                    return new f(m1.f, obj, s1);
                }

                final com.google.android.m4b.maps.y.e a()
                {
                    return com.google.android.m4b.maps.y.e.b.a;
                }

            };
            d = (new p[] {
                a, b, c
            });
        }

        private p(String s1, int i1)
        {
            super(s1, i1);
        }

        p(String s1, int i1, byte byte0)
        {
            this(s1, i1);
        }
    }

    final class q extends o
    {

        private aw a;

        public final Object next()
        {
            return a().getKey();
        }

        q()
        {
            a = aw.this;
            super();
        }
    }

    final class r extends AbstractSet
    {

        private aw a;

        public final void clear()
        {
            a.clear();
        }

        public final boolean contains(Object obj)
        {
            return a.containsKey(obj);
        }

        public final boolean isEmpty()
        {
            return a.isEmpty();
        }

        public final Iterator iterator()
        {
            return a. new q();
        }

        public final boolean remove(Object obj)
        {
            return a.remove(obj) != null;
        }

        public final int size()
        {
            return a.size();
        }

        r()
        {
            a = aw.this;
            super();
        }
    }

    static interface s
    {

        public abstract aa a();

        public abstract void a(long l1);

        public abstract void a(aa aa1);

        public abstract void a(s s1);

        public abstract s b();

        public abstract void b(s s1);

        public abstract int c();

        public abstract void c(s s1);

        public abstract Object d();

        public abstract void d(s s1);

        public abstract long e();

        public abstract s f();

        public abstract s g();

        public abstract s h();

        public abstract s i();
    }

    static final class t extends SoftReference
        implements aa
    {

        private s a;

        public final aa a(ReferenceQueue referencequeue, Object obj, s s1)
        {
            return new t(referencequeue, obj, s1);
        }

        public final s a()
        {
            return a;
        }

        public final void b()
        {
            clear();
        }

        t(ReferenceQueue referencequeue, Object obj, s s1)
        {
            super(obj, referencequeue);
            a = s1;
        }
    }

    static class u
        implements s
    {

        private Object a;
        private int b;
        private s c;
        private volatile aa d;

        public final aa a()
        {
            return d;
        }

        public void a(long l1)
        {
            throw new UnsupportedOperationException();
        }

        public final void a(aa aa1)
        {
            aa aa2 = d;
            d = aa1;
            aa2.b();
        }

        public void a(s s1)
        {
            throw new UnsupportedOperationException();
        }

        public final s b()
        {
            return c;
        }

        public void b(s s1)
        {
            throw new UnsupportedOperationException();
        }

        public final int c()
        {
            return b;
        }

        public void c(s s1)
        {
            throw new UnsupportedOperationException();
        }

        public final Object d()
        {
            return a;
        }

        public void d(s s1)
        {
            throw new UnsupportedOperationException();
        }

        public long e()
        {
            throw new UnsupportedOperationException();
        }

        public s f()
        {
            throw new UnsupportedOperationException();
        }

        public s g()
        {
            throw new UnsupportedOperationException();
        }

        public s h()
        {
            throw new UnsupportedOperationException();
        }

        public s i()
        {
            throw new UnsupportedOperationException();
        }

        u(Object obj, int i1, s s1)
        {
            d = aw.f();
            a = obj;
            b = i1;
            c = s1;
        }
    }

    static final class v extends u
        implements s
    {

        private s a;
        private s b;

        public final void c(s s1)
        {
            a = s1;
        }

        public final void d(s s1)
        {
            b = s1;
        }

        public final s h()
        {
            return a;
        }

        public final s i()
        {
            return b;
        }

        v(Object obj, int i1, s s1)
        {
            super(obj, i1, s1);
            a = aw.g();
            b = aw.g();
        }
    }

    static final class w extends u
        implements s
    {

        private volatile long a;
        private s b;
        private s c;

        public final void a(long l1)
        {
            a = l1;
        }

        public final void a(s s1)
        {
            b = s1;
        }

        public final void b(s s1)
        {
            c = s1;
        }

        public final long e()
        {
            return a;
        }

        public final s f()
        {
            return b;
        }

        public final s g()
        {
            return c;
        }

        w(Object obj, int i1, s s1)
        {
            super(obj, i1, s1);
            a = 0x7fffffffffffffffL;
            b = aw.g();
            c = aw.g();
        }
    }

    static final class x extends u
        implements s
    {

        private volatile long a;
        private s b;
        private s c;
        private s d;
        private s e;

        public final void a(long l1)
        {
            a = l1;
        }

        public final void a(s s1)
        {
            b = s1;
        }

        public final void b(s s1)
        {
            c = s1;
        }

        public final void c(s s1)
        {
            d = s1;
        }

        public final void d(s s1)
        {
            e = s1;
        }

        public final long e()
        {
            return a;
        }

        public final s f()
        {
            return b;
        }

        public final s g()
        {
            return c;
        }

        public final s h()
        {
            return d;
        }

        public final s i()
        {
            return e;
        }

        x(Object obj, int i1, s s1)
        {
            super(obj, i1, s1);
            a = 0x7fffffffffffffffL;
            b = aw.g();
            c = aw.g();
            d = aw.g();
            e = aw.g();
        }
    }

    static final class y
        implements aa
    {

        private Object a;

        public final aa a(ReferenceQueue referencequeue, Object obj, s s1)
        {
            return this;
        }

        public final s a()
        {
            return null;
        }

        public final void b()
        {
        }

        public final Object get()
        {
            return a;
        }

        y(Object obj)
        {
            a = obj;
        }
    }

    final class z extends o
    {

        private aw a;

        public final Object next()
        {
            return a().getValue();
        }

        z()
        {
            a = aw.this;
            super();
        }
    }


    static final Queue j = new AbstractQueue() {

        public final Iterator iterator()
        {
            return com.google.android.m4b.maps.aa.e.a();
        }

        public final boolean offer(Object obj)
        {
            return true;
        }

        public final Object peek()
        {
            return null;
        }

        public final Object poll()
        {
            return null;
        }

        public final int size()
        {
            return 0;
        }

    };
    private static final Logger k = Logger.getLogger(com/google/android/m4b/maps/aa/aw.getName());
    private static aa r = new aa() {

        public final aa a(ReferenceQueue referencequeue, Object obj, s s1)
        {
            return this;
        }

        public final s a()
        {
            return null;
        }

        public final void b()
        {
        }

        public final Object get()
        {
            return null;
        }

    };
    private static final long serialVersionUID = 5L;
    final transient m a[];
    final com.google.android.m4b.maps.y.e b;
    final com.google.android.m4b.maps.y.e c;
    final p d;
    final long e;
    final long f;
    final Queue g;
    final transient c h;
    final com.google.android.m4b.maps.y.s i = (com.google.android.m4b.maps.y.s)com.google.android.m4b.maps.y.h.b(null, com.google.android.m4b.maps.y.s.b());
    private transient int l;
    private transient int m;
    private int n;
    private p o;
    private int p;
    private av.c q;
    private transient Set s;
    private transient Collection t;
    private transient Set u;

    aw(av av1)
    {
        long l3 = 0L;
        int j2 = 1;
        boolean flag1 = false;
        boolean flag = false;
        super();
        n = Math.min(av1.b(), 0x10000);
        o = av1.c();
        d = (p)com.google.android.m4b.maps.y.h.b(av1.f, com.google.android.m4b.maps.aa.p.a);
        b = (com.google.android.m4b.maps.y.e)com.google.android.m4b.maps.y.h.b(av1.j, av1.c().a());
        c = d.a();
        p = av1.d;
        Object obj;
        int i1;
        int j1;
        int k1;
        long l2;
        if (av1.h == -1L)
        {
            l2 = 0L;
        } else
        {
            l2 = av1.h;
        }
        e = l2;
        if (av1.g == -1L)
        {
            l2 = l3;
        } else
        {
            l2 = av1.g;
        }
        f = l2;
        h = com.google.android.m4b.maps.aa.c.a(o, b(), a());
        q = av1.e();
        if (q == com.google.android.m4b.maps.aa.w.a.a)
        {
            obj = j;
        } else
        {
            obj = new ConcurrentLinkedQueue();
        }
        g = ((Queue) (obj));
        i1 = Math.min(av1.a(), 0x40000000);
        j1 = i1;
        if (a())
        {
            j1 = Math.min(i1, p);
        }
        i1 = 1;
        k1 = 0;
        for (; i1 < n && (!a() || i1 * 2 <= p); i1 <<= 1)
        {
            k1++;
        }

        m = 32 - k1;
        l = i1 - 1;
        a = new m[i1];
        k1 = j1 / i1;
        if (k1 * i1 < j1)
        {
            k1++;
            j1 = j2;
        } else
        {
            j1 = j2;
        }
        for (; j1 < k1; j1 <<= 1) { }
        k1 = ((flag1) ? 1 : 0);
        if (a())
        {
            int i2 = p / i1 + 1;
            j2 = p;
            k1 = ((flag) ? 1 : 0);
            for (int l1 = i2; k1 < a.length; l1 = i2)
            {
                i2 = l1;
                if (k1 == j2 % i1)
                {
                    i2 = l1 - 1;
                }
                a[k1] = a(j1, i2);
                k1++;
            }

        } else
        {
            for (; k1 < a.length; k1++)
            {
                a[k1] = a(j1, -1);
            }

        }
    }

    private int a(Object obj)
    {
        int i1 = b.a(obj);
        i1 += i1 << 15 ^ 0xffffcd7d;
        i1 ^= i1 >>> 10;
        i1 += i1 << 3;
        i1 ^= i1 >>> 6;
        i1 += (i1 << 2) + (i1 << 14);
        return i1 ^ i1 >>> 16;
    }

    private m a(int i1, int j1)
    {
        return new m(this, i1, j1);
    }

    static void a(s s1, s s2)
    {
        s1.a(s2);
        s2.b(s1);
    }

    static boolean a(s s1, long l1)
    {
        return l1 - s1.e() > 0L;
    }

    static void b(s s1)
    {
        k k1 = com.google.android.m4b.maps.aa.k.a;
        s1.a(k1);
        s1.b(k1);
    }

    static void b(s s1, s s2)
    {
        s1.c(s2);
        s2.d(s1);
    }

    static void c(s s1)
    {
        k k1 = com.google.android.m4b.maps.aa.k.a;
        s1.c(k1);
        s1.d(k1);
    }

    static aa f()
    {
        return r;
    }

    static s g()
    {
        return com.google.android.m4b.maps.aa.k.a;
    }

    static Queue h()
    {
        return j;
    }

    final m a(int i1)
    {
        return a[i1 >>> m & l];
    }

    final boolean a()
    {
        return p != -1;
    }

    final boolean a(s s1)
    {
        return a(s1, i.a());
    }

    final boolean b()
    {
        boolean flag1 = false;
        boolean flag;
        if (f > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag || c())
        {
            flag1 = true;
        }
        return flag1;
    }

    final boolean c()
    {
        return e > 0L;
    }

    public void clear()
    {
        m am[];
        int i1;
        int k1;
        am = a;
        k1 = am.length;
        i1 = 0;
_L8:
        if (i1 >= k1) goto _L2; else goto _L1
_L1:
        m m1 = am[i1];
        if (m1.b == 0) goto _L4; else goto _L3
_L3:
        m1.lock();
        AtomicReferenceArray atomicreferencearray;
        atomicreferencearray = m1.d;
        if (m1.a.g == j)
        {
            break MISSING_BLOCK_LABEL_253;
        }
        int j1 = 0;
_L9:
        s s1;
        if (j1 >= atomicreferencearray.length())
        {
            break MISSING_BLOCK_LABEL_253;
        }
        s1 = (s)atomicreferencearray.get(j1);
_L6:
        if (s1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        s1.a();
        m1.a(s1, com.google.android.m4b.maps.aa.av.b.a);
        s1 = s1.b();
        if (true) goto _L6; else goto _L5
_L7:
        Exception exception;
        for (; j1 >= atomicreferencearray.length(); j1 = 0)
        {
            break MISSING_BLOCK_LABEL_134;
        }

        atomicreferencearray.set(j1, null);
        j1++;
          goto _L7
        if (m1.a.d())
        {
            while (m1.e.poll() != null) ;
        }
        if (m1.a.e())
        {
            while (m1.f.poll() != null) ;
        }
        m1.h.clear();
        m1.i.clear();
        m1.g.set(0);
        m1.c = m1.c + 1;
        m1.b = 0;
        m1.unlock();
        m1.d();
_L4:
        i1++;
          goto _L8
        exception;
        m1.unlock();
        m1.d();
        throw exception;
_L2:
        return;
_L5:
        j1++;
          goto _L9
    }

    public boolean containsKey(Object obj)
    {
        if (obj == null)
        {
            return false;
        } else
        {
            int i1 = a(obj);
            return a(i1).b(obj, i1);
        }
    }

    public boolean containsValue(Object obj)
    {
        m am[];
        int i1;
        long l3;
        if (obj == null)
        {
            return false;
        }
        am = a;
        i1 = 0;
        l3 = -1L;
_L14:
        int j1;
        int l1;
        long l2;
        if (i1 >= 3)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = am.length;
        l2 = 0L;
        j1 = 0;
_L12:
        if (j1 >= l1) goto _L2; else goto _L1
_L1:
        m m1;
        AtomicReferenceArray atomicreferencearray;
        int k1;
        m1 = am[j1];
        k1 = m1.b;
        atomicreferencearray = m1.d;
        k1 = 0;
_L11:
        s s1;
        if (k1 >= atomicreferencearray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = (s)atomicreferencearray.get(k1);
_L9:
        if (s1 == null) goto _L4; else goto _L3
_L3:
        if (s1.d() != null) goto _L6; else goto _L5
_L5:
        Object obj1;
        m1.a();
        obj1 = null;
_L8:
        if (obj1 != null && c.a(obj, obj1))
        {
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        Object obj2 = s1.a().get();
        if (obj2 == null)
        {
            m1.a();
            obj1 = null;
        } else
        {
            obj1 = obj2;
            if (m1.a.b())
            {
                obj1 = obj2;
                if (m1.a.a(s1))
                {
                    m1.b();
                    obj1 = null;
                }
            }
        }
        if (true) goto _L8; else goto _L7
_L7:
        s1 = s1.b();
          goto _L9
_L4:
        k1++;
        if (true) goto _L11; else goto _L10
_L10:
        l2 += m1.c;
        j1++;
          goto _L12
_L2:
        if (l2 == l3)
        {
            break; /* Loop/switch isn't completed */
        }
        i1++;
        l3 = l2;
        if (true) goto _L14; else goto _L13
_L13:
        return false;
    }

    final boolean d()
    {
        return o != com.google.android.m4b.maps.aa.p.a;
    }

    final boolean e()
    {
        return d != com.google.android.m4b.maps.aa.p.a;
    }

    public Set entrySet()
    {
        Set set = u;
        if (set != null)
        {
            return set;
        } else
        {
            i i1 = new i();
            u = i1;
            return i1;
        }
    }

    public Object get(Object obj)
    {
        if (obj == null)
        {
            return null;
        } else
        {
            int i1 = a(obj);
            return a(i1).a(obj, i1);
        }
    }

    public boolean isEmpty()
    {
        m am[];
        int i1;
        long l1;
        am = a;
        i1 = 0;
        l1 = 0L;
_L9:
        if (i1 >= am.length) goto _L2; else goto _L1
_L1:
        if (am[i1].b == 0) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        l1 += am[i1].c;
        i1++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (l1 == 0L)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = 0;
_L6:
        if (i1 >= am.length)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (am[i1].b != 0) goto _L3; else goto _L5
_L5:
        l1 -= am[i1].c;
        i1++;
          goto _L6
        if (l1 != 0L) goto _L3; else goto _L7
_L7:
        return true;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public Set keySet()
    {
        Set set = s;
        if (set != null)
        {
            return set;
        } else
        {
            r r1 = new r();
            s = r1;
            return r1;
        }
    }

    public Object put(Object obj, Object obj1)
    {
        com.google.android.m4b.maps.y.j.a(obj);
        com.google.android.m4b.maps.y.j.a(obj1);
        int i1 = a(obj);
        return a(i1).a(obj, i1, obj1, false);
    }

    public void putAll(Map map)
    {
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); put(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

    }

    public Object putIfAbsent(Object obj, Object obj1)
    {
        com.google.android.m4b.maps.y.j.a(obj);
        com.google.android.m4b.maps.y.j.a(obj1);
        int i1 = a(obj);
        return a(i1).a(obj, i1, obj1, true);
    }

    public Object remove(Object obj)
    {
        if (obj == null)
        {
            return null;
        } else
        {
            int i1 = a(obj);
            return a(i1).c(obj, i1);
        }
    }

    public boolean remove(Object obj, Object obj1)
    {
        if (obj == null || obj1 == null)
        {
            return false;
        } else
        {
            int i1 = a(obj);
            return a(i1).b(obj, i1, obj1);
        }
    }

    public Object replace(Object obj, Object obj1)
    {
        com.google.android.m4b.maps.y.j.a(obj);
        com.google.android.m4b.maps.y.j.a(obj1);
        int i1 = a(obj);
        return a(i1).a(obj, i1, obj1);
    }

    public boolean replace(Object obj, Object obj1, Object obj2)
    {
        com.google.android.m4b.maps.y.j.a(obj);
        com.google.android.m4b.maps.y.j.a(obj2);
        if (obj1 == null)
        {
            return false;
        } else
        {
            int i1 = a(obj);
            return a(i1).a(obj, i1, obj1, obj2);
        }
    }

    public int size()
    {
        m am[] = a;
        long l1 = 0L;
        for (int i1 = 0; i1 < am.length; i1++)
        {
            l1 += am[i1].b;
        }

        return com.google.android.m4b.maps.n.a.a(l1);
    }

    public Collection values()
    {
        Collection collection = t;
        if (collection != null)
        {
            return collection;
        } else
        {
            ab ab1 = new ab();
            t = ab1;
            return ab1;
        }
    }

    Object writeReplace()
    {
        return new n(o, d, b, c, f, e, p, n, q, this);
    }


    // Unreferenced inner class com/google/android/m4b/maps/aa/aw$j$1

/* anonymous class */
    final class j._cls1 extends a
    {

        private s a;
        private s b;
        private j c;

        public final void c(s s1)
        {
            a = s1;
        }

        public final void d(s s1)
        {
            b = s1;
        }

        public final s h()
        {
            return a;
        }

        public final s i()
        {
            return b;
        }

            
            {
                c = j1;
                super();
                a = this;
                b = this;
            }
    }


    // Unreferenced inner class com/google/android/m4b/maps/aa/aw$l$1

/* anonymous class */
    final class l._cls1 extends a
    {

        private s a;
        private s b;
        private l c;

        public final void a(long l1)
        {
        }

        public final void a(s s1)
        {
            a = s1;
        }

        public final void b(s s1)
        {
            b = s1;
        }

        public final long e()
        {
            return 0x7fffffffffffffffL;
        }

        public final s f()
        {
            return a;
        }

        public final s g()
        {
            return b;
        }

            
            {
                c = l1;
                super();
                a = this;
                b = this;
            }
    }

}
