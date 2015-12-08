// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.minutecast;

import android.view.MotionEvent;
import android.view.View;
import com.accuweather.android.views.SimpleSearchView;

// Referenced classes of package com.accuweather.android.minutecast:
//            MinuteCastFlipperFragment

class this._cls0
    implements android.view.CastFlipperFragment._cls2
{

    final MinuteCastFlipperFragment this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (!MinuteCastFlipperFragment.access$500(MinuteCastFlipperFragment.this).hasFocus() && motionevent.getAction() == 0)
        {
            MinuteCastFlipperFragment.access$500(MinuteCastFlipperFragment.this).clearInput();
        }
        if (MinuteCastFlipperFragment.access$600(MinuteCastFlipperFragment.this) != null)
        {
            MinuteCastFlipperFragment.access$600(MinuteCastFlipperFragment.this).onAddressSearchFieldTapped();
        }
        return false;
    }

    inuteCastFlipperListener()
    {
        this$0 = MinuteCastFlipperFragment.this;
        super();
    }
}
