// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import android.text.Editable;
import com.google.android.apps.wallet.util.text.DefaultTextWatcher;

// Referenced classes of package com.google.android.apps.wallet.wobs.add:
//            SearchProgramsFragment

final class > extends DefaultTextWatcher
{

    final SearchProgramsFragment this$0;
    final ogramSuggestionsAdapter val$autoCompleteAdapter;

    public final void afterTextChanged(Editable editable)
    {
        ogramSuggestionsAdapter ogramsuggestionsadapter = val$autoCompleteAdapter;
        if (editable.length() > 0)
        {
            editable = editable.toString();
        } else
        {
            editable = null;
        }
        ogramsuggestionsadapter.setUserEnteredMerchantName(editable);
    }

    ogramSuggestionsAdapter()
    {
        this$0 = final_searchprogramsfragment;
        val$autoCompleteAdapter = ogramSuggestionsAdapter.this;
        super();
    }
}
