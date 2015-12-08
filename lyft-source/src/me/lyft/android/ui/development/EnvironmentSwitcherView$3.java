// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.development;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.Filter;

// Referenced classes of package me.lyft.android.ui.development:
//            EnvironmentSwitcherView

class this._cls0
    implements TextWatcher
{

    final EnvironmentSwitcherView this$0;

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        EnvironmentSwitcherView.access$300(EnvironmentSwitcherView.this).getFilter().filter(charsequence);
    }

    ()
    {
        this$0 = EnvironmentSwitcherView.this;
        super();
    }
}
