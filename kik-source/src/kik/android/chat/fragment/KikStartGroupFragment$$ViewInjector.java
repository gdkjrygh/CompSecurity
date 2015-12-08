// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package kik.android.chat.fragment:
//            KikStartGroupFragment, pp, pq, pr, 
//            ps

public class 
{

    public static void inject(butterknife..ViewInjector viewinjector, KikStartGroupFragment kikstartgroupfragment, Object obj)
    {
        View view = viewinjector.ViewInjector(obj, 0x7f0e006a);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624042' for field '_rootLayout' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikstartgroupfragment._rootLayout = (ViewGroup)view;
        view = viewinjector._rootLayout(obj, 0x7f0e0079);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624057' for field '_numGroupMembersText' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikstartgroupfragment._numGroupMembersText = (TextView)view;
        view = viewinjector._numGroupMembersText(obj, 0x7f0e0070);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624048' for field '_groupNameEditText' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikstartgroupfragment._groupNameEditText = (EditText)view;
        view = viewinjector._groupNameEditText(obj, 0x7f0e006f);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624047' for field '_groupContactView' and method 'setGroupPicture' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikstartgroupfragment._groupContactView = (ImageView)view;
        view.setOnClickListener(new pp(kikstartgroupfragment));
        view = viewinjector._groupContactView(obj, 0x7f0e007a);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624058' for field '_createGroupButton', field 'createButton', and method 'handleGroupCreate' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikstartgroupfragment._createGroupButton = (Button)view;
        kikstartgroupfragment.createButton = (Button)view;
        view.setOnClickListener(new pq(kikstartgroupfragment));
        view = viewinjector.createButton(obj, 0x7f0e006e);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624046' for field 'groupHeader' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikstartgroupfragment.groupHeader = view;
        view = viewinjector.groupHeader(obj, 0x7f0e0071);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624049' for field 'groupNameClearButton' and method 'clearGroupName' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikstartgroupfragment.groupNameClearButton = (ImageView)view;
        view.setOnClickListener(new pr(kikstartgroupfragment));
        kikstartgroupfragment.searchButton = (ViewGroup)viewinjector.searchButton(obj, 0x7f0e012f);
        viewinjector = viewinjector.searchButton(obj, 0x7f0e0075);
        if (viewinjector == null)
        {
            throw new IllegalStateException("Required view with id '2131624053' for method 'clearComposeTo' was not found. If this view is optional add '@Optional' annotation.");
        } else
        {
            viewinjector.setOnClickListener(new ps(kikstartgroupfragment));
            return;
        }
    }

    public static void reset(KikStartGroupFragment kikstartgroupfragment)
    {
        kikstartgroupfragment._rootLayout = null;
        kikstartgroupfragment._numGroupMembersText = null;
        kikstartgroupfragment._groupNameEditText = null;
        kikstartgroupfragment._groupContactView = null;
        kikstartgroupfragment._createGroupButton = null;
        kikstartgroupfragment.createButton = null;
        kikstartgroupfragment.groupHeader = null;
        kikstartgroupfragment.groupNameClearButton = null;
        kikstartgroupfragment.searchButton = null;
    }

    public ()
    {
    }
}
