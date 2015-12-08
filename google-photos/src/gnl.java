// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gnl
    implements Runnable
{

    private gnk a;

    gnl(gnk gnk1)
    {
        a = gnk1;
        super();
    }

    public final void run()
    {
        gnk.a(a);
    }
}
