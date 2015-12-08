// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.ads;

import android.app.Activity;
import com.jirbo.adcolony.AdColony;
import com.jirbo.adcolony.AdColonyVideoAd;

// Referenced classes of package com.roidapp.cloudlib.ads:
//            o, a

final class t
    implements o
{

    private boolean a;

    private t()
    {
        a = false;
    }

    t(byte byte0)
    {
        this();
    }

    public final void a()
    {
        a = false;
        AdColony.pause();
    }

    public final void a(Activity activity)
    {
        AdColony.configure(activity, "version:1.0,store:google", "appbf321bdd873649d89f", new String[] {
            "vzc2e33f3d820e46e194"
        });
        AdColony.addAdAvailabilityListener(com.roidapp.cloudlib.ads.a.a());
    }

    public final void b(Activity activity)
    {
        AdColony.resume(activity);
        a = true;
    }

    public final boolean b()
    {
        return com.roidapp.cloudlib.ads.a.b();
    }

    public final boolean c()
    {
        if (a && com.roidapp.cloudlib.ads.a.b())
        {
            (new AdColonyVideoAd("vzc2e33f3d820e46e194")).show();
            return true;
        } else
        {
            return false;
        }
    }
}
