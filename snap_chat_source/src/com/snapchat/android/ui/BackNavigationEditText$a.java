// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

// Referenced classes of package com.snapchat.android.ui:
//            BackNavigationEditText

final class init> extends InputConnectionWrapper
{

    private BackNavigationEditText a;

    public final boolean deleteSurroundingText(int i, int j)
    {
        if (android.os.onEditText.a >= 14 && android.os.onEditText.a < 19 && i == 1 && j == 0)
        {
            return sendKeyEvent(new KeyEvent(0, 67)) && sendKeyEvent(new KeyEvent(1, 67));
        } else
        {
            return super.deleteSurroundingText(i, j);
        }
    }

    public final boolean sendKeyEvent(KeyEvent keyevent)
    {
        if (keyevent.getAction() == 0 && keyevent.getKeyCode() == 67 && a.a())
        {
            return false;
        } else
        {
            return super.sendKeyEvent(keyevent);
        }
    }

    public (BackNavigationEditText backnavigationedittext, InputConnection inputconnection)
    {
        a = backnavigationedittext;
        super(inputconnection, true);
    }
}
