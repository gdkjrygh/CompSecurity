// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.utils;

import android.view.KeyEvent;
import android.widget.TextView;

final class val.onKeyboardEnter
    implements android.widget.ctionListener
{

    final KeyboardEnter val$onKeyboardEnter;

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (keyevent != null && keyevent.getKeyCode() == 66)
        {
            val$onKeyboardEnter.callback();
        }
        return false;
    }

    KeyboardEnter()
    {
        val$onKeyboardEnter = keyboardenter;
        super();
    }
}
