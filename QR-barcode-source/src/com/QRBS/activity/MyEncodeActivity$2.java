// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.content.Intent;
import android.view.View;
import com.scannerfire.utils.EncodeUtils;
import yuku.ambilwarna.AmbilWarnaDialog;

// Referenced classes of package com.QRBS.activity:
//            MyEncodeActivity

class this._cls0
    implements android.view.r
{

    final MyEncodeActivity this$0;

    public void onClick(View view)
    {
        (new AmbilWarnaDialog(MyEncodeActivity.this, 0xff000000, new yuku.ambilwarna.AmbilWarnaDialog.OnAmbilWarnaListener() {

            final MyEncodeActivity._cls2 this$1;

            public void onCancel(AmbilWarnaDialog ambilwarnadialog)
            {
            }

            public void onOk(AmbilWarnaDialog ambilwarnadialog, int i)
            {
                (new EncodeUtils(this$0)).changeColor(getIntent().getStringExtra("parametro"), i, image, bmp, this$0);
            }

            
            {
                this$1 = MyEncodeActivity._cls2.this;
                super();
            }
        })).show();
    }


    _cls1.this._cls1()
    {
        this$0 = MyEncodeActivity.this;
        super();
    }
}
