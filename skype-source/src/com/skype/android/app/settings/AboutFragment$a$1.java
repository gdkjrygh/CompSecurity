// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.gesture.Gesture;
import android.gesture.GestureLibrary;
import android.gesture.GestureOverlayView;
import android.gesture.Prediction;
import android.support.v4.app.l;
import android.support.v4.app.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.skype.android.app.settings:
//            AboutFragment, AboutCreditsFragment

final class this._cls1
    implements android.gesture..OnGesturePerformedListener
{

    final nt this$1;

    public final void onGesturePerformed(GestureOverlayView gestureoverlayview, Gesture gesture)
    {
        gestureoverlayview = cess._mth100(this._cls1.this).recognize(gesture).iterator();
        do
        {
            if (!gestureoverlayview.hasNext())
            {
                break;
            }
            if (((Prediction)gestureoverlayview.next()).score > 2D)
            {
                gesture = getFragmentManager().a();
                gesture.a(0x1020002, new AboutCreditsFragment());
                gesture.a(com/skype/android/app/settings/AboutCreditsFragment.getName());
                gesture.a();
            }
        } while (true);
    }

    nt()
    {
        this$1 = this._cls1.this;
        super();
    }
}
