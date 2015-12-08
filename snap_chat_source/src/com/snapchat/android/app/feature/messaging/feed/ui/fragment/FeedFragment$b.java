// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.app.feature.messaging.feed.ui.fragment;

import Fi;
import pX;

// Referenced classes of package com.snapchat.android.app.feature.messaging.feed.ui.fragment:
//            FeedFragment

static final class <init>
    implements Fi
{

    private pX a;

    private void e()
    {
        if (a != null)
        {
            a.b(false);
            a = null;
        }
    }

    public final void a()
    {
        e();
    }

    public final void a(float f)
    {
    }

    public final void a(pX px)
    {
    }

    public final void a(pX px, boolean flag)
    {
        if (flag && a != px)
        {
            if (a != null)
            {
                a.b(false);
            }
            px.w();
            a = px;
        }
    }

    public final void b()
    {
        e();
    }

    public final void c()
    {
    }

    public final void d()
    {
    }

    private ()
    {
    }

    (byte byte0)
    {
        this();
    }
}
