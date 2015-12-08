// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import roboguice.RoboGuice;
import roboguice.inject.RoboInjector;

public abstract class RoboFragment extends Fragment
{

    public RoboFragment()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        RoboGuice.getInjector(getActivity()).injectMembersWithoutViews(this);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        RoboGuice.getInjector(getActivity()).injectViewMembers(this);
    }
}
