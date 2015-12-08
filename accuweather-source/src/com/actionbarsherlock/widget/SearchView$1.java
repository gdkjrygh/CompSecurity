// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.widget;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;

// Referenced classes of package com.actionbarsherlock.widget:
//            SearchView

class this._cls0
    implements Runnable
{

    final SearchView this$0;

    public void run()
    {
        InputMethodManager inputmethodmanager = (InputMethodManager)getContext().getSystemService("input_method");
        if (inputmethodmanager != null)
        {
            SearchView.access$000(SearchView.this, inputmethodmanager, 0);
        }
    }

    r()
    {
        this$0 = SearchView.this;
        super();
    }
}
