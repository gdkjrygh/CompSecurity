// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend;

import android.view.KeyEvent;
import android.widget.TextView;
import com.pinterest.base.Device;
import com.pinterest.ui.ViewHelper;

// Referenced classes of package com.pinterest.activity.findfriend:
//            FindFriendsContactFragment

class this._cls0
    implements android.widget.er
{

    final FindFriendsContactFragment this$0;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (ViewHelper.isKeyboardAction(3, i, keyevent))
        {
            textview.clearFocus();
            Device.hideSoftKeyboard(textview);
            return true;
        } else
        {
            return false;
        }
    }

    ()
    {
        this$0 = FindFriendsContactFragment.this;
        super();
    }
}
