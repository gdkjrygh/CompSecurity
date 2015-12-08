// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import com.amazon.android.framework.context.ContextManager;
import com.amazon.android.framework.task.Task;
import com.amazon.android.framework.task.TaskManager;
import com.amazon.android.framework.task.pipeline.TaskPipelineId;
import com.amazon.venezia.command.SuccessResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.amazon.device.associates:
//            ao, PurchaseRequest, PurchaseResponse, ay, 
//            x, RequestId

final class r extends ao
{

    private static final String b = com/amazon/device/associates/r.getSimpleName();
    private ContextManager c;
    private TaskManager d;

    r(RequestId requestid, PurchaseRequest purchaserequest, ay ay1)
    {
        super("physical_purchase", "1.0", requestid, ay1);
        requestid = new ArrayList();
        requestid.add(purchaserequest.getProductId());
        a("productIds", requestid);
        a("receiveReceipt", Boolean.valueOf(purchaserequest.getReceiveReceipt()));
        a(true);
    }

    static ContextManager a(r r1)
    {
        return r1.c;
    }

    static String c()
    {
        return b;
    }

    protected void a()
    {
        PurchaseResponse purchaseresponse = new PurchaseResponse(b(), PurchaseResponse.Status.FAILED);
        a.a(ay.a.e, purchaseresponse);
    }

    protected void onSuccess(SuccessResult successresult)
    {
        x.b(b, "onSuccess");
        PurchaseResponse.Status status;
        successresult = successresult.getData();
        x.b(b, (new StringBuilder()).append("data: ").append(successresult).toString());
        if (successresult.containsKey("errorMessage"))
        {
            Log.e(b, (String)successresult.get("errorMessage"));
        }
        status = PurchaseResponse.Status.valueOf((String)successresult.get("requestStatus"));
        if (status != PurchaseResponse.Status.SUCCESSFUL)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        successresult = (Intent)successresult.get("purchaseIntent");
        if (successresult != null) goto _L2; else goto _L1
_L1:
        try
        {
            throw new IllegalArgumentException("purchaseIntent is null.");
        }
        // Misplaced declaration of an exception variable
        catch (SuccessResult successresult)
        {
            x.a(b, (new StringBuilder()).append("error in onSuccess: ").append(successresult.getMessage()).toString());
        }
        successresult = new PurchaseResponse(b(), PurchaseResponse.Status.FAILED);
_L3:
        if (successresult != null)
        {
            a.a(ay.a.e, successresult);
        }
        return;
_L2:
        d.enqueueAtFront(TaskPipelineId.FOREGROUND, new Task(successresult) {

            final Intent a;
            final r b;

            public void execute()
            {
                Activity activity;
                Activity activity1;
                try
                {
                    activity1 = r.a(b).getVisible();
                }
                catch (Exception exception)
                {
                    x.b(r.c(), (new StringBuilder()).append("Exception when attempting to fire intent: ").append(exception).toString());
                    return;
                }
                activity = activity1;
                if (activity1 != null)
                {
                    break MISSING_BLOCK_LABEL_32;
                }
                activity = r.a(b).getRoot();
                x.b(r.c(), (new StringBuilder()).append("About to fire intent with activity ").append(activity).toString());
                activity.startActivity(a);
                return;
            }

            
            {
                b = r.this;
                a = intent;
                super();
            }
        });
        successresult = null;
          goto _L3
        successresult = new PurchaseResponse(b(), status);
          goto _L3
    }

}
