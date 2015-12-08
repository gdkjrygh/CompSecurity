// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.facebook.internal:
//            o

final class a
    implements android.view..OnTouchListener
{

    final o a;

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        if (!view.hasFocus())
        {
            view.requestFocus();
        }
        return false;
    }

    istener(o o1)
    {
        a = o1;
        super();
    }
}
