// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.tablet;

import android.view.MotionEvent;
import p.df.a;

// Referenced classes of package com.pandora.android.tablet:
//            TabletHome

class tureListener extends android.view.or.SimpleOnGestureListener
{

    final TabletHome a;

    public boolean onDown(MotionEvent motionevent)
    {
        p.df.a.a("TabletHome", "GestureDetector --> onDown");
        return true;
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        if (!TabletHome.l(a))
        {
            com.pandora.android.tablet.TabletHome.a(a, true);
            TabletHome.j(a);
        }
        return false;
    }

    tureListener(TabletHome tablethome)
    {
        a = tablethome;
        super();
    }
}
