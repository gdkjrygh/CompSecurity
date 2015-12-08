// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.entrypoint;

import com.google.android.apps.wallet.config.featurecontrol.RestrictedFeatureFilter;
import com.google.android.apps.wallet.init.ui.InitializerFilter;
import com.google.android.apps.wallet.pin.EnforcePinFilter;
import com.google.android.apps.wallet.restrictioncheck.RestrictionCheckFilter;
import com.google.android.apps.wallet.usersetup.SetupFilter;
import com.google.android.apps.wallet.usersetup.WarmWelcomeFilter;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;

// Referenced classes of package com.google.android.apps.wallet.entrypoint:
//            WalletRootActivity

static class 
{

    static ListMultimap getActivityFilters(RestrictionCheckFilter restrictioncheckfilter, WarmWelcomeFilter warmwelcomefilter, SetupFilter setupfilter, InitializerFilter initializerfilter, EnforcePinFilter enforcepinfilter, RestrictedFeatureFilter restrictedfeaturefilter)
    {
        ArrayListMultimap arraylistmultimap = ArrayListMultimap.create();
        arraylistmultimap.put("ROOT", restrictioncheckfilter);
        arraylistmultimap.put("ROOT", warmwelcomefilter);
        arraylistmultimap.put("ROOT", setupfilter);
        arraylistmultimap.put("ROOT", initializerfilter);
        arraylistmultimap.put("ROOT", enforcepinfilter);
        arraylistmultimap.put("ROOT", restrictedfeaturefilter);
        return arraylistmultimap;
    }

    ()
    {
    }
}
