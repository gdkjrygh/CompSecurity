// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.text.Editable;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.EditText;
import com.scannerfire.utils.Utils;

// Referenced classes of package com.QRBS.activity:
//            CreateUrl

class this._cls0
    implements android.view.Listener
{

    final CreateUrl this$0;

    public void onClick(View view)
    {
        String s = text.getText().toString();
        if (!URLUtil.isValidUrl(s) && !s.startsWith("www."))
        {
            Utils.showToastNotification(CreateUrl.this, getString(0x7f0800fb));
            return;
        }
        view = s;
        if (s.startsWith("www."))
        {
            view = (new StringBuilder("http://")).append(s).toString();
        }
        CreateUrl.access$0(CreateUrl.this, view);
    }

    ner()
    {
        this$0 = CreateUrl.this;
        super();
    }
}
