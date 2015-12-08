// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation.view;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

// Referenced classes of package com.pinterest.activity.conversation.view:
//            PeopleSearchEditText

class this._cls0 extends InputConnectionWrapper
{

    final PeopleSearchEditText this$0;

    public boolean deleteSurroundingText(int i, int j)
    {
        if (getText().length() == 0)
        {
            dispatchKeyEvent(new KeyEvent(0, 67));
        }
        return super.deleteSurroundingText(i, j);
    }

    public (InputConnection inputconnection, boolean flag)
    {
        this$0 = PeopleSearchEditText.this;
        super(inputconnection, flag);
    }
}
