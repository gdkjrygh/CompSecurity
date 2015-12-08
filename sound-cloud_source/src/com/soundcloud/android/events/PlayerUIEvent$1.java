// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import rx.b.f;

// Referenced classes of package com.soundcloud.android.events:
//            PlayerUIEvent

final class 
    implements f
{

    public final Boolean call(PlayerUIEvent playeruievent)
    {
        boolean flag = true;
        if (playeruievent.getKind() != 1)
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public final volatile Object call(Object obj)
    {
        return call((PlayerUIEvent)obj);
    }

    ()
    {
    }
}
