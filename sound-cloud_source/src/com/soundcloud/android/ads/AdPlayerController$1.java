// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.android.model.Urn;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.ads:
//            AdPlayerController

class this._cls0
    implements f
{

    final AdPlayerController this$0;

    public Boolean call(ate ate)
    {
        boolean flag;
        if (ate.access._mth000(ate) && !AdPlayerController.access$200(AdPlayerController.this).equals(ate.access._mth100(ate)))
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
        this$0 = AdPlayerController.this;
        super();
    }
}
