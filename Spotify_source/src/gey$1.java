// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.util.logging.Logger;

final class ang.Object
    implements Runnable
{

    private Runnable a;
    private gey b;

    public final void run()
    {
        Logger.a("%s: Calling runnable", new Object[] {
            b.a
        });
        b.d = true;
        a.run();
    }

    (gey gey1, Runnable runnable)
    {
        b = gey1;
        a = runnable;
        super();
    }
}
