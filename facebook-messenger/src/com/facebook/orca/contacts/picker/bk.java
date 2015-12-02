// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import com.facebook.contacts.e.e;
import com.facebook.inject.d;
import com.facebook.orca.annotations.IsInviteByPhonePermitted;

// Referenced classes of package com.facebook.orca.contacts.picker:
//            m, bi, bj

class bk extends d
{

    final bi a;

    private bk(bi bi)
    {
        a = bi;
        super();
    }

    bk(bi bi, bj bj)
    {
        this(bi);
    }

    public m a()
    {
        return new m(b(com/facebook/contacts/e/e), b(java/lang/Boolean, com/facebook/orca/annotations/IsInviteByPhonePermitted));
    }

    public Object b()
    {
        return a();
    }
}
