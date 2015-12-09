// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.env;

import com.vungle.log.Logger;
import com.vungle.publisher.as;
import com.vungle.publisher.by;

// Referenced classes of package com.vungle.publisher.env:
//            SdkState

public static class  extends by
{

    SdkState a;

    public void onEvent(as as)
    {
        Logger.d("VungleEvent", "SdkState received end ad event");
        a.b(true);
    }

    ()
    {
    }
}
