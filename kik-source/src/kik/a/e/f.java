// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.e;

import com.kik.g.e;
import com.kik.g.p;
import java.util.concurrent.ExecutorService;
import kik.a.f.f.z;
import kik.a.f.i;
import kik.a.f.k;

// Referenced classes of package kik.a.e:
//            o

public interface f
{
    public static final class a extends Exception
    {

        public a(String s)
        {
            super(s);
        }
    }

    public static interface b
    {

        public abstract void a();

        public abstract void a(int i1);

        public abstract void a(long l1);
    }

    public static interface c
    {

        public abstract void a();

        public abstract void b();
    }


    public abstract e a();

    public abstract p a(z z);

    public abstract p a(z z, boolean flag);

    public abstract void a(String s, b b1, boolean flag);

    public abstract void a(ExecutorService executorservice, k k1, o o1);

    public abstract void a(c c1);

    public abstract void a(i i1);

    public abstract void a(kik.a.z z);

    public abstract boolean a(String s);

    public abstract e b();

    public abstract void b(i i1);

    public abstract e c();

    public abstract e d();

    public abstract e e();

    public abstract void f();

    public abstract long g();

    public abstract long h();

    public abstract String i();

    public abstract long j();

    public abstract boolean k();

    public abstract int l();

    public abstract boolean m();

    public abstract void n();

    public abstract void o();
}
