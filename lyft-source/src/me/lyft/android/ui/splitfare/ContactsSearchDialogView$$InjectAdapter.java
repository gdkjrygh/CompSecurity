// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.splitfare;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.ride.IRideFareRepository;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.rx.MessageBus;

// Referenced classes of package me.lyft.android.ui.splitfare:
//            ContactsSearchDialogView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding bus;
    private Binding dialogFlow;
    private Binding fareRepository;

    public void attach(Linker linker)
    {
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/splitfare/ContactsSearchDialogView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/splitfare/ContactsSearchDialogView, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/splitfare/ContactsSearchDialogView, getClass().getClassLoader());
        fareRepository = linker.requestBinding("me.lyft.android.application.ride.IRideFareRepository", me/lyft/android/ui/splitfare/ContactsSearchDialogView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(dialogFlow);
        set1.add(appFlow);
        set1.add(bus);
        set1.add(fareRepository);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((ContactsSearchDialogView)obj);
    }

    public void injectMembers(ContactsSearchDialogView contactssearchdialogview)
    {
        contactssearchdialogview.dialogFlow = (DialogFlow)dialogFlow.get();
        contactssearchdialogview.appFlow = (AppFlow)appFlow.get();
        contactssearchdialogview.bus = (MessageBus)bus.get();
        contactssearchdialogview.fareRepository = (IRideFareRepository)fareRepository.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.splitfare.ContactsSearchDialogView", false, me/lyft/android/ui/splitfare/ContactsSearchDialogView);
    }
}
