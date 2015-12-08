// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.asynctask;

import android.content.Context;
import android.text.TextUtils;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.wallet.manager.ListenerManager;
import com.kohls.mcommerce.opal.wallet.rest.PointsAdjustmentService;
import com.kohls.mcommerce.opal.wallet.rest.containers.PointsAdjustmentResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.PointsRequestObj;
import java.lang.ref.WeakReference;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.asynctask:
//            BaseAsyncTask

public class PointAdjustmentAsyncTask extends BaseAsyncTask
{

    public PointAdjustmentAsyncTask(Context context)
    {
        super(context);
    }

    protected transient PointsAdjustmentResponse doInBackground(String as[])
    {
        Object obj = null;
        if (mContext != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        if (!canAccessNetwork())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = new PointsAdjustmentService(new WeakReference(mContext));
        String s = KohlsPhoneApplication.getInstance().getAuthenticationUtils().getLoyaltyIDFromPref();
        if (TextUtils.isEmpty(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        PointsRequestObj pointsrequestobj = new PointsRequestObj();
        pointsrequestobj.setSourceLoyaltyId(s);
        pointsrequestobj.setDestinationLoyaltyId(as[0]);
        pointsrequestobj.setRewardPoints(as[1]);
        pointsrequestobj.setMessage(as[2]);
        pointsrequestobj.setCharityInd(as[3]);
        pointsrequestobj.setDestinationPhoneNumber(as[5]);
        pointsrequestobj.setDestinationEmailId(as[6]);
        obj = ((PointsAdjustmentService) (obj)).getPoints(pointsrequestobj);
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        if (!TextUtils.isEmpty(as[4]))
        {
            ((PointsAdjustmentResponse) (obj)).setImgBitmap(getImageBitmap(as[4]));
        }
        return ((PointsAdjustmentResponse) (obj));
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected void onPostExecute(PointsAdjustmentResponse pointsadjustmentresponse)
    {
        super.onPostExecute(pointsadjustmentresponse);
        ListenerManager.getInstance().broadcastListener("pointadjst", pointsadjustmentresponse);
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((PointsAdjustmentResponse)obj);
    }
}
