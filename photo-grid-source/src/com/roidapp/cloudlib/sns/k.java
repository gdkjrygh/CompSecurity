// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.roidapp.cloudlib.sns:
//            i

final class k
    implements android.view.View.OnTouchListener
{

    final View a;
    final i b;

    k(i i, View view)
    {
        b = i;
        a = view;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        return a.dispatchTouchEvent(motionevent);
    }
}
