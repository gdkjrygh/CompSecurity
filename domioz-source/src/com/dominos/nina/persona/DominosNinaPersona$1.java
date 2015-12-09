// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import android.content.Context;
import android.widget.FrameLayout;

// Referenced classes of package com.dominos.nina.persona:
//            DominosNinaPersona

class this._cls0 extends FrameLayout
{

    final DominosNinaPersona this$0;

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        ninaViewParentReference = null;
    }

    (Context context)
    {
        this$0 = DominosNinaPersona.this;
        super(context);
    }
}
