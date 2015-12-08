// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.accessibility;

import android.graphics.Rect;
import android.view.View;

// Referenced classes of package com.skype.android.util.accessibility:
//            AccessibilityUtil

final class c
    implements Runnable
{

    final View a;
    final int b;
    final View c;
    final AccessibilityUtil d;

    public final void run()
    {
        Object obj = new Rect();
        a.getHitRect(((Rect) (obj)));
        if ((b & 4) == 4)
        {
            obj.left = 0;
        }
        if ((b & 1) == 1)
        {
            obj.top = 0;
        }
        if ((b & 8) == 8)
        {
            obj.right = c.getWidth();
        }
        if ((b & 2) == 2)
        {
            obj.bottom = c.getHeight();
        }
        obj = new cessibleTouchDelegate(d, ((Rect) (obj)), a);
        c.setTouchDelegate(((android.view.TouchDelegate) (obj)));
    }

    cessibleTouchDelegate(AccessibilityUtil accessibilityutil, View view, int i, View view1)
    {
        d = accessibilityutil;
        a = view;
        b = i;
        c = view1;
        super();
    }
}
