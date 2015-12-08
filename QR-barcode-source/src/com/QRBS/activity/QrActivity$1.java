// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.view.View;
import android.widget.ImageView;

// Referenced classes of package com.QRBS.activity:
//            QrActivity

class this._cls0
    implements android.view.istener
{

    final QrActivity this$0;

    public void onClick(View view)
    {
        if (!flashOn)
        {
            flashOn = true;
            flash.setImageResource(0x7f0200cb);
            turnOn();
            return;
        } else
        {
            flashOn = false;
            flash.setImageResource(0x7f0200cc);
            turnOff();
            return;
        }
    }

    er()
    {
        this$0 = QrActivity.this;
        super();
    }
}
