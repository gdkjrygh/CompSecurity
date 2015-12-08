// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ojc
    implements Runnable
{

    boolean a;
    private oja b;

    ojc(oja oja1)
    {
        b = oja1;
        super();
    }

    public final void run()
    {
        int i = mk.e(b);
        mk.c(b, 1);
        b.sendAccessibilityEvent(4096);
        mk.c(b, i);
        a = false;
    }
}
