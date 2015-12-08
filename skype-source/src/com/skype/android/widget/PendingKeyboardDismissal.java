// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public abstract class PendingKeyboardDismissal
    implements android.view.View.OnLayoutChangeListener
{

    private final View anchorView;
    private final InputMethodManager imm;

    public PendingKeyboardDismissal(View view)
    {
        this((InputMethodManager)view.getContext().getSystemService("input_method"), view);
    }

    public PendingKeyboardDismissal(InputMethodManager inputmethodmanager, View view)
    {
        imm = inputmethodmanager;
        anchorView = view;
    }

    public final void hideKeyboardAndProceed()
    {
        if (imm.hideSoftInputFromWindow(anchorView.getWindowToken(), 0))
        {
            anchorView.addOnLayoutChangeListener(this);
            return;
        } else
        {
            proceed();
            return;
        }
    }

    public void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
            int k1, int l1)
    {
        anchorView.removeOnLayoutChangeListener(this);
        proceed();
    }

    protected abstract void proceed();
}
