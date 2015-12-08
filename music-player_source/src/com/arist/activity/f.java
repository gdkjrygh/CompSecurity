// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.arist.activity:
//            EqualizerActivity

final class f
    implements android.view.View.OnTouchListener
{

    final EqualizerActivity a;

    f(EqualizerActivity equalizeractivity)
    {
        a = equalizeractivity;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        return true;
    }
}
