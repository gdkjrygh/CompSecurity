// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.async_tasks;

import java.lang.ref.WeakReference;

// Referenced classes of package com.aviary.android.feather.sdk.async_tasks:
//            AsyncImageManager

static class a
{

    private final WeakReference a;

    public Runnable a()
    {
        return (Runnable)a.get();
    }

    public Runnable(Runnable runnable)
    {
        a = new WeakReference(runnable);
    }
}
