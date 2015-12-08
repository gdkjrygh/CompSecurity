// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.players;

import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.google.android.gms.games.ui.client.ClientFragmentActivity;

// Referenced classes of package com.google.android.gms.games.ui.client.players:
//            SelectPlayersFragment

final class val.filterText
    implements Runnable
{

    final SelectPlayersFragment this$0;
    final TextView val$filterText;

    public final void run()
    {
        val$filterText.requestFocus();
        InputMethodManager inputmethodmanager = (InputMethodManager)SelectPlayersFragment.access$300(SelectPlayersFragment.this).getSystemService("input_method");
        if (inputmethodmanager != null)
        {
            inputmethodmanager.showSoftInput(val$filterText, 0);
        }
    }

    ()
    {
        this$0 = final_selectplayersfragment;
        val$filterText = TextView.this;
        super();
    }
}
