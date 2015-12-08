// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import com.tinder.e.ak;
import com.tinder.enums.Blend;

// Referenced classes of package com.tinder.fragments:
//            u

final class a
    implements ak
{

    final Blend a;
    final u b;

    public final void a()
    {
        u.a(b, false, a);
    }

    public final void b()
    {
        u.a(b, true, a);
    }

    public final void c()
    {
        u.a(b, true, a);
    }

    (u u1, Blend blend)
    {
        b = u1;
        a = blend;
        super();
    }
}
