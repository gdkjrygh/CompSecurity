// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import android.view.ViewGroup;

// Referenced classes of package com.dominos.nina.persona:
//            DominosNinaPersona, NinaView

class this._cls1
    implements Runnable
{

    final is._cls0 this$1;

    public void run()
    {
        DominosNinaPersona.access$500(_fld0).removeAllViews();
        DominosNinaPersona.access$000(_fld0).invalidate();
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
