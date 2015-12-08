// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.roidapp.photogrid.release:
//            oa

final class of
    implements android.view.View.OnTouchListener
{

    final oa a;

    of(oa oa1)
    {
        a = oa1;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        a.a();
        return true;
    }
}
