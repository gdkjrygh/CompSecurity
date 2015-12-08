// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelVideoActivity

class this._cls0
    implements android.view.oActivity._cls6
{

    final AdMarvelVideoActivity this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            onUserInteraction();
        }
        return false;
    }

    ()
    {
        this$0 = AdMarvelVideoActivity.this;
        super();
    }
}
