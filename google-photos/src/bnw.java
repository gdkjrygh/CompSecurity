// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bnw
    implements Runnable
{

    private int a;
    private bnu b;

    bnw(bnu bnu1, int i)
    {
        b = bnu1;
        a = i;
        super();
    }

    public final void run()
    {
        bnu.a(b).a(a);
    }
}
