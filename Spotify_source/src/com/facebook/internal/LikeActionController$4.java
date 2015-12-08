// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import aqo;

// Referenced classes of package com.facebook.internal:
//            LikeActionController

final class b
    implements Runnable
{

    private aqo a;
    private LikeActionController b;

    public final void run()
    {
        a.a(b);
    }

    (aqo aqo1, LikeActionController likeactioncontroller)
    {
        a = aqo1;
        b = likeactioncontroller;
        super();
    }
}
