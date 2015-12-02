// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.background;

import com.facebook.auth.b.b;
import com.facebook.contacts.annotations.IsMobileAppDataEnabled;
import com.facebook.contacts.data.k;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.orca.background:
//            p, f, g

class l extends d
{

    final f a;

    private l(f f)
    {
        a = f;
        super();
    }

    l(f f, g g)
    {
        this(f);
    }

    public p a()
    {
        return new p((b)a(com/facebook/auth/b/b), b(java/lang/Boolean, com/facebook/contacts/annotations/IsMobileAppDataEnabled), (k)a(com/facebook/contacts/data/k), (com.facebook.fbservice.ops.k)e().a(com/facebook/fbservice/ops/k));
    }

    public Object b()
    {
        return a();
    }
}
