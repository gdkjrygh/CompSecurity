// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.widget;

import android.support.v4.view.KeyEventCompat;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;

// Referenced classes of package com.actionbarsherlock.widget:
//            SearchView

class this._cls0
    implements android.view.tener
{

    final SearchView this$0;

    public boolean onKey(View view, int i, KeyEvent keyevent)
    {
        if (SearchView.access$13(SearchView.this) != null)
        {
            if (SearchView.access$11(SearchView.this).isPopupShowing() && SearchView.access$11(SearchView.this).getListSelection() != -1)
            {
                return SearchView.access$14(SearchView.this, view, i, keyevent);
            }
            if (!archAutoComplete.access._mth0(SearchView.access$11(SearchView.this)) && KeyEventCompat.hasNoModifiers(keyevent))
            {
                if (keyevent.getAction() == 1 && i == 66)
                {
                    view.cancelLongPress();
                    SearchView.access$15(SearchView.this, 0, null, SearchView.access$11(SearchView.this).getText().toString());
                    return true;
                } else
                {
                    keyevent.getAction();
                    return false;
                }
            }
        }
        return false;
    }

    archAutoComplete()
    {
        this$0 = SearchView.this;
        super();
    }
}
