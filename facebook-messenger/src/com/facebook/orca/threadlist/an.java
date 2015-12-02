// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.facebook.c.s;
import com.facebook.orca.creation.CreateThreadActivity;
import com.facebook.user.User;
import com.facebook.user.UserWithIdentifier;
import com.google.common.a.es;

// Referenced classes of package com.facebook.orca.threadlist:
//            ThreadListEmptyView

class an
    implements android.widget.AdapterView.OnItemClickListener
{

    final ThreadListEmptyView a;

    an(ThreadListEmptyView threadlistemptyview)
    {
        a = threadlistemptyview;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = new UserWithIdentifier((User)ThreadListEmptyView.a(a).get(i), ((User)ThreadListEmptyView.a(a).get(i)).i());
        view = new Intent(a.getContext(), com/facebook/orca/creation/CreateThreadActivity);
        view.putExtra("to", adapterview);
        view.putExtra("focus_compose", true);
        view.setFlags(0x4000000);
        ThreadListEmptyView.b(a).a(view, a.getContext());
    }
}
