// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            KeyboardHandwritingPopup

final class ba
    implements android.view.View.OnTouchListener
{

    final GestureDetector a;
    final KeyboardHandwritingPopup b;

    ba(KeyboardHandwritingPopup keyboardhandwritingpopup, GestureDetector gesturedetector)
    {
        b = keyboardhandwritingpopup;
        a = gesturedetector;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        a.onTouchEvent(motionevent);
        return false;
    }
}
