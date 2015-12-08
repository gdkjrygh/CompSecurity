// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.utils;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

// Referenced classes of package me.lyft.android.utils:
//            Keyboard

final class val.paramView
    implements Runnable
{

    final View val$paramView;

    public void run()
    {
        Keyboard.access$000(val$paramView.getContext()).showSoftInput(val$paramView, 0);
    }

    hodManager()
    {
        val$paramView = view;
        super();
    }
}
