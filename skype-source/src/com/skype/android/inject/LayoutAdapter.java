// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.inject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.l;
import android.support.v4.app.o;
import android.view.View;
import android.widget.FrameLayout;

// Referenced classes of package com.skype.android.inject:
//            LifecycleAdapter, Layout, LayoutFragment

public class LayoutAdapter extends LifecycleAdapter
{

    private Activity activity;

    public LayoutAdapter(Activity activity1)
    {
        activity = activity1;
    }

    private void onCreateProxy(Bundle bundle, String s, Class class1)
        throws InstantiationException, IllegalAccessException
    {
        if (activity.findViewById(0x1020002) == null)
        {
            FrameLayout framelayout = new FrameLayout(activity);
            framelayout.setId(0x1020002);
            activity.setContentView(framelayout);
        }
        if (bundle == null)
        {
            bundle = (Fragment)class1.newInstance();
            bundle.setArguments(activity.getIntent().getExtras());
            class1 = (FragmentActivity)activity;
            class1.getSupportFragmentManager().a().b(0x1020002, bundle, s).a();
            class1.getSupportFragmentManager().b();
        }
    }

    public void onCreate(Bundle bundle)
    {
        Layout layout = (Layout)activity.getClass().getAnnotation(com/skype/android/inject/Layout);
        if (layout != null)
        {
            activity.setContentView(layout.value());
        } else
        {
            Object obj = activity.getClass();
            if (activity.getIntent().hasExtra("fragmentClass"))
            {
                obj = (Class)activity.getIntent().getExtras().get("fragmentClass");
                try
                {
                    onCreateProxy(bundle, "content", ((Class) (obj)));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Bundle bundle)
                {
                    throw new RuntimeException(bundle);
                }
            }
            if (((Class) (obj)).isAnnotationPresent(com/skype/android/inject/LayoutFragment))
            {
                obj = (LayoutFragment)((Class) (obj)).getAnnotation(com/skype/android/inject/LayoutFragment);
                try
                {
                    onCreateProxy(bundle, ((LayoutFragment) (obj)).tag(), ((LayoutFragment) (obj)).value());
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Bundle bundle)
                {
                    throw new RuntimeException(bundle);
                }
            }
        }
    }
}
