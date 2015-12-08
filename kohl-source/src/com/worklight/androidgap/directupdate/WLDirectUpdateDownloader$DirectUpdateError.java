// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.directupdate;


// Referenced classes of package com.worklight.androidgap.directupdate:
//            WLDirectUpdateDownloader, WLDirectUpdateStatus

public class status extends Error
{

    private WLDirectUpdateStatus status;
    final WLDirectUpdateDownloader this$0;

    public WLDirectUpdateStatus getStatus()
    {
        return status;
    }

    public (WLDirectUpdateStatus wldirectupdatestatus)
    {
        this$0 = WLDirectUpdateDownloader.this;
        super();
        status = wldirectupdatestatus;
    }
}
