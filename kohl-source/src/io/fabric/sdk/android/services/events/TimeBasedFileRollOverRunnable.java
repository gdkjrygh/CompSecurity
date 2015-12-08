// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.events;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;

// Referenced classes of package io.fabric.sdk.android.services.events:
//            FileRollOverManager

public class TimeBasedFileRollOverRunnable
    implements Runnable
{

    private final Context context;
    private final FileRollOverManager fileRollOverManager;

    public TimeBasedFileRollOverRunnable(Context context1, FileRollOverManager filerollovermanager)
    {
        context = context1;
        fileRollOverManager = filerollovermanager;
    }

    public void run()
    {
        try
        {
            CommonUtils.logControlled(context, "Performing time based file roll over.");
            if (!fileRollOverManager.rollFileOver())
            {
                fileRollOverManager.cancelTimeBasedFileRollOver();
            }
            return;
        }
        catch (Exception exception)
        {
            CommonUtils.logControlledError(context, "Failed to roll over file", exception);
        }
    }
}
