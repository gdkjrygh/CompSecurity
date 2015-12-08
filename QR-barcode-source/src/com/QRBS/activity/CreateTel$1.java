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
//            CreateTel

class this._cls0
    implements android.view.Listener
{

    final CreateTel this$0;

    public void onClick(View view)
    {
        view = text.getText().toString();
        if (view == null || view.length() == 0)
        {
            Utils.showToastNotification(CreateTel.this, getString(0x7f080108));
            return;
        } else
        {
            (new EncodeUtils(CreateTel.this)).start((new StringBuilder("tel:")).append(view).toString(), view);
            return;
        }
    }

    ils()
    {
        this$0 = CreateTel.this;
        super();
    }
}
