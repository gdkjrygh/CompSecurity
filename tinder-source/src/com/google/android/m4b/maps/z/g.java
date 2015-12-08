// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.z;

import com.google.android.m4b.maps.aa.ay;
import com.google.android.m4b.maps.aj.i;
import com.google.android.m4b.maps.n.a;
import com.google.android.m4b.maps.y.e;
import com.google.android.m4b.maps.y.h;
import com.google.android.m4b.maps.y.j;
import com.google.android.m4b.maps.y.q;
import com.google.android.m4b.maps.y.s;
import java.io.ObjectInputStream;
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
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.m4b.maps.z:
//            c, o, l, k, 
//            d, f, b, m

class com.google.android.m4b.maps.z.g extends AbstractMap
    implements ConcurrentMap
{
    abstract class a extends AbstractSet
    {

        final ConcurrentMap a;
        private com.google.android.m4b.maps.z.g b;

        public void clear()
        {
            a.clear();
        }

        public boolean isEmpty()
        {
            return a.isEmpty();
        }

        public int size()
        {
            return a.size();
        }

        a(ConcurrentMap concurrentmap)
        {
            b = com.google.android.m4b.maps.z.g.this;
            super();
            a = concurrentmap;
        }
    }

    static interface aa
    {

        public abstract long a();

        public abstract void a(long l1);

        public abstract void a(aa aa1);

        public abstract void a(ai ai1);

        public abstract aa b();

        public abstract void b(long l1);

        public abstract void b(aa aa1);

        public abstract aa c();

        public abstract void c(aa aa1);

        public abstract long d();

        public abstract void d(aa aa1);

        public abstract aa e();

        public abstract aa f();

        public abstract Object g();

        public abstract ai h();

        public abstract int i();

        public abstract aa j();
    }

    static final class ab extends SoftReference
        implements ai
    {

        private aa a;

        public final int a()
        {
            return 1;
        }

        public final ai a(ReferenceQueue referencequeue, Object obj, aa aa1)
        {
            return new ab(referencequeue, obj, aa1);
        }

        public final void a(Object obj)
        {
        }

        public final aa b()
        {
            return a;
        }

        public final boolean c()
        {
            return false;
        }

        public final boolean d()
        {
            return true;
        }

        public final Object e()
        {
            return get();
        }

        ab(ReferenceQueue referencequeue, Object obj, aa aa1)
        {
            super(obj, referencequeue);
            a = aa1;
        }
    }

    static final class ac extends ae
    {

        private volatile long a;
        private aa b;
        private aa c;

        public final long a()
        {
            return a;
        }

        public final void a(long l1)
        {
            a = l1;
        }

        public final void a(aa aa1)
        {
            b = aa1;
        }

        public final aa b()
        {
            return b;
        }

        public final void b(aa aa1)
        {
            c = aa1;
        }

        public final aa c()
        {
            return c;
        }

        ac(Object obj, int i1, aa aa1)
        {
            super(obj, i1, aa1);
            a = 0x7fffffffffffffffL;
            b = com.google.android.m4b.maps.z.g.k();
            c = com.google.android.m4b.maps.z.g.k();
        }
    }

    static final class ad extends ae
    {

        private volatile long a;
        private aa b;
        private aa c;
        private volatile long d;
        private aa e;
        private aa f;

        public final long a()
        {
            return a;
        }

        public final void a(long l1)
        {
            a = l1;
        }

        public final void a(aa aa1)
        {
            b = aa1;
        }

        public final aa b()
        {
            return b;
        }

        public final void b(long l1)
        {
            d = l1;
        }

        public final void b(aa aa1)
        {
            c = aa1;
        }

        public final aa c()
        {
            return c;
        }

        public final void c(aa aa1)
        {
            e = aa1;
        }

        public final long d()
        {
            return d;
        }

        public final void d(aa aa1)
        {
            f = aa1;
        }

        public final aa e()
        {
            return e;
        }

        public final aa f()
        {
            return f;
        }

        ad(Object obj, int i1, aa aa1)
        {
            super(obj, i1, aa1);
            a = 0x7fffffffffffffffL;
            b = com.google.android.m4b.maps.z.g.k();
            c = com.google.android.m4b.maps.z.g.k();
            d = 0x7fffffffffffffffL;
            e = com.google.android.m4b.maps.z.g.k();
            f = com.google.android.m4b.maps.z.g.k();
        }
    }

    static class ae extends r
    {

        private Object a;
        private int b;
        private aa c;
        private volatile ai d;

        public final void a(ai ai1)
        {
            d = ai1;
        }

        public final Object g()
        {
            return a;
        }

        public final ai h()
        {
            return d;
        }

        public final int i()
        {
            return b;
        }

        public final aa j()
        {
            return c;
        }

        ae(Object obj, int i1, aa aa1)
        {
            d = com.google.android.m4b.maps.z.g.j();
            a = obj;
            b = i1;
            c = aa1;
        }
    }

    static class af
        implements ai
    {

        private Object a;

        public int a()
        {
            return 1;
        }

        public final ai a(ReferenceQueue referencequeue, Object obj, aa aa1)
        {
            return this;
        }

        public final void a(Object obj)
        {
        }

        public final aa b()
        {
            return null;
        }

        public final boolean c()
        {
            return false;
        }

        public final boolean d()
        {
            return true;
        }

        public final Object e()
        {
            return get();
        }

        public Object get()
        {
            return a;
        }

        af(Object obj)
        {
            a = obj;
        }
    }

    static final class ag extends ae
    {

        private volatile long a;
        private aa b;
        private aa c;

        public final void b(long l1)
        {
            a = l1;
        }

        public final void c(aa aa1)
        {
            b = aa1;
        }

        public final long d()
        {
            return a;
        }

        public final void d(aa aa1)
        {
            c = aa1;
        }

        public final aa e()
        {
            return b;
        }

        public final aa f()
        {
            return c;
        }

        ag(Object obj, int i1, aa aa1)
        {
            super(obj, i1, aa1);
            a = 0x7fffffffffffffffL;
            b = com.google.android.m4b.maps.z.g.k();
            c = com.google.android.m4b.maps.z.g.k();
        }
    }

    final class ah extends w
    {

        private com.google.android.m4b.maps.z.g a;

        public final Object next()
        {
            return a().getValue();
        }

        ah()
        {
            a = com.google.android.m4b.maps.z.g.this;
            super();
        }
    }

    static interface ai
    {

        public abstract int a();

        public abstract ai a(ReferenceQueue referencequeue, Object obj, aa aa1);

        public abstract void a(Object obj);

        public abstract aa b();

        public abstract boolean c();

        public abstract boolean d();

        public abstract Object e();

        public abstract Object get();
    }

    final class b extends AbstractCollection
    {

        private final ConcurrentMap a;
        private com.google.android.m4b.maps.z.g b;

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
            return b. new ah();
        }

        public final int size()
        {
            return a.size();
        }

        b(ConcurrentMap concurrentmap)
        {
            b = com.google.android.m4b.maps.z.g.this;
            super();
            a = concurrentmap;
        }
    }

    static final class c extends f
    {

        private volatile long a;
        private aa b;
        private aa c;

        public final long a()
        {
            return a;
        }

        public final void a(long l1)
        {
            a = l1;
        }

        public final void a(aa aa1)
        {
            b = aa1;
        }

        public final aa b()
        {
            return b;
        }

        public final void b(aa aa1)
        {
            c = aa1;
        }

        public final aa c()
        {
            return c;
        }

        c(ReferenceQueue referencequeue, Object obj, int i1, aa aa1)
        {
            super(referencequeue, obj, i1, aa1);
            a = 0x7fffffffffffffffL;
            b = com.google.android.m4b.maps.z.g.k();
            c = com.google.android.m4b.maps.z.g.k();
        }
    }

    static abstract class d extends Enum
    {

        private static d a;
        private static d b;
        private static d c;
        private static d d;
        private static d e;
        private static d f;
        private static d g;
        private static d h;
        private static d i[];
        private static final d j[];

        static d a(s s1, boolean flag, boolean flag1)
        {
            byte byte1 = 0;
            byte byte0;
            boolean flag2;
            if (s1 == s.b)
            {
                byte0 = 4;
            } else
            {
                byte0 = 0;
            }
            if (flag)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (flag1)
            {
                byte1 = 2;
            }
            return i[byte1 | (flag2 | byte0)];
        }

        static void a(aa aa1, aa aa2)
        {
            aa2.a(aa1.a());
            com.google.android.m4b.maps.z.g.a(aa1.c(), aa2);
            com.google.android.m4b.maps.z.g.a(aa2, aa1.b());
            com.google.android.m4b.maps.z.g.a(aa1);
        }

        static void b(aa aa1, aa aa2)
        {
            aa2.b(aa1.d());
            com.google.android.m4b.maps.z.g.b(aa1.f(), aa2);
            com.google.android.m4b.maps.z.g.b(aa2, aa1.e());
            com.google.android.m4b.maps.z.g.b(aa1);
        }

        public static d valueOf(String s1)
        {
            return (d)Enum.valueOf(com/google/android/m4b/maps/z/g$d, s1);
        }

        public static d[] values()
        {
            return (d[])j.clone();
        }

        aa a(q q1, aa aa1, aa aa2)
        {
            return a(q1, aa1.g(), aa1.i(), aa2);
        }

        abstract aa a(q q1, Object obj, int i1, aa aa1);

        static 
        {
            a = new d("STRONG") {

                final aa a(q q1, Object obj, int i1, aa aa1)
                {
                    return new ae(obj, i1, aa1);
                }

            };
            b = new d("STRONG_ACCESS") {

                final aa a(q q1, aa aa1, aa aa2)
                {
                    q1 = super.a(q1, aa1, aa2);
                    a(aa1, ((aa) (q1)));
                    return q1;
                }

                final aa a(q q1, Object obj, int i1, aa aa1)
                {
                    return new ac(obj, i1, aa1);
                }

            };
            c = new d("STRONG_WRITE") {

                final aa a(q q1, aa aa1, aa aa2)
                {
                    q1 = super.a(q1, aa1, aa2);
                    b(aa1, q1);
                    return q1;
                }

                final aa a(q q1, Object obj, int i1, aa aa1)
                {
                    return new ag(obj, i1, aa1);
                }

            };
            d = new d("STRONG_ACCESS_WRITE") {

                final aa a(q q1, aa aa1, aa aa2)
                {
                    q1 = super.a(q1, aa1, aa2);
                    a(aa1, ((aa) (q1)));
                    b(aa1, q1);
                    return q1;
                }

                final aa a(q q1, Object obj, int i1, aa aa1)
                {
                    return new ad(obj, i1, aa1);
                }

            };
            e = new d("WEAK") {

                final aa a(q q1, Object obj, int i1, aa aa1)
                {
                    return new f(q1.e, obj, i1, aa1);
                }

            };
            f = new d("WEAK_ACCESS") {

                final aa a(q q1, aa aa1, aa aa2)
                {
                    q1 = super.a(q1, aa1, aa2);
                    a(aa1, ((aa) (q1)));
                    return q1;
                }

                final aa a(q q1, Object obj, int i1, aa aa1)
                {
                    return new c(q1.e, obj, i1, aa1);
                }

            };
            g = new d("WEAK_WRITE") {

                final aa a(q q1, aa aa1, aa aa2)
                {
                    q1 = super.a(q1, aa1, aa2);
                    b(aa1, q1);
                    return q1;
                }

                final aa a(q q1, Object obj, int i1, aa aa1)
                {
                    return new h(q1.e, obj, i1, aa1);
                }

            };
            h = new d("WEAK_ACCESS_WRITE") {

                final aa a(q q1, aa aa1, aa aa2)
                {
                    q1 = super.a(q1, aa1, aa2);
                    a(aa1, ((aa) (q1)));
                    b(aa1, q1);
                    return q1;
                }

                final aa a(q q1, Object obj, int i1, aa aa1)
                {
                    return new e(q1.e, obj, i1, aa1);
                }

            };
            j = (new d[] {
                a, b, c, d, e, f, g, h
            });
            i = (new d[] {
                a, b, c, d, e, f, g, h
            });
        }

        private d(String s1, int i1)
        {
            super(s1, i1);
        }

        d(String s1, int i1, byte byte0)
        {
            this(s1, i1);
        }
    }

    static final class e extends f
    {

        private volatile long a;
        private aa b;
        private aa c;
        private volatile long d;
        private aa e;
        private aa f;

        public final long a()
        {
            return a;
        }

        public final void a(long l1)
        {
            a = l1;
        }

        public final void a(aa aa1)
        {
            b = aa1;
        }

        public final aa b()
        {
            return b;
        }

        public final void b(long l1)
        {
            d = l1;
        }

        public final void b(aa aa1)
        {
            c = aa1;
        }

        public final aa c()
        {
            return c;
        }

        public final void c(aa aa1)
        {
            e = aa1;
        }

        public final long d()
        {
            return d;
        }

        public final void d(aa aa1)
        {
            f = aa1;
        }

        public final aa e()
        {
            return e;
        }

        public final aa f()
        {
            return f;
        }

        e(ReferenceQueue referencequeue, Object obj, int i1, aa aa1)
        {
            super(referencequeue, obj, i1, aa1);
            a = 0x7fffffffffffffffL;
            b = com.google.android.m4b.maps.z.g.k();
            c = com.google.android.m4b.maps.z.g.k();
            d = 0x7fffffffffffffffL;
            e = com.google.android.m4b.maps.z.g.k();
            f = com.google.android.m4b.maps.z.g.k();
        }
    }

    static class f extends WeakReference
        implements aa
    {

        private int a;
        private aa b;
        private volatile ai c;

        public long a()
        {
            throw new UnsupportedOperationException();
        }

        public void a(long l1)
        {
            throw new UnsupportedOperationException();
        }

        public void a(aa aa1)
        {
            throw new UnsupportedOperationException();
        }

        public final void a(ai ai1)
        {
            c = ai1;
        }

        public aa b()
        {
            throw new UnsupportedOperationException();
        }

        public void b(long l1)
        {
            throw new UnsupportedOperationException();
        }

        public void b(aa aa1)
        {
            throw new UnsupportedOperationException();
        }

        public aa c()
        {
            throw new UnsupportedOperationException();
        }

        public void c(aa aa1)
        {
            throw new UnsupportedOperationException();
        }

        public long d()
        {
            throw new UnsupportedOperationException();
        }

        public void d(aa aa1)
        {
            throw new UnsupportedOperationException();
        }

        public aa e()
        {
            throw new UnsupportedOperationException();
        }

        public aa f()
        {
            throw new UnsupportedOperationException();
        }

        public final Object g()
        {
            return get();
        }

        public final ai h()
        {
            return c;
        }

        public final int i()
        {
            return a;
        }

        public final aa j()
        {
            return b;
        }

        f(ReferenceQueue referencequeue, Object obj, int i1, aa aa1)
        {
            super(obj, referencequeue);
            c = com.google.android.m4b.maps.z.g.j();
            a = i1;
            b = aa1;
        }
    }

    static final class g extends WeakReference
        implements ai
    {

        private aa a;

        public final int a()
        {
            return 1;
        }

        public final ai a(ReferenceQueue referencequeue, Object obj, aa aa1)
        {
            return new g(referencequeue, obj, aa1);
        }

        public final void a(Object obj)
        {
        }

        public final aa b()
        {
            return a;
        }

        public final boolean c()
        {
            return false;
        }

        public final boolean d()
        {
            return true;
        }

        public final Object e()
        {
            return get();
        }

        g(ReferenceQueue referencequeue, Object obj, aa aa1)
        {
            super(obj, referencequeue);
            a = aa1;
        }
    }

    static final class h extends f
    {

        private volatile long a;
        private aa b;
        private aa c;

        public final void b(long l1)
        {
            a = l1;
        }

        public final void c(aa aa1)
        {
            b = aa1;
        }

        public final long d()
        {
            return a;
        }

        public final void d(aa aa1)
        {
            c = aa1;
        }

        public final aa e()
        {
            return b;
        }

        public final aa f()
        {
            return c;
        }

        h(ReferenceQueue referencequeue, Object obj, int i1, aa aa1)
        {
            super(referencequeue, obj, i1, aa1);
            a = 0x7fffffffffffffffL;
            b = com.google.android.m4b.maps.z.g.k();
            c = com.google.android.m4b.maps.z.g.k();
        }
    }

    static final class i extends af
    {

        private int a;

        public final int a()
        {
            return a;
        }

        i(Object obj)
        {
            super(obj);
            a = 0;
        }
    }

    static final class j extends n
        implements com.google.android.m4b.maps.y.f, Serializable
    {

        private static final long serialVersionUID = 1L;
        private transient com.google.android.m4b.maps.y.f b;

        private void readObject(ObjectInputStream objectinputstream)
        {
            objectinputstream.defaultReadObject();
            b = b().a(a);
        }

        private Object readResolve()
        {
            return b;
        }

        public final Object a(Object obj)
        {
            return b.a(obj);
        }

        j(com.google.android.m4b.maps.z.g g1)
        {
            super(g1);
        }
    }

    static final class k extends AbstractQueue
    {

        final aa a = new _cls1(this);

        private aa a()
        {
            aa aa2 = a.e();
            aa aa1 = aa2;
            if (aa2 == a)
            {
                aa1 = null;
            }
            return aa1;
        }

        public final void clear()
        {
            aa aa2;
            for (aa aa1 = a.e(); aa1 != a; aa1 = aa2)
            {
                aa2 = aa1.e();
                com.google.android.m4b.maps.z.g.b(aa1);
            }

            a.c(a);
            a.d(a);
        }

        public final boolean contains(Object obj)
        {
            return ((aa)obj).e() != com.google.android.m4b.maps.z.o.a;
        }

        public final boolean isEmpty()
        {
            return a.e() == a;
        }

        public final Iterator iterator()
        {
            return new ay(this, a()) {

                private k a;

                protected final Object a(Object obj)
                {
                    aa aa1 = ((aa)obj).e();
                    obj = aa1;
                    if (aa1 == a.a)
                    {
                        obj = null;
                    }
                    return obj;
                }

            
            {
                a = k1;
                super(aa1);
            }
            };
        }

        public final boolean offer(Object obj)
        {
            obj = (aa)obj;
            com.google.android.m4b.maps.z.g.b(((aa) (obj)).f(), ((aa) (obj)).e());
            com.google.android.m4b.maps.z.g.b(a.f(), ((aa) (obj)));
            com.google.android.m4b.maps.z.g.b(((aa) (obj)), a);
            return true;
        }

        public final Object peek()
        {
            return a();
        }

        public final Object poll()
        {
            aa aa1 = a.e();
            if (aa1 == a)
            {
                return null;
            } else
            {
                remove(aa1);
                return aa1;
            }
        }

        public final boolean remove(Object obj)
        {
            obj = (aa)obj;
            aa aa1 = ((aa) (obj)).f();
            aa aa2 = ((aa) (obj)).e();
            com.google.android.m4b.maps.z.g.b(aa1, aa2);
            com.google.android.m4b.maps.z.g.b(((aa) (obj)));
            return aa2 != com.google.android.m4b.maps.z.o.a;
        }

        public final int size()
        {
            int i1 = 0;
            for (aa aa1 = a.e(); aa1 != a; aa1 = aa1.e())
            {
                i1++;
            }

            return i1;
        }

        k()
        {
        }
    }

    static final class l extends m
        implements com.google.android.m4b.maps.y.f
    {

        private static final long serialVersionUID = 1L;

        private Object b(Object obj)
        {
            try
            {
                com.google.android.m4b.maps.z.g g1 = a;
                com.google.android.m4b.maps.z.d d1 = g1.r;
                int i1 = g1.a(com.google.android.m4b.maps.y.j.a(obj));
                obj = g1.a(i1).a(obj, i1, d1);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new com.google.android.m4b.maps.aj.k(((ExecutionException) (obj)).getCause());
            }
            return obj;
        }

        public final Object a(Object obj)
        {
            return b(obj);
        }

        final Object writeReplace()
        {
            return new j(a);
        }

        l(com.google.android.m4b.maps.z.c c1, com.google.android.m4b.maps.z.d d1)
        {
            super(new com.google.android.m4b.maps.z.g(c1, (com.google.android.m4b.maps.z.d)com.google.android.m4b.maps.y.j.a(d1)), (byte)0);
        }
    }

    static class m
        implements com.google.android.m4b.maps.z.b, Serializable
    {

        private static final long serialVersionUID = 1L;
        final com.google.android.m4b.maps.z.g a;

        Object writeReplace()
        {
            return new n(a);
        }

        m(com.google.android.m4b.maps.z.c c1)
        {
            this(new com.google.android.m4b.maps.z.g(c1, null));
        }

        private m(com.google.android.m4b.maps.z.g g1)
        {
            a = g1;
        }

        m(com.google.android.m4b.maps.z.g g1, byte byte0)
        {
            this(g1);
        }
    }

    static class n extends com.google.android.m4b.maps.z.f
        implements Serializable
    {

        private static final long serialVersionUID = 1L;
        final com.google.android.m4b.maps.z.d a;
        private s b;
        private s c;
        private com.google.android.m4b.maps.y.e d;
        private com.google.android.m4b.maps.y.e e;
        private long f;
        private long g;
        private long h;
        private com.google.android.m4b.maps.z.o i;
        private int j;
        private com.google.android.m4b.maps.z.l k;
        private com.google.android.m4b.maps.y.s l;
        private transient com.google.android.m4b.maps.z.b m;

        private void readObject(ObjectInputStream objectinputstream)
        {
            objectinputstream.defaultReadObject();
            objectinputstream = b();
            objectinputstream.d();
            boolean flag;
            if (((com.google.android.m4b.maps.z.c) (objectinputstream)).k == -1L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.m4b.maps.y.j.b(flag, "refreshAfterWrite requires a LoadingCache");
            m = new m(objectinputstream);
        }

        private Object readResolve()
        {
            return m;
        }

        protected final com.google.android.m4b.maps.z.b a()
        {
            return m;
        }

        final com.google.android.m4b.maps.z.c b()
        {
            com.google.android.m4b.maps.z.c c1 = com.google.android.m4b.maps.z.c.a().a(b);
            Object obj = c;
            int i1;
            boolean flag;
            if (c1.h == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.m4b.maps.y.j.b(flag, "Value strength was already set to %s", new Object[] {
                c1.h
            });
            c1.h = (s)com.google.android.m4b.maps.y.j.a(obj);
            obj = d;
            if (c1.l == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.m4b.maps.y.j.b(flag, "key equivalence was already set to %s", new Object[] {
                c1.l
            });
            c1.l = (com.google.android.m4b.maps.y.e)com.google.android.m4b.maps.y.j.a(obj);
            obj = e;
            if (c1.m == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.m4b.maps.y.j.b(flag, "value equivalence was already set to %s", new Object[] {
                c1.m
            });
            c1.m = (com.google.android.m4b.maps.y.e)com.google.android.m4b.maps.y.j.a(obj);
            i1 = j;
            if (c1.d == -1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.m4b.maps.y.j.b(flag, "concurrency level was already set to %s", new Object[] {
                Integer.valueOf(c1.d)
            });
            if (i1 > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.m4b.maps.y.j.a(flag);
            c1.d = i1;
            obj = k;
            if (c1.n == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.m4b.maps.y.j.b(flag);
            c1.n = (com.google.android.m4b.maps.z.l)com.google.android.m4b.maps.y.j.a(obj);
            c1.b = false;
            if (f > 0L)
            {
                long l1 = f;
                Object obj1 = TimeUnit.NANOSECONDS;
                if (c1.i == -1L)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                com.google.android.m4b.maps.y.j.b(flag, "expireAfterWrite was already set to %s ns", new Object[] {
                    Long.valueOf(c1.i)
                });
                if (l1 >= 0L)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                com.google.android.m4b.maps.y.j.a(flag, "duration cannot be negative: %s %s", new Object[] {
                    Long.valueOf(l1), obj1
                });
                c1.i = ((TimeUnit) (obj1)).toNanos(l1);
            }
            if (g > 0L)
            {
                l1 = g;
                obj1 = TimeUnit.NANOSECONDS;
                if (c1.j == -1L)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                com.google.android.m4b.maps.y.j.b(flag, "expireAfterAccess was already set to %s ns", new Object[] {
                    Long.valueOf(c1.j)
                });
                if (l1 >= 0L)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                com.google.android.m4b.maps.y.j.a(flag, "duration cannot be negative: %s %s", new Object[] {
                    Long.valueOf(l1), obj1
                });
                c1.j = ((TimeUnit) (obj1)).toNanos(l1);
            }
            if (i != com.google.android.m4b.maps.z.c.b.a)
            {
                obj1 = i;
                if (c1.g == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                com.google.android.m4b.maps.y.j.b(flag);
                if (c1.b)
                {
                    if (c1.e == -1L)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    com.google.android.m4b.maps.y.j.b(flag, "weigher can not be combined with maximum size", new Object[] {
                        Long.valueOf(c1.e)
                    });
                }
                c1.g = (com.google.android.m4b.maps.z.o)com.google.android.m4b.maps.y.j.a(obj1);
                if (h != -1L)
                {
                    l1 = h;
                    if (c1.f == -1L)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    com.google.android.m4b.maps.y.j.b(flag, "maximum weight was already set to %s", new Object[] {
                        Long.valueOf(c1.f)
                    });
                    if (c1.e == -1L)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    com.google.android.m4b.maps.y.j.b(flag, "maximum size was already set to %s", new Object[] {
                        Long.valueOf(c1.e)
                    });
                    c1.f = l1;
                    if (l1 >= 0L)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    com.google.android.m4b.maps.y.j.a(flag, "maximum weight must not be negative");
                }
            } else
            if (h != -1L)
            {
                long l2 = h;
                if (c1.e == -1L)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                com.google.android.m4b.maps.y.j.b(flag, "maximum size was already set to %s", new Object[] {
                    Long.valueOf(c1.e)
                });
                if (c1.f == -1L)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                com.google.android.m4b.maps.y.j.b(flag, "maximum weight was already set to %s", new Object[] {
                    Long.valueOf(c1.f)
                });
                if (c1.g == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                com.google.android.m4b.maps.y.j.b(flag, "maximum size can not be combined with weigher");
                if (l2 >= 0L)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                com.google.android.m4b.maps.y.j.a(flag, "maximum size must not be negative");
                c1.e = l2;
            }
            if (l != null)
            {
                obj1 = l;
                if (c1.o == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                com.google.android.m4b.maps.y.j.b(flag);
                c1.o = (com.google.android.m4b.maps.y.s)com.google.android.m4b.maps.y.j.a(obj1);
            }
            return c1;
        }

        protected final Object c()
        {
            return m;
        }

        private n(s s1, s s2, com.google.android.m4b.maps.y.e e1, com.google.android.m4b.maps.y.e e2, long l1, long l2, long l3, com.google.android.m4b.maps.z.o o1, int i1, com.google.android.m4b.maps.z.l l4, com.google.android.m4b.maps.y.s s3, 
                com.google.android.m4b.maps.z.d d1)
        {
label0:
            {
                super();
                b = s1;
                c = s2;
                d = e1;
                e = e2;
                f = l1;
                g = l2;
                h = l3;
                i = o1;
                j = i1;
                k = l4;
                if (s3 != com.google.android.m4b.maps.y.s.b())
                {
                    s1 = s3;
                    if (s3 != com.google.android.m4b.maps.z.c.a)
                    {
                        break label0;
                    }
                }
                s1 = null;
            }
            l = s1;
            a = d1;
        }

        n(com.google.android.m4b.maps.z.g g1)
        {
            this(g1.g, g1.h, g1.e, g1.f, g1.l, g1.k, g1.i, g1.j, g1.d, g1.o, g1.p, g1.r);
        }
    }

    static final class o extends Enum
        implements aa
    {

        public static final o a;
        private static final o b[];

        public static o valueOf(String s1)
        {
            return (o)Enum.valueOf(com/google/android/m4b/maps/z/g$o, s1);
        }

        public static o[] values()
        {
            return (o[])b.clone();
        }

        public final long a()
        {
            return 0L;
        }

        public final void a(long l1)
        {
        }

        public final void a(aa aa1)
        {
        }

        public final void a(ai ai1)
        {
        }

        public final aa b()
        {
            return this;
        }

        public final void b(long l1)
        {
        }

        public final void b(aa aa1)
        {
        }

        public final aa c()
        {
            return this;
        }

        public final void c(aa aa1)
        {
        }

        public final long d()
        {
            return 0L;
        }

        public final void d(aa aa1)
        {
        }

        public final aa e()
        {
            return this;
        }

        public final aa f()
        {
            return this;
        }

        public final Object g()
        {
            return null;
        }

        public final ai h()
        {
            return null;
        }

        public final int i()
        {
            return 0;
        }

        public final aa j()
        {
            return null;
        }

        static 
        {
            a = new o("INSTANCE");
            b = (new o[] {
                a
            });
        }

        private o(String s1)
        {
            super(s1, 0);
        }
    }

    final class p
        implements java.util.Map.Entry
    {

        private Object a;
        private Object b;
        private com.google.android.m4b.maps.z.g c;

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
            throw new UnsupportedOperationException();
        }

        public final String toString()
        {
            return (new StringBuilder()).append(getKey()).append("=").append(getValue()).toString();
        }

        p(Object obj, Object obj1)
        {
            c = com.google.android.m4b.maps.z.g.this;
            super();
            a = obj;
            b = obj1;
        }
    }

    static final class q extends ReentrantLock
    {

        final com.google.android.m4b.maps.z.g a;
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
        private long l;
        private Queue m;
        private a.b n;

        private aa a(aa aa1, aa aa2)
        {
            if (aa1.g() != null)
            {
                ai ai1 = aa1.h();
                Object obj = ai1.get();
                if (obj != null || !ai1.d())
                {
                    aa1 = a.q.a(this, aa1, aa2);
                    aa1.a(ai1.a(f, obj, aa1));
                    return aa1;
                }
            }
            return null;
        }

        private aa a(aa aa1, aa aa2, Object obj, ai ai1, com.google.android.m4b.maps.z.k k1)
        {
            a(obj, ai1, k1);
            h.remove(aa2);
            i.remove(aa2);
            if (ai1.c())
            {
                ai1.a(null);
                return aa1;
            } else
            {
                return b(aa1, aa2);
            }
        }

        private aa a(Object obj, int i1, long l1)
        {
            obj = e(obj, i1);
            if (obj == null)
            {
                return null;
            }
            if (a.a(((aa) (obj)), l1))
            {
                a(l1);
                return null;
            } else
            {
                return ((aa) (obj));
            }
        }

        private aa a(Object obj, int i1, aa aa1)
        {
            return a.q.a(this, com.google.android.m4b.maps.y.j.a(obj), i1, aa1);
        }

        private Object a(aa aa1, Object obj, int i1, Object obj1, long l1, com.google.android.m4b.maps.z.d d1)
        {
            Object obj2 = obj1;
            if (a.e())
            {
                obj2 = obj1;
                if (l1 - aa1.d() > a.m)
                {
                    obj2 = obj1;
                    if (!aa1.h().c())
                    {
                        aa1 = ((aa) (c(obj, i1, d1)));
                        obj2 = obj1;
                        if (aa1 != null)
                        {
                            obj2 = aa1;
                        }
                    }
                }
            }
            return obj2;
        }

        private Object a(aa aa1, Object obj, ai ai1)
        {
            if (!ai1.c())
            {
                throw new AssertionError();
            }
            boolean flag;
            if (!Thread.holdsLock(aa1))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.m4b.maps.y.j.b(flag, "Recursive load of: %s", new Object[] {
                obj
            });
            ai1 = ((ai) (ai1.e()));
            if (ai1 != null)
            {
                break MISSING_BLOCK_LABEL_100;
            }
            throw new d.a((new StringBuilder("CacheLoader returned null for key ")).append(obj).append(".").toString());
            aa1;
            n.b();
            throw aa1;
            b(aa1, a.p.a());
            n.b();
            return ai1;
        }

        private static AtomicReferenceArray a(int i1)
        {
            return new AtomicReferenceArray(i1);
        }

        private void a(long l1)
        {
            if (!tryLock())
            {
                break MISSING_BLOCK_LABEL_16;
            }
            b(l1);
            unlock();
            return;
            Exception exception;
            exception;
            unlock();
            throw exception;
        }

        private void a(aa aa1)
        {
            a(aa1, com.google.android.m4b.maps.z.k.c);
            h.remove(aa1);
            i.remove(aa1);
        }

        private void a(aa aa1, Object obj, long l1)
        {
            ai ai1 = aa1.h();
            com.google.android.m4b.maps.z.o o1 = a.j;
            com.google.android.m4b.maps.y.j.b(true, "Weights must be non-negative");
            aa1.a(a.h.a(this, aa1, obj));
            e();
            j = j + 1;
            if (a.d())
            {
                aa1.a(l1);
            }
            if (a.g())
            {
                aa1.b(l1);
            }
            i.add(aa1);
            h.add(aa1);
            ai1.a(obj);
        }

        private void a(Object obj, ai ai1, com.google.android.m4b.maps.z.k k1)
        {
            j = j - ai1.a();
            if (k1.a())
            {
                n.c();
            }
            if (a.n != com.google.android.m4b.maps.z.g.t)
            {
                obj = new com.google.android.m4b.maps.z.m(obj, ai1.get(), k1);
                a.n.offer(obj);
            }
        }

        private boolean a(aa aa1, int i1)
        {
            lock();
            aa aa3;
            AtomicReferenceArray atomicreferencearray;
            int j1 = b;
            atomicreferencearray = d;
            i1 &= atomicreferencearray.length() - 1;
            aa3 = (aa)atomicreferencearray.get(i1);
            aa aa2 = aa3;
_L2:
            if (aa2 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            if (aa2 != aa1)
            {
                break MISSING_BLOCK_LABEL_113;
            }
            c = c + 1;
            aa1 = a(aa3, aa2, aa2.g(), aa2.h(), com.google.android.m4b.maps.z.k.c);
            int k1 = b;
            atomicreferencearray.set(i1, aa1);
            b = k1 - 1;
            unlock();
            b();
            return true;
            aa2 = aa2.j();
            if (true) goto _L2; else goto _L1
_L1:
            unlock();
            b();
            return false;
            aa1;
            unlock();
            b();
            throw aa1;
        }

        private boolean a(aa aa1, int i1, com.google.android.m4b.maps.z.k k1)
        {
            int j1 = b;
            AtomicReferenceArray atomicreferencearray = d;
            i1 &= atomicreferencearray.length() - 1;
            aa aa3 = (aa)atomicreferencearray.get(i1);
            for (aa aa2 = aa3; aa2 != null; aa2 = aa2.j())
            {
                if (aa2 == aa1)
                {
                    c = c + 1;
                    aa1 = a(aa3, aa2, aa2.g(), aa2.h(), k1);
                    int l1 = b;
                    atomicreferencearray.set(i1, aa1);
                    b = l1 - 1;
                    return true;
                }
            }

            return false;
        }

        private boolean a(Object obj, int i1, ai ai1)
        {
            boolean flag;
            flag = false;
            lock();
            aa aa2;
            AtomicReferenceArray atomicreferencearray;
            int j1;
            j1 = b;
            atomicreferencearray = d;
            j1 = i1 & atomicreferencearray.length() - 1;
            aa2 = (aa)atomicreferencearray.get(j1);
            aa aa1 = aa2;
_L12:
            if (aa1 == null) goto _L2; else goto _L1
_L1:
            Object obj1 = aa1.g();
            if (aa1.i() != i1 || obj1 == null) goto _L4; else goto _L3
_L3:
            if (!a.e.a(obj, obj1)) goto _L4; else goto _L5
_L5:
            if (aa1.h() != ai1) goto _L7; else goto _L6
_L6:
            c = c + 1;
            obj = a(aa2, aa1, obj1, ai1, com.google.android.m4b.maps.z.k.c);
            i1 = b;
            atomicreferencearray.set(j1, obj);
            b = i1 - 1;
            unlock();
            if (!isHeldByCurrentThread())
            {
                b();
            }
            flag = true;
_L9:
            return flag;
_L7:
            unlock();
            if (isHeldByCurrentThread()) goto _L9; else goto _L8
_L8:
            b();
            return false;
_L4:
            aa1 = aa1.j();
            continue; /* Loop/switch isn't completed */
_L2:
            unlock();
            if (isHeldByCurrentThread()) goto _L9; else goto _L10
_L10:
            b();
            return false;
            obj;
            unlock();
            if (!isHeldByCurrentThread())
            {
                b();
            }
            throw obj;
            if (true) goto _L12; else goto _L11
_L11:
        }

        private boolean a(Object obj, int i1, z z1)
        {
            lock();
            aa aa2;
            AtomicReferenceArray atomicreferencearray;
            int j1;
            atomicreferencearray = d;
            j1 = i1 & atomicreferencearray.length() - 1;
            aa2 = (aa)atomicreferencearray.get(j1);
            aa aa1 = aa2;
_L6:
            if (aa1 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj1 = aa1.g();
            if (aa1.i() != i1 || obj1 == null)
            {
                break MISSING_BLOCK_LABEL_161;
            }
            if (!a.e.a(obj, obj1))
            {
                break MISSING_BLOCK_LABEL_161;
            }
            if (aa1.h() != z1)
            {
                break MISSING_BLOCK_LABEL_151;
            }
            if (!z1.d()) goto _L2; else goto _L1
_L1:
            aa1.a(z1.a);
_L4:
            unlock();
            b();
            return true;
_L2:
            atomicreferencearray.set(j1, b(aa2, aa1));
            if (true) goto _L4; else goto _L3
_L3:
            obj;
            unlock();
            b();
            throw obj;
            unlock();
            b();
            return false;
            aa1 = aa1.j();
            if (true) goto _L6; else goto _L5
_L5:
            unlock();
            b();
            return false;
        }

        private boolean a(Object obj, int i1, z z1, Object obj1)
        {
            lock();
            int k1;
            long l1;
            l1 = a.p.a();
            c(l1);
            k1 = b + 1;
            int j1 = k1;
            Object obj3;
            Object obj4;
            if (k1 > k)
            {
                g();
                j1 = b + 1;
            }
            obj4 = d;
            k1 = i1 & ((AtomicReferenceArray) (obj4)).length() - 1;
            obj3 = (aa)((AtomicReferenceArray) (obj4)).get(k1);
            Object obj2 = obj3;
_L13:
            if (obj2 == null) goto _L2; else goto _L1
_L1:
            Object obj5 = ((aa) (obj2)).g();
            if (((aa) (obj2)).i() != i1 || obj5 == null) goto _L4; else goto _L3
_L3:
            if (!a.e.a(obj, obj5)) goto _L4; else goto _L5
_L5:
            obj3 = ((aa) (obj2)).h();
            obj4 = ((ai) (obj3)).get();
            if (z1 == obj3) goto _L7; else goto _L6
_L6:
            if (obj4 != null) goto _L9; else goto _L8
_L8:
            if (obj3 == com.google.android.m4b.maps.z.g.s) goto _L9; else goto _L7
_L7:
            c = c + 1;
            if (!z1.d())
            {
                break MISSING_BLOCK_LABEL_354;
            }
            if (obj4 != null) goto _L11; else goto _L10
_L10:
            obj3 = com.google.android.m4b.maps.z.k.c;
_L12:
            a(obj, ((ai) (z1)), ((com.google.android.m4b.maps.z.k) (obj3)));
            i1 = j1 - 1;
_L14:
            a(((aa) (obj2)), obj1, l1);
            b = i1;
            f();
            unlock();
            b();
            return true;
_L11:
            obj3 = com.google.android.m4b.maps.z.k.b;
              goto _L12
_L9:
            a(obj, ((ai) (new i(obj1))), com.google.android.m4b.maps.z.k.b);
            unlock();
            b();
            return false;
_L4:
            obj2 = ((aa) (obj2)).j();
              goto _L13
_L2:
            c = c + 1;
            obj = a(obj, i1, ((aa) (obj3)));
            a(((aa) (obj)), obj1, l1);
            ((AtomicReferenceArray) (obj4)).set(k1, obj);
            b = j1;
            f();
            unlock();
            b();
            return true;
            obj;
            unlock();
            b();
            throw obj;
            i1 = j1;
              goto _L14
        }

        private aa b(aa aa1, aa aa2)
        {
            int i1 = b;
            aa aa4 = aa2.j();
            aa aa3 = aa1;
            aa1 = aa4;
            while (aa3 != aa2) 
            {
                aa aa5 = a(aa3, aa1);
                if (aa5 != null)
                {
                    aa1 = aa5;
                } else
                {
                    a(aa3);
                    i1--;
                }
                aa3 = aa3.j();
            }
            b = i1;
            return aa1;
        }

        private Object b(Object obj, int i1, com.google.android.m4b.maps.z.d d1)
        {
            lock();
            aa aa2;
            AtomicReferenceArray atomicreferencearray;
            int j1;
            int k1;
            long l1;
            l1 = a.p.a();
            c(l1);
            j1 = b;
            atomicreferencearray = d;
            k1 = i1 & atomicreferencearray.length() - 1;
            aa2 = (aa)atomicreferencearray.get(k1);
            aa aa1 = aa2;
_L14:
            if (aa1 == null)
            {
                break MISSING_BLOCK_LABEL_410;
            }
            Object obj1 = aa1.g();
            if (aa1.i() != i1 || obj1 == null) goto _L2; else goto _L1
_L1:
            if (!a.e.a(obj, obj1)) goto _L2; else goto _L3
_L3:
            ai ai1 = aa1.h();
            if (!ai1.c()) goto _L5; else goto _L4
_L4:
            j1 = 0;
_L12:
            if (j1 == 0) goto _L7; else goto _L6
_L6:
            obj1 = new z();
            if (aa1 != null) goto _L9; else goto _L8
_L8:
            aa1 = a(obj, i1, aa2);
            aa1.a(((ai) (obj1)));
            atomicreferencearray.set(k1, aa1);
_L15:
            unlock();
            b();
            if (j1 == 0) goto _L11; else goto _L10
_L10:
            aa1;
            JVM INSTR monitorenter ;
            obj = a(obj, i1, ((z) (obj1)), ((z) (obj1)).a(obj, d1));
            aa1;
            JVM INSTR monitorexit ;
            n.b();
            return obj;
_L5:
            Object obj2 = ai1.get();
            if (obj2 != null)
            {
                break MISSING_BLOCK_LABEL_285;
            }
            a(obj1, ai1, com.google.android.m4b.maps.z.k.c);
_L13:
            h.remove(aa1);
            i.remove(aa1);
            b = j1 - 1;
            j1 = 1;
              goto _L12
            if (!a.a(aa1, l1))
            {
                break MISSING_BLOCK_LABEL_324;
            }
            a(obj1, ai1, com.google.android.m4b.maps.z.k.d);
              goto _L13
            obj;
            unlock();
            b();
            throw obj;
            c(aa1, l1);
            n.a();
            unlock();
            b();
            return obj2;
_L2:
            aa1 = aa1.j();
              goto _L14
_L9:
            aa1.a(((ai) (obj1)));
              goto _L15
            obj;
            aa1;
            JVM INSTR monitorexit ;
            throw obj;
            obj;
            n.b();
            throw obj;
_L11:
            return a(aa1, obj, ai1);
_L7:
            obj1 = null;
              goto _L15
            ai1 = null;
            j1 = 1;
              goto _L12
        }

        private void b(long l1)
        {
            e();
            do
            {
                aa aa1 = (aa)h.peek();
                if (aa1 != null && a.a(aa1, l1))
                {
                    if (!a(aa1, aa1.i(), com.google.android.m4b.maps.z.k.d))
                    {
                        throw new AssertionError();
                    }
                } else
                {
                    do
                    {
                        aa aa2 = (aa)i.peek();
                        if (aa2 != null && a.a(aa2, l1))
                        {
                            if (!a(aa2, aa2.i(), com.google.android.m4b.maps.z.k.d))
                            {
                                throw new AssertionError();
                            }
                        } else
                        {
                            return;
                        }
                    } while (true);
                }
            } while (true);
        }

        private void b(aa aa1, long l1)
        {
            if (a.d())
            {
                aa1.a(l1);
            }
            m.add(aa1);
        }

        private Object c(Object obj, int i1, com.google.android.m4b.maps.z.d d1)
        {
            z z1 = d(obj, i1);
            if (z1 == null)
            {
                return null;
            }
            d1 = z1.a(obj, d1);
            d1.a(new Runnable(this, obj, i1, z1, d1) {

                private Object a;
                private int b;
                private z c;
                private com.google.android.m4b.maps.aj.f d;
                private q e;

                public final void run()
                {
                    try
                    {
                        e.a(a, b, c, d);
                        return;
                    }
                    catch (Throwable throwable)
                    {
                        com.google.android.m4b.maps.z.g.a.log(Level.WARNING, "Exception thrown during refresh", throwable);
                        c.a(throwable);
                        return;
                    }
                }

            
            {
                e = q1;
                a = obj;
                b = i1;
                c = z1;
                d = f1;
                super();
            }
            }, com.google.android.m4b.maps.z.g.b);
            if (!d1.isDone())
            {
                break MISSING_BLOCK_LABEL_62;
            }
            obj = com.google.android.m4b.maps.aj.l.a(d1);
            return obj;
            obj;
            return null;
        }

        private void c()
        {
            if (!tryLock())
            {
                break MISSING_BLOCK_LABEL_15;
            }
            d();
            unlock();
            return;
            Exception exception;
            exception;
            unlock();
            throw exception;
        }

        private void c(long l1)
        {
            if (!tryLock())
            {
                break MISSING_BLOCK_LABEL_28;
            }
            d();
            b(l1);
            g.set(0);
            unlock();
            return;
            Exception exception;
            exception;
            unlock();
            throw exception;
        }

        private void c(aa aa1, long l1)
        {
            if (a.d())
            {
                aa1.a(l1);
            }
            i.add(aa1);
        }

        private z d(Object obj, int i1)
        {
            lock();
            aa aa1;
            AtomicReferenceArray atomicreferencearray;
            int j1;
            long l1;
            l1 = a.p.a();
            c(l1);
            atomicreferencearray = d;
            j1 = i1 & atomicreferencearray.length() - 1;
            aa1 = (aa)atomicreferencearray.get(j1);
            Object obj1 = aa1;
_L1:
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_197;
            }
            Object obj2 = ((aa) (obj1)).g();
            if (((aa) (obj1)).i() != i1 || obj2 == null)
            {
                break MISSING_BLOCK_LABEL_187;
            }
            long l2;
            long l3;
            if (!a.e.a(obj, obj2))
            {
                break MISSING_BLOCK_LABEL_187;
            }
            obj = ((aa) (obj1)).h();
            if (((ai) (obj)).c())
            {
                break MISSING_BLOCK_LABEL_141;
            }
            l2 = ((aa) (obj1)).d();
            l3 = a.m;
            if (l1 - l2 >= l3)
            {
                break MISSING_BLOCK_LABEL_151;
            }
            unlock();
            b();
            return null;
            c = c + 1;
            obj = new z(((ai) (obj)));
            ((aa) (obj1)).a(((ai) (obj)));
            unlock();
            b();
            return ((z) (obj));
            obj1 = ((aa) (obj1)).j();
              goto _L1
            c = c + 1;
            obj1 = new z();
            obj = a(obj, i1, aa1);
            ((aa) (obj)).a(((ai) (obj1)));
            atomicreferencearray.set(j1, obj);
            unlock();
            b();
            return ((z) (obj1));
            obj;
            unlock();
            b();
            throw obj;
        }

        private void d()
        {
            int k1 = 0;
            if (a.h())
            {
                int i1 = 0;
                do
                {
                    Object obj = e.poll();
                    if (obj == null)
                    {
                        break;
                    }
                    obj = (aa)obj;
                    com.google.android.m4b.maps.z.g g1 = a;
                    int l1 = ((aa) (obj)).i();
                    g1.a(l1).a(((aa) (obj)), l1);
                    i1++;
                } while (i1 != 16);
            }
            if (a.i())
            {
                int j1 = k1;
                do
                {
                    Object obj1 = f.poll();
                    if (obj1 == null)
                    {
                        break;
                    }
                    obj1 = (ai)obj1;
                    com.google.android.m4b.maps.z.g g2 = a;
                    aa aa1 = ((ai) (obj1)).b();
                    k1 = aa1.i();
                    g2.a(k1).a(aa1.g(), k1, ((ai) (obj1)));
                    k1 = j1 + 1;
                    j1 = k1;
                } while (k1 != 16);
            }
        }

        private aa e(Object obj, int i1)
        {
            Object obj1;
            obj1 = d;
            obj1 = (aa)((AtomicReferenceArray) (obj1)).get(((AtomicReferenceArray) (obj1)).length() - 1 & i1);
_L2:
            Object obj2;
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            if (((aa) (obj1)).i() == i1)
            {
                obj2 = ((aa) (obj1)).g();
                if (obj2 != null)
                {
                    break; /* Loop/switch isn't completed */
                }
                c();
            }
_L4:
            obj1 = ((aa) (obj1)).j();
            if (true) goto _L2; else goto _L1
_L1:
            if (!a.e.a(obj, obj2)) goto _L4; else goto _L3
_L3:
            return ((aa) (obj1));
            return null;
        }

        private void e()
        {
            do
            {
                aa aa1 = (aa)m.poll();
                if (aa1 == null)
                {
                    break;
                }
                if (i.contains(aa1))
                {
                    i.add(aa1);
                }
            } while (true);
        }

        private void f()
        {
            if (a.a())
            {
                e();
                while ((long)j > l) 
                {
label0:
                    {
                        Iterator iterator = i.iterator();
                        aa aa1;
                        do
                        {
                            if (!iterator.hasNext())
                            {
                                break label0;
                            }
                            aa1 = (aa)iterator.next();
                        } while (aa1.h().a() <= 0);
                        if (!a(aa1, aa1.i(), com.google.android.m4b.maps.z.k.e))
                        {
                            throw new AssertionError();
                        }
                    }
                }
            }
            return;
            throw new AssertionError();
        }

        private void g()
        {
            AtomicReferenceArray atomicreferencearray;
            AtomicReferenceArray atomicreferencearray1;
            int i1;
            int k1;
            int i2;
            int j2;
            atomicreferencearray = d;
            i2 = atomicreferencearray.length();
            if (i2 >= 0x40000000)
            {
                return;
            }
            i1 = b;
            atomicreferencearray1 = a(i2 << 1);
            k = (atomicreferencearray1.length() * 3) / 4;
            j2 = atomicreferencearray1.length() - 1;
            k1 = 0;
_L2:
            aa aa1;
            aa aa2;
            int j1;
            if (k1 >= i2)
            {
                break MISSING_BLOCK_LABEL_257;
            }
            aa2 = (aa)atomicreferencearray.get(k1);
            if (aa2 != null)
            {
                aa1 = aa2.j();
                j1 = aa2.i() & j2;
                if (aa1 != null)
                {
                    break; /* Loop/switch isn't completed */
                }
                atomicreferencearray1.set(j1, aa2);
            }
_L4:
            k1++;
            if (true) goto _L2; else goto _L1
_L1:
            aa aa4;
            aa4 = aa2;
            for (; aa1 != null; aa1 = aa1.j())
            {
                int l1 = aa1.i() & j2;
                if (l1 != j1)
                {
                    aa4 = aa1;
                    j1 = l1;
                }
            }

            atomicreferencearray1.set(j1, aa4);
            aa1 = aa2;
            j1 = i1;
_L5:
            i1 = j1;
            if (aa1 == aa4) goto _L4; else goto _L3
_L3:
            i1 = aa1.i() & j2;
            aa aa3 = a(aa1, (aa)atomicreferencearray1.get(i1));
            if (aa3 != null)
            {
                atomicreferencearray1.set(i1, aa3);
                i1 = j1;
            } else
            {
                a(aa1);
                i1 = j1 - 1;
            }
            aa1 = aa1.j();
            j1 = i1;
              goto _L5
              goto _L4
            d = atomicreferencearray1;
            b = i1;
            return;
        }

        final Object a(aa aa1, long l1)
        {
            if (aa1.g() == null)
            {
                c();
                return null;
            }
            Object obj = aa1.h().get();
            if (obj == null)
            {
                c();
                return null;
            }
            if (a.a(aa1, l1))
            {
                a(l1);
                return null;
            } else
            {
                return obj;
            }
        }

        final Object a(Object obj, int i1)
        {
            long l1;
            if (b == 0)
            {
                break MISSING_BLOCK_LABEL_94;
            }
            l1 = a.p.a();
            obj = a(obj, i1, l1);
            if (obj == null)
            {
                a();
                return null;
            }
            Object obj1 = ((aa) (obj)).h().get();
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_90;
            }
            b(((aa) (obj)), l1);
            obj = a(((aa) (obj)), ((aa) (obj)).g(), i1, obj1, l1, a.r);
            a();
            return obj;
            c();
            a();
            return null;
            obj;
            a();
            throw obj;
        }

        final Object a(Object obj, int i1, com.google.android.m4b.maps.z.d d1)
        {
            com.google.android.m4b.maps.y.j.a(obj);
            com.google.android.m4b.maps.y.j.a(d1);
            aa aa1;
            if (b == 0)
            {
                break MISSING_BLOCK_LABEL_129;
            }
            aa1 = e(obj, i1);
            if (aa1 == null)
            {
                break MISSING_BLOCK_LABEL_129;
            }
            Object obj1;
            long l1;
            l1 = a.p.a();
            obj1 = a(aa1, l1);
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_94;
            }
            b(aa1, l1);
            n.a();
            obj = a(aa1, obj, i1, obj1, l1, d1);
            a();
            return obj;
            ai ai1 = aa1.h();
            if (!ai1.c())
            {
                break MISSING_BLOCK_LABEL_129;
            }
            obj = a(aa1, obj, ai1);
            a();
            return obj;
            obj = b(obj, i1, d1);
            a();
            return obj;
            obj;
            d1 = ((ExecutionException) (obj)).getCause();
            if (d1 instanceof Error)
            {
                throw new com.google.android.m4b.maps.aj.c((Error)d1);
            }
            break MISSING_BLOCK_LABEL_175;
            obj;
            a();
            throw obj;
            if (d1 instanceof RuntimeException)
            {
                throw new com.google.android.m4b.maps.aj.k(d1);
            } else
            {
                throw obj;
            }
        }

        final Object a(Object obj, int i1, z z1, com.google.android.m4b.maps.aj.f f1)
        {
            com.google.android.m4b.maps.aj.f f2 = null;
            f1 = ((com.google.android.m4b.maps.aj.f) (com.google.android.m4b.maps.aj.l.a(f1)));
            if (f1 != null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            f2 = f1;
            throw new d.a((new StringBuilder("CacheLoader returned null for key ")).append(obj).append(".").toString());
            f1;
            if (f2 == null)
            {
                n.b(z1.f());
                a(obj, i1, z1);
            }
            throw f1;
            f2 = f1;
            n.a(z1.f());
            f2 = f1;
            a(obj, i1, z1, f1);
            if (f1 == null)
            {
                n.b(z1.f());
                a(obj, i1, z1);
            }
            return f1;
        }

        final Object a(Object obj, int i1, Object obj1)
        {
            lock();
            aa aa2;
            AtomicReferenceArray atomicreferencearray;
            int j1;
            long l1;
            l1 = a.p.a();
            c(l1);
            atomicreferencearray = d;
            j1 = i1 & atomicreferencearray.length() - 1;
            aa2 = (aa)atomicreferencearray.get(j1);
            aa aa1 = aa2;
_L2:
            if (aa1 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj2 = aa1.g();
            if (aa1.i() != i1 || obj2 == null)
            {
                break MISSING_BLOCK_LABEL_239;
            }
            ai ai1;
            Object obj3;
            if (!a.e.a(obj, obj2))
            {
                break MISSING_BLOCK_LABEL_239;
            }
            ai1 = aa1.h();
            obj3 = ai1.get();
            if (obj3 != null)
            {
                break MISSING_BLOCK_LABEL_195;
            }
            if (ai1.d())
            {
                i1 = b;
                c = c + 1;
                obj = a(aa2, aa1, obj2, ai1, com.google.android.m4b.maps.z.k.c);
                i1 = b;
                atomicreferencearray.set(j1, obj);
                b = i1 - 1;
            }
            unlock();
            b();
            return null;
            c = c + 1;
            a(obj, ai1, com.google.android.m4b.maps.z.k.b);
            a(aa1, obj1, l1);
            f();
            unlock();
            b();
            return obj3;
            aa1 = aa1.j();
            if (true) goto _L2; else goto _L1
_L1:
            unlock();
            b();
            return null;
            obj;
            unlock();
            b();
            throw obj;
        }

        final Object a(Object obj, int i1, Object obj1, boolean flag)
        {
            lock();
            Object obj3;
            Object obj4;
            int k1;
            long l1;
            l1 = a.p.a();
            c(l1);
            if (b + 1 > k)
            {
                g();
                int j1 = b;
            }
            obj4 = d;
            k1 = i1 & ((AtomicReferenceArray) (obj4)).length() - 1;
            obj3 = (aa)((AtomicReferenceArray) (obj4)).get(k1);
            Object obj2 = obj3;
_L2:
            if (obj2 == null)
            {
                break MISSING_BLOCK_LABEL_309;
            }
            Object obj5 = ((aa) (obj2)).g();
            if (((aa) (obj2)).i() != i1 || obj5 == null)
            {
                break MISSING_BLOCK_LABEL_297;
            }
            if (!a.e.a(obj, obj5))
            {
                break MISSING_BLOCK_LABEL_297;
            }
            obj3 = ((aa) (obj2)).h();
            obj4 = ((ai) (obj3)).get();
            if (obj4 != null)
            {
                break MISSING_BLOCK_LABEL_229;
            }
            c = c + 1;
            if (!((ai) (obj3)).d())
            {
                break MISSING_BLOCK_LABEL_210;
            }
            a(obj, ((ai) (obj3)), com.google.android.m4b.maps.z.k.c);
            a(((aa) (obj2)), obj1, l1);
            i1 = b;
_L1:
            b = i1;
            f();
            unlock();
            b();
            return null;
            a(((aa) (obj2)), obj1, l1);
            i1 = b + 1;
              goto _L1
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_253;
            }
            c(((aa) (obj2)), l1);
            unlock();
            b();
            return obj4;
            c = c + 1;
            a(obj, ((ai) (obj3)), com.google.android.m4b.maps.z.k.b);
            a(((aa) (obj2)), obj1, l1);
            f();
            unlock();
            b();
            return obj4;
            obj2 = ((aa) (obj2)).j();
              goto _L2
            c = c + 1;
            obj = a(obj, i1, ((aa) (obj3)));
            a(((aa) (obj)), obj1, l1);
            ((AtomicReferenceArray) (obj4)).set(k1, obj);
            b = b + 1;
            f();
            unlock();
            b();
            return null;
            obj;
            unlock();
            b();
            throw obj;
        }

        final void a()
        {
            if ((g.incrementAndGet() & 0x3f) == 0)
            {
                c(a.p.a());
                b();
            }
        }

        final void a(aa aa1, com.google.android.m4b.maps.z.k k1)
        {
            Object obj = aa1.g();
            aa1.i();
            a(obj, aa1.h(), k1);
        }

        final boolean a(Object obj, int i1, Object obj1, Object obj2)
        {
            lock();
            aa aa2;
            AtomicReferenceArray atomicreferencearray;
            int j1;
            long l1;
            l1 = a.p.a();
            c(l1);
            atomicreferencearray = d;
            j1 = i1 & atomicreferencearray.length() - 1;
            aa2 = (aa)atomicreferencearray.get(j1);
            aa aa1 = aa2;
_L2:
            if (aa1 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj3 = aa1.g();
            if (aa1.i() != i1 || obj3 == null)
            {
                break MISSING_BLOCK_LABEL_273;
            }
            ai ai1;
            Object obj4;
            if (!a.e.a(obj, obj3))
            {
                break MISSING_BLOCK_LABEL_273;
            }
            ai1 = aa1.h();
            obj4 = ai1.get();
            if (obj4 != null)
            {
                break MISSING_BLOCK_LABEL_195;
            }
            if (ai1.d())
            {
                i1 = b;
                c = c + 1;
                obj = a(aa2, aa1, obj3, ai1, com.google.android.m4b.maps.z.k.c);
                i1 = b;
                atomicreferencearray.set(j1, obj);
                b = i1 - 1;
            }
            unlock();
            b();
            return false;
            if (!a.f.a(obj1, obj4))
            {
                break MISSING_BLOCK_LABEL_255;
            }
            c = c + 1;
            a(obj, ai1, com.google.android.m4b.maps.z.k.b);
            a(aa1, obj2, l1);
            f();
            unlock();
            b();
            return true;
            c(aa1, l1);
            unlock();
            b();
            return false;
            aa1 = aa1.j();
            if (true) goto _L2; else goto _L1
_L1:
            unlock();
            b();
            return false;
            obj;
            unlock();
            b();
            throw obj;
        }

        final void b()
        {
            if (!isHeldByCurrentThread())
            {
                for (com.google.android.m4b.maps.z.g g1 = a; (com.google.android.m4b.maps.z.m)g1.n.poll() != null;) { }
            }
        }

        final boolean b(Object obj, int i1)
        {
            boolean flag = false;
            if (b == 0)
            {
                break MISSING_BLOCK_LABEL_60;
            }
            obj = a(obj, i1, a.p.a());
            if (obj == null)
            {
                a();
                return false;
            }
            obj = ((aa) (obj)).h().get();
            if (obj != null)
            {
                flag = true;
            }
            a();
            return flag;
            a();
            return false;
            obj;
            a();
            throw obj;
        }

        final boolean b(Object obj, int i1, Object obj1)
        {
            lock();
            aa aa2;
            AtomicReferenceArray atomicreferencearray;
            int j1;
            c(a.p.a());
            j1 = b;
            atomicreferencearray = d;
            j1 = i1 & atomicreferencearray.length() - 1;
            aa2 = (aa)atomicreferencearray.get(j1);
            aa aa1 = aa2;
_L5:
            if (aa1 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj2 = aa1.g();
            if (aa1.i() != i1 || obj2 == null)
            {
                break MISSING_BLOCK_LABEL_243;
            }
            ai ai1;
            if (!a.e.a(obj, obj2))
            {
                break MISSING_BLOCK_LABEL_243;
            }
            ai1 = aa1.h();
            obj = ai1.get();
            if (!a.f.a(obj1, obj)) goto _L2; else goto _L1
_L1:
            obj = com.google.android.m4b.maps.z.k.a;
_L3:
            c = c + 1;
            obj1 = a(aa2, aa1, obj2, ai1, ((com.google.android.m4b.maps.z.k) (obj)));
            i1 = b;
            atomicreferencearray.set(j1, obj1);
            b = i1 - 1;
            obj1 = com.google.android.m4b.maps.z.k.a;
            boolean flag;
            if (obj == obj1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            unlock();
            b();
            return flag;
_L2:
            if (obj != null)
            {
                break MISSING_BLOCK_LABEL_227;
            }
            if (!ai1.d())
            {
                break MISSING_BLOCK_LABEL_227;
            }
            obj = com.google.android.m4b.maps.z.k.c;
              goto _L3
            unlock();
            b();
            return false;
            aa1 = aa1.j();
            if (true) goto _L5; else goto _L4
_L4:
            unlock();
            b();
            return false;
            obj;
            unlock();
            b();
            throw obj;
        }

        final Object c(Object obj, int i1)
        {
            lock();
            aa aa2;
            AtomicReferenceArray atomicreferencearray;
            int j1;
            c(a.p.a());
            j1 = b;
            atomicreferencearray = d;
            j1 = i1 & atomicreferencearray.length() - 1;
            aa2 = (aa)atomicreferencearray.get(j1);
            aa aa1 = aa2;
_L3:
            if (aa1 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj1 = aa1.g();
            if (aa1.i() != i1 || obj1 == null)
            {
                break MISSING_BLOCK_LABEL_206;
            }
            Object obj2;
            ai ai1;
            if (!a.e.a(obj, obj1))
            {
                break MISSING_BLOCK_LABEL_206;
            }
            ai1 = aa1.h();
            obj2 = ai1.get();
            if (obj2 == null)
            {
                break MISSING_BLOCK_LABEL_179;
            }
            obj = com.google.android.m4b.maps.z.k.a;
_L1:
            c = c + 1;
            obj = a(aa2, aa1, obj1, ai1, ((com.google.android.m4b.maps.z.k) (obj)));
            i1 = b;
            atomicreferencearray.set(j1, obj);
            b = i1 - 1;
            unlock();
            b();
            return obj2;
label0:
            {
                if (!ai1.d())
                {
                    break label0;
                }
                obj = com.google.android.m4b.maps.z.k.c;
            }
              goto _L1
            unlock();
            b();
            return null;
            aa1 = aa1.j();
            if (true) goto _L3; else goto _L2
_L2:
            unlock();
            b();
            return null;
            obj;
            unlock();
            b();
            throw obj;
        }

        q(com.google.android.m4b.maps.z.g g1, int i1, long l1, a.b b1)
        {
            Object obj = null;
            super();
            a = g1;
            l = l1;
            n = (a.b)com.google.android.m4b.maps.y.j.a(b1);
            b1 = a(i1);
            k = (b1.length() * 3) / 4;
            if (!a.b() && (long)k == l)
            {
                k = k + 1;
            }
            d = b1;
            if (g1.h())
            {
                b1 = new ReferenceQueue();
            } else
            {
                b1 = null;
            }
            e = b1;
            b1 = obj;
            if (g1.i())
            {
                b1 = new ReferenceQueue();
            }
            f = b1;
            if (g1.f())
            {
                b1 = new ConcurrentLinkedQueue();
            } else
            {
                b1 = com.google.android.m4b.maps.z.g.l();
            }
            m = b1;
            if (g1.c())
            {
                b1 = new k();
            } else
            {
                b1 = com.google.android.m4b.maps.z.g.l();
            }
            h = b1;
            if (g1.f())
            {
                g1 = new t();
            } else
            {
                g1 = com.google.android.m4b.maps.z.g.l();
            }
            i = g1;
        }
    }

    static class r
        implements aa
    {

        public long a()
        {
            throw new UnsupportedOperationException();
        }

        public void a(long l1)
        {
            throw new UnsupportedOperationException();
        }

        public void a(aa aa1)
        {
            throw new UnsupportedOperationException();
        }

        public void a(ai ai1)
        {
            throw new UnsupportedOperationException();
        }

        public aa b()
        {
            throw new UnsupportedOperationException();
        }

        public void b(long l1)
        {
            throw new UnsupportedOperationException();
        }

        public void b(aa aa1)
        {
            throw new UnsupportedOperationException();
        }

        public aa c()
        {
            throw new UnsupportedOperationException();
        }

        public void c(aa aa1)
        {
            throw new UnsupportedOperationException();
        }

        public long d()
        {
            throw new UnsupportedOperationException();
        }

        public void d(aa aa1)
        {
            throw new UnsupportedOperationException();
        }

        public aa e()
        {
            throw new UnsupportedOperationException();
        }

        public aa f()
        {
            throw new UnsupportedOperationException();
        }

        public Object g()
        {
            throw new UnsupportedOperationException();
        }

        public ai h()
        {
            throw new UnsupportedOperationException();
        }

        public int i()
        {
            throw new UnsupportedOperationException();
        }

        public aa j()
        {
            throw new UnsupportedOperationException();
        }

        r()
        {
        }
    }

    public static abstract class s extends Enum
    {

        public static final s a;
        public static final s b;
        private static s c;
        private static final s d[];

        public static s valueOf(String s1)
        {
            return (s)Enum.valueOf(com/google/android/m4b/maps/z/g$s, s1);
        }

        public static s[] values()
        {
            return (s[])d.clone();
        }

        abstract com.google.android.m4b.maps.y.e a();

        abstract ai a(q q1, aa aa1, Object obj);

        static 
        {
            a = new s("STRONG") {

                final com.google.android.m4b.maps.y.e a()
                {
                    return com.google.android.m4b.maps.y.e.a.a;
                }

                final ai a(q q1, aa aa1, Object obj)
                {
                    return new af(obj);
                }

            };
            c = new s("SOFT") {

                final com.google.android.m4b.maps.y.e a()
                {
                    return com.google.android.m4b.maps.y.e.b.a;
                }

                final ai a(q q1, aa aa1, Object obj)
                {
                    return new ab(q1.f, obj, aa1);
                }

            };
            b = new s("WEAK") {

                final com.google.android.m4b.maps.y.e a()
                {
                    return com.google.android.m4b.maps.y.e.b.a;
                }

                final ai a(q q1, aa aa1, Object obj)
                {
                    return new g(q1.f, obj, aa1);
                }

            };
            d = (new s[] {
                a, c, b
            });
        }

        private s(String s1, int i1)
        {
            super(s1, i1);
        }

        s(String s1, int i1, byte byte0)
        {
            this(s1, i1);
        }
    }

    static final class t extends AbstractQueue
    {

        final aa a = new _cls1(this);

        private aa a()
        {
            aa aa2 = a.b();
            aa aa1 = aa2;
            if (aa2 == a)
            {
                aa1 = null;
            }
            return aa1;
        }

        public final void clear()
        {
            aa aa2;
            for (aa aa1 = a.b(); aa1 != a; aa1 = aa2)
            {
                aa2 = aa1.b();
                com.google.android.m4b.maps.z.g.a(aa1);
            }

            a.a(a);
            a.b(a);
        }

        public final boolean contains(Object obj)
        {
            return ((aa)obj).b() != com.google.android.m4b.maps.z.o.a;
        }

        public final boolean isEmpty()
        {
            return a.b() == a;
        }

        public final Iterator iterator()
        {
            return new ay(this, a()) {

                private t a;

                protected final Object a(Object obj)
                {
                    aa aa1 = ((aa)obj).b();
                    obj = aa1;
                    if (aa1 == a.a)
                    {
                        obj = null;
                    }
                    return obj;
                }

            
            {
                a = t1;
                super(aa1);
            }
            };
        }

        public final boolean offer(Object obj)
        {
            obj = (aa)obj;
            com.google.android.m4b.maps.z.g.a(((aa) (obj)).c(), ((aa) (obj)).b());
            com.google.android.m4b.maps.z.g.a(a.c(), ((aa) (obj)));
            com.google.android.m4b.maps.z.g.a(((aa) (obj)), a);
            return true;
        }

        public final Object peek()
        {
            return a();
        }

        public final Object poll()
        {
            aa aa1 = a.b();
            if (aa1 == a)
            {
                return null;
            } else
            {
                remove(aa1);
                return aa1;
            }
        }

        public final boolean remove(Object obj)
        {
            obj = (aa)obj;
            aa aa1 = ((aa) (obj)).c();
            aa aa2 = ((aa) (obj)).b();
            com.google.android.m4b.maps.z.g.a(aa1, aa2);
            com.google.android.m4b.maps.z.g.a(((aa) (obj)));
            return aa2 != com.google.android.m4b.maps.z.o.a;
        }

        public final int size()
        {
            int i1 = 0;
            for (aa aa1 = a.b(); aa1 != a; aa1 = aa1.b())
            {
                i1++;
            }

            return i1;
        }

        t()
        {
        }
    }

    final class u extends w
    {

        private com.google.android.m4b.maps.z.g a;

        public final Object next()
        {
            return a();
        }

        u()
        {
            a = com.google.android.m4b.maps.z.g.this;
            super();
        }
    }

    final class v extends a
    {

        private com.google.android.m4b.maps.z.g b;

        public final boolean contains(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                Object obj1 = ((java.util.Map.Entry) (obj)).getKey();
                if (obj1 != null)
                {
                    obj1 = b.get(obj1);
                    if (obj1 != null && b.f.a(((java.util.Map.Entry) (obj)).getValue(), obj1))
                    {
                        return true;
                    }
                }
            }
            return false;
        }

        public final Iterator iterator()
        {
            return b. new u();
        }

        public final boolean remove(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                Object obj1 = ((java.util.Map.Entry) (obj)).getKey();
                if (obj1 != null && b.remove(obj1, ((java.util.Map.Entry) (obj)).getValue()))
                {
                    return true;
                }
            }
            return false;
        }

        v(ConcurrentMap concurrentmap)
        {
            b = com.google.android.m4b.maps.z.g.this;
            super(concurrentmap);
        }
    }

    abstract class w
        implements Iterator
    {

        private int a;
        private int b;
        private q c;
        private AtomicReferenceArray d;
        private aa e;
        private p f;
        private p g;
        private com.google.android.m4b.maps.z.g h;

        private boolean a(aa aa1)
        {
            Object obj1 = null;
            Object obj3;
            com.google.android.m4b.maps.z.g g1;
            long l1;
            l1 = h.p.a();
            obj3 = aa1.g();
            g1 = h;
            if (aa1.g() != null) goto _L2; else goto _L1
_L1:
            Object obj = obj1;
_L4:
            if (obj == null)
            {
                break; /* Loop/switch isn't completed */
            }
            f = h. new p(obj3, obj);
            c.a();
            return true;
_L2:
            Object obj2 = aa1.h().get();
            obj = obj1;
            if (obj2 == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            boolean flag = g1.a(aa1, l1);
            obj = obj1;
            if (!flag)
            {
                obj = obj2;
            }
            if (true) goto _L4; else goto _L3
_L3:
            c.a();
            return false;
            aa1;
            c.a();
            throw aa1;
        }

        private void b()
        {
            f = null;
            break MISSING_BLOCK_LABEL_5;
            if (!c() && !d())
            {
                while (a >= 0) 
                {
                    q aq[] = h.c;
                    int i1 = a;
                    a = i1 - 1;
                    c = aq[i1];
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
                for (e = e.j(); e != null; e = e.j())
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
                obj = (aa)((AtomicReferenceArray) (obj)).get(i1);
                e = ((aa) (obj));
                if (obj != null && (a(e) || c()))
                {
                    return true;
                }
            }
            return false;
        }

        final p a()
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
            com.google.android.m4b.maps.y.j.b(flag);
            h.remove(g.getKey());
            g = null;
        }

        w()
        {
            h = com.google.android.m4b.maps.z.g.this;
            super();
            a = com.google.android.m4b.maps.z.g.this.c.length - 1;
            b = -1;
            b();
        }
    }

    final class x extends w
    {

        private com.google.android.m4b.maps.z.g a;

        public final Object next()
        {
            return a().getKey();
        }

        x()
        {
            a = com.google.android.m4b.maps.z.g.this;
            super();
        }
    }

    final class y extends a
    {

        private com.google.android.m4b.maps.z.g b;

        public final boolean contains(Object obj)
        {
            return a.containsKey(obj);
        }

        public final Iterator iterator()
        {
            return b. new x();
        }

        public final boolean remove(Object obj)
        {
            return a.remove(obj) != null;
        }

        y(ConcurrentMap concurrentmap)
        {
            b = com.google.android.m4b.maps.z.g.this;
            super(concurrentmap);
        }
    }

    static final class z
        implements ai
    {

        volatile ai a;
        private com.google.android.m4b.maps.aj.j b;
        private com.google.android.m4b.maps.y.o c;

        public final int a()
        {
            return a.a();
        }

        public final com.google.android.m4b.maps.aj.f a(Object obj, com.google.android.m4b.maps.z.d d1)
        {
            Object obj1 = c;
            boolean flag;
            if (!((com.google.android.m4b.maps.y.o) (obj1)).b)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.m4b.maps.y.j.b(flag, "This stopwatch is already running.");
            obj1.b = true;
            obj1.c = ((com.google.android.m4b.maps.y.o) (obj1)).a.a();
            obj1 = a.get();
            if (obj1 != null)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            obj = d1.a(obj);
            if (b(obj))
            {
                return b;
            } else
            {
                return com.google.android.m4b.maps.aj.e.a(obj);
            }
            com.google.android.m4b.maps.y.j.a(obj);
            com.google.android.m4b.maps.y.j.a(obj1);
            obj = com.google.android.m4b.maps.aj.e.a(com.google.android.m4b.maps.aj.e.a(d1.a(obj)), new com.google.android.m4b.maps.y.f(this) {

                private z a;

                public final Object a(Object obj)
                {
                    a.b(obj);
                    return obj;
                }

            
            {
                a = z1;
                super();
            }
            });
            return ((com.google.android.m4b.maps.aj.f) (obj));
            obj;
            if (obj instanceof InterruptedException)
            {
                Thread.currentThread().interrupt();
            }
            if (a(((Throwable) (obj))))
            {
                return b;
            } else
            {
                return com.google.android.m4b.maps.aj.e.a(((Throwable) (obj)));
            }
        }

        public final ai a(ReferenceQueue referencequeue, Object obj, aa aa1)
        {
            return this;
        }

        public final void a(Object obj)
        {
            if (obj != null)
            {
                b(obj);
                return;
            } else
            {
                a = com.google.android.m4b.maps.z.g.j();
                return;
            }
        }

        public final boolean a(Throwable throwable)
        {
            return b.a(throwable);
        }

        public final aa b()
        {
            return null;
        }

        public final boolean b(Object obj)
        {
            return b.a(obj);
        }

        public final boolean c()
        {
            return true;
        }

        public final boolean d()
        {
            return a.d();
        }

        public final Object e()
        {
            return com.google.android.m4b.maps.aj.l.a(b);
        }

        public final long f()
        {
            com.google.android.m4b.maps.y.o o1 = c;
            return TimeUnit.NANOSECONDS.convert(o1.a(), TimeUnit.NANOSECONDS);
        }

        public final Object get()
        {
            return a.get();
        }

        public z()
        {
            this(com.google.android.m4b.maps.z.g.j());
        }

        public z(ai ai1)
        {
            b = com.google.android.m4b.maps.aj.j.a();
            c = new com.google.android.m4b.maps.y.o();
            a = ai1;
        }
    }


    static final Logger a = Logger.getLogger(com/google/android/m4b/maps/z/g.getName());
    static final com.google.android.m4b.maps.aj.h b = com.google.android.m4b.maps.aj.i.a();
    static final ai s = new ai() {

        public final int a()
        {
            return 0;
        }

        public final ai a(ReferenceQueue referencequeue, Object obj, aa aa1)
        {
            return this;
        }

        public final void a(Object obj)
        {
        }

        public final aa b()
        {
            return null;
        }

        public final boolean c()
        {
            return false;
        }

        public final boolean d()
        {
            return false;
        }

        public final Object e()
        {
            return null;
        }

        public final Object get()
        {
            return null;
        }

    };
    static final Queue t = new AbstractQueue() {

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
    final q c[];
    final int d;
    final com.google.android.m4b.maps.y.e e;
    final com.google.android.m4b.maps.y.e f;
    final s g;
    final s h;
    final long i;
    final com.google.android.m4b.maps.z.o j;
    final long k;
    final long l;
    final long m;
    final Queue n;
    final com.google.android.m4b.maps.z.l o;
    final com.google.android.m4b.maps.y.s p;
    final d q;
    final com.google.android.m4b.maps.z.d r;
    private int u;
    private int v;
    private a.b w;
    private Set x;
    private Collection y;
    private Set z;

    com.google.android.m4b.maps.z.g(com.google.android.m4b.maps.z.c c1, com.google.android.m4b.maps.z.d d1)
    {
        boolean flag2 = true;
        long l4 = 0L;
        boolean flag1 = false;
        boolean flag = false;
        super();
        Object obj;
        int i1;
        int k1;
        int l1;
        long l2;
        boolean flag3;
        boolean flag4;
        if (c1.d == -1)
        {
            i1 = 4;
        } else
        {
            i1 = c1.d;
        }
        d = Math.min(i1, 0x10000);
        g = c1.b();
        h = c1.c();
        e = (com.google.android.m4b.maps.y.e)com.google.android.m4b.maps.y.h.b(c1.l, c1.b().a());
        f = (com.google.android.m4b.maps.y.e)com.google.android.m4b.maps.y.h.b(c1.m, c1.c().a());
        if (c1.i == 0L || c1.j == 0L)
        {
            l2 = 0L;
        } else
        if (c1.g == null)
        {
            l2 = c1.e;
        } else
        {
            l2 = c1.f;
        }
        i = l2;
        j = (com.google.android.m4b.maps.z.o)com.google.android.m4b.maps.y.h.b(c1.g, com.google.android.m4b.maps.z.c.b.a);
        if (c1.j == -1L)
        {
            l2 = 0L;
        } else
        {
            l2 = c1.j;
        }
        k = l2;
        if (c1.i == -1L)
        {
            l2 = 0L;
        } else
        {
            l2 = c1.i;
        }
        l = l2;
        if (c1.k == -1L)
        {
            l2 = l4;
        } else
        {
            l2 = c1.k;
        }
        m = l2;
        o = (com.google.android.m4b.maps.z.l)com.google.android.m4b.maps.y.h.b(c1.n, com.google.android.m4b.maps.z.c.a.a);
        if (o == com.google.android.m4b.maps.z.c.a.a)
        {
            obj = t;
        } else
        {
            obj = new ConcurrentLinkedQueue();
        }
        n = ((Queue) (obj));
        if (g() || d())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (c1.o != null)
        {
            obj = c1.o;
        } else
        if (i1 != 0)
        {
            obj = com.google.android.m4b.maps.y.s.b();
        } else
        {
            obj = com.google.android.m4b.maps.z.c.a;
        }
        p = ((com.google.android.m4b.maps.y.s) (obj));
        obj = g;
        if (f() || d())
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (c() || g())
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        q = com.google.android.m4b.maps.z.d.a(((s) (obj)), flag3, flag4);
        w = (a.b)c1.p.a();
        r = d1;
        if (c1.c == -1)
        {
            i1 = 16;
        } else
        {
            i1 = c1.c;
        }
        i1 = Math.min(i1, 0x40000000);
        k1 = i1;
        if (a())
        {
            k1 = i1;
            if (!b())
            {
                k1 = Math.min(i1, (int)i);
            }
        }
        i1 = 1;
        l1 = 0;
        for (; i1 < d && (!a() || (long)(i1 * 20) <= i); i1 <<= 1)
        {
            l1++;
        }

        v = 32 - l1;
        u = i1 - 1;
        c = new q[i1];
        l1 = k1 / i1;
        if (l1 * i1 < k1)
        {
            l1++;
            k1 = ((flag2) ? 1 : 0);
        } else
        {
            k1 = ((flag2) ? 1 : 0);
        }
        for (; k1 < l1; k1 <<= 1) { }
        l1 = ((flag1) ? 1 : 0);
        if (a())
        {
            long l3 = i / (long)i1;
            long l5 = i;
            long l6 = i1;
            l3++;
            for (int j1 = ((flag) ? 1 : 0); j1 < c.length; j1++)
            {
                if ((long)j1 == l5 % l6)
                {
                    l3--;
                }
                c[j1] = a(k1, l3, (a.b)c1.p.a());
            }

        } else
        {
            for (; l1 < c.length; l1++)
            {
                c[l1] = a(k1, -1L, (a.b)c1.p.a());
            }

        }
    }

    private q a(int i1, long l1, a.b b1)
    {
        return new q(this, i1, l1, b1);
    }

    static void a(aa aa1)
    {
        o o1 = com.google.android.m4b.maps.z.o.a;
        aa1.a(o1);
        aa1.b(o1);
    }

    static void a(aa aa1, aa aa2)
    {
        aa1.a(aa2);
        aa2.b(aa1);
    }

    static void b(aa aa1)
    {
        o o1 = com.google.android.m4b.maps.z.o.a;
        aa1.c(o1);
        aa1.d(o1);
    }

    static void b(aa aa1, aa aa2)
    {
        aa1.c(aa2);
        aa2.d(aa1);
    }

    static ai j()
    {
        return s;
    }

    static aa k()
    {
        return com.google.android.m4b.maps.z.o.a;
    }

    static Queue l()
    {
        return t;
    }

    final int a(Object obj)
    {
        int i1 = e.a(obj);
        i1 += i1 << 15 ^ 0xffffcd7d;
        i1 ^= i1 >>> 10;
        i1 += i1 << 3;
        i1 ^= i1 >>> 6;
        i1 += (i1 << 2) + (i1 << 14);
        return i1 ^ i1 >>> 16;
    }

    final q a(int i1)
    {
        return c[i1 >>> v & u];
    }

    final boolean a()
    {
        return i >= 0L;
    }

    final boolean a(aa aa1, long l1)
    {
        com.google.android.m4b.maps.y.j.a(aa1);
        while (d() && l1 - aa1.a() >= k || c() && l1 - aa1.d() >= l) 
        {
            return true;
        }
        return false;
    }

    final boolean b()
    {
        return j != com.google.android.m4b.maps.z.c.b.a;
    }

    final boolean c()
    {
        return l > 0L;
    }

    public void clear()
    {
        q aq[];
        int i1;
        int k1;
        aq = c;
        k1 = aq.length;
        i1 = 0;
_L8:
        if (i1 >= k1) goto _L2; else goto _L1
_L1:
        q q1 = aq[i1];
        if (q1.b == 0) goto _L4; else goto _L3
_L3:
        q1.lock();
        AtomicReferenceArray atomicreferencearray = q1.d;
        int j1 = 0;
_L9:
        aa aa1;
        if (j1 >= atomicreferencearray.length())
        {
            break MISSING_BLOCK_LABEL_247;
        }
        aa1 = (aa)atomicreferencearray.get(j1);
_L6:
        if (aa1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (aa1.h().d())
        {
            q1.a(aa1, com.google.android.m4b.maps.z.k.a);
        }
        aa1 = aa1.j();
        if (true) goto _L6; else goto _L5
_L7:
        Exception exception;
        for (; j1 >= atomicreferencearray.length(); j1 = 0)
        {
            break MISSING_BLOCK_LABEL_128;
        }

        atomicreferencearray.set(j1, null);
        j1++;
          goto _L7
        if (q1.a.h())
        {
            while (q1.e.poll() != null) ;
        }
        if (q1.a.i())
        {
            while (q1.f.poll() != null) ;
        }
        q1.h.clear();
        q1.i.clear();
        q1.g.set(0);
        q1.c = q1.c + 1;
        q1.b = 0;
        q1.unlock();
        q1.b();
_L4:
        i1++;
          goto _L8
        exception;
        q1.unlock();
        q1.b();
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
        if (obj == null)
        {
            return false;
        }
        long l4 = p.a();
        q aq[] = c;
        int i1 = 0;
        long l3 = -1L;
        do
        {
            if (i1 >= 3)
            {
                break;
            }
            int i2 = aq.length;
            long l2 = 0L;
            for (int j1 = 0; j1 < i2; j1++)
            {
                q q1 = aq[j1];
                int k1 = q1.b;
                AtomicReferenceArray atomicreferencearray = q1.d;
                for (int l1 = 0; l1 < atomicreferencearray.length(); l1++)
                {
                    for (aa aa1 = (aa)atomicreferencearray.get(l1); aa1 != null; aa1 = aa1.j())
                    {
                        Object obj1 = q1.a(aa1, l4);
                        if (obj1 != null && f.a(obj, obj1))
                        {
                            return true;
                        }
                    }

                }

                l2 += q1.c;
            }

            if (l2 == l3)
            {
                break;
            }
            i1++;
            l3 = l2;
        } while (true);
        return false;
    }

    final boolean d()
    {
        return k > 0L;
    }

    final boolean e()
    {
        return m > 0L;
    }

    public Set entrySet()
    {
        Set set = z;
        if (set != null)
        {
            return set;
        } else
        {
            v v1 = new v(this);
            z = v1;
            return v1;
        }
    }

    final boolean f()
    {
        return d() || a();
    }

    final boolean g()
    {
        return c() || e();
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

    final boolean h()
    {
        return g != com.google.android.m4b.maps.z.s.a;
    }

    final boolean i()
    {
        return h != com.google.android.m4b.maps.z.s.a;
    }

    public boolean isEmpty()
    {
        q aq[];
        int i1;
        long l1;
        aq = c;
        i1 = 0;
        l1 = 0L;
_L9:
        if (i1 >= aq.length) goto _L2; else goto _L1
_L1:
        if (aq[i1].b == 0) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        l1 += aq[i1].c;
        i1++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (l1 == 0L)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = 0;
_L6:
        if (i1 >= aq.length)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (aq[i1].b != 0) goto _L3; else goto _L5
_L5:
        l1 -= aq[i1].c;
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
        Set set = x;
        if (set != null)
        {
            return set;
        } else
        {
            y y1 = new y(this);
            x = y1;
            return y1;
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
        q aq[] = c;
        long l1 = 0L;
        for (int i1 = 0; i1 < aq.length; i1++)
        {
            l1 += aq[i1].b;
        }

        return com.google.android.m4b.maps.n.a.a(l1);
    }

    public Collection values()
    {
        Collection collection = y;
        if (collection != null)
        {
            return collection;
        } else
        {
            b b1 = new b(this);
            y = b1;
            return b1;
        }
    }


    // Unreferenced inner class com/google/android/m4b/maps/z/g$k$1

/* anonymous class */
    final class k._cls1 extends r
    {

        private aa a;
        private aa b;
        private k c;

        public final void b(long l1)
        {
        }

        public final void c(aa aa1)
        {
            a = aa1;
        }

        public final long d()
        {
            return 0x7fffffffffffffffL;
        }

        public final void d(aa aa1)
        {
            b = aa1;
        }

        public final aa e()
        {
            return a;
        }

        public final aa f()
        {
            return b;
        }

            
            {
                c = k1;
                super();
                a = this;
                b = this;
            }
    }


    // Unreferenced inner class com/google/android/m4b/maps/z/g$t$1

/* anonymous class */
    final class t._cls1 extends r
    {

        private aa a;
        private aa b;
        private t c;

        public final long a()
        {
            return 0x7fffffffffffffffL;
        }

        public final void a(long l1)
        {
        }

        public final void a(aa aa1)
        {
            a = aa1;
        }

        public final aa b()
        {
            return a;
        }

        public final void b(aa aa1)
        {
            b = aa1;
        }

        public final aa c()
        {
            return b;
        }

            
            {
                c = t1;
                super();
                a = this;
                b = this;
            }
    }

}
