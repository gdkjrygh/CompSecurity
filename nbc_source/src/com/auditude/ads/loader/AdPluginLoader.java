// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.loader;

import android.content.Context;
import com.auditude.ads.AuditudeAdUnit;

// Referenced classes of package com.auditude.ads.loader:
//            IPluginLoader

public class AdPluginLoader
    implements IPluginLoader
{

    Context context;
    IPluginLoader.PluginLoaderListener listener;

    public AdPluginLoader(Context context1)
    {
        context = context1;
    }

    private void notifyLoadComplete(Object obj)
    {
        if (listener != null)
        {
            listener.loadComplete(obj);
        }
    }

    public void cancel()
    {
    }

    public void load()
    {
        notifyLoadComplete(new AuditudeAdUnit(context));
    }

    public void setPluginLoaderListener(IPluginLoader.PluginLoaderListener pluginloaderlistener)
    {
        listener = pluginloaderlistener;
    }
}
