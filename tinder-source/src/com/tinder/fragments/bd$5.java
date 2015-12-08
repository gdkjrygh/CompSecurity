// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import com.tinder.model.Paywall;
import com.tinder.views.RecCard;

// Referenced classes of package com.tinder.fragments:
//            bd

final class a
    implements Runnable
{

    final bd a;

    public final void run()
    {
        if (a.getActivity() != null && (a.getActivity() instanceof Paywall))
        {
            ((Paywall)a.getActivity()).launchSwipeLimitRoadblock(bd.c(a).getRecId());
        }
    }

    (bd bd1)
    {
        a = bd1;
        super();
    }
}
