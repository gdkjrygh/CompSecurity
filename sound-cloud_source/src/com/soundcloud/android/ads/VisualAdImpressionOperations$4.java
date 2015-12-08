// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import rx.b.f;

// Referenced classes of package com.soundcloud.android.ads:
//            VisualAdImpressionOperations

class this._cls0
    implements f
{

    final VisualAdImpressionOperations this$0;

    public Boolean call(ate ate)
    {
        boolean flag;
        if (!VisualAdImpressionOperations.access$300(VisualAdImpressionOperations.this) && ate.access._mth400(ate) && ate.access._mth500(ate) && ate.access._mth600(ate))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public volatile Object call(Object obj)
    {
        return call((ate)obj);
    }

    ate()
    {
        this$0 = VisualAdImpressionOperations.this;
        super();
    }
}
