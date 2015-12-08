// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.tinder.c:
//            n

final class <init>
    implements android.view..OnTouchListener
{

    final Runnable a;
    final n b;

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        switch (motionevent.getActionMasked())
        {
        default:
            return false;

        case 0: // '\0'
            n.a(b, true);
            n.k(b).removeCallbacks(a);
            return false;

        case 1: // '\001'
            n.a(b, false);
            break;
        }
        n.k(b).postDelayed(a, 8000L);
        return false;
    }

    e(n n1, Runnable runnable)
    {
        b = n1;
        a = runnable;
        super();
    }
}
