// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments.address;

import android.view.KeyEvent;
import android.widget.Spinner;
import android.widget.TextView;

// Referenced classes of package com.dominos.fragments.address:
//            AddressOtherFragment

class this._cls0
    implements android.widget.Listener
{

    final AddressOtherFragment this$0;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        mStateSpinner.performClick();
        return true;
    }

    ()
    {
        this$0 = AddressOtherFragment.this;
        super();
    }
}
