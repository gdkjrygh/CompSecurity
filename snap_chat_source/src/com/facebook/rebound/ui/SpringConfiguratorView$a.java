// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.rebound.ui;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.facebook.rebound.ui:
//            SpringConfiguratorView

final class <init>
    implements android.view.atorView.a
{

    private SpringConfiguratorView a;

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            SpringConfiguratorView.g(a);
        }
        return true;
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
