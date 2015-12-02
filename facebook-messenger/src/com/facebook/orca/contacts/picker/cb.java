// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import android.content.Context;
import com.facebook.contacts.data.l;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import com.facebook.orca.contacts.favorites.ag;
import com.facebook.user.e;

// Referenced classes of package com.facebook.orca.contacts.picker:
//            bi, bj

class cb extends d
{

    final bi a;

    private cb(bi bi)
    {
        a = bi;
        super();
    }

    cb(bi bi, bj bj)
    {
        this(bi);
    }

    public ag a()
    {
        return new ag((Context)e().a(android/content/Context), (e)a(com/facebook/user/e), (l)a(com/facebook/contacts/data/l), (com.facebook.contacts.a.e)a(com/facebook/contacts/a/e));
    }

    public Object b()
    {
        return a();
    }
}
