// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.helper;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.pinterest.activity.create.dialog.CreateBoardDialog;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.activity.BaseActivity;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.create.helper:
//            CreateImageHelper

final class val.intent
    implements android.widget.ickListener
{

    final Context val$context;
    final BaseDialog val$dialog;
    final Intent val$intent;

    public final void onItemClick(AdapterView adapterview, final View view, int i, long l)
    {
        if (!Experiments.G()) goto _L2; else goto _L1
_L1:
        i;
        JVM INSTR tableswitch 0 5: default 44
    //                   0 44
    //                   1 52
    //                   2 44
    //                   3 74
    //                   4 105
    //                   5 111;
           goto _L3 _L3 _L4 _L3 _L5 _L6 _L7
_L3:
        val$dialog.dismiss();
        return;
_L4:
        Events.post(new DialogEvent(CreateBoardDialog.newInstance(null)));
        val$dialog.dismiss();
        return;
_L5:
        Pinalytics.a(ElementType.CAMERA_BUTTON, ComponentType.MODAL_DIALOG);
        class _cls1
            implements Runnable
        {

            final CreateImageHelper._cls1 this$0;
            final View val$view;

            public void run()
            {
                Intent intent1 = new Intent(view.getContext(), com/pinterest/activity/create/PhotoGalleryActivity);
                view.getContext().startActivity(intent1);
            }

            _cls1()
            {
                this$0 = CreateImageHelper._cls1.this;
                view = view1;
                super();
            }
        }

        CreateImageHelper.access$000((BaseActivity)val$context, new _cls1());
        continue; /* Loop/switch isn't completed */
_L6:
        CreateImageHelper.access$100();
        continue; /* Loop/switch isn't completed */
_L7:
        Pinalytics.a(ElementType.FIND_IMAGES_BUTTON, ComponentType.MODAL_DIALOG);
        CreateImageHelper.access$200(view.getContext());
        if (true) goto _L3; else goto _L2
_L2:
        int j = i;
        if (!Device.hasCamera())
        {
            j = i + 1;
        }
        switch (j)
        {
        case 1: // '\001'
            Events.post(new DialogEvent(CreateBoardDialog.newInstance(null)));
            val$dialog.dismiss();
            return;

        case 3: // '\003'
            Pinalytics.a(ElementType.CAMERA_BUTTON, ComponentType.MODAL_DIALOG);
            class _cls2
                implements Runnable
            {

                final CreateImageHelper._cls1 this$0;

                public void run()
                {
                    intent.putExtra("com.pinterest.EXTRA_PIN_CREATE_TYPE", Resources.string(0x7f070732));
                    CreateImageHelper.showCustomCameraDialog(context, intent);
                }

            _cls2()
            {
                this$0 = CreateImageHelper._cls1.this;
                super();
            }
            }

            CreateImageHelper.access$000((BaseActivity)val$context, new _cls2());
            break;

        case 4: // '\004'
            Pinalytics.a(ElementType.GALLERY_BUTTON, ComponentType.MODAL_DIALOG);
            val$intent.putExtra("com.pinterest.EXTRA_PIN_CREATE_TYPE", Resources.string(0x7f070734));
            CreateImageHelper.tryCustomGalleryDialog((BaseActivity)val$context, val$intent);
            break;

        case 5: // '\005'
            CreateImageHelper.access$100();
            break;

        case 6: // '\006'
            Pinalytics.a(ElementType.FIND_IMAGES_BUTTON, ComponentType.MODAL_DIALOG);
            CreateImageHelper.access$200((BaseActivity)val$context);
            break;
        }
        if (true) goto _L3; else goto _L8
_L8:
    }

    _cls2()
    {
        val$dialog = basedialog;
        val$context = context1;
        val$intent = intent1;
        super();
    }
}
