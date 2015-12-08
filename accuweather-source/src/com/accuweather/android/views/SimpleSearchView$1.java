// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.views;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

// Referenced classes of package com.accuweather.android.views:
//            SimpleSearchView

class this._cls0
    implements android.widget.tionListener
{

    final SimpleSearchView this$0;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 3 || i == 2 || i == 5)
        {
            textview = SimpleSearchView.access$000(SimpleSearchView.this).getText().toString();
            if (!TextUtils.isEmpty(textview) && mListener != null)
            {
                mListener.onSearch(textview);
            }
            return true;
        } else
        {
            return false;
        }
    }

    earchViewListener()
    {
        this$0 = SimpleSearchView.this;
        super();
    }
}
