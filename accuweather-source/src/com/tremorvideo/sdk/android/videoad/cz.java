// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            cy

class cz
    implements android.view.View.OnTouchListener
{

    final cy a;

    cz(cy cy1)
    {
        a = cy1;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 1 || motionevent.getAction() == 3)
        {
            a.a = false;
        } else
        {
            a.a = true;
        }
        cy.a(a);
        view.invalidate();
        return false;
    }
}
