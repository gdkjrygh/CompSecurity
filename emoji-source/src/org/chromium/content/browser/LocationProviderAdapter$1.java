// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;


// Referenced classes of package org.chromium.content.browser:
//            LocationProviderAdapter

class val.gpsEnabled
    implements Runnable
{

    final LocationProviderAdapter this$0;
    final boolean val$gpsEnabled;

    public void run()
    {
        LocationProviderAdapter.access$000(LocationProviderAdapter.this).start(val$gpsEnabled);
    }

    cationProvider()
    {
        this$0 = final_locationprovideradapter;
        val$gpsEnabled = Z.this;
        super();
    }
}
