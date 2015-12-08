// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.ads;

import com.microsoft.advertising.android.AdControl;

// Referenced classes of package com.skype.android.ads:
//            SkypeAdPlacer, AdParent

final class a
    implements Runnable
{

    final AdControl a;
    final SkypeAdPlacer b;

    public final void run()
    {
        if (b.a == AdParent.a && !a.d())
        {
            a.setAutoRefreshEnabled(true);
        }
    }

    ntrol(SkypeAdPlacer skypeadplacer, AdControl adcontrol)
    {
        b = skypeadplacer;
        a = adcontrol;
        super();
    }
}
