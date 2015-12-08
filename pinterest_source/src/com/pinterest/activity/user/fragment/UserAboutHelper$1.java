// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.fragment;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.pinterest.activity.create.helper.CreateImageHelper;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.base.Device;
import com.pinterest.base.PermissionUtil;
import com.pinterest.kit.activity.BaseActivity;

final class val.dialog
    implements android.widget.ClickListener
{

    final BaseActivity val$baseActivity;
    final Context val$context;
    final BaseDialog val$dialog;
    final Intent val$intent;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        int j;
        j = i;
        if (!Device.hasCamera())
        {
            j = i + 1;
        }
        j;
        JVM INSTR tableswitch 0 1: default 40
    //                   0 48
    //                   1 70;
           goto _L1 _L2 _L3
_L1:
        val$dialog.dismiss();
        return;
_L2:
        class _cls1
            implements android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
        {

            final UserAboutHelper._cls1 this$0;

            public void onRequestPermissionsResult(int k, String as[], int ai[])
            {
                if (PermissionUtil.checkPermission(baseActivity, "android.permission.CAMERA"))
                {
                    CreateImageHelper.showCustomCameraDialog(context, intent);
                }
            }

            _cls1()
            {
                this$0 = UserAboutHelper._cls1.this;
                super();
            }
        }

        PermissionUtil.checkPermissionAsync(val$baseActivity, "android.permission.CAMERA", 0x7f0700ad, new _cls1());
        continue; /* Loop/switch isn't completed */
_L3:
        CreateImageHelper.tryCustomGalleryDialog((BaseActivity)val$context, val$intent);
        if (true) goto _L1; else goto _L4
_L4:
    }

    _cls1()
    {
        val$baseActivity = baseactivity;
        val$context = context1;
        val$intent = intent1;
        val$dialog = basedialog;
        super();
    }
}
