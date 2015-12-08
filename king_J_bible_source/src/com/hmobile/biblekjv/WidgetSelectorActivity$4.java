// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.content.res.Resources;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

// Referenced classes of package com.hmobile.biblekjv:
//            WidgetSelectorActivity

class this._cls0
    implements android.widget.hangeListener
{

    final WidgetSelectorActivity this$0;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        isLowLight = flag;
        if (flag)
        {
            WidgetSelectorActivity.access$1(WidgetSelectorActivity.this).setText(getResources().getString(0x7f07006e));
            WidgetSelectorActivity.access$2(WidgetSelectorActivity.this).setBackgroundResource(0x7f0200ae);
            txtVerse.setTextColor(0xff000000);
            txtBookInfo.setTextColor(0xff000000);
            return;
        } else
        {
            WidgetSelectorActivity.access$1(WidgetSelectorActivity.this).setText(getResources().getString(0x7f07006f));
            WidgetSelectorActivity.access$2(WidgetSelectorActivity.this).setBackgroundResource(0x7f0200b0);
            txtVerse.setTextColor(-1);
            txtBookInfo.setTextColor(-1);
            return;
        }
    }

    istener()
    {
        this$0 = WidgetSelectorActivity.this;
        super();
    }
}
