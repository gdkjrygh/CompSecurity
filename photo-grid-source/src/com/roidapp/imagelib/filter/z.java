// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;

// Referenced classes of package com.roidapp.imagelib.filter:
//            s

public final class z extends FrameLayout
{

    final s a;

    public z(s s1, Context context)
    {
        this(s1, context, (byte)0);
    }

    private z(s s1, Context context, byte byte0)
    {
        this(s1, context, '\0');
    }

    private z(s s1, Context context, char c)
    {
        a = s1;
        super(context, null, 0);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        if (!s.e(a))
        {
            return true;
        } else
        {
            return super.dispatchTouchEvent(motionevent);
        }
    }
}
