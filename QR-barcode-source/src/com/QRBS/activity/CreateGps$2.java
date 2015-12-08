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
//            CreateGps

class this._cls0
    implements android.view.Listener
{

    final CreateGps this$0;

    public void onClick(View view)
    {
        if (lon.getText().length() == 0 || lat.getText().length() == 0)
        {
            Utils.showToastNotification(activity, getString(0x7f080102));
            return;
        }
        view = new EncodeUtils(CreateGps.this);
        String s = lat.getText().toString();
        String s1 = lon.getText().toString();
        if (s.matches("-?[0-9]?[0-9][.][0-9]+") && s1.matches("-?[0-9]?[0-9]?[0-9][.][0-9]+"))
        {
            view.start((new StringBuilder("geo:")).append(s).append(",").append(s1).toString(), (new StringBuilder(String.valueOf(s))).append(",").append(s1).toString());
            return;
        } else
        {
            Utils.showToastNotification(activity, getString(0x7f080103));
            return;
        }
    }

    ils()
    {
        this$0 = CreateGps.this;
        super();
    }
}
