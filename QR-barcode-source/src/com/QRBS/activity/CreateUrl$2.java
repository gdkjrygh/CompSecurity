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
        view = text.getText().toString();
        if (!URLUtil.isValidUrl(view) && !view.startsWith("www."))
        {
            Utils.showToastNotification(CreateUrl.this, getString(0x7f0800fb));
            return;
        }
        Utils utils = new Utils();
        if (!utils.checkConnectivity(activity))
        {
            Utils.showToastNotification(CreateUrl.this, getString(0x7f080109));
            return;
        } else
        {
            CreateUrl.access$2(CreateUrl.this, utils.showProgress(activity, getString(0x7f08010a), getString(0x7f0800f9)));
            (new Task(CreateUrl.this, null)).execute(new String[] {
                view
            });
            return;
        }
    }

    Task()
    {
        this$0 = CreateUrl.this;
        super();
    }
}
