// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ggz extends gha
    implements android.view.Choreographer.FrameCallback
{

    private Runnable a;

    public ggz(Runnable runnable)
    {
        super((byte)0);
        a = runnable;
    }

    public final void doFrame(long l)
    {
        a.run();
    }
}
