// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import com.google.android.apps.wallet.p2p.people.ContactsUtil;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;

// Referenced classes of package com.google.android.apps.wallet.p2p:
//            SenderRowView

public final class  extends Binding
    implements MembersInjector
{

    private Binding contactsUtil;

    public final void attach(Linker linker)
    {
        contactsUtil = linker.requestBinding("com.google.android.apps.wallet.p2p.people.ContactsUtil", com/google/android/apps/wallet/p2p/SenderRowView, getClass().getClassLoader());
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(contactsUtil);
    }

    public final void injectMembers(SenderRowView senderrowview)
    {
        senderrowview.contactsUtil = (ContactsUtil)contactsUtil.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SenderRowView)obj);
    }

    public ()
    {
        super(null, "members/com.google.android.apps.wallet.p2p.SenderRowView", false, com/google/android/apps/wallet/p2p/SenderRowView);
    }
}
