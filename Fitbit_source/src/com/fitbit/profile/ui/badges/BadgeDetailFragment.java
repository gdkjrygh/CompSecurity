// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.profile.ui.badges;

import android.app.AlertDialog;
import android.content.ClipData;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.text.TextUtils;
import android.util.Pair;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.TextView;
import com.fitbit.data.bl.BadgesBusinessLogic;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.s;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.badges.Badge;
import com.fitbit.mixpanel.f;
import com.fitbit.ui.fragments.IndeterminateLoadingFragment;
import com.fitbit.ui.loadable.LoadablePicassoImageView;
import com.fitbit.ui.loadable.b;
import java.text.DateFormat;
import java.util.EnumSet;
import java.util.Locale;

public class BadgeDetailFragment extends Fragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, android.view.View.OnClickListener
{

    private static final String b = com/fitbit/profile/ui/badges/BadgeDetailFragment.getSimpleName();
    private static final String c = "badgeId";
    private static final String d = "userId";
    private static final String e = "badge";
    private static final String f = "Badges: View Detail";
    private static final String g = "Badges: Share";
    Profile a;
    private View h;
    private View i;
    private View j;
    private LoadablePicassoImageView k;
    private TextView l;
    private TextView m;
    private TextView n;
    private TextView o;
    private TextView p;
    private TextView q;
    private Badge r;
    private BadgeRelationship s;
    private String t;
    private String u;

    public BadgeDetailFragment()
    {
    }

    public static BadgeDetailFragment a(Badge badge, String s1)
    {
        s1 = a(badge.c(), s1);
        s1.getArguments().putSerializable("badge", badge);
        return s1;
    }

    public static BadgeDetailFragment a(String s1, String s2)
    {
        if (TextUtils.isEmpty(s1))
        {
            throw new IllegalArgumentException("Invalid Badge Id given, cannot display unloadable badge");
        } else
        {
            Bundle bundle = new Bundle();
            bundle.putString("badgeId", s1);
            bundle.putString("userId", s2);
            s1 = new BadgeDetailFragment();
            s1.setArguments(bundle);
            return s1;
        }
    }

    static LoadablePicassoImageView a(BadgeDetailFragment badgedetailfragment)
    {
        return badgedetailfragment.k;
    }

    static String a()
    {
        return b;
    }

    private void a(Intent intent, Badge badge, Uri uri)
    {
        intent.setClipData(ClipData.newUri(getActivity().getContentResolver(), badge.s(), uri));
    }

    private void a(FragmentTransaction fragmenttransaction)
    {
        Fragment fragment = getFragmentManager().findFragmentByTag("loading");
        if (fragment != null)
        {
            fragmenttransaction.remove(fragment);
        }
    }

    static void a(BadgeDetailFragment badgedetailfragment, Intent intent, Badge badge, Uri uri)
    {
        badgedetailfragment.a(intent, badge, uri);
    }

    static void a(BadgeDetailFragment badgedetailfragment, boolean flag)
    {
        badgedetailfragment.a(flag);
    }

    private void a(boolean flag)
    {
        TextView textview = o;
        int i1;
        if (flag)
        {
            i1 = 0x7f0800e3;
        } else
        {
            i1 = 0x7f0802cd;
        }
        textview.setText(i1);
        textview = o;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        textview.setEnabled(flag);
    }

    static Badge b(BadgeDetailFragment badgedetailfragment)
    {
        return badgedetailfragment.r;
    }

    private void b()
    {
        FragmentTransaction fragmenttransaction = getFragmentManager().beginTransaction();
        a(fragmenttransaction);
        IndeterminateLoadingFragment.a(0).show(fragmenttransaction, "loading");
    }

    private void b(boolean flag)
    {
        c(flag);
        Object obj = o;
    /* block-local class not found */
    class BadgeRelationship {}

        int i1;
        if (EnumSet.of(com.fitbit.profile.ui.badges.BadgeRelationship.b, BadgeRelationship.a).contains(s))
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        ((TextView) (obj)).setVisibility(i1);
        k.a(new b(getActivity(), k), new b(getActivity(), k));
        k.a(r.i());
        i1 = 0x7f08006f;
        if (r.f() > 1)
        {
            q.setText(getString(0x7f080066, new Object[] {
                Integer.valueOf(r.f())
            }));
            q.setVisibility(0);
            i1 = 0x7f080072;
        }
        obj = DateFormat.getDateInstance(1, Locale.getDefault()).format(r.e());
        l.setText(getString(i1, new Object[] {
            obj
        }));
        m.setText(r.q());
        n.setText(r.j());
        p.setText(r.k());
        h.setVisibility(0);
        if (flag)
        {
            h.animate().setDuration(1000L).alpha(1.0F);
            return;
        } else
        {
            h.setAlpha(1.0F);
            return;
        }
    }

