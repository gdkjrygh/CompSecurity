// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.gesture.Gesture;
import android.gesture.GestureLibraries;
import android.gesture.GestureLibrary;
import android.gesture.GestureOverlayView;
import android.gesture.Prediction;
import android.support.v4.app.l;
import android.support.v4.app.o;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.skype.android.app.settings:
//            AboutFragment, AboutCreditsFragment

final class this._cls0
{

    private GestureLibrary gestureLib;
    final AboutFragment this$0;

    public final View getView(View view)
    {
        GestureOverlayView gestureoverlayview = new GestureOverlayView(view.getContext());
        gestureoverlayview.addView(view);
        gestureoverlayview.setGestureVisible(false);
        gestureoverlayview.addOnGesturePerformedListener(new android.gesture.GestureOverlayView.OnGesturePerformedListener() {

            final AboutFragment.a this$1;

            public final void onGesturePerformed(GestureOverlayView gestureoverlayview1, Gesture gesture)
            {
                gestureoverlayview1 = gestureLib.recognize(gesture).iterator();
                do
                {
                    if (!gestureoverlayview1.hasNext())
                    {
                        break;
                    }
                    if (((Prediction)gestureoverlayview1.next()).score > 2D)
                    {
                        gesture = getFragmentManager().a();
                        gesture.a(0x1020002, new AboutCreditsFragment());
                        gesture.a(com/skype/android/app/settings/AboutCreditsFragment.getName());
                        gesture.a();
                    }
                } while (true);
            }

            
            {
                this$1 = AboutFragment.a.this;
                super();
            }
        });
        gestureLib = GestureLibraries.fromRawResource(view.getContext(), 0x7f07001d);
        gestureLib.load();
        return gestureoverlayview;
    }


    _cls1.this._cls1()
    {
        this$0 = AboutFragment.this;
        super();
    }
}
