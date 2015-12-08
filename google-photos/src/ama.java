// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;

public final class ama extends ContextWrapper
    implements ComponentCallbacks2
{

    final Handler a = new Handler(Looper.getMainLooper());
    public final amc b;
    final ayt c;
    final apf d;
    public final int e;
    private final azd f;
    private final ComponentCallbacks2 g;

    public ama(Context context, amc amc, azd azd, ayt ayt, apf apf, ComponentCallbacks2 componentcallbacks2, int i)
    {
        super(context.getApplicationContext());
        b = amc;
        f = azd;
        c = ayt;
        d = apf;
        g = componentcallbacks2;
        e = i;
    }

    public final void onConfigurationChanged(Configuration configuration)
    {
        g.onConfigurationChanged(configuration);
    }

    public final void onLowMemory()
    {
        g.onLowMemory();
    }

    public final void onTrimMemory(int i)
    {
        g.onTrimMemory(i);
    }
}
