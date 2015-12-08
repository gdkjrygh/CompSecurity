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
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            UpdateDisplayState, l, m, o, 
//            InAppNotification

public final class k extends Fragment
{
    private final class a
        implements Interpolator
    {

        final k a;

        public final float getInterpolation(float f1)
        {
            return (float)(-(Math.pow(2.7182818284590451D, -8F * f1) * Math.cos(12F * f1))) + 1.0F;
        }

        public a()
        {
            a = k.this;
            super();
        }
    }


    private Activity a;
    private GestureDetector b;
    private Handler c;
    private int d;
    private UpdateDisplayState.DisplayState.InAppNotificationState e;
    private Runnable f;
    private Runnable g;
    private View h;
    private boolean i;

    public k()
    {
    }

    private void a()
    {
        if (!i)
        {
            c.removeCallbacks(f);
            c.removeCallbacks(g);
            UpdateDisplayState.a(d);
            a.getFragmentManager().beginTransaction().remove(this).commit();
        }
        i = true;
    }

    static void a(k k1)
    {
        if (k1.a != null && !k1.i)
        {
            k1.c.removeCallbacks(k1.f);
            k1.c.removeCallbacks(k1.g);
            k1.a.getFragmentManager().beginTransaction().setCustomAnimations(0, com.mixpanel.android.a.a.b).remove(k1).commit();
            k1.i = true;
        }
    }

    static View b(k k1)
    {
        return k1.h;
    }

    static UpdateDisplayState.DisplayState.InAppNotificationState c(k k1)
    {
        return k1.e;
    }

    static GestureDetector d(k k1)
    {
        return k1.b;
    }

    static Activity e(k k1)
    {
        return k1.a;
    }

    public final void a(int j, UpdateDisplayState.DisplayState.InAppNotificationState inappnotificationstate)
    {
        d = j;
        e = inappnotificationstate;
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        a = activity;
        c = new Handler();
        f = new l(this);
        g = new m(this);
        b = new GestureDetector(activity, new o(this));
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        i = false;
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        if (e == null)
        {
            a();
        } else
        {
            h = layoutinflater.inflate(com.mixpanel.android.a.d.b, viewgroup, false);
            layoutinflater = (TextView)h.findViewById(com.mixpanel.android.a.c.k);
            viewgroup = (ImageView)h.findViewById(com.mixpanel.android.a.c.i);
            bundle = e.c();
            layoutinflater.setText(bundle.d());
            viewgroup.setImageBitmap(bundle.j());
            c.postDelayed(f, 6000L);
        }
        return h;
    }

    public final void onPause()
    {
        super.onPause();
        a();
    }

    public final void onResume()
    {
        super.onResume();
        c.postDelayed(g, 500L);
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        a();
        super.onSaveInstanceState(bundle);
    }

    public final void onStart()
    {
        super.onStart();
        if (i)
        {
            a.getFragmentManager().beginTransaction().remove(this).commit();
        }
    }
}
