// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import com.google.android.apps.wallet.api.UriRegistry;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

public final class astic_ActivatePlasticCardActivity.ActivateCancelAlertDialogFragment extends Binding
    implements MembersInjector, Provider
{

    private com.google.android.apps.wallet.ui.dialog.alert.tivatePlasticCardActivity.ActivateCancelAlertDialogFragment nextInjectableAncestor;
    private Binding uriRegistry;

    public final void attach(Linker linker)
    {
        nextInjectableAncestor.attach(linker);
        uriRegistry = linker.requestBinding("com.google.android.apps.wallet.api.UriRegistry", com/google/android/apps/wallet/plastic/ActivatePlasticCardActivity$ActivateCancelAlertDialogFragment, getClass().getClassLoader());
    }

    public final uriRegistry get()
    {
        uriRegistry uriregistry = new uriRegistry();
        injectMembers(uriregistry);
        return uriregistry;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(uriRegistry);
        nextInjectableAncestor.getDependencies(null, set1);
    }

    public final void injectMembers(encies encies)
    {
        encies.encies = (UriRegistry)uriRegistry.get();
        nextInjectableAncestor.injectMembers(encies);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((injectMembers)obj);
    }

    public astic_ActivatePlasticCardActivity.ActivateCancelAlertDialogFragment()
    {
        super("com.google.android.apps.wallet.plastic.ActivatePlasticCardActivity$ActivateCancelAlertDialogFragment", "members/com.google.android.apps.wallet.plastic.ActivatePlasticCardActivity$ActivateCancelAlertDialogFragment", false, com/google/android/apps/wallet/plastic/ActivatePlasticCardActivity$ActivateCancelAlertDialogFragment);
        nextInjectableAncestor = new com.google.android.apps.wallet.ui.dialog.alert.tivatePlasticCardActivity.ActivateCancelAlertDialogFragment();
    }
}
