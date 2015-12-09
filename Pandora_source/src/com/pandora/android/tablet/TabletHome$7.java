// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.tablet;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import p.df.a;

// Referenced classes of package com.pandora.android.tablet:
//            TabletHome

class a
    implements android.view.istener
{

    final GestureDetector a;
    final TabletHome b;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (a.onTouchEvent(motionevent))
        {
            return true;
        }
        if (motionevent.getAction() == 1 && TabletHome.l(b))
        {
            p.df.a.a("TabletHome", "OnTouchListener --> onTouch ACTION_UP");
            com.pandora.android.tablet.TabletHome.a(b, false);
        }
        return false;
    }

    (TabletHome tablethome, GestureDetector gesturedetector)
    {
        b = tablethome;
        a = gesturedetector;
        super();
    }
}
