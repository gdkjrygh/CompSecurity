// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.model.Urn;
import dagger.b;

// Referenced classes of package com.soundcloud.android.profile:
//            ScrollableProfileFragment, UserDetailsPresenter, UserDetailsView, UserProfileOperations

public class UserDetailsFragment extends ScrollableProfileFragment
{

    UserProfileOperations profileOperations;
    UserDetailsPresenter userDetailsPresenter;
    UserDetailsView userDetailsView;

    public UserDetailsFragment()
    {
        SoundCloudApplication.getObjectGraph().a(this);
        setRetainInstance(true);
        userDetailsPresenter = new UserDetailsPresenter(profileOperations, userDetailsView);
    }

    public static UserDetailsFragment create(Urn urn)
    {
        UserDetailsFragment userdetailsfragment = new UserDetailsFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("user_urn_key", urn);
        userdetailsfragment.setArguments(bundle);
        return userdetailsfragment;
    }

    public View[] getRefreshableViews()
    {
        View view = getView();
        return (new View[] {
            view.findViewById(0x1020004), view.findViewById(0x7f0f029c)
        });
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        userDetailsView.setUrn((Urn)getArguments().getParcelable("user_urn_key"));
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f0300da, viewgroup, false);
    }
}
