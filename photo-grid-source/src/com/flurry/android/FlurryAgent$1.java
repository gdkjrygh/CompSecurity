// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.android;

import com.flurry.sdk.jo;
import com.flurry.sdk.jw;
import com.flurry.sdk.jx;
import com.flurry.sdk.lc;

final class _cls1
    implements jx
{

    public final void a(jw jw)
    {
        a((lc)jw);
    }

    public final void a(lc lc1)
    {
        class _cls1
            implements Runnable
        {

            final lc a;
            final FlurryAgent._cls1 b;

            public void run()
            {
                FlurryAgent._cls2.a[a.c.ordinal()];
                JVM INSTR tableswitch 1 1: default 32
            //                           1 33;
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

            _cls1(lc lc1)
            {
                b = FlurryAgent._cls1.this;
                a = lc1;
                super();
            }
        }

        jo.a().a(new _cls1(lc1));
    }

    _cls1()
    {
    }
}
