// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.widget;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.actionbarsherlock.widget:
//            SearchView

class this._cls0
    implements TextWatcher
{

    final SearchView this$0;

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        SearchView.access$2100(SearchView.this, charsequence);
    }

    ()
    {
        this$0 = SearchView.this;
        super();
    }
}
