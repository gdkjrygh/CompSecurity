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
import com.appboy.d.i;
import com.appboy.d.j;
import com.appboy.ui.inappmessage.views.AppboyInAppMessageModalView;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;

// Referenced classes of package com.appboy.ui.inappmessage:
//            s, a

final class l
    implements s
{

    final com.appboy.ui.inappmessage.a a;

    l(com.appboy.ui.inappmessage.a a1)
    {
        a = a1;
        super();
    }

    public final View a(Activity activity, a a1)
    {
        j j1 = (j)a1;
        activity = (AppboyInAppMessageModalView)activity.getLayoutInflater().inflate(com.appboy.ui.n.d.com_appboy_inappmessage_modal, null);
        if (((AppboyInAppMessageModalView) (activity)).a)
        {
            activity.c = activity.c(com.appboy.ui.n.c.com_appboy_inappmessage_modal_drawee_stub);
            ((GenericDraweeHierarchy)((SimpleDraweeView)((AppboyInAppMessageModalView) (activity)).c).getHierarchy()).setActualImageScaleType(com.facebook.drawee.drawable.ScalingUtils.ScaleType.CENTER_INSIDE);
        } else
        {
            activity.b = (ImageView)activity.c(com.appboy.ui.n.c.com_appboy_inappmessage_modal_imageview_stub);
        }
        if (com.appboy.ui.inappmessage.a.a(a))
        {
            activity.b(a1.i());
        } else
        {
            activity.a(((f) (j1)).n);
        }
        activity.a(a1.d());
        activity.a(a1.a());
        activity.b(a1.g());
        activity.c(((i) (j1)).a);
        activity.e(((i) (j1)).b);
        activity.a(a1.h(), a1.e(), a1.f());
        activity.a(((i) (j1)).p);
        activity.d(((i) (j1)).o);
        activity.a(a1.p());
        return activity;
    }
}
