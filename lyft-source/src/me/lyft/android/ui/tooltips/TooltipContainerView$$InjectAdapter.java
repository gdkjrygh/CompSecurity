// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.tooltips;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.IConstantsProvider;

// Referenced classes of package me.lyft.android.ui.tooltips:
//            TooltipContainerView

public final class  extends Binding
    implements MembersInjector
{

    private Binding constantsProvider;

    public void attach(Linker linker)
    {
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/ui/tooltips/TooltipContainerView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(constantsProvider);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((TooltipContainerView)obj);
    }

    public void injectMembers(TooltipContainerView tooltipcontainerview)
    {
        tooltipcontainerview.constantsProvider = (IConstantsProvider)constantsProvider.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.tooltips.TooltipContainerView", false, me/lyft/android/ui/tooltips/TooltipContainerView);
    }
}
