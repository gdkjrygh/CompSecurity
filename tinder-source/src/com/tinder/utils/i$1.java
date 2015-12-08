// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import android.util.Pair;
import java.util.ArrayList;

// Referenced classes of package com.tinder.utils:
//            i

final class t>
    implements Runnable
{

    final Pair a;
    final i b;

    public final void run()
    {
        ((Runnable)a.first).run();
        if (((Boolean)a.second).booleanValue())
        {
            b.a.remove(a);
        }
    }

    (i j, Pair pair)
    {
        b = j;
        a = pair;
        super();
    }
}
