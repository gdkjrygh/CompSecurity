// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cty
    implements Runnable
{

    private ctx a;

    cty(ctx ctx1)
    {
        a = ctx1;
        super();
    }

    public final void run()
    {
        if (ctv.d(a.a) != null)
        {
            ctv.d(a.a).d();
        }
    }
}
