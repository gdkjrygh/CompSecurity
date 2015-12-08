// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.app.feature.messaging.feed.ui.fragment;

import Fi;
import android.graphics.Color;
import android.os.Handler;
import pX;

// Referenced classes of package com.snapchat.android.app.feature.messaging.feed.ui.fragment:
//            FeedFragment

static final class <init>
    implements Fi
{

    private pX a;
    private boolean b;
    private Handler c;

    public final void a()
    {
    }

    public final void a(float f)
    {
        if (a == null) goto _L2; else goto _L1
_L1:
        pX px = a;
        if (f <= 1.0F) goto _L4; else goto _L3
_L3:
        float f1 = 1.0F;
_L6:
        int i = (int)((float)px.l + (float)px.m * f1);
        px.c(Color.rgb(i, i, i));
_L2:
        return;
_L4:
        f1 = f;
        if (f < 0.0F)
        {
            f1 = 0.0F;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(pX px)
    {
        b = false;
        c.postDelayed(new Runnable(px) {

            private pX a;
            private FeedFragment.c b;

            public final void run()
            {
                b.b(a);
            }

            
            {
                b = FeedFragment.c.this;
                a = px;
                super();
            }
        }, 120L);
    }

    public final void a(pX px, boolean flag)
    {
        b = true;
        c.removeCallbacksAndMessages(null);
        b(px);
        if (!flag)
        {
            c.postDelayed(new Runnable() {

                private FeedFragment.c a;

                public final void run()
                {
                    a.a(false);
                }

            
            {
                a = FeedFragment.c.this;
                super();
            }
            }, 100L);
        }
    }

    final void a(boolean flag)
    {
        if (a != null)
        {
            a.b(flag);
            a = null;
        }
    }

    public final void b()
    {
        a(true);
    }

    final void b(pX px)
    {
        if (a == px)
        {
            return;
        }
        if (a != null)
        {
            a.b(false);
        }
        px.w();
        a = px;
    }

    public final void c()
    {
        c.removeCallbacksAndMessages(null);
        a(false);
    }

    public final void d()
    {
        if (!b)
        {
            c.removeCallbacksAndMessages(null);
            a(false);
        }
    }

    private _cls2.a()
    {
        c = new Handler();
    }

    c(byte byte0)
    {
        this();
    }
}
