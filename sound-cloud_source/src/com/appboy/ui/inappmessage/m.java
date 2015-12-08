// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.appboy.d.a;
import com.appboy.d.f;
import com.appboy.d.g;
import com.appboy.d.i;
import com.appboy.ui.inappmessage.views.AppboyInAppMessageFullView;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;

// Referenced classes of package com.appboy.ui.inappmessage:
//            s, a

final class m
    implements s
{

    final com.appboy.ui.inappmessage.a a;

    m(com.appboy.ui.inappmessage.a a1)
    {
        a = a1;
        super();
    }

    public final View a(Activity activity, a a1)
    {
        g g1 = (g)a1;
        activity = (AppboyInAppMessageFullView)activity.getLayoutInflater().inflate(com.appboy.ui.n.d.com_appboy_inappmessage_full, null);
        if (((AppboyInAppMessageFullView) (activity)).a)
        {
            activity.c = activity.c(com.appboy.ui.n.c.com_appboy_inappmessage_full_drawee_stub);
            ((GenericDraweeHierarchy)((SimpleDraweeView)((AppboyInAppMessageFullView) (activity)).c).getHierarchy()).setActualImageScaleType(com.facebook.drawee.drawable.ScalingUtils.ScaleType.FIT_CENTER);
        } else
        {
            activity.b = (ImageView)activity.c(com.appboy.ui.n.c.com_appboy_inappmessage_full_imageview_stub);
            ((AppboyInAppMessageFullView) (activity)).b.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            ((AppboyInAppMessageFullView) (activity)).b.setAdjustViewBounds(true);
        }
        if (com.appboy.ui.inappmessage.a.a(a))
        {
            activity.b(a1.i());
        } else
        {
            activity.a(a1.n());
        }
        activity.a(((f) (g1)).i);
        activity.a(((f) (g1)).d);
        activity.b(((f) (g1)).j);
        activity.c(((i) (g1)).a);
        activity.e(((i) (g1)).b);
        activity.a(((i) (g1)).p);
        activity.d(((i) (g1)).o);
        activity.a(a1.p());
        return activity;
    }
}
