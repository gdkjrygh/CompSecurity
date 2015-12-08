// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class mkf
{

    private Runnable a;
    private android.view.Choreographer.FrameCallback b;

    public mkf()
    {
    }

    public abstract void a();

    final android.view.Choreographer.FrameCallback b()
    {
        if (b == null)
        {
            b = new mkg(this);
        }
        return b;
    }

    final Runnable c()
    {
        if (a == null)
        {
            a = new mkh(this);
        }
        return a;
    }
}
