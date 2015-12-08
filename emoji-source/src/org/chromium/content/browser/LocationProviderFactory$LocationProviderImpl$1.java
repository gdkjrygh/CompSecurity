// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.location.Location;

// Referenced classes of package org.chromium.content.browser:
//            LocationProviderFactory

class val.location
    implements Runnable
{

    final val.location this$0;
    final Location val$location;

    public void run()
    {
        cess._mth000(this._cls0.this, val$location);
    }

    Q()
    {
        this$0 = final_q;
        val$location = Location.this;
        super();
    }
}
