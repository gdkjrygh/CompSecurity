// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import com.facebook.auth.b.b;
import com.facebook.common.v.a;
import com.facebook.inject.d;
import com.facebook.orca.contacts.divebar.ao;
import com.facebook.orca.contacts.divebar.bk;

// Referenced classes of package com.facebook.orca.contacts.picker:
//            bi, bj

class bx extends d
{

    final bi a;

    private bx(bi bi)
    {
        a = bi;
        super();
    }

    bx(bi bi, bj bj)
    {
        this(bi);
    }

    public bk a()
    {
        return new bk((ao)a(com/facebook/orca/contacts/divebar/ao), (a)a(com/facebook/common/v/a), (b)a(com/facebook/auth/b/b), (com.facebook.common.time.a)a(com/facebook/common/time/a));
    }

    public Object b()
    {
        return a();
    }
}
