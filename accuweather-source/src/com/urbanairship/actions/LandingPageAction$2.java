// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.actions;

import android.content.Context;
import android.content.Intent;
import com.urbanairship.UAirship;

// Referenced classes of package com.urbanairship.actions:
//            LandingPageAction

class val.actionIntent
    implements Runnable
{

    final LandingPageAction this$0;
    final Intent val$actionIntent;

    public void run()
    {
        UAirship.getApplicationContext().startActivity(val$actionIntent);
    }

    ()
    {
        this$0 = final_landingpageaction;
        val$actionIntent = Intent.this;
        super();
    }
}
