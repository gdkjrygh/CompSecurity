// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import com.b.a.a.b;
import com.tinder.model.Match;

// Referenced classes of package com.tinder.fragments:
//            aj

final class ar
    implements b
{

    private final aj._cls4 a;

    ar(aj._cls4 _pcls4)
    {
        a = _pcls4;
    }

    public final boolean test(Object obj)
    {
        aj._cls4 _lcls4 = a;
        return ((Match)obj).getName().toLowerCase().startsWith(aj.e(_lcls4.c));
    }
}
