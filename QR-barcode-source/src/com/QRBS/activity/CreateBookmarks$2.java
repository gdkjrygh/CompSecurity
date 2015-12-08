// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.text.Editable;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.EditText;
import com.scannerfire.utils.EncodeUtils;
import com.scannerfire.utils.Utils;

// Referenced classes of package com.QRBS.activity:
//            CreateBookmarks

class this._cls0
    implements android.view.er
{

    final CreateBookmarks this$0;

    public void onClick(View view)
    {
        view = ((EditText)findViewById(0x7f0d0077)).getText().toString();
        if (view == null || view.length() == 0)
        {
            Utils.showToastNotification(CreateBookmarks.this, getString(0x7f0800fa));
            return;
        }
        if (!URLUtil.isValidUrl(view) && !view.startsWith("www."))
        {
            Utils.showToastNotification(CreateBookmarks.this, getString(0x7f0800fb));
            return;
        } else
        {
            (new EncodeUtils(CreateBookmarks.this)).start(view, view);
            return;
        }
    }

    ()
    {
        this$0 = CreateBookmarks.this;
        super();
    }
}
