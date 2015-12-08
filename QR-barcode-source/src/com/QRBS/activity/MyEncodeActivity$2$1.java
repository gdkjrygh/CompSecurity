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

class this._cls1
    implements yuku.ambilwarna.bilWarnaListener
{

    final is._cls0 this$1;

    public void onCancel(AmbilWarnaDialog ambilwarnadialog)
    {
    }

    public void onOk(AmbilWarnaDialog ambilwarnadialog, int i)
    {
        (new EncodeUtils(_fld0)).changeColor(getIntent().getStringExtra("parametro"), i, image, bmp, _fld0);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/QRBS/activity/MyEncodeActivity$2

/* anonymous class */
    class MyEncodeActivity._cls2
        implements android.view.View.OnClickListener
    {

        final MyEncodeActivity this$0;

        public void onClick(View view)
        {
            (new AmbilWarnaDialog(MyEncodeActivity.this, 0xff000000, new MyEncodeActivity._cls2._cls1())).show();
        }


            
            {
                this$0 = MyEncodeActivity.this;
                super();
            }
    }

}
