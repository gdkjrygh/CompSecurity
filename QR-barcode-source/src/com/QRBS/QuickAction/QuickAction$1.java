// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.QuickAction;

import android.view.animation.Interpolator;

// Referenced classes of package com.QRBS.QuickAction:
//            QuickAction

class this._cls0
    implements Interpolator
{

    final QuickAction this$0;

    public float getInterpolation(float f)
    {
        f = 1.55F * f - 1.1F;
        return 1.2F - f * f;
    }

    ()
    {
        this$0 = QuickAction.this;
        super();
    }
}
