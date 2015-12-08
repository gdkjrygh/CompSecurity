// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.widget.RelativeLayout;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            q, o

class r
    implements Runnable
{

    final q a;

    r(q q1)
    {
        a = q1;
        super();
    }

    public void run()
    {
        a.c.o.removeView(a.a);
    }
}
