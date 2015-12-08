// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.aetn.history.android.historyhere.view.SuggestActivity;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            ListViewFragment

class this._cls0
    implements android.view.r
{

    final ListViewFragment this$0;

    public void onClick(View view)
    {
        view = new Intent(getActivity(), com/aetn/history/android/historyhere/view/SuggestActivity);
        view.putExtra("called_from", "map");
        getActivity().startActivity(view);
    }

    ()
    {
        this$0 = ListViewFragment.this;
        super();
    }
}
