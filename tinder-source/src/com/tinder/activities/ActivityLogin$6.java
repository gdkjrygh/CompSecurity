// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.activities;

import android.view.View;
import com.tinder.c.f;
import com.tinder.utils.ad;

// Referenced classes of package com.tinder.activities:
//            ActivityLogin

final class a
    implements android.view.ener
{

    final f a;
    final ActivityLogin b;

    public final void onClick(View view)
    {
        ad.c(a);
        b.moveTaskToBack(true);
        b.finish();
    }

    (ActivityLogin activitylogin, f f)
    {
        b = activitylogin;
        a = f;
        super();
    }
}
