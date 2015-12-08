// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.directupdate;


// Referenced classes of package com.worklight.androidgap.directupdate:
//            WLDirectUpdateDownloader, WLDirectUpdateManager, WLDirectUpdateStatus, WLDirectUpdateListener

class  extends WLDirectUpdateDownloader
{

    final WLDirectUpdateManager this$0;
    final WLDirectUpdateListener val$listener;

    protected void onCancelled(WLDirectUpdateStatus wldirectupdatestatus)
    {
        super.onCancelled(wldirectupdatestatus);
        WLDirectUpdateManager.access$000(WLDirectUpdateManager.this, val$listener, wldirectupdatestatus);
    }

    protected volatile void onCancelled(Object obj)
    {
        onCancelled((WLDirectUpdateStatus)obj);
    }

    protected void onPostExecute(WLDirectUpdateStatus wldirectupdatestatus)
    {
        super.onPostExecute(wldirectupdatestatus);
        WLDirectUpdateManager.access$000(WLDirectUpdateManager.this, val$listener, wldirectupdatestatus);
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((WLDirectUpdateStatus)obj);
    }

    (long l, String s1, boolean flag, WLDirectUpdateListener wldirectupdatelistener, 
            WLDirectUpdateListener wldirectupdatelistener1)
    {
        this$0 = final_wldirectupdatemanager;
        val$listener = wldirectupdatelistener1;
        super(String.this, l, s1, flag, wldirectupdatelistener);
    }
}
