// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.qihoo.security.widget:
//            MaterialRippleLayout

private final class 
    implements Runnable
{

    final MaterialRippleLayout a;
    private final MotionEvent b;

    public void run()
    {
        MaterialRippleLayout.a(a, false);
        MaterialRippleLayout.a(a).onTouchEvent(b);
        MaterialRippleLayout.a(a).setPressed(true);
        if (MaterialRippleLayout.i(a))
        {
            MaterialRippleLayout.j(a);
        }
    }
}
