// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            ek

public final class ee extends ek
{

    private Runnable a;

    public ee(Runnable runnable)
    {
        a = runnable;
    }

    public final void a()
    {
        a.run();
    }
}
