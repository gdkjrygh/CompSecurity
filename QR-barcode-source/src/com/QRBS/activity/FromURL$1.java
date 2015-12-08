// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.os.Vibrator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.scannerfire.utils.Utils;

// Referenced classes of package com.QRBS.activity:
//            FromURL

class this._cls0
    implements android.view.ckListener
{

    final FromURL this$0;

    public void onClick(View view)
    {
        if (Utils.getVibratePref(getBaseContext()))
        {
            view = FromURL.access$1(FromURL.this).getVibrator(getBaseContext());
            if (view != null)
            {
                view.vibrate(60L);
            }
        }
        if (FromURL.access$0(FromURL.this).getText().toString().equals(""))
        {
            Utils.showToastNotification(FromURL.access$2(FromURL.this), getString(0x7f08010d));
            return;
        } else
        {
            FromURL.access$1(FromURL.this).showProgress(FromURL.this, "", getString(0x7f0800f8));
            (new codeTask(FromURL.this, null)).execute(new String[0]);
            return;
        }
    }

    codeTask()
    {
        this$0 = FromURL.this;
        super();
    }
}
