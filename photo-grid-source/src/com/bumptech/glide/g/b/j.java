// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.g.b;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.bumptech.glide.g.b:
//            i

final class j extends android.graphics.drawable.Drawable.ConstantState
{

    private final android.graphics.drawable.Drawable.ConstantState a;
    private final int b;

    j(android.graphics.drawable.Drawable.ConstantState constantstate, int k)
    {
        a = constantstate;
        b = k;
    }

    j(j j1)
    {
        this(j1.a, j1.b);
    }

    static android.graphics.drawable.Drawable.ConstantState a(j j1)
    {
        return j1.a;
    }

    static int b(j j1)
    {
        return j1.b;
    }

    public final int getChangingConfigurations()
    {
        return 0;
    }

    public final Drawable newDrawable()
    {
        return newDrawable(null);
    }

    public final Drawable newDrawable(Resources resources)
    {
        return new i(this, null, resources);
    }
}
