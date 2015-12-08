// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import com.b.a.a.b;
import com.tinder.model.Match;

// Referenced classes of package com.tinder.fragments:
//            aj

final class ao
    implements b
{

    private final aj a;

    ao(aj aj1)
    {
        a = aj1;
    }

    public final boolean test(Object obj)
    {
        return aj.a(a, (Match)obj);
    }
}
