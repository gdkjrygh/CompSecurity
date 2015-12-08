// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bar extends baq
{

    private volatile boolean a;

    bar()
    {
        super((byte)0);
    }

    public final void a(boolean flag)
    {
        a = flag;
    }

    public final void b()
    {
        if (a)
        {
            throw new IllegalStateException("Already released");
        } else
        {
            return;
        }
    }
}
