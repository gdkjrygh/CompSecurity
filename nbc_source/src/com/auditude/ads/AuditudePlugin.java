// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads;

import android.content.Context;
import com.auditude.ads.loader.AdPluginLoader;
import com.auditude.ads.loader.IPluginLoader;

// Referenced classes of package com.auditude.ads:
//            AuditudeBasePlugin

public class AuditudePlugin extends AuditudeBasePlugin
{

    public AuditudePlugin(Context context)
    {
        super(context);
    }

    protected IPluginLoader getLoader()
    {
        return new AdPluginLoader(getContext());
    }
}
