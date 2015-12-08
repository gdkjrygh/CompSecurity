// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            b

class a extends TimerTask
{

    final b a;

    public void run()
    {
        a.d.cancel();
        a.d.purge();
        a.d = null;
        b.a(a);
    }

    (b b1)
    {
        a = b1;
        super();
    }
}
