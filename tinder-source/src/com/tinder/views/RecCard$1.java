// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.view.MotionEvent;
import android.view.View;
import com.tinder.e.at;
import com.tinder.e.d;

// Referenced classes of package com.tinder.views:
//            RecCard

class this._cls0
    implements at
{

    final RecCard this$0;

    public void onClick(MotionEvent motionevent, View view)
    {
        motionevent = RecCard.access$000(RecCard.this);
        if (motionevent != null)
        {
            motionevent.a(RecCard.this);
        }
    }

    ()
    {
        this$0 = RecCard.this;
        super();
    }
}
