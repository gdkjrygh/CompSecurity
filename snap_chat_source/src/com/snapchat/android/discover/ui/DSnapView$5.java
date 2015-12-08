// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui;

import Jk;
import Jr;
import KL;
import NV;
import android.animation.Animator;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.controller.MediaOpenOrigin;
import com.snapchat.android.discover.analytics.DiscoverUsageAnalytics;
import com.snapchat.android.discover.model.ChannelPage;
import com.snapchat.android.discover.model.DSnapPage;
import com.snapchat.android.ui.VerticalSwipeLayout;
import com.snapchat.android.util.eventbus.SnapCaptureContext;
import com.squareup.otto.Bus;
import gF;
import gL;
import gY;
import he;
import java.util.LinkedList;
import uz;
import vA;
import vv;
import wd;
import wk;

// Referenced classes of package com.snapchat.android.discover.ui:
//            DSnapView

final class d extends Jr
{

    private wd a;
    private boolean b;
    private com.snapchat.android.discover.model.ediaType c;
    private long d;
    private DSnapView e;

    public final void onAnimationEnd(Animator animator)
    {
        Object obj1 = e;
        Object obj2 = a;
        boolean flag4 = b;
        Object obj = c;
        long l1 = d;
        Object obj3 = ((DSnapView) (obj1)).h;
        ChannelPage channelpage = ((DSnapView) (obj1)).i;
        if (obj3 != null && channelpage != null)
        {
            int j = ((DSnapView) (obj1)).p.d(((DSnapPage) (obj3)).i);
            int l = ((DSnapView) (obj1)).p.e(((DSnapPage) (obj3)).i);
            animator = null;
            if (!flag4)
            {
                animator = ((Animator) (obj));
            }
            com.snapchat.android.discover.model.ediaType ediatype = ((wd) (obj2)).h();
            jQ jq = ((DSnapView) (obj1)).g.c.getSourceType();
            vv vv1 = new vv();
            vv1.a = channelpage.a;
            vv1.b = channelpage.b;
            vv1.c = channelpage.c;
            vv1.e = ((DSnapPage) (obj3)).a;
            vv1.d = ((DSnapPage) (obj3)).i;
            vv1.a(KL.a());
            vv1.b(KL.b());
            if (animator == com.snapchat.android.discover.model.ediaType.LOCAL_WEBPAGE)
            {
                vv1.l = true;
            }
            vv1.m = channelpage.g;
            vv1.n = channelpage.h;
            vv1.s = ((DSnapPage) (obj3)).h.intValue();
            vv1.t = j;
            vv1.u = ((DSnapPage) (obj3)).m.intValue();
            vv1.v = ((DSnapPage) (obj3)).d;
            vv1.w = ((DSnapPage) (obj3)).g;
            vv1.x = l;
            vv1.y = ediatype;
            vv1.z = animator;
            vv1.A = flag4;
            vv1.B = l1;
            vv1.C = jq;
            if (obj == com.snapchat.android.discover.model.ediaType.LOCAL_WEBPAGE)
            {
                ((DSnapView) (obj1)).f.b();
                obj = ((DSnapView) (obj1)).getRootView();
            } else
            {
                obj = ((DSnapView) (obj1)).c.getChildAt(((DSnapView) (obj1)).k());
            }
            obj = ((wd) (obj2)).a(((android.view.View) (obj)), vv1, new LinkedList());
            if (obj != null)
            {
                ((DSnapView) (obj1)).s.a(new NV(((AA) (obj)), SnapCaptureContext.DISCOVER, ((wd) (obj2)).p()));
                obj = ((DSnapView) (obj1)).r;
                String s = ((DSnapPage) (obj3)).j;
                String s1 = ((DSnapPage) (obj3)).i;
                String s2 = ((DSnapPage) (obj3)).a;
                int k = ((DSnapPage) (obj3)).h.intValue();
                int i = ((DSnapPage) (obj3)).m.intValue();
                String s3 = ((DSnapPage) (obj3)).d;
                int i1 = ((DSnapPage) (obj3)).g;
                obj2 = ((wd) (obj2)).h();
                obj1 = ((DSnapView) (obj1)).g.c.getSourceType();
                if (i == 0)
                {
                    if (flag4)
                    {
                        animator = new he();
                        animator.publisherId = s;
                        animator.dsnapId = s2;
                        animator.editionId = s1;
                        animator.mediaType = DiscoverUsageAnalytics.a(((com.snapchat.android.discover.model.ediaType) (obj2)), false);
                        animator.timeViewed = Double.valueOf(Jk.a(l1, 1));
                        animator.source = ((jQ) (obj1));
                        boolean flag;
                        if (j < 0)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        if (!flag)
                        {
                            animator.snapIndexCount = Long.valueOf(j);
                            animator.snapIndexPos = Long.valueOf(k + 1);
                        }
                        ((DiscoverUsageAnalytics) (obj)).a.a(animator);
                        return;
                    }
                    obj3 = new gY();
                    obj3.publisherId = s;
                    obj3.dsnapId = s2;
                    obj3.editionId = s1;
                    obj3.mediaType = DiscoverUsageAnalytics.a(((com.snapchat.android.discover.model.ediaType) (obj2)), false);
                    obj3.longformType = DiscoverUsageAnalytics.b(animator);
                    obj3.timeViewed = Double.valueOf(Jk.a(l1, 1));
                    obj3.source = ((jQ) (obj1));
                    boolean flag1;
                    if (j < 0)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    if (!flag1)
                    {
                        obj3.snapIndexCount = Long.valueOf(j);
                        obj3.snapIndexPos = Long.valueOf(k + 1);
                    }
                    ((DiscoverUsageAnalytics) (obj)).a.a(((kl) (obj3)));
                    return;
                }
                if (flag4)
                {
                    animator = new gL();
                    animator.publisherId = s;
                    animator.adsnapId = s3;
                    animator.editionId = s1;
                    animator.mediaType = DiscoverUsageAnalytics.a(((com.snapchat.android.discover.model.ediaType) (obj2)), false);
                    animator.timeViewed = Double.valueOf(Jk.a(l1, 1));
                    animator.source = ((jQ) (obj1));
                    boolean flag2;
                    if (j < 0)
                    {
                        flag2 = true;
                    } else
                    {
                        flag2 = false;
                    }
                    if (!flag2)
                    {
                        animator.snapIndexCount = Long.valueOf(j);
                        animator.snapIndexPos = Long.valueOf(k + 1);
                        animator.adIndexPos = Long.valueOf(i1);
                        animator.adIndexCount = Long.valueOf(l);
                    }
                    ((DiscoverUsageAnalytics) (obj)).a.a(animator);
                    return;
                }
                obj3 = new gF();
                obj3.publisherId = s;
                obj3.adsnapId = s3;
                obj3.editionId = s1;
                obj3.mediaType = DiscoverUsageAnalytics.a(((com.snapchat.android.discover.model.ediaType) (obj2)), false);
                obj3.timeViewed = Double.valueOf(Jk.a(l1, 1));
                obj3.longformType = DiscoverUsageAnalytics.b(animator);
                obj3.source = ((jQ) (obj1));
                boolean flag3;
                if (j < 0)
                {
                    flag3 = true;
                } else
                {
                    flag3 = false;
                }
                if (!flag3)
                {
                    obj3.snapIndexCount = Long.valueOf(j);
                    obj3.snapIndexPos = Long.valueOf(k + 1);
                    obj3.adIndexPos = Long.valueOf(i1);
                    obj3.adIndexCount = Long.valueOf(l);
                }
                ((DiscoverUsageAnalytics) (obj)).a.a(((kl) (obj3)));
                return;
            }
        }
    }

    l.MediaType(DSnapView dsnapview, wd wd1, boolean flag, com.snapchat.android.discover.model.ediaType ediatype, long l)
    {
        e = dsnapview;
        a = wd1;
        b = flag;
        c = ediatype;
        d = l;
        super();
    }
}
