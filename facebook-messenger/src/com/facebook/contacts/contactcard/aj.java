// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import android.view.View;
import com.facebook.orca.threads.ThreadParticipant;

// Referenced classes of package com.facebook.contacts.contactcard:
//            aw, GroupMembersSectionView

class aj
    implements android.view.View.OnClickListener
{

    final GroupMembersSectionView a;

    aj(GroupMembersSectionView groupmemberssectionview)
    {
        a = groupmemberssectionview;
        super();
    }

    public void onClick(View view)
    {
        view = (aw)view;
        GroupMembersSectionView.a(a, view.getParticipant().d());
    }
}
