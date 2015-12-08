// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.help;

import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.r;

// Referenced classes of package com.google.android.apps.translate.help:
//            TourActivity, g

class f extends ab
{

    final int b;
    final TourActivity c;

    public f(TourActivity touractivity, r r, int i)
    {
        c = touractivity;
        super(r);
        b = i;
    }

    public Fragment a(int i)
    {
        return g.a(i, TourActivity.a(c), TourActivity.b(c), TourActivity.c(c));
    }

    public final int c()
    {
        return b;
    }
}
