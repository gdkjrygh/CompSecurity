// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.view;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.facebook.ads.internal.view:
//            d

class a
    implements android.view..OnTouchListener
{

    final d a;
    final d b;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 1 && a.getVideoURI() != null)
        {
            b.a();
            return true;
        } else
        {
            return false;
        }
    }

    (d d1, d d2)
    {
        b = d1;
        a = d2;
        super();
    }
}
