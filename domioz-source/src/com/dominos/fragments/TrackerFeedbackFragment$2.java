// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

// Referenced classes of package com.dominos.fragments:
//            TrackerFeedbackFragment

class this._cls0
    implements android.view.agment._cls2
{

    final TrackerFeedbackFragment this$0;

    public void onClick(View view)
    {
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        ((InputMethodManager)getActivity().getSystemService("input_method")).toggleSoftInput(0, 1);
    }

    ()
    {
        this$0 = TrackerFeedbackFragment.this;
        super();
    }
}
