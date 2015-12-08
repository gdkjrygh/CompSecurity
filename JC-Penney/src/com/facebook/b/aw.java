// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.b;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.facebook.b:
//            as

class aw
    implements android.view.View.OnTouchListener
{

    final as a;

    aw(as as)
    {
        a = as;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (!view.hasFocus())
        {
            view.requestFocus();
        }
        return false;
    }
}
