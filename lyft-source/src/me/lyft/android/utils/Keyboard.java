// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import java.security.InvalidParameterException;

public final class Keyboard
{

    public Keyboard()
    {
    }

    private static InputMethodManager getInputManager(Context context)
    {
        return (InputMethodManager)context.getSystemService("input_method");
    }

    private static Window getWindow(Context context)
    {
        if (context instanceof Activity)
        {
            return ((Activity)context).getWindow();
        }
        if (context instanceof ContextWrapper)
        {
            return getWindow(((ContextWrapper)context).getBaseContext());
        } else
        {
            throw new InvalidParameterException("Cannot find activity context");
        }
    }

    private static void hideKeyboard(Context context, IBinder ibinder)
    {
        getInputManager(context).hideSoftInputFromWindow(ibinder, 0);
    }

    public static void hideKeyboard(View view)
    {
        hideKeyboard(view.getContext(), view.getWindowToken());
    }

    public static void hideOnStart(View view)
    {
        setSoftInputMode(view, 51);
    }

    private static void setSoftInputMode(View view, int i)
    {
        getWindow(view.getContext()).setSoftInputMode(i);
    }

    public static void showKeyboard(final View paramView)
    {
        paramView.requestFocus();
        paramView.post(new Runnable() {

            final View val$paramView;

            public void run()
            {
                Keyboard.getInputManager(paramView.getContext()).showSoftInput(paramView, 0);
            }

            
            {
                paramView = view;
                super();
            }
        });
    }

    public static void showOnStart(View view)
    {
        setSoftInputMode(view, 16);
    }

}
