// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.content.Intent;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.Window;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

// Referenced classes of package com.hmobile.biblekjv:
//            TodayActivity, SearchResultActivity

class this._cls0
    implements android.widget.rActionListener
{

    final TodayActivity this$0;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 3)
        {
            getWindow().setSoftInputMode(3);
            textview = TodayActivity.access$3(TodayActivity.this).getText().toString();
            if (textview.length() > 1)
            {
                keyevent = new Intent(TodayActivity.this, com/hmobile/biblekjv/SearchResultActivity);
                keyevent.putExtra("search_word", textview);
                keyevent.putExtra("FromToday", true);
                startActivityForResult(keyevent, 2);
                TodayActivity.access$4(TodayActivity.this).setVisibility(8);
                TodayActivity.access$5(TodayActivity.this).setVisibility(0);
            }
            return true;
        } else
        {
            return false;
        }
    }

    vity()
    {
        this$0 = TodayActivity.this;
        super();
    }
}
