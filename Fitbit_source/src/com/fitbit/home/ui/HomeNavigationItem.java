// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import android.content.Context;
import android.support.v4.app.Fragment;
import com.fitbit.alarm.ui.AlarmActivity;
import com.fitbit.alarm.ui.ChooseAlarmActivity;
import com.fitbit.challenges.ui.ChallengesFragment_;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceFeature;
import com.fitbit.device.ui.DevicesFragment_;
import com.fitbit.friends.ui.FriendsFragment;
import com.fitbit.settings.ui.HelpPageActivity;
import com.fitbit.settings.ui.ProfileActivity;
import com.fitbit.ui.drawer.NavigationItem;
import com.fitbit.util.p;
import java.util.List;

// Referenced classes of package com.fitbit.home.ui:
//            DashboardPagerFragment_

public class HomeNavigationItem extends Enum
{

    public static final HomeNavigationItem a;
    public static final HomeNavigationItem b;
    public static final HomeNavigationItem c;
    public static final HomeNavigationItem d;
    public static final HomeNavigationItem e;
    public static final HomeNavigationItem f;
    public static final HomeNavigationItem g;
    public static final HomeNavigationItem h;
    public static final HomeNavigationItem i;
    private static final HomeNavigationItem j[];
    private int indexOffset;
    private final com.fitbit.ui.drawer.NavigationItem.RunAs runAs;
    private final int title;
    private final com.fitbit.ui.drawer.NavigationItem.Type type;

    private HomeNavigationItem(String s, int k, com.fitbit.ui.drawer.NavigationItem.Type type1, com.fitbit.ui.drawer.NavigationItem.RunAs runas, int l)
    {
        super(s, k);
        type = type1;
        runAs = runas;
        title = l;
        indexOffset = 0;
    }


    public static HomeNavigationItem valueOf(String s)
    {
        return (HomeNavigationItem)Enum.valueOf(com/fitbit/home/ui/HomeNavigationItem, s);
    }

    public static HomeNavigationItem[] values()
    {
        return (HomeNavigationItem[])j.clone();
    }

    public int a()
    {
        return indexOffset;
    }

    public void a(int k)
    {
        indexOffset = k;
    }

    void a(Context context)
    {
    }

    int b()
    {
        return title;
    }

    com.fitbit.ui.drawer.NavigationItem.Type c()
    {
        return type;
    }

    com.fitbit.ui.drawer.NavigationItem.RunAs d()
    {
        return runAs;
    }

    NavigationItem e()
    {
        NavigationItem navigationitem = new NavigationItem(type, this, runAs);
        navigationitem.a(title);
        return navigationitem;
    }

    Fragment f()
    {
        return null;
    }

    static 
    {
        a = new HomeNavigationItem("DASHBOARD", 0, com.fitbit.ui.drawer.NavigationItem.Type.a, com.fitbit.ui.drawer.NavigationItem.RunAs.a, 0x7f0802d8) {

            Fragment f()
            {
                return DashboardPagerFragment_.g().a();
            }

        };
        b = new HomeNavigationItem("CHALLENGES", 1, com.fitbit.ui.drawer.NavigationItem.Type.a, com.fitbit.ui.drawer.NavigationItem.RunAs.a, 0x7f0802ca) {

            Fragment f()
            {
                return ChallengesFragment_.e().a();
            }

        };
        c = new HomeNavigationItem("FRIENDS", 2, com.fitbit.ui.drawer.NavigationItem.Type.a, com.fitbit.ui.drawer.NavigationItem.RunAs.a, 0x7f0802fb) {

            Fragment f()
            {
                return FriendsFragment.a();
            }

        };
        d = new HomeNavigationItem("PROFILE", 3, com.fitbit.ui.drawer.NavigationItem.Type.a, com.fitbit.ui.drawer.NavigationItem.RunAs.b, 0x7f080031) {

            void a(Context context)
            {
                context.startActivity(ProfileActivity.a(context));
            }

        };
        e = new HomeNavigationItem("DIVIDER", 4, com.fitbit.ui.drawer.NavigationItem.Type.c, com.fitbit.ui.drawer.NavigationItem.RunAs.b, 0) {

        };
        f = new HomeNavigationItem("DEVICES", 5, com.fitbit.ui.drawer.NavigationItem.Type.b, com.fitbit.ui.drawer.NavigationItem.RunAs.a, 0x7f0802dd) {

            Fragment f()
            {
                return DevicesFragment_.e().a();
            }

        };
        g = new HomeNavigationItem("ALARMS", 6, com.fitbit.ui.drawer.NavigationItem.Type.b, com.fitbit.ui.drawer.NavigationItem.RunAs.b, 0x7f080051) {

            void a(Context context)
            {
                List list = p.b(DeviceFeature.ALARMS);
                if (list != null && list.size() == 1)
                {
                    AlarmActivity.a(context, (Device)list.get(0));
                    return;
                } else
                {
                    ChooseAlarmActivity.a(context);
                    return;
                }
            }

        };
        h = new HomeNavigationItem("HELP", 7, com.fitbit.ui.drawer.NavigationItem.Type.b, com.fitbit.ui.drawer.NavigationItem.RunAs.b, 0x7f080252) {

            void a(Context context)
            {
                HelpPageActivity.a(context);
            }

        };
        i = new HomeNavigationItem("LOGOUT", 8, com.fitbit.ui.drawer.NavigationItem.Type.b, com.fitbit.ui.drawer.NavigationItem.RunAs.b, 0x7f08039a);
        j = (new HomeNavigationItem[] {
            a, b, c, d, e, f, g, h, i
        });
    }
}
