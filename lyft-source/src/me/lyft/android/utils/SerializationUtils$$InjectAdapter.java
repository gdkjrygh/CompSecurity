// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.utils;

import dagger.internal.Binding;
import javax.inject.Provider;

// Referenced classes of package me.lyft.android.utils:
//            SerializationUtils

public final class  extends Binding
    implements Provider
{

    public volatile Object get()
    {
        return get();
    }

    public SerializationUtils get()
    {
        return new SerializationUtils();
    }

    public ()
    {
        super("me.lyft.android.utils.SerializationUtils", "members/me.lyft.android.utils.SerializationUtils", false, me/lyft/android/utils/SerializationUtils);
    }
}
