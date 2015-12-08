// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.a;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.roidapp.imagelib.f;

// Referenced classes of package com.roidapp.imagelib.a:
//            i

final class r
    implements android.view.View.OnTouchListener
{

    final ImageView a;
    final i b;

    r(i i, ImageView imageview)
    {
        b = i;
        a = imageview;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() != 0) goto _L2; else goto _L1
_L1:
        a.setBackgroundResource(f.ap);
_L4:
        return false;
_L2:
        if (motionevent.getAction() == 1)
        {
            a.setBackgroundResource(f.ao);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
