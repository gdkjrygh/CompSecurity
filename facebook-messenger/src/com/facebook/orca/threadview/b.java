// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import com.facebook.contacts.picker.ad;
import com.facebook.contacts.picker.ai;
import com.facebook.contacts.picker.aj;
import com.facebook.contacts.picker.v;
import com.facebook.l.k;
import com.facebook.user.User;
import com.facebook.user.UserWithIdentifier;

// Referenced classes of package com.facebook.orca.threadview:
//            AddMembersActivity

class b
    implements v
{

    final AddMembersActivity a;

    b(AddMembersActivity addmembersactivity)
    {
        a = addmembersactivity;
        super();
    }

    public ad a(Object obj)
    {
        if (!(obj instanceof UserWithIdentifier))
        {
            com.facebook.debug.log.b.d(AddMembersActivity.j(), (new StringBuilder()).append("unexpected rowData of type: ").append(obj.getClass()).toString());
            throw new IllegalArgumentException();
        } else
        {
            obj = (UserWithIdentifier)obj;
            User user = ((UserWithIdentifier) (obj)).a();
            boolean flag = AddMembersActivity.b(a).a(user.c());
            return (new aj()).a(((UserWithIdentifier) (obj))).a(ai.TWO_LINE).a(flag).c(true).a();
        }
    }
}
