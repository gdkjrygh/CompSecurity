// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user;

import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.activity.user.view.UserHeaderView;
import com.pinterest.ui.tab.TabBar;

// Referenced classes of package com.pinterest.activity.user:
//            UserFragment

public class _cls1
{

    public static void inject(butterknife.t t, final UserFragment target, Object obj)
    {
        target._tabBar = (TabBar)t._tabBar(obj, 0x7f0f007a, "field '_tabBar'");
        target._userHeader = (LinearLayout)t._userHeader(obj, 0x7f0f02d6, "field '_userHeader'");
        target._userHeaderView = (UserHeaderView)t.aderView(obj, 0x7f0f02d7, "field '_userHeaderView'");
        class _cls1 extends DebouncingOnClickListener
        {

            final UserFragment val$target;

            public final void doClick(View view)
            {
                target.onUserImageClicked();
            }

            _cls1()
            {
                target = userfragment;
                super();
            }
        }

        t.t(obj, 0x7f0f04e2, "method 'onUserImageClicked'").setOnClickListener(new _cls1());
    }

    public static void reset(UserFragment userfragment)
    {
        userfragment._tabBar = null;
        userfragment._userHeader = null;
        userfragment._userHeaderView = null;
    }

    public _cls1()
    {
    }
}
