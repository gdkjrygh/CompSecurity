// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Context;

// Referenced classes of package com.facebook:
//            FacebookSdk

final class val.applicationId
    implements Runnable
{

    final Context val$applicationContext;
    final String val$applicationId;

    public void run()
    {
        FacebookSdk.publishInstallAndWaitForResponse(val$applicationContext, val$applicationId);
    }

    ()
    {
        val$applicationContext = context;
        val$applicationId = s;
        super();
    }
}
