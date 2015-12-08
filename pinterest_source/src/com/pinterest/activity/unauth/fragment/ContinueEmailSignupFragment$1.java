// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.unauth.fragment;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.pinterest.activity.unauth.fragment:
//            ContinueEmailSignupFragment

class this._cls0
    implements android.widget.r
{

    final ContinueEmailSignupFragment this$0;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (keyevent != null && keyevent.getKeyCode() == 66)
        {
            ContinueEmailSignupFragment.access$000(ContinueEmailSignupFragment.this);
        }
        return false;
    }

    ()
    {
        this$0 = ContinueEmailSignupFragment.this;
        super();
    }
}
