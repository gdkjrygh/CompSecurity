// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import com.b.a.a.b;
import com.tinder.model.Match;

// Referenced classes of package com.tinder.fragments:
//            o

final class p
    implements b
{

    private final o a;

    p(o o1)
    {
        a = o1;
    }

    public final boolean test(Object obj)
    {
        return o.a(a, (Match)obj);
    }
}
