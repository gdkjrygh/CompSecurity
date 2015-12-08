// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.display.view;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.vungle.log.Logger;
import com.vungle.publisher.display.controller.AdWebChromeClient;
import com.vungle.publisher.event.EventBus;
import com.vungle.publisher.x;
import javax.inject.Provider;

// Referenced classes of package com.vungle.publisher.display.view:
//            WebViewFragment

public class PostRollFragment extends WebViewFragment
{
    public static class Factory
    {

        public Provider a;

        public static PostRollFragment a(FragmentActivity fragmentactivity)
        {
            return (PostRollFragment)fragmentactivity.getSupportFragmentManager().findFragmentByTag("postRollFragment");
        }

        public static PostRollFragment a(PostRollFragment postrollfragment, String s)
        {
            postrollfragment.c = s;
            return postrollfragment;
        }

        Factory()
        {
        }
    }


    EventBus a;
    AdWebChromeClient b;

    public PostRollFragment()
    {
    }

    public final void a()
    {
        try
        {
            a.a(new x());
            return;
        }
        catch (Exception exception)
        {
            Logger.w("VungleAd", "exception in onBackPressed", exception);
        }
    }

    public final String b()
    {
        return "postRollFragment";
    }

    public void onCreate(Bundle bundle)
    {
        try
        {
            super.onCreate(bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            Logger.w("VungleAd", "exception in onCreate", bundle);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        d.setWebChromeClient(b);
        return layoutinflater;
        viewgroup;
        layoutinflater = null;
_L2:
        Logger.w("VungleAd", "exception in onCreateView", viewgroup);
        return layoutinflater;
        viewgroup;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
