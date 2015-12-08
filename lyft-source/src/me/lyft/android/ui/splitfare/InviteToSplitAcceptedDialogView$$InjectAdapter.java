// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.splitfare;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;

// Referenced classes of package me.lyft.android.ui.splitfare:
//            InviteToSplitAcceptedDialogView

public final class Q extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding dialogFlow;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/splitfare/InviteToSplitAcceptedDialogView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/splitfare/InviteToSplitAcceptedDialogView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(dialogFlow);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((InviteToSplitAcceptedDialogView)obj);
    }

    public void injectMembers(InviteToSplitAcceptedDialogView invitetosplitaccepteddialogview)
    {
        invitetosplitaccepteddialogview.appFlow = (AppFlow)appFlow.get();
        invitetosplitaccepteddialogview.dialogFlow = (DialogFlow)dialogFlow.get();
    }

    public Q()
    {
        super(null, "members/me.lyft.android.ui.splitfare.InviteToSplitAcceptedDialogView", false, me/lyft/android/ui/splitfare/InviteToSplitAcceptedDialogView);
    }
}
