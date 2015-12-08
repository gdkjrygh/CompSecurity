// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gnm
    implements Runnable
{

    private gnk a;

    gnm(gnk gnk1)
    {
        a = gnk1;
        super();
    }

    public final void run()
    {
        gnk.b(a);
    }
}
