// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.widget;

import android.graphics.Rect;
import android.view.View;

public final class WidgetUtil
{

    private static int tempLocation[] = new int[2];
    private static Rect tempRect = new Rect();
    private static Rect tempRect2 = new Rect();

    public static boolean isVisibleOnScreen(View view)
    {
        return view.getGlobalVisibleRect(tempRect);
    }

}
