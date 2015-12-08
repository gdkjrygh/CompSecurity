// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.a;

import android.content.res.Resources;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.roidapp.imagelib.d;

// Referenced classes of package com.roidapp.imagelib.a:
//            i

final class s
    implements android.view.View.OnTouchListener
{

    final i a;

    s(i j)
    {
        a = j;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() != 0) goto _L2; else goto _L1
_L1:
        i.e(a).setBackgroundColor(Color.parseColor(i.c()));
_L4:
        return false;
_L2:
        if (motionevent.getAction() == 1)
        {
            i.e(a).setBackgroundColor(a.getResources().getColor(d.c));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
