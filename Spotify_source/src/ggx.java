// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ggx extends gha
    implements Runnable
{

    private Runnable a;

    public ggx(Runnable runnable)
    {
        super((byte)0);
        a = runnable;
    }

    public final void run()
    {
        a.run();
    }
}
