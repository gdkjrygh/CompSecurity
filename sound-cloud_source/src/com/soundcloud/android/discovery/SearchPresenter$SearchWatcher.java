// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.soundcloud.java.strings.Strings;

// Referenced classes of package com.soundcloud.android.discovery:
//            SearchPresenter

private class <init>
    implements TextWatcher
{

    final SearchPresenter this$0;

    public void afterTextChanged(Editable editable)
    {
        if (Strings.isBlank(SearchPresenter.access$1000(SearchPresenter.this).getText().toString().trim()))
        {
            SearchPresenter.access$1100(SearchPresenter.this);
            SearchPresenter.access$1200(SearchPresenter.this);
            SearchPresenter.access$1300(SearchPresenter.this);
            return;
        } else
        {
            SearchPresenter.access$1400(SearchPresenter.this);
            SearchPresenter.access$1500(SearchPresenter.this);
            return;
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        charsequence = charsequence.toString().trim();
        if (Strings.isNotBlank(charsequence))
        {
            SearchPresenter.access$900(SearchPresenter.this, charsequence);
        }
    }

    private ()
    {
        this$0 = SearchPresenter.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
