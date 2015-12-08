// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.helper;

import android.content.Intent;
import android.content.pm.PackageManager;
import com.pinterest.base.PermissionUtil;
import com.pinterest.kit.activity.BaseActivity;
import java.util.List;

// Referenced classes of package com.pinterest.activity.create.helper:
//            CreateImageHelper

final class val.intent
    implements android.support.v4.app.uestPermissionsResultCallback
{

    final BaseActivity val$activity;
    final List val$apps;
    final Intent val$intent;
    final PackageManager val$pm;

    public final void onRequestPermissionsResult(int i, String as[], int ai[])
    {
        if (PermissionUtil.checkPermission(val$activity, "android.permission.READ_EXTERNAL_STORAGE"))
        {
            CreateImageHelper.access$300(val$activity, val$pm, val$apps, val$intent);
        }
    }

    sResultCallback()
    {
        val$activity = baseactivity;
        val$pm = packagemanager;
        val$apps = list;
        val$intent = intent1;
        super();
    }
}
