// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.settings.ISignUrlService;

// Referenced classes of package me.lyft.android.ui:
//            WebBrowserView

public final class ice extends Binding
    implements MembersInjector
{

    private Binding signUrlService;

    public void attach(Linker linker)
    {
        signUrlService = linker.requestBinding("me.lyft.android.application.settings.ISignUrlService", me/lyft/android/ui/WebBrowserView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(signUrlService);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((WebBrowserView)obj);
    }

    public void injectMembers(WebBrowserView webbrowserview)
    {
        webbrowserview.signUrlService = (ISignUrlService)signUrlService.get();
    }

    public ice()
    {
        super(null, "members/me.lyft.android.ui.WebBrowserView", false, me/lyft/android/ui/WebBrowserView);
    }
}
