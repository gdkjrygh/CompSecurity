// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class mkg
    implements android.view.Choreographer.FrameCallback
{

    private mkf a;

    mkg(mkf mkf1)
    {
        a = mkf1;
        super();
    }

    public final void doFrame(long l)
    {
        a.a();
    }
}
