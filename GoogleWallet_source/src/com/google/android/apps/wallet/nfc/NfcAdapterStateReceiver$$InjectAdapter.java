// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.nfc;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.nfc:
//            NfcAdapterStateReceiver, NfcAdapterStateEventPublisher

public final class  extends Binding
    implements MembersInjector, Provider
{

    private Binding eventPublisher;

    public final void attach(Linker linker)
    {
        eventPublisher = linker.requestBinding("com.google.android.apps.wallet.nfc.NfcAdapterStateEventPublisher", com/google/android/apps/wallet/nfc/NfcAdapterStateReceiver, getClass().getClassLoader());
    }

    public final NfcAdapterStateReceiver get()
    {
        NfcAdapterStateReceiver nfcadapterstatereceiver = new NfcAdapterStateReceiver();
        injectMembers(nfcadapterstatereceiver);
        return nfcadapterstatereceiver;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(eventPublisher);
    }

    public final void injectMembers(NfcAdapterStateReceiver nfcadapterstatereceiver)
    {
        nfcadapterstatereceiver.eventPublisher = (NfcAdapterStateEventPublisher)eventPublisher.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((NfcAdapterStateReceiver)obj);
    }

    public ()
    {
        super("com.google.android.apps.wallet.nfc.NfcAdapterStateReceiver", "members/com.google.android.apps.wallet.nfc.NfcAdapterStateReceiver", false, com/google/android/apps/wallet/nfc/NfcAdapterStateReceiver);
    }
}
