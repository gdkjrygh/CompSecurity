// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.lyft.scoop;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

final class Keyboard
{

    private static InputMethodManager a(Context context)
    {
        return (InputMethodManager)context.getSystemService("input_method");
    }

    public static void a(Context context, IBinder ibinder)
    {
        a(context).hideSoftInputFromWindow(ibinder, 0);
    }

    public static void a(View view)
    {
        a(view.getContext(), view.getWindowToken());
    }
}
