// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.background;

import com.facebook.auth.b.b;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.orca.background:
//            o, f, g

class k extends d
{

    final f a;

    private k(f f)
    {
        a = f;
        super();
    }

    k(f f, g g)
    {
        this(f);
    }

    public o a()
    {
        return new o((b)a(com/facebook/auth/b/b), (com.facebook.contacts.data.k)a(com/facebook/contacts/data/k), (com.facebook.fbservice.ops.k)e().a(com/facebook/fbservice/ops/k));
    }

    public Object b()
    {
        return a();
    }
}
