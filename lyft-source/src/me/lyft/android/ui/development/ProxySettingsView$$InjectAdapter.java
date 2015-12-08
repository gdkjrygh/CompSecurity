// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.development;

import com.squareup.okhttp.OkHttpClient;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.ILyftPreferences;

// Referenced classes of package me.lyft.android.ui.development:
//            ProxySettingsView

public final class  extends Binding
    implements MembersInjector
{

    private Binding lyftPreferences;
    private Binding okHttpClient;

    public void attach(Linker linker)
    {
        okHttpClient = linker.requestBinding("com.squareup.okhttp.OkHttpClient", me/lyft/android/ui/development/ProxySettingsView, getClass().getClassLoader());
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/ui/development/ProxySettingsView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(okHttpClient);
        set1.add(lyftPreferences);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((ProxySettingsView)obj);
    }

    public void injectMembers(ProxySettingsView proxysettingsview)
    {
        proxysettingsview.okHttpClient = (OkHttpClient)okHttpClient.get();
        proxysettingsview.lyftPreferences = (ILyftPreferences)lyftPreferences.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.development.ProxySettingsView", false, me/lyft/android/ui/development/ProxySettingsView);
    }
}
