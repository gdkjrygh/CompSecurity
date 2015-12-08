// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.request.b;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.bumptech.glide.request.b:
//            i

static class b extends android.graphics.drawable.able.ConstantState
{

    private final android.graphics.drawable.able.ConstantState a;
    private final int b;

    static android.graphics.drawable.able.ConstantState a(nstantState nstantstate)
    {
        return nstantstate.a;
    }

    static int b(a a1)
    {
        return a1.b;
    }

    public int getChangingConfigurations()
    {
        return 0;
    }

    public Drawable newDrawable()
    {
        return newDrawable(null);
    }

    public Drawable newDrawable(Resources resources)
    {
        return new i(this, null, resources);
    }

    nstantState(android.graphics.drawable.able.ConstantState constantstate, int j)
    {
        a = constantstate;
        b = j;
    }

    nstantState(b b1)
    {
        this(b1.a, b1.b);
    }
}