    static void c(BadgeDetailFragment badgedetailfragment)
    {
        badgedetailfragment.b();
    }

    private void c(boolean flag)
    {
        if (flag)
        {
            Object obj = getResources().getDrawable(0x7f020226);
            GradientDrawable gradientdrawable = new GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[] {
                r.n(), r.o()
            });
            obj = new com.fitbit.onboarding.landing.b(i, j, new Drawable[] {
                obj, gradientdrawable
            });
            ((com.fitbit.onboarding.landing.b) (obj)).a();
            ((com.fitbit.onboarding.landing.b) (obj)).b();
            return;
        } else
        {
            com.fitbit.util.i.b.a(i, r.n(), r.o());
            return;
        }
    }

    public void a(Loader loader, Pair pair)
    {
        if (pair.first != null)
        {
            r = (Badge)pair.first;
            if (TextUtils.equals(a.F(), u) || TextUtils.isEmpty(u))
            {
                s = BadgeRelationship.a;
                o.setText(0x7f0804bb);
            } else
            if (com.fitbit.data.bl.s.a(loader.getContext()).e(u))
            {
                s = com.fitbit.profile.ui.badges.BadgeRelationship.b;
                a(BadgesBusinessLogic.a().a(r, a.F()));
            } else
            {
                s = BadgeRelationship.c;
            }
            b(true);
        } else
        if (isInLayout() && isVisible())
        {
            loader = (com.fitbit.data.bl.BadgesBusinessLogic.ServiceException)pair.second;
            if (((com.fitbit.data.bl.BadgesBusinessLogic.ServiceException)pair.second).res != 0)
            {
                loader = getString(((com.fitbit.data.bl.BadgesBusinessLogic.ServiceException) (loader)).res);
            } else
            {
                loader = getString(0x7f08048e);
            }
            pair = new android.app.AlertDialog.Builder(new ContextThemeWrapper(getActivity(), 0x7f0c01d0));
            pair.setMessage(loader);
            pair.setPositiveButton(0x7f08042e, new _cls3());
            loader = pair.create();
            loader.setOnDismissListener(new _cls4());
            loader.show();
            return;
        }
    }

    public void onClick(View view)
    {
        if (s == BadgeRelationship.a)
        {
            getLoaderManager().initLoader(0x7f11024c, null, new _cls2());
            return;
        } else
        {
    /* block-local class not found */
    class a {}

            (new a(getActivity(), t, u, r.j())).c();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a = an.a().b();
        r = (Badge)getArguments().getSerializable("badge");
        t = getArguments().getString("badgeId");
        u = getArguments().getString("userId");
        if (TextUtils.isEmpty(u) && a != null)
        {
            u = a.F();
        }
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
    /* block-local class not found */
    class b {}

        return new b(getActivity(), t, u);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f040084, viewgroup, false);
        s = BadgeRelationship.c;
        h = layoutinflater.findViewById(0x7f11006c);
        i = layoutinflater.findViewById(0x7f110244);
        j = layoutinflater.findViewById(0x7f110245);
        k = (LoadablePicassoImageView)layoutinflater.findViewById(0x7f110248);
        k.getViewTreeObserver().addOnPreDrawListener(new _cls1());
        l = (TextView)layoutinflater.findViewById(0x7f11024b);
        m = (TextView)layoutinflater.findViewById(0x7f110249);
        n = (TextView)layoutinflater.findViewById(0x7f110246);
        p = (TextView)layoutinflater.findViewById(0x7f110247);
        o = (Button)layoutinflater.findViewById(0x7f11024c);
        q = (TextView)layoutinflater.findViewById(0x7f11024a);
        o.setOnClickListener(this);
        if (r == null)
        {
            com.fitbit.util.i.b.a(i, 0x7f020226);
        }
        return layoutinflater;
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (Pair)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        com.fitbit.mixpanel.f.c("Badges: View Detail");
        if (r != null)
        {
            b(false);
        }
        if (t != null)
        {
            getActivity().getSupportLoaderManager().restartLoader(1301, null, this);
            return;
        } else
        {
            com.fitbit.ui.s.a(getActivity(), 0x7f08056e, 0).i();
            getActivity().finish();
            return;
        }
    }


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}

}
