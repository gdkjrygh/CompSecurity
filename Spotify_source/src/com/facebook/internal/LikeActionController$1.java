// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Intent;
import aqo;
import java.util.UUID;

// Referenced classes of package com.facebook.internal:
//            LikeActionController

final class c
    implements aqo
{

    private int a;
    private Intent b;
    private UUID c;

    public final void a(LikeActionController likeactioncontroller)
    {
        LikeActionController.a(likeactioncontroller, a, b, c);
    }

    (int i, Intent intent, UUID uuid)
    {
        a = i;
        b = intent;
        c = uuid;
        super();
    }
}
