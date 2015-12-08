// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

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
import com.android.a.b;
import com.android.a.d;
import com.android.a.e;

// Referenced classes of package com.android.slyce.report.mpmetrics:
//            UpdateDisplayState, r, s, u, 
//            InAppNotification, af

public class q extends Fragment
{

    private af a;
    private Activity b;
    private GestureDetector c;
    private Handler d;
    private int e;
    private UpdateDisplayState.DisplayState.InAppNotificationState f;
    private Runnable g;
    private Runnable h;
    private View i;
    private boolean j;

    public q()
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

    static void a(q q1)
    {
        q1.b();
    }

    static View b(q q1)
    {
        return q1.i;
    }

    private void b()
    {
        if (b != null && !j)
        {
            d.removeCallbacks(g);
            d.removeCallbacks(h);
            b.getFragmentManager().beginTransaction().setCustomAnimations(0, b.com_mixpanel_android_slide_down).remove(this).commit();
            UpdateDisplayState.a(e);
            j = true;
        }
    }

    static UpdateDisplayState.DisplayState.InAppNotificationState c(q q1)
    {
        return q1.f;
    }

    static GestureDetector d(q q1)
    {
        return q1.c;
    }

    static Activity e(q q1)
    {
        return q1.b;
    }

    static af f(q q1)
    {
        return q1.a;
    }

    public void a(af af, int k, UpdateDisplayState.DisplayState.InAppNotificationState inappnotificationstate)
    {
        a = af;
        e = k;
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
            g = new r(this);
            h = new s(this);
            c = new GestureDetector(activity, new u(this));
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
            i = layoutinflater.inflate(e.com_mixpanel_android_activity_notification_mini, viewgroup, false);
            layoutinflater = (TextView)i.findViewById(d.com_mixpanel_android_notification_title);
            viewgroup = (ImageView)i.findViewById(d.com_mixpanel_android_notification_image);
            bundle = f.c();
            layoutinflater.setText(bundle.e());
            viewgroup.setImageBitmap(bundle.k());
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
}
