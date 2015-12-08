// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.wallet.util.view.Views;
import com.google.common.base.Strings;

// Referenced classes of package com.google.android.apps.wallet.wobs.add:
//            SearchProgramsFragment

final class val.view
    implements android.widget.stener
{

    final SearchProgramsFragment this$0;
    final View val$view;

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 5)
        {
            if (textview.getText() != null && !Strings.isNullOrEmpty(textview.getText().toString()))
            {
                Views.hideSoftKeyboard(getActivity(), val$view);
                textview = textview.getText().toString();
                SearchProgramsFragment.access$100(SearchProgramsFragment.this).onMerchantNameEntered(textview);
            }
            return true;
        } else
        {
            return false;
        }
    }

    archProgramsCallback()
    {
        this$0 = final_searchprogramsfragment;
        val$view = View.this;
        super();
    }
}
