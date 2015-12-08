// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager

private static final class Fc
    implements ComponentCallbacks2
{

    private final size Fc;

    public void onConfigurationChanged(Configuration configuration)
    {
    }

    public void onLowMemory()
    {
        Fc.evictAll();
    }

    public void onTrimMemory(int i)
    {
        if (i >= 60)
        {
            Fc.evictAll();
        } else
        if (i >= 20)
        {
            Fc.trimToSize(Fc.size() / 2);
            return;
        }
    }

    public _cls9(_cls9 _pcls9)
    {
        Fc = _pcls9;
    }
}
