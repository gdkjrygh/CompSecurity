// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.view;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

// Referenced classes of package com.aetn.history.android.historyhere.view:
//            SuggestActivity

class this._cls0
    implements android.view.er
{

    final SuggestActivity this$0;

    public void onClick(View view)
    {
        view = (InputMethodManager)SuggestActivity.access$000(SuggestActivity.this).getSystemService("input_method");
        view.hideSoftInputFromWindow(SuggestActivity.access$600(SuggestActivity.this).getWindowToken(), 0);
        view.hideSoftInputFromWindow(SuggestActivity.access$200(SuggestActivity.this).getWindowToken(), 0);
        view.hideSoftInputFromWindow(SuggestActivity.access$300(SuggestActivity.this).getWindowToken(), 0);
        view.hideSoftInputFromWindow(SuggestActivity.access$400(SuggestActivity.this).getWindowToken(), 0);
        view.hideSoftInputFromWindow(SuggestActivity.access$500(SuggestActivity.this).getWindowToken(), 0);
        view.hideSoftInputFromWindow(SuggestActivity.access$700(SuggestActivity.this).getWindowToken(), 0);
        view = SuggestActivity.access$800(SuggestActivity.this);
        if (view.isEmpty())
        {
            SuggestActivity.access$902(SuggestActivity.this, new ggestionData(SuggestActivity.this));
            SuggestActivity.access$900(SuggestActivity.this).placeName = SuggestActivity.access$600(SuggestActivity.this).getText().toString();
            SuggestActivity.access$900(SuggestActivity.this).address = SuggestActivity.access$200(SuggestActivity.this).getText().toString();
            SuggestActivity.access$900(SuggestActivity.this).city = SuggestActivity.access$300(SuggestActivity.this).getText().toString();
            SuggestActivity.access$900(SuggestActivity.this).state = SuggestActivity.access$400(SuggestActivity.this).getText().toString();
            SuggestActivity.access$900(SuggestActivity.this).zip = SuggestActivity.access$500(SuggestActivity.this).getText().toString();
            SuggestActivity.access$900(SuggestActivity.this).historicalSignificance = SuggestActivity.access$700(SuggestActivity.this).getText().toString();
            (new dressLookupTask(SuggestActivity.this)).execute(new String[] {
                SuggestActivity.access$900(SuggestActivity.this).getAddressForSearch()
            });
            return;
        } else
        {
            SuggestActivity.access$1000(SuggestActivity.this, view);
            return;
        }
    }

    dressLookupTask()
    {
        this$0 = SuggestActivity.this;
        super();
    }
}
