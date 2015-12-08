// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.actions;

import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.urbanairship.actions:
//            ShareAction

class val.chooserIntent
    implements Runnable
{

    final ShareAction this$0;
    final Intent val$chooserIntent;
    final Context val$context;

    public void run()
    {
        val$context.startActivity(val$chooserIntent);
    }

    ()
    {
        this$0 = final_shareaction;
        val$context = context1;
        val$chooserIntent = Intent.this;
        super();
    }
}
