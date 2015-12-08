// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi;

import com.nbcsports.liveextra.library.configuration.RuntimeConfiguration;

// Referenced classes of package com.phunware.nbc.sochi:
//            NBCSportsApplication

class this._cls0
    implements Runnable
{

    final NBCSportsApplication this$0;

    public void run()
    {
        config.onPause();
    }

    RuntimeConfiguration()
    {
        this$0 = NBCSportsApplication.this;
        super();
    }
}
