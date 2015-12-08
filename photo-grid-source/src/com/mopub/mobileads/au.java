// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.os.Handler;
import android.widget.VideoView;
import com.mopub.network.TrackingRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.mopub.mobileads:
//            VastVideoViewController, VastTracker, aq

final class au
    implements Runnable
{

    final VastVideoViewController a;

    au(VastVideoViewController vastvideoviewcontroller)
    {
        a = vastvideoviewcontroller;
        super();
    }

    public final void run()
    {
        int i = VastVideoViewController.d(a).getDuration();
        int j = VastVideoViewController.d(a).getCurrentPosition();
        if (i > 0)
        {
            Object obj = VastVideoViewController.a(a, j, i);
            if (!((List) (obj)).isEmpty())
            {
                ArrayList arraylist = new ArrayList();
                VastTracker vasttracker;
                for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); vasttracker.setTracked())
                {
                    vasttracker = (VastTracker)((Iterator) (obj)).next();
                    arraylist.add(vasttracker.getTrackingUrl());
                }

                TrackingRequest.makeTrackingHttpRequest(arraylist, a.g());
            }
            if (VastVideoViewController.a(VastVideoViewController.d(a).getDuration()) || VastVideoViewController.e(a) && VastVideoViewController.f(a) < VastVideoViewController.d(a).getDuration())
            {
                VastVideoViewController.g(a).b(VastVideoViewController.f(a) - VastVideoViewController.d(a).getCurrentPosition());
            }
            if (VastVideoViewController.h(a))
            {
                VastVideoViewController.i(a);
            }
        }
        VastVideoViewController.g(a).a(VastVideoViewController.d(a).getDuration() - VastVideoViewController.d(a).getCurrentPosition());
        if (VastVideoViewController.j(a))
        {
            VastVideoViewController.l(a).postDelayed(VastVideoViewController.k(a), 50L);
        }
    }
}
