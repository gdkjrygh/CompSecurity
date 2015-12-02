// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.nux;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.facebook.orca.nux:
//            NuxScrimView

class g
    implements android.view.View.OnTouchListener
{

    final NuxScrimView a;

    g(NuxScrimView nuxscrimview)
    {
        a = nuxscrimview;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        return NuxScrimView.a(a, motionevent);
    }
}
