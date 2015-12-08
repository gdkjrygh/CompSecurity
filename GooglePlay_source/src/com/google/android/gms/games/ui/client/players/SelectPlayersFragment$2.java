// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.players;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.gms.games.ui.client.ClientFragmentActivity;

// Referenced classes of package com.google.android.gms.games.ui.client.players:
//            SelectPlayersFragment

final class this._cls0
    implements android.view.er
{

    final SelectPlayersFragment this$0;

    public final void onFocusChange(View view, boolean flag)
    {
        if (!flag)
        {
            ((InputMethodManager)SelectPlayersFragment.access$300(SelectPlayersFragment.this).getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    ()
    {
        this$0 = SelectPlayersFragment.this;
        super();
    }
}
