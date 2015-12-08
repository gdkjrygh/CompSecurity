// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.adsdk;

import android.content.Context;
import com.amobee.pulse3d.Pulse3DView;

// Referenced classes of package com.amobee.adsdk:
//            AdManager

static class 
{

    public static void createPulse3DAdapterFunc(Context context, int i)
    {
        Pulse3DView.clearCacheOlderThan(context, 30);
    }

    ()
    {
    }
}
