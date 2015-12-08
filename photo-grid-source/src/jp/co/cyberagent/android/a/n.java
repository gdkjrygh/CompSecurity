// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.a;

import java.io.PrintStream;

// Referenced classes of package jp.co.cyberagent.android.a:
//            k, l

public final class n extends k
{

    protected float F;
    private l G;
    private l H;
    private l I;

    public n()
    {
        this(1.0F);
    }

    public n(float f)
    {
        F = 1.0F;
        G = new l();
        H = new l();
        I = new l();
        if (f <= 5F)
        {
            G.a(1.0F);
            H.a(f - 1.0F);
        } else
        {
            G.a(5F);
            H.a(f - 5F);
        }
        I.a(2.0F);
        a(G);
        a(H);
        a(I);
    }

    public final void a(float f)
    {
        System.err.println((new StringBuilder("blursize:")).append(f).toString());
        F = f;
        if (f <= 5F)
        {
            G.a(1.0F);
            H.a(f - 1.0F);
        } else
        {
            G.a(5F);
            H.a(f - 5F);
        }
        I.a(2.0F);
    }
}
