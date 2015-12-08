// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.help;

import android.support.v4.app.Fragment;
import android.support.v4.app.r;

// Referenced classes of package com.google.android.apps.translate.help:
//            f, TourActivity

final class c extends f
{

    final TourActivity a;

    public c(TourActivity touractivity, r r, int i)
    {
        a = touractivity;
        super(touractivity, r, i);
    }

    public final Fragment a(int i)
    {
        return super.a(b - i - 1);
    }
}
