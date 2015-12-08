// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.content.Intent;
import android.text.Editable;
import android.view.KeyEvent;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

// Referenced classes of package com.hmobile.biblekjv:
//            MainBookActivity, SearchResultActivity

class this._cls0
    implements android.widget.tionListener
{

    final MainBookActivity this$0;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 3)
        {
            hidekeyBoard();
            textview = edtSearch.getText().toString();
            if (textview.length() > 1)
            {
                keyevent = new Intent(MainBookActivity.this, com/hmobile/biblekjv/SearchResultActivity);
                keyevent.putExtra("search_word", textview);
                startActivityForResult(keyevent, 2);
                MainBookActivity.access$28(MainBookActivity.this).setVisibility(8);
                isSearchBarOpen = false;
                MainBookActivity.access$29(MainBookActivity.this).setVisibility(0);
                MainBookActivity.access$30(MainBookActivity.this).setVisibility(0);
            }
            return true;
        } else
        {
            return false;
        }
    }

    y()
    {
        this$0 = MainBookActivity.this;
        super();
    }
}
