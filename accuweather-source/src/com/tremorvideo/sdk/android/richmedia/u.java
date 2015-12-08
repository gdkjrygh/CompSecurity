// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.richmedia;


// Referenced classes of package com.tremorvideo.sdk.android.richmedia:
//            o

class u
    implements Runnable
{

    final String a;
    final o b;

    u(o o1, String s)
    {
        b = o1;
        a = s;
        super();
    }

    public void run()
    {
        b.g.a(a);
    }
}
