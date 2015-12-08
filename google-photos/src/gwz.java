// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.animation.AnimationUtils;

final class gwz
    implements ds
{

    private gwu a;

    gwz(gwu gwu1)
    {
        a = gwu1;
        super();
    }

    public final void b_(Object obj)
    {
        if (AnimationUtils.currentAnimationTimeMillis() - gwu.h(a) > 250L)
        {
            gwu.a(a, true);
        }
        gwu.i(a);
        gwu.j(a).a();
    }
}
