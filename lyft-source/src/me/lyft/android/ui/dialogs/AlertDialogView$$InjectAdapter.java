// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.dialogs;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.managers.ImageLoader;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.utils.SoundManager;

// Referenced classes of package me.lyft.android.ui.dialogs:
//            AlertDialogView

public final class  extends Binding
    implements MembersInjector
{

    private Binding bus;
    private Binding dialogFlow;
    private Binding imageLoader;
    private Binding soundManager;
    private Binding supertype;

    public void attach(Linker linker)
    {
        soundManager = linker.requestBinding("me.lyft.android.utils.SoundManager", me/lyft/android/ui/dialogs/AlertDialogView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/dialogs/AlertDialogView, getClass().getClassLoader());
        imageLoader = linker.requestBinding("me.lyft.android.managers.ImageLoader", me/lyft/android/ui/dialogs/AlertDialogView, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/dialogs/AlertDialogView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.dialogs.DialogContainerView", me/lyft/android/ui/dialogs/AlertDialogView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(soundManager);
        set1.add(dialogFlow);
        set1.add(imageLoader);
        set1.add(bus);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((AlertDialogView)obj);
    }

    public void injectMembers(AlertDialogView alertdialogview)
    {
        alertdialogview.soundManager = (SoundManager)soundManager.get();
        alertdialogview.dialogFlow = (DialogFlow)dialogFlow.get();
        alertdialogview.imageLoader = (ImageLoader)imageLoader.get();
        alertdialogview.bus = (MessageBus)bus.get();
        supertype.injectMembers(alertdialogview);
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.dialogs.AlertDialogView", false, me/lyft/android/ui/dialogs/AlertDialogView);
    }
}
