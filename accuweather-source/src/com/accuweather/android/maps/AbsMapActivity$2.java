// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.maps;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

// Referenced classes of package com.accuweather.android.maps:
//            AbsMapActivity

class this._cls0
    implements android.view.ner
{

    final AbsMapActivity this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getX() <= (float)(mPlayButton.getRight() + 10))
        {
            mPlayButton.performClick();
        }
        return false;
    }

    ()
    {
        this$0 = AbsMapActivity.this;
        super();
    }
}
