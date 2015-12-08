// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.fragment;

import com.pinterest.activity.create.helper.CreateImageHelper;
import com.pinterest.base.PermissionUtil;

class this._cls0
    implements android.support.v4.app.uestPermissionsResultCallback
{

    final l.intent this$0;

    public void onRequestPermissionsResult(int i, String as[], int ai[])
    {
        if (PermissionUtil.checkPermission(baseActivity, "android.permission.CAMERA"))
        {
            CreateImageHelper.showCustomCameraDialog(context, intent);
        }
    }

    sResultCallback()
    {
        this$0 = this._cls0.this;
        super();
    }
}
