// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.actions;

import android.net.Uri;
import com.urbanairship.UAirship;
import com.urbanairship.widget.UAWebView;

// Referenced classes of package com.urbanairship.actions:
//            LandingPageAction

class val.uri
    implements Runnable
{

    final LandingPageAction this$0;
    final Uri val$uri;

    public void run()
    {
        (new UAWebView(UAirship.getApplicationContext())).loadUrl(val$uri.toString());
    }

    ()
    {
        this$0 = final_landingpageaction;
        val$uri = Uri.this;
        super();
    }
}
