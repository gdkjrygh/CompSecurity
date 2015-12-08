// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            UpdateDisplayState, InAppNotification, h

public class f extends Fragment
{

    private static final String k = "MixpanelAPI.InAppFrag";
    private static final int l = 10000;
    private h a;
    private Activity b;
    private GestureDetector c;
    private Handler d;
    private int e;
    private UpdateDisplayState.DisplayState.InAppNotificationState f;
    private Runnable g;
    private Runnable h;
    private View i;
    private boolean j;

    public f()
    {
    }

    private void a()
    {
        if (!j)
        {
            d.removeCallbacks(g);
            d.removeCallbacks(h);
            UpdateDisplayState.a(e);
            b.getFragmentManager().beginTransaction().remove(this).commit();
        }
        j = true;
    }

    static void a(f f1)
    {
        f1.b();
    }

    static View b(f f1)
    {
        return f1.i;
    }

    private void b()
    {
        if (b != null && !j)
        {
            d.removeCallbacks(g);
            d.removeCallbacks(h);
            b.getFragmentManager().beginTransaction().setCustomAnimations(0, com.mixpanel.android.R.anim.com_mixpanel_android_slide_down).remove(this).commit();
            UpdateDisplayState.a(e);
            j = true;
        }
    }

    static UpdateDisplayState.DisplayState.InAppNotificationState c(f f1)
    {
        return f1.f;
    }

    static GestureDetector d(f f1)
    {
        return f1.c;
    }

    static Activity e(f f1)
    {
        return f1.b;
    }

    static h f(f f1)
    {
        return f1.a;
    }

    public void a(h h1, int i1, UpdateDisplayState.DisplayState.InAppNotificationState inappnotificationstate)
    {
        a = h1;
        e = i1;
        f = inappnotificationstate;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        b = activity;
        if (f == null)
        {
            a();
            return;
        } else
        {
            d = new Handler();
            g = new _cls1();
            h = new _cls2();
            c = new GestureDetector(activity, new _cls3());
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        j = false;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        if (f == null)
        {
            a();
        } else
        {
            i = layoutinflater.inflate(com.mixpanel.android.R.layout.com_mixpanel_android_activity_notification_mini, viewgroup, false);
            layoutinflater = (TextView)i.findViewById(com.mixpanel.android.R.id.com_mixpanel_android_notification_title);
            viewgroup = (ImageView)i.findViewById(com.mixpanel.android.R.id.com_mixpanel_android_notification_image);
            bundle = f.c();
            layoutinflater.setText(bundle.f());
            viewgroup.setImageBitmap(bundle.m());
            d.postDelayed(g, 10000L);
        }
        return i;
    }

    public void onPause()
    {
        super.onPause();
        a();
    }

    public void onResume()
    {
        super.onResume();
        d.postDelayed(h, 500L);
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        a();
        super.onSaveInstanceState(bundle);
    }

    public void onStart()
    {
        super.onStart();
        if (j)
        {
            b.getFragmentManager().beginTransaction().remove(this).commit();
        }
    }

    // Unreferenced inner class com/mixpanel/android/mpmetrics/f$a
    /* block-local class not found */
    class a {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}

}
