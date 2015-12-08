// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jfe
    implements Runnable
{

    private jev a;

    jfe(jev jev1)
    {
        a = jev1;
        super();
    }

    public final void run()
    {
        jev.a(a, null);
        jev.p(a);
    }
}
