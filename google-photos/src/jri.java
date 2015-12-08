// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jri
    implements Runnable
{

    private jsk a;
    private jre b;

    jri(jre jre1, jsk jsk)
    {
        b = jre1;
        a = jsk;
        super();
    }

    public final void run()
    {
        b.a.a(a);
    }
}
