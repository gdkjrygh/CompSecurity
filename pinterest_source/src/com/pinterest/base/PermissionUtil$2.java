// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.base;

import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.kit.activity.BaseActivity;

// Referenced classes of package com.pinterest.base:
//            PermissionUtil

final class val.callback
    implements com.pinterest.activity.task.dialog.issListener
{

    final BaseActivity val$activity;
    final android.support.v4.app.RequestPermissionsResultCallback val$callback;
    final String val$permToRequestArray[];

    public final void onDismiss(BaseDialog basedialog)
    {
        PermissionUtil.access$000(val$activity, val$permToRequestArray, val$callback);
    }

    sionsResultCallback()
    {
        val$activity = baseactivity;
        val$permToRequestArray = as;
        val$callback = requestpermissionsresultcallback;
        super();
    }
}
