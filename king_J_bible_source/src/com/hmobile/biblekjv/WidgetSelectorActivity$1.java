// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

// Referenced classes of package com.hmobile.biblekjv:
//            WidgetSelectorActivity

class this._cls0
    implements android.widget.dListener
{

    final WidgetSelectorActivity this$0;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        font_size = f_size[i];
        txtVerse.setTextSize(font_size);
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    ner()
    {
        this$0 = WidgetSelectorActivity.this;
        super();
    }
}
