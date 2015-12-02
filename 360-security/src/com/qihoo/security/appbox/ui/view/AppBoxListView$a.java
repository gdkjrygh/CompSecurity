// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.ui.view;

import android.view.MotionEvent;

// Referenced classes of package com.qihoo.security.appbox.ui.view:
//            AppBoxListView

class r extends android.view.impleOnGestureListener
{

    final AppBoxListView a;

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        if (f1 != 0.0F)
        {
            if (f == 0.0F);
        }
        return Math.abs(f1) >= Math.abs(f);
    }

    r(AppBoxListView appboxlistview)
    {
        a = appboxlistview;
        super();
    }
}
