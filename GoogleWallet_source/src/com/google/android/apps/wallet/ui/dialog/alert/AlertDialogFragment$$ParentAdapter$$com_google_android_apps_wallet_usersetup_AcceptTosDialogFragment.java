// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.ui.dialog.alert;

import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;

// Referenced classes of package com.google.android.apps.wallet.ui.dialog.alert:
//            AlertDialogFragment

public final class _99_
    implements MembersInjector
{

    private Binding analyticsUtil;

    public final void attach(Linker linker)
    {
        analyticsUtil = linker.requestBinding("com.google.android.apps.wallet.analytics.AnalyticsUtil", com/google/android/apps/wallet/ui/dialog/alert/AlertDialogFragment, getClass().getClassLoader());
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(analyticsUtil);
    }

    public final void injectMembers(AlertDialogFragment alertdialogfragment)
    {
        alertdialogfragment.analyticsUtil = (AnalyticsUtil)analyticsUtil.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((AlertDialogFragment)obj);
    }

    public _99_()
    {
    }
}
