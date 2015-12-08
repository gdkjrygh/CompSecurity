// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.activity;

import com.pinterest.activity.task.dialog.ShakeMenuDialog;
import com.squareup.seismic.ShakeDetector;

// Referenced classes of package com.pinterest.kit.activity:
//            BaseActivity

class this._cls0
    implements com.squareup.seismic.istener
{

    final BaseActivity this$0;

    public void hearShake()
    {
        BaseActivity.access$000(BaseActivity.this).a();
        ShakeMenuDialog shakemenudialog = new ShakeMenuDialog(BaseActivity.this);
        class _cls1
            implements com.pinterest.activity.task.dialog.BaseDialog.OnDismissListener
        {

            final BaseActivity._cls2 this$1;

            public void onDismiss(BaseDialog basedialog)
            {
                BaseActivity.access$000(this$0).a((SensorManager)getSystemService("sensor"));
            }

            _cls1()
            {
                this$1 = BaseActivity._cls2.this;
                super();
            }
        }

        shakemenudialog.addOnDismissListener(new _cls1());
        show(shakemenudialog);
    }

    _cls1()
    {
        this$0 = BaseActivity.this;
        super();
    }
}
