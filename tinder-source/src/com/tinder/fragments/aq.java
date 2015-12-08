// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import com.b.a.a.b;
import com.b.a.d;
import com.tinder.model.Match;

// Referenced classes of package com.tinder.fragments:
//            as

final class aq
    implements b
{

    private final aj._cls4 a;

    aq(aj._cls4 _pcls4)
    {
        a = _pcls4;
    }

    public final boolean test(Object obj)
    {
        aj._cls4 _lcls4 = a;
        return d.a(((Match)obj).getMessages()).b(new as(_lcls4));
    }
}
