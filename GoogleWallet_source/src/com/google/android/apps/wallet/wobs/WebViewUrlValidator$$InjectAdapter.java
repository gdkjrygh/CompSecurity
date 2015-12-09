// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import com.google.android.apps.wallet.config.appcontrol.AppControl;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            WebViewUrlValidator

public final class  extends Binding
    implements Provider
{

    private Binding appControl;

    public final void attach(Linker linker)
    {
        appControl = linker.requestBinding("com.google.android.apps.wallet.config.appcontrol.AppControl", com/google/android/apps/wallet/wobs/WebViewUrlValidator, getClass().getClassLoader());
    }

    public final WebViewUrlValidator get()
    {
        return new WebViewUrlValidator((AppControl)appControl.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(appControl);
    }

    public ()
    {
        super("com.google.android.apps.wallet.wobs.WebViewUrlValidator", "members/com.google.android.apps.wallet.wobs.WebViewUrlValidator", false, com/google/android/apps/wallet/wobs/WebViewUrlValidator);
    }
}
