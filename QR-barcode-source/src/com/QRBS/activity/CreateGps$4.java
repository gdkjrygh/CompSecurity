// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.content.Intent;
import android.net.Uri;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
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
        String s = lat.getText().toString();
        String s1 = lon.getText().toString();
        if (s.matches("-?[0-9]?[0-9][.][0-9]+") && s1.matches("-?[0-9]?[0-9]?[0-9][.][0-9]+"))
        {
            String s2;
            if (address.getText().length() == 0)
            {
                view = getString(0x7f080105);
            } else
            {
                view = address.getText().toString();
            }
            s2 = (new StringBuilder("geo:")).append(s).append(",").append(s1).toString();
            view = Uri.encode((new StringBuilder(String.valueOf(s))).append(",").append(s1).append("(").append(view).append(")").toString());
            view = Uri.parse((new StringBuilder(String.valueOf(s2))).append("?q=").append(view).append("&z=16").toString());
            startActivity(new Intent("android.intent.action.VIEW", view));
            return;
        } else
        {
            Utils.showToastNotification(activity, getString(0x7f080103));
            return;
        }
    }

    ner()
    {
        this$0 = CreateGps.this;
        super();
    }
}
