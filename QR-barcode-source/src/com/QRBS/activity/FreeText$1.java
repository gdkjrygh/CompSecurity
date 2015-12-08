// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.scannerfire.utils.EncodeUtils;
import com.scannerfire.utils.Utils;

// Referenced classes of package com.QRBS.activity:
//            FreeText

class this._cls0
    implements android.view.kListener
{

    final FreeText this$0;

    public void onClick(View view)
    {
        view = text.getText().toString();
        if (view == null || view.length() == 0)
        {
            Utils.showToastNotification(FreeText.this, getString(0x7f08010c));
            return;
        } else
        {
            (new EncodeUtils(FreeText.this)).start(view, view);
            return;
        }
    }

    tils()
    {
        this$0 = FreeText.this;
        super();
    }
}
