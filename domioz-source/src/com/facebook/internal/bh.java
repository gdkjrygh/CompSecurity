// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.facebook.internal:
//            bd

final class bh
    implements android.view.View.OnTouchListener
{

    final bd a;

    bh(bd bd)
    {
        a = bd;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        if (!view.hasFocus())
        {
            view.requestFocus();
        }
        return false;
    }
}
