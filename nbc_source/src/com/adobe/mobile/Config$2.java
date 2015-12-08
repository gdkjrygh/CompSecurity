// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;


// Referenced classes of package com.adobe.mobile:
//            Config, MobileConfig, MobilePrivacyStatus

static final class val.status
    implements Runnable
{

    final MobilePrivacyStatus val$status;

    public void run()
    {
        MobileConfig.getInstance().setPrivacyStatus(val$status);
    }

    vacyStatus(MobilePrivacyStatus mobileprivacystatus)
    {
        val$status = mobileprivacystatus;
        super();
    }
}
