// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.libraries.translate.e.o;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            KeyboardHandwritingPopup

final class aw extends android.view.GestureDetector.SimpleOnGestureListener
{

    final KeyboardHandwritingPopup a;

    aw(KeyboardHandwritingPopup keyboardhandwritingpopup)
    {
        a = keyboardhandwritingpopup;
        super();
    }

    public final boolean onSingleTapUp(MotionEvent motionevent)
    {
        if (o.f)
        {
            KeyboardHandwritingPopup.a(a).drawableHotspotChanged(motionevent.getX(), motionevent.getY());
        }
        KeyboardHandwritingPopup.a(a).setPressed(true);
        a.a(null);
        return false;
    }
}
