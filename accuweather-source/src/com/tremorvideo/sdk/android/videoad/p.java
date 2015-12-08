// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.widget.RelativeLayout;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            o

class p
    implements Runnable
{

    final o a;

    p(o o1)
    {
        a = o1;
        super();
    }

    public void run()
    {
        a.o.requestLayout();
        a.o.invalidate();
    }
}
