// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

// Referenced classes of package me.lyft.android.controls:
//            AdvancedEditText

class this._cls0 extends InputConnectionWrapper
{

    final AdvancedEditText this$0;

    public boolean deleteSurroundingText(int i, int j)
    {
        boolean flag = super.deleteSurroundingText(i, j);
        if (flag && isCursorAtStart())
        {
            sendKeyEvent(new KeyEvent(0, 67));
        }
        return flag;
    }

    public (InputConnection inputconnection, boolean flag)
    {
        this$0 = AdvancedEditText.this;
        super(inputconnection, flag);
    }
}
