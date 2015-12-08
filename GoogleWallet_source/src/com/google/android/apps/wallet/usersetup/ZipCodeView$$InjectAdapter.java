// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;

import android.view.accessibility.AccessibilityManager;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;

// Referenced classes of package com.google.android.apps.wallet.usersetup:
//            ZipCodeView

public final class I extends Binding
    implements MembersInjector
{

    private Binding accessibilityManager;

    public final void attach(Linker linker)
    {
        accessibilityManager = linker.requestBinding("android.view.accessibility.AccessibilityManager", com/google/android/apps/wallet/usersetup/ZipCodeView, getClass().getClassLoader());
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(accessibilityManager);
    }

    public final void injectMembers(ZipCodeView zipcodeview)
    {
        zipcodeview.accessibilityManager = (AccessibilityManager)accessibilityManager.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ZipCodeView)obj);
    }

    public I()
    {
        super(null, "members/com.google.android.apps.wallet.usersetup.ZipCodeView", false, com/google/android/apps/wallet/usersetup/ZipCodeView);
    }
}
