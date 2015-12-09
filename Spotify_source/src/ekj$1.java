// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements Runnable
{

    private ekj a;

    public final void run()
    {
        if (!a.e)
        {
            return;
        }
        long l = (long)((double)a.b + 1000D * a.c);
        if (l != a.b)
        {
            a.b = l;
            if (a.d != null)
            {
                a.d.a(a.b, a.g);
            }
        }
        a.a();
    }

    (ekj ekj1)
    {
        a = ekj1;
        super();
    }
}
