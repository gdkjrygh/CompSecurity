// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class bff
{

    public final cew a;
    public final Context b;
    public bem c;
    public bfe d;
    public bgh e;
    public String f;

    public bff(Context context)
    {
        bfo.a();
        this(context, (byte)0);
    }

    private bff(Context context, byte byte0)
    {
        a = new cew();
        b = context;
    }

    public final void a(String s)
    {
        if (e == null)
        {
            throw new IllegalStateException((new StringBuilder("The ad unit ID must be set on InterstitialAd before ")).append(s).append(" is called.").toString());
        } else
        {
            return;
        }
    }
}
