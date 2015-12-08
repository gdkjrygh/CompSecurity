// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.utils;

import com.google.gson.Gson;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.StaticInjection;

// Referenced classes of package me.lyft.android.utils:
//            SerializationUtils

public final class  extends StaticInjection
{

    private Binding gson;

    public void attach(Linker linker)
    {
        gson = linker.requestBinding("com.google.gson.Gson", me/lyft/android/utils/SerializationUtils, getClass().getClassLoader());
    }

    public void inject()
    {
        SerializationUtils.gson = (Gson)gson.get();
    }

    public ()
    {
    }
}
