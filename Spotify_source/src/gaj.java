// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import com.spotify.mobile.android.ui.view.AutoScrollingViewPager;
import java.lang.ref.WeakReference;

public final class gaj extends Handler
{

    private final WeakReference a;

    public gaj(AutoScrollingViewPager autoscrollingviewpager)
    {
        a = new WeakReference(autoscrollingviewpager);
    }

    public static void a(gaj gaj1)
    {
        gaj1.removeMessages(1);
    }

    public static void b(gaj gaj1)
    {
        gaj1.removeMessages(1);
        gaj1.a.clear();
    }

    public final void a()
    {
        if (!hasMessages(1))
        {
            sendEmptyMessageDelayed(1, 4000L);
        }
    }

    public final void handleMessage(Message message)
    {
        int i = 1;
        if (message.what == 1)
        {
            message = (AutoScrollingViewPager)a.get();
            if (message == null || message.a() == null)
            {
                i = 0;
            }
            if (i != 0 && AutoScrollingViewPager.a(message))
            {
                i = message.a().b();
                message.b((message.b() + 1) % i);
                AutoScrollingViewPager.b(message);
            }
        }
    }
}
