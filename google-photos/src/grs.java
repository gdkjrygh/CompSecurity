// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class grs
    implements Runnable
{

    private final ekp a;
    private grr b;

    grs(grr grr1, ekp ekp)
    {
        b = grr1;
        super();
        a = ekp;
    }

    public final void run()
    {
        if (a == null)
        {
            return;
        } else
        {
            grr.a(b).a(a);
            return;
        }
    }
}
