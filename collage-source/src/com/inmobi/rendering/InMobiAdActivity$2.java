// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.inmobi.rendering;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.inmobi.rendering:
//            InMobiAdActivity, RenderView

class a
    implements android.view.r
{

    final InMobiAdActivity a;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 1)
        {
            view.setBackgroundColor(0xff888888);
            InMobiAdActivity.a(a).reload();
        } else
        if (motionevent.getAction() == 0)
        {
            view.setBackgroundColor(0xff00ffff);
            return true;
        }
        return true;
    }

    (InMobiAdActivity inmobiadactivity)
    {
        a = inmobiadactivity;
        super();
    }
}
