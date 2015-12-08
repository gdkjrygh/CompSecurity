// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.dialog;

import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.pinterest.adapter.InterestListAdapter;
import com.pinterest.ui.grid.AdapterFooterView;

// Referenced classes of package com.pinterest.activity.user.dialog:
//            AddInterestView

class this._cls0
    implements TextWatcher
{

    final AddInterestView this$0;

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
label0:
        {
            if (_divider != null)
            {
                AddInterestView.access$000(AddInterestView.this).removeCallbacksAndMessages(null);
                if (charsequence.length() <= 0)
                {
                    break label0;
                }
                charsequence = charsequence.toString();
                AddInterestView.access$100(AddInterestView.this, charsequence);
                _divider.setVisibility(0);
            }
            return;
        }
        _divider.setVisibility(8);
        AddInterestView.access$200(AddInterestView.this).setDataSource(null);
        AdapterFooterView.setState(AddInterestView.access$300(AddInterestView.this), 2);
    }

    ()
    {
        this$0 = AddInterestView.this;
        super();
    }
}
