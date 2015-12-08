// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.tinder.b.g;
import com.tinder.model.Match;

// Referenced classes of package com.tinder.managers:
//            i

static final class a extends Thread
{

    private final Match a;

    public final void run()
    {
        new g();
        g.b(a);
    }

    public (Match match)
    {
        a = match;
    }
}
