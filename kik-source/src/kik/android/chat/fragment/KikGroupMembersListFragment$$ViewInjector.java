// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

// Referenced classes of package kik.android.chat.fragment:
//            KikGroupMembersListFragment, lh

public class I
{

    public static void inject(butterknife..ViewInjector viewinjector, KikGroupMembersListFragment kikgroupmemberslistfragment, Object obj)
    {
        View view = viewinjector.ViewInjector(obj, 0x7f0e0063);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624035' for field '_groupMembersList' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikgroupmemberslistfragment._groupMembersList = (ListView)view;
        viewinjector = viewinjector._groupMembersList(obj, 0x7f0e0130);
        if (viewinjector == null)
        {
            throw new IllegalStateException("Required view with id '2131624240' for field '_addButton' and method 'onAddButtonPressed' was not found. If this view is optional add '@Optional' annotation.");
        } else
        {
            kikgroupmemberslistfragment._addButton = (ImageView)viewinjector;
            viewinjector.setOnClickListener(new lh(kikgroupmemberslistfragment));
            return;
        }
    }

    public static void reset(KikGroupMembersListFragment kikgroupmemberslistfragment)
    {
        kikgroupmemberslistfragment._groupMembersList = null;
        kikgroupmemberslistfragment._addButton = null;
    }

    public I()
    {
    }
}
