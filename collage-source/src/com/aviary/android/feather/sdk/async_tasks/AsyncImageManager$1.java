// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.async_tasks;

import android.widget.ImageView;
import java.util.concurrent.Callable;

// Referenced classes of package com.aviary.android.feather.sdk.async_tasks:
//            AsyncImageManager

class 
    implements Runnable
{

    final Callable a;
    final String b;
    final ImageView c;
    final int d;
    final e e;
    final AsyncImageManager f;

    public void run()
    {
        if (!AsyncImageManager.a(f).booleanValue())
        {
            f.a(a, b, c, d, e);
        }
    }
}
