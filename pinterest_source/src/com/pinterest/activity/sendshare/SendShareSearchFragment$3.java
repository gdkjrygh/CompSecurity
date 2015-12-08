// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendshare;

import com.pinterest.ui.ViewHelper;

// Referenced classes of package com.pinterest.activity.sendshare:
//            SendShareSearchFragment

class this._cls0
    implements com.pinterest.base.rchFragment._cls3
{

    final SendShareSearchFragment this$0;

    public void onEventMainThread(rchEditTextFocusEvent rchedittextfocusevent)
    {
        android.view.ViewGroup viewgroup = _sendableObjectContainer;
        boolean flag;
        if (!rchedittextfocusevent.hasFocus)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ViewHelper.setVisibility(viewgroup, flag);
    }

    rchEditTextFocusEvent()
    {
        this$0 = SendShareSearchFragment.this;
        super();
    }
}
