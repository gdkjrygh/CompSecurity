// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.challenges.ui;

import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.fitbit.data.domain.challenges.Achievement;
import com.fitbit.e.a;
import com.fitbit.mixpanel.f;
import com.fitbit.ui.fragments.IndeterminateLoadingFragment;
import com.fitbit.ui.loadable.LoadablePicassoImageView;
import com.fitbit.util.b;
import com.fitbit.util.bd;

public class AchievementFragment extends Fragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, android.view.View.OnClickListener
{

    private static final String a = com/fitbit/challenges/ui/AchievementFragment.getSimpleName();
    private static final String b = "Share Challenge Summary";
    private static final String c = "!Summary_Type";
    private static final String d = "!Challenge_Type";
    private static final String e = "challenge_type";
    private static final String f = "achievement";
    private boolean g;
    private Achievement h;
    private LoadablePicassoImageView i;
    private TextView j;
    private TextView k;

    public AchievementFragment()
    {
        g = false;
    }

    public static AchievementFragment a(Achievement achievement, String s)
    {
        AchievementFragment achievementfragment = new AchievementFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("achievement", achievement);
        bundle.putString("challenge_type", s);
        achievementfragment.setArguments(bundle);
        return achievementfragment;
    }

    static Achievement a(AchievementFragment achievementfragment)
    {
        return achievementfragment.h;
    }

    static String a()
    {
        return a;
    }

    private void a(FragmentTransaction fragmenttransaction)
    {
        Fragment fragment = getChildFragmentManager().findFragmentByTag("loading");
        if (fragment != null)
        {
            fragmenttransaction.remove(fragment);
        }
    }

    static LoadablePicassoImageView b(AchievementFragment achievementfragment)
    {
        return achievementfragment.i;
    }

    private void b()
    {
        FragmentTransaction fragmenttransaction = getChildFragmentManager().beginTransaction();
        a(fragmenttransaction);
        IndeterminateLoadingFragment.a(0x7f080392).show(fragmenttransaction, "loading");
    }

    private void c()
    {
        FragmentTransaction fragmenttransaction = getChildFragmentManager().beginTransaction();
        a(fragmenttransaction);
        fragmenttransaction.commitAllowingStateLoss();
    }

    private void d()
    {
        if (!g)
        {
            g = true;
            i.animate().setDuration(0L).scaleX(0.0F).scaleY(0.0F).setListener(new _cls3());
        }
    }

    public void a(Loader loader, Uri uri)
    {
        c();
        com.fitbit.mixpanel.f.a(new _cls2());
        startActivity(bd.a(getActivity(), h.g(), uri));
    }

    public void onClick(View view)
    {
        getLoaderManager().initLoader(0x7f110230, getArguments(), this);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        com.fitbit.e.a.a("animation", "onCreate called", new Object[0]);
        h = (Achievement)getArguments().getParcelable("achievement");
    }

    public Loader onCreateLoader(int l, Bundle bundle)
    {
        b();
        return new b(getActivity(), com.fitbit.util.b.a.a(h.h()).b(h.d()).c(h.e()).a());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        com.fitbit.e.a.a("animation", "onCreateView called", new Object[0]);
        layoutinflater = layoutinflater.inflate(0x7f04007e, viewgroup, false);
        layoutinflater.findViewById(0x7f11022f).setOnClickListener(new _cls1());
        i = (LoadablePicassoImageView)layoutinflater.findViewById(0x7f1100c4);
        j = (TextView)layoutinflater.findViewById(0x7f11011f);
        k = (TextView)layoutinflater.findViewById(0x7f110227);
        layoutinflater.setBackgroundDrawable(new GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[] {
            h.b(), h.c()
        }));
        j.setText(h.d());
        k.setText(h.e());
        i.a(String.valueOf(h.f()));
        layoutinflater.findViewById(0x7f110230).setOnClickListener(this);
        return layoutinflater;
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (Uri)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public void onStart()
    {
        super.onStart();
        d();
    }


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}

}
