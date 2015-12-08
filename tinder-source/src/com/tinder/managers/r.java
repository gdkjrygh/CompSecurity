// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.b.a.a.b;
import com.tinder.model.Match;

// Referenced classes of package com.tinder.managers:
//            i

final class r
    implements b
{

    private static final r a = new r();

    private r()
    {
    }

    public static b a()
    {
        return a;
    }

    public final boolean test(Object obj)
    {
        return i.f((Match)obj);
    }

}
