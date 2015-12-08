// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

// Referenced classes of package com.pinterest.activity.search.ui:
//            GuidedSearchBar

class this._cls0
    implements android.view.
{

    final GuidedSearchBar this$0;

    public boolean onKey(View view, int i, KeyEvent keyevent)
    {
        if (i == 4 && _queryText.hasFocus())
        {
            loseFocus();
        }
        return false;
    }

    ()
    {
        this$0 = GuidedSearchBar.this;
        super();
    }
}
