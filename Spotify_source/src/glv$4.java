// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements Runnable
{

    private String a;
    private Exception b;
    private glv c;

    public final void run()
    {
        glv.d(c).a(a, b);
    }

    (glv glv1, String s, Exception exception)
    {
        c = glv1;
        a = s;
        b = exception;
        super();
    }
}
