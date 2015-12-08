// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.b.b;

import android.app.Activity;
import android.content.Intent;
import com.amazon.android.framework.context.ContextManager;
import com.amazon.android.framework.task.Task;
import com.amazon.device.iap.internal.util.MetricsHelper;
import com.amazon.device.iap.internal.util.e;

// Referenced classes of package com.amazon.device.iap.internal.b.b:
//            a

class a
    implements Task
{

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
            MetricsHelper.submitExceptionMetrics(com.amazon.device.iap.internal.b.b.a.a(b), (new StringBuilder()).append(com.amazon.device.iap.internal.b.b.a.a()).append(".onResult().execute()").toString(), exception);
            e.b(com.amazon.device.iap.internal.b.b.a.a(), (new StringBuilder()).append("Exception when attempting to fire intent: ").append(exception).toString());
            return;
        }
        activity = activity1;
        if (activity1 != null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        activity = b.b.getRoot();
        e.a(com.amazon.device.iap.internal.b.b.a.a(), (new StringBuilder()).append("About to fire intent with activity ").append(activity).toString());
        activity.startActivity(a);
        return;
    }

    ricsHelper(a a1, Intent intent)
    {
        b = a1;
        a = intent;
        super();
    }
}
