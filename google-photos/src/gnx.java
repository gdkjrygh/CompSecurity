// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Scroller;
import com.google.android.apps.photos.pager.viewpager.PhotoViewPager;

final class gnx extends BroadcastReceiver
{

    private gnw a;

    gnx(gnw gnw1)
    {
        a = gnw1;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        if (!a.i() || !intent.getAction().equals("com.google.android.apps.photos.SLIDESHOW_STATE"))
        {
            return;
        }
        if (intent.getBooleanExtra("slideshow_playing", false))
        {
            gnw.a(a, true);
            context = a;
            int i;
            boolean flag;
            if (!((nux)gnw.a(a).a(nux)).a())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gnw.b(context, flag);
            if (!gnw.b(a).a())
            {
                gnw.c(a, true);
            }
            i = intent.getIntExtra("slideshow_position", -1);
            if (i == ((ViewPager) (gnw.c(a))).c + 1)
            {
                context = gnw.c(a);
                context.i();
                context.f();
                context.w = new Scroller(context.getContext(), new AccelerateDecelerateInterpolator());
                ((PhotoViewPager) (context)).w.startScroll(0, 0, context.getWidth(), 0, 600);
                context.post(((PhotoViewPager) (context)).x);
            } else
            {
                gnw.c(a).a(i);
            }
        } else
        {
            gnw.a(a, false);
        }
        gnw.d(a);
    }
}
