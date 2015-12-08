// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;


// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            c

class h
    implements Runnable
{

    final c a;

    h(c c1)
    {
        a = c1;
        super();
    }

    public void run()
    {
        if (!c.c(a) && c.d(a))
        {
            c.a(a, true);
        }
    }
}
