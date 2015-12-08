// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ink
    implements Runnable
{

    private ini a;

    ink(ini ini1)
    {
        a = ini1;
        super();
    }

    public final void run()
    {
        imz imz1 = (imz)a.O_().c().a("fullscreen");
        if (imz1 != null)
        {
            imz1.a = ini.c(a);
            imz1.a(false);
        }
    }
}
