// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


abstract class hci
{

    public final afn a;
    public Integer b;
    public Integer c;
    public Float d;
    public Float e;

    private hci(hce hce, afn afn)
    {
        a = afn;
    }

    hci(hce hce, afn afn, byte byte0)
    {
        this(hce, afn);
    }

    protected abstract int a();

    protected final hci a(float f)
    {
        d = Float.valueOf(f);
        return this;
    }

    protected final hci a(int i)
    {
        b = Integer.valueOf(0);
        return this;
    }

    protected final hci b(float f)
    {
        e = Float.valueOf(1.0F);
        return this;
    }

    protected final hci b(int i)
    {
        c = Integer.valueOf(0);
        return this;
    }

    protected void b()
    {
    }
}
