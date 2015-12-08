// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.settings.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.RankedUser;
import com.fitbit.data.domain.User;
import com.fitbit.friends.ui.ProfilePhotoUploader;
import com.fitbit.ui.loadable.CircleLoadablePicassoImageView;
import com.fitbit.ui.s;
import com.fitbit.util.format.e;
import java.util.EnumSet;

public class UserInformationFragment extends Fragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, android.view.View.OnClickListener, com.fitbit.friends.ui.ProfilePhotoUploader.a
{

    private static final String a = "user";
    private static final String b = "self";
    private CircleLoadablePicassoImageView c;
    private TextView d;
    private TextView e;
    private User f;
    private View g;
    private boolean h;
    private ProfilePhotoUploader i;

    public UserInformationFragment()
    {
    }

    public static UserInformationFragment a(User user, boolean flag)
    {
        Bundle bundle = new Bundle();
        bundle.putSerializable("user", user);
        bundle.putBoolean("self", flag);
        user = new UserInformationFragment();
        user.setArguments(bundle);
        return user;
    }

    static CircleLoadablePicassoImageView a(UserInformationFragment userinformationfragment)
    {
        return userinformationfragment.c;
    }

    public static String a(User user)
    {
        if (user.O() == null || user.O().length() == 0)
        {
            return "";
        }
        if (user.o() == null || user.o().length() == 0)
        {
            return user.O();
        } else
        {
            return String.format("%s, %s", new Object[] {
                user.o(), user.O()
            });
        }
    }

    private void a(int j, Intent intent)
    {
        intent = ProfilePhotoUploader.a(j, intent);
        i.a(this, j, intent);
    }

    private void b(int j, Intent intent)
    {
        intent = ProfilePhotoUploader.b(j, intent);
        i.a(this, j, intent);
    }

    private boolean b(User user)
    {
        return TextUtils.isEmpty(a(user)) && e() <= 0L;
    }

    private void c(int j, Intent intent)
    {
        intent = ProfilePhotoUploader.c(j, intent);
        i.a(j, intent);
    }

    private boolean f()
    {
        return !h && (f instanceof RankedUser) && EnumSet.of(com.fitbit.data.domain.RankedUser.Relation.REQUEST_RECEIVE, com.fitbit.data.domain.RankedUser.Relation.REQUEST_SENT).contains(((RankedUser)f).c());
    }

    private boolean g()
    {
        return !h && (f instanceof RankedUser) && ((RankedUser)f).c() == com.fitbit.data.domain.RankedUser.Relation.STRANGER;
    }

    private String h()
    {
        String s2 = getString(0x7f08031e, new Object[] {
            com.fitbit.util.format.e.f(getActivity(), f.getTimeCreated())
        });
        String s3 = f.o();
        String s1;
        if (f instanceof Profile)
        {
            s1 = ((Profile)f).n();
        } else
        {
            s1 = null;
        }
        if (!TextUtils.isEmpty(s3))
        {
            if (!TextUtils.isEmpty(s1))
            {
                return (new StringBuilder()).append(s3).append(", ").append(s1).append('\n').append(s2).toString();
            } else
            {
                return (new StringBuilder()).append(s3).append('\n').append(s2).toString();
            }
        } else
        {
            return s2;
        }
    }

    private String i()
    {
        if (b(f))
        {
            return getString(0x7f0803fc);
        }
        long l = e();
        StringBuilder stringbuilder = new StringBuilder();
        String s1;
        if (l <= 0L)
        {
            stringbuilder.append(getString(0x7f08030b));
        } else
        {
            stringbuilder.append(getString(0x7f0804f0, new Object[] {
                com.fitbit.util.format.e.c(l)
            }));
        }
        s1 = a(f);
        if (s1 != null && s1.length() != 0)
        {
            stringbuilder.append(" \u2022 ").append(s1);
        }
        return String.valueOf(stringbuilder);
    }

    public void a()
    {
        getLoaderManager().restartLoader(0x7f1101de, null, this);
    }

    public void a(Loader loader, Profile profile)
    {
        f = profile;
        d();
    }

    public void b()
    {
    }

    public void c()
    {
        s.a(getActivity(), 0x7f080568, 0).i();
    }

    public void d()
    {
        TextView textview = d;
        String s1;
        if (TextUtils.isEmpty(f.P()))
        {
            s1 = f.E();
        } else
        {
            s1 = f.P();
        }
        textview.setText(s1);
        c.a(f.G());
        if (h)
        {
            s1 = h();
        } else
        {
            s1 = i();
        }
        e.setText(s1);
        if (f())
        {
            g.setEnabled(false);
            g.setVisibility(0);
        } else
        if (g())
        {
            g.setEnabled(true);
            g.setVisibility(0);
            g.setOnClickListener(this);
            return;
        }
    }

    long e()
    {
        if (f instanceof RankedUser)
        {
            return ((RankedUser)f).b();
        } else
        {
            return 0L;
        }
    }

    public void onActivityResult(int j, int k, Intent intent)
    {
        switch (j)
        {
        default:
            return;

        case 4906: 
            a(k, intent);
            return;

        case 4907: 
            b(k, intent);
            return;

        case 4908: 
            c(k, intent);
            break;
        }
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        i = new ProfilePhotoUploader(this, this);
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131821136: 
            i.a();
            return;

        case 2131821137: 
            view.setEnabled(false);
            break;
        }
        _cls2 _lcls2 = new _cls2(getActivity(), 0x7f110251, view);
        com.fitbit.data.bl.s.a(getActivity()).a((RankedUser)f, view.getContext(), _lcls2, com.fitbit.mixpanel.MixPanelTrackingHelper.FriendRequestProperties.a);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        f = (User)getArguments().getSerializable("user");
        if (bundle != null)
        {
            User user = (User)bundle.getSerializable("user");
            bundle = user;
            if (user == null)
            {
                bundle = f;
            }
            f = bundle;
        }
        h = getArguments().getBoolean("self");
    }

    public Loader onCreateLoader(int j, Bundle bundle)
    {
    /* block-local class not found */
    class b {}

        return new b(getActivity());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f040086, viewgroup, false);
        g = layoutinflater.findViewById(0x7f110251);
        c = (CircleLoadablePicassoImageView)layoutinflater.findViewById(0x7f110250);
        if (h)
        {
            c.setOnClickListener(this);
        }
        d = (TextView)layoutinflater.findViewById(0x7f110252);
        e = (TextView)layoutinflater.findViewById(0x7f110253);
        d();
        layoutinflater.getViewTreeObserver().addOnPreDrawListener(new _cls1());
        return layoutinflater;
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (Profile)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("user", f);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        d();
    }

    // Unreferenced inner class com/fitbit/settings/ui/UserInformationFragment$a
    /* block-local class not found */
    class a {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}

}
