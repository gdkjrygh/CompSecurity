// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.i;

import com.kik.g.p;
import java.util.List;
import kik.a.h.i;

public interface h
{
    public static final class a
    {

        private final String a;
        private final String b;
        private final String c;
        private final String d;
        private long e;

        public final String a()
        {
            return a;
        }

        public final void a(long l)
        {
            e = l;
        }

        public final String b()
        {
            return b;
        }

        public final String c()
        {
            return c;
        }

        public final String d()
        {
            return d;
        }

        public final long e()
        {
            return e;
        }

        public a(String s, String s1, String s2, long l)
        {
            this(i.a(), s, s1, s2, l);
        }

        public a(String s, String s1, String s2, String s3, long l)
        {
            a = s;
            b = s1;
            c = s2;
            d = s3;
            e = l;
        }
    }


    public abstract p a();

    public abstract p a(String s, String s1, String s2);

    public abstract p a(List list);

    public abstract p a(a a1);
}
