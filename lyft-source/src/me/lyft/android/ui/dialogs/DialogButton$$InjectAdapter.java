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
//            DialogButton

public final class  extends Binding
    implements MembersInjector
{

    private Binding dialogFlow;

    public void attach(Linker linker)
    {
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/dialogs/DialogButton, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(dialogFlow);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((DialogButton)obj);
    }

    public void injectMembers(DialogButton dialogbutton)
    {
        dialogbutton.dialogFlow = (DialogFlow)dialogFlow.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.dialogs.DialogButton", false, me/lyft/android/ui/dialogs/DialogButton);
    }
}
