// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.asynctask;

import android.content.Context;
import com.kohls.mcommerce.opal.wallet.manager.ListenerManager;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.asynctask:
//            GetDataFromServerTask

public class GetLoyaltyDataTask extends GetDataFromServerTask
{

    private boolean isAlertShown;
    private boolean isToastShown;

    public GetLoyaltyDataTask(Context context)
    {
        super(context);
        isAlertShown = true;
        isToastShown = true;
    }

    public GetLoyaltyDataTask(Context context, boolean flag)
    {
        super(context);
        isAlertShown = true;
        isToastShown = true;
        isAlertShown = flag;
    }

    public GetLoyaltyDataTask(Context context, boolean flag, boolean flag1)
    {
        super(context);
        isAlertShown = true;
        isToastShown = true;
        isToastShown = flag1;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient Void doInBackground(Void avoid[])
    {
        retrieveLoyaltyResponse(isAlertShown, isToastShown);
        return null;
    }

    protected void doOnPostExecute()
    {
        ListenerManager.getInstance().broadcastListener("onlyreward");
    }
}
