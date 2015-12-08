// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.settings.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.text.TextUtils;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.User;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.fitbit.settings.ui:
//            ProfileActivity

private class a extends FragmentPagerAdapter
{

    final List a;
    Fragment b[];
    final ProfileActivity c;
    private User d;

    public int getCount()
    {
        return a.size();
    }

    public Fragment getItem(int i)
    {
        Fragment fragment = b[i];
        if (fragment != null)
        {
            return fragment;
        } else
        {
            b[i] = ((ofilePageType)a.get(i)).a(d, ProfileActivity.b(c));
            return b[i];
        }
    }

    public CharSequence getPageTitle(int i)
    {
        return c.getString(((ofilePageType)a.get(i)).titleId);
    }

    public ofilePageType(ProfileActivity profileactivity, FragmentManager fragmentmanager, User user)
    {
        c = profileactivity;
        super(fragmentmanager);
        b = new Fragment[ofilePageType.values().length];
        d = user;
        profileactivity = EnumSet.allOf(com/fitbit/settings/ui/ProfileActivity$ProfilePageType);
        fragmentmanager = an.a().b();
        if (fragmentmanager == null || !TextUtils.equals(fragmentmanager.F(), user.F()))
        {
            profileactivity.remove(ofilePageType.c);
        }
        a = new ArrayList(profileactivity);
    }
}
