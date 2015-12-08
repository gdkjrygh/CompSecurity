// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jrz
    implements Runnable
{

    private jrw a;

    jrz(jrw jrw1)
    {
        a = jrw1;
        super();
    }

    public final void run()
    {
        a.c();
    }
}
