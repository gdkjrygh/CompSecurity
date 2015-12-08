// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class aix
    implements Runnable
{

    private Exception a;
    private boolean b;
    private aiw c;

    aix(aiw aiw1, Exception exception, boolean flag)
    {
        c = aiw1;
        a = exception;
        b = flag;
        super();
    }

    public final void run()
    {
        if (aiw.d(c).a == null)
        {
            return;
        }
        if (a == null)
        {
            aiw.d(c).a.a();
            return;
        } else
        {
            aiw.d(c).a.a(a);
            return;
        }
    }
}
