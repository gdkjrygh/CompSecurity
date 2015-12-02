// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import com.facebook.inject.d;
import com.facebook.orca.annotations.ShouldShowInviteAllContacts;

// Referenced classes of package com.facebook.orca.contacts.picker:
//            bg, bi, bj

class cc extends d
{

    final bi a;

    private cc(bi bi)
    {
        a = bi;
        super();
    }

    cc(bi bi, bj bj)
    {
        this(bi);
    }

    public bg a()
    {
        return new bg((com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), b(java/lang/Boolean, com/facebook/orca/annotations/ShouldShowInviteAllContacts));
    }

    public Object b()
    {
        return a();
    }
}
