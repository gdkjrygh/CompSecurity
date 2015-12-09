// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.paste.widget;

import android.view.MotionEvent;

// Referenced classes of package com.spotify.android.paste.widget:
//            HeaderView

final class stener extends android.view.or.SimpleOnGestureListener
{

    public final boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        return Math.abs(f) > Math.abs(f1);
    }

    stener()
    {
    }
}
