// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.dialogs;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.rx.MessageBus;

// Referenced classes of package me.lyft.android.ui.dialogs:
//            DatePickerDialogView

public final class  extends Binding
    implements MembersInjector
{

    private Binding bus;
    private Binding supertype;

    public void attach(Linker linker)
    {
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/dialogs/DatePickerDialogView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.dialogs.DialogContainerView", me/lyft/android/ui/dialogs/DatePickerDialogView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(bus);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((DatePickerDialogView)obj);
    }

    public void injectMembers(DatePickerDialogView datepickerdialogview)
    {
        datepickerdialogview.bus = (MessageBus)bus.get();
        supertype.injectMembers(datepickerdialogview);
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.dialogs.DatePickerDialogView", false, me/lyft/android/ui/dialogs/DatePickerDialogView);
    }
}
