// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk;

import android.content.Context;

// Referenced classes of package com.apptentive.android.sdk:
//            Apptentive, GlobalInfo

static final class val.context extends Thread
{

    final Context val$context;

    public void run()
    {
        Apptentive.access$100(val$context, GlobalInfo.isAppDebuggable);
    }

    (Context context1)
    {
        val$context = context1;
        super();
    }
}
