// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            SelectorBaseActivity

final class bi
    implements android.view.View.OnTouchListener
{

    final SelectorBaseActivity a;

    bi(SelectorBaseActivity selectorbaseactivity)
    {
        a = selectorbaseactivity;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        if (a.i != null && a.i.getVisibility() == 0)
        {
            a.i.setVisibility(8);
        }
        return false;
    }
}
