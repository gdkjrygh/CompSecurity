// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;

public final class ger
    implements Runnable
{

    private Runnable a;
    private geq b;

    public ger(geq geq1, Runnable runnable)
    {
        b = geq1;
        super();
        a = runnable;
    }

    public final void run()
    {
        b.b.post(a);
    }
}
