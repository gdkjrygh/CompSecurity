// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.autocomplete.AutoCompleteTile;

// Referenced classes of package com.google.android.apps.wallet.wobs.add:
//            SearchProgramsFragment, Program

final class this._cls0
    implements android.widget.stener
{

    final SearchProgramsFragment this$0;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        Views.hideSoftKeyboard(getActivity(), view);
        adapterview = (Program)adapterview.getAdapter().getItem(i);
        if (adapterview == null)
        {
            adapterview = SearchProgramsFragment.access$000(SearchProgramsFragment.this).getText().toString();
            SearchProgramsFragment.access$100(SearchProgramsFragment.this).onMerchantNameSelected(adapterview);
            return;
        } else
        {
            SearchProgramsFragment.access$100(SearchProgramsFragment.this).onDiscoverableProgramSelected(adapterview);
            return;
        }
    }

    archProgramsCallback()
    {
        this$0 = SearchProgramsFragment.this;
        super();
    }
}
