// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Context;

// Referenced classes of package com.facebook:
//            AppLinkData

final class val.completionHandler
    implements Runnable
{

    final Context val$applicationContext;
    final String val$applicationIdCopy;
    final mpletionHandler val$completionHandler;

    public final void run()
    {
        AppLinkData.access$000(val$applicationContext, val$applicationIdCopy, val$completionHandler);
    }

    mpletionHandler()
    {
        val$applicationContext = context;
        val$applicationIdCopy = s;
        val$completionHandler = mpletionhandler;
        super();
    }
}
