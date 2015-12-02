// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.push.b;

import com.facebook.inject.d;
import com.facebook.orca.annotations.IsVoipEnabledForUser;

// Referenced classes of package com.facebook.orca.push.b:
//            i, b, c

class g extends d
{

    final b a;

    private g(b b1)
    {
        a = b1;
        super();
    }

    g(b b1, c c)
    {
        this(b1);
    }

    public i a()
    {
        return new i(b(java/lang/Boolean, com/facebook/orca/annotations/IsVoipEnabledForUser));
    }

    public Object b()
    {
        return a();
    }
}
