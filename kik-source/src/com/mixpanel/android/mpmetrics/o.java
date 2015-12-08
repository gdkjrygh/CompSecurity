// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.MotionEvent;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            k, InAppNotification

final class o
    implements android.view.GestureDetector.OnGestureListener
{

    final k a;

    o(k k1)
    {
        a = k1;
        super();
    }

    public final boolean onDown(MotionEvent motionevent)
    {
        return true;
    }

    public final boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        if (f1 > 0.0F)
        {
            k.a(a);
        }
        return true;
    }

    public final void onLongPress(MotionEvent motionevent)
    {
    }

    public final boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        return false;
    }

    public final void onShowPress(MotionEvent motionevent)
    {
    }

    public final boolean onSingleTapUp(MotionEvent motionevent)
    {
        motionevent = k.c(a).c().i();
        if (motionevent != null && motionevent.length() > 0)
        {
            try
            {
                motionevent = Uri.parse(motionevent);
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent)
            {
                return true;
            }
            try
            {
                motionevent = new Intent("android.intent.action.VIEW", motionevent);
                k.e(a).startActivity(motionevent);
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent) { }
        }
        k.a(a);
        return true;
    }
}
