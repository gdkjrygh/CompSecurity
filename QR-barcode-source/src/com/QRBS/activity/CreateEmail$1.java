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
//            CreateEmail

class this._cls0
    implements android.view.stener
{

    final CreateEmail this$0;

    public void onClick(View view)
    {
        view = text.getText().toString();
        if (view == null || view.length() == 0)
        {
            Utils.showToastNotification(CreateEmail.this, getString(0x7f0800fd));
            return;
        } else
        {
            (new EncodeUtils(CreateEmail.this)).start((new StringBuilder("mailto:")).append(view).toString(), view);
            return;
        }
    }

    s()
    {
        this$0 = CreateEmail.this;
        super();
    }
}
