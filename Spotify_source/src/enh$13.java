// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements Runnable
{

    private enh a;

    public final void run()
    {
        if (!gex.a(enh.j(a)))
        {
            enh.a(a).b(false);
            return;
        } else
        {
            enh.a(a).a(false);
            return;
        }
    }

    able(enh enh1)
    {
        a = enh1;
        super();
    }
}
