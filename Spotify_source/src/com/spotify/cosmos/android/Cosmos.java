// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.cosmos.android;

import android.content.Context;

// Referenced classes of package com.spotify.cosmos.android:
//            DeferredResolver, LifeCycleInspector

public class Cosmos
{

    private static DeferredResolver sInjectedResolver;

    private Cosmos()
    {
    }

    public static void clearInjectedResolver()
    {
        sInjectedResolver = null;
    }

    public static DeferredResolver getResolver(Context context)
    {
        if (sInjectedResolver != null)
        {
            return sInjectedResolver;
        } else
        {
            context = new DeferredResolver(context);
            LifeCycleInspector.noteNewInstance(context);
            return context;
        }
    }

    public static void injectResolver(DeferredResolver deferredresolver)
    {
        sInjectedResolver = deferredresolver;
    }
}
