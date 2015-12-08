// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import com.scannerfire.utils.EncodeUtils;
import com.scannerfire.utils.Utils;

// Referenced classes of package com.QRBS.activity:
//            MyEncodeActivity

class this._cls0
    implements android.view.r
{

    final MyEncodeActivity this$0;

    public void onClick(View view)
    {
        view = EncodeUtils.getImageUri(getApplicationContext(), bmp);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        if (view != null)
        {
            intent.putExtra("android.intent.extra.STREAM", view);
        }
        intent.putExtra("android.intent.extra.SUBJECT", (new StringBuilder("Powered by ")).append(getString(0x7f0800b1)).append(" - http://goo.gl/pTAlm4").toString());
        intent.putExtra("android.intent.extra.EMAIL", text.getText().toString());
        intent.putExtra("android.intent.extra.TEXT", text.getText().toString());
        intent.setType("image/jpeg");
        try
        {
            startActivity(Intent.createChooser(intent, getString(0x7f080112)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            Utils.showToastNotification(MyEncodeActivity.this, getString(0x7f080157));
        }
    }

    tion()
    {
        this$0 = MyEncodeActivity.this;
        super();
    }
}
