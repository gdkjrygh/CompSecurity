// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.IConstantsProvider;

// Referenced classes of package me.lyft.android.ui.landing:
//            SignupPromoBannerView

public final class  extends Binding
    implements MembersInjector
{

    private Binding constantsProvider;

    public void attach(Linker linker)
    {
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/ui/landing/SignupPromoBannerView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(constantsProvider);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((SignupPromoBannerView)obj);
    }

    public void injectMembers(SignupPromoBannerView signuppromobannerview)
    {
        signuppromobannerview.constantsProvider = (IConstantsProvider)constantsProvider.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.landing.SignupPromoBannerView", false, me/lyft/android/ui/landing/SignupPromoBannerView);
    }
}
