// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.helper;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Device;
import com.pinterest.kit.activity.BaseActivity;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.create.helper:
//            CreateImageHelper

final class val.dialog
    implements android.widget.ickListener
{

    final Context val$context;
    final BaseDialog val$dialog;
    final Intent val$intent;

    public final void onItemClick(AdapterView adapterview, final View view, int i, long l)
    {
        int j;
        j = i;
        if (!Device.hasCamera())
        {
            j = i + 1;
        }
        j;
        JVM INSTR tableswitch 1 3: default 44
    //                   1 52
    //                   2 83
    //                   3 109;
           goto _L1 _L2 _L3 _L4
_L1:
        val$dialog.dismiss();
        return;
_L2:
        Pinalytics.a(ElementType.CAMERA_BUTTON, ComponentType.MODAL_DIALOG);
        class _cls1
            implements Runnable
        {

            final CreateImageHelper._cls3 this$0;
            final View val$view;

            public void run()
            {
                CreateImageHelper.showCustomCameraDialog(view.getContext(), intent);
            }

            _cls1()
            {
                this$0 = CreateImageHelper._cls3.this;
                view = view1;
                super();
            }
        }

        CreateImageHelper.access$000((BaseActivity)val$context, new _cls1());
        continue; /* Loop/switch isn't completed */
_L3:
        Pinalytics.a(ElementType.GALLERY_BUTTON, ComponentType.MODAL_DIALOG);
        CreateImageHelper.tryCustomGalleryDialog((BaseActivity)val$context, val$intent);
        continue; /* Loop/switch isn't completed */
_L4:
        Pinalytics.a(ElementType.CAMERA_BUTTON, ComponentType.MODAL_DIALOG);
        class _cls2
            implements Runnable
        {

            final CreateImageHelper._cls3 this$0;
            final View val$view;

            public void run()
            {
                Intent intent1 = new Intent(view.getContext(), com/pinterest/activity/create/PhotoGalleryActivity);
                view.getContext().startActivity(intent1);
            }

            _cls2()
            {
                this$0 = CreateImageHelper._cls3.this;
                view = view1;
                super();
            }
        }

        CreateImageHelper.access$000((BaseActivity)val$context, new _cls2());
        if (true) goto _L1; else goto _L5
_L5:
    }

    _cls2()
    {
        val$context = context1;
        val$intent = intent1;
        val$dialog = basedialog;
        super();
    }
}
