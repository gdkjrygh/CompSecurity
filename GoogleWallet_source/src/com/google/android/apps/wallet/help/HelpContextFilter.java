// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.help;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.apps.wallet.filter.ActivityFilter;
import com.google.android.apps.wallet.help.api.HelpContext;

// Referenced classes of package com.google.android.apps.wallet.help:
//            HelpContextProvider

public class HelpContextFilter extends ActivityFilter
{

    private Activity activity;
    private HelpContextProvider helpContextProvider;

    HelpContextFilter(Activity activity1, HelpContextProvider helpcontextprovider)
    {
        activity = activity1;
        helpContextProvider = helpcontextprovider;
    }

    public final void onAttachFragment(Fragment fragment)
    {
        super.onAttachFragment(fragment);
        fragment = (HelpContext)fragment.getClass().getAnnotation(com/google/android/apps/wallet/help/api/HelpContext);
        if (fragment != null)
        {
            helpContextProvider.setWalletHelpContext(fragment.value());
        }
    }

    protected final Intent onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = (HelpContext)activity.getClass().getAnnotation(com/google/android/apps/wallet/help/api/HelpContext);
        if (bundle != null)
        {
            helpContextProvider.setWalletHelpContext(bundle.value());
        }
        return null;
    }
}
