// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.data;

import com.facebook.fbservice.ops.k;
import com.facebook.inject.d;
import com.facebook.orca.contacts.annotations.IsChatContextEnabled;

// Referenced classes of package com.facebook.contacts.data:
//            p, d, e

class h extends d
{

    final com.facebook.contacts.data.d a;

    private h(com.facebook.contacts.data.d d1)
    {
        a = d1;
        super();
    }

    h(com.facebook.contacts.data.d d1, e e)
    {
        this(d1);
    }

    public p a()
    {
        return new p(b(java/lang/Boolean, com/facebook/orca/contacts/annotations/IsChatContextEnabled), (k)a(com/facebook/fbservice/ops/k));
    }

    public Object b()
    {
        return a();
    }
}
