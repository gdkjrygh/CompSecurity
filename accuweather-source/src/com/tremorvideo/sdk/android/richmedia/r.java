// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.richmedia;


// Referenced classes of package com.tremorvideo.sdk.android.richmedia:
//            o, ao, d

class r
    implements Runnable
{

    final o a;

    r(o o1)
    {
        a = o1;
        super();
    }

    public void run()
    {
        a.f.f();
        a.K.invalidate();
        a.invalidate();
    }
}
