// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class VI extends VZ
{
    final class a
        implements Wc
    {

        private VI a;

        public final void a()
        {
            a.b = true;
        }

        private a()
        {
            a = VI.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    final class b
        implements Wc
    {

        private VI a;

        public final void a()
        {
            a.a = true;
        }

        private b()
        {
            a = VI.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }


    boolean a;
    boolean b;
    private VG d;
    private VE e;
    private long f;

    public VI(VW vw, WA wa, Wc wc)
    {
        super(vw, wc);
        a = false;
        b = false;
        d = new VG(((Wq) (wa)).a, new b((byte)0));
        e = new VE(d.b(), wa.h, new a((byte)0));
        d.c = e.getCodec();
        e.a(c);
        f = wa.g * 1000L;
    }

    public final void a()
    {
        d.c();
        d = null;
        e.stop();
        e = null;
        super.a();
    }

    public final int b()
    {
        return (int)((((VY) (d)).d * 100L) / f);
    }

    public final void processFrame()
    {
        boolean flag1 = false;
        boolean flag = true;
        if (!a)
        {
            d.processFrame();
            flag = false;
        }
        if (!b)
        {
            e.processFrame();
            flag = flag1;
        }
        if (flag)
        {
            stageComplete();
        }
    }
}
