// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.richmedia;


// Referenced classes of package com.tremorvideo.sdk.android.richmedia:
//            o

class q
    implements Runnable
{

    final i.a a;
    final o b;

    q(o o1, i.a a1)
    {
        b = o1;
        a = a1;
        super();
    }

    public void run()
    {
        b.g.a(Integer.toString(a.a()));
    }
}
