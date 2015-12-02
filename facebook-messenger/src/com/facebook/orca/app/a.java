// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.common.w.q;
import com.facebook.debug.fps.k;
import com.facebook.prefs.shared.aj;
import com.facebook.prefs.shared.d;
import java.util.EnumSet;
import java.util.Set;

public class a
    implements javax.inject.a
{

    private final javax.inject.a a;
    private final d b;

    public a(javax.inject.a a1, d d1)
    {
        a = a1;
        b = d1;
    }

    public Set a()
    {
        if (a.b() != q.YES)
        {
            return EnumSet.noneOf(com/facebook/debug/fps/k);
        }
        if (!b.a(aj.q, false))
        {
            return EnumSet.noneOf(com/facebook/debug/fps/k);
        } else
        {
            return EnumSet.of(k.ENABLE, k.ENABLE_FRAME_COUNTER);
        }
    }

    public Object b()
    {
        return a();
    }
}
