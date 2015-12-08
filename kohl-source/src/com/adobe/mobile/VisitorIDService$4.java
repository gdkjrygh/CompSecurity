// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.util.concurrent.Callable;

// Referenced classes of package com.adobe.mobile:
//            VisitorIDService, MobileConfig

class val.returnValue
    implements Callable
{

    final VisitorIDService this$0;
    final StringBuilder val$returnValue;

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public Void call()
        throws Exception
    {
        if (VisitorIDService.access$000(VisitorIDService.this) != null)
        {
            val$returnValue.append("?");
            val$returnValue.append("mid");
            val$returnValue.append("=");
            val$returnValue.append(VisitorIDService.access$000(VisitorIDService.this));
            val$returnValue.append("&");
            val$returnValue.append("mcorgid");
            val$returnValue.append("=");
            val$returnValue.append(MobileConfig.getInstance().getMarketingCloudOrganizationId());
        }
        return null;
    }

    ()
    {
        this$0 = final_visitoridservice;
        val$returnValue = StringBuilder.this;
        super();
    }
}
