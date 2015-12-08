// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.rebound.ui;

import com.facebook.rebound.h;
import com.facebook.rebound.l;

// Referenced classes of package com.facebook.rebound.ui:
//            SpringConfiguratorView

private final class <init>
    implements l
{

    final SpringConfiguratorView a;

    public final void onSpringActivate(h h1)
    {
    }

    public final void onSpringAtRest(h h1)
    {
    }

    public final void onSpringEndStateChange(h h1)
    {
    }

    public final void onSpringUpdate(h h1)
    {
        float f = (float)h1.d.;
        float f1 = com.facebook.rebound.ui.SpringConfiguratorView.h(a);
        float f2 = SpringConfiguratorView.i(a);
        a.setTranslationY(f * (f2 - f1) + f1);
    }

    private (SpringConfiguratorView springconfiguratorview)
    {
        a = springconfiguratorview;
        super();
    }

    a(SpringConfiguratorView springconfiguratorview, byte byte0)
    {
        this(springconfiguratorview);
    }
}
