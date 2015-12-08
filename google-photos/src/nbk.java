// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;

public final class nbk
    implements ComponentCallbacks2
{

    private final Context a;

    nbk(Context context)
    {
        a = context;
    }

    public final void onConfigurationChanged(Configuration configuration)
    {
    }

    public final void onLowMemory()
    {
    }

    public final void onTrimMemory(int i)
    {
        if (i > 5)
        {
            ((nbj)olm.a(a, nbj)).n();
        }
    }
}
