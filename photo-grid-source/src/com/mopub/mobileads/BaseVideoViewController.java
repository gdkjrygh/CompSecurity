// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import com.mopub.common.logging.MoPubLog;

// Referenced classes of package com.mopub.mobileads:
//            EventForwardingBroadcastReceiver

public abstract class BaseVideoViewController
{

    private final Context a;
    private final RelativeLayout b;
    private final BaseVideoViewControllerListener c;
    private Long d;

    protected BaseVideoViewController(Context context, Long long1, BaseVideoViewControllerListener basevideoviewcontrollerlistener)
    {
        a = context.getApplicationContext();
        d = long1;
        c = basevideoviewcontrollerlistener;
        b = new RelativeLayout(a);
    }

    protected void a()
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutparams.addRule(13);
        b.addView(b(), 0, layoutparams);
        c.onSetContentView(b);
    }

    void a(int i, int j)
    {
    }

    final void a(String s)
    {
        if (d != null)
        {
            EventForwardingBroadcastReceiver.a(a, d.longValue(), s);
            return;
        } else
        {
            MoPubLog.w("Tried to broadcast a video event without a braodcast identifier to send to.");
            return;
        }
    }

    protected final void a(boolean flag)
    {
        if (flag)
        {
            c.onFinish();
        }
    }

    protected abstract VideoView b();

    public boolean backButtonEnabled()
    {
        return true;
    }

    protected abstract void c();

    protected abstract void d();

    protected abstract void e();

    protected final BaseVideoViewControllerListener f()
    {
        return c;
    }

    protected final Context g()
    {
        return a;
    }

    public ViewGroup getLayout()
    {
        return b;
    }

    protected final void h()
    {
        MoPubLog.e("Video cannot be played.");
        a("com.mopub.action.interstitial.fail");
    }

    private class BaseVideoViewControllerListener
    {

        public abstract void onFinish();

        public abstract void onSetContentView(View view);

        public abstract void onSetRequestedOrientation(int i);

        public abstract void onStartActivityForResult(Class class1, int i, Bundle bundle);
    }

}
