// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.b;


// Referenced classes of package com.facebook.ui.b:
//            f, g

public abstract class e
{

    private Runnable a;
    private android.view.Choreographer.FrameCallback b;

    public e()
    {
    }

    android.view.Choreographer.FrameCallback a()
    {
        if (b == null)
        {
            b = new f(this);
        }
        return b;
    }

    public abstract void a(long l);

    Runnable b()
    {
        if (a == null)
        {
            a = new g(this);
        }
        return a;
    }
}
