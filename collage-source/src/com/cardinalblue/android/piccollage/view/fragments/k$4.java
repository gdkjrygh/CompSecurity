// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            k

class a
    implements android.view..OnTouchListener
{

    final k a;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        k.g(a).onTouchEvent(motionevent);
        return view.onTouchEvent(motionevent);
    }

    (k k1)
    {
        a = k1;
        super();
    }
}
