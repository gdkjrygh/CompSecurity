// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.android;

import com.flurry.sdk.lc;

// Referenced classes of package com.flurry.android:
//            FlurryAgent, FlurryAgentListener

class a
    implements Runnable
{

    final lc a;
    final ner.onSessionStarted b;

    public void run()
    {
        a[a.c.a()];
        JVM INSTR tableswitch 1 1: default 32
    //                   1 33;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (FlurryAgent.a() != null)
        {
            FlurryAgent.a().onSessionStarted();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    ner(ner ner, lc lc1)
    {
        b = ner;
        a = lc1;
        super();
    }
}
