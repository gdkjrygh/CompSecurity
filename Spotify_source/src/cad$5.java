// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements Runnable
{

    private String a;
    private cad b;

    public final void run()
    {
        b.a.loadUrl(a);
    }

    (cad cad1, String s)
    {
        b = cad1;
        a = s;
        super();
    }
}
