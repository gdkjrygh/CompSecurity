// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Context;

// Referenced classes of package com.facebook:
//            AppLinkData

class val.completionHandler
    implements Runnable
{

    private final Context val$applicationContext;
    private final String val$applicationIdCopy;
    private final mpletionHandler val$completionHandler;

    public void run()
    {
        AppLinkData.access$0(val$applicationContext, val$applicationIdCopy, val$completionHandler);
    }

    mpletionHandler()
    {
        val$applicationContext = context;
        val$applicationIdCopy = s;
        val$completionHandler = mpletionhandler;
        super();
    }
}
