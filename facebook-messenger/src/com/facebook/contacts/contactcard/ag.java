// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import android.content.Intent;
import com.facebook.analytics.cb;
import com.facebook.orca.threadview.AddMembersActivity;
import com.facebook.user.UserKey;

// Referenced classes of package com.facebook.contacts.contactcard:
//            am, GroupContactCardFragment, ai

class ag
    implements am
{

    final GroupContactCardFragment a;

    ag(GroupContactCardFragment groupcontactcardfragment)
    {
        a = groupcontactcardfragment;
        super();
    }

    public void a()
    {
        GroupContactCardFragment.a(a, (new cb("click")).f("button").g("add_person"));
        Intent intent = new Intent(a.n(), com/facebook/orca/threadview/AddMembersActivity);
        intent.setAction("android.intent.action.VIEW");
        intent.putExtra("thread_id", GroupContactCardFragment.b(a));
        a.a(intent);
    }

    public void a(UserKey userkey)
    {
        if (GroupContactCardFragment.a(a) != null)
        {
            GroupContactCardFragment.a(a).a(userkey);
        }
    }
}
