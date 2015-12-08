// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.b.a.a.b;
import com.tinder.model.Match;

// Referenced classes of package com.tinder.managers:
//            i

final class s
    implements b
{

    private static final s a = new s();

    private s()
    {
    }

    public static b a()
    {
        return a;
    }

    public final boolean test(Object obj)
    {
        return i.g((Match)obj);
    }

}
