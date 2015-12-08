// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.view.View;
import com.tinder.activities.ActivityMain;
import com.tinder.adapters.ActivityMainPagerAdapter;
import com.tinder.managers.a;
import com.tinder.views.CustomDrawerLayout;
import java.util.List;

// Referenced classes of package com.tinder.fragments:
//            FragmentSideMenu

final class a
    implements android.view.r
{

    final FragmentSideMenu a;

    public final void onClick(View view)
    {
        com.tinder.managers.a.a("Menu.Settings");
        view = (ActivityMain)a.getActivity();
        ((ActivityMain) (view)).j.closeDrawer();
        ActivityMainPagerAdapter activitymainpageradapter = ((ActivityMain) (view)).i;
        activitymainpageradapter.d.add(com.tinder.adapters.apter.ModalType.e);
        activitymainpageradapter.notifyDataSetChanged();
        view.t();
    }

    pter.ModalType(FragmentSideMenu fragmentsidemenu)
    {
        a = fragmentsidemenu;
        super();
    }
}
