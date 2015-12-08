// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.dialogs;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.common.DialogFlow;

// Referenced classes of package me.lyft.android.ui.dialogs:
//            ToastView

public final class _cls9 extends Binding
    implements MembersInjector
{

    private Binding dialogFlow;

    public void attach(Linker linker)
    {
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/dialogs/ToastView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(dialogFlow);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((ToastView)obj);
    }

    public void injectMembers(ToastView toastview)
    {
        toastview.dialogFlow = (DialogFlow)dialogFlow.get();
    }

    public _cls9()
    {
        super(null, "members/me.lyft.android.ui.dialogs.ToastView", false, me/lyft/android/ui/dialogs/ToastView);
    }
}
