// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.rtyley.android.sherlock.roboguice.fragment;

import android.os.Bundle;
import android.view.View;
import com.actionbarsherlock.app.SherlockDialogFragment;
import roboguice.RoboGuice;
import roboguice.inject.RoboInjector;

public abstract class RoboSherlockDialogFragment extends SherlockDialogFragment
{

    public RoboSherlockDialogFragment()
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
