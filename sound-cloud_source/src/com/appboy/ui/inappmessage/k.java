// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.appboy.d.a;
import com.appboy.d.f;
import com.appboy.ui.inappmessage.views.AppboyInAppMessageSlideupView;
import com.appboy.ui.inappmessage.views.b;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;

// Referenced classes of package com.appboy.ui.inappmessage:
//            s, a

final class k
    implements s
{

    final com.appboy.ui.inappmessage.a a;

    k(com.appboy.ui.inappmessage.a a1)
    {
        a = a1;
        super();
    }

    public final View a(Activity activity, a a1)
    {
        Object obj = (com.appboy.d.k)a1;
        activity = (AppboyInAppMessageSlideupView)activity.getLayoutInflater().inflate(com.appboy.ui.n.d.com_appboy_inappmessage_slideup, null);
        int i;
        if (((AppboyInAppMessageSlideupView) (activity)).a)
        {
            activity.c = activity.c(com.appboy.ui.n.c.com_appboy_inappmessage_slideup_drawee_stub);
            ((GenericDraweeHierarchy)((SimpleDraweeView)((AppboyInAppMessageSlideupView) (activity)).c).getHierarchy()).setActualImageScaleType(com.facebook.drawee.drawable.ScalingUtils.ScaleType.FIT_CENTER);
        } else
        {
            activity.b = (ImageView)activity.c(com.appboy.ui.n.c.com_appboy_inappmessage_slideup_imageview_stub);
        }
        if (com.appboy.ui.inappmessage.a.a(a))
        {
            activity.b(a1.i());
        } else
        {
            activity.a(((f) (obj)).n);
        }
        activity.a(((f) (obj)).i);
        activity.a(((f) (obj)).d);
        activity.b(((f) (obj)).j);
        activity.a(((f) (obj)).m, ((f) (obj)).k, ((f) (obj)).l);
        i = ((com.appboy.d.k) (obj)).b;
        obj = ((f) (obj)).e;
        com.appboy.ui.inappmessage.views.a.a[((com.appboy.b.a.a) (obj)).ordinal()];
        JVM INSTR tableswitch 1 1: default 156
    //                   1 221;
           goto _L1 _L2
_L1:
        b.a(activity.findViewById(com.appboy.ui.n.c.com_appboy_inappmessage_slideup_chevron), i, activity.getContext().getResources().getColor(com.appboy.ui.n.a.com_appboy_inappmessage_chevron));
_L4:
        activity.a(a1.p());
        return activity;
_L2:
        activity.findViewById(com.appboy.ui.n.c.com_appboy_inappmessage_slideup_chevron).setVisibility(8);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
