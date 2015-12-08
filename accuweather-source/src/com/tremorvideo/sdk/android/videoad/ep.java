// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;


// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            eb, ez, ea

class ep
    implements co.b
{

    final ea a;
    final com.tremorvideo.a.b.a b;
    final eb c;

    ep(eb eb1, ea ea, com.tremorvideo.a.b.a a1)
    {
        c = eb1;
        a = ea;
        b = a1;
        super();
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            eb.a(c, true);
            return;
        } else
        {
            ez.a(c.b, a, b);
            return;
        }
    }
}
