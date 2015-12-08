// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

final class lqt
    implements ComponentCallbacks2
{

    private lqr a;

    lqt(lqr lqr1)
    {
        a = lqr1;
        super();
    }

    public final void onConfigurationChanged(Configuration configuration)
    {
    }

    public final void onLowMemory()
    {
    }

    public final void onTrimMemory(int i)
    {
        if (i == 20)
        {
            a.d.c();
        }
    }
}
