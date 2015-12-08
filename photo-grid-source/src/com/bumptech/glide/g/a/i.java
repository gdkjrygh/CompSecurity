// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.g.a;

import android.view.View;

// Referenced classes of package com.bumptech.glide.g.a:
//            d, e, j

public final class i
    implements d
{

    private final j a;

    i(j j1)
    {
        a = j1;
    }

    public final boolean a(Object obj, e e1)
    {
        obj = e1.a();
        if (obj != null)
        {
            ((View) (obj)).clearAnimation();
            ((View) (obj)).startAnimation(a.a());
        }
        return false;
    }
}
