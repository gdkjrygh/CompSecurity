// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.view.MotionEvent;
import android.view.View;
import com.mopub.mobileads.util.vast.VastVideoConfiguration;

// Referenced classes of package com.mopub.mobileads:
//            VastVideoViewController

final class as
    implements android.view.View.OnTouchListener
{

    final VastVideoViewController a;

    as(VastVideoViewController vastvideoviewcontroller)
    {
        a = vastvideoviewcontroller;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 1 && VastVideoViewController.a(a))
        {
            a.a(VastVideoViewController.b(a).getClickTrackers(), VastVideoViewController.b(a).getClickThroughUrl());
        }
        return true;
    }
}
