// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelVideoActivity

class this._cls0
    implements android.view.oActivity._cls7
{

    final AdMarvelVideoActivity this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            view = (LinearLayout)findViewById(AdMarvelVideoActivity.VIEW_ID);
            if (AdMarvelVideoActivity.access$7(AdMarvelVideoActivity.this) && view != null && AdMarvelVideoActivity.access$19(AdMarvelVideoActivity.this) && videoState != deoPlayerState.Stopped && videoState != deoPlayerState.Finished)
            {
                onUserInteraction();
            }
        }
        return false;
    }

    deoPlayerState()
    {
        this$0 = AdMarvelVideoActivity.this;
        super();
    }
}
