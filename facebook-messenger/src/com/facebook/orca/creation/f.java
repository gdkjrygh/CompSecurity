// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.creation;

import com.facebook.orca.compose.ComposeFragment;
import com.facebook.orca.contacts.picker.ab;
import com.facebook.user.s;

// Referenced classes of package com.facebook.orca.creation:
//            CreateThreadActivity

class f
    implements ab
{

    final CreateThreadActivity a;

    f(CreateThreadActivity createthreadactivity)
    {
        a = createthreadactivity;
        super();
    }

    public void a(s s1)
    {
        boolean flag1 = true;
        Object obj = a;
        boolean flag;
        if (s.PHONE == s1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj.q = flag;
        CreateThreadActivity.d(a);
        CreateThreadActivity.e(a).a(a.q);
        obj = CreateThreadActivity.e(a);
        if (s.FBID == s1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        ((ComposeFragment) (obj)).e(flag);
    }
}
