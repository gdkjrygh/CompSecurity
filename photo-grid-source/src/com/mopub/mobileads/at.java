// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.view.View;
import com.mopub.mobileads.util.vast.VastCompanionAd;

// Referenced classes of package com.mopub.mobileads:
//            VastVideoViewController

final class at
    implements android.view.View.OnClickListener
{

    final VastVideoViewController a;

    at(VastVideoViewController vastvideoviewcontroller)
    {
        a = vastvideoviewcontroller;
        super();
    }

    public final void onClick(View view)
    {
        if (VastVideoViewController.c(a) != null)
        {
            a.a(VastVideoViewController.c(a).getClickTrackers(), VastVideoViewController.c(a).getClickThroughUrl());
        }
    }
}
