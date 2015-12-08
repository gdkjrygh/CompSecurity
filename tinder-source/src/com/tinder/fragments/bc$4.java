// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.view.View;
import com.facebook.a.d;
import com.facebook.a.e;
import com.tinder.utils.ad;

// Referenced classes of package com.tinder.fragments:
//            bc

final class a extends d
{

    final int a;
    final bc b;

    public final void onSpringActivate(e e1)
    {
        com.tinder.fragments.bc.e(b).setVisibility(0);
    }

    public final void onSpringAtRest(e e1)
    {
        com.tinder.fragments.bc.d(b);
    }

    public final void onSpringUpdate(e e1)
    {
        ad.a(bc.b(b), (float)Math.min(1.0D, e1.d.));
        ad.c(bc.c(b), (float)e1.d.);
        bc.c(b).setTranslationY(-(1.0F - (float)e1.d.) * (float)a);
    }

    (bc bc1, int i)
    {
        b = bc1;
        a = i;
        super();
    }
}
