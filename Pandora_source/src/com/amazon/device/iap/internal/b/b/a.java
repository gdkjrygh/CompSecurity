// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.b.b;

import android.app.Activity;
import android.content.Intent;
import android.os.RemoteException;
import com.amazon.android.framework.context.ContextManager;
import com.amazon.android.framework.exception.KiwiException;
import com.amazon.android.framework.task.Task;
import com.amazon.android.framework.task.TaskManager;
import com.amazon.android.framework.task.pipeline.TaskPipelineId;
import com.amazon.device.iap.internal.b.i;
import com.amazon.device.iap.internal.util.MetricsHelper;
import com.amazon.device.iap.internal.util.e;
import com.amazon.venezia.command.SuccessResult;
import java.util.Map;

abstract class a extends i
{

    private static final String d = com/amazon/device/iap/internal/b/b/a.getSimpleName();
    protected TaskManager a;
    protected ContextManager b;
    protected final String c;

    a(com.amazon.device.iap.internal.b.e e1, String s, String s1)
    {
        super(e1, "purchase_item", s);
        c = s1;
        a("sku", c);
    }

    static String a()
    {
        return d;
    }

    static String a(a a1)
    {
        return a1.c();
    }

    protected boolean a(SuccessResult successresult)
        throws RemoteException, KiwiException
    {
        successresult = successresult.getData();
        e.a(d, (new StringBuilder()).append("data: ").append(successresult).toString());
        if (!successresult.containsKey("purchaseItemIntent"))
        {
            e.b(d, "did not find intent");
            return false;
        } else
        {
            e.a(d, "found intent");
            successresult = (Intent)successresult.remove("purchaseItemIntent");
            a.enqueueAtFront(TaskPipelineId.FOREGROUND, new Task(successresult) {

                final Intent a;
                final a b;

                public void execute()
                {
                    Activity activity;
                    Activity activity1;
                    try
                    {
                        activity1 = b.b.getVisible();
                    }
                    catch (Exception exception)
                    {
                        MetricsHelper.submitExceptionMetrics(a.a(b), (new StringBuilder()).append(a.a()).append(".onResult().execute()").toString(), exception);
                        e.b(a.a(), (new StringBuilder()).append("Exception when attempting to fire intent: ").append(exception).toString());
                        return;
                    }
                    activity = activity1;
                    if (activity1 != null)
                    {
                        break MISSING_BLOCK_LABEL_32;
                    }
                    activity = b.b.getRoot();
                    e.a(a.a(), (new StringBuilder()).append("About to fire intent with activity ").append(activity).toString());
                    activity.startActivity(a);
                    return;
                }

            
            {
                b = a.this;
                a = intent;
                super();
            }
            });
            return true;
        }
    }

}
