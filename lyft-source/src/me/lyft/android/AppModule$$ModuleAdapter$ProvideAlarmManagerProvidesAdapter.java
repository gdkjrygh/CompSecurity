// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android;

import android.app.AlarmManager;
import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

// Referenced classes of package me.lyft.android:
//            AppModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final AppModule module;

    public AlarmManager get()
    {
        return module.provideAlarmManager();
    }

    public volatile Object get()
    {
        return get();
    }

    public Q(AppModule appmodule)
    {
        super("android.app.AlarmManager", true, "me.lyft.android.AppModule", "provideAlarmManager");
        module = appmodule;
        setLibrary(true);
    }
}
