// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gxw
    implements Runnable
{

    private gxv a;

    gxw(gxv gxv1)
    {
        a = gxv1;
        super();
    }

    public final void run()
    {
        gxv.a(a);
        a.a();
    }
}
