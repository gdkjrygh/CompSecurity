// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.fragment;

import android.content.Context;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.adapter.SimpleTextListAdapter;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.kit.activity.BaseActivity;
import java.util.ArrayList;

public class UserAboutHelper
{

    public UserAboutHelper()
    {
    }

    public static void showUserPictureSource(Context context)
    {
        if (context == null)
        {
            return;
        }
        Object obj = new ArrayList();
        if (Device.hasCamera())
        {
            ((ArrayList) (obj)).add(context.getString(0x7f07057f));
        }
        ((ArrayList) (obj)).add(context.getString(0x7f0702ca));
        ((ArrayList) (obj)).toArray(new String[((ArrayList) (obj)).size()]);
        BaseDialog basedialog = new BaseDialog();
        basedialog.setTitle(0x7f0700e3);
        SimpleTextListAdapter simpletextlistadapter = new SimpleTextListAdapter(false);
        simpletextlistadapter.setDataSource(((java.util.List) (obj)));
        obj = ActivityHelper.getUserSetImageIntent(context);
        basedialog.setListViewOptions(simpletextlistadapter, new _cls1());
        Events.post(new DialogEvent(basedialog));
    }

    private class _cls1
        implements android.widget.AdapterView.OnItemClickListener
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
        //                       0 48
        //                       1 70;
               goto _L1 _L2 _L3
_L1:
            dialog.dismiss();
            return;
_L2:
            class _cls1
                implements android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
            {

                final _cls1 this$0;

                public void onRequestPermissionsResult(int k, String as[], int ai[])
                {
                    if (PermissionUtil.checkPermission(baseActivity, "android.permission.CAMERA"))
                    {
                        CreateImageHelper.showCustomCameraDialog(context, intent);
                    }
                }

                _cls1()
                {
                    this$0 = _cls1.this;
                    super();
                }
            }

            PermissionUtil.checkPermissionAsync(baseActivity, "android.permission.CAMERA", 0x7f0700ad, new _cls1());
            continue; /* Loop/switch isn't completed */
_L3:
            CreateImageHelper.tryCustomGalleryDialog((BaseActivity)context, intent);
            if (true) goto _L1; else goto _L4
_L4:
        }

        _cls1()
        {
            baseActivity = baseactivity;
            context = context1;
            intent = intent1;
            dialog = basedialog;
            super();
        }
    }

}
