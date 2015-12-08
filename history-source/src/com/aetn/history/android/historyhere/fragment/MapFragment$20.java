// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import android.support.v4.app.FragmentActivity;
import android.view.inputmethod.InputMethodManager;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            MapFragment

class this._cls0
    implements Runnable
{

    final MapFragment this$0;

    public void run()
    {
        ((InputMethodManager)getActivity().getSystemService("input_method")).showSoftInput(MapFragment.access$2000(MapFragment.this), 0);
    }

    ()
    {
        this$0 = MapFragment.this;
        super();
    }
}
