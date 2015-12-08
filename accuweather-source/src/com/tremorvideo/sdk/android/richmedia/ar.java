// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.richmedia;


// Referenced classes of package com.tremorvideo.sdk.android.richmedia:
//            aq, ao

class ar
    implements Runnable
{

    final aq a;

    ar(aq aq1)
    {
        a = aq1;
        super();
    }

    public void run()
    {
        String s = a.a.l;
        a.a.l = null;
        ao.a(a.a, s);
    }
}
