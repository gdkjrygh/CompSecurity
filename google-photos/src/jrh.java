// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jrh
    implements Runnable
{

    private jsn a;
    private jre b;

    jrh(jre jre1, jsn jsn)
    {
        b = jre1;
        a = jsn;
        super();
    }

    public final void run()
    {
        b.a.a(a);
    }
}
