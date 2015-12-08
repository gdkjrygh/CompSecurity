// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendshare.util;

import com.pinterest.api.model.Pin;
import com.pinterest.base.Application;
import com.pinterest.base.PermissionUtil;
import com.pinterest.kit.activity.BaseActivity;

// Referenced classes of package com.pinterest.activity.sendshare.util:
//            SendShareUtils

class val.pin
    implements android.support.v4.app.RequestPermissionsResultCallback
{

    final SendShareUtils this$0;
    final BaseActivity val$activity;
    final Pin val$pin;

    public void onRequestPermissionsResult(int i, String as[], int ai[])
    {
        if (PermissionUtil.checkPermission(val$activity, "android.permission.WRITE_EXTERNAL_STORAGE"))
        {
            SendShareUtils.access$000(SendShareUtils.this, val$activity, val$pin);
            return;
        } else
        {
            Application.showToast(0x7f07040f);
            return;
        }
    }

    onsResultCallback()
    {
        this$0 = final_sendshareutils;
        val$activity = baseactivity;
        val$pin = Pin.this;
        super();
    }
}
