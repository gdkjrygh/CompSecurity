// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import com.facebook.inject.d;
import com.facebook.orca.contacts.favorites.ag;
import com.facebook.orca.contacts.favorites.ai;

// Referenced classes of package com.facebook.orca.contacts.picker:
//            bi, bj

class ca extends d
{

    final bi a;

    private ca(bi bi)
    {
        a = bi;
        super();
    }

    ca(bi bi, bj bj)
    {
        this(bi);
    }

    public ai a()
    {
        return new ai(b(com/facebook/orca/contacts/favorites/ag));
    }

    public Object b()
    {
        return a();
    }
}
