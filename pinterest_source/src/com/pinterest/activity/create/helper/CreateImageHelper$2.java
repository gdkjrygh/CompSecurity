// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.helper;

import com.pinterest.base.PermissionUtil;
import com.pinterest.kit.activity.BaseActivity;

final class val.job
    implements android.support.v4.app.uestPermissionsResultCallback
{

    final BaseActivity val$activity;
    final Runnable val$job;

    public final void onRequestPermissionsResult(int i, String as[], int ai[])
    {
        if (PermissionUtil.checkPermissions(val$activity, PermissionUtil.getCameraUsagePermissionGroup()))
        {
            val$job.run();
        }
    }

    sResultCallback()
    {
        val$activity = baseactivity;
        val$job = runnable;
        super();
    }
}
