// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import com.tinder.activities.ActivityMain;

// Referenced classes of package com.tinder.fragments:
//            g

final class a
    implements Runnable
{

    final g a;

    public final void run()
    {
        if (a.getActivity() instanceof ActivityMain)
        {
            ((ActivityMain)a.getActivity()).s();
        }
    }

    ivityMain(g g1)
    {
        a = g1;
        super();
    }
}
