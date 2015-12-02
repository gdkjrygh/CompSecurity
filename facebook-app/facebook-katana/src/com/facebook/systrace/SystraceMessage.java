// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.systrace;


// Referenced classes of package com.facebook.systrace:
//            Systrace

public final class SystraceMessage
{

    private static final Builder a = new NoopBuilder((byte)0);
    private static final ThreadLocal b = new _cls1();
    private static final Flusher c = new BeginSectionFlusher((byte)0);
    private static final Flusher d = new EndSectionFlusher((byte)0);

    public SystraceMessage()
    {
    }

    public static Builder a(long l)
    {
        return a(l, d, "");
    }

    private static Builder a(long l, Flusher flusher, String s)
    {
        if (!Systrace.b(l))
        {
            return a;
        } else
        {
            return ((RealBuilder)b.get()).a(flusher, s);
        }
    }

    public static Builder a(long l, String s)
    {
        return a(l, c, s);
    }


    private class RealBuilder extends Builder
    {
        private class Builder
        {

            public abstract Builder a(String s, int i);

            public abstract Builder a(String s, Object obj);

            public abstract void a();

            public Builder()
            {
            }
        }


        Flusher a;
        StringBuilder b;
        char c;

        private void b()
        {
            b.append(c);
            c = ';';
        }

        public final Builder a(String s, int i)
        {
            b();
            b.append(s);
            b.append('=');
            b.append(i);
            return this;
        }

        public final Builder a(String s, Object obj)
        {
            b();
            b.append(s);
            b.append('=');
            b.append(obj);
            return this;
        }

        final RealBuilder a(Flusher flusher, String s)
        {
            a = flusher;
            b.delete(0, b.length());
            b.append(s);
            c = '|';
            return this;
        }

        public final void a()
        {
            a.a(b);
        }

        private RealBuilder()
        {
            b = new StringBuilder();
        }

        RealBuilder(byte byte0)
        {
            this();
        }

        private class Flusher
        {

            public abstract void a(StringBuilder stringbuilder);
        }

    }


    private class NoopBuilder extends Builder
    {

        public final Builder a(String s, int i)
        {
            return this;
        }

        public final Builder a(String s, Object obj)
        {
            return this;
        }

        public final void a()
        {
        }

        private NoopBuilder()
        {
        }

        NoopBuilder(byte byte0)
        {
            this();
        }
    }


    private class _cls1 extends ThreadLocal
    {

        private static RealBuilder a()
        {
            return new RealBuilder((byte)0);
        }

        protected final Object initialValue()
        {
            return a();
        }

        _cls1()
        {
        }
    }


    private class BeginSectionFlusher
        implements Flusher
    {

        public final void a(StringBuilder stringbuilder)
        {
            TraceDirect.a(stringbuilder);
        }

        private BeginSectionFlusher()
        {
        }

        BeginSectionFlusher(byte byte0)
        {
            this();
        }
    }


    private class EndSectionFlusher
        implements Flusher
    {

        public final void a(StringBuilder stringbuilder)
        {
            TraceDirect.b(stringbuilder);
        }

        private EndSectionFlusher()
        {
        }

        EndSectionFlusher(byte byte0)
        {
            this();
        }
    }

}
