// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

final class val.parent
    implements Runnable
{

    final View val$delegate;
    final int val$extendPx;
    final View val$parent;

    public final void run()
    {
        Rect rect = new Rect();
        val$delegate.getHitRect(rect);
        rect.top = rect.top - val$extendPx;
        rect.left = rect.left - val$extendPx;
        rect.right = rect.right + val$extendPx;
        rect.bottom = rect.bottom + val$extendPx;
        val$parent.setTouchDelegate(new TouchDelegate(rect, val$delegate));
    }

    ()
    {
        val$delegate = view;
        val$extendPx = i;
        val$parent = view1;
        super();
    }
}
