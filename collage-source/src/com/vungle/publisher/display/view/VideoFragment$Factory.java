// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.display.view;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.vungle.publisher.a;
import com.vungle.publisher.db.model.Ad;
import javax.inject.Provider;

// Referenced classes of package com.vungle.publisher.display.view:
//            VideoFragment

public static class 
{

    public Provider a;

    public static VideoFragment a(FragmentActivity fragmentactivity)
    {
        return (VideoFragment)fragmentactivity.getSupportFragmentManager().findFragmentByTag("videoFragment");
    }

    public static VideoFragment a(VideoFragment videofragment, Ad ad, a a1)
    {
        String s = ad.f();
        ad = ad.k();
        if (ad != null)
        {
            videofragment.a = a1;
            videofragment.b = ad;
            com.vungle.publisher.display.view.VideoFragment.a(videofragment, s);
            return videofragment;
        } else
        {
            return null;
        }
    }

    public static void a(VideoFragment videofragment, Bundle bundle)
    {
        if (bundle != null)
        {
            com.vungle.publisher.display.view.VideoFragment.a(videofragment, bundle.getBoolean("adStarted"));
        }
    }

    ()
    {
    }
}
