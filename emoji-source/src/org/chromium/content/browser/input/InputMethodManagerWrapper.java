// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser.input;

import android.content.Context;
import android.os.IBinder;
import android.os.ResultReceiver;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public class InputMethodManagerWrapper
{

    private final Context mContext;

    public InputMethodManagerWrapper(Context context)
    {
        mContext = context;
    }

    private InputMethodManager getInputMethodManager()
    {
        return (InputMethodManager)mContext.getSystemService("input_method");
    }

    public boolean hideSoftInputFromWindow(IBinder ibinder, int i, ResultReceiver resultreceiver)
    {
        return getInputMethodManager().hideSoftInputFromWindow(ibinder, i, resultreceiver);
    }

    public boolean isActive(View view)
    {
        return getInputMethodManager().isActive(view);
    }

    public boolean isWatchingCursor(View view)
    {
        return getInputMethodManager().isWatchingCursor(view);
    }

    public void restartInput(View view)
    {
        getInputMethodManager().restartInput(view);
    }

    public void showSoftInput(View view, int i, ResultReceiver resultreceiver)
    {
        getInputMethodManager().showSoftInput(view, i, resultreceiver);
    }

    public void updateCursor(View view, int i, int j, int k, int l)
    {
        getInputMethodManager().updateCursor(view, i, j, k, l);
    }

    public void updateSelection(View view, int i, int j, int k, int l)
    {
        getInputMethodManager().updateSelection(view, i, j, k, l);
    }
}
