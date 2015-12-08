// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.roidapp.photogrid.release:
//            ImageSelector

final class jr
    implements android.view.View.OnTouchListener
{

    final ImageSelector a;

    jr(ImageSelector imageselector)
    {
        a = imageselector;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        if (ImageSelector.C(a).getVisibility() == 0)
        {
            ImageSelector.C(a).setVisibility(8);
        }
        return false;
    }
}
