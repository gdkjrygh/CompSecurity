// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.Button;

// Referenced classes of package com.millennialmedia.android:
//            AdViewOverlayView

private static class right
    implements Runnable
{

    int bottom;
    private final Button closeButton;
    int left;
    int right;
    int top;

    public void run()
    {
        Object obj = new Rect();
        closeButton.getHitRect(((Rect) (obj)));
        obj.top = ((Rect) (obj)).top + top;
        obj.right = ((Rect) (obj)).right + right;
        obj.bottom = ((Rect) (obj)).bottom + bottom;
        obj.left = ((Rect) (obj)).left + left;
        obj = new TouchDelegate(((Rect) (obj)), closeButton);
        if (android/view/View.isInstance(closeButton.getParent()))
        {
            ((View)closeButton.getParent()).setTouchDelegate(((TouchDelegate) (obj)));
        }
    }

    (Button button, int i, int j, int k, int l)
    {
        closeButton = button;
        top = i;
        left = j;
        bottom = k;
        right = l;
    }
}
