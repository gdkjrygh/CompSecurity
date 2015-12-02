// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.creation;

import com.facebook.orca.contacts.picker.ContactMultipickerFragment;
import com.facebook.orca.contacts.picker.z;

// Referenced classes of package com.facebook.orca.creation:
//            CreateThreadActivity

class e
    implements z
{

    final CreateThreadActivity a;

    e(CreateThreadActivity createthreadactivity)
    {
        a = createthreadactivity;
        super();
    }

    public void a(boolean flag)
    {
        if (flag || !a.j() || !CreateThreadActivity.b(a))
        {
            CreateThreadActivity.c(a).O();
        } else
        {
            CreateThreadActivity.c(a).d();
        }
        CreateThreadActivity.c(a).P();
    }
}
