// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import GG;
import GH;
import Mr;
import Os;
import PI;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.snapchat.android.LandingPageActivity;
import com.snapchat.android.controller.MediaOpenOrigin;
import com.snapchat.android.util.fragment.SnapchatFragment;
import java.util.List;
import un;
import wU;

public class AddFriendsFromCameraRollFragment extends SnapchatFragment
{
    public static interface a
    {

        public abstract void a();
    }


    private GG a;
    private RecyclerView b;
    private PI c;
    private final un d = un.a();

    public AddFriendsFromCameraRollFragment()
    {
    }

    static un a(AddFriendsFromCameraRollFragment addfriendsfromcamerarollfragment)
    {
        return addfriendsfromcamerarollfragment.d;
    }

    public final void e()
    {
        Object obj = getActivity();
        if (obj instanceof LandingPageActivity)
        {
            obj = (LandingPageActivity)obj;
            ((LandingPageActivity) (obj)).d();
            ((LandingPageActivity) (obj)).e();
        }
    }

    public void onCloseCameraRollFragmentWithAnimationEvent(Mr mr)
    {
        Animation animation = AnimationUtils.loadAnimation(getActivity(), 0x7f050007);
        animation.setAnimationListener(new android.view.animation.Animation.AnimationListener(mr) {

            private Mr a;

            public final void onAnimationEnd(Animation animation1)
            {
                a.mCallBack.a();
            }

            public final void onAnimationRepeat(Animation animation1)
            {
            }

            public final void onAnimationStart(Animation animation1)
            {
            }

            
            {
                a = mr;
                super();
            }
        });
        mFragmentLayout.startAnimation(animation);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        mFragmentLayout = layoutinflater.inflate(0x7f040003, viewgroup, false);
        a = new GG(getActivity(), layoutinflater, mFragmentLayout, wU.a().a, wU.a().b);
        b = (RecyclerView)mFragmentLayout.findViewById(0x7f0d004b);
        c = new PI(mFragmentLayout, 0x7f0d004f, 0x7f0d03fd);
        getActivity();
        layoutinflater = new GridLayoutManager(3);
        layoutinflater.b = new android.support.v7.widget.GridLayoutManager.b() {

            public final int a(int i)
            {
                return i != 0 ? 1 : 3;
            }

        };
        b.setLayoutManager(layoutinflater);
        b.setAdapter(a);
        d(0x7f0d0039).setOnClickListener(new android.view.View.OnClickListener() {

            private AddFriendsFromCameraRollFragment a;

            public final void onClick(View view)
            {
                a.getActivity().onBackPressed();
            }

            
            {
                a = AddFriendsFromCameraRollFragment.this;
                super();
            }
        });
        if (wU.a().a.a() == 0)
        {
            d(0x7f0d004c).setVisibility(8);
            ((RecyclerView)d(0x7f0d004b)).setVisibility(0);
        }
        return mFragmentLayout;
    }

    public void onDestroy()
    {
        super.onDestroy();
    }

    public void onResume()
    {
        super.onResume();
        if (wU.a().a.a() != a.c.a())
        {
            wU.a().a(getActivity());
            a.c = wU.a().a;
            a.d = wU.a().b;
            GH gh = a.c;
            for (int i = 0; i < gh.b.size(); i++)
            {
                gh.b.set(i, Boolean.valueOf(false));
            }

            ((android.support.v7.widget.RecyclerView.a) (a)).a.b();
        }
    }

    public void onSwitchDeeplinkNotificationEvent(Os os)
    {
        Os.a a1;
label0:
        {
label1:
            {
                if (os.mMediaOpenOrigin == MediaOpenOrigin.PROFILE_ROLL_QR_SCAN)
                {
                    a1 = null;
                    if (os.mSwitchToNotification)
                    {
                        break label0;
                    }
                    if (d.b(Uri.parse(os.mUrl), os.mMediaOpenOrigin) != 4)
                    {
                        break label1;
                    }
                    d.a(Uri.parse(os.mUrl), os.mMediaOpenOrigin);
                }
                return;
            }
            a1 = new Os.a(os) {

                private Os a;
                private AddFriendsFromCameraRollFragment b;

                public final void a()
                {
                    AddFriendsFromCameraRollFragment.a(b).a(Uri.parse(a.mUrl), MediaOpenOrigin.PROFILE_ROLL_QR_SCAN);
                }

            
            {
                b = AddFriendsFromCameraRollFragment.this;
                a = os;
                super();
            }
            };
        }
        Os.a(os, c, MediaOpenOrigin.PROFILE_ROLL_QR_SCAN, a1);
    }
}
