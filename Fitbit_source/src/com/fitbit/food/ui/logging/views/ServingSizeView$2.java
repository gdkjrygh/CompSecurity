// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.logging.views;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.fitbit.food.ui.logging.views:
//            ServingSizeView

class a
    implements android.view.er
{

    final ServingSizeView a;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        ServingSizeView.a(a, true);
        return false;
    }

    (ServingSizeView servingsizeview)
    {
        a = servingsizeview;
        super();
    }
}
