// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.onboarding;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.ILyftPreferences;

// Referenced classes of package me.lyft.android.ui.onboarding:
//            BecomeDriverHelpView

public final class  extends Binding
    implements MembersInjector
{

    private Binding lyftPreferences;

    public void attach(Linker linker)
    {
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/ui/onboarding/BecomeDriverHelpView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(lyftPreferences);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((BecomeDriverHelpView)obj);
    }

    public void injectMembers(BecomeDriverHelpView becomedriverhelpview)
    {
        becomedriverhelpview.lyftPreferences = (ILyftPreferences)lyftPreferences.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.onboarding.BecomeDriverHelpView", false, me/lyft/android/ui/onboarding/BecomeDriverHelpView);
    }
}
