// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;


// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            i

class k
    implements Runnable
{

    final i a;

    k(i j)
    {
        a = j;
        super();
    }

    public void run()
    {
        if (!i.c(a) && !i.d(a))
        {
            i.b(a);
        }
    }
}
